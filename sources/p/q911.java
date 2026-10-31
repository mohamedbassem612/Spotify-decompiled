package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q911 {
    public static final q911 c = new q911(null, null);
    public final String a;
    public final String b;

    public q911(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q911)) {
            return false;
        }
        q911 q911Var = (q911) obj;
        return u890.j(this.a, q911Var.a) && u890.j(this.b, q911Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
