package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jlo0 extends sio1 {
    public final ArrayList c;

    public jlo0(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jlo0) && this.c.equals(((jlo0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
