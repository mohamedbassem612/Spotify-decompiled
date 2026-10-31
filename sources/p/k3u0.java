package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3u0(long j, String str, boolean z) {
        super(1);
        this.a = (byte) 2;
        this.b = str;
        this.d = z;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                p3u0 p3u0Var = (p3u0) obj2;
                p3u0Var.h.M(p3u0Var.i, this.c, ((Number) obj).longValue(), this.d);
                return rih1Var;
            case 1:
                long jLongValue = ((Number) obj).longValue();
                p3u0 p3u0Var2 = (p3u0) obj2;
                p3u0Var2.h.N(p3u0Var2.i, jLongValue, p3u0Var2.c.o0(this.c), this.d);
                if (p3u0Var2.W0 == null) {
                    p3u0Var2.W0 = Long.valueOf(jLongValue);
                }
                return rih1Var;
            default:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof jo70) {
                        arrayList.add(obj3);
                    }
                }
                jo70 jo70Var = (jo70) o7h.s0(arrayList);
                if (jo70Var != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof hll) {
                            arrayList2.add(obj4);
                        }
                    }
                    hll hllVar = (hll) o7h.s0(arrayList2);
                    if (hllVar != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof xkk1) {
                                arrayList3.add(obj5);
                            }
                        }
                        xkk1 xkk1Var = (xkk1) o7h.s0(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : list) {
                            if (obj6 instanceof a7q0) {
                                arrayList4.add(obj6);
                            }
                        }
                        a7q0 a7q0Var = (a7q0) o7h.s0(arrayList4);
                        return new q6g1(new xn70(o7h.y0(jo70Var.d, (CharSequence) null, (String) null, (String) null, iwf1.X, 31), (String) obj2, 4, (String) null), new bv11(jo70Var.a, (String) null, (Long) null, (Long) null, (u380) null, 0, false, mqo1.A(hllVar.b), (h540) null, (vno1) null, (c380) null, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null || (str = up70VarA.a.a) == null) ? q17.c : new sz6(str), this.d && hllVar.d.contains(fll.c), (String) null, a7q0Var != null ? Long.valueOf(a7q0Var.c) : null, this.c, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67053438));
                    }
                }
                return r6g1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3u0(p3u0 p3u0Var, long j, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = j;
        this.d = z;
    }
}
