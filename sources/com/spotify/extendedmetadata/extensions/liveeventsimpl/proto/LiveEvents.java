package com.spotify.extendedmetadata.extensions.liveeventsimpl.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class LiveEvents extends h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 2;
    private static final LiveEvents DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 events_ = h.emptyProtobufList();
    private h290 artists_ = h.emptyProtobufList();

    static {
        LiveEvents liveEvents = new LiveEvents();
        DEFAULT_INSTANCE = liveEvents;
        h.registerDefaultInstance(LiveEvents.class, liveEvents);
    }

    private LiveEvents() {
    }

    public static LiveEvents p(byte[] bArr) {
        return (LiveEvents) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"events_", LiveEvent.class, "artists_", ArtistOnTour.class});
        }
        if (iOrdinal == 3) {
            return new LiveEvents();
        }
        if (iOrdinal == 4) {
            return new uid0((byte) 12);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (LiveEvents.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final List getArtistsList() {
        return this.artists_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.events_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
