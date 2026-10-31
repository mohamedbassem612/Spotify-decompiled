package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum br01 implements Parcelable {
    SAVED("saved"),
    SHARED("shared"),
    PLAYED("played"),
    AUTO_GENERATED("auto_generated"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("");

    public static final Parcelable.Creator<br01> CREATOR = new sj01((byte) 21);
    public final String a;

    br01(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
