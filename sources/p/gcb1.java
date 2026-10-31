package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gcb1 implements yz50 {
    public final String a;
    public final qap b;
    public final bpb1 c;
    public final bpb1 d;
    public final o3r e;
    public final b7y0 f;
    public final yd91 g;

    public gcb1(String str, qap qapVar) {
        this.a = str;
        this.b = qapVar;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.c = bpb1VarB;
        this.d = bpb1VarB;
        this.e = w3p1.o(new l4r(pwc0.b, 1, v3b1.Y0, new j4r(new l5b1(this, (byte) 8)), v3b1.Z0), v3b1.W0);
        this.f = new b7y0(this);
        this.g = new yd91(3, new gga1(this, (byte) 13));
    }

    public final mr20 b() {
        return this.d;
    }

    public final l381 c() {
        return this.f;
    }

    public final yd91 d() {
        return this.g;
    }
}
