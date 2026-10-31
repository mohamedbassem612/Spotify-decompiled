package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ylf1 {
    public final String a;
    public final String b;
    public final Map c;

    public ylf1(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylf1)) {
            return false;
        }
        ylf1 ylf1Var = (ylf1) obj;
        return u890.j(this.a, ylf1Var.a) && u890.j(this.b, ylf1Var.b) && this.c.equals(ylf1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
