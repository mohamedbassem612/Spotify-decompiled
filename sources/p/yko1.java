package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yko1 extends u9 {
    public static final Parcelable.Creator<yko1> CREATOR = new sao1((byte) 27);
    public final String a;

    public yko1(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.M(iL, parcel);
    }
}
