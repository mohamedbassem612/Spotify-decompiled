package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.hy91;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SocialConnectSessionAskToJoinResult extends h implements v2j0 {
    private static final SocialConnectSessionAskToJoinResult DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHODS_FIELD_NUMBER = 7;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 4;
    public static final int ERROR_DATA_FIELD_NUMBER = 3;
    public static final int JOIN_ATTEMPT_ID_FIELD_NUMBER = 8;
    public static final int JOIN_TYPE_FIELD_NUMBER = 5;
    public static final int JOIN_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PARTICIPATION_MODE_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sessionId_ = "";
    private String joinUrl_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";
    private String joinType_ = "";
    private String participationMode_ = "";
    private h290 discoveryMethods_ = h.emptyProtobufList();
    private String joinAttemptId_ = "";

    static {
        SocialConnectSessionAskToJoinResult socialConnectSessionAskToJoinResult = new SocialConnectSessionAskToJoinResult();
        DEFAULT_INSTANCE = socialConnectSessionAskToJoinResult;
        h.registerDefaultInstance(SocialConnectSessionAskToJoinResult.class, socialConnectSessionAskToJoinResult);
    }

    private SocialConnectSessionAskToJoinResult() {
    }

    public static hy91 o() {
        return (hy91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007\u001a\bဈ\u0006", new Object[]{"bitField0_", "sessionId_", "joinUrl_", "errorData_", "errorCategory_", "joinType_", "participationMode_", "discoveryMethods_", "joinAttemptId_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectSessionAskToJoinResult();
        }
        if (iOrdinal == 4) {
            return new hy91(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectSessionAskToJoinResult.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.discoveryMethods_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.discoveryMethods_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.errorCategory_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.errorData_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 64;
        this.joinAttemptId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.joinType_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.joinUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 32;
        this.participationMode_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
