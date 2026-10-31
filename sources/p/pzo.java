package p;

import android.app.Application;
import com.spotify.music.SpotifyApplication;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class pzo extends Application implements lt50 {
    public volatile jgu a;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        ((i94) nxg.a()).e("dagger_build_application_component");
                        daq daqVarQ = m1p1.q((SpotifyApplication) this);
                        ((i94) nxg.a()).a("dagger_build_application_component");
                        uap1.t(nxg.a(), daqVarQ).w(this);
                        if (this.a == null) {
                            throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p.lt50
    public final jgu f() {
        a();
        return this.a;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        a();
    }
}
