package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fmt0 implements imt0 {
    public final String a;

    public fmt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmt0) && u890.j(this.a, ((fmt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
