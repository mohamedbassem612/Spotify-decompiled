package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nc21 {
    public final String a;

    public nc21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc21) && u890.j(this.a, ((nc21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
