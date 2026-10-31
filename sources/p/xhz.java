package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xhz implements Parcelable {
    public static final Parcelable.Creator<xhz> CREATOR = new dez((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public xhz(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public static xhz a(xhz xhzVar, boolean z) {
        String str = xhzVar.a;
        String str2 = xhzVar.b;
        String str3 = xhzVar.c;
        String str4 = xhzVar.d;
        xhzVar.getClass();
        return new xhz(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhz)) {
            return false;
        }
        xhz xhzVar = (xhz) obj;
        return u890.j(this.a, xhzVar.a) && u890.j(this.b, xhzVar.b) && u890.j(this.c, xhzVar.c) && u890.j(this.d, xhzVar.d) && this.e == xhzVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
