package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jwp0 extends xwp0 {
    public static final Parcelable.Creator<jwp0> CREATOR = new ump0((byte) 20);
    public final int a;

    public jwp0(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwp0) && this.a == ((jwp0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
