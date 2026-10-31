package com.spotify.liveevents.recentlocationsimpl.db;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.d821;
import p.dyb0;
import p.ec90;
import p.gm01;
import p.idd1;
import p.lnm;
import p.rc11;
import p.ss0;
import p.vwz0;
import p.yah0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/liveevents/recentlocationsimpl/db/RecentLocationsDatabase_Impl;", "Lcom/spotify/liveevents/recentlocationsimpl/db/RecentLocationsDatabase;", "<init>", "()V", "src_main_java_com_spotify_liveevents_recentlocationsimpl-recentlocationsimpl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class RecentLocationsDatabase_Impl extends RecentLocationsDatabase {
    public final idd1 l = new idd1(new vwz0(this, (byte) 8));

    public final void d() {
        a();
        b();
        yah0.x(new d821(this, new String[]{"recent_locations"}, (lnm) null, (byte) 17));
    }

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"recent_locations"});
    }

    public final dyb0 g() {
        return new ss0(this);
    }

    public final Set k() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(gm01.class), z6x.a);
        return linkedHashMap;
    }

    @Override // com.spotify.liveevents.recentlocationsimpl.db.RecentLocationsDatabase
    public final gm01 u() {
        return (gm01) this.l.getValue();
    }
}
