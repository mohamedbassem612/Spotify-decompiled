package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gnh implements lnh {
    public final String a;

    public gnh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnh) && u890.j(this.a, ((gnh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
