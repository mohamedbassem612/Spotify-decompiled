package p;

import androidx.car.app.k;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class ed10 extends xvc {
    public final t64 N0;
    public final idd1 O0;
    public MobiusLoop P0;
    public final fna X;
    public final i8h1 Y;
    public final md10 Z;

    public ed10(k kVar, fna fnaVar, i8h1 i8h1Var, qzn0 qzn0Var, md10 md10Var, t64 t64Var) {
        super(kVar, i8h1Var, qzn0Var, t64Var);
        this.X = fnaVar;
        this.Y = i8h1Var;
        this.Z = md10Var;
        this.N0 = t64Var;
        this.O0 = new idd1(new f710(this, (byte) 2));
        fn31.T(cto1.q(this), (o8n) null, 0, new bu(this, null, (byte) 17), 3).L(new dd10(this, (byte) 0));
    }

    public static ArrayList g(ed10 ed10Var) {
        Set setS0 = f46.S0(new cd10[]{bd10.c, ad10.c});
        MobiusLoop mobiusLoop = ed10Var.P0;
        if (mobiusLoop == null) {
            u890.C("fabLoop");
            throw null;
        }
        nd10 nd10Var = (nd10) mobiusLoop.i;
        if (nd10Var == null) {
            nd10Var = new nd10();
        }
        return x1p1.y(o7h.v0(nd10Var.a, setS0), ((k) ed10Var.X.b).d(), new dd10(ed10Var, (byte) 1));
    }

    public abstract r6h1 h();
}
