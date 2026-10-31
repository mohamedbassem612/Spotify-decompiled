package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class upv0 implements Parcelable {
    public static final Parcelable.Creator<upv0> CREATOR = new g0v0((byte) 12);
    public final lik1 a;
    public final int b;

    public upv0(lik1 lik1Var, int i) {
        this.a = lik1Var;
        this.b = i;
    }

    public final lik1 a() {
        return this.a;
    }

    public final int b() {
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
        if (!(obj instanceof upv0)) {
            return false;
        }
        upv0 upv0Var = (upv0) obj;
        return u890.j(this.a, upv0Var.a) && this.b == upv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
    }
}
