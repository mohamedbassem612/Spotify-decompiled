package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class o630 implements Consumer {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ r630 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ n630 d;
    public final /* synthetic */ String e;

    public /* synthetic */ o630(r630 r630Var, boolean z, String str, n630 n630Var) {
        this.b = r630Var;
        this.c = z;
        this.e = str;
        this.d = n630Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.e;
        n630 n630Var = this.d;
        boolean z = this.c;
        r630 r630Var = this.b;
        switch (b) {
            case 0:
                ry21 ry21Var = ((sy21) obj).a;
                if (!ry21Var.Q0) {
                    r630.f("Status code was: " + ry21Var.d, n630Var, z);
                    r630Var.e(str);
                } else {
                    Logger.g("%s %s succeeded", new Object[]{z ? "POST" : "DELETE", str});
                }
                break;
            default:
                r630.f(((Throwable) obj).getMessage(), n630Var, z);
                r630Var.e(str);
                break;
        }
    }

    public /* synthetic */ o630(r630 r630Var, boolean z, n630 n630Var, String str) {
        this.b = r630Var;
        this.c = z;
        this.d = n630Var;
        this.e = str;
    }
}
