package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum eyg0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    SAVE("save"),
    ICON_RELEASED("IconReleased");

    public static final Parcelable.Creator<eyg0> CREATOR = new hug0((byte) 3);
    public final String a;

    eyg0(String str) {
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
