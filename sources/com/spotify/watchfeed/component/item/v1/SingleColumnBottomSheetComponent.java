package com.spotify.watchfeed.component.item.v1;

import com.google.protobuf.Any;
import p.bf40;
import p.bn81;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleColumnBottomSheetComponent extends com.google.protobuf.h implements v2j0 {
    public static final int BODY_ITEMS_FIELD_NUMBER = 2;
    private static final SingleColumnBottomSheetComponent DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 bodyItems_ = com.google.protobuf.h.emptyProtobufList();
    private Any header_;

    static {
        SingleColumnBottomSheetComponent singleColumnBottomSheetComponent = new SingleColumnBottomSheetComponent();
        DEFAULT_INSTANCE = singleColumnBottomSheetComponent;
        com.google.protobuf.h.registerDefaultInstance(SingleColumnBottomSheetComponent.class, singleColumnBottomSheetComponent);
    }

    private SingleColumnBottomSheetComponent() {
    }

    public static SingleColumnBottomSheetComponent p(phc phcVar) {
        return (SingleColumnBottomSheetComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "header_", "bodyItems_", Any.class});
        }
        if (iOrdinal == 3) {
            return new SingleColumnBottomSheetComponent();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (SingleColumnBottomSheetComponent.class) {
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

    public final h290 n() {
        return this.bodyItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Any o() {
        Any any = this.header_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
