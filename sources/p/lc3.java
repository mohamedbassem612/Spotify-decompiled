package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lc3 implements Parcelable {
    public static final Parcelable.Creator<lc3> CREATOR = new i93((byte) 2);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public lc3(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final String a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3)) {
            return false;
        }
        lc3 lc3Var = (lc3) obj;
        return u890.j(this.a, lc3Var.a) && u890.j(this.b, lc3Var.b) && u890.j(this.c, lc3Var.c) && this.d == lc3Var.d && u890.j(this.e, lc3Var.e);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }

    public /* synthetic */ lc3(String str, String str2, String str3) {
        this(str, str2, str3, str, false);
    }
}
