package p;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mep1 extends u9 {
    public static final Parcelable.Creator<mep1> CREATOR = new hep1((byte) 2);
    public final String a;
    public final Rect b;
    public final List c;
    public final float d;
    public final float e;

    public mep1(String str, Rect rect, ArrayList arrayList, float f, float f2) {
        this.a = str;
        this.b = rect;
        this.c = arrayList;
        this.d = f;
        this.e = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.E(parcel, 2, this.b, i);
        j541.J(parcel, 3, this.c);
        j541.K(parcel, 4, 4);
        parcel.writeFloat(this.d);
        j541.K(parcel, 5, 4);
        parcel.writeFloat(this.e);
        j541.M(iL, parcel);
    }
}
