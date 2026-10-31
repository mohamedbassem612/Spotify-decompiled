package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class grw implements irw {
    public final ArrayList a;

    public grw(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grw) && this.a.equals(((grw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
