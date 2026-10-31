package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xi70 extends hj70 {
    public static final Parcelable.Creator<xi70> CREATOR = new ai70((byte) 20);
    public final boolean c;
    public final boolean d;

    public xi70(boolean z, boolean z2) {
        super(15, 2);
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi70)) {
            return false;
        }
        xi70 xi70Var = (xi70) obj;
        return this.c == xi70Var.c && this.d == xi70Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Boolean.hashCode(this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
