package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v870 implements Parcelable {
    public static final Parcelable.Creator<v870> CREATOR = new ij60((byte) 14);
    public final int a;

    public v870(Parcel parcel) {
        this.a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public v870(int i) {
        this.a = i;
    }
}
