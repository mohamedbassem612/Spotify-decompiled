package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f3b0 extends c3b0 {
    public final String a;

    public f3b0(String str) {
        this.a = str;
    }

    @Override // p.c3b0
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3b0) && u890.j(this.a, ((f3b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
