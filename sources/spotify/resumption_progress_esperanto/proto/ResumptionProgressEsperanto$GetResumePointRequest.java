package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.p831;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.x831;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResumptionProgressEsperanto$GetResumePointRequest extends h implements v2j0 {
    private static final ResumptionProgressEsperanto$GetResumePointRequest DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USE_CASE_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int VIEW_FIELD_NUMBER = 4;
    private h290 items_ = h.emptyProtobufList();
    private String pageIdentifier_ = "";
    private String useCaseIdentifier_ = "";
    private int view_;

    static {
        ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest = new ResumptionProgressEsperanto$GetResumePointRequest();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetResumePointRequest;
        h.registerDefaultInstance(ResumptionProgressEsperanto$GetResumePointRequest.class, resumptionProgressEsperanto$GetResumePointRequest);
    }

    private ResumptionProgressEsperanto$GetResumePointRequest() {
    }

    public static p831 p() {
        return (p831) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"items_", "pageIdentifier_", "useCaseIdentifier_", "view_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetResumePointRequest();
        }
        if (iOrdinal == 4) {
            return new p831(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$GetResumePointRequest.class) {
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
        h290 h290VarMutableCopy = this.items_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.items_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.items_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.items_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(String str) {
        str.getClass();
        this.pageIdentifier_ = str;
    }

    public final void r(String str) {
        this.useCaseIdentifier_ = str;
    }

    public final void s() {
        this.view_ = x831.RESUME_POINT_VIEW_BASIC.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
