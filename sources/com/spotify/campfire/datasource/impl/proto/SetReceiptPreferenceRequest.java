package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class SetReceiptPreferenceRequest extends h implements SetReceiptPreferenceRequestOrBuilder {
    private static final SetReceiptPreferenceRequest DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 3;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RECEIPT_TYPE_FIELD_NUMBER = 2;
    private boolean disabled_;
    private String hierarchyId_ = "";
    private int receiptType_;

    static {
        SetReceiptPreferenceRequest setReceiptPreferenceRequest = new SetReceiptPreferenceRequest();
        DEFAULT_INSTANCE = setReceiptPreferenceRequest;
        h.registerDefaultInstance(SetReceiptPreferenceRequest.class, setReceiptPreferenceRequest);
    }

    private SetReceiptPreferenceRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        this.disabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceiptType() {
        this.receiptType_ = 0;
    }

    public static SetReceiptPreferenceRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SetReceiptPreferenceRequest parseDelimitedFrom(InputStream inputStream) {
        return (SetReceiptPreferenceRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetReceiptPreferenceRequest parseFrom(ByteBuffer byteBuffer) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(boolean z) {
        this.disabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptType(ReceiptType receiptType) {
        this.receiptType_ = receiptType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptTypeValue(int i) {
        this.receiptType_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"hierarchyId_", "receiptType_", "disabled_"});
        }
        if (iOrdinal == 3) {
            return new SetReceiptPreferenceRequest();
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
        synchronized (SetReceiptPreferenceRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequestOrBuilder
    public boolean getDisabled() {
        return this.disabled_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequestOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequestOrBuilder
    public ReceiptType getReceiptType() {
        ReceiptType receiptTypeForNumber = ReceiptType.forNumber(this.receiptType_);
        return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequestOrBuilder
    public int getReceiptTypeValue() {
        return this.receiptType_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(SetReceiptPreferenceRequest setReceiptPreferenceRequest) {
        return DEFAULT_INSTANCE.createBuilder(setReceiptPreferenceRequest);
    }

    public static SetReceiptPreferenceRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetReceiptPreferenceRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetReceiptPreferenceRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SetReceiptPreferenceRequest parseFrom(phc phcVar) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SetReceiptPreferenceRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SetReceiptPreferenceRequest parseFrom(byte[] bArr) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetReceiptPreferenceRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SetReceiptPreferenceRequest parseFrom(InputStream inputStream) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetReceiptPreferenceRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetReceiptPreferenceRequest parseFrom(lwg lwgVar) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SetReceiptPreferenceRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SetReceiptPreferenceRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
