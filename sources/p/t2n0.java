package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t2n0 implements zk90 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final m381 c;

    public t2n0(fsq fsqVar) {
        this.a = (byte) 2;
        this.b = new yd91(3, new k7a1(fsqVar, this, (byte) 17));
        this.c = new aa3((byte) 6);
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                return (r2n0) this.c;
            case 1:
                return (n4n0) this.c;
            default:
                return (aa3) this.c;
        }
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public t2n0(gtp gtpVar) {
        this.a = (byte) 0;
        this.b = new yd91(3, new s2n0((Object) gtpVar, (Object) this, (byte) 0));
        this.c = new r2n0();
    }

    public t2n0(ktp ktpVar) {
        this.a = (byte) 1;
        this.b = new yd91(3, new s2n0((Object) ktpVar, (Object) this, (byte) 3));
        this.c = new n4n0((byte) 0);
    }
}
