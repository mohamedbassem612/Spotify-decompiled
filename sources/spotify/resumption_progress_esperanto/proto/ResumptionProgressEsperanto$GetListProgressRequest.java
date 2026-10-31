package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.n831;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$GetListProgressRequest extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$GetListProgressRequest DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SORT_PARAMS_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 item_ = h.emptyProtobufList();
    private h290 sortParams_ = h.emptyProtobufList();
    private String pageIdentifier_ = "";

    static {
        ResumptionProgressEsperanto$GetListProgressRequest resumptionProgressEsperanto$GetListProgressRequest = new ResumptionProgressEsperanto$GetListProgressRequest();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetListProgressRequest;
        h.registerDefaultInstance(ResumptionProgressEsperanto$GetListProgressRequest.class, resumptionProgressEsperanto$GetListProgressRequest);
    }

    private ResumptionProgressEsperanto$GetListProgressRequest() {
    }

    public static n831 p() {
        return (n831) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002\u001b\u0003ለ\u0000", new Object[]{"bitField0_", "item_", "sortParams_", ResumptionProgressEsperanto$ListSortParam.class, "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetListProgressRequest();
        }
        if (iOrdinal == 4) {
            return new n831(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$GetListProgressRequest.class) {
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
        h290 h290VarMutableCopy = this.item_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.item_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.sortParams_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.sortParams_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.pageIdentifier_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
