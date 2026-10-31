package com.spotify.puffin.core.data.headphonefilterstate.database;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.cc00;
import p.dyb0;
import p.ec90;
import p.ehb;
import p.g050;
import p.idd1;
import p.jd11;
import p.rc11;
import p.ss0;
import p.sul1;
import p.tka0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/puffin/core/data/headphonefilterstate/database/HeadphoneFilterStateDatabase_Impl;", "Lcom/spotify/puffin/core/data/headphonefilterstate/database/HeadphoneFilterStateDatabase;", "<init>", "()V", "src_main_java_com_spotify_puffin_core-core"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class HeadphoneFilterStateDatabase_Impl extends HeadphoneFilterStateDatabase {
    public final idd1 l = new idd1(new g050(this, (byte) 13));
    public final idd1 m = new idd1(new cc00(this, (byte) 14));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"BluetoothHeadphoneFilterStateEntity", "WiredHeadphoneFilterStateEntity"});
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
        tka0 tka0VarB = jd11Var.b(ehb.class);
        z6x z6xVar = z6x.a;
        linkedHashMap.put(tka0VarB, z6xVar);
        linkedHashMap.put(jd11Var.b(sul1.class), z6xVar);
        return linkedHashMap;
    }

    @Override // com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase
    public final ehb u() {
        return (ehb) this.l.getValue();
    }

    @Override // com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase
    public final sul1 v() {
        return (sul1) this.m.getValue();
    }
}
