package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class erb implements nrb {
    public final Map a;

    public erb(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erb) && u890.j(this.a, ((erb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
