package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class en51 {
    public final pn51 a;
    public final pn51 b;

    public en51(pn51 pn51Var, pn51 pn51Var2) {
        this.a = pn51Var;
        this.b = pn51Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || en51.class != obj.getClass()) {
            return false;
        }
        en51 en51Var = (en51) obj;
        return this.a.equals(en51Var.a) && this.b.equals(en51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        pn51 pn51Var = this.a;
        sb.append(pn51Var);
        pn51 pn51Var2 = this.b;
        if (pn51Var.equals(pn51Var2)) {
            str = "";
        } else {
            str = ", " + pn51Var2;
        }
        return l1d.n(str, "]", sb);
    }
}
