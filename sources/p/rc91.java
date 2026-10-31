package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rc91 implements tc91 {
    public final String a;

    public rc91(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc91) && this.a.equals(((rc91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
