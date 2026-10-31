package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ffm1 implements Parcelable {
    public static final Parcelable.Creator<ffm1> CREATOR;
    public final o571 a;
    public final String b;
    public final Boolean c;
    public final boolean d;

    static {
        idd1 idd1Var = o571.c;
        CREATOR = new w8m1((byte) 26);
    }

    public ffm1(o571 o571Var, String str, Boolean bool, boolean z) {
        this.a = o571Var;
        this.b = str;
        this.c = bool;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffm1)) {
            return false;
        }
        ffm1 ffm1Var = (ffm1) obj;
        return u890.j(this.a, ffm1Var.a) && u890.j(this.b, ffm1Var.b) && u890.j(this.c, ffm1Var.c) && this.d == ffm1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeInt(this.d ? 1 : 0);
    }
}
