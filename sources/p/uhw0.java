package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uhw0 implements zhw0 {
    public final int a;
    public final Parcelable b;

    public uhw0(int i, Parcelable parcelable) {
        this.a = i;
        this.b = parcelable;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhw0)) {
            return false;
        }
        uhw0 uhw0Var = (uhw0) obj;
        return this.a == uhw0Var.a && this.b.equals(uhw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
