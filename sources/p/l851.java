package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l851 {
    public final String a;
    public final Parcelable b;

    public l851(String str, Parcelable parcelable) {
        this.a = str;
        this.b = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l851)) {
            return false;
        }
        l851 l851Var = (l851) obj;
        return u890.j(this.a, l851Var.a) && this.b.equals(l851Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
