package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j1b implements fv50 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final huz c;
    public final ke71 d;
    public final Object e;

    public j1b(z1p z1pVar) {
        this.a = (byte) 0;
        this.e = z1pVar;
        this.c = new huz(Boolean.TRUE, (byte) 10);
        this.d = o381.a;
        this.b = new yd91(3, new vv8(this, (byte) 15));
    }

    @Override // p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.d;
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        byte b = this.a;
        return this.c;
    }

    public j1b(res resVar) {
        this.a = (byte) 3;
        this.e = resVar;
        this.b = new yd91(3, new pdp0(this, (byte) 6));
        this.c = new huz(Boolean.TRUE, (byte) 10);
        this.d = o381.a;
    }

    public j1b(aqp aqpVar) {
        this.a = (byte) 1;
        this.e = aqpVar;
        this.b = new yd91(3, new nzb0(this, (byte) 23));
        this.c = new huz(Boolean.TRUE, (byte) 10);
        this.d = o381.a;
    }

    public j1b(ikp ikpVar) {
        this.a = (byte) 2;
        this.e = ikpVar;
        this.b = new yd91(3, new nzb0(this, (byte) 24));
        this.c = new huz(Boolean.TRUE, (byte) 10);
        this.d = o381.a;
    }
}
