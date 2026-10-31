package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tgp0 implements lw21, luk {
    public final /* synthetic */ mw21 a;
    public final sz11 b;
    public final idd1 c;

    public tgp0(pz11 pz11Var, lmw lmwVar, xav0 xav0Var, sz11 sz11Var, ne neVar) {
        h2x0 h2x0Var = h2x0.h;
        this.a = new mw21(efm0.a, neVar, new aq80(lmwVar, pz11Var, xav0Var, (byte) 0), h2x0Var, new nw21(pz11.b));
        this.b = sz11Var;
        this.c = new idd1(new pdp0(this, (byte) 2));
    }

    @Override // p.lw21
    public final Single a() {
        return this.a.a();
    }

    @Override // p.lw21
    public final xpv0 b() {
        return this.a.f;
    }

    @Override // p.lw21
    public final m67 c(String str, String str2) {
        return this.a.c(str, str2);
    }

    @Override // p.lw21
    public final void clear() {
        this.a.clear();
    }

    @Override // p.lw21
    public final void d() {
        this.a.d();
    }

    @Override // p.luk
    public final pdy0 e(ydy0 ydy0Var) {
        return this.a.e(ydy0Var);
    }

    @Override // p.lw21
    public final Single f(byte[] bArr, byte[] bArr2) {
        return this.a.f(bArr, bArr2);
    }

    @Override // p.lw21
    public final boolean g(byte[] bArr) {
        return this.a.g(bArr);
    }

    public final Observable h() {
        return (Observable) this.c.getValue();
    }

    public final boolean i(String str) {
        mw21 mw21Var = this.a;
        jm5 jm5Var = mw21Var.d;
        if (jm5Var instanceof ow21) {
            return false;
        }
        if (!(jm5Var instanceof nw21)) {
            eg.o();
            return false;
        }
        boolean zContains = mw21Var.i.contains(str);
        if (!zContains) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.v("Ignoring the mid session updates for the property " + str + " due to mix and match of the observable and non observable properties in EP. Treating it as a non-observable property to ensure consistency", new Object[0]);
        }
        return zContains;
    }
}
