package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class txh extends xxh {
    public static final Parcelable.Creator<txh> CREATOR = new v6h((byte) 7);
    public final int a;

    public txh(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txh) && this.a == ((txh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
