package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y5q0 extends a6q0 {
    public static final Parcelable.Creator<y5q0> CREATOR = new qxp0((byte) 10);
    public final u7q0 a;
    public final jnt b;
    public final izn0 c;
    public final int d;
    public final boolean e;

    public y5q0(u7q0 u7q0Var, jnt jntVar, izn0 izn0Var, int i) {
        this.a = u7q0Var;
        this.b = jntVar;
        this.c = izn0Var;
        this.d = i;
        this.e = i == 3;
    }

    public final jnt a() {
        return this.b;
    }

    public final izn0 b() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5q0)) {
            return false;
        }
        y5q0 y5q0Var = (y5q0) obj;
        return u890.j(this.a, y5q0Var.a) && u890.j(this.b, y5q0Var.b) && u890.j(this.c, y5q0Var.c) && this.d == y5q0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + xvj1.j(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        this.a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        int i2 = this.d;
        if (i2 == 1) {
            str = "USER_STATUS_ACTIVE";
        } else if (i2 == 2) {
            str = "USER_STATUS_DISABLED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "USER_STATUS_NOT_ACCEPTED";
        }
        parcel.writeString(str);
    }
}
