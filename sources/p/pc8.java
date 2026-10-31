package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pc8 implements oi51 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ pc8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 0:
                pp5 pp5Var = new pp5(this, ((meq) this.c).a(ji50Var.a), (byte) 28);
                ji50Var.b.put(ker0.class, r4o1.Q(oc8.b, w7xVar, pp5Var, c37.c1));
                break;
            case 1:
                t1t0 t1t0Var = new t1t0(this, (byte) 21);
                ji50Var.b.put(efr0.class, r4o1.Q(o5v0.Z0, w7xVar, t1t0Var, vbv0.e));
                break;
            default:
                gsc1 gsc1Var = new gsc1(this, (byte) 25);
                Set set = b9f1.g;
                ji50Var.b.put(jfr0.class, r4o1.Q(v7f1.d, set, gsc1Var, ppd1.Z0));
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ker0.class;
            case 1:
                return efr0.class;
            default:
                return jfr0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        return w7x.a;
    }
}
