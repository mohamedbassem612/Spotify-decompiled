package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class we {
    public final String a;
    public final cv30 b;

    public we(String str, cv30 cv30Var) {
        this.a = str;
        this.b = cv30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return u890.j(this.a, weVar.a) && u890.j(this.b, weVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        cv30 cv30Var = this.b;
        return iHashCode + (cv30Var != null ? cv30Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
