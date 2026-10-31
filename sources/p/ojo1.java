package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ojo1 extends u9 {
    public static final Parcelable.Creator<ojo1> CREATOR = new sao1((byte) 22);
    public final String a;
    public final String b;
    public final long c;

    public ojo1(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.K(parcel, 4, 8);
        parcel.writeLong(this.c);
        j541.M(iL, parcel);
    }
}
