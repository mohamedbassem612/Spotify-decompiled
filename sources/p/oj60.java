package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oj60 extends rj60 {
    public static final Parcelable.Creator<oj60> CREATOR = new ij60((byte) 5);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public oj60(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj60)) {
            return false;
        }
        oj60 oj60Var = (oj60) obj;
        return u890.j(this.a, oj60Var.a) && u890.j(this.b, oj60Var.b) && u890.j(this.c, oj60Var.c) && u890.j(this.d, oj60Var.d) && this.e == oj60Var.e;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
