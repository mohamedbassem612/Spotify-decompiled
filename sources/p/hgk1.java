package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hgk1 implements jgk1 {
    public static final Parcelable.Creator<hgk1> CREATOR = new tfk1((byte) 12);
    public final String a;
    public final String b;
    public final String c;

    public hgk1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgk1)) {
            return false;
        }
        hgk1 hgk1Var = (hgk1) obj;
        return u890.j(this.a, hgk1Var.a) && u890.j(this.b, hgk1Var.b) && u890.j(this.c, hgk1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
