package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dx4 implements Parcelable {
    public static final Parcelable.Creator<dx4> CREATOR = new i93((byte) 21);
    public final String[] a;
    public final int[] b;

    public dx4(String[] strArr, int[] iArr) {
        this.a = strArr;
        this.b = iArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.a);
        parcel.writeIntArray(this.b);
    }
}
