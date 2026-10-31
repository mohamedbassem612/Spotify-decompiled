package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ayc extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zxc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ayc(zxc zxcVar, byte b) {
        super(1);
        this.a = b;
        this.b = zxcVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zxc zxcVar = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).a(zxcVar.d);
            default:
                b261.n((e261) obj, zxcVar.f);
                return rih1.a;
        }
    }
}
