package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ug00 extends mh00 {
    public final ArrayList a;

    public ug00(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug00) && this.a.equals(((ug00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
