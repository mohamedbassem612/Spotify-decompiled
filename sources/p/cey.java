package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cey implements qey {
    public final zwm1 a;
    public final j380 b;

    public cey(npm1 npm1Var, zwm1 zwm1Var, j380 j380Var) {
        this.a = zwm1Var;
        this.b = j380Var;
    }

    @Override // p.qey
    public final String a(ttm1 ttm1Var, pey peyVar) {
        if (ttm1Var.a.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
            return this.a.b.getString(2131956851);
        }
        qey qeyVar = (qey) this.b.get(ttm1Var.e);
        if (qeyVar != null) {
            return qeyVar.a(ttm1Var, peyVar);
        }
        return null;
    }
}
