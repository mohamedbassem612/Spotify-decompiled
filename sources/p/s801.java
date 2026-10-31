package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s801 {
    public final lzn0 a;
    public final a1r0 b;

    public s801(lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = lzn0Var;
        this.b = a1r0Var;
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.a.i(new dwn0(vzn1.m(str), "", false, false, 0, 0, false, null, null, null), mno1.h(new mmr0[]{new mmr0("readAlongFullScreen", new p901(str, true))}));
        } else {
            a1r0.m(this.b, vzn1.m(str), (tv80) null, mno1.h(new mmr0[]{new mmr0("readAlongFullScreen", new p901(str, false))}), 8);
        }
    }
}
