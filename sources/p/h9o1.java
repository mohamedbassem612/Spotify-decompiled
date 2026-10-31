package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h9o1 extends u9 {
    public static final Parcelable.Creator<h9o1> CREATOR;
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    static {
        new h9o1(null, false, false);
        CREATOR = new w2o1((byte) 25);
    }

    public h9o1(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h9o1)) {
            return false;
        }
        h9o1 h9o1Var = (h9o1) obj;
        return k8p1.h(this.a, h9o1Var.a) && k8p1.h(Boolean.valueOf(this.b), Boolean.valueOf(h9o1Var.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.J(parcel, 1, new ArrayList(this.a));
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.M(iL, parcel);
    }
}
