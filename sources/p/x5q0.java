package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x5q0 extends a6q0 {
    public static final Parcelable.Creator<x5q0> CREATOR = new qxp0((byte) 9);
    public final int a;
    public final int b;
    public final jnt c;
    public final izn0 d;

    public x5q0(int i, int i2, jnt jntVar, izn0 izn0Var) {
        this.a = i;
        this.b = i2;
        this.c = jntVar;
        this.d = izn0Var;
    }

    public final jnt a() {
        return this.c;
    }

    public final izn0 b() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5q0)) {
            return false;
        }
        x5q0 x5q0Var = (x5q0) obj;
        return this.a == x5q0Var.a && this.b == x5q0Var.b && u890.j(this.c, x5q0Var.c) && u890.j(this.d, x5q0Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
    }
}
