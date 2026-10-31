package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzh1 implements vzh1 {
    public final String a;

    public tzh1(String str) {
        this.a = str;
    }

    @Override // p.vzh1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzh1) && u890.j(this.a, ((tzh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
