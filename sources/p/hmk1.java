package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hmk1 implements h0r0 {
    public final hvj a;
    public final mx2 b;
    public final t4d1 c;
    public final cbr0 d;

    public hmk1(hvj hvjVar, mx2 mx2Var, t4d1 t4d1Var) {
        this.a = hvjVar;
        this.b = mx2Var;
        this.c = t4d1Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131962115));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.x1(), new lik1("spotify:settings:voice-chat-character"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new o6e0(new l8t0(this, (lnm) null, (byte) 25), f46.I(new p6e0[0])), new j2i(-1654195102, new g2j1(this, (byte) 22), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }
}
