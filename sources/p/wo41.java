package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wo41 implements zo41 {
    public static final wo41 a = new wo41();
    public static final Parcelable.Creator<wo41> CREATOR = new uo41((byte) 1);

    public final String S() {
        return "NotificationOptIn";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
