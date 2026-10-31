package com.spotify.watchfeed.component.item.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ljj0;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MuteButtonComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_MUTED_TEXT_FIELD_NUMBER = 1;
    public static final int ACCESSIBILITY_UNMUTED_TEXT_FIELD_NUMBER = 2;
    private static final MuteButtonComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String accessibilityMutedText_ = "";
    private String accessibilityUnmutedText_ = "";

    static {
        MuteButtonComponent muteButtonComponent = new MuteButtonComponent();
        DEFAULT_INSTANCE = muteButtonComponent;
        h.registerDefaultInstance(MuteButtonComponent.class, muteButtonComponent);
    }

    private MuteButtonComponent() {
    }

    public static MuteButtonComponent p(phc phcVar) {
        return (MuteButtonComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"accessibilityMutedText_", "accessibilityUnmutedText_"});
        }
        if (iOrdinal == 3) {
            return new MuteButtonComponent();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (MuteButtonComponent.class) {
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

    public final String n() {
        return this.accessibilityMutedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibilityUnmutedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
