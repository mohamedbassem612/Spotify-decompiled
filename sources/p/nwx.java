package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nwx extends i5 {
    public static final Parcelable.ClassLoaderCreator<nwx> CREATOR = new aw91((byte) 10);
    public boolean c;

    public nwx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() == 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(((i5) this).a, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
