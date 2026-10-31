package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m940 implements n940 {
    public static final m940 a = new m940();
    public static final Parcelable.Creator<m940> CREATOR = new xt30((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m940);
    }

    public final int hashCode() {
        return -1135330818;
    }

    public final String toString() {
        return "Permit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
