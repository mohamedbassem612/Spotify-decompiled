package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b291 extends t380 {
    public final transient Object d;

    public b291(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // p.t380, p.q280
    public final b380 b() {
        return b380.t(this.d);
    }

    @Override // p.q280
    public final int c(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // p.q280, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // p.t380, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // p.q280
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return t890.t(this.d);
    }

    @Override // p.q280
    public final mjh1 k() {
        return t890.t(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }

    @Override // p.t380, p.q280
    public Object writeReplace() {
        return super.writeReplace();
    }
}
