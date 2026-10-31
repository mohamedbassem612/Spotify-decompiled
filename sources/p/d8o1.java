package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d8o1 extends u9 {
    public static final Parcelable.Creator<d8o1> CREATOR = new w2o1((byte) 19);
    public final int a;
    public final ConnectionConfiguration[] b;

    public d8o1(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.I(parcel, 3, this.b, i);
        j541.M(iL, parcel);
    }
}
