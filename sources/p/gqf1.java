package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqf1 extends iqf1 {
    public final String a;

    public gqf1(String str) {
        this.a = str;
    }

    @Override // p.iqf1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqf1) && this.a.equals(((gqf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
