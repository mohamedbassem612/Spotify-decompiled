package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class idc1 extends ljo1 {
    public final List d;

    public idc1(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idc1) && this.d.equals(((idc1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
