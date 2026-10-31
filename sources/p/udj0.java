package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class udj0 extends ydj0 {
    public final String a;

    public udj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udj0) && u890.j(this.a, ((udj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
