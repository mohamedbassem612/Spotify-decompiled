package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zou implements bpu {
    public final ArrayList a;

    public zou(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zou) && this.a.equals(((zou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
