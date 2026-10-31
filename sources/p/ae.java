package p;

import android.app.Application;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ae {
    public final SharedPreferences a;

    public ae(byte b) {
        switch (b) {
            case 1:
                this.a = wf10.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                break;
            default:
                SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                new c4x0((byte) 27);
                this.a = sharedPreferences;
                break;
        }
    }

    public ae(Application application) {
        this.a = application.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
