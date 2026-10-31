package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oro;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CustomTransitionChanged extends h implements v2j0 {
    private static final CustomTransitionChanged DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_ITEM_FIELD_NUMBER = 2;
    public static final int TARGET_ITEM_FIELD_NUMBER = 3;
    public static final int TRANSITION_URI_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Item sourceItem_;
    private Item targetItem_;
    private String transitionUri_ = "";
    private int type_;

    static {
        CustomTransitionChanged customTransitionChanged = new CustomTransitionChanged();
        DEFAULT_INSTANCE = customTransitionChanged;
        h.registerDefaultInstance(CustomTransitionChanged.class, customTransitionChanged);
    }

    private CustomTransitionChanged() {
    }

    public static CustomTransitionChanged n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "type_", "sourceItem_", "targetItem_", "transitionUri_"});
        }
        if (iOrdinal == 3) {
            return new CustomTransitionChanged();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (CustomTransitionChanged.class) {
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

    public final Item o() {
        Item item = this.sourceItem_;
        return item == null ? Item.o() : item;
    }

    public final Item p() {
        Item item = this.targetItem_;
        return item == null ? Item.o() : item;
    }

    public final oro q() {
        oro oroVar;
        int i = this.type_;
        if (i == 0) {
            oroVar = oro.CUSTOM_TRANSITION_CHANGE_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            oroVar = oro.CUSTOM_TRANSITION_CHANGE_TYPE_ADDED;
        } else if (i != 2) {
            oroVar = i != 3 ? null : oro.CUSTOM_TRANSITION_CHANGE_TYPE_CLEARED;
        } else {
            oroVar = oro.CUSTOM_TRANSITION_CHANGE_TYPE_EDITED;
        }
        return oroVar == null ? oro.UNRECOGNIZED : oroVar;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
