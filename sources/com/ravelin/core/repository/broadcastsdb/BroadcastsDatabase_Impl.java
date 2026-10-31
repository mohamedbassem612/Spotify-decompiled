package com.ravelin.core.repository.broadcastsdb;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.dyb0;
import p.ec90;
import p.hx4;
import p.idd1;
import p.rc11;
import p.ss0;
import p.wug;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ravelin/core/repository/broadcastsdb/BroadcastsDatabase_Impl;", "Lcom/ravelin/core/repository/broadcastsdb/BroadcastsDatabase;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class BroadcastsDatabase_Impl extends BroadcastsDatabase {
    public final idd1 l = new idd1(new hx4(this, (byte) 11));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"device_broadcasts"});
    }

    public final dyb0 g() {
        return new ss0(this);
    }

    public final Set k() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(wug.class), z6x.a);
        return linkedHashMap;
    }

    @Override // com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase
    public final wug u() {
        return (wug) this.l.getValue();
    }
}
