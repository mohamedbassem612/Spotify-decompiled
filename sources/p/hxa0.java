package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hxa0 implements Parcelable {
    public static final Parcelable.Creator<hxa0> CREATOR = new jca0((byte) 7);
    public final mwr0 a;
    public final mwr0 b;
    public final yxa0 c;
    public final yq00 d;
    public final int e;
    public final int f;

    public hxa0(mwr0 mwr0Var, mwr0 mwr0Var2, yxa0 yxa0Var, yq00 yq00Var, int i, int i2) {
        this.a = mwr0Var;
        this.b = mwr0Var2;
        this.c = yxa0Var;
        this.d = yq00Var;
        this.e = i;
        this.f = i2;
    }

    public static hxa0 a(hxa0 hxa0Var, ewr0 ewr0Var, ewr0 ewr0Var2, int i) {
        mwr0 mwr0Var = ewr0Var;
        if ((i & 1) != 0) {
            mwr0Var = hxa0Var.a;
        }
        mwr0 mwr0Var2 = mwr0Var;
        mwr0 mwr0Var3 = ewr0Var2;
        if ((i & 2) != 0) {
            mwr0Var3 = hxa0Var.b;
        }
        return new hxa0(mwr0Var2, mwr0Var3, hxa0Var.c, hxa0Var.d, hxa0Var.e, hxa0Var.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxa0)) {
            return false;
        }
        hxa0 hxa0Var = (hxa0) obj;
        return u890.j(this.a, hxa0Var.a) && u890.j(this.b, hxa0Var.b) && u890.j(this.c, hxa0Var.c) && u890.j(this.d, hxa0Var.d) && this.e == hxa0Var.e && this.f == hxa0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
