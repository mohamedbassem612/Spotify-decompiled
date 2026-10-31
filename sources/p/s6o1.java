package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s6o1 extends u9 {
    public static final Parcelable.Creator<s6o1> CREATOR = new w2o1((byte) 11);
    public final int a;
    public final boolean b;
    public final boolean c;

    public s6o1(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.M(iL, parcel);
    }
}
