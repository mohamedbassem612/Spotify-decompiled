package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bkf1 implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<bkf1> CREATOR = new r8f1((byte) 8);
    public final String a;
    public final String b;
    public final long c;
    public final ivd d;
    public final Set e;

    public bkf1(String str, String str2, long j, ivd ivdVar, Set set) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = ivdVar;
        this.e = set;
    }

    public static bkf1 h(bkf1 bkf1Var, ivd ivdVar, LinkedHashSet linkedHashSet, int i) {
        String str = bkf1Var.a;
        String str2 = bkf1Var.b;
        long j = bkf1Var.c;
        Set set = linkedHashSet;
        if ((i & 16) != 0) {
            set = bkf1Var.e;
        }
        return new bkf1(str, str2, j, ivdVar, set);
    }

    public final Object a(Collection collection) {
        return h(this, this.d.n(collection), dm61.y0(this.e, collection), 7);
    }

    public final Object b(i iVar) {
        return h(this, this.d.l(iVar), dm61.x0(iVar.getUri(), this.e), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkf1)) {
            return false;
        }
        bkf1 bkf1Var = (bkf1) obj;
        return u890.j(this.a, bkf1Var.a) && u890.j(this.b, bkf1Var.b) && this.c == bkf1Var.c && u890.j(this.d, bkf1Var.d) && u890.j(this.e, bkf1Var.e);
    }

    public final /* bridge */ /* synthetic */ Object g(i iVar) {
        return j(iVar, z6x.a);
    }

    public final List getItems() {
        return this.d.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31)) * 31);
    }

    public final bkf1 j(i iVar, List list) {
        return h(this, this.d.k(iVar, list, false), null, 23);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        this.d.writeToParcel(parcel, i);
        Iterator itH = k4s0.h(this.e, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
    }

    public /* synthetic */ bkf1(String str, String str2, long j, ivd ivdVar) {
        this(str, str2, j, ivdVar, w7x.a);
    }
}
