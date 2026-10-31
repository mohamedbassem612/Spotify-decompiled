package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cts implements ipb1 {
    public final dts a;
    public final String b;
    public final mc41 c;
    public final ArrayList d;
    public Object e;
    public Bundle f;

    public cts(Object obj, dts dtsVar, String str, mc41 mc41Var) {
        this.a = dtsVar;
        this.b = str;
        this.c = mc41Var;
        this.d = new ArrayList();
        this.e = obj;
    }

    @Override // p.ipb1
    public final void a(jpb1 jpb1Var) {
        this.d.add(jpb1Var);
        Object obj = this.e;
        if (obj != null) {
            jpb1Var.onStateUpdate(obj);
        }
    }

    @Override // p.ipb1
    public final boolean b() {
        return this.e != null;
    }

    @Override // p.ipb1
    public final Bundle c() {
        return this.f;
    }

    @Override // p.ipb1
    public final void d(jpb1 jpb1Var) {
        this.d.remove(jpb1Var);
    }

    @Override // p.ipb1
    public final void e(Object obj) {
        this.e = obj;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((jpb1) it.next()).onStateUpdate(obj);
        }
    }

    @Override // p.ipb1
    public final Object getState() {
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        hhg1.n("Element state cannot be null");
        return null;
    }

    @Override // p.ipb1
    public final String i() {
        return this.b;
    }

    @Override // p.ipb1
    public final void j(Bundle bundle) {
        this.f = bundle;
    }

    @Override // p.ipb1
    public final dts k() {
        return this.a;
    }

    @Override // p.ipb1
    public final Bundle serialize() {
        Bundle bundleD;
        Object obj = this.e;
        return (obj == null || (bundleD = this.c.d(obj)) == null) ? new Bundle() : bundleD;
    }

    public cts() {
        this(null, null, null, new o7x());
    }
}
