package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mm11 implements ez00 {
    public final ArrayList a;

    public mm11(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm11) && this.a.equals(((mm11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
