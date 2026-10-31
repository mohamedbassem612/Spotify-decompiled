package com.spotify.kidsrequest.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bk61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SetChildRequestSettingsRequest extends h implements v2j0 {
    public static final int ALLOWLIST_REQUESTS_ENABLED_FIELD_NUMBER = 2;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final SetChildRequestSettingsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean allowlistRequestsEnabled_;
    private String childId_ = "";

    static {
        SetChildRequestSettingsRequest setChildRequestSettingsRequest = new SetChildRequestSettingsRequest();
        DEFAULT_INSTANCE = setChildRequestSettingsRequest;
        h.registerDefaultInstance(SetChildRequestSettingsRequest.class, setChildRequestSettingsRequest);
    }

    private SetChildRequestSettingsRequest() {
    }

    public static bk61 n() {
        return (bk61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"childId_", "allowlistRequestsEnabled_"});
        }
        if (iOrdinal == 3) {
            return new SetChildRequestSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new bk61(DEFAULT_INSTANCE);
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
        synchronized (SetChildRequestSettingsRequest.class) {
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

    public final void o(boolean z) {
        this.allowlistRequestsEnabled_ = z;
    }

    public final void p(String str) {
        this.childId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
