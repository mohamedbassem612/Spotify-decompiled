package p;

import android.icu.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dff0 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ k6a1 f;
    public final /* synthetic */ c9n g;
    public final /* synthetic */ xtb0 h;
    public final /* synthetic */ boolean i;

    public dff0(List list, List list2, ArrayList arrayList, List list3, List list4, k6a1 k6a1Var, c9n c9nVar, xtb0 xtb0Var, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = arrayList;
        this.d = list3;
        this.e = list4;
        this.f = k6a1Var;
        this.g = c9nVar;
        this.h = xtb0Var;
        this.i = z;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            String str2 = (String) this.a.get(iIntValue);
            x340Var2.i0(-768536254);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
            List list = this.b;
            if (list == null || (str = (String) o7h.t0(iIntValue, list)) == null || str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                x340Var2.i0(-234011346);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-234011345);
                mod.b(t4k.n.a(this.i ? flb0.b : flb0.a), apo.r(-531839210, new ue0((byte) 10, iIntValue, str, false), x340Var2), x340Var2, 56);
                x340Var2.r(false);
            }
            y7e1 y7e1Var = (y7e1) this.c.get(iIntValue);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarH = u291.h(qim0VarB, 48.0f);
            List list2 = this.d;
            qim0 qim0VarP = vby0.p(qim0VarH, (lz20) list2.get(iIntValue));
            boolean zG = x340Var2.g(str2);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new z9b0(str2, (byte) 13);
                x340Var2.s0(objT);
            }
            qim0 qim0VarN = anm1.N("lyrics-correction-field-" + iIntValue, s161.b(qim0VarP, false, (iu30) objT));
            String strO0 = cwl1.o0(x340Var2, 2131957865);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str2);
            int i2 = 0;
            while (characterInstance.next() != -1) {
                i2++;
            }
            epv epvVar = new epv(i2 * 2, (byte) 1);
            lee1 lee1Var = cbx.d(x340Var2).g;
            List list3 = this.e;
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, iIntValue == p7h.L(list3) ? 7 : 6, 119);
            boolean zG2 = ((((i & 112) ^ 48) > 32 && x340Var2.e(iIntValue)) || (i & 48) == 32) | x340Var2.g(list3) | x340Var2.g(this.f) | x340Var2.i(this.g) | x340Var2.g(this.h) | x340Var2.g(list2);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                cff0 cff0Var = new cff0(iIntValue, this.e, this.f, this.g, this.h, this.d);
                x340Var2.s0(cff0Var);
                objT2 = cff0Var;
            }
            rwo1.b(y7e1Var, qim0VarN, (max) null, strO0, (vu30) null, (vu30) null, false, false, epvVar, lee1Var, kua0Var, (yta0) objT2, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, tm80.u(x340Var2), x340Var2, 0, 384, 1040628);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
