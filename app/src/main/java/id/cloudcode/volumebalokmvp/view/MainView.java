package id.cloudcode.volumebalokmvp.view;

import id.cloudcode.volumebalokmvp.model.VolumeModel;

public interface MainView {

    void lebarKosong(String error);
    void tinggiKosong(String error);
    void panjangKosong(String error);
    void inputSuccess(VolumeModel volumeModel);
    void success(Double result);

}
