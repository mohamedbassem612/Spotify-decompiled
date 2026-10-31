package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d510 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m210 b;
    public final /* synthetic */ g510 c;

    public d510(g510 g510Var, m210 m210Var) {
        this.a = (byte) 0;
        this.c = g510Var;
        this.b = m210Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        g510 g510Var = this.c;
        m210 m210Var = this.b;
        switch (b) {
            case 0:
                return g510.q(g510Var, m210Var, (w7h1) obj);
            case 1:
                return g510.q(g510Var, m210Var, g510Var.h.t((String) obj));
            default:
                g691 g691Var = (g691) obj;
                String str = g691Var.a;
                uqk0 uqk0Var = g510Var.h;
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
                return g510.q(g510Var, m210Var, new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), uqk0Var.c, uqk0Var.b, System.currentTimeMillis()));
        }
    }

    public /* synthetic */ d510(m210 m210Var, g510 g510Var, byte b) {
        this.a = b;
        this.b = m210Var;
        this.c = g510Var;
    }
}
