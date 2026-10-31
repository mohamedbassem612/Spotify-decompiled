package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wrf0 extends yrf0 {
    public static final Parcelable.Creator<wrf0> CREATOR = new ipf0((byte) 23);
    public final int a;

    public wrf0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrf0) && this.a == ((wrf0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
