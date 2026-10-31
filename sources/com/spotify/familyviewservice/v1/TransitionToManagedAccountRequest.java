package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lmg1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class TransitionToManagedAccountRequest extends h implements v2j0 {
    private static final TransitionToManagedAccountRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    public static final int PARENT_PIN_HASH_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SETTINGS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String memberId_ = "";
    private String parentPinHash_ = "";
    private GenAlphaManagedSettings settings_;

    static {
        TransitionToManagedAccountRequest transitionToManagedAccountRequest = new TransitionToManagedAccountRequest();
        DEFAULT_INSTANCE = transitionToManagedAccountRequest;
        h.registerDefaultInstance(TransitionToManagedAccountRequest.class, transitionToManagedAccountRequest);
    }

    private TransitionToManagedAccountRequest() {
    }

    public static lmg1 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "memberId_", "settings_", "parentPinHash_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountRequest();
        }
        if (iOrdinal == 4) {
            return new lmg1();
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
        synchronized (TransitionToManagedAccountRequest.class) {
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

    public final void p(String str) {
        str.getClass();
        this.memberId_ = str;
    }

    public final void q(GenAlphaManagedSettings genAlphaManagedSettings) {
        genAlphaManagedSettings.getClass();
        this.settings_ = genAlphaManagedSettings;
        this.bitField0_ |= 1;
    }

    public final void setParentPinHash(String str) {
        this.bitField0_ |= 2;
        this.parentPinHash_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
