package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h4w0 extends i4w0 {
    public final ArrayList a;

    public h4w0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4w0) && this.a.equals(((h4w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
