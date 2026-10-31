package p;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ced0 extends lm10 {
    public final /* synthetic */ byte d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ced0(byte b) {
        this.d = b;
        switch (b) {
            case 1:
                fcn0 fcn0Var = fcn0.e;
                fcn0 fcn0Var2 = fcn0.b;
                fcn0 fcn0Var3 = fcn0.d;
                fcn0 fcn0Var4 = fcn0.c;
                super("Spotify.Feature.MusicVideos", p7h.M(new m9d0[]{fcn0Var, fcn0Var2, fcn0Var3, fcn0Var4}), sqg0.J(new mmr0[]{new mmr0(fcn0Var, new n60("Spotify.Feature.MusicVideos", "view", (omd) null, (m60) null, 114)), new mmr0(fcn0Var2, new n60("Spotify.Feature.MusicVideos", "discover", (omd) null, (m60) null, 114)), new mmr0(fcn0Var3, new n60("Spotify.Feature.MusicVideos", "queue", (omd) null, (m60) null, 114)), new mmr0(fcn0Var4, new n60("Spotify.Feature.MusicVideos", "modifyDisableMusicVideos", (omd) null, (m60) null, 114))}));
                break;
            case 2:
                asr0 asr0Var = asr0.a;
                super("Spotify.Feature.ParentAllowlist", Collections.singletonList(asr0Var), Collections.singletonMap(asr0Var, new n60("Spotify.Feature.ParentAllowlist", "requestTrack", (omd) null, (m60) null, 114)));
                break;
            case 3:
                rmu0 rmu0Var = rmu0.b;
                rmu0 rmu0Var2 = rmu0.c;
                super("Spotify.Feature.PlaylistHistory", p7h.M(new m9d0[]{rmu0Var, rmu0Var2}), sqg0.J(new mmr0[]{new mmr0(rmu0Var, new n60("Spotify.Feature.PlaylistHistory", "browse", (omd) null, (m60) null, 114)), new mmr0(rmu0Var2, new n60("Spotify.Feature.PlaylistHistory", "revert", (omd) null, (m60) null, 114))}));
                break;
            case 4:
                r1y0 r1y0Var = r1y0.a;
                q1y0 q1y0Var = q1y0.a;
                super("Spotify.Feature.PromptedPlaylist", p7h.M(new s1y0[]{r1y0Var, q1y0Var}), sqg0.J(new mmr0[]{new mmr0(r1y0Var, new n60("Spotify.Feature.PromptedPlaylist", "view_prompt", (omd) null, (m60) null, 114)), new mmr0(q1y0Var, new n60("Spotify.Feature.PromptedPlaylist", "generate", omd.b, (m60) null, 82))}));
                break;
            case 5:
                gz31 gz31Var = gz31.c;
                gz31 gz31Var2 = gz31.b;
                super("Spotify.Feature.RunningMode", p7h.M(new m9d0[]{gz31Var, gz31Var2}), sqg0.J(new mmr0[]{new mmr0(gz31Var, new n60("Spotify.Feature.RunningMode", "view", (omd) null, (m60) null, 98)), new mmr0(gz31Var2, new n60("Spotify.Feature.RunningMode", "generate", omd.c, (m60) null, 66))}));
                break;
            case 6:
                sc41 sc41Var = sc41.b;
                sc41 sc41Var2 = sc41.k;
                sc41 sc41Var3 = sc41.j;
                sc41 sc41Var4 = sc41.o;
                sc41 sc41Var5 = sc41.g;
                sc41 sc41Var6 = sc41.n;
                sc41 sc41Var7 = sc41.c;
                sc41 sc41Var8 = sc41.h;
                sc41 sc41Var9 = sc41.f;
                sc41 sc41Var10 = sc41.i;
                sc41 sc41Var11 = sc41.e;
                sc41 sc41Var12 = sc41.d;
                sc41 sc41Var13 = sc41.m;
                sc41 sc41Var14 = sc41.l;
                super("Spotify.Feature.SaveToSpotify", p7h.M(new m9d0[]{sc41Var, sc41Var2, sc41Var3, sc41Var4, sc41Var5, sc41Var6, sc41Var7, sc41Var8, sc41Var9, sc41Var10, sc41Var11, sc41Var12, sc41Var13, sc41Var14}), sqg0.J(new mmr0[]{new mmr0(sc41Var, new n60("Spotify.Feature.SaveToSpotify", "accessKungsholmen", (omd) null, (m60) null, 114)), new mmr0(sc41Var2, new n60("Spotify.Feature.SaveToSpotify", "importKungsholmen", (omd) null, (m60) null, 114)), new mmr0(sc41Var3, new n60((String) null, "import_from_create_menu", (omd) null, (m60) null, 119)), new mmr0(sc41Var4, new n60((String) null, "view_kungsholmen_page", (omd) null, (m60) null, 119)), new mmr0(sc41Var5, new n60((String) null, "download_kungsholmen", (omd) null, (m60) null, 119)), new mmr0(sc41Var6, new n60((String) null, "use_kungsholmen_context_menu_actions", (omd) null, (m60) null, 119)), new mmr0(sc41Var7, new n60((String) null, "delete_episode", (omd) null, (m60) null, 119)), new mmr0(sc41Var8, new n60((String) null, "edit_episode", (omd) null, (m60) null, 119)), new mmr0(sc41Var9, new n60((String) null, "delete_show", (omd) null, (m60) null, 119)), new mmr0(sc41Var10, new n60((String) null, "edit_show", (omd) null, (m60) null, 119)), new mmr0(sc41Var11, new n60((String) null, "delete_genpods_show", (omd) null, (m60) null, 119)), new mmr0(sc41Var12, new n60((String) null, "delete_genpods_episode", (omd) null, (m60) null, 119)), new mmr0(sc41Var13, new n60((String) null, "share_target", (omd) null, (m60) null, 119)), new mmr0(sc41Var14, new n60((String) null, "open_with_import", (omd) null, (m60) null, 119))}));
                break;
            default:
                l9d0 l9d0Var = l9d0.b;
                l9d0 l9d0Var2 = l9d0.f;
                l9d0 l9d0Var3 = l9d0.e;
                l9d0 l9d0Var4 = l9d0.d;
                l9d0 l9d0Var5 = l9d0.c;
                super("Spotify.Feature.ListeningActivity", p7h.M(new m9d0[]{l9d0Var, l9d0Var2, l9d0Var3, l9d0Var4, l9d0Var5}), sqg0.J(new mmr0[]{new mmr0(l9d0Var, new n60("Spotify.Feature.ListeningActivity", "access", (omd) null, (m60) null, 98)), new mmr0(l9d0Var2, new n60("Spotify.Feature.ListeningActivity", "view", (omd) null, new m60("view-listening-activity", new l60()), 50)), new mmr0(l9d0Var3, new n60("Spotify.Feature.ListeningActivity", "publish", (omd) null, new m60("share-listening-activity", new k60()), 50)), new mmr0(l9d0Var4, new n60("Spotify.Feature.ListeningActivity", "modify_view_setting", (omd) null, (m60) null, 114)), new mmr0(l9d0Var5, new n60("Spotify.Feature.ListeningActivity", "modify_publish_setting", (omd) null, (m60) null, 114))}));
                break;
        }
    }

    public f50 a(luk lukVar) {
        switch (this.d) {
            case 1:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!lukVar.e(icn0.b).a()) {
                    linkedHashSet.add(fcn0.c);
                }
                return new f50(linkedHashSet, 5);
            case 2:
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                if (!lukVar.e(icn0.c).c()) {
                    linkedHashSet2.add(asr0.a);
                }
                return new f50(linkedHashSet2, 5);
            case 3:
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                if (!((k35) lukVar.e(icn0.e)).a()) {
                    linkedHashSet3.add(rmu0.b);
                }
                if (!((k35) lukVar.e(icn0.f)).a()) {
                    linkedHashSet3.add(rmu0.c);
                }
                return new f50(linkedHashSet3, 5);
            case 4:
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                if (!lukVar.e(icn0.g).a()) {
                    linkedHashSet4.add(r1y0.a);
                }
                rg4 rg4VarE = lukVar.e(icn0.h);
                boolean zD = rg4VarE.d();
                if (rg4VarE.c()) {
                    zD = true;
                }
                if (!zD) {
                    linkedHashSet4.add(q1y0.a);
                }
                return new f50(linkedHashSet4, 5);
            case 5:
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                if (!lukVar.e(icn0.i).b()) {
                    linkedHashSet5.add(gz31.c);
                }
                if (!lukVar.e(icn0.t).b()) {
                    linkedHashSet5.add(gz31.b);
                }
                return new f50(linkedHashSet5, 5);
            case 6:
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                if (!lukVar.e(icn0.O0).c()) {
                    linkedHashSet6.add(sc41.j);
                }
                if (!lukVar.e(icn0.P0).b()) {
                    linkedHashSet6.add(sc41.n);
                }
                if (!lukVar.e(icn0.Q0).d()) {
                    linkedHashSet6.add(sc41.c);
                }
                if (!lukVar.e(icn0.R0).e()) {
                    linkedHashSet6.add(sc41.h);
                }
                if (!lukVar.e(icn0.S0).j()) {
                    linkedHashSet6.add(sc41.f);
                }
                if (!lukVar.e(icn0.T0).k()) {
                    linkedHashSet6.add(sc41.i);
                }
                if (!lukVar.e(icn0.X).g()) {
                    linkedHashSet6.add(sc41.e);
                }
                if (!lukVar.e(icn0.Y).f()) {
                    linkedHashSet6.add(sc41.d);
                }
                if (!lukVar.e(icn0.Z).i()) {
                    linkedHashSet6.add(sc41.m);
                }
                if (!lukVar.e(icn0.N0).h()) {
                    linkedHashSet6.add(sc41.l);
                }
                return new f50(linkedHashSet6, 5);
            case 7:
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                if (!lukVar.e(icn0.U0).c()) {
                    linkedHashSet7.add(zbh1.d);
                }
                if (!lukVar.e(icn0.V0).c()) {
                    linkedHashSet7.add(zbh1.c);
                }
                if (!lukVar.e(icn0.W0).c()) {
                    linkedHashSet7.add(zbh1.b);
                }
                return new f50(linkedHashSet7, 5);
            default:
                return super.a(lukVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ced0(String str, List list, Map map) {
        super(str, list, map);
        this.d = (byte) 7;
    }
}
