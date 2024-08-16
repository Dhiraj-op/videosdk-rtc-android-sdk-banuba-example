package live.videosdk.rtc.android.java;

import static java.util.Objects.requireNonNull;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.banuba.sdk.manager.BanubaSdkManager;

import live.videosdk.rtc.android.Meeting;
import live.videosdk.rtc.android.VideoSDK;

public class MainApplication extends Application {

    private Meeting meeting;

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        String KEY ="Qk5CIJx5ec5lTtrEY7d8I2fPdDANGq/KJNZl0TqK7jUkvJEFxcjWuh31F7D5ViKgRqPdhjM8bJul4QbSYU6NwODtWVw1CZ4sR5yp9LnynQnbW1lkeColJYenkquHD/3EFDlZZxl6zw7SEa5Uffo8YL3LvE6wQMuABzxhMN3uqUgLSVJTpCKgt+o2iXl6DKdzmqYGNLLdBWoAXXJkbNU1uQgewHSgv5otvsXyi7G4NC7jrJbRA2DZAz3iN2HHtm8VDRZx4sn8TP13SrqTPXRjFbYVkZi/o/8Iq+80YtFe+fLdK+weph+4Szg4fe83yf9nS//l9262qbRqaLZ9dnZcruzz7osarPqsTwqlbsr3yG6E7nAjqBZ1SaRwjJwnHrYP2Fx/+xBRwzObiE9AuEMYgzmjtVOA2Fbv0t15I/JfN+h6TkBO1mrtOvP2sK/QVjJ3pfy16BZjao560g13S/pGtmrO7zCQnIupkBQ/JJVnhtYmTe9rpb+YjNKk3KR+TBi8DSl/oEgWQMr+CGJGDHFdMB0tn2EVKmKUVIyeyp9eJ9Uws8mS5np2QUzeocr06buN9KFHRamua2zTN+bRA35RBALFtzHSHMSTuPXxKIBhRGfJKCgN8qRg5FVjyseo0M5Um8jnY8f5zakx6NmwElmlMaA=";
        VideoSDK.initialize(getApplicationContext());
        AndroidNetworking.initialize(getApplicationContext());
        BanubaSdkManager.initialize(requireNonNull(getApplicationContext()), KEY);
    }

    @Override
    public void onTerminate() {
        BanubaSdkManager.deinitialize();
        super.onTerminate();
    }

}