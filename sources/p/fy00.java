package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fy00 implements Parcelable {
    public static final Parcelable.Creator<fy00> CREATOR = new qn00((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public fy00(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        if (z && str3 == null) {
            hhg1.n("Cannot show extended version without an extended version URI");
            throw null;
        }
        if (i == 1 || str3 != null) {
            return;
        }
        hhg1.n("Cannot have non-Idle replacement state without an extended version URI");
        throw null;
    }

    public static fy00 a(fy00 fy00Var, String str, boolean z, int i, int i2) {
        String str2 = fy00Var.a;
        String str3 = fy00Var.b;
        if ((i2 & 4) != 0) {
            str = fy00Var.c;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            z = fy00Var.d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = fy00Var.e;
        }
        return new fy00(i, str2, str3, z2, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy00)) {
            return false;
        }
        fy00 fy00Var = (fy00) obj;
        return u890.j(this.a, fy00Var.a) && u890.j(this.b, fy00Var.b) && u890.j(this.c, fy00Var.c) && this.d == fy00Var.d && this.e == fy00Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        int i2 = this.e;
        if (i2 == 1) {
            str = "Idle";
        } else if (i2 == 2) {
            str = "Replacing";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Replaced";
        }
        parcel.writeString(str);
    }
}
