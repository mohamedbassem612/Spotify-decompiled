package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import com.google.type.DateTime;
import p.bf40;
import p.fin0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class NotInterestedBottomSheet extends h implements v2j0 {
    public static final int DATE_FIELD_NUMBER = 2;
    private static final NotInterestedBottomSheet DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private DateTime date_;
    private String imageUrl_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private h290 options_ = h.emptyProtobufList();

    static {
        NotInterestedBottomSheet notInterestedBottomSheet = new NotInterestedBottomSheet();
        DEFAULT_INSTANCE = notInterestedBottomSheet;
        h.registerDefaultInstance(NotInterestedBottomSheet.class, notInterestedBottomSheet);
    }

    private NotInterestedBottomSheet() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"bitField0_", "imageUrl_", "date_", "title_", "subtitle_", "options_", NotInterestedOption.class});
        }
        if (iOrdinal == 3) {
            return new NotInterestedBottomSheet();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (NotInterestedBottomSheet.class) {
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
