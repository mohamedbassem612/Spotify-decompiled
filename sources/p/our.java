package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class our implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssw0 b;

    public /* synthetic */ our(ssw0 ssw0Var, byte b) {
        this.a = b;
        this.b = ssw0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ssw0 ssw0Var = this.b;
        switch (b) {
            case 0:
                ssw0Var.l(obj);
                break;
            case 1:
                obj.getClass();
                ssw0Var.l(obj);
                break;
            default:
                ssw0Var.l(obj);
                break;
        }
    }
}
