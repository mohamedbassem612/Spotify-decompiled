package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.h290;
import p.i0z;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EntryPoint extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    private static final EntryPoint DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISCLAIMER_FIELD_NUMBER = 10;
    public static final int DISCLAIMER_ICON_FIELD_NUMBER = 11;
    public static final int KEYWORDS_FIELD_NUMBER = 12;
    public static final int LAYOUT_FIELD_NUMBER = 9;
    public static final int LEADING_ICON_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_COLORS_FIELD_NUMBER = 6;
    public static final int PROGRESS_PERCENTAGE_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRAILING_ICON_FIELD_NUMBER = 8;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    public static final int URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private Icon disclaimerIcon_;
    private int layout_;
    private Icon leadingIcon_;
    private Colors progressColors_;
    private float progressPercentage_;
    private Icon trailingIcon_;
    private String title_ = "";
    private String description_ = "";
    private String uri_ = "";
    private String accessibilityText_ = "";
    private String disclaimer_ = "";
    private h290 keywords_ = h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        EntryPoint entryPoint = new EntryPoint();
        DEFAULT_INSTANCE = entryPoint;
        h.registerDefaultInstance(EntryPoint.class, entryPoint);
    }

    private EntryPoint() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001d\r\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ለ\u0001\u0006ဉ\u0002\u0007ခ\u0003\bဉ\u0004\t\f\nለ\u0005\u000bဉ\u0006\fȚdለ\u0007", new Object[]{"bitField0_", "leadingIcon_", "title_", "description_", "uri_", "accessibilityText_", "progressColors_", "progressPercentage_", "trailingIcon_", "layout_", "disclaimer_", "disclaimerIcon_", "keywords_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new EntryPoint();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (EntryPoint.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final i0z n() {
        i0z i0zVar;
        switch (this.layout_) {
            case 0:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_UNSPECIFIED;
                break;
            case 1:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_BUTTON_PRIMARY;
                break;
            case 2:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_BUTTON_SECONDARY;
                break;
            case 3:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_BUTTON_TERTIARY;
                break;
            case 4:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_CARD_STANDARD;
                break;
            case 5:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_CARD_PROGRESS;
                break;
            case 6:
                i0zVar = i0z.ENTRY_POINT_LAYOUT_CARD_EDIT;
                break;
            default:
                i0zVar = null;
                break;
        }
        return i0zVar == null ? i0z.UNRECOGNIZED : i0zVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Icon o() {
        Icon icon = this.leadingIcon_;
        return icon == null ? Icon.o() : icon;
    }

    public final float p() {
        return this.progressPercentage_;
    }

    public final Icon q() {
        Icon icon = this.trailingIcon_;
        return icon == null ? Icon.o() : icon;
    }

    public final String r() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
