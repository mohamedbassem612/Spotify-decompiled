package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fs00;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ExplicitFeedback extends h implements v2j0 {
    public static final int COMPARE_WITH_CORE_FIELD_NUMBER = 2;
    private static final ExplicitFeedback DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITIONS_FIELD_NUMBER = 1;
    private boolean compareWithCore_;
    private h290 transitions_ = h.emptyProtobufList();

    static {
        ExplicitFeedback explicitFeedback = new ExplicitFeedback();
        DEFAULT_INSTANCE = explicitFeedback;
        h.registerDefaultInstance(ExplicitFeedback.class, explicitFeedback);
    }

    private ExplicitFeedback() {
    }

    public static ExplicitFeedback p(byte[] bArr) {
        return (ExplicitFeedback) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"transitions_", BackendTransition.class, "compareWithCore_"});
        }
        if (iOrdinal == 3) {
            return new ExplicitFeedback();
        }
        if (iOrdinal == 4) {
            return new fs00(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ExplicitFeedback.class) {
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

    public final boolean n() {
        return this.compareWithCore_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.transitions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
