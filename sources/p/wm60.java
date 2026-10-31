package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wm60 extends dn60 {
    public static final wm60 e;

    static {
        LinkedHashMap linkedHashMap = co0.b;
        e = new wm60("viewability", 0.5f);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wm60);
    }

    public final int hashCode() {
        return -816095265;
    }

    public final String toString() {
        return "Viewability";
    }
}
