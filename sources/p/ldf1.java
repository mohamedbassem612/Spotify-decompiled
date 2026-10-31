package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ldf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ jkr0 c;
    public final /* synthetic */ nef1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldf1(c380 c380Var, jkr0 jkr0Var, nef1 nef1Var, int i) {
        super(2);
        this.b = c380Var;
        this.c = jkr0Var;
        this.d = nef1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nef1 nef1Var = this.d;
        c380 c380Var = this.b;
        switch (b) {
            case 0:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                long jB = hjl.b(j, 0, 0, 0, 0, 10);
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                int i = 0;
                while (true) {
                    Integer num = null;
                    if (!it.hasNext()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            Integer numValueOf = Integer.valueOf(((q5t0) it2.next()).b);
                            while (true) {
                                num = numValueOf;
                                while (true) {
                                    if (it2.hasNext()) {
                                        numValueOf = Integer.valueOf(((q5t0) it2.next()).b);
                                        if (num.compareTo(numValueOf) < 0) {
                                        }
                                    }
                                }
                            }
                        }
                        int iIntValue = num != null ? num.intValue() : 0;
                        q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("pager", new j2i(1131170689, new ncf1(this.c, tlc1Var, iIntValue, this.b, this.d), true)))).H(jjl.b(0, hjl.i(j), 0, iIntValue, 5));
                        return tlc1Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new oyc1(q5t0VarH, (byte) 3));
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(((afh0) o7h.q0(tlc1Var.P(f4i1.c(i, "measure_"), new j2i(1702318871, new heb1((rdf1) next, i, nef1Var), true)))).H(jB));
                    i = i2;
                }
                break;
            default:
                ((Number) obj2).intValue();
                odf1.d(c380Var, this.c, nef1Var, (b0k) obj, czo1.p(1));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldf1(c380 c380Var, nef1 nef1Var, jkr0 jkr0Var) {
        super(2);
        this.b = c380Var;
        this.d = nef1Var;
        this.c = jkr0Var;
    }
}
