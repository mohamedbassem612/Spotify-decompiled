package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vkg0 implements Map.Entry, rla0 {
    public final xkg0 a;
    public final int b;
    public final int c;

    public vkg0(xkg0 xkg0Var, int i) {
        this.a = xkg0Var;
        this.b = i;
        this.c = xkg0Var.h;
    }

    public final void a() {
        if (this.a.h != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return u890.j(entry.getKey(), getKey()) && u890.j(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.b;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        xkg0 xkg0Var = this.a;
        xkg0Var.c();
        Object[] objArr = xkg0Var.b;
        if (objArr == null) {
            int length = xkg0Var.a.length;
            if (length < 0) {
                hhg1.n("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            xkg0Var.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
