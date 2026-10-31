package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t8x implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tfx b;

    public /* synthetic */ t8x(tfx tfxVar, byte b) {
        this.a = b;
        this.b = tfxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        tfx tfxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new ver(tfxVar.a, (byte) 6);
                }
                bhn0.d();
                return null;
            case 1:
                return new h98(tfxVar.a, (byte) 5);
            case 2:
                if (l0iVar == null) {
                    return new h98(tfxVar.a, (byte) 2);
                }
                bhn0.d();
                return null;
            case 3:
                return new nzj(tfxVar.a);
            case 4:
                if (l0iVar == null) {
                    return new ver(tfxVar.a, (byte) 7);
                }
                bhn0.d();
                return null;
            case 5:
                if (l0iVar == null) {
                    return new fcs(tfxVar.a, tfxVar.b, (byte) 10);
                }
                bhn0.d();
                return null;
            default:
                return new h98(tfxVar.a, (byte) 8);
        }
    }
}
