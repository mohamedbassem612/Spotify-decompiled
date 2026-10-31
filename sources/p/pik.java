package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pik extends vik {
    public final String a;

    public pik(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pik) && u890.j(this.a, ((pik) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
