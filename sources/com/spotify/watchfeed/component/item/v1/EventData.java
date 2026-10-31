package com.spotify.watchfeed.component.item.v1;

import com.spotify.watchfeed.component.model.v1.proto.Artist;
import p.bf40;
import p.h290;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class EventData extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_CONCERTS_URI_FIELD_NUMBER = 4;
    public static final int ARTIST_FIELD_NUMBER = 1;
    private static final EventData DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 2;
    public static final int IS_NEARBY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_EVENT_COUNT_FIELD_NUMBER = 5;
    private Artist artist_;
    private int bitField0_;
    private boolean isNearby_;
    private int totalEventCount_;
    private h290 events_ = com.google.protobuf.h.emptyProtobufList();
    private String artistConcertsUri_ = "";

    static {
        EventData eventData = new EventData();
        DEFAULT_INSTANCE = eventData;
        com.google.protobuf.h.registerDefaultInstance(EventData.class, eventData);
    }

    private EventData() {
    }

    public static EventData p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0007\u0004Ȉ\u0005\u0004", new Object[]{"bitField0_", "artist_", "events_", Event.class, "isNearby_", "artistConcertsUri_", "totalEventCount_"});
        }
        if (iOrdinal == 3) {
            return new EventData();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (EventData.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final Artist n() {
        Artist artist = this.artist_;
        return artist == null ? Artist.n() : artist;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artistConcertsUri_;
    }

    public final h290 q() {
        return this.events_;
    }

    public final boolean r() {
        return this.isNearby_;
    }

    public final int s() {
        return this.totalEventCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
