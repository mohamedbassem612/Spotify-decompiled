package p;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e2p1 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Map b;

    public /* synthetic */ e2p1(p2p1 p2p1Var) {
        this.a = (byte) 0;
        Objects.requireNonNull(p2p1Var);
        this.b = p2p1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                ((p2p1) map).clear();
                break;
            case 1:
                ((p2p1) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                p2p1 p2p1Var = (p2p1) map;
                Map mapD = p2p1Var.d();
                if (mapD != null) {
                    return mapD.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = p2p1Var.h(entry.getKey());
                    if (iH != -1 && Objects.equals(p2p1Var.b()[iH], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((p2p1) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                p2p1 p2p1Var = (p2p1) map;
                Map mapD = p2p1Var.d();
                return mapD != null ? mapD.entrySet().iterator() : new a2p1(p2p1Var, (byte) 1);
            case 1:
                p2p1 p2p1Var2 = (p2p1) map;
                Map mapD2 = p2p1Var2.d();
                return mapD2 != null ? mapD2.keySet().iterator() : new a2p1(p2p1Var2, (byte) 0);
            default:
                return new u36((y36) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                p2p1 p2p1Var = (p2p1) map;
                Map mapD = p2p1Var.d();
                if (mapD != null) {
                    return mapD.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!p2p1Var.c()) {
                        int iF = p2p1Var.f();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = p2p1Var.a;
                        Objects.requireNonNull(obj2);
                        int iO = mmo1.O(key, value, iF, obj2, p2p1Var.j(), p2p1Var.a(), p2p1Var.b());
                        if (iO != -1) {
                            p2p1Var.e(iO, iF);
                            p2p1Var.f--;
                            p2p1Var.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                p2p1 p2p1Var2 = (p2p1) map;
                Map mapD2 = p2p1Var2.d();
                if (mapD2 != null) {
                    return mapD2.keySet().remove(obj);
                }
                return p2p1Var2.i(obj) != p2p1.g;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return ((p2p1) map).size();
            case 1:
                return ((p2p1) map).size();
            default:
                return ((y36) map).c;
        }
    }

    public /* synthetic */ e2p1(Map map, byte b) {
        this.a = b;
        this.b = map;
    }
}
