package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class geg0 implements Parcelable {
    public static final Parcelable.Creator<geg0> CREATOR = new isf0((byte) 23);
    public final String a;
    public final ibg0 b;
    public final lik1 c;

    public geg0(String str, ibg0 ibg0Var, lik1 lik1Var) {
        this.a = str;
        this.b = ibg0Var;
        this.c = lik1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geg0)) {
            return false;
        }
        geg0 geg0Var = (geg0) obj;
        return u890.j(this.a, geg0Var.a) && this.b == geg0Var.b && u890.j(this.c, geg0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
    }
}
