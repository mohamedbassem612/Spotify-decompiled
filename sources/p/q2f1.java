package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q2f1 implements Parcelable {
    public static final Parcelable.Creator<q2f1> CREATOR = new lse1((byte) 25);
    public final String a;
    public final Integer b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public q2f1(String str, Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = num;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2f1)) {
            return false;
        }
        q2f1 q2f1Var = (q2f1) obj;
        return u890.j(this.a, q2f1Var.a) && u890.j(this.b, q2f1Var.b) && this.c == q2f1Var.c && this.d == q2f1Var.d && this.e == q2f1Var.e && this.f == q2f1Var.f && this.g == q2f1Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
