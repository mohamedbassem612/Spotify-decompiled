package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tkd0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ListeningPartyPlayedMusicTrack extends com.google.protobuf.h implements v2j0 {
    private static final ListeningPartyPlayedMusicTrack DEFAULT_INSTANCE;
    public static final int EXPECTED_PARTY_POSITION_FIELD_NUMBER = 5;
    public static final int EXPECTED_SEEK_MS_FIELD_NUMBER = 7;
    public static final int EXPECTED_TRACK_URI_FIELD_NUMBER = 3;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_POSITION_FIELD_NUMBER = 4;
    public static final int ROOM_URI_FIELD_NUMBER = 1;
    public static final int SEEK_MS_FIELD_NUMBER = 6;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    public static final int TRIGGERING_EVENT_ID_FIELD_NUMBER = 9;
    private int bitField0_;
    private long expectedPartyPosition_;
    private long expectedSeekMs_;
    private long partyPosition_;
    private long seekMs_;
    private String roomUri_ = "";
    private String trackUri_ = "";
    private String expectedTrackUri_ = "";
    private String nextTracks_ = "";
    private String triggeringEventId_ = "";

    static {
        ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack = new ListeningPartyPlayedMusicTrack();
        DEFAULT_INSTANCE = listeningPartyPlayedMusicTrack;
        com.google.protobuf.h.registerDefaultInstance(ListeningPartyPlayedMusicTrack.class, listeningPartyPlayedMusicTrack);
    }

    private ListeningPartyPlayedMusicTrack() {
    }

    public static tkd0 n() {
        return (tkd0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "roomUri_", "trackUri_", "expectedTrackUri_", "partyPosition_", "expectedPartyPosition_", "seekMs_", "expectedSeekMs_", "nextTracks_", "triggeringEventId_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyPlayedMusicTrack();
        }
        if (iOrdinal == 4) {
            return new tkd0(DEFAULT_INSTANCE);
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
        synchronized (ListeningPartyPlayedMusicTrack.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(long j) {
        this.bitField0_ |= 16;
        this.expectedPartyPosition_ = j;
    }

    public final void p(long j) {
        this.bitField0_ |= 64;
        this.expectedSeekMs_ = j;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.expectedTrackUri_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 128;
        this.nextTracks_ = str;
    }

    public final void s(long j) {
        this.bitField0_ |= 8;
        this.partyPosition_ = j;
    }

    public final void t(String str) {
        this.bitField0_ |= 1;
        this.roomUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 32;
        this.seekMs_ = j;
    }

    public final void v(String str) {
        this.bitField0_ |= 2;
        this.trackUri_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.triggeringEventId_ = str;
    }
}
