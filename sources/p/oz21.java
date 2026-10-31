package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oz21 implements sz21 {
    public final String a;

    public oz21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oz21) && this.a.equals(((oz21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
