package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yh70 extends hj70 {
    public static final Parcelable.Creator<yh70> CREATOR = new ij60((byte) 28);
    public final boolean c;
    public final boolean d;

    public yh70(boolean z, boolean z2) {
        super(9, 1);
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
        if (!(obj instanceof yh70)) {
            return false;
        }
        yh70 yh70Var = (yh70) obj;
        return this.c == yh70Var.c && this.d == yh70Var.d;
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
