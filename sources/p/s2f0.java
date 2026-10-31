package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s2f0 implements e961 {
    public final e961 a;
    public final long b;
    public final yqg c;

    public s2f0(e961 e961Var, long j, yqg yqgVar) {
        this.a = e961Var;
        this.b = j;
        this.c = yqgVar;
    }

    public final spq0 call() {
        spq0 spq0VarCall = this.a.call();
        if (!spq0VarCall.c()) {
            return j5.a;
        }
        return new i5w0(Long.valueOf(((Long) spq0VarCall.b()).longValue() - ((this.c.b() - this.b) / 1000)));
    }
}
