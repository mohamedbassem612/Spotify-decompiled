package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rvm1 implements Parcelable {
    public static final Parcelable.Creator<rvm1> CREATOR = new ynm1((byte) 8);
    public final String a;
    public final blc0 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public rvm1(String str, blc0 blc0Var, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = blc0Var;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvm1)) {
            return false;
        }
        rvm1 rvm1Var = (rvm1) obj;
        return u890.j(this.a, rvm1Var.a) && this.b == rvm1Var.b && u890.j(this.c, rvm1Var.c) && u890.j(this.d, rvm1Var.d) && this.e == rvm1Var.e && this.f == rvm1Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ rvm1(String str, blc0 blc0Var, String str2, String str3) {
        this(str, blc0Var, str2, str3, false, false);
    }
}
