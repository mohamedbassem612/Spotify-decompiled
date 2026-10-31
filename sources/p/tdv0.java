package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tdv0 implements ez00 {
    public final ArrayList a;

    public tdv0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdv0) && this.a.equals(((tdv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
