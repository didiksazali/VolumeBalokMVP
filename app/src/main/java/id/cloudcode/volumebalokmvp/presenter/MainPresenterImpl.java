package id.cloudcode.volumebalokmvp.presenter;

import id.cloudcode.volumebalokmvp.model.VolumeModel;

public interface MainPresenterImpl {

    void inputVolume(String panjang, String lebar, String tinggi);
    void hitungVolume(VolumeModel volumeModel);

}
