package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ygo0 extends a6t {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ygo0(qx81 qx81Var, byte b) {
        super(qx81Var);
        this.c = b;
    }

    @Override // p.z5t
    public final z5t E0(qx81 qx81Var) {
        switch (this.c) {
            case 0:
                return new ygo0(qx81Var, (byte) 0);
            default:
                return new ygo0(qx81Var, (byte) 1);
        }
    }

    @Override // p.z5t, p.a8b0
    public final boolean u0() {
        switch (this.c) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
