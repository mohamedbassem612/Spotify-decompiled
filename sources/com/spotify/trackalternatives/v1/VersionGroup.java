package com.spotify.trackalternatives.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.do11;
import p.gvi1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VersionGroup extends h implements v2j0 {
    private static final VersionGroup DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELATIONSHIP_TYPE_FIELD_NUMBER = 1;
    public static final int TRACKS_FIELD_NUMBER = 2;
    private int relationshipType_;
    private h290 tracks_ = h.emptyProtobufList();

    static {
        VersionGroup versionGroup = new VersionGroup();
        DEFAULT_INSTANCE = versionGroup;
        h.registerDefaultInstance(VersionGroup.class, versionGroup);
    }

    private VersionGroup() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"relationshipType_", "tracks_", VersionTrack.class});
        }
        if (iOrdinal == 3) {
            return new VersionGroup();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (VersionGroup.class) {
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

    public final List getTracksList() {
        return this.tracks_;
    }

    public final do11 n() {
        do11 do11Var;
        int i = this.relationshipType_;
        if (i == 0) {
            do11Var = do11.RELATIONSHIP_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            do11Var = do11.REMIX;
        } else if (i == 2) {
            do11Var = do11.EXTENDED;
        } else if (i != 3) {
            do11Var = i != 4 ? null : do11.LIVE;
        } else {
            do11Var = do11.COVER;
        }
        return do11Var == null ? do11.UNRECOGNIZED : do11Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
