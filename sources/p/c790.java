package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c790 implements h790 {
    public final Integer a;
    public final long b;

    public c790(Integer num, long j) {
        this.a = num;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c790)) {
            return false;
        }
        c790 c790Var = (c790) obj;
        return u890.j(this.a, c790Var.a) && this.b == c790Var.b;
    }

    public final String getName() {
        return "audio_route_type_changed";
    }

    public final int hashCode() {
        Integer num = this.a;
        return Long.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
