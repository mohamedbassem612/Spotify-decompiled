package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y3x0 implements Parcelable {
    public static final Parcelable.Creator<y3x0> CREATOR = new wvw0((byte) 8);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3x0(int i, String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        boolean z3;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            str4 = str;
            z3 = z2;
            str3 = str4;
        } else {
            boolean z4 = z2;
            str3 = "spotify:user";
            str4 = str;
            z3 = z4;
        }
        this(z, z3, str4, str2, str3);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3x0)) {
            return false;
        }
        y3x0 y3x0Var = (y3x0) obj;
        return u890.j(this.a, y3x0Var.a) && u890.j(this.b, y3x0Var.b) && this.c == y3x0Var.c && this.d == y3x0Var.d && u890.j(this.e, y3x0Var.e);
    }

    public final String g() {
        return this.a;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final boolean j() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }

    public y3x0(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
    }
}
