package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o2a {
    public static final mmr0[] a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        long j = u7h.j;
        mmr0 mmr0Var = new mmr0(fValueOf, new u7h(j));
        Float fValueOf2 = Float.valueOf(0.18f);
        long j2 = u7h.f;
        a = new mmr0[]{mmr0Var, new mmr0(fValueOf2, new u7h(u7h.b(j2, 0.066f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.34f), new u7h(u7h.b(j2, 0.2475f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.5f), new u7h(u7h.b(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.66f), new u7h(u7h.b(j2, 0.2475f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.82f), new u7h(u7h.b(j2, 0.066f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(j))};
    }

    public static final qim0 a(qim0 qim0Var) {
        return qim0Var.then(new n2a());
    }
}
