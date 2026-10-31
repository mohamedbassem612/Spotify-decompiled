package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ak51 {
    public final String a;

    public ak51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak51) && u890.j(this.a, ((ak51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
