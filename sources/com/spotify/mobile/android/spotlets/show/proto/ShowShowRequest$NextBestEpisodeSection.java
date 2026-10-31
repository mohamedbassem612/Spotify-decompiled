package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjj0;
import p.ja81;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowShowRequest$NextBestEpisodeSection extends h implements v2j0 {
    private static final ShowShowRequest$NextBestEpisodeSection DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ShowShowRequest.ProtoShowRequestItem item_;
    private int label_;

    static {
        ShowShowRequest$NextBestEpisodeSection showShowRequest$NextBestEpisodeSection = new ShowShowRequest$NextBestEpisodeSection();
        DEFAULT_INSTANCE = showShowRequest$NextBestEpisodeSection;
        h.registerDefaultInstance(ShowShowRequest$NextBestEpisodeSection.class, showShowRequest$NextBestEpisodeSection);
    }

    private ShowShowRequest$NextBestEpisodeSection() {
    }

    public static ShowShowRequest$NextBestEpisodeSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "label_", cjj0.q, "item_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$NextBestEpisodeSection();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (ShowShowRequest$NextBestEpisodeSection.class) {
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
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowShowRequest.ProtoShowRequestItem o() {
        ShowShowRequest.ProtoShowRequestItem protoShowRequestItem = this.item_;
        return protoShowRequestItem == null ? ShowShowRequest.ProtoShowRequestItem.n() : protoShowRequestItem;
    }

    public final ja81 p() {
        ja81 ja81VarA = ja81.a(this.label_);
        return ja81VarA == null ? ja81.b : ja81VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
