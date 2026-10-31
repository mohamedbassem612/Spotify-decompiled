package p;

import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rl31 {
    public final String a;
    public final List b;
    public final File c;
    public final Map d;

    public rl31(String str, List list, File file, Map map) {
        this.a = str;
        this.b = list;
        this.c = file;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl31)) {
            return false;
        }
        rl31 rl31Var = (rl31) obj;
        return u890.j(this.a, rl31Var.a) && u890.j(this.b, rl31Var.b) && this.c.equals(rl31Var.c) && this.d.equals(rl31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false);
    }
}
