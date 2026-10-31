package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fne1 implements zu30 {
    public final /* synthetic */ h290 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ vnr0 f;

    public fne1(h290 h290Var, int i, iu30 iu30Var, long j, long j2, vnr0 vnr0Var) {
        this.a = h290Var;
        this.b = i;
        this.c = iu30Var;
        this.d = j;
        this.e = j2;
        this.f = vnr0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        oex oexVar;
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
            SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry = (SceneTemplate.TimeMachineContent.Card2.YearEntry) this.a.get(iIntValue);
            x340Var2.i0(-1025551332);
            boolean z = iIntValue == this.b;
            long jE = ror0.e(u7h.j, yearEntry.t());
            vnr0 vnr0VarA = shy0.a(yearEntry.p(), x340Var2);
            qim0 qim0VarB = u291.b(0.0f, 48.0f, 1, nim0.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strC = f4i1.c(yearEntry.getYear(), "Select year ");
            iu30 iu30Var = this.c;
            boolean zG = ((((i & 112) ^ 48) > 32 && x340Var2.e(iIntValue)) || (i & 48) == 32) | x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ck0(iu30Var, iIntValue, (byte) 27);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strC)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(strC), function0);
            if (z) {
                x340Var2.i0(-864132785);
                boolean zF = x340Var2.f(jE);
                Object objT2 = x340Var2.T();
                if (zF || objT2 == m4cVar) {
                    objT2 = new q9j0((byte) 29, jE);
                    x340Var2.s0(objT2);
                }
                oexVar = new oex(0, (vu30) null, (vu30) objT2, (vu30) null, 11);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-864029555);
                long j = this.d;
                boolean zF2 = x340Var2.f(j);
                Object objT3 = x340Var2.T();
                if (zF2 || objT3 == m4cVar) {
                    objT3 = new dne1((byte) 0, j);
                    x340Var2.s0(objT3);
                }
                vu30 vu30Var = (vu30) objT3;
                long j2 = this.e;
                boolean zF3 = x340Var2.f(j2);
                Object objT4 = x340Var2.T();
                if (zF3 || objT4 == m4cVar) {
                    objT4 = new dne1((byte) 1, j2);
                    x340Var2.s0(objT4);
                }
                oexVar = new oex(0, (vu30) null, vu30Var, (vu30) objT4, 3);
                x340Var2.r(false);
            }
            poo1.e(gbxVar, oexVar, yoo1.z(x340Var2), (qim0) null, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-765479463, new ene1(z, vnr0VarA, this.f), x340Var2), x340Var2, 0, 3072, 8184);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
