package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class keh1 implements lw21, feh1 {
    public final /* synthetic */ mw21 a;

    public keh1(pz11 pz11Var, lmw lmwVar, xav0 xav0Var, ne neVar) {
        this.a = new mw21(mfm0.a, neVar, new aq80(lmwVar, pz11Var, xav0Var, (byte) 1));
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
}
