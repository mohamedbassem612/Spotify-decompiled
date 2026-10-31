package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w5q0 extends a6q0 {
    public static final Parcelable.Creator<w5q0> CREATOR = new qxp0((byte) 8);
    public final c380 a;
    public final String b;
    public final jnt c;
    public final izn0 d;

    public w5q0(c380 c380Var, String str, jnt jntVar, izn0 izn0Var) {
        this.a = c380Var;
        this.b = str;
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
        if (!(obj instanceof w5q0)) {
            return false;
        }
        w5q0 w5q0Var = (w5q0) obj;
        return u890.j(this.a, w5q0Var.a) && u890.j(this.b, w5q0Var.b) && u890.j(this.c, w5q0Var.c) && u890.j(this.d, w5q0Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itL = x0d.l(this.a, parcel);
        while (itL.hasNext()) {
            ((u7q0) itL.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
    }
}
