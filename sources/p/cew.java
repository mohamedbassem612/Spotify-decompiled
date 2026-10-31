package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cew extends iiw {
    public final int a;
    public final String b;
    public final String c;
    public final List d;

    public cew(int i, String str, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cew)) {
            return false;
        }
        cew cewVar = (cew) obj;
        return this.a == cewVar.a && u890.j(this.b, cewVar.b) && this.c.equals(cewVar.c) && u890.j(this.d, cewVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
