package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class myi0 implements nyi0 {
    public final List a;

    public myi0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myi0) && u890.j(this.a, ((myi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
