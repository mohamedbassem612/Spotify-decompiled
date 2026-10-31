package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class peb1 implements hk90 {
    public final String a;
    public final nm1 b;
    public final String c;
    public final kmj1 d;
    public final yd91 e = new yd91(3, new gga1(this, (byte) 19));
    public final esa1 f = new esa1(this);

    public peb1(String str, nm1 nm1Var, String str2, kmj1 kmj1Var) {
        this.a = str;
        this.b = nm1Var;
        this.c = str2;
        this.d = kmj1Var;
    }

    @Override // p.pk90
    public final boolean a() {
        return true;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.f;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.e;
    }
}
