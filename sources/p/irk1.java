package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class irk1 implements rrk1 {
    public final String a;

    public irk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irk1) && u890.j(this.a, ((irk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
