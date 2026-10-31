package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nj11 implements u2i1 {
    public static final nj11 a = new nj11();
    public static final List b = p7h.M(new t2i1("internal/reinvent-free/multi-song-upsell/{entity_uri as Query}", a2x0.g), new t2i1("internal/reinvent-free/track-preview-upsell/{upsell_type as text}/{track_id as Base62}", e2x0.g));
    public static final List c = p7h.M(pj11.e, qj11.f);
    public static final idd1 d = new idd1(ijz0.Y0);

    @Override // p.u2i1
    public final List a() {
        return c;
    }

    @Override // p.u2i1
    public final List b() {
        return b;
    }
}
