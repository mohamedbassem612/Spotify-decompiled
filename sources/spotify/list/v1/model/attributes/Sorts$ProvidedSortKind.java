package spotify.list.v1.model.attributes;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Sorts$ProvidedSortKind extends h implements v2j0 {
    private static final Sorts$ProvidedSortKind DEFAULT_INSTANCE;
    public static final int DESCENDING_FIELD_NUMBER = 4;
    public static final int INTERNAL_ID_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REVERSIBLE_FIELD_NUMBER = 5;
    public static final int SORT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean descending_;
    private boolean reversible_;
    private int sortId_;
    private String name_ = "";
    private String internalId_ = "";

    static {
        Sorts$ProvidedSortKind sorts$ProvidedSortKind = new Sorts$ProvidedSortKind();
        DEFAULT_INSTANCE = sorts$ProvidedSortKind;
        h.registerDefaultInstance(Sorts$ProvidedSortKind.class, sorts$ProvidedSortKind);
    }

    private Sorts$ProvidedSortKind() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "sortId_", "name_", "internalId_", "descending_", "reversible_"});
        }
        if (iOrdinal == 3) {
            return new Sorts$ProvidedSortKind();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (Sorts$ProvidedSortKind.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
