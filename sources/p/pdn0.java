package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pdn0 extends bng0 implements rla0 {
    public final /* synthetic */ byte d = 1;
    public final Object e;
    public Object f;

    public pdn0(Map map, Object obj, qlc0 qlc0Var) {
        super(obj, qlc0Var.a, (byte) 1);
        this.e = map;
        this.f = qlc0Var;
    }

    public final Object getValue() {
        switch (this.d) {
            case 0:
                return this.f;
            default:
                return ((qlc0) this.f).a;
        }
    }

    public final Object setValue(Object obj) {
        byte b = this.d;
        Object obj2 = ((bng0) this).b;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                Object obj4 = this.f;
                this.f = obj;
                jps0 jps0Var = (jps0) ((nps0) obj3).b;
                hps0 hps0Var = jps0Var.d;
                if (!hps0Var.containsKey(obj2)) {
                    return obj4;
                }
                boolean z = ((fps0) jps0Var).c;
                if (!z) {
                    hps0Var.put(obj2, obj);
                } else {
                    if (!z) {
                        hhg1.k();
                        return null;
                    }
                    lug1 lug1Var = ((fps0) jps0Var).a[((fps0) jps0Var).b];
                    Object obj5 = lug1Var.a[lug1Var.c];
                    hps0Var.put(obj2, obj);
                    jps0Var.c(obj5 == null ? 0 : obj5.hashCode(), hps0Var.c, obj5, 0);
                }
                jps0Var.g = hps0Var.e;
                return obj4;
            default:
                qlc0 qlc0Var = (qlc0) this.f;
                Object obj6 = qlc0Var.a;
                qlc0 qlc0VarH = qlc0Var.h(obj);
                this.f = qlc0VarH;
                ((Map) obj3).put(obj2, qlc0VarH);
                return obj6;
        }
    }

    public pdn0(nps0 nps0Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 1);
        this.e = nps0Var;
        this.f = obj2;
    }
}
