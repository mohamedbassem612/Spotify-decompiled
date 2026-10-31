package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sxh {
    public static final qxh a = new qxh();
    public static final rxh b = new rxh(-1);
    public static final rxh c = new rxh(1);

    public sxh a(int i, int i2) {
        return qxh.g(Integer.compare(i, i2));
    }

    public sxh b(long j, long j2) {
        return qxh.g(Long.compare(j, j2));
    }

    public sxh c(Object obj, Object obj2, Comparator comparator) {
        return qxh.g(comparator.compare(obj, obj2));
    }

    public sxh d(boolean z, boolean z2) {
        return qxh.g(Boolean.compare(z, z2));
    }

    public sxh e(boolean z, boolean z2) {
        return qxh.g(Boolean.compare(z2, z));
    }

    public int f() {
        return 0;
    }
}
