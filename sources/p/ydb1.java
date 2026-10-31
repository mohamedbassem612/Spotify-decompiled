package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ydb1 implements aeb1 {
    public final String a;

    public ydb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydb1) && u890.j(this.a, ((ydb1) obj).a);
    }

    @Override // p.aeb1
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
