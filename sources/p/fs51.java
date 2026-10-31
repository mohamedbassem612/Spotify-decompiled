package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fs51 implements ns51 {
    public final agv a;

    public fs51(agv agvVar) {
        this.a = agvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs51) && this.a == ((fs51) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
