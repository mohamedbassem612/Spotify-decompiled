package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tao1 extends u9 {
    public static final Parcelable.Creator<tao1> CREATOR = new sao1((byte) 1);
    public final boolean a;
    public final boolean b;
    public final int c;

    public tao1(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c);
        j541.M(iL, parcel);
    }
}
