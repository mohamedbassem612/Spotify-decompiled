package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hi5 extends u9 {
    public static final Parcelable.Creator<hi5> CREATOR = hbn1.b;
    public static final hi5 d = new m980((byte) 3).d();
    public final zyh a;
    public final boolean b;
    public boolean c;

    static {
        m980 m980Var = new m980((byte) 3);
        m980Var.m();
        m980Var.d();
    }

    public hi5(zyh zyhVar, boolean z) {
        this.a = zyhVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi5)) {
            return false;
        }
        hi5 hi5Var = (hi5) obj;
        return k8p1.h(this.a, hi5Var.a) && this.c == hi5Var.c && this.b == hi5Var.b;
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return l1d.q(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iJ = j541.j(parcel);
        j541.E(parcel, 1, this.a, i);
        j541.s(parcel, 2, this.b);
        j541.n(iJ, parcel);
    }
}
