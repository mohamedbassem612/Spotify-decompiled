package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wf21 {
    public final String a;
    public final String b;
    public final List c;

    public wf21(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf21)) {
            return false;
        }
        wf21 wf21Var = (wf21) obj;
        return u890.j(this.a, wf21Var.a) && u890.j(this.b, wf21Var.b) && u890.j(this.c, wf21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
