package com.spotify.destination;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.o8t;
import p.q8c;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class DestinationPageHeader extends h implements v2j0 {
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 2;
    public static final int CHIP_REFERENCES_FIELD_NUMBER = 3;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final DestinationPageHeader DEFAULT_INSTANCE;
    public static final int PAGE_TYPE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int pageType_;
    private String color_ = "";
    private String backgroundImage_ = "";
    private h290 chipReferences_ = h.emptyProtobufList();

    static {
        DestinationPageHeader destinationPageHeader = new DestinationPageHeader();
        DEFAULT_INSTANCE = destinationPageHeader;
        h.registerDefaultInstance(DestinationPageHeader.class, destinationPageHeader);
    }

    private DestinationPageHeader() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static DestinationPageHeader r(byte[] bArr) {
        return (DestinationPageHeader) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\f", new Object[]{"color_", "backgroundImage_", "chipReferences_", ChipReference.class, "pageType_"});
        }
        if (iOrdinal == 3) {
            return new DestinationPageHeader();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (DestinationPageHeader.class) {
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
        return this.backgroundImage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.chipReferences_;
    }

    public final String p() {
        return this.color_;
    }

    public final q8c q() {
        q8c q8cVar;
        int i = this.pageType_;
        if (i != 0) {
            q8cVar = i != 1 ? null : q8c.PAGE_TYPE_ALL_CATEGORIES;
        } else {
            q8cVar = q8c.PAGE_TYPE_DEFAULT;
        }
        return q8cVar == null ? q8c.UNRECOGNIZED : q8cVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
