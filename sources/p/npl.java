package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class npl implements upl {
    public static final Parcelable.Creator<npl> CREATOR = new pol((byte) 15);
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;

    public npl(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npl)) {
            return false;
        }
        npl nplVar = (npl) obj;
        return u890.j(this.a, nplVar.a) && u890.j(this.b, nplVar.b) && u890.j(this.c, nplVar.c) && u890.j(this.d, nplVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
