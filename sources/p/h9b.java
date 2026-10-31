package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h9b implements b56 {
    public final i9b a;
    public final Resources b;
    public final aab c;
    public final frh1 d;
    public final q8n e;

    public h9b(i9b i9bVar, Resources resources, aab aabVar, frh1 frh1Var, q8n q8nVar) {
        this.a = i9bVar;
        this.b = resources;
        this.c = aabVar;
        this.d = frh1Var;
        this.e = q8nVar;
    }

    @Override // p.b56
    public final a56 a(u46 u46Var, d0r d0rVar, da6 da6Var) {
        dab dabVar = new dab(u46Var, this.d, this.e);
        return new ajq0(u46Var, this.a, this.b, this.c, dabVar);
    }
}
