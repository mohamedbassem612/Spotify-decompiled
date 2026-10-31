package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oc7 extends uc7 {
    public final String a;

    public oc7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc7) && u890.j(this.a, ((oc7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
