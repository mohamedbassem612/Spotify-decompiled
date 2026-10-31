package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bdn0 {
    public final LinkedHashMap a;

    public /* synthetic */ bdn0() {
        this(new LinkedHashMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdn0) && u890.j(this.a, ((bdn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public bdn0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}
