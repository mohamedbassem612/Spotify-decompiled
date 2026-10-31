package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zve1 extends ouo1 implements Parcelable {
    public static final Parcelable.Creator<zve1> CREATOR = new lse1((byte) 7);
    public final long b;

    public zve1(long j) {
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zve1) && this.b == ((zve1) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }
}
