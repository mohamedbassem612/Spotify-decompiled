package p;

import android.content.Context;
import com.spotify.martini.martinidata.model.Mode;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v7m extends hab0 implements zu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ float O0;
    public final /* synthetic */ boolean P0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ i7m a;
    public final /* synthetic */ hdn0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f8m g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7m(i7m i7mVar, hdn0 hdn0Var, Function0 function0, tob1 tob1Var, boolean z, boolean z2, f8m f8mVar, int i, boolean z3, ven0 ven0Var, ven0 ven0Var2, String str, vu30 vu30Var, Function0 function1, float f, boolean z4) {
        super(4);
        this.a = i7mVar;
        this.b = hdn0Var;
        this.c = function0;
        this.d = tob1Var;
        this.e = z;
        this.f = z2;
        this.g = f8mVar;
        this.h = i;
        this.i = z3;
        this.t = ven0Var;
        this.X = ven0Var2;
        this.Y = str;
        this.Z = vu30Var;
        this.N0 = function1;
        this.O0 = f;
        this.P0 = z4;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01e6 A[PHI: r19
      0x01e6: PHI (r19v5 p.ven0) = (r19v0 p.ven0), (r19v0 p.ven0), (r1v5 p.ven0) binds: [B:75:0x0212, B:70:0x0201, B:57:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        int i;
        boolean z;
        Throwable th;
        boolean z2;
        b0k b0kVar;
        boolean z3;
        n8m n8mVar;
        Object v2bVar;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        Integer num = 6;
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        i7m i7mVar = this.a;
        c380 c380Var = i7mVar.a;
        b0k b0kVar2 = (x340) ((b0k) obj3);
        boolean zG = b0kVar2.g(c380Var);
        j06 j06Var = ((x340) b0kVar2).a;
        Object objT = b0kVar2.T();
        if (zG || objT == m4cVar) {
            objT = new dw91();
            b0kVar2.s0(objT);
        }
        dw91 dw91Var = (dw91) objT;
        if (((Number) this.d.getValue()).intValue() == iIntValue) {
            b0kVar2.i0(-1447536711);
            Integer numValueOf = Integer.valueOf(iIntValue);
            hdn0 hdn0Var = this.b;
            boolean zI = b0kVar2.i(hdn0Var);
            boolean z4 = (((iIntValue2 & 112) ^ 48) > 32 && b0kVar2.e(iIntValue)) || (iIntValue2 & 48) == 32;
            Function0 function0 = this.c;
            boolean zG2 = zI | z4 | b0kVar2.g(function0);
            Object objT2 = b0kVar2.T();
            if (zG2 || objT2 == m4cVar) {
                i = iIntValue;
                z = false;
                v2bVar = new v2b(i, function0, hdn0Var, (lnm) null, (byte) 3);
                th = null;
                b0kVar2.s0(v2bVar);
            } else {
                v2bVar = objT2;
                i = iIntValue;
                z = false;
                th = null;
            }
            qxd0.t(numValueOf, b0kVar2, (vu30) v2bVar);
            b0kVar2.r(z);
        } else {
            lljVar = lljVar;
            lljVar2 = lljVar2;
            i = iIntValue;
            num = num;
            z = false;
            th = null;
            b0kVar2.i0(-1447281085);
            b0kVar2.r(false);
        }
        l7c1 l7c1Var = (l7c1) o7h.t0(i, o7h.l1(c380Var));
        if (l7c1Var == null) {
            b0kVar2.i0(-1447110989);
            b0kVar2.r(z);
        } else {
            String str = l7c1Var.a;
            b0kVar2.i0(-1447110988);
            f8m f8mVar = this.g;
            boolean z5 = f8mVar.m;
            Object obj5 = dw91Var.get(str);
            if (obj5 == null) {
                mwp mwpVar = f8mVar.d;
                rzq rzqVar = f8mVar.i;
                switch (mwpVar.a) {
                    case 0:
                        nwp nwpVar = (nwp) ((gbp) mwpVar.b).c;
                        yup yupVar = (yup) nwpVar.n0.get();
                        gbp gbpVar = nwpVar.o0;
                        gbp gbpVar2 = nwpVar.p0;
                        lka1 lka1Var = new lka1(((Context) nwpVar.b.d).getApplicationContext());
                        a1r0 a1r0VarA0 = nwpVar.a.A0();
                        c8o.l(a1r0VarA0);
                        n8mVar = new n8m(yupVar, gbpVar, gbpVar2, lka1Var, a1r0VarA0, nwpVar.f(), rzqVar);
                        break;
                    default:
                        thq thqVar = (thq) mwpVar.b;
                        v5q v5qVar = (v5q) thqVar.c;
                        n8mVar = new n8m((yup) v5qVar.a7.get(), v5qVar.b7, v5qVar.Q4, (lka1) v5qVar.c7.get(), (a1r0) v5qVar.k1.get(), (mr4) thqVar.b.ri.get(), rzqVar);
                        break;
                }
                obj5 = n8mVar;
                dw91Var.put(str, obj5);
            } else {
                l7c1Var = l7c1Var;
            }
            n8m n8mVar2 = (n8m) obj5;
            boolean z6 = i == 0 && !this.e;
            boolean z7 = this.f;
            ven0 ven0Var = this.t;
            boolean z8 = z7 && i == 1 && !((Boolean) ven0Var.getValue()).booleanValue();
            int i2 = this.h;
            boolean z9 = this.i;
            ven0 ven0Var2 = this.X;
            if (z6) {
                if (i2 < (z5 ? 20 : 50) || !z9) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                ven0Var2 = ven0Var2;
                if (z8) {
                    boolean z10 = i2 >= (z5 ? 3 : 50);
                    if (!z5 ? !(!((Boolean) ven0Var2.getValue()).booleanValue() || !z10 || !z9) : !(!z10 || !z9)) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            Function0 function1 = this.c;
            String str2 = this.Y;
            int i3 = i;
            l7c1 l7c1Var2 = l7c1Var;
            Integer num2 = num;
            j2i j2iVarR = apo.r(-1955988822, new u7m(l7c1Var2, n8mVar2, z6, z8, i3, ven0Var2, function1, z7, ven0Var, i7mVar, str2, z2, this.Z, this.N0), b0kVar2);
            nim0 nim0Var = nim0.a;
            f36 f36Var = h36.c;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                b0kVar2.i0(-570515221);
                qim0 qim0VarB = uyn1.B(dug.f(u291.d(nim0Var, 1.0f), g8m.a, er31.b(12.0f)), 0.0f, 16.0f, 0.0f, 12.0f, 5);
                mbh mbhVarA = jbh.a(h36.g, eraVar, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw th;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, lljVar4);
                nko1.H(xos0VarM, b0kVar2, lljVar3);
                llj lljVar5 = lljVar2;
                x0d.q(iHashCode, b0kVar2, lljVar5, b0kVar2);
                llj lljVar6 = lljVar;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, kk0.q(b0kVar2, qim0VarE, lljVar6, 1.0f, true));
                float f = this.O0;
                if (f < 1.0f) {
                    qim0VarZ = exd0.s(i541.C(qim0VarZ, z4m.R0), new jc5((byte) 14, f));
                }
                qim0 qim0VarN = anm1.N("content_story_card_story_content", qim0VarZ);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarN);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA2, b0kVar2, lljVar4);
                nko1.H(xos0VarM2, b0kVar2, lljVar3);
                x0d.q(iHashCode2, b0kVar2, lljVar5, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar6);
                j2iVarR.invoke(b0kVar2, num2);
                b0kVar2.r(true);
                LinkedHashMap linkedHashMap = f8mVar.k;
                Object objA = linkedHashMap.get(str);
                if (objA == null) {
                    objA = f8mVar.c.a(f8mVar.h, false, Mode.MARTINI);
                    linkedHashMap.put(str, objA);
                }
                int size = i7mVar.a.size();
                String str3 = l7c1Var2.a;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                b0kVar = b0kVar2;
                f8mVar.j((mr10) objA, i3, size, str3, str2, uyn1.B(nim0Var, 4.0f, 0.0f, 12.0f, 0.0f, 10), this.P0, l7c1Var2, b0kVar, iIntValue2 & 112);
                b0kVar.r(true);
                z3 = false;
                b0kVar.r(false);
            } else {
                llj lljVar7 = lljVar;
                llj lljVar8 = lljVar2;
                b0kVar = b0kVar2;
                b0kVar.i0(-569136310);
                qim0 qim0VarN2 = anm1.N("content_story_card_story_content", u291.d(nim0Var, 1.0f));
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar).T);
                xos0 xos0VarM3 = b0kVar.m();
                qim0 qim0VarE3 = zr7.E(b0kVar, qim0VarN2);
                hzj.A.getClass();
                if (j06Var == 0) {
                    tgp1.p();
                    throw th;
                }
                b0kVar.m0();
                if (((x340) b0kVar).S) {
                    b0kVar.l(n4kVar);
                } else {
                    b0kVar.v0();
                }
                nko1.H(mbhVarA3, b0kVar, lljVar4);
                nko1.H(xos0VarM3, b0kVar, lljVar3);
                x0d.q(iHashCode3, b0kVar, lljVar8, b0kVar);
                nko1.H(qim0VarE3, b0kVar, lljVar7);
                z3 = false;
                ktd.s(j2iVarR, b0kVar, num2, true, false);
            }
            b0kVar.r(z3);
        }
        return rih1.a;
    }
}
