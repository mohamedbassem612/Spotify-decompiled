package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f4o1 extends u9 {
    public static final Parcelable.Creator<f4o1> CREATOR = new w2o1((byte) 4);
    public final int a;
    public final AppTheme b;

    public f4o1(int i, AppTheme appTheme) {
        this.a = i;
        this.b = appTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 3, this.b, i);
        j541.M(iL, parcel);
    }
}
