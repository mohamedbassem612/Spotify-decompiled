package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k9g0 implements Parcelable {
    public static final Parcelable.Creator<k9g0> CREATOR = new isf0((byte) 21);
    public final String a;
    public final lik1 b;

    public k9g0(String str, lik1 lik1Var) {
        this.a = str;
        this.b = lik1Var;
    }

    public final lik1 a() {
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
        if (!(obj instanceof k9g0)) {
            return false;
        }
        k9g0 k9g0Var = (k9g0) obj;
        return u890.j(this.a, k9g0Var.a) && u890.j(this.b, k9g0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
