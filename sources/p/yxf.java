package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yxf extends zxf {
    public static final yxf b = new yxf("upsell_sheet");
    public static final Parcelable.Creator<yxf> CREATOR = new wxf((byte) 1);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
