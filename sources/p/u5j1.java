package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u5j1 implements hw61 {
    public static final u5j1 b = new u5j1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ u5j1(byte b2) {
        this.a = b2;
    }

    @Override // p.hw61
    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        switch (this.a) {
            case 0:
                float fI0 = watVar.i0(30.0f);
                return new itq0(new n511(-fI0, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fI0, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new itq0(anm1.g(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
