package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q8d1 extends w8d1 {
    public static final Parcelable.Creator<q8d1> CREATOR = new pxc1((byte) 19);
    public final String a;
    public final boolean b;
    public final String c;
    public final int d;

    public q8d1(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = i;
    }

    public final String a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8d1)) {
            return false;
        }
        q8d1 q8d1Var = (q8d1) obj;
        return u890.j(this.a, q8d1Var.a) && this.b == q8d1Var.b && u890.j(this.c, q8d1Var.c) && this.d == q8d1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        if (this.d != 1) {
            throw null;
        }
        parcel.writeString("COVER_CREATION");
    }
}
