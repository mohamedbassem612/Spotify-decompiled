package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c961 implements e961 {
    public final /* synthetic */ Long a;
    public final /* synthetic */ t8r0 b;
    public final /* synthetic */ long c;

    public c961(Long l, t8r0 t8r0Var, long j) {
        this.a = l;
        this.b = t8r0Var;
        this.c = j;
    }

    public final spq0 call() {
        Long l = this.a;
        if (l == null || l.longValue() <= 0) {
            return j5.a;
        }
        return new i5w0(Long.valueOf(((((yqg) this.b.b).b() - this.c) / 1000) + l.longValue()));
    }
}
