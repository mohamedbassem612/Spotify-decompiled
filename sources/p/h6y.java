package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h6y extends yf {
    public final String c;
    public final List d;

    public h6y(String str, List list) {
        super(list, msg.a);
        this.c = str;
        this.d = list;
    }

    public static h6y v(h6y h6yVar, ArrayList arrayList) {
        return new h6y(h6yVar.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6y)) {
            return false;
        }
        h6y h6yVar = (h6y) obj;
        return this.c.equals(h6yVar.c) && u890.j(this.d, h6yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final List i() {
        return this.d;
    }

    public final String w() {
        return this.c;
    }
}
