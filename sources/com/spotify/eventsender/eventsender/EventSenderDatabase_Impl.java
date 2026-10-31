package com.spotify.eventsender.eventsender;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.bc00;
import p.cc00;
import p.dyb0;
import p.ec90;
import p.idd1;
import p.jd11;
import p.ld00;
import p.rc11;
import p.rrz0;
import p.ss0;
import p.tka0;
import p.ud00;
import p.ue00;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/eventsender/eventsender/EventSenderDatabase_Impl;", "Lcom/spotify/eventsender/eventsender/EventSenderDatabase;", "<init>", "()V", "src_main_java_com_spotify_eventsender_eventsender-eventsender"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EventSenderDatabase_Impl extends EventSenderDatabase {
    public final idd1 l = new idd1(new cc00(this, (byte) 0));
    public final idd1 m = new idd1(new bc00(this, (byte) 0));
    public final idd1 n = new idd1(new bc00(this, (byte) 1));
    public final idd1 o = new idd1(new bc00(this, (byte) 2));

    @Override // p.en31
    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // p.en31
    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), "Events", "EventSequenceNumbers", "RateLimitedEvents");
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
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(ue00.class);
        z6x z6xVar = z6x.a;
        linkedHashMap.put(tka0VarB, z6xVar);
        linkedHashMap.put(jd11Var.b(ld00.class), z6xVar);
        linkedHashMap.put(jd11Var.b(ud00.class), z6xVar);
        linkedHashMap.put(jd11Var.b(rrz0.class), z6xVar);
        return linkedHashMap;
    }

    @Override // com.spotify.eventsender.eventsender.EventSenderDatabase
    public final ld00 u() {
        return (ld00) this.m.getValue();
    }

    @Override // com.spotify.eventsender.eventsender.EventSenderDatabase
    public final ud00 v() {
        return (ud00) this.n.getValue();
    }

    @Override // com.spotify.eventsender.eventsender.EventSenderDatabase
    public final ue00 w() {
        return (ue00) this.l.getValue();
    }

    @Override // com.spotify.eventsender.eventsender.EventSenderDatabase
    public final rrz0 x() {
        return (rrz0) this.o.getValue();
    }
}
