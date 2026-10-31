package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nen implements ugn {
    public final String a;

    public nen(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nen) && u890.j(this.a, ((nen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
