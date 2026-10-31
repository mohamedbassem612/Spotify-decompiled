package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x0t implements xpw {
    public final vas a;
    public final rey0 b = new rey0(new b1s(this, (byte) 24));
    public final ia00 c = n3o1.q(this).a(v0t.d, v0t.e);
    public final psw d;

    public x0t(vas vasVar) {
        this.a = vasVar;
        j2i j2iVar = ysj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static hr3 e(otl otlVar, boolean z) {
        if (otlVar instanceof d6c0) {
            return z ? new yp3((d6c0) otlVar) : new xp3((d6c0) otlVar);
        }
        if (otlVar instanceof vod1) {
            return z ? new fr3((vod1) otlVar) : new er3((vod1) otlVar);
        }
        eg.o();
        return null;
    }

    public static otl f(pix pixVar) {
        Set set = s4b1.f;
        return uic.j(pixVar.b(), e6k.e) ? new vod1(0, pixVar.b(), pixVar.c()) : iro1.n(pixVar.b(), z6x.a);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
