package p;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rdp1 extends u9 {
    public static final Parcelable.Creator<rdp1> CREATOR = new hmo1(27);
    public final String a;
    public final Rect b;
    public final List c;
    public final String d;
    public final List e;

    public rdp1(String str, Rect rect, ArrayList arrayList, String str2, ArrayList arrayList2) {
        this.a = str;
        this.b = rect;
        this.c = arrayList;
        this.d = str2;
        this.e = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.E(parcel, 2, this.b, i);
        j541.J(parcel, 3, this.c);
        j541.F(parcel, 4, this.d);
        j541.J(parcel, 5, this.e);
        j541.M(iL, parcel);
    }
}
