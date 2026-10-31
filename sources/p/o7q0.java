package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o7q0 implements s7q0 {
    public static final Parcelable.Creator<o7q0> CREATOR = new qxp0((byte) 29);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public o7q0(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof o7q0)) {
            return false;
        }
        o7q0 o7q0Var = (o7q0) obj;
        return u890.j(this.a, o7q0Var.a) && u890.j(this.b, o7q0Var.b) && u890.j(this.c, o7q0Var.c) && u890.j(this.d, o7q0Var.d);
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
}
