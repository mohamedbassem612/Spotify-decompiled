package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class sy00 {
    public static final ry00 Companion = new ry00();
    public static final znb0[] b = {dm5.S(2, ny00.c)};
    public final List a;

    public /* synthetic */ sy00(int i, List list) {
        if ((i & 1) == 0) {
            this.a = z6x.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy00) && u890.j(this.a, ((sy00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
