package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fek extends iek {
    public static final fek a = new fek();
    public static final Parcelable.Creator<fek> CREATOR = new v6h((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fek);
    }

    public final int hashCode() {
        return 637203144;
    }

    public final String toString() {
        return "BeforeSale";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
