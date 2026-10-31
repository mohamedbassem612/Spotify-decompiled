package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e95 implements tif1 {
    public static final e95 a = new e95();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // p.tif1
    public final void c(String str, String str2) {
        c95 c95Var = (c95) b.get(new d95(str, str2));
        if (c95Var == null || c95Var.b == 2) {
            return;
        }
        mif1.e(c95Var.a(), 0);
        c95Var.b = 2;
        mif1.d(c95Var.a(), 0);
    }

    @Override // p.tif1
    public final void e(int i, String str, String str2) {
        Object objPutIfAbsent;
        d95 d95Var = new d95(str, str2);
        ConcurrentHashMap concurrentHashMap = b;
        Object c95Var = concurrentHashMap.get(d95Var);
        if (c95Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(d95Var, (c95Var = new c95(d95Var, i)))) != null) {
            c95Var = objPutIfAbsent;
        }
        mif1.d(((c95) c95Var).a(), 0);
    }

    @Override // p.tif1
    public final void f(String str, String str2) {
        c95 c95Var = (c95) b.remove(new d95(str, str2));
        if (c95Var == null) {
            return;
        }
        mif1.e(c95Var.a(), 0);
    }
}
