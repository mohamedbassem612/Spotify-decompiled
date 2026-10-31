package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9w0 implements kaw0 {
    public static final Parcelable.Creator<y9w0> CREATOR = new w7w0((byte) 5);
    public final long a;
    public final w4i1 b;
    public final tol c;

    public y9w0(long j, w4i1 w4i1Var, tol tolVar) {
        this.a = j;
        this.b = w4i1Var;
        this.c = tolVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9w0)) {
            return false;
        }
        y9w0 y9w0Var = (y9w0) obj;
        return this.a == y9w0Var.a && u890.j(this.b, y9w0Var.b) && u890.j(this.c, y9w0Var.c);
    }

    public final w4i1 getUser() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ydh.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final long v0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
