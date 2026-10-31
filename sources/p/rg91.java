package p;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class rg91 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AbstractMap b;

    public /* synthetic */ rg91(AbstractMap abstractMap, byte b) {
        this.a = b;
        this.b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        byte b = this.a;
        jg91 jg91Var = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((hg91) jg91Var).g((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((ig91) jg91Var).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                jg91Var.f((Comparable) entry3.getKey(), entry3.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        jg91 jg91Var = this.b;
        switch (b) {
            case 0:
                ((hg91) jg91Var).clear();
                break;
            case 1:
                ((ig91) jg91Var).clear();
                break;
            default:
                jg91Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        jg91 jg91Var = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((hg91) jg91Var).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((ig91) jg91Var).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = jg91Var.get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    return obj4 != null && obj4.equals(value3);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        byte b = this.a;
        jg91 jg91Var = this.b;
        switch (b) {
            case 0:
                return new qg91((hg91) jg91Var, (byte) 0);
            case 1:
                return new qg91((ig91) jg91Var, (byte) 1);
            default:
                return new qg91(jg91Var, (byte) 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        jg91 jg91Var = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((hg91) jg91Var).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((ig91) jg91Var).remove(entry2.getKey());
                return true;
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                jg91Var.remove(entry3.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        jg91 jg91Var = this.b;
        switch (b) {
            case 0:
                return ((hg91) jg91Var).size();
            case 1:
                return ((ig91) jg91Var).size();
            default:
                return jg91Var.size();
        }
    }
}
