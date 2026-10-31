package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class e3p1 {
    public Object[] a;
    public int b;
    public boolean c;

    public static int c(int i, int i2) {
        if (i2 < 0) {
            hhg1.n("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public final void a(Object obj) {
        int length = this.a.length;
        int iC = c(length, this.b + 1);
        if (iC > length || this.c) {
            this.a = Arrays.copyOf(this.a, iC);
            this.c = false;
        }
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public abstract g4p1 b(Object obj);
}
