package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ug2 extends yg2 {
    public static final Parcelable.Creator<ug2> CREATOR = new ue2((byte) 4);
    public final int a;

    public ug2(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug2) && this.a == ((ug2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
