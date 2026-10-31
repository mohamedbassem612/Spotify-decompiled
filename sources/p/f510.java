package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f510 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m210 b;
    public final /* synthetic */ g510 c;

    public /* synthetic */ f510(m210 m210Var, g510 g510Var, byte b) {
        this.a = b;
        this.b = m210Var;
        this.c = g510Var;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                g510 g510Var = this.c;
                return Single.defer(new h23((Object) null, g510Var, g510Var.h.l((String) obj), this.b, (byte) 1));
            default:
                g691 g691Var = (g691) obj;
                String str = g691Var.a;
                g510 g510Var2 = this.c;
                uqk0 uqk0Var = g510Var2.h;
                int i = g691Var.b;
                int i2 = g691Var.c;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
                String strValueOf = String.valueOf(i);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
                String strValueOf2 = String.valueOf(i2);
                return g510.q(g510Var2, this.b, new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), uqk0Var.c, uqk0Var.b, System.currentTimeMillis()));
        }
    }
}
