package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.clc0;
import p.dnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType extends h implements v2j0 {
    private static final YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType DEFAULT_INSTANCE;
    public static final int LINK_TYPE_FIELD_NUMBER = 1;
    public static final int NUM_ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int linkType_;
    private int numItems_;

    static {
        YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType yourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType = new YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType.class, yourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType);
    }

    private YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"linkType_", "numItems_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType.class) {
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

    public final clc0 h() {
        clc0 clc0VarA = clc0.a(this.linkType_);
        return clc0VarA == null ? clc0.N0 : clc0VarA;
    }

    public final int i() {
        return this.numItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
