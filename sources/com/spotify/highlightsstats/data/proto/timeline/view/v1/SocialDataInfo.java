package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Person;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.bn81;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SocialDataInfo extends h implements v2j0 {
    private static final SocialDataInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SOCIAL_USERS_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 socialUsers_ = h.emptyProtobufList();
    private Paragraph text_;

    static {
        SocialDataInfo socialDataInfo = new SocialDataInfo();
        DEFAULT_INSTANCE = socialDataInfo;
        h.registerDefaultInstance(SocialDataInfo.class, socialDataInfo);
    }

    private SocialDataInfo() {
    }

    public static SocialDataInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "text_", "socialUsers_", Person.class});
        }
        if (iOrdinal == 3) {
            return new SocialDataInfo();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (SocialDataInfo.class) {
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

    public final h290 o() {
        return this.socialUsers_;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.text_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
