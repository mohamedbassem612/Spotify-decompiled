package com.spotify.addonconsideration.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eku;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EmphasizedIconListItem extends h implements v2j0 {
    private static final EmphasizedIconListItem DEFAULT_INSTANCE;
    public static final int ICON_COLOR_FIELD_NUMBER = 2;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String icon_ = "";
    private String iconColor_ = "";
    private String title_ = "";
    private String text_ = "";

    static {
        EmphasizedIconListItem emphasizedIconListItem = new EmphasizedIconListItem();
        DEFAULT_INSTANCE = emphasizedIconListItem;
        h.registerDefaultInstance(EmphasizedIconListItem.class, emphasizedIconListItem);
    }

    private EmphasizedIconListItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004Ȉ", new Object[]{"bitField0_", "icon_", "iconColor_", "title_", "text_"});
        }
        if (iOrdinal == 3) {
            return new EmphasizedIconListItem();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (EmphasizedIconListItem.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.icon_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.iconColor_;
    }

    public final String p() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
