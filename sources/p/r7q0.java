package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r7q0 implements s7q0 {
    public static final Parcelable.Creator<r7q0> CREATOR = new p7q0((byte) 1);
    public final String a;
    public final String b;
    public final String c;

    public r7q0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7q0)) {
            return false;
        }
        r7q0 r7q0Var = (r7q0) obj;
        return u890.j(this.a, r7q0Var.a) && u890.j(this.b, r7q0Var.b) && u890.j(this.c, r7q0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
