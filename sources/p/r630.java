package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r630 {
    public final w730 a;
    public final TreeMap b;
    public final TreeMap c;
    public final Scheduler d;

    public r630(w730 w730Var, Scheduler scheduler) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.b = new TreeMap(comparator);
        this.c = new TreeMap(comparator);
        this.a = w730Var;
        this.d = scheduler;
    }

    public static void f(String str, n630 n630Var, boolean z) {
        Logger.d("Failed to %s. Rolling back follow state. %s", new Object[]{z ? "POST" : "DELETE", str});
        n630Var.a(!z);
    }

    public final synchronized void a(i430 i430Var) {
        this.b.put(Uri.decode(i430Var.d()), i430Var);
        d(i430Var.d());
    }

    public final synchronized void b(String str, j630 j630Var) {
        try {
            String strDecode = Uri.decode(str);
            if (!this.c.containsKey(strDecode)) {
                this.c.put(strDecode, Collections.newSetFromMap(mp10.l()));
            }
            ((Set) this.c.get(strDecode)).add(j630Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized i430 c(String str) {
        return (i430) this.b.get(Uri.decode(str));
    }

    public final synchronized void d(String str) {
        String strDecode = Uri.decode(str);
        Set set = (Set) this.c.get(strDecode);
        if (set != null) {
            i430 i430Var = (i430) this.b.get(strDecode);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j630) it.next()).a(i430Var);
            }
        }
    }

    public final synchronized void e(String str) {
        Set set = (Set) this.c.get(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j630) it.next()).b();
            }
        }
    }

    public final synchronized void g(String str, j630 j630Var) {
        Set set = (Set) this.c.get(Uri.decode(str));
        if (set != null) {
            set.remove(j630Var);
        }
    }

    public final synchronized void h(String str, boolean z) {
        String strDecode = Uri.decode(str);
        i430 i430Var = (i430) this.b.get(strDecode);
        this.b.put(strDecode, new i430(i430Var.b(), i430Var.c(), i430Var.d(), i430Var.f(), z));
        d(strDecode);
    }

    public final synchronized void i(String str, boolean z) {
        String strDecode = Uri.decode(str);
        i430 i430Var = (i430) this.b.get(strDecode);
        this.b.put(strDecode, new i430(i430Var.b() + (z ? 1 : -1), i430Var.c(), i430Var.d(), z, i430Var.e()));
        d(strDecode);
    }

    public final synchronized void j(String str, boolean z) {
        String strDecode = Uri.decode(str);
        dm5.n(this.b.containsKey(strDecode), "no model exists for " + strDecode);
        h(strDecode, z);
        l(strDecode, z);
    }

    public final synchronized void k(String str, boolean z) {
        String strDecode = Uri.decode(str);
        dm5.n(this.b.containsKey(strDecode), "no model exists for " + strDecode);
        i(str, z);
        m(str, z);
    }

    public final synchronized void l(String str, boolean z) {
        try {
            String strDecode = Uri.decode(str);
            ord1 ord1Var = new ord1(Collections.singletonList(strDecode));
            n630 n630Var = new n630(this, str, (byte) 0);
            w730 w730Var = this.a;
            (z ? w730Var.d(ord1Var) : w730Var.a(ord1Var)).observeOn(this.d).subscribe(new o630(this, z, strDecode, n630Var), new o630(this, z, n630Var, strDecode));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m(String str, boolean z) {
        try {
            String strDecode = Uri.decode(str);
            ord1 ord1Var = new ord1(Collections.singletonList(strDecode));
            n630 n630Var = new n630(this, str, (byte) 1);
            w730 w730Var = this.a;
            (z ? w730Var.e(ord1Var) : w730Var.c(ord1Var)).observeOn(this.d).subscribe(new p630(strDecode, n630Var, z), new q630(z, n630Var));
        } catch (Throwable th) {
            throw th;
        }
    }
}
