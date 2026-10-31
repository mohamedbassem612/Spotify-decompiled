package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class emu implements dtb1, Parcelable {
    public static final emu a = new emu();
    public static final Parcelable.Creator<emu> CREATOR = new zrt((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return "divider";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
