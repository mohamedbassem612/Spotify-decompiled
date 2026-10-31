package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.byo1;
import p.dyb0;
import p.ec90;
import p.idd1;
import p.jd11;
import p.nmd;
import p.q1o1;
import p.rc11;
import p.ss0;
import p.t6j0;
import p.u6j0;
import p.z8i0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/data/cache/room/MessagesDatabase_Impl;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/data/cache/room/MessagesDatabase;", "<init>", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class MessagesDatabase_Impl extends MessagesDatabase {
    public final idd1 l = new idd1(new z8i0(this, (byte) 17));
    public final idd1 m = new idd1(new u6j0(this, (byte) 0));

    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), new String[]{"messages", "message_id_and_capping"});
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
        linkedHashMap.put(jd11Var.b(t6j0.class), byo1.o());
        linkedHashMap.put(jd11Var.b(nmd.class), q1o1.n());
        return linkedHashMap;
    }

    @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase
    public final nmd u() {
        return (nmd) this.m.getValue();
    }

    @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase
    public final t6j0 v() {
        return (t6j0) this.l.getValue();
    }
}
