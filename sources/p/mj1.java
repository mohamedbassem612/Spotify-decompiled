package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mj1 implements xpw {
    public final ia00 N0;
    public final psw O0;
    public final idd1 X = new idd1(new lj1(this, (byte) 2));
    public final idd1 Y = new idd1(new lj1(this, (byte) 3));
    public final e7m0 Z;
    public final gv51 a;
    public final tbr0 b;
    public final z6q c;
    public final l5p d;
    public final a7q e;
    public final d6o0 f;
    public final q8n g;
    public final q8n h;
    public final w3f i;
    public final m5p t;

    public mj1(h971 h971Var, lzn0 lzn0Var, bfd bfdVar, gv51 gv51Var, tbr0 tbr0Var, z6q z6qVar, l5p l5pVar, a7q a7qVar, i6o0 i6o0Var, q8n q8nVar, q8n q8nVar2, w3f w3fVar, m5p m5pVar) {
        this.a = gv51Var;
        this.b = tbr0Var;
        this.c = z6qVar;
        this.d = l5pVar;
        this.e = a7qVar;
        this.f = i6o0Var;
        this.g = q8nVar;
        this.h = q8nVar2;
        this.i = w3fVar;
        this.t = m5pVar;
        hj1 hj1Var = new hj1(0, 0, b7x.a, null, w4i1.f);
        n4 n4Var = n4.d;
        jj1 jj1Var = new jj1(this, (byte) 0);
        jj1 jj1Var2 = new jj1(this, (byte) 1);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        rj1 rj1Var = new rj1(h971Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ui1.class), cancelPrevious.a(rj1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ti1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new oj1(bfdVar, jj1Var, jj1Var2)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(si1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pj1(lzn0Var)));
        this.Z = sbl.z(hj1Var, n4Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), ah1.d, new jj1(this, (byte) 2));
        this.N0 = n3o1.q(this).a(fp0.b1, fp0.c1);
        j2i j2iVar = new j2i(-1706754406, new r1(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final mqw getBehavior() {
        return this.Z;
    }
}
