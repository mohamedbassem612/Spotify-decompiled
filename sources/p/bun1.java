package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bun1 extends jtn1 {
    public final transient mmn1 c;
    public final transient Object[] d;
    public final transient int e;

    public bun1(mmn1 mmn1Var, Object[] objArr, int i) {
        this.c = mmn1Var;
        this.d = objArr;
        this.e = i;
    }

    @Override // p.srn1
    public final int b(Object[] objArr) {
        return e().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // p.jtn1
    public final dsn1 k() {
        return new wtn1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
