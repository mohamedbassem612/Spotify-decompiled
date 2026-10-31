package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum h6b0 {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final LinkedHashMap b;
    public final byte a;

    static {
        h6b0[] h6b0VarArrValues = values();
        int iS = zno1.s(h6b0VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (h6b0 h6b0Var : h6b0VarArrValues) {
            linkedHashMap.put(Integer.valueOf(h6b0Var.a), h6b0Var);
        }
        b = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    h6b0(int i2) {
        this.a = i2;
    }
}
