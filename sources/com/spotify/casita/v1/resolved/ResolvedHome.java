package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ResolvedHome extends h implements v2j0 {
    public static final int DEBUG_INFO_FIELD_NUMBER = 4;
    private static final ResolvedHome DEFAULT_INSTANCE;
    public static final int EAGERLY_LOADED_TRAITS_FIELD_NUMBER = 2;
    public static final int ONDEMAND_SET_FIELD_NUMBER = 999;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 3;
    public static final int SANDBOX_DEBUG_INFO_FIELD_NUMBER = 5;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private int bitField0_;
    private DebugInfo debugInfo_;
    private EagerlyLoadedTraits eagerlyLoadedTraits_;
    private OndemandSet ondemandSet_;
    private ResponseInfo responseInfo_;
    private SandboxDebugInfo sandboxDebugInfo_;
    private HomeStructure structure_;

    static {
        ResolvedHome resolvedHome = new ResolvedHome();
        DEFAULT_INSTANCE = resolvedHome;
        h.registerDefaultInstance(ResolvedHome.class, resolvedHome);
    }

    private ResolvedHome() {
    }

    public static ResolvedHome o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004ϧဉ\u0005", new Object[]{"bitField0_", "structure_", "eagerlyLoadedTraits_", "responseInfo_", "debugInfo_", "sandboxDebugInfo_", "ondemandSet_"});
        }
        if (iOrdinal == 3) {
            return new ResolvedHome();
        }
        if (iOrdinal == 4) {
            return new eu21((byte) 3);
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
        synchronized (ResolvedHome.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EagerlyLoadedTraits p() {
        EagerlyLoadedTraits eagerlyLoadedTraits = this.eagerlyLoadedTraits_;
        return eagerlyLoadedTraits == null ? EagerlyLoadedTraits.o() : eagerlyLoadedTraits;
    }

    public final OndemandSet q() {
        OndemandSet ondemandSet = this.ondemandSet_;
        return ondemandSet == null ? OndemandSet.o() : ondemandSet;
    }

    public final ResponseInfo r() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.o() : responseInfo;
    }

    public final HomeStructure s() {
        HomeStructure homeStructure = this.structure_;
        return homeStructure == null ? HomeStructure.o() : homeStructure;
    }

    public final boolean t() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
