package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iye implements nye {
    public final String a;
    public final String b;
    public final ArrayList c;

    public iye(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iye)) {
            return false;
        }
        iye iyeVar = (iye) obj;
        return u890.j(this.a, iyeVar.a) && u890.j(this.b, iyeVar.b) && this.c.equals(iyeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
