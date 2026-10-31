package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ia70 extends ne70 {
    public static final Parcelable.Creator<ia70> CREATOR = new ij60((byte) 15);
    public final Parcelable c;
    public final boolean d;

    public ia70(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.c = parcelable3;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
