package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class li10 implements of51 {
    public static final Parcelable.Creator<li10> CREATOR = new qn00((byte) 21);
    public final int a;

    public li10(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li10) && this.a == ((li10) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int p() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
