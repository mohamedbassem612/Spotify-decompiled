package p;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tes0 extends ses0 {
    public final BitSet f;
    public int[] g;
    public int h;

    public tes0(int i) {
        super(i, new jh5[i], new k3r[i]);
        this.f = new BitSet(i);
        this.g = new int[i < 1 ? 1 : i];
    }

    public final void e(int i) {
        BitSet bitSet = this.f;
        if (bitSet.get(i)) {
            return;
        }
        bitSet.set(i);
        int i2 = this.h;
        int[] iArrCopyOf = this.g;
        if (i2 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.g = iArrCopyOf;
        }
        int i3 = this.h;
        this.h = i3 + 1;
        iArrCopyOf[i3] = i;
    }

    public final boolean f(int i) {
        return this.f.get(i);
    }

    public final void j(long j) {
        int i = (int) j;
        while (true) {
            int i2 = this.h;
            if (i2 <= i) {
                return;
            }
            int[] iArr = this.g;
            int i3 = i2 - 1;
            this.h = i3;
            this.f.clear(iArr[i3]);
        }
    }

    public final long l() {
        return this.h;
    }

    public final void m() {
        this.f.clear();
        this.h = 0;
    }
}
