package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowShowRequest$ContinueListeningSection extends h implements v2j0 {
    private static final ShowShowRequest$ContinueListeningSection DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ShowShowRequest.ProtoShowRequestItem item_;

    static {
        ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = new ShowShowRequest$ContinueListeningSection();
        DEFAULT_INSTANCE = showShowRequest$ContinueListeningSection;
        h.registerDefaultInstance(ShowShowRequest$ContinueListeningSection.class, showShowRequest$ContinueListeningSection);
    }

    private ShowShowRequest$ContinueListeningSection() {
    }

    public static ShowShowRequest$ContinueListeningSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "item_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$ContinueListeningSection();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (ShowShowRequest$ContinueListeningSection.class) {
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

    public final boolean hasItem() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowShowRequest.ProtoShowRequestItem o() {
        ShowShowRequest.ProtoShowRequestItem protoShowRequestItem = this.item_;
        return protoShowRequestItem == null ? ShowShowRequest.ProtoShowRequestItem.n() : protoShowRequestItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
