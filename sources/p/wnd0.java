package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wnd0 {
    public final ArrayList a;

    public wnd0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnd0) && this.a.equals(((wnd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
