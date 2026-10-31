package p;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g5k extends oqq0 implements Serializable {
    public final Comparator[] a;

    /* JADX WARN: Multi-variable type inference failed */
    public g5k(tfc tfcVar, tfc tfcVar2) {
        this.a = new Comparator[]{tfcVar, tfcVar2};
    }

    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5k) {
            return Arrays.equals(this.a, ((g5k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return l1d.n(Arrays.toString(this.a), ")", new StringBuilder("Ordering.compound("));
    }
}
