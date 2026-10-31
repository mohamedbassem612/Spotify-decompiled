package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qoa implements d0u0 {
    public final c2u0 a;
    public final pjm0 b;

    public qoa(c2u0 c2u0Var, pjm0 pjm0Var) {
        this.a = c2u0Var;
        this.b = pjm0Var;
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        if (str.equals("multiplayer")) {
            return null;
        }
        return new poa(this.a, this.b, zod.D(m0u0Var), (String) m0u0Var.b().get("endvideo_track_uri"), (String) m0u0Var.b().get("interaction_id"), (byte) 0);
    }
}
