package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class egx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ufx b;

    public /* synthetic */ egx(ufx ufxVar, byte b) {
        this.a = b;
        this.b = ufxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        ufx ufxVar = this.b;
        switch (b) {
            case 0:
                return new yir(ufxVar.a, ufxVar.b, (byte) 2);
            case 1:
                if (l0iVar == null) {
                    return new fcs(ufxVar.a, ufxVar.b, (byte) 13);
                }
                bhn0.d();
                return null;
            case 2:
                return w3p1.r(ufxVar, uii.a);
            case 3:
                return w3p1.r(ufxVar, vii.a);
            case 4:
                if (l0iVar == null) {
                    return new odr(ufxVar.a, ufxVar.b, (byte) 7);
                }
                bhn0.d();
                return null;
            default:
                if (l0iVar == null) {
                    return new eos(ufxVar.a, (byte) 7);
                }
                bhn0.d();
                return null;
        }
    }
}
