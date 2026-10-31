package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hhl1 implements uxh0 {
    public final g8q c;

    public hhl1(g8q g8qVar) {
        this.c = g8qVar;
    }

    @Override // p.uxh0
    public final m210 a(String str) {
        pbq pbqVar = new pbq("wear_os");
        pbqVar.t0(str);
        return pbqVar.v();
    }

    @Override // p.uxh0
    public final boolean b(String str) {
        return ihl1.a().contains(str);
    }

    @Override // p.uxh0
    public final lxh0 c(x610 x610Var, int i) {
        return this.c.b(x610Var, PlayOrigin.create("wearos"), i);
    }
}
