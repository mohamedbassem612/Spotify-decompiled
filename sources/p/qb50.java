package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qb50 implements Parcelable {
    public static final Parcelable.Creator<qb50> CREATOR = new n750((byte) 14);
    public final p950 a;
    public final String b;
    public final v850 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public qb50(p950 p950Var, String str, v850 v850Var, boolean z, boolean z2, boolean z3) {
        this.a = p950Var;
        this.b = str;
        this.c = v850Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static qb50 a(qb50 qb50Var, boolean z, boolean z2, boolean z3, int i) {
        p950 p950Var = qb50Var.a;
        String str = qb50Var.b;
        v850 v850Var = qb50Var.c;
        if ((i & 8) != 0) {
            z = qb50Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = qb50Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = qb50Var.f;
        }
        return new qb50(p950Var, str, v850Var, z4, z5, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb50)) {
            return false;
        }
        qb50 qb50Var = (qb50) obj;
        return u890.j(this.a, qb50Var.a) && u890.j(this.b, qb50Var.b) && this.c == qb50Var.c && this.d == qb50Var.d && this.e == qb50Var.e && this.f == qb50Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
