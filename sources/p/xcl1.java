package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xcl1 {
    public final String a;
    public final hvl1 b;
    public final ArrayList c;

    public xcl1(String str, ArrayList arrayList, hvl1 hvl1Var) {
        this.a = str;
        this.b = hvl1Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcl1)) {
            return false;
        }
        xcl1 xcl1Var = (xcl1) obj;
        return this.a.equals(xcl1Var.a) && this.b.equals(xcl1Var.b) && this.c.equals(xcl1Var.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) - 432188523;
    }
}
