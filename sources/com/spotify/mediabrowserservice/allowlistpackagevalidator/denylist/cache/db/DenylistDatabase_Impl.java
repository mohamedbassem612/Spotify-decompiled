package com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.cache.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.bbt;
import p.dhc1;
import p.dyb0;
import p.ec90;
import p.idd1;
import p.jd11;
import p.ots;
import p.rc11;
import p.ss0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/mediabrowserservice/allowlistpackagevalidator/denylist/cache/db/DenylistDatabase_Impl;", "Lcom/spotify/mediabrowserservice/allowlistpackagevalidator/denylist/cache/db/DenylistDatabase;", "<init>", "()V", "src_main_java_com_spotify_mediabrowserservice_allowlistpackagevalidator-allowlistpackagevalidator"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DenylistDatabase_Impl extends DenylistDatabase {
    public final idd1 l = new idd1(new ots(this, (byte) 18));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"cachedDenylist"});
    }

    public final dyb0 g() {
        return new ss0(this);
    }

    public final Set k() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jd11 jd11Var = rc11.a;
        linkedHashMap.put(jd11Var.b(bbt.class), Collections.singletonList(jd11Var.b(dhc1.class)));
        return linkedHashMap;
    }

    @Override // com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.cache.db.DenylistDatabase
    public final bbt u() {
        return (bbt) this.l.getValue();
    }
}
