package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tlo1 extends u9 {
    public static final Parcelable.Creator<tlo1> CREATOR = new hmo1((byte) 0);
    public final int a;
    public final long b;
    public final List c;

    public tlo1(int i, long j, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 8);
        parcel.writeLong(this.b);
        j541.J(parcel, 4, this.c);
        j541.M(iL, parcel);
    }
}
