package p;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oe41 {
    public final pe41 a;
    public uk b;

    public oe41(pe41 pe41Var) {
        this.a = pe41Var;
    }

    public final Bundle a(String str) {
        pe41 pe41Var = this.a;
        if (!pe41Var.g) {
            eg.m("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = pe41Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleH = mue1.z(bundle, str) ? mue1.H(bundle, str) : null;
        bundle.remove(str);
        if (mue1.K(bundle)) {
            pe41Var.f = null;
        }
        return bundleH;
    }

    public final ne41 b(String str) {
        ne41 ne41Var;
        pe41 pe41Var = this.a;
        synchronized (pe41Var.c) {
            Iterator it = pe41Var.d.entrySet().iterator();
            do {
                ne41Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                ne41 ne41Var2 = (ne41) entry.getValue();
                if (u890.j(str2, str)) {
                    ne41Var = ne41Var2;
                }
            } while (ne41Var == null);
        }
        return ne41Var;
    }

    public final void c(String str, ne41 ne41Var) {
        pe41 pe41Var = this.a;
        synchronized (pe41Var.c) {
            if (pe41Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            pe41Var.d.put(str, ne41Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            eg.m("Can not perform this action after onSaveInstanceState");
            return;
        }
        uk ukVar = this.b;
        if (ukVar == null) {
            ukVar = new uk(this);
        }
        this.b = ukVar;
        try {
            n1c0.class.getDeclaredConstructor(null);
            uk ukVar2 = this.b;
            if (ukVar2 != null) {
                ukVar2.b(n1c0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + n1c0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void e(String str) {
        pe41 pe41Var = this.a;
        synchronized (pe41Var.c) {
        }
    }
}
