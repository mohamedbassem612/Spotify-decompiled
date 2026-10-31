package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dz61 extends ez61 {
    public static final dz61 d = new dz61(9.0f, 16.0f);
    public static final Parcelable.Creator<dz61> CREATOR = new hs61((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
