package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ccb0 implements xpw {
    public final sbb0 a;
    public final Function0 b;
    public final ljm0 c = h7w.D(rab0.Y, null, rab0.N0, new j2i(-1161136965, new sw1(this, (byte) 20), true), 2);
    public final rqw d;
    public final psw e;

    public ccb0(sbb0 sbb0Var, Function0 function0, rqw rqwVar) {
        this.a = sbb0Var;
        this.b = function0;
        this.d = rqwVar == null ? new eih1() : rqwVar;
        j2i j2iVar = vui.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
