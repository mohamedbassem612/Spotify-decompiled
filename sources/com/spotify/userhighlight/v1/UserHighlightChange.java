package com.spotify.userhighlight.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mai1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UserHighlightChange extends h implements v2j0 {
    private static final UserHighlightChange DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int END_OFFSET_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_OFFSET_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration endOffset_;
    private EntityReference parent_;
    private Duration startOffset_;
    private String uri_ = "";
    private String description_ = "";
    private String title_ = "";

    static {
        UserHighlightChange userHighlightChange = new UserHighlightChange();
        DEFAULT_INSTANCE = userHighlightChange;
        h.registerDefaultInstance(UserHighlightChange.class, userHighlightChange);
    }

    private UserHighlightChange() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static mai1 q() {
        return (mai1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "uri_", "parent_", "startOffset_", "endOffset_", "description_", "title_"});
        }
        if (iOrdinal == 3) {
            return new UserHighlightChange();
        }
        if (iOrdinal == 4) {
            return new mai1(DEFAULT_INSTANCE);
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
        synchronized (UserHighlightChange.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final boolean n() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 32) != 0;
    }

    public final void r(Duration duration) {
        this.endOffset_ = duration;
        this.bitField0_ |= 8;
    }

    public final void s(EntityReference entityReference) {
        entityReference.getClass();
        this.parent_ = entityReference;
        this.bitField0_ |= 2;
    }

    public final void t(Duration duration) {
        this.startOffset_ = duration;
        this.bitField0_ |= 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.title_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.uri_ = str;
    }
}
