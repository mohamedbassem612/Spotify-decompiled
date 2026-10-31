package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vhc0 implements Parcelable, Comparable {
    public static final Parcelable.Creator<vhc0> CREATOR = new v5c0((byte) 18);
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u890.q(this.a, ((vhc0) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vhc0) {
            return this.a == ((vhc0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "LineIndex(value=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
