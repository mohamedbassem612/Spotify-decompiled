package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qg71 extends tg71 {
    public final umt a;

    public qg71(umt umtVar) {
        this.a = umtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg71) && u890.j(this.a, ((qg71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
