package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u5p1 extends i4p1 {
    public final transient c6p1 c;
    public final transient Object[] d;
    public final transient int e;

    public u5p1(c6p1 c6p1Var, Object[] objArr, int i) {
        this.c = c6p1Var;
        this.d = objArr;
        this.e = i;
    }

    public final k5n1 b() {
        return m().l(0);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.c.get(key));
    }

    public final boolean f() {
        return true;
    }

    public final int i(Object[] objArr) {
        return m().i(objArr);
    }

    public final /* synthetic */ Iterator iterator() {
        return m().l(0);
    }

    public final r3p1 n() {
        return new l5p1(this);
    }

    public final int size() {
        return this.e;
    }
}
