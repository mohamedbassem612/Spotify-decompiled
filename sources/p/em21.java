package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class em21 implements chu {
    public final String a;

    public em21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em21) && u890.j(this.a, ((em21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
