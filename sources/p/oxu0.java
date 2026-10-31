package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oxu0 implements u2i1 {
    public static final oxu0 a = new oxu0();
    public static final List b = p7h.M(new t2i1("internal/playlist/{playlist_id as Base62}/invite/{permission_token as text}", kc20.b1), new t2i1("new/playlist", yj20.Z0), new t2i1("playlist-format/{primary_id as text}", yb10.c1), new t2i1("playlist-format/{primary_id as text}/{secondary_id as text}", ok10.a1), new t2i1("playlist-participants/{playlist_id as Base62}", sl10.e1), new t2i1("playlist/{playlist_id as Base62}/recommended", as10.b1), new t2i1("playlist-edit/{playlist_id as Base62}", qs10.d1), new t2i1("internal/playlist-edit-coverart/{playlist_id as Base62}", ws10.d1), new t2i1("internal/playlist-edit-items/{playlist_id as Base62}", yz10.a1), new t2i1("internal/playlist-edit-metadata/{playlist_id as Base62}", as10.a1), new t2i1("internal/playlists/edit-privacy", qs10.c1), new t2i1("internal/playlists/edit-profile-visibility", ws10.c1), new t2i1("playlist-all-songs/{playlist_id as Base62}", yz10.Z0), new t2i1("internal/playlist-overlap-sheet/{playlist_id as Base62}", zz10.a1), new t2i1("internal/playlist-overlap-messaging", a020.b1), new t2i1("internal/playlist-mixing-reorder-overview/{playlist_id as Base62}", sa20.b1), new t2i1("internal/playlist-speedcontrol/{playlist_id as Base62}/{row_id as text}", ta20.b1), new t2i1("internal/playlist-speedcontrol-messaging", ua20.a1), new t2i1("internal/playlist-mixing-extended-versions/{playlist_id as Base62}", va20.a1), new t2i1("internal/playlist-mixing-later-in-playlist/{playlist_id as Base62}", ud20.a1), new t2i1("playlist-tuner/{playlist_id as Base62}", rh20.b1), new t2i1("internal/playlist/{playlist_id as Base62}/playlist-tuner-edit-menu", xi20.c1), new t2i1("list/{namespace as text}/{list_id as text}", yi20.a1), new t2i1("internal/list-creation-menu", zi20.Y0), new t2i1("internal/playlist-sorting", aj20.b1), new t2i1("cover-art-snake/{playlist_id as Base62}", bj20.b1), new t2i1("playlist-history/{playlist_id as Base62}", cj20.b1), new t2i1("playlist-history-preview/{playlist_id as Base62}", dj20.Z0), new t2i1("folder-rename/{folder_uri as text}", xj20.b1), new t2i1("user/{user_name as Username}/folder/{folder_id as text}", zj20.Y0), new t2i1("id/{account_id as AccountId}/username/{social_handle as text}/folder/{folder_id as text}", ak20.Y0), new t2i1("add-to-playlist", bk20.a1), new t2i1("internal/playlist-editors-picker/{playlist_id as Base62}", b610.b1), new t2i1("internal/playlist/{playlist_id as Base62}/video-download-selection", f610.a1), new t2i1("user/{user_name as Username}/playlist/{playlist_id as Base62}", o610.a1), new t2i1("playlist/{playlist_id as Base62}", c710.a1), new t2i1("playlist/{playlist_id as Base62}/play", d710.c1), new t2i1("playlist/{playlist_id as Base62}/play/{track_id as Base62}", e710.c1), new t2i1("playlist/{playlist_id as Base62}/play/track/{track_id as Base62}", o810.b1), new t2i1("playlist/{playlist_id as Base62}/play/episode/{episode_id as Base62}", eh10.c1), new t2i1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play", mi10.c1), new t2i1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play/{track_id as Base62}", si10.c1), new t2i1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play/track/{track_id as Base62}", xi10.c1), new t2i1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play/episode/{episode_id as Base62}", dj10.b1), new t2i1("internal/playlist-curator-stats/{playlist_id as Base62}", fj10.b1));
    public static final List c = p7h.M(byu0.f, lxu0.d, yxu0.e, nxu0.f, hyu0.e, xxu0.e, sxu0.e, txu0.e, uxu0.e, vxu0.e, tyu0.d, vyu0.d, qxu0.e, fyu0.e, gyu0.d, eyu0.e, jyu0.f, kyu0.d, cyu0.e, dyu0.e, lyu0.e, myu0.e, jxu0.f, kxu0.d, iyu0.d, gxu0.e, zxu0.e, ayu0.e, hxu0.e, bzu0.f, czu0.g, fxu0.d, wxu0.e, syu0.e, wyu0.f, nyu0.e, oyu0.e, qyu0.f, ryu0.f, pyu0.f, xyu0.f, zyu0.g, azu0.g, yyu0.g, rxu0.e);
    public static final idd1 d = new idd1(tnt0.P0);

    @Override // p.u2i1
    public final List a() {
        return c;
    }

    @Override // p.u2i1
    public final List b() {
        return b;
    }

    public final v5b1 c(String str) {
        a3i1 a3i1Var = (a3i1) d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(str);
        if (x6b1VarL == null) {
            return null;
        }
        return a3i1Var.a(x6b1VarL);
    }
}
