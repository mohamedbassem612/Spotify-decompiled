package p;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m6n1 implements g7n1 {
    public static final String b;
    public final LinkedHashMap a = new LinkedHashMap();

    static {
        String canonicalName = m6n1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = m6n1.class.getSimpleName();
        }
        b = canonicalName;
    }

    @Override // p.g7n1
    public final int a() {
        LinkedHashMap linkedHashMap = this.a;
        int i = 0;
        if (linkedHashMap.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            l6n1 l6n1Var = (l6n1) ((Map.Entry) it.next()).getValue();
            if (l6n1Var.b != null && l6n1Var.c) {
                i++;
            }
        }
        return i;
    }

    @Override // p.g7n1
    public final z6n1 c(String str) {
        l6n1 l6n1Var = (l6n1) this.a.get(str);
        if (l6n1Var != null) {
            return l6n1Var.b;
        }
        return null;
    }

    @Override // p.g7n1
    public final void e(Context context, String str) {
        LinkedHashMap linkedHashMap = this.a;
        l6n1 l6n1Var = (l6n1) linkedHashMap.get(str);
        if (l6n1Var != null) {
            dn7 dn7Var = l6n1Var.a;
            String strConcat = "***Debug unbinding service connection for ".concat(str);
            utw0 utw0Var = ike1.a;
            utw0Var.y(b);
            utw0Var.o(strConcat, new Object[0]);
            context.unbindService(dn7Var);
            l6n1Var.b = null;
            l6n1Var.c = false;
        }
    }

    @Override // p.g7n1
    public final boolean f(String str) {
        Boolean boolValueOf;
        l6n1 l6n1Var = (l6n1) this.a.get(str);
        if (l6n1Var != null) {
            boolValueOf = Boolean.valueOf(l6n1Var.b != null && l6n1Var.c);
        } else {
            boolValueOf = null;
        }
        return u890.j(boolValueOf, Boolean.TRUE);
    }

    @Override // p.g7n1
    public final ServiceConnection g(String str) {
        return new dn7(this, str, (byte) 3);
    }
}
