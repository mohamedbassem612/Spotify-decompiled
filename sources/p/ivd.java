package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ivd implements mvd, Parcelable {
    public static final Parcelable.Creator<ivd> CREATOR = new xud((byte) 1);
    public final List a;
    public final boolean b;
    public final el51 c;
    public final Set d;
    public final r87 e;

    public ivd(List list, boolean z, el51 el51Var, Set set, r87 r87Var) {
        this.a = list;
        this.b = z;
        this.c = el51Var;
        this.d = set;
        this.e = r87Var;
    }

    public static ivd h(ivd ivdVar, ArrayList arrayList, boolean z, LinkedHashSet linkedHashSet, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = ivdVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = ivdVar.b;
        }
        boolean z2 = z;
        el51 el51Var = ivdVar.c;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = ivdVar.d;
        }
        return new ivd(list2, z2, el51Var, set, ivdVar.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivd)) {
            return false;
        }
        ivd ivdVar = (ivd) obj;
        return u890.j(this.a, ivdVar.a) && this.b == ivdVar.b && u890.j(this.c, ivdVar.c) && u890.j(this.d, ivdVar.d) && u890.j(this.e, ivdVar.e);
    }

    @Override // p.mvd
    public final /* bridge */ /* synthetic */ Object g(i iVar) {
        return k(iVar, z6x.a, false);
    }

    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        el51 el51Var = this.c;
        return this.e.hashCode() + gvg.c((iG + (el51Var == null ? 0 : el51Var.hashCode())) * 31, 31, this.d);
    }

    public final ivd j(List list) {
        return h(this, o7h.N0(list, this.a), !list.isEmpty(), null, 28);
    }

    public final ivd k(i iVar, List list, boolean z) {
        List list2 = this.a;
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((i) it.next()).getUri(), iVar.getUri())) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return this;
        }
        ArrayList arrayList = new ArrayList(list2);
        if (z) {
            arrayList.remove(i);
        }
        List list3 = list;
        if (!list3.isEmpty()) {
            if (!z) {
                i++;
            }
            arrayList.addAll(i, list3);
        }
        return h(this, arrayList, false, null, 30);
    }

    @Override // p.mvd
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ivd b(i iVar) {
        return h(this, null, false, dm61.x0(iVar.getUri(), this.d), 23);
    }

    @Override // p.mvd
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ivd a(Collection collection) {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            i iVar = (i) obj;
            if (!collection.contains(iVar.getUri()) || this.d.contains(iVar.getUri())) {
                arrayList.add(obj);
            }
        }
        return h(this, arrayList, false, null, 30);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        el51 el51Var = this.c;
        if (el51Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            el51Var.writeToParcel(parcel, i);
        }
        Iterator itH = k4s0.h(this.d, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        this.e.writeToParcel(parcel, i);
    }
}
