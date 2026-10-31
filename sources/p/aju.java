package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aju {
    public final jiu a;

    public aju(jiu jiuVar) {
        this.a = jiuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aju) && this.a.equals(((aju) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
