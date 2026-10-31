package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rxs0 implements sxs0 {
    public static final Parcelable.Creator<rxs0> CREATOR = new bis0((byte) 16);
    public final String a;
    public final long b;

    public rxs0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxs0)) {
            return false;
        }
        rxs0 rxs0Var = (rxs0) obj;
        return u890.j(this.a, rxs0Var.a) && this.b == rxs0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
