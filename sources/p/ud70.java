package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ud70 extends ne70 {
    public static final Parcelable.Creator<ud70> CREATOR = new ij60((byte) 25);
    public final Parcelable c;
    public final boolean d;

    public ud70(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.c = parcelable3;
        this.d = z;
    }

    @Override // p.ne70, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
