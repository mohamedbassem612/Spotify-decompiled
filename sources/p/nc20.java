package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nc20 implements oc20 {
    public final List a;

    public nc20(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc20) && u890.j(this.a, ((nc20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
