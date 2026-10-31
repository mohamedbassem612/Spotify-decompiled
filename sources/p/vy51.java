package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vy51 {
    public static final le5 a = new le5(Float.NaN, Float.NaN);
    public static final tzg1 b = new tzg1(new cix0((byte) 13), new cix0((byte) 14));
    public static final long c;
    public static final n8b1 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new n8b1(new Offset(jFloatToRawIntBits), 3);
    }
}
