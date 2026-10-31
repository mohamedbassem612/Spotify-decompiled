package com.spotify.profile.editprofile.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.cki1;
import p.d290;
import p.jf40;
import p.pvc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class UserprofileviewV4$GetBioAudienceResponse extends h implements v2j0 {
    public static final int AVAILABLE_FIELD_NUMBER = 2;
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$GetBioAudienceResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private static final c290 available_converter_ = new pvc((byte) 28);
    private int availableMemoizedSerializedSize;
    private b290 available_ = h.emptyIntList();
    private int current_;

    static {
        UserprofileviewV4$GetBioAudienceResponse userprofileviewV4$GetBioAudienceResponse = new UserprofileviewV4$GetBioAudienceResponse();
        DEFAULT_INSTANCE = userprofileviewV4$GetBioAudienceResponse;
        h.registerDefaultInstance(UserprofileviewV4$GetBioAudienceResponse.class, userprofileviewV4$GetBioAudienceResponse);
    }

    private UserprofileviewV4$GetBioAudienceResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"current_", "available_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$GetBioAudienceResponse();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (UserprofileviewV4$GetBioAudienceResponse.class) {
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

    public final d290 n() {
        return new d290(this.available_, available_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final cki1 o() {
        cki1 cki1VarA = cki1.a(this.current_);
        return cki1VarA == null ? cki1.UNRECOGNIZED : cki1VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
