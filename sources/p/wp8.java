package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wp8 {
    public final String a;

    public wp8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp8) && u890.j(this.a, ((wp8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + kaa0.f(2131952402, nhz.f.hashCode() * 31, 31);
    }
}
