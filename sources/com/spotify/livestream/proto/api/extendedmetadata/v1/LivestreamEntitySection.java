package com.spotify.livestream.proto.api.extendedmetadata.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LivestreamEntitySection extends h implements v2j0 {
    private static final LivestreamEntitySection DEFAULT_INSTANCE;
    public static final int ERR_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private LivestreamEntityError err_;
    private LivestreamEntityItem item_;

    static {
        LivestreamEntitySection livestreamEntitySection = new LivestreamEntitySection();
        DEFAULT_INSTANCE = livestreamEntitySection;
        h.registerDefaultInstance(LivestreamEntitySection.class, livestreamEntitySection);
    }

    private LivestreamEntitySection() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LivestreamEntitySection q(byte[] bArr) {
        return (LivestreamEntitySection) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "item_", "err_"});
        }
        if (iOrdinal == 3) {
            return new LivestreamEntitySection();
        }
        if (iOrdinal == 4) {
            return new uid0((byte) 18);
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
        synchronized (LivestreamEntitySection.class) {
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

    public final LivestreamEntityError o() {
        LivestreamEntityError livestreamEntityError = this.err_;
        return livestreamEntityError == null ? LivestreamEntityError.p() : livestreamEntityError;
    }

    public final LivestreamEntityItem p() {
        LivestreamEntityItem livestreamEntityItem = this.item_;
        return livestreamEntityItem == null ? LivestreamEntityItem.r() : livestreamEntityItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
