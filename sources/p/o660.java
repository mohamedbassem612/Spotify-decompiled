package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o660 extends t3k1 {
    public final ArrayList b;

    public o660(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o660) && this.b.equals(((o660) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
