package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.hhe;
import p.jf40;
import p.ogg;
import p.pgg;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ClickAction extends h implements v2j0 {
    public static final int ACTIONURL_FIELD_NUMBER = 2;
    public static final int CLICKACTIONIDENTIFIER_FIELD_NUMBER = 1;
    public static final int CLICK_ACTION_TYPE_FIELD_NUMBER = 4;
    private static final ClickAction DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int clickActionType_;
    private qng0 metadata_ = qng0.b;
    private String clickActionIdentifier_ = "";
    private String actionUrl_ = "";

    static {
        ClickAction clickAction = new ClickAction();
        DEFAULT_INSTANCE = clickAction;
        h.registerDefaultInstance(ClickAction.class, clickAction);
    }

    private ClickAction() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ClickAction r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u00032\u0004\f", new Object[]{"bitField0_", "clickActionIdentifier_", "actionUrl_", "metadata_", ogg.a, "clickActionType_"});
        }
        if (iOrdinal == 3) {
            return new ClickAction();
        }
        if (iOrdinal == 4) {
            return new hhe((byte) 28);
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
        synchronized (ClickAction.class) {
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

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.actionUrl_;
    }

    public final String p() {
        return this.clickActionIdentifier_;
    }

    public final pgg q() {
        pgg pggVarA = pgg.a(this.clickActionType_);
        return pggVarA == null ? pgg.d1 : pggVarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
