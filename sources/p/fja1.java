package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class fja1 implements Comparator, o5d0 {
    public boolean a(Object obj, Object obj2) {
        return ((m0d) obj).equals((m0d) obj2);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return k0d.b.compare((m0d) obj, (m0d) obj2);
    }

    public abstract void d(int i, int i2, Object obj);

    public boolean f(Object obj, Object obj2) {
        return ((m0d) obj).equals((m0d) obj2);
    }

    public Object g(Object obj, Object obj2) {
        return null;
    }
}
