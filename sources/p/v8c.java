package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v8c extends z1i {
    public final /* synthetic */ byte c;
    public final kr61 d;
    public final hab0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8c(u0i u0iVar, kr61 kr61Var, byte b) {
        super(u0iVar);
        this.c = b;
        switch (b) {
            case 1:
                super(u0iVar);
                this.d = kr61Var;
                this.e = new wcf1(this, (byte) 19);
                break;
            default:
                this.d = kr61Var;
                this.e = new cka(this, (byte) 12);
                break;
        }
    }

    @Override // p.z1i
    public final vu30 a() {
        byte b = this.c;
        wcf1 wcf1Var = this.e;
        switch (b) {
            case 0:
                return (cka) wcf1Var;
            default:
                return wcf1Var;
        }
    }

    @Override // p.z1i
    public final iu30 b() {
        switch (this.c) {
            case 0:
                return iub.P0;
            default:
                return ppg1.Y0;
        }
    }
}
