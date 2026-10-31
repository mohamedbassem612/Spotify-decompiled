package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class q7 extends AbstractMap {
    public final /* synthetic */ byte a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ q7(Serializable serializable, Map map, byte b) {
        this.a = b;
        this.e = serializable;
        this.b = map;
    }

    public t280 a(Map.Entry entry) {
        Object key = entry.getKey();
        return new t280(key, ((b8) this.e).q(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        byte b = this.a;
        Map map = this.b;
        Serializable serializable = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b8 b8Var = (b8) serializable;
                if (map != b8Var.e) {
                    p7 p7Var = new p7(this);
                    while (p7Var.hasNext()) {
                        p7Var.next();
                        p7Var.remove();
                    }
                } else {
                    b8Var.b();
                }
                break;
            default:
                rpn1 rpn1Var = ((mkn1) serializable).c;
                if (map != rpn1Var) {
                    p7 p7Var2 = new p7(this, (byte) 0);
                    while (p7Var2.hasNext()) {
                        p7Var2.next();
                        p7Var2.remove();
                    }
                } else {
                    Iterator it = rpn1Var.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    rpn1Var.clear();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                o7 o7Var = (o7) this.c;
                if (o7Var != null) {
                    return o7Var;
                }
                o7 o7Var2 = new o7(this, (byte) 0);
                this.c = o7Var2;
                return o7Var2;
            default:
                ucn1 ucn1Var = (ucn1) this.c;
                if (ucn1Var != null) {
                    return ucn1Var;
                }
                ucn1 ucn1Var2 = new ucn1(this);
                this.c = ucn1Var2;
                return ucn1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this == obj || this.b.equals(obj);
            default:
                return this == obj || this.b.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                return ((b8) serializable).q(obj, collection);
            default:
                map.getClass();
                try {
                    obj3 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                mkn1 mkn1Var = (mkn1) serializable;
                List list = (List) collection2;
                return list instanceof RandomAccess ? new ufn1(mkn1Var, obj, list, null) : new yhn1(mkn1Var, obj, list, null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b.hashCode();
            default:
                return this.b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        byte b = this.a;
        Serializable serializable = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((b8) serializable).k();
            default:
                mkn1 mkn1Var = (mkn1) serializable;
                ucn1 ucn1Var = mkn1Var.a;
                if (ucn1Var != null) {
                    return ucn1Var;
                }
                ucn1 ucn1Var2 = new ucn1(mkn1Var, mkn1Var.c);
                mkn1Var.a = ucn1Var2;
                return ucn1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b8 b8Var = (b8) this.e;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection collectionN = b8Var.n();
                collectionN.addAll(collection);
                b8Var.f -= collection.size();
                collection.clear();
                return collectionN;
            default:
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                v8 v8Var = (v8) this.d;
                if (v8Var != null) {
                    return v8Var;
                }
                v8 v8Var2 = new v8((AbstractMap) this, (byte) 4);
                this.d = v8Var2;
                return v8Var2;
            default:
                v8 v8Var3 = (v8) this.d;
                if (v8Var3 != null) {
                    return v8Var3;
                }
                v8 v8Var4 = new v8((AbstractMap) this, (byte) 6);
                this.d = v8Var4;
                return v8Var4;
        }
    }
}
