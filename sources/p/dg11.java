package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dg11 extends t380 {
    public final transient j380 d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int g;

    /* JADX WARN: Multi-variable type inference failed */
    public dg11(j380 j380Var, Object[] objArr, int i, int i2) {
        this.d = j380Var;
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // p.q280
    public final int c(int i, Object[] objArr) {
        return b().c(i, objArr);
    }

    @Override // p.q280, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // p.q280
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public final mjh1 iterator() {
        return b().listIterator(0);
    }

    @Override // p.t380
    public final b380 r() {
        return new cg11(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // p.t380, p.q280
    public Object writeReplace() {
        return super.writeReplace();
    }
}
