package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rq91 extends xbk1 {
    public boolean X;
    public boolean Y;
    public final ohv0 b;
    public final i8h1 c;
    public final yqg d;
    public final b2r0 e;
    public final g1f0 f;
    public final mwn0 g;
    public final kdn0 h = new kdn0(sq91.a);
    public final long i;
    public final h4l0 t;

    public rq91(ohv0 ohv0Var, i8h1 i8h1Var, yqg yqgVar, b2r0 b2r0Var, g1f0 g1f0Var, mwn0 mwn0Var) {
        this.b = ohv0Var;
        this.c = i8h1Var;
        this.d = yqgVar;
        this.e = b2r0Var;
        this.f = g1f0Var;
        this.g = mwn0Var;
        this.i = yqgVar.b();
        r6h1 r6h1Var = r6h1.c;
        this.t = new h4l0((byte) 16);
    }

    public final ymd0 T() {
        return this.h;
    }

    public final void U(xap1 xap1Var) {
        this.b.a(xap1Var);
    }

    public final void V() {
        U(new nhv0("phone_number_otp", this.e.Y.c.a));
    }

    public final void W(String str) {
        U(new jhv0("phone_number_otp", "whatsapp_otp_handshake_failed", 4, str));
    }

    public final boolean k() {
        return this.f.k();
    }
}
