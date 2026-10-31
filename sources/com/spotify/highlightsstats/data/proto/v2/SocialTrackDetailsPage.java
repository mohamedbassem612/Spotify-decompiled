package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.az91;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SocialTrackDetailsPage extends h implements v2j0 {
    public static final int DATATYPE_FIELD_NUMBER = 2;
    private static final SocialTrackDetailsPage DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_TRACKS_FIELD_NUMBER = 1;
    private int dataType_;
    private h290 topTracks_ = h.emptyProtobufList();

    static {
        SocialTrackDetailsPage socialTrackDetailsPage = new SocialTrackDetailsPage();
        DEFAULT_INSTANCE = socialTrackDetailsPage;
        h.registerDefaultInstance(SocialTrackDetailsPage.class, socialTrackDetailsPage);
    }

    private SocialTrackDetailsPage() {
    }

    public static SocialTrackDetailsPage o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"topTracks_", SocialTopTrack.class, "dataType_"});
        }
        if (iOrdinal == 3) {
            return new SocialTrackDetailsPage();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (SocialTrackDetailsPage.class) {
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

    public final az91 n() {
        az91 az91VarA = az91.a(this.dataType_);
        return az91VarA == null ? az91.UNRECOGNIZED : az91VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.topTracks_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
