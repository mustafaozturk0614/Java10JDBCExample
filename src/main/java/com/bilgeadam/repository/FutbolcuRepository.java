package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Futbolcu;
import com.bilgeadam.repository.entity.Takim;
import com.bilgeadam.utility.ConnectionProvider;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class FutbolcuRepository implements ICrud<Futbolcu> {

    private ConnectionProvider connectionProvider;

    public FutbolcuRepository(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public void save(Futbolcu futbolcu) {
        System.out.println(futbolcu);
       String sql="insert into futbolcu (ad,mevki,forma_no,deger,takim_id) values ('"+futbolcu.getAd()+"','"  +
                                                                            futbolcu.getMevki()+"',"+
                                                                            futbolcu.getFormaNo()+","+
                                                                            futbolcu.getDeger()+","+
                                                                            futbolcu.getTakim_id()+ ")";

        connectionProvider.openConnection();
        try {
            PreparedStatement preparedStatement=connectionProvider.getConnection().prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connectionProvider.closeConnection();
        }
      
    }

    @Override
    public void update(Futbolcu futbolcu) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Futbolcu> findAl() {
        return null;
    }

    @Override
    public Optional<Futbolcu> findById(Long id) {
        return Optional.empty();
    }
}
