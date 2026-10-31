package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q9o1 extends u9 {
    public static final Parcelable.Creator<q9o1> CREATOR = new w2o1((byte) 27);
    public final boolean a;
    public final int b;

    public q9o1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.M(iL, parcel);
    }
}
