package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class id40 implements Parcelable {
    public static final Parcelable.Creator<id40> CREATOR = new xt30((byte) 24);
    public final hd40 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public id40(hd40 hd40Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = hd40Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static id40 a(id40 id40Var, hd40 hd40Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            hd40Var = id40Var.a;
        }
        hd40 hd40Var2 = hd40Var;
        if ((i & 2) != 0) {
            z = id40Var.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = id40Var.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = id40Var.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = id40Var.e;
        }
        id40Var.getClass();
        return new id40(hd40Var2, z5, z6, z7, z4);
    }

    public final hd40 b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id40)) {
            return false;
        }
        id40 id40Var = (id40) obj;
        return u890.j(this.a, id40Var.a) && this.b == id40Var.b && this.c == id40Var.c && this.d == id40Var.d && this.e == id40Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
