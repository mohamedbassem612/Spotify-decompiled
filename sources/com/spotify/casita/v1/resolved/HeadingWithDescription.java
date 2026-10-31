package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class HeadingWithDescription extends h implements v2j0 {
    private static final HeadingWithDescription DEFAULT_INSTANCE;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 3;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private NavigationAction navigationAction_;
    private String title_ = "";
    private String subtitle_ = "";
    private String encoreIconName_ = "";

    static {
        HeadingWithDescription headingWithDescription = new HeadingWithDescription();
        DEFAULT_INSTANCE = headingWithDescription;
        h.registerDefaultInstance(HeadingWithDescription.class, headingWithDescription);
    }

    private HeadingWithDescription() {
    }

    public static HeadingWithDescription o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "title_", "subtitle_", "encoreIconName_", "navigationAction_"});
        }
        if (iOrdinal == 3) {
            return new HeadingWithDescription();
        }
        if (iOrdinal == 4) {
            return new zp50((byte) 27);
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
        synchronized (HeadingWithDescription.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.encoreIconName_;
    }

    public final NavigationAction q() {
        NavigationAction navigationAction = this.navigationAction_;
        return navigationAction == null ? NavigationAction.o() : navigationAction;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
