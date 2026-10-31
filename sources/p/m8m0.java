package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class m8m0 {
    public final q8n a;
    public final q8n b;
    public final xe01 c;
    public final xe01 d;

    public m8m0(Update update, Connectable connectable, Object obj, q8m0 q8m0Var, q8n q8nVar, q8n q8nVar2, c9n c9nVar) {
        this.a = q8nVar;
        this.b = q8nVar2;
        MobiusLoop.Builder builderD = Mobius.d(update, connectable);
        if (q8m0Var instanceof p8m0) {
            builderD = builderD.i(((p8m0) q8m0Var).a);
        } else if (q8m0Var instanceof o8m0) {
            builderD = builderD.h(((o8m0) q8m0Var).a);
        } else if (q8m0Var != null) {
            eg.o();
            throw null;
        }
        MobiusLoop mobiusLoopG = builderD.d(new eea0((Object) this, (byte) 26)).b(new e5l0(this, (byte) 1)).g(obj);
        xe01 xe01VarT = d5p1.t(new m441(new m2a0(mobiusLoopG, (lnm) null, (byte) 27)), c9nVar, ey71.a, mobiusLoopG);
        this.c = xe01VarT;
        this.d = d5p1.t(hu20.e(xe01VarT, new i64(3, (lnm) null, (byte) 15)), c9nVar, new alb1(0L, Long.MAX_VALUE), obj);
    }

    public final zob1 a() {
        return this.d;
    }
}
