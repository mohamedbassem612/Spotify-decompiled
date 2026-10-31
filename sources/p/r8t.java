package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r8t implements ilq0 {
    public static final Parcelable.Creator<r8t> CREATOR = new qms((byte) 6);
    public final Set a;
    public final tv80 b;

    public r8t(Set set, tv80 tv80Var) {
        this.a = set;
        this.b = tv80Var;
    }

    public final ilq0 b1(htv htvVar) {
        c380 c380Var = htvVar.l;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((ftv) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList);
        Set set = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (setP1.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Set setP2 = o7h.p1(arrayList2);
        if (setP2.isEmpty()) {
            return null;
        }
        return setP2.size() < set.size() ? new r8t(setP2, this.b) : this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8t)) {
            return false;
        }
        r8t r8tVar = (r8t) obj;
        return this.a.equals(r8tVar.a) && u890.j(this.b, r8tVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public final htv p0(htv htvVar) {
        c380 c380Var = htvVar.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (!this.a.contains(((ftv) obj).a)) {
                arrayList.add(obj);
            }
        }
        return htv.a(htvVar, false, false, false, null, null, null, null, null, mqo1.A(arrayList), 2047);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        parcel.writeParcelable(this.b, i);
    }
}
