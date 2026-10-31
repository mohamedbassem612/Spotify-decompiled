package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class je30 implements bj90 {
    public static final je30 a = new je30();

    @Override // p.bj90
    public final int c(uv11 uv11Var) {
        Integer numC0;
        String str = (String) uv11Var.e.get("item_count");
        if (str == null || (numC0 = nhc1.c0(str)) == null) {
            return 0;
        }
        if (numC0.intValue() < 0) {
            numC0 = null;
        }
        if (numC0 != null) {
            return numC0.intValue();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof je30);
    }

    public final int hashCode() {
        return -1346402364;
    }

    public final String toString() {
        return "FormatListAttributeItemCountProvider";
    }
}
