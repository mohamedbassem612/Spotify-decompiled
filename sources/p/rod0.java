package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rod0 implements Parcelable {
    public static final Parcelable.Creator<rod0> CREATOR = new qod0((byte) 0);
    public final zu50 a;
    public final List b;
    public final pa30 c;
    public final a6x d;
    public final String e;

    public rod0(zu50 zu50Var, List list, pa30 pa30Var, a6x a6xVar, String str) {
        this.a = zu50Var;
        this.b = list;
        this.c = pa30Var;
        this.d = a6xVar;
        this.e = str;
    }

    public static rod0 a(rod0 rod0Var, zu50 zu50Var, List list, a6x a6xVar, String str, int i) {
        if ((i & 1) != 0) {
            zu50Var = rod0Var.a;
        }
        zu50 zu50Var2 = zu50Var;
        pa30 pa30Var = rod0Var.c;
        if ((i & 8) != 0) {
            a6xVar = rod0Var.d;
        }
        rod0Var.getClass();
        return new rod0(zu50Var2, list, pa30Var, a6xVar, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rod0)) {
            return false;
        }
        rod0 rod0Var = (rod0) obj;
        return u890.j(this.a, rod0Var.a) && this.b.equals(rod0Var.b) && u890.j(this.c, rod0Var.c) && u890.j(this.d, rod0Var.d) && u890.j(this.e, rod0Var.e);
    }

    public final int hashCode() {
        zu50 zu50Var = this.a;
        int iB = f4i1.b((zu50Var == null ? 0 : zu50Var.hashCode()) * 31, 31, this.b);
        pa30 pa30Var = this.c;
        int iHashCode = (iB + (pa30Var == null ? 0 : pa30Var.a.hashCode())) * 31;
        a6x a6xVar = this.d;
        int iHashCode2 = (iHashCode + (a6xVar == null ? 0 : a6xVar.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zu50 zu50Var = this.a;
        if (zu50Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zu50Var.writeToParcel(parcel, i);
        }
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((uf51) itM.next()).writeToParcel(parcel, i);
        }
        pa30 pa30Var = this.c;
        if (pa30Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pa30Var.writeToParcel(parcel, i);
        }
        a6x a6xVar = this.d;
        if (a6xVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a6xVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
    }
}
