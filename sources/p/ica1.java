package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ica1 implements kca1 {
    public final String a;

    public ica1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ica1) && this.a.equals(((ica1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
