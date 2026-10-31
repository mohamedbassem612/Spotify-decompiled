package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zhd implements Parcelable {
    public static final Parcelable.Creator<zhd> CREATOR = new yyb((byte) 21);
    public final hg50 a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public zhd(hg50 hg50Var, String str, String str2, String str3, int i) {
        this.a = hg50Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public static zhd a(zhd zhdVar, hg50 hg50Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            hg50Var = zhdVar.a;
        }
        hg50 hg50Var2 = hg50Var;
        String str = zhdVar.b;
        String str2 = zhdVar.c;
        String str3 = zhdVar.d;
        if ((i2 & 16) != 0) {
            i = zhdVar.e;
        }
        zhdVar.getClass();
        return new zhd(hg50Var2, str, str2, str3, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhd)) {
            return false;
        }
        zhd zhdVar = (zhd) obj;
        return u890.j(this.a, zhdVar.a) && u890.j(this.b, zhdVar.b) && u890.j(this.c, zhdVar.c) && u890.j(this.d, zhdVar.d) && this.e == zhdVar.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Integer.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
