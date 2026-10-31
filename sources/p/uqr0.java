package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uqr0 implements Parcelable {
    public static final Parcelable.Creator<uqr0> CREATOR = new elr0((byte) 16);
    public final String a;
    public final jj40 b;
    public final i5r c;
    public final ArrayList d;
    public final rod0 e;
    public final Long f;

    public uqr0(String str, jj40 jj40Var, i5r i5rVar, ArrayList arrayList, rod0 rod0Var, Long l) {
        this.a = str;
        this.b = jj40Var;
        this.c = i5rVar;
        this.d = arrayList;
        this.e = rod0Var;
        this.f = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqr0)) {
            return false;
        }
        uqr0 uqr0Var = (uqr0) obj;
        return u890.j(this.a, uqr0Var.a) && u890.j(this.b, uqr0Var.b) && u890.j(this.c, uqr0Var.c) && this.d.equals(uqr0Var.d) && u890.j(this.e, uqr0Var.e) && u890.j(this.f, uqr0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jj40 jj40Var = this.b;
        int iHashCode2 = (iHashCode + (jj40Var == null ? 0 : jj40Var.hashCode())) * 31;
        i5r i5rVar = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (i5rVar == null ? 0 : i5rVar.hashCode())) * 31)) * 31;
        rod0 rod0Var = this.e;
        int iHashCode4 = (iHashCode3 + (rod0Var == null ? 0 : rod0Var.hashCode())) * 31;
        Long l = this.f;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        i5r i5rVar = this.c;
        if (i5rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i5rVar.writeToParcel(parcel, i);
        }
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        rod0 rod0Var = this.e;
        if (rod0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rod0Var.writeToParcel(parcel, i);
        }
        Long l = this.f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
