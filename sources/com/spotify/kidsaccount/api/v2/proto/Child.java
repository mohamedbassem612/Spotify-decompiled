package com.spotify.kidsaccount.api.v2.proto;

import com.google.protobuf.StringValue;
import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Child extends h implements v2j0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final Child DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private StringValue imageUri_;
    private Profile profile_;

    static {
        Child child = new Child();
        DEFAULT_INSTANCE = child;
        h.registerDefaultInstance(Child.class, child);
    }

    private Child() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "childId_", "profile_", "imageUri_"});
        }
        if (iOrdinal == 3) {
            return new Child();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (Child.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final StringValue getImageUri() {
        StringValue stringValue = this.imageUri_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final Profile n() {
        Profile profile = this.profile_;
        return profile == null ? Profile.n() : profile;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
