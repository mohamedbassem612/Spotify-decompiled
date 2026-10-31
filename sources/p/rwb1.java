package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rwb1 {
    public final String a;

    public rwb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwb1) && u890.j(this.a, ((rwb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
