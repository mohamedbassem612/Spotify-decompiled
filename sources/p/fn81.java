package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fn81 implements gn81 {
    public final String a;

    public fn81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn81) && u890.j(this.a, ((fn81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
