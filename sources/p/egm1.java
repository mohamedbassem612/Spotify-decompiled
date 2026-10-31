package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class egm1 implements Parcelable {
    public static final Parcelable.Creator<egm1> CREATOR = new lfm1(4);
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ egm1(Integer num, boolean z, int i) {
        this((i & 2) != 0 ? null : num, false, (i & 4) != 0 ? false : z, true, false, false);
    }

    public static egm1 a(egm1 egm1Var, Integer num, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? egm1Var.a : true;
        if ((i & 2) != 0) {
            num = egm1Var.b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            z = egm1Var.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = egm1Var.d;
        }
        boolean z5 = z2;
        boolean z6 = (i & 16) != 0 ? egm1Var.e : true;
        boolean z7 = (i & 32) != 0 ? egm1Var.f : true;
        egm1Var.getClass();
        return new egm1(num2, z3, z4, z5, z6, z7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egm1)) {
            return false;
        }
        egm1 egm1Var = (egm1) obj;
        return this.a == egm1Var.a && u890.j(this.b, egm1Var.b) && this.c == egm1Var.c && this.d == egm1Var.d && this.e == egm1Var.e && this.f == egm1Var.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public egm1(Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }
}
