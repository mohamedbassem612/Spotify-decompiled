package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dc91 implements fc91 {
    public final List a;

    public dc91(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc91) && u890.j(this.a, ((dc91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
