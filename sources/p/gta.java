package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gta implements kta {
    public final String a;

    public gta(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gta) && this.a.equals(((gta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
