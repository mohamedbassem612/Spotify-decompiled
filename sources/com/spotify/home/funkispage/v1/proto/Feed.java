package com.spotify.home.funkispage.v1.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.fs00;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vd60;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Feed extends h implements v2j0 {
    public static final int ANIMATION_FIELD_NUMBER = 6;
    public static final int CHILDREN_FIELD_NUMBER = 3;
    private static final Feed DEFAULT_INSTANCE;
    public static final int HIGHLIGHT_COLOR_FIELD_NUMBER = 5;
    public static final int HIGHLIGHT_SCHEME_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    private Animation animation_;
    private int bitField0_;
    private int highlightScheme_;
    private int type_;
    private String id_ = "";
    private String name_ = "";
    private h290 children_ = h.emptyProtobufList();
    private String highlightColor_ = "";

    static {
        Feed feed = new Feed();
        DEFAULT_INSTANCE = feed;
        h.registerDefaultInstance(Feed.class, feed);
    }

    private Feed() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\f\u0005Ȉ\u0006ဉ\u0000\b\f", new Object[]{"bitField0_", "id_", "name_", "children_", Feed.class, "highlightScheme_", "highlightColor_", "animation_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Feed();
        }
        if (iOrdinal == 4) {
            return new fs00((byte) 14);
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
        synchronized (Feed.class) {
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

    public final List getChildrenList() {
        return this.children_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getId() {
        return this.id_;
    }

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Animation o() {
        Animation animation = this.animation_;
        return animation == null ? Animation.o() : animation;
    }

    public final String p() {
        return this.highlightColor_;
    }

    public final vd60 q() {
        vd60 vd60Var;
        int i = this.highlightScheme_;
        if (i == 0) {
            vd60Var = vd60.NONE;
        } else if (i == 1) {
            vd60Var = vd60.WRAPPED;
        } else if (i != 2) {
            vd60Var = i != 3 ? null : vd60.AUDIOBOOKS;
        } else {
            vd60Var = vd60.NEW_RELEASES;
        }
        return vd60Var == null ? vd60.UNRECOGNIZED : vd60Var;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
