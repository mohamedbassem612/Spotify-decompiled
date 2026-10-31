package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d371 implements f371 {
    public static final d371 a = new d371();
    public static final Parcelable.Creator<d371> CREATOR = new hs61((byte) 24);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d371);
    }

    public final int hashCode() {
        return -998509620;
    }

    public final String toString() {
        return "NotShareable";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
