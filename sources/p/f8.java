package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f8 {
    public static final lit a = new lit(24.0f, 304.0f, 23.75f, 23.75f);
    public static final lit b = new lit(22.0f, 328.0f, 11.37f, 4.26f);
    public static final List c = p7h.M(new sr31[]{a(11.06f, 156.3f, 215.96f, 0.0f, 0.0f, 129.7f, 76.83f), a(11.06f, 155.12f, 176.39f, 0.0f, 38.25f, 66.25f, 0.0f, 68.55f, 22.43f, 94.79f, 7.47f), a(10.55f, 1.83f, 245.29f, 0.0f, 0.0f, 143.67f, 100.71f, 217.67f, 45.71f), a(12.07f, -122.0f, 272.67f, 162.13f, 0.0f, 130.01f, 18.54f, 107.12f, 1.76f, 0.0f, 62.49f), a(10.55f, 2.0f, 205.54f, 0.0f, 39.96f, 53.0f, 10.96f, 84.15f, 31.13f, 137.0f, -0.04f), a(5.28f, 33.2f, 205.5f, 105.8f, 0.0f, 148.8f, 25.5f, 73.42f, 72.45f, 99.65f, 89.16f, 15.13f, 137.96f, 0.0f, 129.22f)});

    public static final sr31 a(float f, float f2, float f3, float... fArr) {
        return new sr31(f, o7h.t1(f46.N0(fArr), 2, 2, true, new e8(f2, f3, (byte) 0)));
    }

    public static final tw4 b(sr31 sr31Var) {
        tw4 tw4VarA = ww4.a();
        ArrayList arrayList = sr31Var.b;
        tw4VarA.k(Float.intBitsToFloat((int) (((Offset) o7h.q0(arrayList)).a >> 32)), Float.intBitsToFloat((int) (((Offset) o7h.q0(arrayList)).a & 4294967295L)));
        Iterator it = o7h.k0(arrayList, 1).iterator();
        while (it.hasNext()) {
            long j = ((Offset) it.next()).a;
            tw4VarA.j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return tw4VarA;
    }
}
