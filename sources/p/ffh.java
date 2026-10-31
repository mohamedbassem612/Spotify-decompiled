package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ffh implements wpw {
    public static final List X = p7h.M(tuw.c, tuw.f, tuw.g);
    public final i8h1 a;
    public final tmh b;
    public final jqh c;
    public final vlh d;
    public final iwe1 f;
    public dxk0 g;
    public final vku e = new vku();
    public final rey0 h = new rey0(new okg(this, (byte) 8));
    public final ia00 i = n3o1.q(this).a(new cfh(this, (byte) 0), a8h.c);
    public final nsw t = jch0.j(new cfh(this, (byte) 1));

    public ffh(muz muzVar, i8h1 i8h1Var, ruz ruzVar, iwp iwpVar, tmh tmhVar, jqh jqhVar, vlh vlhVar) {
        this.a = i8h1Var;
        this.b = tmhVar;
        this.c = jqhVar;
        this.d = vlhVar;
        this.f = iwpVar.a(ruzVar, muzVar, "comment-card-timestamp", mno1.r);
    }

    public final rqw a() {
        return this.i;
    }

    public final rsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
