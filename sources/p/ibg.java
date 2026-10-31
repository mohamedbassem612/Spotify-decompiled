package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ibg {
    public final List a;
    public final int[] b;

    public ibg(List list) {
        this.a = list;
        int[] iArr = new int[list.size() + 1];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i2] = iArr[i] + ((dbg) it.next()).b;
            i = i2;
        }
        this.b = iArr;
    }

    public final tr80 a(int i, tr80 tr80Var) {
        int i2 = this.b[i];
        return new tr80(((rr80) tr80Var).a - i2, ((rr80) tr80Var).b - i2, 1);
    }

    public final int b(int i) {
        return this.b[i];
    }

    public final List c() {
        return this.a;
    }

    public final int d() {
        int[] iArr = this.b;
        return iArr[iArr.length - 1];
    }

    public final hbg e(int i) {
        if (i < 0 || i >= d()) {
            return null;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int iF = l1d.f(length, i2, 2, i2);
            if (iArr[iF] > i) {
                length = iF;
            } else {
                i2 = iF + 1;
            }
        }
        int i3 = i2 - 1;
        return new hbg(i3, i - iArr[i3]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibg) && this.a.equals(((ibg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
