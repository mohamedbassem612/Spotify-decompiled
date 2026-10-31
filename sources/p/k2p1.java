package p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k2p1 extends t1p1 {
    public final Object a;
    public int b;
    public final /* synthetic */ p2p1 c;

    public k2p1(p2p1 p2p1Var, int i) {
        Objects.requireNonNull(p2p1Var);
        this.c = p2p1Var;
        this.a = p2p1Var.a()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        p2p1 p2p1Var = this.c;
        if (i != -1 && i < p2p1Var.size()) {
            if (Objects.equals(obj, p2p1Var.a()[this.b])) {
                return;
            }
        }
        this.b = p2p1Var.h(obj);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        p2p1 p2p1Var = this.c;
        Map mapD = p2p1Var.d();
        if (mapD != null) {
            return mapD.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return p2p1Var.b()[i];
    }

    public final Object setValue(Object obj) {
        p2p1 p2p1Var = this.c;
        Map mapD = p2p1Var.d();
        Object obj2 = this.a;
        if (mapD != null) {
            return mapD.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            p2p1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = p2p1Var.b()[i];
        p2p1Var.b()[this.b] = obj;
        return obj3;
    }
}
