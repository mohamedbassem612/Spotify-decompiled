package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mm60 extends sm60 {
    public static final mm60 d;

    static {
        LinkedHashMap linkedHashMap = co0.b;
        d = new mm60("dismissed");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mm60);
    }

    public final int hashCode() {
        return 544241804;
    }

    public final String toString() {
        return "Closed";
    }
}
