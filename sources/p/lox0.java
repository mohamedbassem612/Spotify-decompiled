package p;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lox0 implements x8c {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public lox0(jox0 jox0Var) {
        this.a = (byte) 0;
        this.b = jox0Var;
        this.c = Collections.singletonMap(1, Collections.singleton(new zp21(oox0.class)));
    }

    @Override // p.x8c
    public final ji50 a(ajq0 ajq0Var, ji50 ji50Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ji50Var.b.put(unx0.class, new r3r(new wzq(((jox0) obj).a(ji50Var.a, eox0.a), ilx0.e1), gbw0.S0, (vu30) null));
                break;
            default:
                xzq xzqVar = new xzq(new nm1(ji50Var.a, new lal1(this, (byte) 2), (n9c) obj, new lal1(this, (byte) 3), ((q7r0) this.c).d.c), v5l1.T0);
                u5l1 u5l1Var = u5l1.i;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(l5l1.class, new r3r(xzqVar, u5l1Var, 4));
                fak1 fak1Var = new fak1(this, (byte) 10);
                v5l1 v5l1Var = v5l1.U0;
                u5l1 u5l1Var2 = u5l1.t;
                linkedHashMap.put(q6l1.class, new vw21(v5l1Var, b7x.a, new fc3(fak1Var, (byte) 5), u5l1Var2, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public lox0(n9c n9cVar, q7r0 q7r0Var) {
        this.a = (byte) 1;
        this.b = n9cVar;
        this.c = q7r0Var;
    }
}
