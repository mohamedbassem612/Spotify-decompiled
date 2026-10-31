package com.spotify.clientrestrictions.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class RestrictedIntegrationsPayload extends h implements v2j0 {
    private static final RestrictedIntegrationsPayload DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESTRICTED_INTEGRATIONS_FIELD_NUMBER = 1;
    private h290 restrictedIntegrations_ = h.emptyProtobufList();

    static {
        RestrictedIntegrationsPayload restrictedIntegrationsPayload = new RestrictedIntegrationsPayload();
        DEFAULT_INSTANCE = restrictedIntegrationsPayload;
        h.registerDefaultInstance(RestrictedIntegrationsPayload.class, restrictedIntegrationsPayload);
    }

    private RestrictedIntegrationsPayload() {
    }

    public static RestrictedIntegrationsPayload n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"restrictedIntegrations_", RestrictedIntegration.class});
        }
        if (iOrdinal == 3) {
            return new RestrictedIntegrationsPayload();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (RestrictedIntegrationsPayload.class) {
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

    public final h290 o() {
        return this.restrictedIntegrations_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
