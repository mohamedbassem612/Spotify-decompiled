package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cg9 extends qg9 {
    public final String a;

    public cg9(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cg9) && this.a.equals(((cg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
