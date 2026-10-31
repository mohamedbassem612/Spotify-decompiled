package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public enum g4j0 implements Parcelable {
    INVALID_CLICK_ACTION_IDENTIFIER("invalidClickActionIdentifier"),
    INVALID_BUTTON_CONFIGURATION("invalidButtonConfiguration"),
    UNSUPPORTED_TEMPLATE("unsupportedTemplate"),
    UNSUPPORTED_FORMAT("unsupportedFormat"),
    UNKNOWN_ERROR("unknownError");

    public final String a;
    public static final f4j0 Companion = new f4j0();
    public static final Parcelable.Creator<g4j0> CREATOR = new rqi0((byte) 12);
    public static final znb0 b = dm5.S(2, z7i0.Z);

    g4j0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
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
