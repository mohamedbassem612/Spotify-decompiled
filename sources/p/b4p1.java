package p;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b4p1 extends k5n1 {
    public final m3p1 b;
    public Object c;
    public k5n1 d;

    public b4p1(p4p1 p4p1Var) {
        super((byte) 8);
        this.b = p4p1Var.a.entrySet().m().listIterator(0);
        this.c = null;
        this.d = s4p1.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext() || this.b.hasNext();
    }

    @Override // p.k5n1, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            this.d = ((j3p1) entry.getValue()).b();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.d.next());
    }
}
