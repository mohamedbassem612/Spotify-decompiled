package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fl21 {
    public final String a;
    public final String b;

    public fl21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl21)) {
            return false;
        }
        fl21 fl21Var = (fl21) obj;
        return this.a.equals(fl21Var.a) && this.b.equals(fl21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
