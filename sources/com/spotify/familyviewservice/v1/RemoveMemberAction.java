package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RemoveMemberAction extends h implements v2j0 {
    private static final RemoveMemberAction DEFAULT_INSTANCE;
    public static final int DEFAULT_REMOVE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_WITH_DOWNGRADE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 10;
    public static final int UBI_ID_FIELD_NUMBER = 11;
    private Object type_;
    private int typeCase_ = 0;
    private String title_ = "";
    private String ubiId_ = "";

    static {
        RemoveMemberAction removeMemberAction = new RemoveMemberAction();
        DEFAULT_INSTANCE = removeMemberAction;
        h.registerDefaultInstance(RemoveMemberAction.class, removeMemberAction);
    }

    private RemoveMemberAction() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u000b\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\nȈ\u000bȈ", new Object[]{"type_", "typeCase_", DefaultRemoveActionType.class, RemoveWithDowngradeActionType.class, "title_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new RemoveMemberAction();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (RemoveMemberAction.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final RemoveWithDowngradeActionType n() {
        return this.typeCase_ == 2 ? (RemoveWithDowngradeActionType) this.type_ : RemoveWithDowngradeActionType.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.typeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final String p() {
        return this.ubiId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
