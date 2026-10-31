package spotify.transcript_search.v1;

import com.google.protobuf.h;
import p.bf40;
import p.f851;
import p.h290;
import p.i9;
import p.j8h0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SearchRequest extends h implements v2j0 {
    private static final SearchRequest DEFAULT_INSTANCE;
    public static final int MATCH_BOUNDARIES_CONFIG_FIELD_NUMBER = 5;
    public static final int MATCH_START_HIGHLIGHT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 2;
    public static final int TEXT_LINES_FIELD_NUMBER = 1;
    public static final int TIME_OFFSET_HIGHLIGHT_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object highlightConfig_;
    private int matchBoundariesConfig_;
    private int highlightConfigCase_ = 0;
    private h290 textLines_ = h.emptyProtobufList();
    private String showUri_ = "";

    static {
        SearchRequest searchRequest = new SearchRequest();
        DEFAULT_INSTANCE = searchRequest;
        h.registerDefaultInstance(SearchRequest.class, searchRequest);
    }

    private SearchRequest() {
    }

    public static f851 o() {
        return (f851) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003<\u0000\u0004<\u0000\u0005ဌ\u0001", new Object[]{"highlightConfig_", "highlightConfigCase_", "bitField0_", "textLines_", "showUri_", MatchHighlight.class, TimeOffsetHighlight.class, "matchBoundariesConfig_"});
        }
        if (iOrdinal == 3) {
            return new SearchRequest();
        }
        if (iOrdinal == 4) {
            return new f851(DEFAULT_INSTANCE);
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
        synchronized (SearchRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.textLines_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.textLines_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(j8h0 j8h0Var) {
        this.matchBoundariesConfig_ = j8h0Var.getNumber();
        this.bitField0_ |= 2;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.showUri_ = str;
    }

    public final void r(TimeOffsetHighlight timeOffsetHighlight) {
        timeOffsetHighlight.getClass();
        this.highlightConfig_ = timeOffsetHighlight;
        this.highlightConfigCase_ = 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
