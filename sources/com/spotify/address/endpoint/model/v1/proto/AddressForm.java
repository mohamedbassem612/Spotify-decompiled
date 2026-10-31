package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.h290;
import p.i9;
import p.j12;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AddressForm extends com.google.protobuf.h implements v2j0 {
    public static final int CANCEL_CTA_FIELD_NUMBER = 3;
    private static final AddressForm DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SAVE_CTA_FIELD_NUMBER = 2;
    public static final int WARNING_BANNER_FIELD_NUMBER = 4;
    private h290 fields_ = com.google.protobuf.h.emptyProtobufList();
    private String saveCta_ = "";
    private String cancelCta_ = "";
    private String warningBanner_ = "";

    static {
        AddressForm addressForm = new AddressForm();
        DEFAULT_INSTANCE = addressForm;
        com.google.protobuf.h.registerDefaultInstance(AddressForm.class, addressForm);
    }

    private AddressForm() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AddressForm q() {
        return DEFAULT_INSTANCE;
    }

    public static j12 u() {
        return (j12) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"fields_", FormField.class, "saveCta_", "cancelCta_", "warningBanner_"});
        }
        if (iOrdinal == 3) {
            return new AddressForm();
        }
        if (iOrdinal == 4) {
            return new j12(DEFAULT_INSTANCE);
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
        synchronized (AddressForm.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.fields_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.fields_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o() {
        this.fields_ = com.google.protobuf.h.emptyProtobufList();
    }

    public final String p() {
        return this.cancelCta_;
    }

    public final h290 r() {
        return this.fields_;
    }

    public final String s() {
        return this.saveCta_;
    }

    public final String t() {
        return this.warningBanner_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void v() {
        this.cancelCta_ = "Cancel";
    }

    public final void w() {
        this.saveCta_ = "Save address";
    }

    public final void x() {
        this.warningBanner_ = "Any updates to the address will also be reflected in your account. This may affect your monthly subscription charge due to tax.";
    }
}
