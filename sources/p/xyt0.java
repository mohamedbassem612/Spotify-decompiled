package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class xyt0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zyt0 b;

    public /* synthetic */ xyt0(zyt0 zyt0Var, byte b) {
        this.a = b;
        this.b = zyt0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        zyt0 zyt0Var = this.b;
        switch (b) {
            case 0:
                vyt0 vyt0Var = (vyt0) obj;
                Context contextH0 = zyt0Var.h0();
                if (vyt0Var.a != 99) {
                    String str = vyt0Var.b;
                    n57.h(l1d.m("unexpected track or context uri: ", str), str.isEmpty() || str.startsWith("spotify:track:") || str.startsWith("spotify:local:") || str.startsWith("spotify:ad:") || str.startsWith("spotify:episode:") || str.startsWith("spotify:interruption:") || str.startsWith("spotify:live:") || str.startsWith("spotify:user:") || str.startsWith("spotify:album:") || str.startsWith("spotify:vdebug"));
                    if (!zyt0Var.T1) {
                        zyt0Var.Z0(vyt0Var.a, contextH0, str);
                    }
                    break;
                }
                break;
            default:
                zyt0Var.T1 = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
