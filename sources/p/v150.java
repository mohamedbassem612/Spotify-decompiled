package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class v150 implements x150 {
    public static final v150 INSTANCE = new v150();
    public static final Parcelable.Creator<v150> CREATOR = new fd40((byte) 20);
    public static final /* synthetic */ znb0 a = dm5.S(2, h050.e);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v150);
    }

    public final int hashCode() {
        return -1715577785;
    }

    public final nma0 serializer() {
        return (nma0) a.getValue();
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
