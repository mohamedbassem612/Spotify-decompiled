package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nfk1 implements Parcelable {
    public static final Parcelable.Creator<nfk1> CREATOR = new nhj1((byte) 24);
    public final String a;
    public final mfk1 b;

    public nfk1(String str, mfk1 mfk1Var) {
        this.a = str;
        this.b = mfk1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfk1)) {
            return false;
        }
        nfk1 nfk1Var = (nfk1) obj;
        return u890.j(this.a, nfk1Var.a) && u890.j(this.b, nfk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
