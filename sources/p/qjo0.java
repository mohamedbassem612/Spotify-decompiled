package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qjo0 extends u9 {
    public static final Parcelable.Creator<qjo0> CREATOR = new hmo1(18);
    public final String a;
    public final int b;
    public final String c;

    public qjo0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.F(parcel, 4, this.c);
        j541.M(iL, parcel);
    }
}
