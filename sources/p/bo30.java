package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bo30 implements oim {
    public static final Parcelable.Creator<bo30> CREATOR = new ix20((byte) 25);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final lik1 e;
    public final int f;
    public final boolean g;
    public final bjm h;

    public bo30(String str, String str2, String str3, String str4, lik1 lik1Var, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = lik1Var;
        this.f = i;
        this.g = z;
        this.h = new bjm(6, str, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo30)) {
            return false;
        }
        bo30 bo30Var = (bo30) obj;
        return u890.j(this.a, bo30Var.a) && u890.j(this.b, bo30Var.b) && u890.j(this.c, bo30Var.c) && u890.j(this.d, bo30Var.d) && u890.j(this.e, bo30Var.e) && this.f == bo30Var.f && this.g == bo30Var.g;
    }

    public final bjm getTarget() {
        return this.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.g) + ab80.k(this.f, cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e.a), 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        int i2 = this.f;
        if (i2 == 1) {
            str = "FRIEND";
        } else if (i2 == 2) {
            str = "INVITED_FRIEND";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SUGGESTED_FRIEND";
        }
        parcel.writeString(str);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
