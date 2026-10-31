package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kio1 extends u9 {
    public static final Parcelable.Creator<kio1> CREATOR = new sao1((byte) 29);
    public final List a;
    public final List b;
    public final List c;

    public kio1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final String toString() {
        dzp0 dzp0Var = new dzp0(getClass().getSimpleName());
        dzp0Var.i("allowedDataItemFilters", this.a);
        dzp0Var.i("allowedCapabilities", this.b);
        dzp0Var.i("allowedPackages", this.c);
        return dzp0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.J(parcel, 1, this.a);
        j541.H(parcel, 2, this.b);
        j541.H(parcel, 3, this.c);
        j541.M(iL, parcel);
    }
}
