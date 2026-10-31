package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dx31 implements jx31 {
    public static final Parcelable.Creator<dx31> CREATOR = new xw31((byte) 5);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;

    public dx31(int i, String str, String str2, String str3, String str4, Double d) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx31)) {
            return false;
        }
        dx31 dx31Var = (dx31) obj;
        return this.a == dx31Var.a && u890.j(this.b, dx31Var.b) && u890.j(this.c, dx31Var.c) && u890.j(this.d, dx31Var.d) && u890.j(this.e, dx31Var.e) && u890.j(this.f, dx31Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Double d = this.f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }
}
