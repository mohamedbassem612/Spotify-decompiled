package com.spotify.kidsentitybanning.banning.v1;

import com.google.protobuf.h;
import p.bf40;
import p.d0g;
import p.e0g;
import p.f4a;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ChildBanStatus extends h implements e0g {
    public static final int AVATAR_FIELD_NUMBER = 3;
    public static final int BANNED_FOR_CHILD_FIELD_NUMBER = 4;
    public static final int BAN_STATUS_FIELD_NUMBER = 6;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    public static final int COLOR_FIELD_NUMBER = 5;
    private static final ChildBanStatus DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int banStatus_;
    private boolean bannedForChild_;
    private int bitField0_;
    private int color_;
    private String childId_ = "";
    private String name_ = "";
    private String avatar_ = "";

    static {
        ChildBanStatus childBanStatus = new ChildBanStatus();
        DEFAULT_INSTANCE = childBanStatus;
        h.registerDefaultInstance(ChildBanStatus.class, childBanStatus);
    }

    private ChildBanStatus() {
    }

    public static d0g n() {
        return (d0g) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005င\u0000\u0006\f", new Object[]{"bitField0_", "childId_", "name_", "avatar_", "bannedForChild_", "color_", "banStatus_"});
        }
        if (iOrdinal == 3) {
            return new ChildBanStatus();
        }
        if (iOrdinal == 4) {
            return new d0g(DEFAULT_INSTANCE);
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
        synchronized (ChildBanStatus.class) {
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

    @Override // p.e0g
    public final boolean g() {
        return this.bannedForChild_;
    }

    @Override // p.e0g
    public final String getAvatar() {
        return this.avatar_;
    }

    @Override // p.e0g
    public final String getChildId() {
        return this.childId_;
    }

    @Override // p.e0g
    public final int getColor() {
        return this.color_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // p.e0g
    public final String getName() {
        return this.name_;
    }

    @Override // p.e0g
    public final boolean hasColor() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(f4a f4aVar) {
        this.banStatus_ = f4aVar.getNumber();
    }

    public final void p(boolean z) {
        this.bannedForChild_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.childId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
