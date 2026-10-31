package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qhs0 implements Parcelable {
    public static final Parcelable.Creator<qhs0> CREATOR = new ybs0(27);
    public final String a;
    public final String b;
    public final Double c;
    public final String d;

    public qhs0(String str, String str2, Double d, String str3) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhs0)) {
            return false;
        }
        qhs0 qhs0Var = (qhs0) obj;
        return u890.j(this.a, qhs0Var.a) && u890.j(this.b, qhs0Var.b) && u890.j(this.c, qhs0Var.c) && u890.j(this.d, qhs0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Double d = this.c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.d);
    }
}
