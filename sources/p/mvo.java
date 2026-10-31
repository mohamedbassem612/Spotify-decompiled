package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mvo implements jn60 {
    public final yz21 a;

    public mvo(yz21 yz21Var) {
        this.a = yz21Var;
    }

    public final List d(op80 op80Var) {
        return Collections.singletonList(new jvo(op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvo) && this.a.equals(((mvo) obj).a);
    }

    public final yz21 f() {
        return this.a;
    }

    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return this.a.hashCode() + (118662176 * 31);
    }
}
