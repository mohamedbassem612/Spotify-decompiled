package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public class ne70 implements Parcelable {
    public static final Parcelable.Creator<ne70> CREATOR = new ij60((byte) 27);
    public final Parcelable a;
    public final Parcelable b;

    public ne70(Parcelable parcelable, Parcelable parcelable2) {
        this.a = parcelable;
        this.b = parcelable2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
