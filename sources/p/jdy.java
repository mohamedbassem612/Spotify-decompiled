package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jdy implements kdy {
    public final String a;
    public final ArrayList b;

    public jdy(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdy)) {
            return false;
        }
        jdy jdyVar = (jdy) obj;
        return this.a.equals(jdyVar.a) && this.b.equals(jdyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
