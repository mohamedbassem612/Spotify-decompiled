package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gy5 implements oi51 {
    public final /* synthetic */ byte a;
    public final zu70 b;
    public final hjc c;
    public final lzn0 d;
    public final kly0 e;

    public gy5(hjc hjcVar, zu70 zu70Var, lzn0 lzn0Var, d7p d7pVar) {
        this.a = (byte) 0;
        this.c = hjcVar;
        this.b = zu70Var;
        this.d = lzn0Var;
        this.e = d7pVar;
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        switch (this.a) {
            case 0:
                xb2 xb2Var = new xb2(this, (byte) 20);
                Set setS0 = f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)});
                ji50Var.b.put(fer0.class, r4o1.Q(k74.Y0, setS0, xb2Var, ad5.e));
                break;
            case 1:
                h1m h1mVar = new h1m(this, (byte) 26);
                Set setS1 = f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)});
                ji50Var.b.put(per0.class, r4o1.Q(r1o.Z, setS1, h1mVar, wmn.X));
                break;
            case 2:
                hzw hzwVar = new hzw(this, (byte) 27);
                Set setS2 = f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)});
                ji50Var.b.put(uer0.class, r4o1.Q(xc10.O0, setS2, hzwVar, yty.d1));
                break;
            default:
                hzw hzwVar2 = new hzw(this, (byte) 29);
                Set setS3 = f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)});
                ji50Var.b.put(ver0.class, r4o1.Q(xc10.U0, setS3, hzwVar2, yty.e1));
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return fer0.class;
            case 1:
                return per0.class;
            case 2:
                return uer0.class;
            default:
                return ver0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        return w7x.a;
    }

    public /* synthetic */ gy5(zu70 zu70Var, hjc hjcVar, lzn0 lzn0Var, d7p d7pVar, byte b) {
        this.a = b;
        this.b = zu70Var;
        this.c = hjcVar;
        this.d = lzn0Var;
        this.e = d7pVar;
    }
}
