package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hpl implements kpl {
    public static final Parcelable.Creator<hpl> CREATOR = new pol((byte) 11);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public hpl(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpl)) {
            return false;
        }
        hpl hplVar = (hpl) obj;
        return u890.j(this.a, hplVar.a) && u890.j(this.b, hplVar.b) && u890.j(this.c, hplVar.c) && u890.j(this.d, hplVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public /* synthetic */ hpl(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }
}
