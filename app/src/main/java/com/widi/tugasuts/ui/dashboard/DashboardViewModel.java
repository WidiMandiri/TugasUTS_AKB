package com.widi.tugasuts.ui.dashboard;

//10120064
//Widi Malikul Mulky
//IF2

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> namaLiveData;
    private final MutableLiveData<String> nimLiveData;
    private final MutableLiveData<String> kelasLiveData;
    private final MutableLiveData<String> emailLiveData;

    public DashboardViewModel() {
        namaLiveData = new MutableLiveData<>();
        nimLiveData = new MutableLiveData<>();
        kelasLiveData = new MutableLiveData<>();
        emailLiveData = new MutableLiveData<>();

        // Set nilai awal jika diperlukan
        namaLiveData.setValue("Widi Malikul Mulky");
        nimLiveData.setValue("10120064");
        kelasLiveData.setValue("IF2");
        emailLiveData.setValue("widi.10120064@mahasiswa.unikom.ac.id");
    }

    public LiveData<String> getNama() {
        return namaLiveData;
    }

    public LiveData<String> getNim() {
        return nimLiveData;
    }

    public LiveData<String> getKelas() {
        return kelasLiveData;
    }

    public LiveData<String> getEmail() {
        return emailLiveData;
    }

    public void setNama(String nama) {
        namaLiveData.setValue(nama);
    }

    public void setNim(String nim) {
        nimLiveData.setValue(nim);
    }

    public void setKelas(String kelas) {
        kelasLiveData.setValue(kelas);
    }

    public void setEmail(String email) {
        emailLiveData.setValue(email); }
}