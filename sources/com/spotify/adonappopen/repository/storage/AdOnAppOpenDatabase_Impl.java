package com.spotify.adonappopen.repository.storage;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.dyb0;
import p.ec90;
import p.g3;
import p.idd1;
import p.rc11;
import p.rs0;
import p.ss0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/adonappopen/repository/storage/AdOnAppOpenDatabase_Impl;", "Lcom/spotify/adonappopen/repository/storage/AdOnAppOpenDatabase;", "<init>", "()V", "src_main_java_com_spotify_adonappopen_repository-repository"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class AdOnAppOpenDatabase_Impl extends AdOnAppOpenDatabase {
    public final idd1 l = new idd1(new g3(this, (byte) 12));

    @Override // p.en31
    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // p.en31
    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), "AdOnAppOpenEntity");
    }

    @Override // p.en31
    public final dyb0 g() {
        return new ss0(this);
    }

    @Override // p.en31
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // p.en31
    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(rs0.class), z6x.a);
        return linkedHashMap;
    }

    @Override // com.spotify.adonappopen.repository.storage.AdOnAppOpenDatabase
    public final rs0 u() {
        return (rs0) this.l.getValue();
    }
}
