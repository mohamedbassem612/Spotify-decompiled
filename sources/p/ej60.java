package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ej60 extends rj60 {
    public static final Parcelable.Creator<ej60> CREATOR = new xk50((byte) 26);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public ej60(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej60)) {
            return false;
        }
        ej60 ej60Var = (ej60) obj;
        return u890.j(this.a, ej60Var.a) && u890.j(this.b, ej60Var.b) && u890.j(this.c, ej60Var.c) && u890.j(this.d, ej60Var.d) && u890.j(this.e, ej60Var.e);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
    }
}
