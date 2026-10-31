package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gsn;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CreationInfo extends h implements v2j0 {
    private static final CreationInfo DEFAULT_INSTANCE;
    public static final int ORIGIN_TYPE_FIELD_NUMBER = 1;
    public static final int ORIGIN_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int originType_;
    private String originUri_ = "";

    static {
        CreationInfo creationInfo = new CreationInfo();
        DEFAULT_INSTANCE = creationInfo;
        h.registerDefaultInstance(CreationInfo.class, creationInfo);
    }

    private CreationInfo() {
    }

    public static CreationInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "originType_", "originUri_"});
        }
        if (iOrdinal == 3) {
            return new CreationInfo();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (CreationInfo.class) {
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

    public final String getOriginUri() {
        return this.originUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final gsn o() {
        gsn gsnVar;
        int i = this.originType_;
        if (i == 0) {
            gsnVar = gsn.ORIGIN_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            gsnVar = gsn.ORIGIN_TYPE_FRESH;
        } else if (i != 2) {
            gsnVar = i != 3 ? null : gsn.ORIGIN_TYPE_AGENTIC;
        } else {
            gsnVar = gsn.ORIGIN_TYPE_CLONED;
        }
        return gsnVar == null ? gsn.UNRECOGNIZED : gsnVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
