package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j3v0 implements Parcelable {
    public static final Parcelable.Creator<j3v0> CREATOR = new g0v0((byte) 2);
    public final lik1 a;
    public final boolean b;

    public j3v0(lik1 lik1Var, boolean z) {
        this.a = lik1Var;
        this.b = z;
    }

    public final lik1 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3v0)) {
            return false;
        }
        j3v0 j3v0Var = (j3v0) obj;
        return u890.j(this.a, j3v0Var.a) && this.b == j3v0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
