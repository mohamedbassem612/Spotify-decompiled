package p;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hzh {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public v0i f;
    public final HashSet g;

    public hzh(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(lzy0.a(cls));
        for (Class cls2 : clsArr) {
            hm5.m(cls2, "Null interface");
            this.b.add(lzy0.a(cls2));
        }
    }

    public final void a(wct wctVar) {
        if (this.b.contains(wctVar.a)) {
            hhg1.n("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(wctVar);
        }
    }

    public final vzh b() {
        if (!(this.f != null)) {
            eg.m("Missing required property: factory.");
            return null;
        }
        return new vzh(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e ? 1 : 0, this.f, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            eg.m("Instantiation type has already been set.");
        }
    }

    public hzh(lzy0 lzy0Var, lzy0... lzy0VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(lzy0Var);
        for (lzy0 lzy0Var2 : lzy0VarArr) {
            hm5.m(lzy0Var2, "Null interface");
        }
        Collections.addAll(this.b, lzy0VarArr);
    }
}
