package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qy41 extends sy41 {
    public static final Parcelable.Creator<qy41> CREATOR = new uo41((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public qy41(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public static qy41 a(qy41 qy41Var, boolean z) {
        return new qy41(qy41Var.a, qy41Var.b, qy41Var.c, qy41Var.d, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy41)) {
            return false;
        }
        qy41 qy41Var = (qy41) obj;
        return u890.j(this.a, qy41Var.a) && u890.j(this.b, qy41Var.b) && u890.j(this.c, qy41Var.c) && u890.j(this.d, qy41Var.d) && this.e == qy41Var.e;
    }

    public final String getUri() {
        return this.b;
    }

    public final String getUuid() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
