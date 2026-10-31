package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zrs0 implements bss0 {
    public final List a;

    public zrs0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrs0) && this.a.equals(((zrs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
