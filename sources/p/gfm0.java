package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gfm0 extends nfm0 {
    public static final Parcelable.Creator<gfm0> CREATOR = new w9k0((byte) 14);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public gfm0(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfm0)) {
            return false;
        }
        gfm0 gfm0Var = (gfm0) obj;
        return u890.j(this.a, gfm0Var.a) && u890.j(this.b, gfm0Var.b) && this.c == gfm0Var.c && u890.j(this.d, gfm0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
