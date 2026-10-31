package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class csi1 extends dn90 {
    public final LinkedHashMap e;

    public csi1(LinkedHashMap linkedHashMap) {
        super(6, (byte) 6);
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csi1) && this.e.equals(((csi1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
