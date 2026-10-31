package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pt70 extends u9 {
    public static final Parcelable.Creator<pt70> CREATOR = new sao1((byte) 13);
    public final int a;
    public final int b;
    public final int c;

    public pt70(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c);
        j541.M(iL, parcel);
    }
}
