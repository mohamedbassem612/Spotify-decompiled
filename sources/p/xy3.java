package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xy3 implements v7c0 {
    public static final xy3 a = new xy3();
    public static final Parcelable.Creator<xy3> CREATOR = new i93((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.v7c0
    public final Object getDefault() {
        return vy3.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
