package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class cl3 {
    public static final Set a = f46.S0(new nk3[]{nk3.d, nk3.b, nk3.a, nk3.e, nk3.g});
    public static final bma1 b;
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public static final jk3 h;
    public static final jk3 i;
    public static final ik3 j;
    public static final PlaylistRequestDecorationPolicy k;

    static {
        nbc nbcVar = bma1.b;
        b = nbcVar.u("aligned_curation_track_destination");
        c = nbcVar.u("aligned_curation_episode_destination");
        d = nbcVar.u("aligned_curation_podcasts_destination");
        e = nbcVar.u("aligned_curation_audiobook_destination");
        f = nbcVar.u("aligned_curation_highlights_destination");
        g = nbcVar.u("aligned_curation_podcast_chapter_destination");
        h = new jk3("spotify:collection:podcasts");
        i = new jk3("spotify:collection:audiobooks");
        j = new ik3("spotify:collection:your-episodes");
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        sku0VarP.Z();
        sku0VarP.j0();
        sku0VarP.S();
        sku0VarP.k0();
        hru0VarS.x(sku0VarP);
        k = hru0VarS.build();
    }
}
