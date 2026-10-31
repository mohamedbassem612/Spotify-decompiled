package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cen0 {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    public cen0(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }

    public final void a(mnv0 mnv0Var, Object obj) {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            eg.m("Do mutate preferences once returned to DataStore.");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                eg.m("Do mutate preferences once returned to DataStore.");
                return;
            } else {
                linkedHashMap.remove(mnv0Var);
                return;
            }
        }
        if (obj instanceof Set) {
            linkedHashMap.put(mnv0Var, Collections.unmodifiableSet(o7h.p1((Iterable) obj)));
        } else {
            linkedHashMap.put(mnv0Var, obj);
        }
    }

    public final cen0 b() {
        return new cen0(sqg0.X(Collections.unmodifiableMap(this.a)), false);
    }

    public final cen0 c() {
        return new cen0(sqg0.X(Collections.unmodifiableMap(this.a)), true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cen0)) {
            return false;
        }
        return u890.j(this.a, ((cen0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o7h.y0(this.a.entrySet(), ",\n", "{\n", "\n}", sbn0.h, 24);
    }

    public /* synthetic */ cen0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
