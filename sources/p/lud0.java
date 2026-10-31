package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lud0 implements nkf1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ lud0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.nkf1
    public final mkf1 a() {
        switch (this.a) {
            case 0:
                return new z8c0((Object) this, (byte) 5);
            case 1:
                return new eea0(this, (byte) 29);
            case 2:
                return new h5a1(this, (byte) 4);
            default:
                return new owf1(this, (byte) 1);
        }
    }
}
