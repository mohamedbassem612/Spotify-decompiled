package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oo9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo9(List list, String str, String str2, long j, j2i j2iVar) {
        super(3);
        this.a = (byte) 2;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.b = j;
        this.f = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                ro9 ro9Var = (ro9) obj6;
                m4c m4cVar = fkj0.X;
                f8n f8nVar = (f8n) obj5;
                long jC = jhc1.c(i2cVar.d(), i2cVar.c());
                tzq0 tzq0Var = (tzq0) obj7;
                x340 x340Var = (b0k) obj2;
                wat watVar = (wat) x340Var.k(t4k.h);
                flb0 flb0Var = (flb0) x340Var.k(t4k.n);
                boolean zF = x340Var.f(jC);
                long j = this.b;
                boolean zF2 = x340Var.f(j) | zF | x340Var.g(tzq0Var) | x340Var.g(watVar) | x340Var.e(flb0Var.ordinal());
                Object objT = x340Var.T();
                if (zF2 || objT == m4cVar) {
                    int iI0 = watVar.i0(s3v.b(jC));
                    objT = new g8n((((long) watVar.i0(s3v.a(jC))) & 4294967295L) | (((long) iI0) << 32), (((long) watVar.i0(s3v.b(j))) << 32) | (((long) watVar.i0(s3v.a(j))) & 4294967295L), tzq0Var, watVar, flb0Var);
                    x340Var.s0(objT);
                }
                g8n g8nVar = (g8n) objT;
                boolean zBooleanValue = ((Boolean) ro9Var.i.getValue()).booleanValue();
                boolean zE = x340Var.e(f8nVar.ordinal());
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new uv8(f8nVar, (byte) 12);
                    x340Var.s0(objT2);
                }
                bby bbyVarA = xay.p(1, (iu30) objT2).a(xay.e(3, (ni20) null));
                boolean zI = x340Var.i(ro9Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new uv8(ro9Var, (byte) 13);
                    x340Var.s0(objT3);
                }
                uwr uwrVar = cbx.a;
                xpv0 xpv0Var = cbx.c(x340Var).c;
                fq7.g(zBooleanValue, new cv91(f8nVar, (iu30) objT3, g8nVar, xpv0.b()), bbyVarA, (ln00) null, (String) null, apo.r(-1160979917, new no9(j, (j2i) obj4, f8nVar, (byte) 0), x340Var), x340Var, 196608, 24);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                String str = ((gyj) obj7).a;
                qim0 qim0VarW = uyn1.w(dug.f(u291.d(nim0Var, 1.0f), this.b, d4o1.a), (vzq0) obj);
                iyj iyjVar = (iyj) obj6;
                ven0 ven0Var = (ven0) obj5;
                ven0 ven0Var2 = (ven0) obj4;
                x340 x340Var2 = (b0k) obj2;
                Object objT4 = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                if (objT4 == m4cVar2) {
                    objT4 = new xs3(iyjVar, ven0Var, ven0Var2);
                    x340Var2.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                boolean zG = x340Var2.g(str);
                Object objT5 = x340Var2.T();
                if (zG || objT5 == m4cVar2) {
                    objT5 = new wdg1(str, iu30Var);
                    x340Var2.s0(objT5);
                }
                otw.c(iyjVar.b, (wdg1) objT5, anm1.N("compose-selection-page-content", qim0VarW), (ipb1) null, x340Var2, 0, 8);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                List list = (List) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                j2i j2iVar = (j2i) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, nim0Var);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                boolean zG2 = x340Var5.g(list);
                Object objT6 = x340Var5.T();
                if (zG2 || objT6 == fkj0.X) {
                    List<bxn> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (bxn bxnVar : list2) {
                        arrayList.add(new phx(8, 0L, bxnVar.d, bxnVar.b, bxnVar.c));
                    }
                    objT6 = mqo1.A(arrayList);
                    x340Var5.s0(objT6);
                }
                fc11.a((c380) objT6, (qim0) null, hcx.b, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var3, 24968, 490);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                op71.g(x340Var3, u291.r(nim0Var, 8.0f));
                ltn1.g(str2, str3, this.b, new wnb0(1.0f, false), x340Var3, 0);
                j2iVar.invoke(x340Var3, 0);
                x340Var5.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo9(long j, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
