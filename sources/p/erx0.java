package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class erx0 extends frx0 {
    public final zwu0 a;

    public erx0(zwu0 zwu0Var) {
        this.a = zwu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erx0) && this.a.equals(((erx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
