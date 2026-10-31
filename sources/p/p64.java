package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p64 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q64 b;

    public /* synthetic */ p64(q64 q64Var, byte b) {
        this.a = b;
        this.b = q64Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        q64 q64Var = this.b;
        switch (b) {
            case 0:
                q64Var.a();
                break;
            case 1:
                q64Var.a.unregisterReceiver(q64Var.d);
                break;
            default:
                Uri uri = q64.g;
                q64Var.b();
                break;
        }
    }
}
