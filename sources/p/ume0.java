package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ume0 implements Parcelable {
    public static final Parcelable.Creator<ume0> CREATOR = new lbe0((byte) 12);
    public static final ume0 g;
    public final String a;
    public final nhe0 b;
    public final String c;
    public final List d;
    public final int e;
    public final List f;

    static {
        z6x z6xVar = z6x.a;
        g = new ume0("", null, "", z6xVar, 1, z6xVar);
    }

    public ume0(String str, nhe0 nhe0Var, String str2, List list, int i, List list2) {
        this.a = str;
        this.b = nhe0Var;
        this.c = str2;
        this.d = list;
        this.e = i;
        this.f = list2;
    }

    public static ume0 a(ume0 ume0Var, String str, nhe0 nhe0Var, String str2, List list, int i, List list2, int i2) {
        if ((i2 & 1) != 0) {
            str = ume0Var.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            nhe0Var = ume0Var.b;
        }
        nhe0 nhe0Var2 = nhe0Var;
        if ((i2 & 4) != 0) {
            str2 = ume0Var.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            list = ume0Var.d;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            i = ume0Var.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            list2 = ume0Var.f;
        }
        return new ume0(str3, nhe0Var2, str4, list3, i3, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ume0)) {
            return false;
        }
        ume0 ume0Var = (ume0) obj;
        return u890.j(this.a, ume0Var.a) && u890.j(this.b, ume0Var.b) && u890.j(this.c, ume0Var.c) && u890.j(this.d, ume0Var.d) && this.e == ume0Var.e && u890.j(this.f, ume0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nhe0 nhe0Var = this.b;
        return this.f.hashCode() + ab80.k(this.e, f4i1.b(cy30.d((iHashCode + (nhe0Var == null ? 0 : nhe0Var.hashCode())) * 31, 31, this.c), 31, this.d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        nhe0 nhe0Var = this.b;
        if (nhe0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nhe0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((nhe0) itM.next()).writeToParcel(parcel, i);
        }
        int i2 = this.e;
        if (i2 == 1) {
            str = "IDLE";
        } else if (i2 == 2) {
            str = "SEARCHING";
        } else if (i2 == 3) {
            str = "HAS_RESULTS";
        } else if (i2 == 4) {
            str = "NO_RESULTS";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "ERROR";
        }
        parcel.writeString(str);
        Iterator itM2 = kk0.m(parcel, this.f);
        while (itM2.hasNext()) {
            ((nhe0) itM2.next()).writeToParcel(parcel, i);
        }
    }
}
