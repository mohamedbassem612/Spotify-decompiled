package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class v8 extends AbstractCollection {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ v8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((x8) obj).b();
                break;
            case 1:
                ((b8) obj).b();
                break;
            case 2:
                ((muh) obj).clear();
                break;
            case 3:
                ((ipg0) obj).clear();
                break;
            case 4:
                ((AbstractMap) obj).clear();
                break;
            case 5:
                ((rpn1) obj).clear();
                break;
            default:
                ((q7) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((x8) obj2).c(entry.getKey(), entry.getValue());
            case 1:
                return ((b8) obj2).d(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((ipg0) obj2).containsValue(obj);
            case 4:
                return ((AbstractMap) obj2).containsValue(obj);
            case 6:
                return ((q7) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                return ((ipg0) obj).isEmpty();
            case 4:
                return ((AbstractMap) obj).isEmpty();
            case 5:
            default:
                return super.isEmpty();
            case 6:
                return ((q7) obj).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((x8) obj).i();
            case 1:
                return new n7((b8) obj, (byte) 0);
            case 2:
                muh muhVar = (muh) obj;
                Map mapC = muhVar.c();
                return mapC != null ? mapC.values().iterator() : new iuh(muhVar, b2);
            case 3:
                return new jog0((ipg0) obj, (byte) 2);
            case 4:
                return new oqg0(((AbstractMap) obj).entrySet().iterator(), (byte) 1);
            case 5:
                rpn1 rpn1Var = (rpn1) obj;
                Map mapD = rpn1Var.d();
                return mapD != null ? mapD.values().iterator() : new mnn1(rpn1Var, b2);
            default:
                return new csn1(((q7) obj).entrySet().iterator(), (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((x8) obj2).l(entry.getKey(), entry.getValue());
            case 4:
                AbstractMap abstractMap = (AbstractMap) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (zno1.k(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                q7 q7Var = (q7) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : q7Var.entrySet()) {
                        if (poo1.K(obj, entry3.getValue())) {
                            q7Var.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 5:
            default:
                return super.removeAll(collection);
            case 6:
                q7 q7Var = (q7) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : q7Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((mkn1) q7Var.e).b().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 5:
            default:
                return super.retainAll(collection);
            case 6:
                q7 q7Var = (q7) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : q7Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((mkn1) q7Var.e).b().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((x8) obj).m();
            case 1:
                return ((b8) obj).f;
            case 2:
                return ((muh) obj).size();
            case 3:
                return ((ipg0) obj).size();
            case 4:
                return ((AbstractMap) obj).size();
            case 5:
                return ((rpn1) obj).size();
            default:
                return ((q7) obj).b.size();
        }
    }

    public /* synthetic */ v8(AbstractMap abstractMap, byte b) {
        this.a = b;
        this.b = abstractMap;
    }
}
