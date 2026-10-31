package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gd5 extends hd5 {
    public static final Parcelable.Creator<gd5> CREATOR = new i93((byte) 25);
    public final int c;
    public final int d;

    public gd5(int i, int i2) {
        super(i, i2);
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd5)) {
            return false;
        }
        gd5 gd5Var = (gd5) obj;
        return this.c == gd5Var.c && this.d == gd5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
