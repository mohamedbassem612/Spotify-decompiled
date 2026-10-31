package p;

import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mnv implements xpw {
    public static final String d = nik1.J0.a;
    public final e7m0 a;
    public final psw b;
    public final ia00 c;

    public mnv(a aVar) {
        jkv jkvVar = jkv.d1;
        t2m t2mVar = t2m.k;
        this.a = new e7m0(jkvVar, new dq7(t2mVar, (byte) 21), aVar, fdv.i, new cas());
        j2i j2iVar = qki.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.c = n3o1.q(this).a(lnv.b, lnv.c);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
