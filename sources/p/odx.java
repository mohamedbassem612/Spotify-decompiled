package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class odx extends i5 {
    public static final Parcelable.ClassLoaderCreator<odx> CREATOR = new aw91((byte) 8);
    public String c;

    public odx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = "";
        String string = parcel.readString();
        this.c = string == null ? "1:1" : string;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(((i5) this).a, i);
        parcel.writeString(this.c);
    }
}
