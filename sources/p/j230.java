package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j230 implements Parcelable {
    public static final Parcelable.Creator<j230> CREATOR = new ix20((byte) 6);
    public final String a;
    public final blc0 b;
    public final String c;
    public final String d;
    public final String e;

    public j230(String str, blc0 blc0Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = blc0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j230)) {
            return false;
        }
        j230 j230Var = (j230) obj;
        return u890.j(this.a, j230Var.a) && this.b == j230Var.b && u890.j(this.c, j230Var.c) && u890.j(this.d, j230Var.d) && u890.j(this.e, j230Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
