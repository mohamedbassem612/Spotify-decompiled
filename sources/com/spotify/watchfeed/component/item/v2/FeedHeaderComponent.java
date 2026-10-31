package com.spotify.watchfeed.component.item.v2;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.fs00;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FeedHeaderComponent extends h implements v2j0 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 5;
    public static final int BACK_BUTTON_FIELD_NUMBER = 4;
    public static final int BODY_FIELD_NUMBER = 6;
    private static final FeedHeaderComponent DEFAULT_INSTANCE;
    public static final int OVERLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Any actionButton_;
    private Any backButton_;
    private int bitField0_;
    private Any body_;
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        FeedHeaderComponent feedHeaderComponent = new FeedHeaderComponent();
        DEFAULT_INSTANCE = feedHeaderComponent;
        h.registerDefaultInstance(FeedHeaderComponent.class, feedHeaderComponent);
    }

    private FeedHeaderComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FeedHeaderComponent q(phc phcVar) {
        return (FeedHeaderComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "overline_", "title_", "subtitle_", "backButton_", "actionButton_", "body_"});
        }
        if (iOrdinal == 3) {
            return new FeedHeaderComponent();
        }
        if (iOrdinal == 4) {
            return new fs00(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (FeedHeaderComponent.class) {
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

    public final Any n() {
        Any any = this.actionButton_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Any o() {
        Any any = this.body_;
        return any == null ? Any.o() : any;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
