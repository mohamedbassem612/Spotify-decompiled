package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dxd1 extends u9 {
    public static final Parcelable.Creator<dxd1> CREATOR = new ynm1((byte) 21);
    public final int a;
    public List b;

    public dxd1(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final List F() {
        return this.b;
    }

    public final void a0(uoj0 uoj0Var) {
        List arrayList = this.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b = arrayList;
        }
        arrayList.add(uoj0Var);
    }

    public final int j() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.J(parcel, 2, this.b);
        j541.M(iL, parcel);
    }
}
