package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r7f0 implements of51 {
    public static final Parcelable.Creator<r7f0> CREATOR = new j7f0((byte) 2);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final Double e;

    public r7f0(int i, String str, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7f0)) {
            return false;
        }
        r7f0 r7f0Var = (r7f0) obj;
        return this.a == r7f0Var.a && u890.j(this.b, r7f0Var.b) && u890.j(this.c, r7f0Var.c) && u890.j(this.d, r7f0Var.d) && u890.j(this.e, r7f0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.e;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    @Override // p.of51
    public final int p() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Double d = this.e;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }
}
