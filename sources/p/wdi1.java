package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wdi1 implements xdi1 {
    public final ArrayList a;

    public wdi1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdi1) && this.a.equals(((wdi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
