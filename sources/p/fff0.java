package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fff0 implements gff0 {
    public final ArrayList a;

    public fff0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fff0) && this.a.equals(((fff0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
