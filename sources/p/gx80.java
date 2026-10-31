package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Header;
import com.spotify.mobius.MobiusLoop;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gx80 extends xvc {
    public final nd70 N0;
    public final zpn0 O0;
    public final qmu X;
    public MobiusLoop Y;
    public final bqk0 Z;

    public gx80(k kVar, ex80 ex80Var, qmu qmuVar, i8h1 i8h1Var, qzn0 qzn0Var, t64 t64Var) {
        super(kVar, i8h1Var, qzn0Var, t64Var);
        this.X = qmuVar;
        this.Z = new bqk0((byte) 17);
        fn31.T(cto1.q(this), (o8n) null, 0, new p1r(this, ex80Var, (lnm) null, (byte) 28), 3).L(new ux70(this, (byte) 13));
        this.N0 = new nd70(this, (byte) 22);
        this.O0 = zpn0.a;
    }

    public final sxd1 d() {
        kwc kwcVar = new kwc(2131955005);
        Header headerR = x1p1.r(hon1.C(new kwc(2131955004)), Action.BACK, (smc0) null, 4);
        avc avcVar = new avc(2131231750, -1, 64.0f, 128.0f, zuc.a);
        c6j0 c6j0Var = new c6j0(hon1.B(kwcVar));
        c6j0Var.b(headerR);
        CarIcon carIconR = lnn1.r(avcVar);
        yo31.f.j(carIconR);
        c6j0Var.e = carIconR;
        return c6j0Var.a();
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.N0;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.O0;
    }

    @Override // p.xvc
    public final void onResume(iac0 iac0Var) {
        super.onResume(iac0Var);
        this.X.getClass();
    }

    public final void onStop(iac0 iac0Var) {
        this.X.getClass();
    }
}
