package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zgw0 implements bhw0 {
    public final String a;

    public zgw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgw0) && u890.j(this.a, ((zgw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
