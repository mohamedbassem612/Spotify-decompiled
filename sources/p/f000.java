package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f000 extends g700 {
    public static final Parcelable.Creator<f000> CREATOR = new dez((byte) 23);
    public final hwn0 a;
    public final List b;
    public final Long c;

    public f000(hwn0 hwn0Var, List list, Long l) {
        this.a = hwn0Var;
        this.b = list;
        this.c = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f000)) {
            return false;
        }
        f000 f000Var = (f000) obj;
        return u890.j(this.a, f000Var.a) && u890.j(this.b, f000Var.b) && u890.j(this.c, f000Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iB + (l == null ? 0 : l.hashCode());
    }

    @Override // p.g700
    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ltn1.E(this.a, parcel);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            prn1.z((wvn0) itM.next(), parcel);
        }
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
