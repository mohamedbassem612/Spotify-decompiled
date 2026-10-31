package com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.bf20;
import p.dyb0;
import p.ec90;
import p.f710;
import p.idd1;
import p.rc11;
import p.ss0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/listuxplatformconsumers/likedsongs/shared/filtertagsdata/FilterTagsDatabase_Impl;", "Lcom/spotify/listuxplatformconsumers/likedsongs/shared/filtertagsdata/FilterTagsDatabase;", "<init>", "()V", "src_main_java_com_spotify_listuxplatformconsumers_likedsongs_shared-shared"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FilterTagsDatabase_Impl extends FilterTagsDatabase {
    public final idd1 l = new idd1(new f710(this, (byte) 8));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"liked_songs_filter_tags_entity"});
    }

    public final dyb0 g() {
        return new ss0(this);
    }

    public final Set k() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(bf20.class), z6x.a);
        return linkedHashMap;
    }

    @Override // com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase
    public final bf20 u() {
        return (bf20) this.l.getValue();
    }
}
