package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z2q implements cl4 {
    public final /* synthetic */ byte a;
    public final dl4 b;

    public /* synthetic */ z2q(daq daqVar, dl4 dl4Var, byte b) {
        this.a = b;
        this.b = dl4Var;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        teq teqVar = this.b;
        switch (b) {
            case 0:
                return new l0q(teqVar);
            default:
                return new i6b((v5q) teqVar, (byte) 27);
        }
    }
}
