package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i8o1 extends u9 {
    public static final Parcelable.Creator<i8o1> CREATOR = new w2o1((byte) 20);
    public final int a;
    public final List b;

    public i8o1(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.J(parcel, 3, this.b);
        j541.M(iL, parcel);
    }
}
