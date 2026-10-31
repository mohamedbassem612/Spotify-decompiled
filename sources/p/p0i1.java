package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0i1 implements Parcelable {
    public static final Parcelable.Creator<p0i1> CREATOR = new gwg1((byte) 20);
    public final dzh1 a;
    public final boolean b;

    public p0i1(dzh1 dzh1Var, boolean z) {
        this.a = dzh1Var;
        this.b = z;
    }

    public final dzh1 a() {
        return this.a;
    }

    public final boolean b() {
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
        if (!(obj instanceof p0i1)) {
            return false;
        }
        p0i1 p0i1Var = (p0i1) obj;
        return u890.j(this.a, p0i1Var.a) && this.b == p0i1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
