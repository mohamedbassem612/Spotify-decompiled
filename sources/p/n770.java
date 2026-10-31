package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final enum n770 extends r770 {
    public final int h(y570 y570Var) {
        String strB = y570Var.g().B("style");
        if ("error".equals(strB)) {
            return r770.d;
        }
        boolean zEquals = "noResults".equals(strB);
        int i = r770.e;
        if (zEquals) {
            return i;
        }
        n57.e("Unsupported empty state style: " + strB);
        return i;
    }
}
