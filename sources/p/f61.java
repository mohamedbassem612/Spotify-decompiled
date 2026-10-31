package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(float f, j2i j2iVar, dt41 dt41Var, int i, xu30 xu30Var) {
        super(2);
        this.a = (byte) 3;
        this.b = f;
        this.f = j2iVar;
        this.e = dt41Var;
        this.d = i;
        this.c = xu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                c4p1.c((nl3) obj5, this.b, (qim0) obj4, (j2i) obj3, (b0k) obj, iP);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                lrn1.e((c380) obj5, (pt) obj3, this.b, (qim0) obj4, (b0k) obj, iP2);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP3 = czo1.p(i | 1);
                iro1.d(this.b, (iu30) obj5, (qim0) obj4, j2iVar, (b0k) obj, iP3);
                return rih1Var;
            case 3:
                tlc1 tlc1Var = (tlc1) obj;
                long jB = hjl.b(((hjl) obj2).a, tlc1Var.i0(this.b), 0, 0, 0, 14);
                List listP = tlc1Var.P(thd1.a, (j2i) obj3);
                ArrayList arrayList = new ArrayList(listP.size());
                int size = listP.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((afh0) listP.get(i2)).H(jB));
                }
                n811 n811Var = new n811();
                n811Var.a = 0;
                n811 n811Var2 = new n811();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    q5t0 q5t0Var = (q5t0) arrayList.get(i3);
                    n811Var.a += q5t0Var.a;
                    n811Var2.a = Math.max(n811Var2.a, q5t0Var.b);
                }
                return tlc1Var.S(n811Var.a, n811Var2.a, b7x.a, new ovj(arrayList, tlc1Var, (dt41) obj5, this.d, (xu30) obj4, n811Var, n811Var2));
            case 4:
                ((Number) obj2).intValue();
                j2i j2iVar2 = (j2i) obj3;
                int iP4 = czo1.p(24577);
                mez0.a(this.d, (qim0) obj4, (vzq0) obj5, this.b, j2iVar2, (b0k) obj, iP4);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                c2p1.l(this.b, (c380) obj5, (c380) obj4, (cfd) obj3, (b0k) obj, iP5);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                htd1.g((tsd1) obj5, this.b, (afx) obj4, (afx) obj3, (b0k) obj, iP6);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f61(float f, Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(int i, qim0 qim0Var, vzq0 vzq0Var, float f, j2i j2iVar, int i2) {
        super(2);
        this.a = (byte) 4;
        this.d = i;
        this.c = qim0Var;
        this.e = vzq0Var;
        this.b = f;
        this.f = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f61(Object obj, float f, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = f;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(c380 c380Var, pt ptVar, float f, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.e = c380Var;
        this.f = ptVar;
        this.b = f;
        this.c = qim0Var;
        this.d = i;
    }
}
