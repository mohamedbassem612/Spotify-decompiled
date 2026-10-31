package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p850 implements Parcelable {
    public static final Parcelable.Creator<p850> CREATOR = new n750((byte) 5);
    public final v850 a;
    public final Integer b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final b8w g;

    public p850(v850 v850Var, Integer num, boolean z, String str, boolean z2, boolean z3, b8w b8wVar) {
        this.a = v850Var;
        this.b = num;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = z3;
        this.g = b8wVar;
    }

    public static p850 a(p850 p850Var, boolean z, boolean z2, b8w b8wVar, int i) {
        v850 v850Var = p850Var.a;
        Integer num = p850Var.b;
        boolean z3 = p850Var.c;
        String str = p850Var.d;
        if ((i & 16) != 0) {
            z = p850Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = p850Var.f;
        }
        return new p850(v850Var, num, z3, str, z4, z2, b8wVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p850)) {
            return false;
        }
        p850 p850Var = (p850) obj;
        return this.a == p850Var.a && u890.j(this.b, p850Var.b) && this.c == p850Var.c && u890.j(this.d, p850Var.d) && this.e == p850Var.e && this.f == p850Var.f && u890.j(this.g, p850Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.g.hashCode() + xcg1.g(xcg1.g(cy30.d(xcg1.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, i);
    }
}
