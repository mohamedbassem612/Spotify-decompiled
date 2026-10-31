package p;

import android.os.StrictMode;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xf01 {
    public final File a;
    public final long b;
    public qpc c;

    public xf01(File file, long j) {
        this.a = file;
        this.b = j;
    }

    public final void a(zyp0 zyp0Var) {
        qpc qpcVar;
        try {
            synchronized (this) {
                try {
                    qpcVar = this.c;
                    if (qpcVar == null) {
                        File file = this.a;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        if (!file.exists() && !file.mkdir()) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            throw new IOException();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        qpcVar = new qpc(this.a, this.b);
                        this.c = qpcVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zyp0Var.l = qpcVar;
        } catch (IOException unused) {
            Logger.d("Could not create cache, %s", this.a.getAbsolutePath());
            n57.e("Could not create cache");
        }
    }
}
