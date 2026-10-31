package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y21 extends r31 {
    public static final Parcelable.Creator<y21> CREATOR = new t21((byte) 4);
    public final boolean a;

    public y21(boolean z) {
        this.a = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y21) && this.a == ((y21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
