package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gbg0 implements Parcelable {
    public static final Parcelable.Creator<gbg0> CREATOR = new isf0((byte) 22);
    public final String a;
    public final ibg0 b;
    public final lik1 c;

    public gbg0(String str, ibg0 ibg0Var, lik1 lik1Var) {
        this.a = str;
        this.b = ibg0Var;
        this.c = lik1Var;
    }

    public final ibg0 a() {
        return this.b;
    }

    public final lik1 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbg0)) {
            return false;
        }
        gbg0 gbg0Var = (gbg0) obj;
        return u890.j(this.a, gbg0Var.a) && this.b == gbg0Var.b && u890.j(this.c, gbg0Var.c);
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
