package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aom0 implements ilq0 {
    public static final Parcelable.Creator<aom0> CREATOR = new fgm0((byte) 20);
    public final Set a;
    public final String b;

    public aom0(String str, Set set) {
        this.a = set;
        this.b = str;
    }

    public final ilq0 b1(htv htvVar) {
        c380 c380Var = htvVar.l;
        String str = this.b;
        if (str != null) {
            if (c380Var != null && c380Var.isEmpty()) {
                return null;
            }
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                if (u890.j(((ftv) it.next()).a, str)) {
                }
            }
            return null;
        }
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it2 = c380Var.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ftv) it2.next()).a);
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
        return setP2.size() < set.size() ? new aom0(str, setP2) : this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aom0)) {
            return false;
        }
        aom0 aom0Var = (aom0) obj;
        return u890.j(this.a, aom0Var.a) && u890.j(this.b, aom0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final htv p0(htv htvVar) {
        int size;
        ArrayList arrayList = new ArrayList((Collection) htvVar.l);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (this.a.contains(((ftv) obj).a)) {
                arrayList2.add(obj);
            }
        }
        r7h.a0(arrayList, new xkm0(this, (byte) 1));
        String str = this.b;
        if (str == null) {
            size = arrayList.size();
        } else {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (u890.j(((ftv) it.next()).a, str)) {
                    break;
                }
                i++;
            }
            size = i < 0 ? 0 : i;
        }
        arrayList.addAll(size, arrayList2);
        return htv.a(htvVar, false, false, false, (x7i1) null, (gtv) null, (Map) null, (etv) null, (ArrayList) null, mqo1.A(arrayList), 2047);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        parcel.writeString(this.b);
    }
}
