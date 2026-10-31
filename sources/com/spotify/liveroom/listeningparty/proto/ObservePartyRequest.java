package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservePartyRequest extends h implements v2j0 {
    private static final ObservePartyRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_URI_FIELD_NUMBER = 1;
    private String partyUri_ = "";
    private String messageToken_ = "";

    static {
        ObservePartyRequest observePartyRequest = new ObservePartyRequest();
        DEFAULT_INSTANCE = observePartyRequest;
        h.registerDefaultInstance(ObservePartyRequest.class, observePartyRequest);
    }

    private ObservePartyRequest() {
    }

    public static cjp0 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"partyUri_", "messageToken_"});
        }
        if (iOrdinal == 3) {
            return new ObservePartyRequest();
        }
        if (iOrdinal == 4) {
            return new cjp0();
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
        synchronized (ObservePartyRequest.class) {
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

    public final void p(String str) {
        this.messageToken_ = str;
    }

    public final void q(String str) {
        this.partyUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
