package com.spotify.unboxinghub.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetMainHubPageResponse extends h implements v2j0 {
    private static final GetMainHubPageResponse DEFAULT_INSTANCE;
    public static final int MAIN_HUB_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private MainHubPage mainHub_;
    private String requestId_ = "";

    static {
        GetMainHubPageResponse getMainHubPageResponse = new GetMainHubPageResponse();
        DEFAULT_INSTANCE = getMainHubPageResponse;
        h.registerDefaultInstance(GetMainHubPageResponse.class, getMainHubPageResponse);
    }

    private GetMainHubPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "mainHub_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new GetMainHubPageResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (GetMainHubPageResponse.class) {
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

    public final MainHubPage n() {
        MainHubPage mainHubPage = this.mainHub_;
        return mainHubPage == null ? MainHubPage.n() : mainHubPage;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
