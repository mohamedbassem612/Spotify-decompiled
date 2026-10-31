package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gep1 extends u9 {
    public static final Parcelable.Creator<gep1> CREATOR = new hep1(0);
    public final String a;
    public final List b;

    public gep1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.J(parcel, 2, this.b);
        j541.M(iL, parcel);
    }
}
