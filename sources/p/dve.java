package p;

import android.os.Parcelable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dve extends hab0 implements xu30 {
    public final /* synthetic */ qte a;
    public final /* synthetic */ eve b;
    public final /* synthetic */ List c;
    public final /* synthetic */ jwm d;
    public final /* synthetic */ c380 e;
    public final /* synthetic */ bve f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dve(qte qteVar, eve eveVar, List list, jwm jwmVar, c380 c380Var, bve bveVar, iu30 iu30Var) {
        super(3);
        this.a = qteVar;
        this.b = eveVar;
        this.c = list;
        this.d = jwmVar;
        this.e = c380Var;
        this.f = bveVar;
        this.g = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        ove pveVar;
        vzq0 vzq0Var = (vzq0) obj;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        qte qteVar = this.a;
        x340 x340Var = (x340) ((b0k) obj2);
        boolean zG = x340Var.g(qteVar.k());
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = mqo1.A(qteVar.k());
            x340Var.s0(objT);
        }
        c380 c380Var = (c380) objT;
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        boolean zH = x340Var.h(qteVar.h());
        Object objT2 = x340Var.T();
        eve eveVar = this.b;
        if (zH || objT2 == m4cVar) {
            objT2 = new r4f(qteVar.h(), new ztb(cir0Var, eveVar, (byte) 27), new gob(this.g, (byte) 19));
            x340Var.s0(objT2);
        }
        r4f r4fVar = (r4f) objT2;
        cp31 cp31Var = eveVar.f;
        gve gveVar = eveVar.b;
        btf btfVarB = qteVar.b();
        if (u890.j(btfVarB, atf.a)) {
            String strB = gveVar.b();
            jwm jwmVar = (jwm) o7h.s0(this.c);
            if (jwmVar == null) {
                Parcelable.Creator creator = w4i1.CREATOR;
                jwmVar = new jwm(14, loo1.u());
            }
            pveVar = new ove(strB, jwmVar, this.d, qteVar.j(), r4fVar, c380Var);
        } else {
            if (!(btfVarB instanceof btf)) {
                eg.o();
                return null;
            }
            pveVar = new pve(gveVar.b(), qteVar.j(), this.e, eveVar.c.e() ? btfVarB.U() : null, r4fVar, c380Var);
        }
        cp31Var.n(vzq0Var, pveVar, x340Var, iIntValue & 14);
        if (this.f.g()) {
            x340Var.i0(-1209097072);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarG = dug.g(u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), qim0VarD);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = zr7.d();
                x340Var.s0(objT3);
            }
            idn0 idn0Var = (idn0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = xrc.W0;
                x340Var.s0(objT4);
            }
            qim0 qim0VarV = bin.v(qim0VarG, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT4, 28);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(u291.B(nim0Var, null, 3), 6, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
            x340Var.r(false);
        } else {
            x340Var.i0(-1208553146);
            x340Var.r(false);
        }
        return rih1.a;
    }
}
