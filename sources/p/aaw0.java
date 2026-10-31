package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aaw0 implements kaw0 {
    public static final Parcelable.Creator<aaw0> CREATOR = new w7w0((byte) 7);
    public final long a;
    public final w4i1 b;

    public aaw0(long j, w4i1 w4i1Var) {
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
        if (!(obj instanceof aaw0)) {
            return false;
        }
        aaw0 aaw0Var = (aaw0) obj;
        return this.a == aaw0Var.a && u890.j(this.b, aaw0Var.b);
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
