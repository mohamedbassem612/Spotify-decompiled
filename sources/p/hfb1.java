package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hfb1 implements zk90 {
    public final boolean a;
    public final yd91 c;
    public final bpb1 b = gio1.b(b7x.a);
    public final n381 d = p381.a;

    public hfb1(yrq yrqVar, vbs vbsVar) {
        this.a = vbsVar.g;
        this.c = new yd91(3, new k7a1(yrqVar, this, (byte) 10));
    }

    @Override // p.pk90
    public final boolean a() {
        return true;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.d;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.c;
    }
}
