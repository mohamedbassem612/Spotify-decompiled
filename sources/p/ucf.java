package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ucf implements rcf {
    public final String a;

    public ucf(String str) {
        this.a = str;
    }

    @Override // p.rcf
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucf) && u890.j(this.a, ((ucf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
