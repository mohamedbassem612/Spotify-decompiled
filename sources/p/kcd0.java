package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kcd0 implements dtb1 {
    public static final kcd0 a = new kcd0();
    public static final Parcelable.Creator<kcd0> CREATOR = new lad0((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return "ListeningActivityCarousel";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
