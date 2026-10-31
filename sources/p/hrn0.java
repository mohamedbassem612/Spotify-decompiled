package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hrn0 extends irn0 {
    public final Class a;
    public final Parcelable b;
    public final e6w0 c;

    public hrn0(Class cls, Parcelable parcelable, e6w0 e6w0Var) {
        this.a = cls;
        this.b = parcelable;
        this.c = e6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrn0)) {
            return false;
        }
        hrn0 hrn0Var = (hrn0) obj;
        return u890.j(this.a, hrn0Var.a) && u890.j(this.b, hrn0Var.b) && u890.j(this.c, hrn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
