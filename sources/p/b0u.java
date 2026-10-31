package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b0u extends u9 {
    public static final Parcelable.Creator<b0u> CREATOR = new e9n1((byte) 12);
    public final String a;
    public final String b;
    public final int c;

    public b0u(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c);
        j541.M(iL, parcel);
    }
}
