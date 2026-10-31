package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xhc0 implements Parcelable {
    public static final Parcelable.Creator<xhc0> CREATOR = new v5c0((byte) 19);
    public final aic0 a;
    public final String b;
    public final pqe1 c;
    public final List d;
    public final List e;

    public xhc0(aic0 aic0Var, String str, pqe1 pqe1Var, ArrayList arrayList, List list) {
        this.a = aic0Var;
        this.b = str;
        this.c = pqe1Var;
        this.d = arrayList;
        this.e = list;
    }

    public final List a() {
        return this.e;
    }

    public final aic0 b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhc0)) {
            return false;
        }
        xhc0 xhc0Var = (xhc0) obj;
        return u890.j(this.a, xhc0Var.a) && u890.j(this.b, xhc0Var.b) && u890.j(this.c, xhc0Var.c) && u890.j(this.d, xhc0Var.d) && u890.j(this.e, xhc0Var.e);
    }

    public final String g() {
        return this.b;
    }

    public final List h() {
        return this.d;
    }

    public final int hashCode() {
        aic0 aic0Var = this.a;
        int iHashCode = (aic0Var == null ? 0 : aic0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        pqe1 pqe1Var = this.c;
        int iHashCode3 = (iHashCode2 + (pqe1Var == null ? 0 : pqe1Var.hashCode())) * 31;
        List list = this.d;
        return this.e.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final pqe1 j() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aic0 aic0Var = this.a;
        if (aic0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aic0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        List list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        parcel.writeStringList(this.e);
    }
}
