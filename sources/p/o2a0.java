package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Header;
import androidx.car.app.model.Pane;
import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o2a0 extends xvc {
    public MobiusLoop N0;
    public final xok0 O0;
    public final n2a0 P0;
    public final Action Q0;
    public final i8h1 X;
    public final t64 Y;
    public final bqn0 Z;

    public o2a0(k kVar, qzn0 qzn0Var, i8h1 i8h1Var, k2a0 k2a0Var, t64 t64Var) {
        super(kVar, i8h1Var, qzn0Var, t64Var);
        this.X = i8h1Var;
        this.Y = t64Var;
        this.Z = bqn0.a;
        this.O0 = new xok0((byte) 12);
        fn31.T(cto1.q(this), (o8n) null, 0, new m2a0(this, k2a0Var, (lnm) null, (byte) 0), 3).L(new hu90(this, (byte) 9));
        this.P0 = new n2a0(this, (byte) 0);
        this.Q0 = x1p1.d((kwc) null, new fvc(2131232471, (String) null, (mmr0) null, 14), (CarColor) null, false, new n2a0(this, (byte) 3), 29);
    }

    public final sxd1 d() {
        MobiusLoop mobiusLoop = this.N0;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        l2a0 l2a0Var = (l2a0) mobiusLoop.i;
        if (l2a0Var == null) {
            l2a0Var = new l2a0();
        }
        a5a0 a5a0Var = l2a0Var.a;
        if (a5a0Var instanceof y4a0) {
            Action action = Action.BACK;
            smc0 smc0VarN = k4p1.n();
            if (l2a0Var.b) {
                smc0VarN.add(this.Q0);
            }
            Header headerR = x1p1.r((String) null, action, k4p1.k(smc0VarN), 1);
            knr0 knr0Var = new knr0();
            knr0Var.c = true;
            Pane paneA = knr0Var.a();
            rnr0 rnr0Var = new rnr0();
            rnr0Var.b = paneA;
            rnr0Var.b(headerR);
            return rnr0Var.a();
        }
        if (a5a0Var instanceof x4a0) {
            Action action2 = Action.BACK;
            smc0 smc0VarN2 = k4p1.n();
            if (l2a0Var.b) {
                smc0VarN2.add(this.Q0);
            }
            x4a0 x4a0Var = (x4a0) a5a0Var;
            return lgo1.u(x1p1.r((String) null, action2, k4p1.k(smc0VarN2), 1), (evc) null, (Action) null, Collections.singletonList(x760.D(x4a0Var.a, x4a0Var.b, (hvc) null, (Integer) null, (nwc) null, (Boolean) null, (Action) null, false, false, (Float) null, (Function0) null, 4092)));
        }
        if (!(a5a0Var instanceof z4a0)) {
            eg.o();
            return null;
        }
        z4a0 z4a0Var = (z4a0) a5a0Var;
        String str = z4a0Var.a.a;
        Action action3 = Action.BACK;
        smc0 smc0VarN3 = k4p1.n();
        z4a0Var.a.getClass();
        smc0VarN3.add(x1p1.d(new kwc(2131953100), new fvc(2131231943, (String) null, (mmr0) null, 14), (CarColor) null, false, new n2a0(this, (byte) 1), 28));
        if (l2a0Var.b) {
            smc0VarN3.add(this.Q0);
        }
        return lgo1.u(x1p1.q(str, action3, k4p1.k(smc0VarN3)), new evc(z4a0Var.a.b, 480), x1p1.d(new kwc(2131953101), (hvc) null, (CarColor) null, false, new n2a0(this, (byte) 2), 30), Collections.singletonList(x760.D(new kwc(2131953102), new kwc(2131953098), (hvc) null, (Integer) null, (nwc) null, (Boolean) null, (Action) null, false, false, (Float) null, (Function0) null, 4092)));
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.P0;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.Z;
    }
}
