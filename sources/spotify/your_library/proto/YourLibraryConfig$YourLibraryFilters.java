package spotify.your_library.proto;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.er80;
import p.i9;
import p.ism1;
import p.jf40;
import p.jsm1;
import p.ksm1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryConfig$YourLibraryFilters extends h implements v2j0 {
    private static final YourLibraryConfig$YourLibraryFilters DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 filter_converter_ = new ism1();
    private int filterMemoizedSerializedSize;
    private b290 filter_ = h.emptyIntList();

    static {
        YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters = new YourLibraryConfig$YourLibraryFilters();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryFilters;
        h.registerDefaultInstance(YourLibraryConfig$YourLibraryFilters.class, yourLibraryConfig$YourLibraryFilters);
    }

    private YourLibraryConfig$YourLibraryFilters() {
    }

    public static YourLibraryConfig$YourLibraryFilters p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static jsm1 r() {
        return (jsm1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"filter_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryFilters();
        }
        if (iOrdinal == 4) {
            return new jsm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryConfig$YourLibraryFilters.class) {
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
        i9 i9Var = this.filter_;
        if (!i9Var.a) {
            this.filter_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ksm1 ksm1Var = (ksm1) it.next();
            this.filter_.c(ksm1Var.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ksm1 ksm1Var) {
        ksm1Var.getClass();
        b290 b290VarMutableCopy = this.filter_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.filter_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(ksm1Var.getNumber());
    }

    public final d290 q() {
        return new d290(this.filter_, filter_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
