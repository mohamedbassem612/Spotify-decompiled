package p;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ko20 {
    public final SparseBooleanArray a;

    public ko20(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        dm5.q(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ko20) {
            return this.a.equals(((ko20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
