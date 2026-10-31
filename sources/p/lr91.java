package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lr91 {
    public final ArrayList a;

    public lr91(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr91) && this.a.equals(((lr91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
