package p;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class bf91 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final ze91 a(ze91 ze91Var) throws KotlinNothingValueException {
        if (!(ze91Var instanceof ze91)) {
            ze91Var = null;
        }
        if (ze91Var != null) {
            return ze91Var;
        }
        g0k.b("Inconsistent composition");
        jah.d();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((s340) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iQ = u890.q(i5, i);
            if (iQ < 0) {
                i3 = i4 + 1;
            } else {
                if (iQ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
