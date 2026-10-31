package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t360 {
    public final ArrayList a;

    public t360() {
        this.a = new ArrayList(20);
    }

    public void a(Object obj) {
        c8o.j(obj, "Set contributions cannot be null");
        this.a.add(obj);
    }

    public void b(String str, String str2) {
        m5n1.G(str);
        m5n1.H(str2, str);
        m5n1.f(this, str, str2);
    }

    public void c(String str) {
        int iV0 = ihc1.v0(str, ':', 1, 4);
        if (iV0 != -1) {
            m5n1.f(this, str.substring(0, iV0), str.substring(iV0 + 1));
        } else if (str.charAt(0) == ':') {
            m5n1.f(this, "", str.substring(1));
        } else {
            m5n1.f(this, "", str);
        }
    }

    public Set d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
    }

    public String e(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int iA = bmq0.A(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iA) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void f(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void g(String str, String str2) {
        m5n1.G(str);
        m5n1.H(str2, str);
        f(str);
        m5n1.f(this, str, str2);
    }

    public t360(int i) {
        this.a = new ArrayList(i);
    }
}
