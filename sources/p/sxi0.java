package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sxi0 implements Parcelable {
    public static final Parcelable.Creator<sxi0> CREATOR = new rqi0((byte) 2);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public sxi0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxi0)) {
            return false;
        }
        sxi0 sxi0Var = (sxi0) obj;
        return u890.j(this.a, sxi0Var.a) && u890.j(this.b, sxi0Var.b) && u890.j(this.c, sxi0Var.c) && this.d == sxi0Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
