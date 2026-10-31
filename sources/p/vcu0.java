package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vcu0 implements ycu0 {
    public static final Parcelable.Creator<vcu0> CREATOR = new brt0((byte) 13);
    public final long a;
    public final long b;

    public vcu0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcu0)) {
            return false;
        }
        vcu0 vcu0Var = (vcu0) obj;
        return this.a == vcu0Var.a && this.b == vcu0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
