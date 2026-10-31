package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hf50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf50(ArrayList arrayList, byte b) {
        super(3);
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object next;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                float fMin = Math.min(i2cVar.d(), i2cVar.c());
                float f = 0.05f * fMin;
                pf50 pf50Var = new pf50(3);
                qim0 qim0VarR = u291.r(nim0Var, fMin);
                d36 d36Var = new d36(f, true, new um5(false));
                d36 d36Var2 = new d36(f, true, new um5(false));
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(arrayList);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new ib5(arrayList, (byte) 18);
                    x340Var.s0(objT);
                }
                dko1.g(pf50Var, qim0VarR, null, null, d36Var2, d36Var, null, false, null, (iu30) objT, x340Var, 100663296, 668);
                return rih1Var;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j1p1.c(arrayList, null, x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(x340Var4, 2131952916);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var4).m;
                long j = cbx.a(x340Var4).b.b;
                fra fraVar = een.N0;
                uwo1.e(strO0, ew20Var.e(nim0Var, fraVar), lee1Var, j, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                x340 x340Var5 = x340Var4;
                boolean zG2 = x340Var5.g(arrayList);
                Object objT2 = x340Var5.T();
                if (zG2 || objT2 == fkj0.X) {
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new phx(14, 0L, (String) it.next(), (String) null, (String) null));
                    }
                    objT2 = mqo1.A(arrayList2);
                    x340Var5.s0(objT2);
                }
                fc11.a((c380) objT2, ew20Var.e(nim0Var, fraVar), hcx.a, (hux) null, false, 10, (gbx) null, (String) null, (idn0) null, x340Var5, 197000, 472);
                return rih1Var;
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                x340 x340Var6 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var6.e(iIntValue2) ? 4 : 2;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    vpx0 vpx0Var = (vpx0) arrayList.get(iIntValue2);
                    x340Var7.i0(2039939144);
                    vpx0Var.d(x340Var7, 6);
                    x340Var7.r(false);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            default:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD = ((i2c) obj).d();
                int size = arrayList.size();
                float f2 = fD - (size > 1 ? 6.0f * (size - 1) : 0.0f);
                if (size < 1) {
                    size = 1;
                }
                float fMin2 = Math.min(32.0f, f2 / size);
                float f3 = fMin2 * 3.0f;
                lr80 it2 = p7h.K(arrayList).iterator();
                sr80 sr80Var = (sr80) it2;
                if (sr80Var.c) {
                    lr80 lr80Var = it2;
                    next = lr80Var.next();
                    if (sr80Var.c) {
                        float f4 = ((s8a) arrayList.get(((Number) next).intValue())).a;
                        do {
                            Object next2 = lr80Var.next();
                            float f5 = ((s8a) arrayList.get(((Number) next2).intValue())).a;
                            if (Float.compare(f4, f5) < 0) {
                                next = next2;
                                f4 = f5;
                            }
                        } while (sr80Var.c);
                    }
                } else {
                    next = null;
                }
                Integer num = (Integer) next;
                int iIntValue4 = num != null ? num.intValue() : -1;
                s8a s8aVar = (s8a) o7h.t0(iIntValue4, arrayList);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode = Long.hashCode(x340Var9.T);
                xos0 xos0VarM = x340Var9.m();
                qim0 qim0VarE = zr7.E(x340Var8, nim0Var);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                boolean z = x340Var10.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var8, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var8, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var8, lljVar3);
                nko1.F(x340Var8);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var8, lljVar4);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                int i = iIntValue4;
                jw31 jw31VarA = ew31.a(h36.a, een.O0, x340Var8, 0);
                int iHashCode2 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM2 = x340Var10.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarF);
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(jw31VarA, x340Var8, lljVar);
                nko1.H(xos0VarM2, x340Var8, lljVar2);
                i3a.l(iHashCode2, x340Var8, lljVar3, x340Var8);
                nko1.H(qim0VarE2, x340Var8, lljVar4);
                x340Var10.i0(434171836);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    cuo1.a((s8a) it3.next(), fMin2, f3, new wnb0(1.0f, true), x340Var8, 0);
                }
                x340Var10.r(false);
                x340Var10.r(true);
                if ((s8aVar != null ? s8aVar.g : null) == null || arrayList.size() <= 1) {
                    x340Var10.i0(828689682);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(828340839);
                    Paragraph paragraph = s8aVar.g;
                    int size2 = arrayList.size();
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    cuo1.f(paragraph, i, size2, uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 16.0f, 5), x340Var8, 0);
                    x340Var10.r(false);
                }
                x340Var10.r(true);
                return rih1Var;
        }
    }
}
