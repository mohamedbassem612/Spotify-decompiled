package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hko1 extends iio1 {
    public final transient Object h;

    public hko1(Object obj) {
        super((byte) 4);
        this.h = obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.equals(obj);
    }

    @Override // p.iio1, java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new wio1(this.h);
    }

    public final int o(Object[] objArr) {
        objArr[0] = this.h;
        return 1;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return 1;
    }

    public final String toString() {
        String string = this.h.toString();
        return l1d.q(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }
}
