package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class InfoPanel extends h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 6;
    private static final InfoPanel DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISCLAIMER_FIELD_NUMBER = 4;
    public static final int DISCLAIMER_ICON_FIELD_NUMBER = 5;
    public static final int ENTRY_POINTS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private EntryPointCard entryPoints_;
    private String title_ = "";
    private String description_ = "";
    private String disclaimer_ = "";
    private String disclaimerIcon_ = "";
    private h290 attributes_ = h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        InfoPanel infoPanel = new InfoPanel();
        DEFAULT_INSTANCE = infoPanel;
        h.registerDefaultInstance(InfoPanel.class, infoPanel);
    }

    private InfoPanel() {
    }

    public static InfoPanel o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001d\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006\u001bdለ\u0003", new Object[]{"bitField0_", "title_", "description_", "entryPoints_", "disclaimer_", "disclaimerIcon_", "attributes_", InfoPanelAttribute.class, "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new InfoPanel();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (InfoPanel.class) {
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

    public final List n() {
        return this.attributes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.disclaimer_;
    }

    public final EntryPointCard q() {
        EntryPointCard entryPointCard = this.entryPoints_;
        return entryPointCard == null ? EntryPointCard.n() : entryPointCard;
    }

    public final String r() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
