package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ios0 {
    public static final hos0 Companion = new hos0();
    public static final znb0[] b = {dm5.S(2, v0r0.X0)};
    public final List a;

    public /* synthetic */ ios0(int i, List list) {
        if ((i & 1) == 0) {
            this.a = z6x.a;
        } else {
            this.a = list;
        }
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ios0) && u890.j(this.a, ((ios0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ios0(List list) {
        this.a = list;
    }
}
