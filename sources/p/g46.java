package p;

import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g46 extends g7 implements RandomAccess {
    public final /* synthetic */ int[] a;

    public g46(int[] iArr) {
        this.a = iArr;
    }

    public final int b() {
        return this.a.length;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return f46.L(this.a, ((Number) obj).intValue());
    }

    public final Object get(int i) {
        return Integer.valueOf(this.a[i]);
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return f46.o0(((Number) obj).intValue(), this.a);
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            int[] iArr = this.a;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        }
        return -1;
    }
}
