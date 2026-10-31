package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cib0 implements Parcelable {
    public static final Parcelable.Creator<cib0> CREATOR = new jca0((byte) 25);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final qhs0 e;

    public cib0(String str, String str2, String str3, List list, qhs0 qhs0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = qhs0Var;
    }

    public static cib0 a(cib0 cib0Var, qhs0 qhs0Var) {
        return new cib0(cib0Var.a, cib0Var.b, cib0Var.c, cib0Var.d, qhs0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cib0)) {
            return false;
        }
        cib0 cib0Var = (cib0) obj;
        return u890.j(this.a, cib0Var.a) && u890.j(this.b, cib0Var.b) && u890.j(this.c, cib0Var.c) && this.d.equals(cib0Var.d) && u890.j(this.e, cib0Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        qhs0 qhs0Var = this.e;
        return iB + (qhs0Var == null ? 0 : qhs0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((rib0) itM.next()).writeToParcel(parcel, i);
        }
        qhs0 qhs0Var = this.e;
        if (qhs0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qhs0Var.writeToParcel(parcel, i);
        }
    }
}
