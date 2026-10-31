package p;

import com.spotify.kidsaccount.api.v2.proto.NotEmpty;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dmi0 implements h0r0 {
    public final urp a;
    public final bza0 b;
    public final q7e0 c;
    public final ami0 d;
    public final gmi0 e;

    public dmi0(urp urpVar, bza0 bza0Var, q7e0 q7e0Var, ami0 ami0Var, gmi0 gmi0Var) {
        this.a = urpVar;
        this.b = bza0Var;
        this.c = q7e0Var;
        this.d = ami0Var;
        this.e = gmi0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) yon1.r3(), this.e.getViewUri(), (v8h1) b9p1.q()), new ktl1(32), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        bza0 bza0Var = this.b;
        iza0 iza0Var = bza0Var.a;
        bgo0 bgo0VarO = NotEmpty.o();
        bgo0VarO.n();
        return q7e0.b(this.c, bbp1.g(iza0Var.a((NotEmpty) bgo0VarO.build()).map(new t2b(bza0Var, (byte) 14))), new z6h0(this, (byte) 22), new n7e0(new cmi0(this), new yih0(this, (byte) 14), sa20.O0));
    }
}
