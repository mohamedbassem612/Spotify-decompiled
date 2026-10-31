package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fc extends hc implements Parcelable {
    public static final fc a = new fc();
    public static final Parcelable.Creator<fc> CREATOR = new scc((byte) 14);

    @Override // p.hc
    public final boolean a() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
