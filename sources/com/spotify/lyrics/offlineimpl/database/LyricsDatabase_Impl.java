package com.spotify.lyrics.offlineimpl.database;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.dyb0;
import p.ec90;
import p.hr80;
import p.idd1;
import p.iff0;
import p.jgd0;
import p.rc11;
import p.ss0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/lyrics/offlineimpl/database/LyricsDatabase_Impl;", "Lcom/spotify/lyrics/offlineimpl/database/LyricsDatabase;", "<init>", "()V", "src_main_java_com_spotify_lyrics_offlineimpl-offlineimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LyricsDatabase_Impl extends LyricsDatabase {
    public final idd1 l = new idd1(new jgd0(this, (byte) 24));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"lyrics_entities"});
    }

    public final dyb0 g() {
        return new ss0(this);
    }

    public final Set k() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(iff0.class), hr80.t());
        return linkedHashMap;
    }

    @Override // com.spotify.lyrics.offlineimpl.database.LyricsDatabase
    public final iff0 u() {
        return (iff0) this.l.getValue();
    }
}
