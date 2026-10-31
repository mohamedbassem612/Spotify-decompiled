package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uio1 extends u9 {
    public static final Parcelable.Creator<uio1> CREATOR = new sao1(17);
    public final String a;
    public final DataHolder b;

    public uio1(String str, DataHolder dataHolder) {
        this.a = str;
        this.b = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.E(parcel, 2, this.b, i);
        j541.M(iL, parcel);
    }
}
