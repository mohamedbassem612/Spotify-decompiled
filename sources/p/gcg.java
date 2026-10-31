package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gcg implements hw61 {
    public static final gcg b = new gcg(0);
    public static final gcg c = new gcg(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ gcg(byte b2) {
        this.a = b2;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        switch (this.a) {
            case 0:
                float fE = Size.e(j) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fE)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fE)));
                return new jtq0(ila0.f(anm1.g(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
            default:
                float fI0 = watVar.i0(30.0f);
                return new itq0(new n511(0.0f, -fI0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fI0));
        }
    }
}
