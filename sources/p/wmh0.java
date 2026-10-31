package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wmh0 implements xpw {
    public final lzn0 a;
    public final q9i0 b;
    public final kt91 c;
    public final q8n d;
    public uvk0 f;
    public final psw h;
    public final js20 e = x3p1.n(new vmh0(this, (byte) 0), new z8b0(this, (byte) 17), bzg0.Y0, (o8n) null, new vmh0(this, (byte) 1), 8);
    public final u7h1 g = eth.a0((vu30) null, new otf0(this, (byte) 17), 1);

    public wmh0(lzn0 lzn0Var, q9i0 q9i0Var, kt91 kt91Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = q9i0Var;
        this.c = kt91Var;
        this.d = q8nVar;
        j2i j2iVar = a0j.a;
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public static boolean e(pmh0 pmh0Var) {
        ppl pplVar = pmh0Var.c;
        return nhc1.Y(pplVar.a, "spotify:ugcimage:", false) || nhc1.Y(pplVar.a, "spotify:ugcvideo:", false);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
