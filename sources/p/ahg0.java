package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ahg0 implements h0r0 {
    public final yuj a;
    public final xgg0 b;
    public final a2b0 c;
    public final z710 d;
    public final vqp e;
    public final yge0 f;
    public final cbr0 g;

    public ahg0(yuj yujVar, xgg0 xgg0Var, a2b0 a2b0Var, z710 z710Var, vqp vqpVar, yge0 yge0Var) {
        this.a = yujVar;
        this.b = xgg0Var;
        this.c = a2b0Var;
        this.d = z710Var;
        this.e = vqpVar;
        this.f = yge0Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131958173));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("PARENTAL_CONTROL_MANAGED_ACCOUNTS_REQUEST_SETTINGS", "parental-control/managed-accounts-request-settings", 1413, "parental-control"), nik1.b6, (nar0) null), new t1r0(true), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return yuj.b(this.a, new o6e0(new oxa0(this, null, (byte) 12), f46.I(new p6e0[0])), new j2i(-89304064, new kmd0(this, (byte) 25), true), new n7e0(new zgg0(this), ujf0.X0, ws10.O0, (iu30) null));
    }
}
