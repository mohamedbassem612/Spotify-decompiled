package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wrm0 implements orm0 {
    public final boolean N0;
    public final Function0 O0;
    public final Function0 P0;
    public final Function0 Q0;
    public final e7m0 R0;
    public final psw S0;
    public final eih1 T0;
    public final iu30 X;
    public final enk1 Y;
    public final qim0 Z;
    public final Context a;
    public final lvp b;
    public final a1r0 c;
    public final hrj0 d;
    public final q8n e;
    public final w9u0 f;
    public final ty60 g;
    public final nrm0 h;
    public final iu30 i;
    public final iu30 t;

    public wrm0(Context context, lvp lvpVar, a1r0 a1r0Var, hrj0 hrj0Var, q8n q8nVar, w9u0 w9u0Var, ty60 ty60Var, nrm0 nrm0Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, enk1 enk1Var, qim0 qim0Var, boolean z, Function0 function0, Function0 function1, Function0 function2) {
        this.a = context;
        this.b = lvpVar;
        this.c = a1r0Var;
        this.d = hrj0Var;
        this.e = q8nVar;
        this.f = w9u0Var;
        this.g = ty60Var;
        this.h = nrm0Var;
        this.i = iu30Var;
        this.t = iu30Var2;
        this.X = iu30Var3;
        this.Y = enk1Var;
        this.Z = qim0Var;
        this.N0 = z;
        this.O0 = function0;
        this.P0 = function1;
        this.Q0 = function2;
        rrm0 rrm0Var = new rrm0(this, (byte) 0);
        dq7 dq7Var = new dq7(this, (byte) 22);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        vrm0 vrm0Var = new vrm0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(prm0.class), runSequentially.a(vrm0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qrm0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new trm0(this)));
        this.R0 = sbl.A(rrm0Var, dq7Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), dbm0.Q0, new rrm0(this, (byte) 1));
        j2i j2iVar = new j2i(-1230318364, new hmk0(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.S0 = new psw(j2iVar, (byte) 0);
        this.T0 = new eih1();
    }

    public final rqw a() {
        return this.T0;
    }

    public final jsw c() {
        return this.S0;
    }

    public final mqw getBehavior() {
        return this.R0;
    }
}
