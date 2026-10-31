package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class daw0 implements kaw0 {
    public static final Parcelable.Creator<daw0> CREATOR = new w7w0((byte) 10);
    public final long a;
    public final w4i1 b;

    public daw0(long j, w4i1 w4i1Var) {
        this.a = j;
        this.b = w4i1Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daw0)) {
            return false;
        }
        daw0 daw0Var = (daw0) obj;
        return this.a == daw0Var.a && u890.j(this.b, daw0Var.b);
    }

    public final w4i1 getUser() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final long v0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
