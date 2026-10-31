package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h88 implements j88 {
    public final String a;

    public h88(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h88) && this.a.equals(((h88) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
