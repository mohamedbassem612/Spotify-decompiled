package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tv10 extends uv10 {
    public final String a;

    public tv10(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv10) && this.a.equals(((tv10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
