package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$AvailableConcepts extends h implements v2j0 {
    public static final int CONCEPT_URI_FIELD_NUMBER = 1;
    private static final PlaylistRequest$AvailableConcepts DEFAULT_INSTANCE;
    public static final int LOCALIZED_TERM_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String conceptUri_ = "";
    private String localizedTerm_ = "";

    static {
        PlaylistRequest$AvailableConcepts playlistRequest$AvailableConcepts = new PlaylistRequest$AvailableConcepts();
        DEFAULT_INSTANCE = playlistRequest$AvailableConcepts;
        h.registerDefaultInstance(PlaylistRequest$AvailableConcepts.class, playlistRequest$AvailableConcepts);
    }

    private PlaylistRequest$AvailableConcepts() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "conceptUri_", "localizedTerm_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$AvailableConcepts();
        }
        if (iOrdinal == 4) {
            return new iqu0((byte) 1);
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
        synchronized (PlaylistRequest$AvailableConcepts.class) {
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

    public final String o() {
        return this.conceptUri_;
    }

    public final String p() {
        return this.localizedTerm_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
