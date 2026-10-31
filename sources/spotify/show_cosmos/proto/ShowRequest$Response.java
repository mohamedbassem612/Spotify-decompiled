package spotify.show_cosmos.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowRequest$Response extends h implements v2j0 {
    public static final int AUXILIARY_SECTIONS_FIELD_NUMBER = 8;
    private static final ShowRequest$Response DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 5;
    public static final int LOADING_CONTENTS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int RANGE_OFFSET_FIELD_NUMBER = 10;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 4;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 7;
    private ShowRequest$AuxiliarySections auxiliarySections_;
    private int bitField0_;
    private ShowRequest$Header header_;
    private h290 item_ = h.emptyProtobufList();
    private int length_;
    private boolean loadingContents_;
    private int rangeOffset_;
    private int unfilteredLength_;
    private int unrangedLength_;

    static {
        ShowRequest$Response showRequest$Response = new ShowRequest$Response();
        DEFAULT_INSTANCE = showRequest$Response;
        h.registerDefaultInstance(ShowRequest$Response.class, showRequest$Response);
    }

    private ShowRequest$Response() {
    }

    public static ShowRequest$Response o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဇ\u0003\u0007ဋ\u0004\bဉ\u0005\nဋ\u0006", new Object[]{"bitField0_", "item_", ShowRequest.Item.class, "header_", "unfilteredLength_", "length_", "loadingContents_", "unrangedLength_", "auxiliarySections_", "rangeOffset_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$Response();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ShowRequest$Response.class) {
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

    public final ShowRequest$AuxiliarySections n() {
        ShowRequest$AuxiliarySections showRequest$AuxiliarySections = this.auxiliarySections_;
        return showRequest$AuxiliarySections == null ? ShowRequest$AuxiliarySections.o() : showRequest$AuxiliarySections;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowRequest$Header p() {
        ShowRequest$Header showRequest$Header = this.header_;
        return showRequest$Header == null ? ShowRequest$Header.n() : showRequest$Header;
    }

    public final int q() {
        return this.item_.size();
    }

    public final h290 r() {
        return this.item_;
    }

    public final boolean s() {
        return this.loadingContents_;
    }

    public final int t() {
        return this.rangeOffset_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        return this.unfilteredLength_;
    }

    public final int v() {
        return this.unrangedLength_;
    }
}
