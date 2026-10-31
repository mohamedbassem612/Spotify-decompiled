package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.kup0;
import p.mup0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class OfflinePlugin$PluginInit extends h implements v2j0 {
    private static final OfflinePlugin$PluginInit DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 3;
    public static final int SUPPORTED_LINK_TYPES_FIELD_NUMBER = 2;
    private int resourceType_;
    private String id_ = "";
    private h290 supportedLinkTypes_ = h.emptyProtobufList();

    static {
        OfflinePlugin$PluginInit offlinePlugin$PluginInit = new OfflinePlugin$PluginInit();
        DEFAULT_INSTANCE = offlinePlugin$PluginInit;
        h.registerDefaultInstance(OfflinePlugin$PluginInit.class, offlinePlugin$PluginInit);
    }

    private OfflinePlugin$PluginInit() {
    }

    public static kup0 o() {
        return (kup0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\f", new Object[]{"id_", "supportedLinkTypes_", "resourceType_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$PluginInit();
        }
        if (iOrdinal == 4) {
            return new kup0(DEFAULT_INSTANCE);
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
        synchronized (OfflinePlugin$PluginInit.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n() {
        h290 h290VarMutableCopy = this.supportedLinkTypes_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.supportedLinkTypes_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add("episodes");
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p() {
        this.id_ = "betamax-offline";
    }

    public final void q() {
        this.resourceType_ = mup0.VIDEO.getNumber();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
