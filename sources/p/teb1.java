package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class teb1 implements hk90 {
    public final /* synthetic */ byte a;
    public final String b;
    public final String c;
    public final yd91 d;
    public final Object e;
    public final m381 f;

    public teb1(String str, nm1 nm1Var, String str2) {
        this.a = (byte) 1;
        this.b = str;
        this.e = nm1Var;
        this.c = str2;
        this.d = new yd91(3, new gga1(this, (byte) 21));
        this.f = new r2a1(this);
    }

    @Override // p.pk90
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                return this.f;
            default:
                return (r2a1) this.f;
        }
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public teb1(hw2 hw2Var, String str, String str2) {
        this.a = (byte) 0;
        this.e = hw2Var;
        this.b = str;
        this.c = str2;
        this.d = new yd91(3, new gga1(this, (byte) 20));
        this.f = new hp91(this);
    }
}
