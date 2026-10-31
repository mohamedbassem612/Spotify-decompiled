package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v2d0 extends g3d0 implements d3d0 {
    public static final Parcelable.Creator<v2d0> CREATOR = new bzc0((byte) 11);
    public final boolean a;

    public v2d0(boolean z) {
        this.a = z;
    }

    @Override // p.d3d0
    public final boolean a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2d0) && this.a == ((v2d0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
