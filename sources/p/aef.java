package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aef implements bef {
    public final String a;

    public aef(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aef) && u890.j(this.a, ((aef) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
