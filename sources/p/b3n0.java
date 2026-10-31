package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b3n0 implements al90 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final m381 c;

    public b3n0(htp htpVar) {
        this.a = (byte) 0;
        this.b = new yd91(3, new s2n0(htpVar, this, (byte) 1));
        this.c = new aa3((byte) 2);
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                return (aa3) this.c;
            default:
                return (jsm) this.c;
        }
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public b3n0(mtp mtpVar) {
        this.a = (byte) 1;
        this.b = new yd91(3, new s2n0(mtpVar, this, (byte) 4));
        this.c = new jsm();
    }
}
