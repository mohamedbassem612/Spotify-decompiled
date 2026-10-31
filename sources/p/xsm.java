package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xsm implements Parcelable {
    public static final Parcelable.Creator<xsm> CREATOR = new ezl((byte) 26);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xsm(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsm)) {
            return false;
        }
        xsm xsmVar = (xsm) obj;
        return u890.j(this.a, xsmVar.a) && u890.j(this.b, xsmVar.b) && u890.j(this.c, xsmVar.c) && u890.j(this.d, xsmVar.d) && u890.j(this.e, xsmVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
