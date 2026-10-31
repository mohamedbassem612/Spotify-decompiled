package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tjn1 extends dhn1 {
    public final transient mmn1 h;
    public final transient Object[] i;
    public final transient int t;

    public tjn1(mmn1 mmn1Var, Object[] objArr, int i) {
        super((byte) 1);
        this.h = mmn1Var;
        this.i = objArr;
        this.t = i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    public final int f(Object[] objArr) {
        efn1 djn1Var = this.g;
        if (djn1Var == null) {
            djn1Var = new djn1(this);
            this.g = djn1Var;
        }
        return djn1Var.f(objArr);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        efn1 djn1Var = this.g;
        if (djn1Var == null) {
            djn1Var = new djn1(this);
            this.g = djn1Var;
        }
        return djn1Var.q(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.t;
    }
}
