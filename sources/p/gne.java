package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gne implements Parcelable {
    public static final Parcelable.Creator<gne> CREATOR = new zge((byte) 8);
    public final int a;
    public final int b;
    public final boolean c;

    public gne(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gne)) {
            return false;
        }
        gne gneVar = (gne) obj;
        return this.a == gneVar.a && this.b == gneVar.b && this.c == gneVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
