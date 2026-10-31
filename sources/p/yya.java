package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yya {
    public final String a;
    public final ArrayList b;
    public final int c;

    public yya(int i, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
    }

    public final List a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yya)) {
            return false;
        }
        yya yyaVar = (yya) obj;
        return this.a.equals(yyaVar.a) && this.b.equals(yyaVar.b) && this.c == yyaVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
