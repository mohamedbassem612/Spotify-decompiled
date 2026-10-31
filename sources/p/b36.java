package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b36 implements c36, g36 {
    public final /* synthetic */ byte a;

    public final float a() {
        switch (this.a) {
        }
        return 0.0f;
    }

    public final void b(wat watVar, int i, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                h36.a(i, iArr, iArr2, false);
                break;
            case 1:
                h36.b(i, iArr, iArr2, false);
                break;
            case 2:
                h36.c(i, iArr, iArr2, false);
                break;
            default:
                h36.d(i, iArr, iArr2, false);
                break;
        }
    }

    public final void e(wat watVar, int i, int[] iArr, flb0 flb0Var, int[] iArr2) {
        byte b = this.a;
        flb0 flb0Var2 = flb0.a;
        switch (b) {
            case 0:
                if (flb0Var != flb0Var2) {
                    h36.a(i, iArr, iArr2, true);
                } else {
                    h36.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (flb0Var != flb0Var2) {
                    h36.b(i, iArr, iArr2, true);
                } else {
                    h36.b(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (flb0Var != flb0Var2) {
                    h36.c(i, iArr, iArr2, true);
                } else {
                    h36.c(i, iArr, iArr2, false);
                }
                break;
            default:
                if (flb0Var != flb0Var2) {
                    h36.d(i, iArr, iArr2, true);
                } else {
                    h36.d(i, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
