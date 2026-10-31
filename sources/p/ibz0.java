package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.SectionHeader;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ibz0 extends ed10 {
    public final haz0 Q0;
    public final i8h1 R0;
    public final t64 S0;
    public MobiusLoop T0;
    public final xok0 U0;
    public final h2y0 V0;
    public final kqn0 W0;
    public final r6h1 X0;

    public ibz0(k kVar, fna fnaVar, haz0 haz0Var, md10 md10Var, i8h1 i8h1Var, qzn0 qzn0Var, t64 t64Var) {
        super(kVar, fnaVar, i8h1Var, qzn0Var, md10Var, t64Var);
        this.Q0 = haz0Var;
        this.R0 = i8h1Var;
        this.S0 = t64Var;
        xok0 xok0Var = new xok0((byte) 13);
        this.U0 = xok0Var;
        fn31.T(cto1.q(this), (o8n) null, 0, new i7u0(this, (lnm) null, (byte) 2), 3).L(new hbz0(this, (byte) 0));
        this.V0 = new h2y0(this, (byte) 21);
        this.W0 = kqn0.a;
        this.X0 = xok0Var.b();
    }

    public final sxd1 d() {
        RowSection rowSectionT;
        MobiusLoop mobiusLoop = this.T0;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        iaz0 iaz0Var = (iaz0) mobiusLoop.i;
        if (iaz0Var == null) {
            iaz0Var = new iaz0();
        }
        int iC = l1d.C(iaz0Var.a);
        if (iC == 0) {
            return lgo1.v(ed10.g(this));
        }
        if (iC != 1) {
            if (iC == 2) {
                return lgo1.w(true, (Header) null, ed10.g(this), (List) null, 26);
            }
            if (iC == 3) {
                return lgo1.w(true, (Header) null, ed10.g(this), (List) null, 26);
            }
            eg.o();
            return null;
        }
        List<fpd> list = iaz0Var.d;
        ArrayList arrayList = new ArrayList();
        int size = 0;
        for (fpd fpdVar : list) {
            if (fpdVar instanceof dpd) {
                dpd dpdVar = (dpd) fpdVar;
                List list2 = dpdVar.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    apd apdVar = (apd) obj;
                    p80 p80Var = apdVar.d;
                    y6x0 y6x0Var = apdVar.f;
                    arrayList2.add(x760.D(apdVar.a, (nwc) null, apdVar.c, (Integer) null, apdVar.b, (Boolean) null, x1p1.n(y6x0Var), false, false, (Float) null, (!(p80Var instanceof m80) || u890.j(y6x0Var, y6x0.T0)) ? null : new ill(this, size, i, p80Var), 1898));
                    i = i2;
                }
                rowSectionT = lgo1.t((String) null, arrayList2, (String) null, (Function0) null, (b8p1) null, (SectionHeader) null, 60);
                size += dpdVar.b.size();
            } else {
                rowSectionT = null;
            }
            if (rowSectionT != null) {
                arrayList.add(rowSectionT);
            }
        }
        nwc kwcVar = iaz0Var.c;
        if (kwcVar == null && (kwcVar = iaz0Var.b) == null) {
            kwcVar = new kwc(2131960787);
        }
        return lgo1.w(false, x1p1.r(hon1.C(kwcVar), Action.BACK, (smc0) null, 4), ed10.g(this), arrayList, 16);
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.V0;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.W0;
    }

    @Override // p.ed10
    public final r6h1 h() {
        return this.X0;
    }
}
