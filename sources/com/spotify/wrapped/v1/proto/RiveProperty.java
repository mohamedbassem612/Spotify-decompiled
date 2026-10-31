package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RiveProperty extends h implements v2j0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    public static final int COLOR_VALUE_FIELD_NUMBER = 5;
    private static final RiveProperty DEFAULT_INSTANCE;
    public static final int ENUM_VALUE_FIELD_NUMBER = 6;
    public static final int IMAGE_URL_FIELD_NUMBER = 7;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 1;
    public static final int TRIGGER_VALUE_FIELD_NUMBER = 4;
    private int kindCase_ = 0;
    private Object kind_;

    public static final class Trigger extends h implements v2j0 {
        private static final Trigger DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Trigger trigger = new Trigger();
            DEFAULT_INSTANCE = trigger;
            h.registerDefaultInstance(Trigger.class, trigger);
        }

        private Trigger() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Trigger();
            }
            if (iOrdinal == 4) {
                return new r0(DEFAULT_INSTANCE);
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
            synchronized (Trigger.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        RiveProperty riveProperty = new RiveProperty();
        DEFAULT_INSTANCE = riveProperty;
        h.registerDefaultInstance(RiveProperty.class, riveProperty);
    }

    private RiveProperty() {
    }

    public static RiveProperty o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00034\u0000\u0004<\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȼ\u0000", new Object[]{"kind_", "kindCase_", Trigger.class});
        }
        if (iOrdinal == 3) {
            return new RiveProperty();
        }
        if (iOrdinal == 4) {
            return new q0(DEFAULT_INSTANCE);
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
        synchronized (RiveProperty.class) {
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

    public final boolean getBoolValue() {
        if (this.kindCase_ == 2) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getImageUrl() {
        return this.kindCase_ == 7 ? (String) this.kind_ : "";
    }

    public final String getStringValue() {
        return this.kindCase_ == 1 ? (String) this.kind_ : "";
    }

    public final String n() {
        return this.kindCase_ == 5 ? (String) this.kind_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.kindCase_ == 6 ? (String) this.kind_ : "";
    }

    public final int q() {
        switch (this.kindCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public final float r() {
        if (this.kindCase_ == 3) {
            return ((Float) this.kind_).floatValue();
        }
        return 0.0f;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
