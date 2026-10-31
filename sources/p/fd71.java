package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fd71 extends h1p1 {
    public final ArrayList c;

    public fd71(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd71) && this.c.equals(((fd71) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
