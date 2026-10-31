package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ykg0 extends a9 {
    public final /* synthetic */ byte a;
    public final xkg0 b;

    public /* synthetic */ ykg0(xkg0 xkg0Var, byte b) {
        this.a = b;
        this.b = xkg0Var;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int b() {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return xkg0Var.i;
    }

    public final void clear() {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                xkg0Var.clear();
                break;
            default:
                xkg0Var.clear();
                break;
        }
    }

    public final boolean contains(Object obj) {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iF = xkg0Var.f(entry.getKey());
                if (iF < 0) {
                    return false;
                }
                Object[] objArr = xkg0Var.b;
                objArr.getClass();
                return u890.j(objArr[iF], entry.getValue());
            default:
                return xkg0Var.containsKey(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsAll(Collection collection) {
        boolean zJ;
        switch (this.a) {
            case 0:
                xkg0 xkg0Var = this.b;
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iF = xkg0Var.f(entry.getKey());
                        if (iF < 0) {
                            zJ = false;
                        } else {
                            Object[] objArr = xkg0Var.b;
                            objArr.getClass();
                            zJ = u890.j(objArr[iF], entry.getValue());
                        }
                        if (!zJ) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super/*java.util.AbstractCollection*/.containsAll(collection);
        }
    }

    public final boolean isEmpty() {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return xkg0Var.isEmpty();
    }

    public final Iterator iterator() {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                return new ukg0(xkg0Var, false);
            default:
                return new wkg0(xkg0Var);
        }
    }

    public final boolean remove(Object obj) {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    xkg0Var.c();
                    int iF = xkg0Var.f(entry.getKey());
                    if (iF >= 0) {
                        Object[] objArr = xkg0Var.b;
                        objArr.getClass();
                        if (u890.j(objArr[iF], entry.getValue())) {
                            xkg0Var.j(iF);
                            return true;
                        }
                    }
                }
                return false;
            default:
                xkg0Var.c();
                int iF2 = xkg0Var.f(obj);
                if (iF2 < 0) {
                    return false;
                }
                xkg0Var.j(iF2);
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                xkg0Var.c();
                break;
            default:
                xkg0Var.c();
                break;
        }
        return super/*java.util.AbstractCollection*/.removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        xkg0 xkg0Var = this.b;
        switch (b) {
            case 0:
                xkg0Var.c();
                break;
            default:
                xkg0Var.c();
                break;
        }
        return super/*java.util.AbstractCollection*/.retainAll(collection);
    }
}
