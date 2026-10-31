package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dv01 implements Parcelable {
    public static final Parcelable.Creator<dv01> CREATOR = new sj01((byte) 23);
    public final String a;
    public final Integer b;

    public dv01(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv01)) {
            return false;
        }
        dv01 dv01Var = (dv01) obj;
        return u890.j(this.a, dv01Var.a) && u890.j(this.b, dv01Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
