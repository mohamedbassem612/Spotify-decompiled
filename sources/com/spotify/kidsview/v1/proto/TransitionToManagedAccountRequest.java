package com.spotify.kidsview.v1.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class TransitionToManagedAccountRequest extends h implements TransitionToManagedAccountRequestOrBuilder {
    private static final TransitionToManagedAccountRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 2;
    public static final int PARENTAL_CONSENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int PARENT_PIN_HASH_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SETTINGS_FIELD_NUMBER = 3;
    private int bitField0_;
    private GenAlphaManagedSettings settings_;
    private Object transitioningUserIdentifier_;
    private int transitioningUserIdentifierCase_ = 0;
    private String parentPinHash_ = "";

    static {
        TransitionToManagedAccountRequest transitionToManagedAccountRequest = new TransitionToManagedAccountRequest();
        DEFAULT_INSTANCE = transitionToManagedAccountRequest;
        h.registerDefaultInstance(TransitionToManagedAccountRequest.class, transitionToManagedAccountRequest);
    }

    private TransitionToManagedAccountRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberId() {
        if (this.transitioningUserIdentifierCase_ == 2) {
            this.transitioningUserIdentifierCase_ = 0;
            this.transitioningUserIdentifier_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentPinHash() {
        this.bitField0_ &= -3;
        this.parentPinHash_ = getDefaultInstance().getParentPinHash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentalConsentSessionId() {
        if (this.transitioningUserIdentifierCase_ == 1) {
            this.transitioningUserIdentifierCase_ = 0;
            this.transitioningUserIdentifier_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettings() {
        this.settings_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransitioningUserIdentifier() {
        this.transitioningUserIdentifierCase_ = 0;
        this.transitioningUserIdentifier_ = null;
    }

    public static TransitionToManagedAccountRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
        genAlphaManagedSettings.getClass();
        GenAlphaManagedSettings genAlphaManagedSettings2 = this.settings_;
        if (genAlphaManagedSettings2 == null || genAlphaManagedSettings2 == GenAlphaManagedSettings.getDefaultInstance()) {
            this.settings_ = genAlphaManagedSettings;
        } else {
            this.settings_ = GenAlphaManagedSettings.newBuilder(this.settings_).mergeFrom(genAlphaManagedSettings).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TransitionToManagedAccountRequest parseDelimitedFrom(InputStream inputStream) {
        return (TransitionToManagedAccountRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountRequest parseFrom(ByteBuffer byteBuffer) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberId(String str) {
        str.getClass();
        this.transitioningUserIdentifierCase_ = 2;
        this.transitioningUserIdentifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.transitioningUserIdentifier_ = phcVar.v();
        this.transitioningUserIdentifierCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentPinHash(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.parentPinHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentPinHashBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.parentPinHash_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentalConsentSessionId(String str) {
        str.getClass();
        this.transitioningUserIdentifierCase_ = 1;
        this.transitioningUserIdentifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentalConsentSessionIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.transitioningUserIdentifier_ = phcVar.v();
        this.transitioningUserIdentifierCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
        genAlphaManagedSettings.getClass();
        this.settings_ = genAlphaManagedSettings;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ለ\u0001", new Object[]{"transitioningUserIdentifier_", "transitioningUserIdentifierCase_", "bitField0_", "settings_", "parentPinHash_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountRequest();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public String getMemberId() {
        return this.transitioningUserIdentifierCase_ == 2 ? (String) this.transitioningUserIdentifier_ : "";
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public phc getMemberIdBytes() {
        return phc.i(this.transitioningUserIdentifierCase_ == 2 ? (String) this.transitioningUserIdentifier_ : "");
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public String getParentPinHash() {
        return this.parentPinHash_;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public phc getParentPinHashBytes() {
        return phc.i(this.parentPinHash_);
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public String getParentalConsentSessionId() {
        return this.transitioningUserIdentifierCase_ == 1 ? (String) this.transitioningUserIdentifier_ : "";
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public phc getParentalConsentSessionIdBytes() {
        return phc.i(this.transitioningUserIdentifierCase_ == 1 ? (String) this.transitioningUserIdentifier_ : "");
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public GenAlphaManagedSettings getSettings() {
        GenAlphaManagedSettings genAlphaManagedSettings = this.settings_;
        return genAlphaManagedSettings == null ? GenAlphaManagedSettings.getDefaultInstance() : genAlphaManagedSettings;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public TransitioningUserIdentifierCase getTransitioningUserIdentifierCase() {
        return TransitioningUserIdentifierCase.forNumber(this.transitioningUserIdentifierCase_);
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasMemberId() {
        return this.transitioningUserIdentifierCase_ == 2;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasParentPinHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasParentalConsentSessionId() {
        return this.transitioningUserIdentifierCase_ == 1;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequestOrBuilder
    public boolean hasSettings() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TransitionToManagedAccountRequest transitionToManagedAccountRequest) {
        return DEFAULT_INSTANCE.createBuilder(transitionToManagedAccountRequest);
    }

    public static TransitionToManagedAccountRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TransitionToManagedAccountRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TransitionToManagedAccountRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TransitionToManagedAccountRequest parseFrom(phc phcVar) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TransitionToManagedAccountRequest parseFrom(byte[] bArr) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransitionToManagedAccountRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TransitionToManagedAccountRequest parseFrom(InputStream inputStream) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TransitionToManagedAccountRequest parseFrom(lwg lwgVar) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TransitionToManagedAccountRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TransitionToManagedAccountRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
