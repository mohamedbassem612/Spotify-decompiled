package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface mqw {
    lqw a(Object obj, ipb1 ipb1Var);

    default ipb1 b(Object obj, dts dtsVar, String str) {
        return new cts(obj, dtsVar, str, c());
    }

    default mc41 c() {
        return new o7x();
    }

    Object d(Object obj);
}
