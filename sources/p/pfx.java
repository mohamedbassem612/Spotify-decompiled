package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pfx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ufx b;

    public /* synthetic */ pfx(ufx ufxVar, byte b) {
        this.a = b;
        this.b = ufxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        ufx ufxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new imr(ufxVar.a);
                }
                bhn0.d();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new srr(ufxVar.a, ufxVar.b);
                }
                bhn0.d();
                return null;
            case 2:
                if (l0iVar == null) {
                    return new lkr(ufxVar.a, (byte) 1);
                }
                bhn0.d();
                return null;
            default:
                if (l0iVar == null) {
                    return new yir(ufxVar.a, (byte) 16);
                }
                bhn0.d();
                return null;
        }
    }
}
