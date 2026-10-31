package com.spotify.puffin.core.data.filtermetadata.database;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.ab10;
import p.cc00;
import p.dyb0;
import p.ec90;
import p.gb10;
import p.hso1;
import p.idd1;
import p.jd11;
import p.obg1;
import p.ooa1;
import p.rc11;
import p.ss0;
import p.wa20;
import p.xoa1;
import p.y9g1;
import p.zso1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/puffin/core/data/filtermetadata/database/FilterMetadataDatabase_Impl;", "Lcom/spotify/puffin/core/data/filtermetadata/database/FilterMetadataDatabase;", "<init>", "()V", "src_main_java_com_spotify_puffin_core-core"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class FilterMetadataDatabase_Impl extends FilterMetadataDatabase {
    public final idd1 l = new idd1(new wa20(this, (byte) 1));
    public final idd1 m = new idd1(new wa20(this, (byte) 0));
    public final idd1 n = new idd1(new cc00(this, (byte) 9));
    public final idd1 o = new idd1(new wa20(this, (byte) 2));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"ExternalizationEnabledFilterEntity", "ExternalizationDisabledFilterEntity", "SpecificEnabledFilterEntity", "SpecificDisabledFilterEntity"});
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
        linkedHashMap.put(jd11Var.b(gb10.class), zso1.K());
        linkedHashMap.put(jd11Var.b(ab10.class), hso1.I());
        linkedHashMap.put(jd11Var.b(xoa1.class), obg1.r());
        linkedHashMap.put(jd11Var.b(ooa1.class), y9g1.n());
        return linkedHashMap;
    }

    @Override // com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase
    public final ab10 u() {
        return (ab10) this.m.getValue();
    }

    @Override // com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase
    public final gb10 v() {
        return (gb10) this.l.getValue();
    }

    @Override // com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase
    public final ooa1 w() {
        return (ooa1) this.o.getValue();
    }

    @Override // com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase
    public final xoa1 x() {
        return (xoa1) this.n.getValue();
    }
}
