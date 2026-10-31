package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rs01 extends vs01 {
    public final m9m a;

    public rs01(m9m m9mVar) {
        this.a = m9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rs01) && this.a == ((rs01) obj).a;
    }

    public final int hashCode() {
        m9m m9mVar = this.a;
        if (m9mVar == null) {
            return 0;
        }
        return m9mVar.hashCode();
    }
}
