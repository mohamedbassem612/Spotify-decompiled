package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g7i0 implements Parcelable {
    public static final Parcelable.Creator<g7i0> CREATOR = new cyh0((byte) 20);
    public final bef0 a;
    public final int b;

    public g7i0(bef0 bef0Var, int i) {
        this.a = bef0Var;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7i0)) {
            return false;
        }
        g7i0 g7i0Var = (g7i0) obj;
        return u890.j(this.a, g7i0Var.a) && this.b == g7i0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(pze0.q(this.b));
    }
}
