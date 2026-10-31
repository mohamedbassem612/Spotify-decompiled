package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.d6m1;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class WorldListAttributes extends h implements v2j0 {
    private static final WorldListAttributes DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int GENERATION_ID_FIELD_NUMBER = 5;
    public static final int HERO_URI_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SEED_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private WorldError error_;
    private Seed seed_;
    private int state_;
    private String heroUri_ = "";
    private String generationId_ = "";
    private String navigationUri_ = "";

    static {
        WorldListAttributes worldListAttributes = new WorldListAttributes();
        DEFAULT_INSTANCE = worldListAttributes;
        h.registerDefaultInstance(WorldListAttributes.class, worldListAttributes);
    }

    private WorldListAttributes() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WorldListAttributes u(byte[] bArr) {
        return (WorldListAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "heroUri_", "state_", "seed_", "error_", "generationId_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new WorldListAttributes();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (WorldListAttributes.class) {
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

    public final WorldError n() {
        WorldError worldError = this.error_;
        return worldError == null ? WorldError.n() : worldError;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.generationId_;
    }

    public final String p() {
        return this.heroUri_;
    }

    public final String q() {
        return this.navigationUri_;
    }

    public final Seed r() {
        Seed seed = this.seed_;
        return seed == null ? Seed.n() : seed;
    }

    public final d6m1 s() {
        d6m1 d6m1Var;
        int i = this.state_;
        if (i == 0) {
            d6m1Var = d6m1.WORLD_STATE_UNDEFINED;
        } else if (i == 1) {
            d6m1Var = d6m1.WORLD_STATE_EMPTY;
        } else if (i != 2) {
            d6m1Var = i != 3 ? null : d6m1.WORLD_STATE_POPULATED;
        } else {
            d6m1Var = d6m1.WORLD_STATE_IN_PROGRESS;
        }
        return d6m1Var == null ? d6m1.UNRECOGNIZED : d6m1Var;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
