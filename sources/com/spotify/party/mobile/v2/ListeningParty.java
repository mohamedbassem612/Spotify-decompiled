package com.spotify.party.mobile.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningParty extends h implements v2j0 {
    private static final ListeningParty DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int ORGANIZER_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 4;
    public static final int SCHEDULED_FOR_FIELD_NUMBER = 5;
    public static final int SCHEDULED_FOR_MILLIS_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean premiumOnly_;
    private long scheduledForMillis_;
    private Timestamp scheduledFor_;
    private String uri_ = "";
    private String organizerUri_ = "";
    private String imageUrl_ = "";

    static {
        ListeningParty listeningParty = new ListeningParty();
        DEFAULT_INSTANCE = listeningParty;
        h.registerDefaultInstance(ListeningParty.class, listeningParty);
    }

    private ListeningParty() {
    }

    public static ListeningParty n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005ဉ\u0000\u0006\u0002", new Object[]{"bitField0_", "uri_", "organizerUri_", "imageUrl_", "premiumOnly_", "scheduledFor_", "scheduledForMillis_"});
        }
        if (iOrdinal == 3) {
            return new ListeningParty();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ListeningParty.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.premiumOnly_;
    }

    public final Timestamp p() {
        Timestamp timestamp = this.scheduledFor_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
