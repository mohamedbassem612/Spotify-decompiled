package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Banner extends h implements v2j0 {
    public static final int COLORS_FIELD_NUMBER = 4;
    public static final int CTAS_FIELD_NUMBER = 5;
    private static final Banner DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISCLAIMER_FIELD_NUMBER = 6;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private Colors colors_;
    private Icon icon_;
    private String title_ = "";
    private String description_ = "";
    private h290 ctas_ = h.emptyProtobufList();
    private String disclaimer_ = "";
    private String ubiId_ = "";

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    public static Banner o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001d\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ለ\u0004dለ\u0005", new Object[]{"bitField0_", "icon_", "title_", "description_", "colors_", "ctas_", Cta.class, "disclaimer_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new uv9(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (Banner.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final Colors n() {
        Colors colors = this.colors_;
        return colors == null ? Colors.o() : colors;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.disclaimer_;
    }

    public final Icon q() {
        Icon icon = this.icon_;
        return icon == null ? Icon.o() : icon;
    }

    public final String r() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
