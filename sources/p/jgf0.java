package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jgf0 implements Parcelable {
    public static final Parcelable.Creator<jgf0> CREATOR = new j7f0((byte) 14);
    public final z771 a;
    public final int b;
    public final s1f1 c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final String g;

    public jgf0(z771 z771Var, int i, s1f1 s1f1Var, boolean z, boolean z2, long j, String str) {
        this.a = z771Var;
        this.b = i;
        this.c = s1f1Var;
        this.d = z;
        this.e = z2;
        this.f = j;
        this.g = str;
    }

    public static jgf0 a(jgf0 jgf0Var, String str) {
        return new jgf0(jgf0Var.a, jgf0Var.b, jgf0Var.c, jgf0Var.d, jgf0Var.e, jgf0Var.f, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgf0)) {
            return false;
        }
        jgf0 jgf0Var = (jgf0) obj;
        return u890.j(this.a, jgf0Var.a) && this.b == jgf0Var.b && u890.j(this.c, jgf0Var.c) && this.d == jgf0Var.d && this.e == jgf0Var.e && this.f == jgf0Var.f && u890.j(this.g, jgf0Var.g);
    }

    public final int hashCode() {
        int iF = cy30.f(xcg1.g(xcg1.g((this.c.hashCode() + kaa0.f(this.b, this.a.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), this.f, 31);
        String str = this.g;
        return iF + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
    }
}
