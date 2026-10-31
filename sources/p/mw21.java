package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mw21 implements lw21 {
    public final qfm0 a;
    public final ne b;
    public final za00 c;
    public final jm5 d;
    public final v1k e;
    public final xpv0 f;
    public final dg8 g;
    public final tpb h;
    public volatile Set i;
    public Integer t;

    public mw21(qfm0 qfm0Var, ne neVar, za00 za00Var, h2x0 h2x0Var, jm5 jm5Var) {
        this.a = qfm0Var;
        this.b = neVar;
        this.c = za00Var;
        this.d = jm5Var;
        v1k v1kVar = new v1k(neVar);
        this.e = v1kVar;
        this.f = h2x0Var.a();
        this.g = new dg8(v1kVar, (byte) 8);
        this.h = new tpb(neVar);
        this.i = w7x.a;
    }

    @Override // p.lw21
    public final Single a() {
        ne neVar = this.b;
        neVar.getClass();
        return Single.fromCallable(new w0c1(neVar, (byte) 0)).subscribeOn(Schedulers.c);
    }

    @Override // p.lw21
    public final xpv0 b() {
        return this.f;
    }

    @Override // p.lw21
    public final m67 c(String str, String str2) {
        if (u890.j(this.a, mfm0.a)) {
            eg.m("Not possible for UnAuthResolver");
            return null;
        }
        svz0 svz0Var = svz0.d;
        m67 m67Var = (m67) this.e.l("esperanto").b.get(ulc.o(str, str2));
        return m67Var == null ? l67.a() : m67Var;
    }

    @Override // p.lw21
    public final void clear() {
        v1k v1kVar = this.e;
        v1kVar.d();
        v1kVar.t();
    }

    @Override // p.lw21
    public final void d() {
        rgp0 rgp0VarG;
        mmr0 mmr0VarA = this.e.a();
        svz0 svz0Var = (svz0) mmr0VarA.a;
        tvz0 tvz0VarA = (tvz0) mmr0VarA.b;
        jm5 jm5Var = this.d;
        if (jm5Var instanceof nw21) {
            rgp0VarG = rc2.G(svz0Var, ((nw21) jm5Var).d);
            this.i = rgp0VarG.a();
        } else {
            rgp0VarG = null;
        }
        if (rgp0VarG != null) {
            tvz0VarA = tvz0.a(tvz0VarA, rgp0VarG.b(), 13);
        }
        int iHashCode = tvz0.a(tvz0VarA, null, 11).hashCode();
        if ((!(this.d instanceof nw21) || tvz0VarA.b.isEmpty()) && !(this.d instanceof ow21)) {
            return;
        }
        Integer num = this.t;
        if (num != null && iHashCode == num.intValue()) {
            return;
        }
        this.c.b(tvz0VarA);
        this.t = Integer.valueOf(iHashCode);
    }

    @Override // p.luk
    public final pdy0 e(ydy0 ydy0Var) {
        int iV0;
        String name = ydy0Var.getClass().getName();
        int iA0 = ihc1.A0(name, '.', 0, 6);
        return rc2.J(this.e.l((iA0 < 0 || (iV0 = ihc1.v0(name, '$', iA0, 4)) < 0) ? null : name.substring(iA0 + 1, iV0)), ydy0Var);
    }

    @Override // p.lw21
    public final Single f(byte[] bArr, byte[] bArr2) {
        if (!u890.j(this.a, mfm0.a)) {
            return Single.fromCallable(new wra(this, bArr2, bArr, (byte) 5));
        }
        eg.m("Not possible for UnAuthResolver");
        return null;
    }

    @Override // p.lw21
    public final boolean g(byte[] bArr) {
        if (!u890.j(this.a, mfm0.a)) {
            return this.g.q(bArr);
        }
        eg.m("Not possible for UnAuthResolver");
        return false;
    }

    public /* synthetic */ mw21(qfm0 qfm0Var, ne neVar, za00 za00Var) {
        this(qfm0Var, neVar, za00Var, h2x0.h, ow21.d);
    }
}
