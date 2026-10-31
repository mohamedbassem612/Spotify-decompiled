package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v491 implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<v491> CREATOR = new yx81((byte) 2);
    public final ivd a;
    public final long b;
    public final Set c;

    public v491(ivd ivdVar, long j, Set set) {
        this.a = ivdVar;
        this.b = j;
        this.c = set;
    }

    public static v491 h(v491 v491Var, ivd ivdVar, LinkedHashSet linkedHashSet, int i) {
        long j = v491Var.b;
        Set set = linkedHashSet;
        if ((i & 4) != 0) {
            set = v491Var.c;
        }
        return new v491(ivdVar, j, set);
    }

    @Override // p.mvd
    public final Object a(Collection collection) {
        return h(this, this.a.a(collection), dm61.y0(this.c, collection), 2);
    }

    @Override // p.mvd
    public final Object b(i iVar) {
        return h(this, this.a.b(iVar), dm61.x0(iVar.getUri(), this.c), 2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v491)) {
            return false;
        }
        v491 v491Var = (v491) obj;
        return u890.j(this.a, v491Var.a) && this.b == v491Var.b && u890.j(this.c, v491Var.c);
    }

    @Override // p.mvd
    public final /* bridge */ /* synthetic */ Object g(i iVar) {
        return j(iVar, z6x.a, false);
    }

    public final List getItems() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }

    public final v491 j(i iVar, List list, boolean z) {
        return h(this, this.a.k(iVar, list, z), null, 6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
        Iterator itH = k4s0.h(this.c, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
    }

    public /* synthetic */ v491(ivd ivdVar) {
        this(ivdVar, 0L, w7x.a);
    }
}
