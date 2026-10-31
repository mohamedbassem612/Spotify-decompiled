package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oy61 {
    public final String a;

    public oy61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy61) && u890.j(this.a, ((oy61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
