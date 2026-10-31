package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kl00 implements p731 {
    public final /* synthetic */ ll00 a;

    public kl00(ll00 ll00Var) {
        this.a = ll00Var;
    }

    public final bpb1 a() {
        return this.a.a.c();
    }

    public final void b(String str, xuh1 xuh1Var) {
        this.a.a.a(new l731(str, xuh1Var));
    }

    public final void c(String str) {
        this.a.a.a(new k731(str));
    }

    public final long d(String str) {
        return ((Number) ((o731) a().getValue()).a.getOrDefault(str, 0L)).longValue() * 1000;
    }

    public final void e(String str, iu30 iu30Var) {
        this.a.a.a(new i731(str, iu30Var));
    }
}
