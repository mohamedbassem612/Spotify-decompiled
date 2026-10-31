package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sfz {
    public final a1r0 a;
    public final tau0 b;
    public final ja8 c;
    public final m7y0 d;
    public final llm e;

    public sfz(a1r0 a1r0Var, tau0 tau0Var, ja8 ja8Var, m7y0 m7y0Var, q8n q8nVar) {
        this.a = a1r0Var;
        this.b = tau0Var;
        this.c = ja8Var;
        this.d = m7y0Var;
        this.e = smo1.e(q8nVar);
    }

    public final void a(String str, boolean z) {
        this.b.a().a(new d9u0("ereader", false)).subscribe(dxu.Y, dxu.Z);
        a1r0.j(this.a, "spotify:internal:audiobook:hyde:playbackgate", (String) null, mno1.h(new mmr0[]{new mmr0("bookUri", str), new mmr0("openReaderOnKeepReading", Boolean.valueOf(z))}), false, 10);
    }
}
