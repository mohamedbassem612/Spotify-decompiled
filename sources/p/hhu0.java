package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hhu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r0s0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhu0(r0s0 r0s0Var, byte b) {
        super(1);
        this.a = b;
        this.b = r0s0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        r0s0 r0s0Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((jhu0) obj).ordinal();
                if (iOrdinal == 0) {
                    return new dhu0(((yqg) r0s0Var.c).b());
                }
                if (iOrdinal == 1) {
                    return chu0.a;
                }
                if (iOrdinal == 2) {
                    return chu0.b;
                }
                eg.o();
                return null;
            default:
                di4 di4Var = (di4) r0s0Var.d;
                zfx zfxVar = (zfx) r0s0Var.b;
                boolean zT = di4Var.t();
                wfx wfxVar = zfxVar.b;
                return new mfs(wfxVar.b, wfxVar.a, zT);
        }
    }
}
