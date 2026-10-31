package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a5c0 extends d6c0 {
    public static final a5c0 b = new a5c0(true);
    public static final Parcelable.Creator<a5c0> CREATOR = new cwb0((byte) 9);

    public final List a() {
        return z6x.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "AllByYou";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
