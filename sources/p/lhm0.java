package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lhm0 implements Parcelable {
    public static final Parcelable.Creator<lhm0> CREATOR = new agm0((byte) 0);
    public final hwn0 a;
    public final kyn0 b;
    public final int c;
    public final List d;
    public final String e;
    public final nsn0 f;

    public lhm0(hwn0 hwn0Var, kyn0 kyn0Var, int i, List list, String str, nsn0 nsn0Var) {
        this.a = hwn0Var;
        this.b = kyn0Var;
        this.c = i;
        this.d = list;
        this.e = str;
        this.f = nsn0Var;
    }

    public static lhm0 a(lhm0 lhm0Var, hwn0 hwn0Var, kyn0 kyn0Var, int i, List list, String str, nsn0 nsn0Var, int i2) {
        if ((i2 & 1) != 0) {
            hwn0Var = lhm0Var.a;
        }
        hwn0 hwn0Var2 = hwn0Var;
        if ((i2 & 2) != 0) {
            kyn0Var = lhm0Var.b;
        }
        kyn0 kyn0Var2 = kyn0Var;
        if ((i2 & 4) != 0) {
            i = lhm0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = lhm0Var.d;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            str = lhm0Var.e;
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            nsn0Var = lhm0Var.f;
        }
        lhm0Var.getClass();
        return new lhm0(hwn0Var2, kyn0Var2, i3, list2, str2, nsn0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhm0)) {
            return false;
        }
        lhm0 lhm0Var = (lhm0) obj;
        return u890.j(this.a, lhm0Var.a) && u890.j(this.b, lhm0Var.b) && this.c == lhm0Var.c && u890.j(this.d, lhm0Var.d) && u890.j(this.e, lhm0Var.e) && u890.j(this.f, lhm0Var.f);
    }

    public final int hashCode() {
        hwn0 hwn0Var = this.a;
        int iHashCode = (hwn0Var == null ? 0 : hwn0Var.hashCode()) * 31;
        kyn0 kyn0Var = this.b;
        int iB = f4i1.b(ab80.k(this.c, (iHashCode + (kyn0Var == null ? 0 : kyn0Var.hashCode())) * 31, 31), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        nsn0 nsn0Var = this.f;
        return iHashCode2 + (nsn0Var != null ? nsn0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ltn1.E(this.a, parcel);
        kyn0 kyn0Var = this.b;
        if (kyn0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kyn0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(c13.q(this.c));
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeSerializable((Serializable) itM.next());
        }
        parcel.writeString(this.e);
        d7p1.p(this.f, parcel);
    }
}
