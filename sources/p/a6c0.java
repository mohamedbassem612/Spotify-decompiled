package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a6c0 extends d6c0 {
    public static final a6c0 b = new a6c0(false);
    public static final Parcelable.Creator<a6c0> CREATOR = new v5c0((byte) 4);

    public final List a() {
        return z6x.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Unplayed";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
