package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class efa0 {
    public static final List a = p7h.M(new ffa0[]{new ffa0(141.39f, 142.4f, 124.78f, 59.19f, 0.0f, 0.5f, 43.69f, 4.8f, 34.1f, 13.4f, 25.8f, 24.2f, 18.4f, 34.6f, 12.8f, 46.7f, 7.6f, 58.0f, 4.0f, 70.9f, 1.35f, 82.7f, 0.5f, 95.7f, 1.98f, 106.7f, 6.4f, 116.4f, 15.1f, 120.6f, 22.4f, 123.4f, 30.3f, 124.2f, 38.7f, 121.5f, 46.6f, 112.2f, 54.1f, 99.4f, 57.7f, 85.0f, 58.69f), new ffa0(87.11f, 221.85f, 22.79f, 22.82f, -79.51f, 0.36f, 0.35f, 4.57f, 4.24f, 8.18f, 7.08f, 10.98f, 9.07f, 14.75f, 11.7f, 17.43f, 13.85f, 20.36f, 17.36f, 21.75f, 20.5f, 22.3f, 22.73f), new ffa0(121.58f, 319.45f, 89.66f, 36.57f, -15.0f, 0.5f, 9.56f, 10.3f, 4.6f, 18.3f, 1.85f, 26.76f, 0.5f, 35.2f, 1.34f, 43.0f, 4.68f, 49.8f, 9.8f, 55.8f, 15.8f, 61.7f, 21.95f, 68.0f, 27.7f, 75.1f, 32.3f, 83.1f, 35.3f, 89.16f, 36.07f)});
    public static final float[] b = {4.7f, 3.5f};
    public static final lit c = new lit(175.0f, 293.17f, 27.0f, 27.0f);
    public static final lit d = new lit(174.0f, 320.17f, 11.37f, 4.26f);
    public static final List e;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        e = p7h.M(new mmr0[]{new mmr0(fValueOf, Float.valueOf(1.79f)), new mmr0(Float.valueOf(23.87f), fValueOf), new mmr0(Float.valueOf(47.74f), Float.valueOf(1.53f))});
    }

    public static final tw4 a(ffa0 ffa0Var) {
        tw4 tw4VarA = ww4.a();
        ArrayList arrayList = ffa0Var.f;
        tw4VarA.k(Float.intBitsToFloat((int) (((Offset) o7h.q0(arrayList)).a >> 32)), Float.intBitsToFloat((int) (((Offset) o7h.q0(arrayList)).a & 4294967295L)));
        int iL = p7h.L(arrayList);
        int i = 1;
        while (i < iL) {
            long j = ((Offset) arrayList.get(i)).a;
            i++;
            long j2 = ((Offset) arrayList.get(i)).a;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            tw4VarA.a.quadTo(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), (Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2)) / 2.0f, (Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3)) / 2.0f);
        }
        tw4VarA.j(Float.intBitsToFloat((int) (((Offset) o7h.A0(arrayList)).a >> 32)), Float.intBitsToFloat((int) (((Offset) o7h.A0(arrayList)).a & 4294967295L)));
        return tw4VarA;
    }
}
