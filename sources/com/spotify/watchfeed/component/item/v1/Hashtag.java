package com.spotify.watchfeed.component.item.v1;

import com.spotify.watchfeed.component.model.v1.proto.Visual;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Hashtag extends com.google.protobuf.h implements v2j0 {
    public static final int DECISION_ID_FIELD_NUMBER = 5;
    private static final Hashtag DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SEED_ITEM_URI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VISUALS_FIELD_NUMBER = 6;
    private String id_ = "";
    private String title_ = "";
    private String seedItemUri_ = "";
    private String navigationUri_ = "";
    private String decisionId_ = "";
    private h290 visuals_ = com.google.protobuf.h.emptyProtobufList();

    static {
        Hashtag hashtag = new Hashtag();
        DEFAULT_INSTANCE = hashtag;
        com.google.protobuf.h.registerDefaultInstance(Hashtag.class, hashtag);
    }

    private Hashtag() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Hashtag r(phc phcVar) {
        return (Hashtag) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "title_", "seedItemUri_", "navigationUri_", "decisionId_", "visuals_", Visual.class});
        }
        if (iOrdinal == 3) {
            return new Hashtag();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (Hashtag.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.decisionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.navigationUri_;
    }

    public final String p() {
        return this.seedItemUri_;
    }

    public final h290 q() {
        return this.visuals_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
