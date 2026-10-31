package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uwu implements xwu {
    public final ArrayList a;

    public uwu(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwu) && this.a.equals(((uwu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
