package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class p630 implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n630 c;

    public /* synthetic */ p630(String str, n630 n630Var, boolean z) {
        this.a = z;
        this.b = str;
        this.c = n630Var;
    }

    public final void accept(Object obj) {
        ry21 ry21Var = ((sy21) obj).a;
        boolean z = ry21Var.Q0;
        boolean z2 = this.a;
        if (z) {
            Logger.g("%s %s succeeded", new Object[]{z2 ? "POST" : "DELETE", this.b});
            return;
        }
        r630.f("Status code was: " + ry21Var.d, this.c, z2);
    }
}
