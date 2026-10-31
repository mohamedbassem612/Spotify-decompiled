package p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m431 implements b431 {
    public final /* synthetic */ n431 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Class d;

    public m431(n431 n431Var, String str, String str2, Class cls) {
        this.a = n431Var;
        this.b = str;
        this.c = str2;
        this.d = cls;
    }

    public final void a(Object obj, String str) {
        n431 n431Var = this.a;
        n431Var.b.add(this.b);
        Class cls = this.d;
        String str2 = this.c;
        String strA = n431.a(str2, cls);
        Iterator it = n431Var.b.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.equals(strA) && nhc1.Y(str3, str2, false)) {
                it.remove();
            }
        }
    }

    public final void unregister() {
        n431 n431Var = this.a;
        HashSet hashSet = n431Var.b;
        String str = this.b;
        hashSet.remove(str);
        n431Var.a.remove(str);
    }
}
