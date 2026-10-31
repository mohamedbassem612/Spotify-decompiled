package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hqo1 extends u9 {
    public static final Parcelable.Creator<hqo1> CREATOR = new hmo1((byte) 4);
    public final String a;

    public hqo1(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.M(iL, parcel);
    }
}
