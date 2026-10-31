package p;

import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k4p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ k4p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final g8e a(bi90 bi90Var) {
        byte b = this.a;
        b2p b2pVar = this.b;
        switch (b) {
            case 0:
                g1i g1iVar = (g1i) b2pVar.c;
                h8e h8eVar = (h8e) g1iVar.b;
                qnv0 qnv0Var = (qnv0) h8eVar.e.get();
                c8o.l(qnv0Var);
                Scheduler scheduler = (Scheduler) h8eVar.f.get();
                c8o.l(scheduler);
                k8e k8eVar = (k8e) ((jly0) g1iVar.d).get();
                tdl0 tdl0Var = new tdl0((byte) 10);
                ynb0 ynb0VarA = xqu.a((b2p) g1iVar.e);
                oto0 oto0Var = (oto0) h8eVar.g.get();
                c8o.l(oto0Var);
                gj5 gj5Var = (gj5) h8eVar.b.get();
                c8o.l(gj5Var);
                c8e c8eVar = new c8e(qnv0Var, scheduler, k8eVar, tdl0Var, ynb0VarA, oto0Var, gj5Var);
                gj5 gj5Var2 = (gj5) ((h8e) g1iVar.b).b.get();
                c8o.l(gj5Var2);
                an anVar = new an(gj5Var2, (k8e) ((jly0) g1iVar.d).get());
                SpotifyMainActivity spotifyMainActivity = (SpotifyMainActivity) ((h8e) g1iVar.b).c.get();
                c8o.l(spotifyMainActivity);
                xfx xfxVar = (xfx) ((h8e) g1iVar.b).j.get();
                c8o.l(xfxVar);
                oto0 oto0Var2 = (oto0) ((h8e) g1iVar.b).g.get();
                c8o.l(oto0Var2);
                dto0 dto0Var = (dto0) ((h8e) g1iVar.b).h.get();
                c8o.l(dto0Var);
                lcs lcsVar = (lcs) ((h8e) g1iVar.b).i.get();
                c8o.l(lcsVar);
                ynb0 ynb0VarA2 = xqu.a((b2p) g1iVar.e);
                r6h1 r6h1Var = r6h1.c;
                return new g8e(c8eVar, anVar, spotifyMainActivity, bi90Var, xfxVar, oto0Var2, dto0Var, lcsVar, ynb0VarA2, new rrk0((byte) 11));
            default:
                ip31 ip31Var = (ip31) b2pVar.c;
                z7e z7eVar = (z7e) ip31Var.b;
                qnv0 qnv0Var2 = (qnv0) z7eVar.d.get();
                c8o.l(qnv0Var2);
                Scheduler scheduler2 = (Scheduler) z7eVar.g.get();
                c8o.l(scheduler2);
                k8e k8eVar2 = (k8e) ((jly0) ip31Var.d).get();
                tdl0 tdl0Var2 = new tdl0((byte) 10);
                ynb0 ynb0VarA3 = xqu.a((b2p) ip31Var.e);
                oto0 oto0Var3 = (oto0) z7eVar.h.get();
                c8o.l(oto0Var3);
                dg30 dg30Var = (dg30) z7eVar.a.get();
                c8o.l(dg30Var);
                c8e c8eVar2 = new c8e(qnv0Var2, scheduler2, k8eVar2, tdl0Var2, ynb0VarA3, oto0Var3, dg30Var);
                dg30 dg30Var2 = (dg30) ((z7e) ip31Var.b).a.get();
                c8o.l(dg30Var2);
                an anVar2 = new an(dg30Var2, (k8e) ((jly0) ip31Var.d).get());
                SpotifyMainActivity spotifyMainActivity2 = (SpotifyMainActivity) ((z7e) ip31Var.b).b.get();
                c8o.l(spotifyMainActivity2);
                xfx xfxVar2 = (xfx) ((z7e) ip31Var.b).k.get();
                c8o.l(xfxVar2);
                oto0 oto0Var4 = (oto0) ((z7e) ip31Var.b).h.get();
                c8o.l(oto0Var4);
                dto0 dto0Var2 = (dto0) ((z7e) ip31Var.b).i.get();
                c8o.l(dto0Var2);
                lcs lcsVar2 = (lcs) ((z7e) ip31Var.b).j.get();
                c8o.l(lcsVar2);
                ynb0 ynb0VarA4 = xqu.a((b2p) ip31Var.e);
                r6h1 r6h1Var2 = r6h1.c;
                return new g8e(c8eVar2, anVar2, spotifyMainActivity2, bi90Var, xfxVar2, oto0Var4, dto0Var2, lcsVar2, ynb0VarA4, new rrk0((byte) 11));
        }
    }
}
