package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ad60 implements gd60 {
    public final ArrayList a;

    public ad60(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad60) && this.a.equals(((ad60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
