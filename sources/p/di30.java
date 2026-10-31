package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class di30 extends xbk1 {
    public static final ci30 h = new ci30();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public di30(boolean z) {
        this.e = z;
    }

    @Override // p.xbk1
    public final void S() {
        if (th30.P(3)) {
            toString();
        }
        this.f = true;
    }

    public final void T(zf30 zf30Var) {
        if (this.g) {
            th30.P(2);
            return;
        }
        String str = zf30Var.e;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(zf30Var.e, zf30Var);
        if (th30.P(2)) {
            zf30Var.toString();
        }
    }

    public final void U(String str, boolean z) {
        th30.P(3);
        V(str, z);
    }

    public final void V(String str, boolean z) {
        HashMap map = this.c;
        di30 di30Var = (di30) map.get(str);
        if (di30Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(di30Var.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    di30Var.U((String) it.next(), true);
                }
            }
            di30Var.S();
            map.remove(str);
        }
        HashMap map2 = this.d;
        rck1 rck1Var = (rck1) map2.get(str);
        if (rck1Var != null) {
            rck1Var.a();
            map2.remove(str);
        }
    }

    public final void W(zf30 zf30Var) {
        if (this.g) {
            th30.P(2);
        } else {
            if (this.b.remove(zf30Var.e) == null || !th30.P(2)) {
                return;
            }
            zf30Var.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || di30.class != obj.getClass()) {
            return false;
        }
        di30 di30Var = (di30) obj;
        return this.b.equals(di30Var.b) && this.c.equals(di30Var.c) && this.d.equals(di30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
