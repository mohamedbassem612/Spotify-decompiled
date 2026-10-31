package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hq30 extends co41 {
    public static final o3r g;
    public static final o3r h;
    public final rp30 c;
    public final o3r d = g;
    public final eih1 e = new eih1();
    public final psw f;

    static {
        jd11 jd11Var = rc11.a;
        g = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, gq30.d, new j4r(jl30.Y0), gq30.e), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, jl30.d1, new j4r(jl30.Z0), jl30.e1), new l4r(new wlu(jd11Var.b(hll.class)), 1, gq30.f, new j4r(jl30.a1), gq30.g), j830.i);
        h = w3p1.o(new l4r(new wlu(jd11Var.b(xkk1.class)), 2, gq30.b, new j4r(jl30.b1), gq30.c), jl30.c1);
    }

    public hq30(rp30 rp30Var) {
        this.c = rp30Var;
        j2i j2iVar = spi.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.c;
    }

    /* JADX INFO: renamed from: getData, reason: collision with other method in class */
    public final o3r m403getData() {
        return this.d;
    }

    public final f4r getData() {
        return this.d;
    }
}
