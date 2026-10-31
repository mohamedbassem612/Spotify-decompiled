package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k1b0 implements Parcelable {
    public static final Parcelable.Creator<k1b0> CREATOR = new jca0((byte) 14);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public k1b0(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1b0)) {
            return false;
        }
        k1b0 k1b0Var = (k1b0) obj;
        return u890.j(this.a, k1b0Var.a) && u890.j(this.b, k1b0Var.b) && u890.j(this.c, k1b0Var.c) && u890.j(this.d, k1b0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
