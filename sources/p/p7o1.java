package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p7o1 extends u9 {
    public static final Parcelable.Creator<p7o1> CREATOR = new w2o1((byte) 17);
    public final int a;
    public final String b;

    public p7o1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.F(parcel, 3, this.b);
        j541.M(iL, parcel);
    }
}
