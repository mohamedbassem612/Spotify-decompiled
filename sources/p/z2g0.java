package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z2g0 implements Parcelable {
    public static final Parcelable.Creator<z2g0> CREATOR = new isf0((byte) 13);
    public final ArrayList a;
    public final String b;
    public final xy01 c;
    public final o5a d;
    public final yo20 e;
    public final f820 f;

    public z2g0(ArrayList arrayList, String str, xy01 xy01Var, o5a o5aVar, yo20 yo20Var, f820 f820Var) {
        this.a = arrayList;
        this.b = str;
        this.c = xy01Var;
        this.d = o5aVar;
        this.e = yo20Var;
        this.f = f820Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2g0)) {
            return false;
        }
        z2g0 z2g0Var = (z2g0) obj;
        return this.a.equals(z2g0Var.a) && u890.j(this.b, z2g0Var.b) && u890.j(this.c, z2g0Var.c) && u890.j(this.d, z2g0Var.d) && u890.j(this.e, z2g0Var.e) && u890.j(this.f, z2g0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        xy01 xy01Var = this.c;
        int iHashCode = (iD + (xy01Var == null ? 0 : xy01Var.hashCode())) * 31;
        o5a o5aVar = this.d;
        int iHashCode2 = (iHashCode + (o5aVar == null ? 0 : o5aVar.hashCode())) * 31;
        yo20 yo20Var = this.e;
        int iHashCode3 = (iHashCode2 + (yo20Var == null ? 0 : yo20Var.a.hashCode())) * 31;
        f820 f820Var = this.f;
        return iHashCode3 + (f820Var != null ? f820Var.a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((lby) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        xy01 xy01Var = this.c;
        if (xy01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xy01Var.writeToParcel(parcel, i);
        }
        o5a o5aVar = this.d;
        if (o5aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o5aVar.writeToParcel(parcel, i);
        }
        yo20 yo20Var = this.e;
        if (yo20Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yo20Var.writeToParcel(parcel, i);
        }
        f820 f820Var = this.f;
        if (f820Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f820Var.writeToParcel(parcel, i);
        }
    }
}
