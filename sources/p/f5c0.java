package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f5c0 extends d6c0 {
    public static final f5c0 b = new f5c0(true);
    public static final Parcelable.Creator<f5c0> CREATOR = new cwb0((byte) 14);

    public final List a() {
        return z6x.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Authors";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
