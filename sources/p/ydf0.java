package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ydf0 {
    public final int a;
    public final eb80 b;
    public final cua c;
    public int d;
    public int e;
    public int f;

    public ydf0(int i) {
        this.a = i;
        if (i <= 0) {
            eqr0.N("maxSize <= 0");
            throw null;
        }
        this.b = new eb80((byte) 20);
        this.c = new cua((byte) 15);
    }

    public Object a(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object objZ;
        synchronized (this.c) {
            Object objQ = this.b.q(obj);
            if (objQ != null) {
                this.e++;
                return objQ;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    objZ = this.b.z(obj, objA);
                    if (objZ != null) {
                        this.b.z(obj, objZ);
                    } else {
                        this.d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objZ != null) {
                b(obj, objA, objZ);
                return objZ;
            }
            f(this.a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objZ;
        synchronized (this.c) {
            this.d++;
            objZ = this.b.z(obj, obj2);
            if (objZ != null) {
                this.d--;
            }
        }
        if (objZ != null) {
            b(obj, objZ, obj2);
        }
        f(this.a);
        return objZ;
    }

    public final Object e(Object obj) {
        Object objA;
        synchronized (this.c) {
            objA = this.b.A(obj);
            if (objA != null) {
                this.d--;
            }
        }
        if (objA != null) {
            b(obj, objA, null);
        }
        return objA;
    }

    public final void f(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.s() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.s()) {
                        Map.Entry entry = (Map.Entry) o7h.r0(this.b.r());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.b.A(key);
                        this.d--;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void b(Object obj, Object obj2, Object obj3) {
    }
}
