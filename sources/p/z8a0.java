package p;

import org.chromium.net.impl.CallbackExceptionImpl;
import org.chromium.net.impl.CronetExceptionImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class z8a0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i9a0 b;
    public final /* synthetic */ j9a0 c;

    public /* synthetic */ z8a0(i9a0 i9a0Var, j9a0 j9a0Var, byte b) {
        this.a = b;
        this.b = i9a0Var;
        this.c = j9a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j9a0 j9a0Var = this.c;
        i9a0 i9a0Var = this.b;
        switch (b) {
            case 0:
                try {
                    j9a0Var.run();
                } catch (Throwable th) {
                    i9a0Var.b(new CallbackExceptionImpl("Exception received from UploadDataProvider", th));
                }
                break;
            case 1:
                try {
                    j9a0Var.run();
                } catch (Throwable th2) {
                    i9a0Var.c(new b9a0(i9a0Var, (byte) 1), "enterUserErrorState");
                    i9a0Var.b(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", th2));
                    return;
                }
                break;
            default:
                try {
                    j9a0Var.run();
                } catch (Throwable th3) {
                    i9a0Var.b(new CronetExceptionImpl("System error", th3));
                    return;
                }
                break;
        }
    }
}
