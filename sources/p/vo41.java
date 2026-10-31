package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vo41 implements zo41 {
    public static final vo41 a = new vo41();
    public static final Parcelable.Creator<vo41> CREATOR = new uo41((byte) 0);

    @Override // p.zo41
    public final String S() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
