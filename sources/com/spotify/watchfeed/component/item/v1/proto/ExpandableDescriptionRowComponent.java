package com.spotify.watchfeed.component.item.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ExpandableDescriptionRowComponent extends h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 1;
    public static final int COLLAPSE_TEXT_FIELD_NUMBER = 3;
    private static final ExpandableDescriptionRowComponent DEFAULT_INSTANCE;
    public static final int EXPAND_TEXT_FIELD_NUMBER = 2;
    public static final int HEADING_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private String body_ = "";
    private String expandText_ = "";
    private String collapseText_ = "";
    private String heading_ = "";

    static {
        ExpandableDescriptionRowComponent expandableDescriptionRowComponent = new ExpandableDescriptionRowComponent();
        DEFAULT_INSTANCE = expandableDescriptionRowComponent;
        h.registerDefaultInstance(ExpandableDescriptionRowComponent.class, expandableDescriptionRowComponent);
    }

    private ExpandableDescriptionRowComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ExpandableDescriptionRowComponent r(phc phcVar) {
        return (ExpandableDescriptionRowComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"body_", "expandText_", "collapseText_", "heading_"});
        }
        if (iOrdinal == 3) {
            return new ExpandableDescriptionRowComponent();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ExpandableDescriptionRowComponent.class) {
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
        return this.body_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.collapseText_;
    }

    public final String p() {
        return this.expandText_;
    }

    public final String q() {
        return this.heading_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
