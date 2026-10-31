package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zu50 implements Parcelable {
    public static final Parcelable.Creator<zu50> CREATOR = new xk50((byte) 9);
    public final String a;
    public final String b;
    public final mhe0 c;
    public final w160 d;

    public zu50(String str, String str2, mhe0 mhe0Var, w160 w160Var) {
        this.a = str;
        this.b = str2;
        this.c = mhe0Var;
        this.d = w160Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu50)) {
            return false;
        }
        zu50 zu50Var = (zu50) obj;
        return u890.j(this.a, zu50Var.a) && u890.j(this.b, zu50Var.b) && u890.j(this.c, zu50Var.c) && u890.j(this.d, zu50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
    }
}
