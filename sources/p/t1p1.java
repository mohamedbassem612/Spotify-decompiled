package p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t1p1 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            k2p1 k2p1Var = (k2p1) this;
            if (Objects.equals(k2p1Var.getKey(), entry.getKey()) && Objects.equals(k2p1Var.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        k2p1 k2p1Var = (k2p1) this;
        Object key = k2p1Var.getKey();
        Object value = k2p1Var.getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        k2p1 k2p1Var = (k2p1) this;
        String strValueOf = String.valueOf(k2p1Var.getKey());
        String strValueOf2 = String.valueOf(k2p1Var.getValue());
        return l1d.q(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
