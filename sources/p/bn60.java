package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bn60 extends dn60 {
    public static final bn60 e;

    static {
        LinkedHashMap linkedHashMap = co0.b;
        e = new bn60("visible_gt_0", 0.01f);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bn60);
    }

    public final int hashCode() {
        return 1784027639;
    }

    public final String toString() {
        return "VisibleGreaterThanZero";
    }
}
