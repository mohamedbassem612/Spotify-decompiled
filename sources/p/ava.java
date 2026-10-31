package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ava {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public ava(int... iArr) {
        List listL1;
        this.a = iArr;
        Integer numM0 = f46.m0(0, iArr);
        this.b = numM0 != null ? numM0.intValue() : -1;
        Integer numM1 = f46.m0(1, iArr);
        this.c = numM1 != null ? numM1.intValue() : -1;
        Integer numM2 = f46.m0(2, iArr);
        this.d = numM2 != null ? numM2.intValue() : -1;
        if (iArr.length <= 3) {
            listL1 = z6x.a;
        } else {
            if (iArr.length > 1024) {
                hhg1.n(l1d.o(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listL1 = o7h.l1(new f7(new g46(iArr), 3, iArr.length));
        }
        this.e = listL1;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        ava avaVar = (ava) obj;
        return this.b == avaVar.b && this.c == avaVar.c && this.d == avaVar.d && this.e.equals(avaVar.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : o7h.y0(arrayList, ".", (String) null, (String) null, (iu30) null, 62);
    }
}
