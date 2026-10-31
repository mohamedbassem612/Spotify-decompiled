package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hd30 extends ld30 {
    public static final Parcelable.Creator<hd30> CREATOR = new ix20((byte) 13);
    public final int a;

    public hd30(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
