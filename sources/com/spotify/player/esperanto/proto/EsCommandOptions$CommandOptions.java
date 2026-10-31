package com.spotify.player.esperanto.proto;

import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tlz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsCommandOptions$CommandOptions extends com.google.protobuf.h implements v2j0 {
    private static final EsCommandOptions$CommandOptions DEFAULT_INSTANCE;
    public static final int LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int ONLY_FOR_LOCAL_DEVICE_FIELD_NUMBER = 2;
    public static final int ONLY_FOR_PLAYBACK_ID_FIELD_NUMBER = 4;
    public static final int OVERRIDE_RESTRICTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYSTEM_INITIATED_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean onlyForLocalDevice_;
    private boolean overrideRestrictions_;
    private boolean systemInitiated_;
    private phc onlyForPlaybackId_ = phc.b;
    private String logicalPlaybackIdentifier_ = "";

    static {
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = new EsCommandOptions$CommandOptions();
        DEFAULT_INSTANCE = esCommandOptions$CommandOptions;
        com.google.protobuf.h.registerDefaultInstance(EsCommandOptions$CommandOptions.class, esCommandOptions$CommandOptions);
    }

    private EsCommandOptions$CommandOptions() {
    }

    public static tlz n() {
        return (tlz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\n\u0005ለ\u0000", new Object[]{"bitField0_", "overrideRestrictions_", "onlyForLocalDevice_", "systemInitiated_", "onlyForPlaybackId_", "logicalPlaybackIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsCommandOptions$CommandOptions();
        }
        if (iOrdinal == 4) {
            return new tlz(DEFAULT_INSTANCE);
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
        synchronized (EsCommandOptions$CommandOptions.class) {
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
        this.onlyForLocalDevice_ = z;
    }

    public final void p(hhc hhcVar) {
        this.onlyForPlaybackId_ = hhcVar;
    }

    public final void q(boolean z) {
        this.overrideRestrictions_ = z;
    }

    public final void r(boolean z) {
        this.systemInitiated_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
