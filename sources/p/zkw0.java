package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkw0 implements x8c {
    public final /* synthetic */ byte a;
    public final Map b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public zkw0(mii0 mii0Var, uk00 uk00Var, qa2 qa2Var, qa2 qa2Var2) {
        this.a = (byte) 0;
        this.c = mii0Var;
        this.d = uk00Var;
        this.e = qa2Var;
        this.f = qa2Var2;
        this.b = sqg0.J(new mmr0[]{new mmr0(1, l1d.u(nbw0.class)), new mmr0(2, een.c(true, true))});
    }

    public final ji50 a(ajq0 ajq0Var, ji50 ji50Var) {
        switch (this.a) {
            case 0:
                hws0 hws0Var = new hws0(this, ajq0Var, (byte) 28);
                p7w0 p7w0Var = p7w0.P0;
                gbw0 gbw0Var = gbw0.g;
                ji50Var.b.put(ukw0.class, new vw21(p7w0Var, this.b, new fc3(hws0Var, (byte) 5), gbw0Var, (vu30) null));
                break;
            default:
                ji50Var.b.put(pmx0.class, new r3r(new wzq(((hnx0) this.c).a(ji50Var.a, enx0.a, new hbt((kko) ajq0Var.a, new idd1(new jnx0(ajq0Var, (byte) 0)), new idd1(new g1x0(this, ajq0Var, (byte) 6)), new idd1(new knx0(this, (byte) 0)), new idd1(new knx0(this, (byte) 1)))), ilx0.W0), gbw0.R0, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public zkw0(hnx0 hnx0Var, tiv0 tiv0Var, ycm ycmVar, myq0 myq0Var) {
        this.a = (byte) 1;
        this.c = hnx0Var;
        this.d = tiv0Var;
        this.e = ycmVar;
        this.f = myq0Var;
        this.b = Collections.singletonMap(1, f46.S0(new aq21[]{new zp21(pnx0.class), new yp21(w281.class)}));
    }
}
