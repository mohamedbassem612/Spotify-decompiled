package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.i581;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;
import p.w3z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ValueProp extends h implements v2j0 {
    private static final ValueProp DEFAULT_INSTANCE;
    public static final int EPISODE_VALUE_PROP_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_VALUE_PROP_FIELD_NUMBER = 2;
    private int valuePropTypeCase_ = 0;
    private Object valuePropType_;

    static {
        ValueProp valueProp = new ValueProp();
        DEFAULT_INSTANCE = valueProp;
        h.registerDefaultInstance(ValueProp.class, valueProp);
    }

    private ValueProp() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000", new Object[]{"valuePropType_", "valuePropTypeCase_"});
        }
        if (iOrdinal == 3) {
            return new ValueProp();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ValueProp.class) {
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

    public final w3z n() {
        int i = this.valuePropTypeCase_;
        w3z w3zVar = w3z.EPISODE_GATED_VALUE_PROP_UNKNOWN;
        if (i == 1) {
            switch (((Integer) this.valuePropType_).intValue()) {
                case 0:
                    break;
                case 1:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_UNSPECIFIED;
                    break;
                case 2:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_AD_FREE;
                    break;
                case 3:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_EXTENDED;
                    break;
                case 4:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_EARLY_ACCESS;
                    break;
                case 5:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_VIDEO;
                    break;
                case 6:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES;
                    break;
                case 7:
                    w3zVar = w3z.EPISODE_GATED_VALUE_PROP_NONE;
                    break;
                default:
                    w3zVar = null;
                    break;
            }
            if (w3zVar == null) {
                return w3z.UNRECOGNIZED;
            }
        }
        return w3zVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final i581 o() {
        int i = this.valuePropTypeCase_;
        i581 i581Var = i581.SHOW_GATED_VALUE_PROP_UNKNOWN;
        if (i == 2) {
            switch (((Integer) this.valuePropType_).intValue()) {
                case 0:
                    break;
                case 1:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_UNSPECIFIED;
                    break;
                case 2:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_AD_FREE;
                    break;
                case 3:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_EXTENDED;
                    break;
                case 4:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_EARLY_ACCESS;
                    break;
                case 5:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_VIDEO;
                    break;
                case 6:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_FULL_LENGTH_EPISODES;
                    break;
                case 7:
                    i581Var = i581.SHOW_GATED_VALUE_PROP_BONUS;
                    break;
                default:
                    i581Var = null;
                    break;
            }
            if (i581Var == null) {
                return i581.UNRECOGNIZED;
            }
        }
        return i581Var;
    }

    public final int p() {
        int i = this.valuePropTypeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
