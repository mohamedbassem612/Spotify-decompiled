package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lv70 implements ov70 {
    public final String a;

    public lv70(String str) {
        this.a = str;
    }

    @Override // p.ov70
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv70) && u890.j(this.a, ((lv70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
