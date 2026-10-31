package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b6w0 extends d6w0 {
    public static final Parcelable.Creator<b6w0> CREATOR = new g0v0((byte) 25);
    public final boolean b;

    public b6w0(boolean z) {
        super(z);
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6w0) && this.b == ((b6w0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
    }
}
