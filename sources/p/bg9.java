package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bg9 extends qg9 {
    public final String a;

    public bg9(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg9) && this.a.equals(((bg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
