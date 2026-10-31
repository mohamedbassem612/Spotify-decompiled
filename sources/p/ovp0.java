package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ovp0 implements Parcelable {
    public static final Parcelable.Creator<ovp0> CREATOR = new ump0((byte) 16);
    public final String a;
    public final yxp0 b;
    public final mrp0 c;
    public final fup0 d;
    public final ArrayList e;

    public ovp0(String str, yxp0 yxp0Var, mrp0 mrp0Var, fup0 fup0Var, ArrayList arrayList) {
        this.a = str;
        this.b = yxp0Var;
        this.c = mrp0Var;
        this.d = fup0Var;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovp0)) {
            return false;
        }
        ovp0 ovp0Var = (ovp0) obj;
        return u890.j(this.a, ovp0Var.a) && u890.j(this.b, ovp0Var.b) && u890.j(this.c, ovp0Var.c) && u890.j(this.d, ovp0Var.d) && this.e.equals(ovp0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yxp0 yxp0Var = this.b;
        int iHashCode2 = (iHashCode + (yxp0Var == null ? 0 : yxp0Var.a.hashCode())) * 31;
        mrp0 mrp0Var = this.c;
        int iHashCode3 = (iHashCode2 + (mrp0Var == null ? 0 : mrp0Var.a.hashCode())) * 31;
        fup0 fup0Var = this.d;
        return this.e.hashCode() + ((iHashCode3 + (fup0Var != null ? fup0Var.a.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        yxp0 yxp0Var = this.b;
        if (yxp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yxp0Var.writeToParcel(parcel, i);
        }
        mrp0 mrp0Var = this.c;
        if (mrp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mrp0Var.writeToParcel(parcel, i);
        }
        fup0 fup0Var = this.d;
        if (fup0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fup0Var.writeToParcel(parcel, i);
        }
        Iterator itO = xvj1.o(this.e, parcel);
        while (itO.hasNext()) {
            ((ynp0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
