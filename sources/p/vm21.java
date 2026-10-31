package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vm21 implements wm21 {
    public final ArrayList a;

    public vm21(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm21) && this.a.equals(((vm21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
