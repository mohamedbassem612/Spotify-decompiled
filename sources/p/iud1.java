package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iud1 implements nud1 {
    public final String a;

    public iud1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iud1) && this.a.equals(((iud1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
