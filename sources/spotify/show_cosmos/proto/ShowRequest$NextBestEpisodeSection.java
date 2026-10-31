package spotify.show_cosmos.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjj0;
import p.jf40;
import p.l981;
import p.o981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowRequest$NextBestEpisodeSection extends h implements v2j0 {
    private static final ShowRequest$NextBestEpisodeSection DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ShowRequest.Item item_;
    private int label_;

    static {
        ShowRequest$NextBestEpisodeSection showRequest$NextBestEpisodeSection = new ShowRequest$NextBestEpisodeSection();
        DEFAULT_INSTANCE = showRequest$NextBestEpisodeSection;
        h.registerDefaultInstance(ShowRequest$NextBestEpisodeSection.class, showRequest$NextBestEpisodeSection);
    }

    private ShowRequest$NextBestEpisodeSection() {
    }

    public static ShowRequest$NextBestEpisodeSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "label_", cjj0.p, "item_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$NextBestEpisodeSection();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ShowRequest$NextBestEpisodeSection.class) {
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

    public final ShowRequest.Item o() {
        ShowRequest.Item item = this.item_;
        return item == null ? ShowRequest.Item.n() : item;
    }

    public final o981 p() {
        o981 o981VarA = o981.a(this.label_);
        return o981VarA == null ? o981.UNKNOWN : o981VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
