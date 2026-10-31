package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class he70 implements Parcelable {
    public static final Parcelable.Creator<he70> CREATOR = new ij60((byte) 26);
    public final Parcelable a;
    public final Parcelable b;
    public final Parcelable c;
    public final Parcelable d;

    public he70(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4) {
        this.a = parcelable;
        this.b = parcelable2;
        this.c = parcelable3;
        this.d = parcelable4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
