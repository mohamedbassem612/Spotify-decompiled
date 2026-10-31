package com.spotify.campfire.insights.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;
import p.z7b1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SpotlightContent extends h implements v2j0 {
    private static final SpotlightContent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_COUNT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USERNAMES_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int playCount_;
    private int type_;
    private String username_ = "";
    private String entityUri_ = "";
    private h290 usernames_ = h.emptyProtobufList();

    static {
        SpotlightContent spotlightContent = new SpotlightContent();
        DEFAULT_INSTANCE = spotlightContent;
        h.registerDefaultInstance(SpotlightContent.class, spotlightContent);
    }

    private SpotlightContent() {
    }

    public static SpotlightContent n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u000b\u0005Ț", new Object[]{"username_", "entityUri_", "type_", "playCount_", "usernames_"});
        }
        if (iOrdinal == 3) {
            return new SpotlightContent();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (SpotlightContent.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String getUsername() {
        return this.username_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.playCount_;
    }

    public final z7b1 p() {
        z7b1 z7b1Var;
        int i = this.type_;
        if (i == 0) {
            z7b1Var = z7b1.SPOTLIGHT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            z7b1Var = i != 2 ? null : z7b1.SPOTLIGHT_TYPE_TOP_SONG;
        } else {
            z7b1Var = z7b1.SPOTLIGHT_TYPE_TOP_ARTIST;
        }
        return z7b1Var == null ? z7b1.UNRECOGNIZED : z7b1Var;
    }

    public final h290 q() {
        return this.usernames_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
