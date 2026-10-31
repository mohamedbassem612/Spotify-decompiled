package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AddressCollection extends com.google.protobuf.h implements v2j0 {
    public static final int ADDRESS_FORM_FIELD_NUMBER = 2;
    private static final AddressCollection DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 4;
    public static final int EXTRA_FIELDS_FIELD_NUMBER = 6;
    public static final int GENERIC_ERRORS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_DETAILS_FIELD_NUMBER = 1;
    public static final int SAVED_ADDRESS_FIELD_NUMBER = 3;
    private AddressForm addressForm_;
    private int bitField0_;
    private int environment_;
    private ExtraFields extraFields_;
    private GenericErrors genericErrors_;
    private RequestDetails requestDetails_;
    private SavedAddress savedAddress_;

    static {
        AddressCollection addressCollection = new AddressCollection();
        DEFAULT_INSTANCE = addressCollection;
        com.google.protobuf.h.registerDefaultInstance(AddressCollection.class, addressCollection);
    }

    private AddressCollection() {
    }

    public static AddressCollection o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static w02 t() {
        return (w02) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddressCollection u(phc phcVar) {
        return (AddressCollection) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AddressCollection v(byte[] bArr) {
        return (AddressCollection) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "requestDetails_", "addressForm_", "savedAddress_", "environment_", "genericErrors_", "extraFields_"});
        }
        if (iOrdinal == 3) {
            return new AddressCollection();
        }
        if (iOrdinal == 4) {
            return new w02(DEFAULT_INSTANCE);
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
        synchronized (AddressCollection.class) {
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

    public final AddressForm n() {
        AddressForm addressForm = this.addressForm_;
        return addressForm == null ? AddressForm.q() : addressForm;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ExtraFields p() {
        ExtraFields extraFields = this.extraFields_;
        return extraFields == null ? ExtraFields.n() : extraFields;
    }

    public final RequestDetails q() {
        RequestDetails requestDetails = this.requestDetails_;
        return requestDetails == null ? RequestDetails.p() : requestDetails;
    }

    public final SavedAddress r() {
        SavedAddress savedAddress = this.savedAddress_;
        return savedAddress == null ? SavedAddress.q() : savedAddress;
    }

    public final boolean s() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void w(AddressForm addressForm) {
        addressForm.getClass();
        this.addressForm_ = addressForm;
        this.bitField0_ |= 2;
    }

    public final void x(SavedAddress savedAddress) {
        savedAddress.getClass();
        this.savedAddress_ = savedAddress;
        this.bitField0_ |= 4;
    }
}
