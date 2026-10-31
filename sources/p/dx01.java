package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dx01 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gx01 b;
    public final /* synthetic */ String c;

    public /* synthetic */ dx01(gx01 gx01Var, String str, byte b) {
        this.a = b;
        this.b = gx01Var;
        this.c = str;
    }

    public final void run() {
        byte b = this.a;
        String str = this.c;
        gx01 gx01Var = this.b;
        switch (b) {
            case 0:
                gx01Var.f.c(new aih0(gx01Var, str, false, (byte) 16));
                break;
            default:
                gx01Var.f.c(new jyh0(gx01Var, str, (byte) 14));
                break;
        }
    }
}
