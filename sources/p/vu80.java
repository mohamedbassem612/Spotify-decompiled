package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vu80 extends z47 {
    public final String g;
    public final String h;

    public vu80(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu80)) {
            return false;
        }
        vu80 vu80Var = (vu80) obj;
        return this.g.equals(vu80Var.g) && this.h.equals(vu80Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }

    public final String x() {
        return this.g;
    }

    public final String y() {
        return this.h;
    }
}
