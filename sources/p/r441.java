package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r441 implements Iterable {
    public o441 a;
    public o441 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final Object b(Object obj, Object obj2) {
        o441 o441Var = this.a;
        while (o441Var != null && !o441Var.a.equals(obj)) {
            o441Var = o441Var.c;
        }
        if (o441Var != null) {
            return o441Var.b;
        }
        o441 o441Var2 = new o441(obj, obj2);
        this.d++;
        o441 o441Var3 = this.b;
        if (o441Var3 == null) {
            this.a = o441Var2;
            this.b = o441Var2;
            return null;
        }
        o441Var3.c = o441Var2;
        o441Var2.d = o441Var3;
        this.b = o441Var2;
        return null;
    }

    public final Object c(Object obj) {
        o441 o441Var = this.a;
        while (o441Var != null && !o441Var.a.equals(obj)) {
            o441Var = o441Var.c;
        }
        if (o441Var == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((q441) it.next()).a(o441Var);
            }
        }
        o441 o441Var2 = o441Var.d;
        o441 o441Var3 = o441Var.c;
        if (o441Var2 != null) {
            o441Var2.c = o441Var3;
        } else {
            this.a = o441Var3;
        }
        o441 o441Var4 = o441Var.c;
        if (o441Var4 != null) {
            o441Var4.d = o441Var2;
        } else {
            this.b = o441Var2;
        }
        o441Var.c = null;
        o441Var.d = null;
        return o441Var.b;
    }

    public final boolean equals(Object obj) {
        n441 n441Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r441)) {
            return false;
        }
        r441 r441Var = (r441) obj;
        if (this.d != r441Var.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = r441Var.iterator();
        while (true) {
            n441Var = (n441) it;
            if (!n441Var.hasNext()) {
                break;
            }
            n441 n441Var2 = (n441) it2;
            if (!n441Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) n441Var.next();
            Object next = n441Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (n441Var.hasNext() || ((n441) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            n441 n441Var = (n441) it;
            if (!n441Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) n441Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        o441 o441Var = this.a;
        o441 o441Var2 = this.b;
        n441 n441Var = new n441();
        n441Var.a = o441Var2;
        n441Var.b = o441Var;
        this.c.put(n441Var, Boolean.FALSE);
        return n441Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            n441 n441Var = (n441) it;
            if (!n441Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) n441Var.next()).toString());
            if (n441Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
