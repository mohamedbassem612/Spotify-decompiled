package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b200 extends y500 {
    public final String a;

    public b200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b200) && u890.j(this.a, ((b200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
