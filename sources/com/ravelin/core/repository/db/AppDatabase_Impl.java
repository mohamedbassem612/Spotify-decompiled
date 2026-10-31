package com.ravelin.core.repository.db;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.dyb0;
import p.ec90;
import p.f7n1;
import p.hx4;
import p.idd1;
import p.rc11;
import p.xl5;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ravelin/core/repository/db/AppDatabase_Impl;", "Lcom/ravelin/core/repository/db/AppDatabase;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f1p = new idd1(new hx4(this, (byte) 4));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"device_ids"});
    }

    public final dyb0 g() {
        return new xl5(this);
    }

    public final Set k() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(f7n1.class), z6x.a);
        return linkedHashMap;
    }

    @Override // com.ravelin.core.repository.db.AppDatabase
    public final f7n1 u() {
        return (f7n1) this.f1p.getValue();
    }
}
