package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hv81 implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<hv81> CREATOR = new ro71((byte) 26);
    public final el51 a;
    public final ivd b;
    public final long c;
    public final Set d;

    public hv81(el51 el51Var, ivd ivdVar, long j, Set set) {
        this.a = el51Var;
        this.b = ivdVar;
        this.c = j;
        this.d = set;
    }

    public static hv81 h(hv81 hv81Var, ivd ivdVar, LinkedHashSet linkedHashSet, int i) {
        el51 el51Var = hv81Var.a;
        long j = hv81Var.c;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = hv81Var.d;
        }
        return new hv81(el51Var, ivdVar, j, set);
    }

    public final Object a(Collection collection) {
        return h(this, this.b.n(collection), dm61.y0(this.d, collection), 5);
    }

    public final Object b(i iVar) {
        return h(this, this.b.l(iVar), dm61.x0(iVar.getUri(), this.d), 5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv81)) {
            return false;
        }
        hv81 hv81Var = (hv81) obj;
        return u890.j(this.a, hv81Var.a) && u890.j(this.b, hv81Var.b) && this.c == hv81Var.c && u890.j(this.d, hv81Var.d);
    }

    public final Object g(i iVar) {
        return h(this, this.b.k(iVar, z6x.a, false), null, 13);
    }

    public final List getItems() {
        return this.b.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
        Iterator itH = k4s0.h(this.d, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
    }

    public /* synthetic */ hv81(el51 el51Var, ivd ivdVar, long j) {
        this(el51Var, ivdVar, j, w7x.a);
    }
}
