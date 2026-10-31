package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class etv implements Parcelable {
    public static final Parcelable.Creator<etv> CREATOR = new s5v((byte) 13);
    public final int a;
    public final List b;
    public final c380 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;

    public etv(int i, List list, c380 c380Var) {
        this.a = i;
        this.b = list;
        this.c = c380Var;
        this.d = i > 0;
        this.e = i < list.size();
        this.f = i > 0;
        this.g = list.subList(0, i);
    }

    public static etv a(etv etvVar, int i, List list, c380 c380Var, int i2) {
        if ((i2 & 1) != 0) {
            i = etvVar.a;
        }
        if ((i2 & 2) != 0) {
            list = etvVar.b;
        }
        if ((i2 & 4) != 0) {
            c380Var = etvVar.c;
        }
        etvVar.getClass();
        return new etv(i, list, c380Var);
    }

    public final boolean b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etv)) {
            return false;
        }
        etv etvVar = (etv) obj;
        return this.a == etvVar.a && u890.j(this.b, etvVar.b) && u890.j(this.c, etvVar.c);
    }

    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            ((ftv) itL.next()).writeToParcel(parcel, i);
        }
    }

    public etv(int i, c380 c380Var) {
        this(0, z6x.a, (i & 4) != 0 ? fg91.b : c380Var);
    }
}
