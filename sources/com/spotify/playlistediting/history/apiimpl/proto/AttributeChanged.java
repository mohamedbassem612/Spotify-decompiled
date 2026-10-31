package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.h2x0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AttributeChanged extends h implements v2j0 {
    public static final int CLEARED_FIELD_NUMBER = 2;
    private static final AttributeChanged DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SET_VALUES_FIELD_NUMBER = 1;
    private static final c290 cleared_converter_ = new h2x0((byte) 29);
    private int bitField0_;
    private int clearedMemoizedSerializedSize;
    private b290 cleared_ = h.emptyIntList();
    private Attributes setValues_;

    static {
        AttributeChanged attributeChanged = new AttributeChanged();
        DEFAULT_INSTANCE = attributeChanged;
        h.registerDefaultInstance(AttributeChanged.class, attributeChanged);
    }

    private AttributeChanged() {
    }

    public static AttributeChanged o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002,", new Object[]{"bitField0_", "setValues_", "cleared_"});
        }
        if (iOrdinal == 3) {
            return new AttributeChanged();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (AttributeChanged.class) {
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

    public final d290 n() {
        return new d290(this.cleared_, cleared_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Attributes p() {
        Attributes attributes = this.setValues_;
        return attributes == null ? Attributes.n() : attributes;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
