package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qj60 extends rj60 {
    public static final Parcelable.Creator<qj60> CREATOR = new ij60((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qj60(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof qj60)) {
            return false;
        }
        qj60 qj60Var = (qj60) obj;
        return u890.j(this.a, qj60Var.a) && u890.j(this.b, qj60Var.b) && u890.j(this.c, qj60Var.c) && u890.j(this.d, qj60Var.d);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
