package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum twg0 implements Parcelable {
    LIGHT("TEXT_LIGHT"),
    DARK("TEXT_DARK"),
    EMPTY("TEXT_EMPTY");

    public static final Parcelable.Creator<twg0> CREATOR = new hug0(2);
    public final String a;

    twg0(String str) {
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
