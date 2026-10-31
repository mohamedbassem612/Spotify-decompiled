package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6z extends k9 {
    public final /* synthetic */ byte c;
    public final bl3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6z(uu00 uu00Var, bl3 bl3Var, byte b) {
        super(uu00Var, (byte) 7);
        this.c = b;
        this.d = bl3Var;
    }

    public final Observable f(String str) {
        byte b = this.c;
        bl3 bl3Var = this.d;
        switch (b) {
            case 0:
                return bl3Var.g(str).onErrorReturn(xbp1.b1).flatMapObservable(new w2z((byte) 1, this, str));
            default:
                return bl3Var.g(str).onErrorReturn(n9x0.S0).flatMapObservable(new esa1((Object) this, (Object) str, (byte) 29));
        }
    }

    public final rmy h1(ez00 ez00Var) {
        switch (this.c) {
            case 0:
                mdz mdzVar = (mdz) ez00Var;
                String str = mdzVar.c;
                String str2 = mdzVar.e.a;
                kdz kdzVar = mdzVar.d;
                String str3 = kdzVar != null ? kdzVar.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                return new rmy(str, str2, 4, str3);
            default:
                z1g1 z1g1Var = (z1g1) ez00Var;
                return new rmy(z1g1Var.b, z1g1Var.c.a, 7, o7h.y0(z1g1Var.g, (CharSequence) null, (String) null, (String) null, bpf1.W0, 31));
        }
    }
}
