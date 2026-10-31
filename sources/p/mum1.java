package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mum1 {
    public final List a;
    public final Set b;
    public final boolean c;

    public mum1(List list) {
        this.a = list;
        Set setW = h4p1.w(list);
        this.b = setW;
        this.c = setW.contains("downloaded") || setW.contains("all_downloaded");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mum1) && u890.j(this.a, ((mum1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public /* synthetic */ mum1() {
        this(z6x.a);
    }
}
