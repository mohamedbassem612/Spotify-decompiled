package com.spotify.address.endpoint.model.v1.proto;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SubmitFormResponse extends com.google.protobuf.h implements v2j0 {
    private static final SubmitFormResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int SUGGESTION_FIELD_NUMBER = 2;
    private int responseCase_ = 0;
    private Object response_;

    public static final class SubmitError extends com.google.protobuf.h implements v2j0 {
        private static final SubmitError DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 1;
        public static final int MESSAGE_ID_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private String message_ = "";
        private String messageId_ = "";

        static {
            SubmitError submitError = new SubmitError();
            DEFAULT_INSTANCE = submitError;
            com.google.protobuf.h.registerDefaultInstance(SubmitError.class, submitError);
        }

        private SubmitError() {
        }

        public static SubmitError n() {
            return DEFAULT_INSTANCE;
        }

        public static m o() {
            return (m) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"message_", "messageId_"});
            }
            if (iOrdinal == 3) {
                return new SubmitError();
            }
            if (iOrdinal == 4) {
                return new m(DEFAULT_INSTANCE);
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
            synchronized (SubmitError.class) {
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

        public final String getMessage() {
            return this.message_;
        }

        public final String getMessageId() {
            return this.messageId_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final void p() {
            this.message_ = "Enter a valid address";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SubmitSuccess extends com.google.protobuf.h implements v2j0 {
        private static final SubmitSuccess DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SAVED_ADDRESS_FIELD_NUMBER = 2;
        public static final int SUCCESS_MESSAGE_FIELD_NUMBER = 1;
        private int bitField0_;
        private SavedAddress savedAddress_;
        private String successMessage_ = "";

        static {
            SubmitSuccess submitSuccess = new SubmitSuccess();
            DEFAULT_INSTANCE = submitSuccess;
            com.google.protobuf.h.registerDefaultInstance(SubmitSuccess.class, submitSuccess);
        }

        private SubmitSuccess() {
        }

        public static SubmitSuccess n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static n q() {
            return (n) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "successMessage_", "savedAddress_"});
            }
            if (iOrdinal == 3) {
                return new SubmitSuccess();
            }
            if (iOrdinal == 4) {
                return new n(DEFAULT_INSTANCE);
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
            synchronized (SubmitSuccess.class) {
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

        public final SavedAddress o() {
            SavedAddress savedAddress = this.savedAddress_;
            return savedAddress == null ? SavedAddress.q() : savedAddress;
        }

        public final String p() {
            return this.successMessage_;
        }

        public final void r(SavedAddress savedAddress) {
            savedAddress.getClass();
            this.savedAddress_ = savedAddress;
            this.bitField0_ |= 1;
        }

        public final void s() {
            this.successMessage_ = "Your address has been saved.";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Suggestion extends com.google.protobuf.h implements v2j0 {
        public static final int ACCEPT_CTA_FIELD_NUMBER = 8;
        public static final int BODY_FIELD_NUMBER = 2;
        public static final int CANCEL_CTA_FIELD_NUMBER = 7;
        private static final Suggestion DEFAULT_INSTANCE;
        public static final int FIELD_VALUES_FIELD_NUMBER = 9;
        private static volatile qzr0 PARSER = null;
        public static final int SUBMITTED_ADDRESS_LABEL_FIELD_NUMBER = 3;
        public static final int SUBMITTED_ADDRESS_LINE_FIELD_NUMBER = 4;
        public static final int SUGGESTED_ADDRESS_LABEL_FIELD_NUMBER = 5;
        public static final int SUGGESTED_ADDRESS_LINE_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String body_ = "";
        private String submittedAddressLabel_ = "";
        private h290 submittedAddressLine_ = com.google.protobuf.h.emptyProtobufList();
        private String suggestedAddressLabel_ = "";
        private h290 suggestedAddressLine_ = com.google.protobuf.h.emptyProtobufList();
        private String cancelCta_ = "";
        private String acceptCta_ = "";
        private h290 fieldValues_ = com.google.protobuf.h.emptyProtobufList();

        static {
            Suggestion suggestion = new Suggestion();
            DEFAULT_INSTANCE = suggestion;
            com.google.protobuf.h.registerDefaultInstance(Suggestion.class, suggestion);
        }

        private Suggestion() {
        }

        public static Suggestion A(byte[] bArr) {
            return (Suggestion) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static Suggestion t() {
            return DEFAULT_INSTANCE;
        }

        public static o z() {
            return (o) DEFAULT_INSTANCE.createBuilder();
        }

        public final void B() {
            this.acceptCta_ = "Confirm Address";
        }

        public final void C() {
            this.body_ = "This address is invalid or incomplete. Check your details and try again.";
        }

        public final void D() {
            this.cancelCta_ = "Edit";
        }

        public final void E() {
            this.submittedAddressLabel_ = "You entered:";
        }

        public final void F() {
            this.suggestedAddressLabel_ = "Suggested address:";
        }

        public final void G() {
            this.title_ = "Confirm your address";
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ț\u0007Ȉ\bȈ\t\u001b", new Object[]{"title_", "body_", "submittedAddressLabel_", "submittedAddressLine_", "suggestedAddressLabel_", "suggestedAddressLine_", "cancelCta_", "acceptCta_", "fieldValues_", FieldValue.class});
            }
            if (iOrdinal == 3) {
                return new Suggestion();
            }
            if (iOrdinal == 4) {
                return new o(DEFAULT_INSTANCE);
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
            synchronized (Suggestion.class) {
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

        public final void n(ArrayList arrayList) {
            h290 h290VarMutableCopy = this.fieldValues_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.fieldValues_ = h290VarMutableCopy;
            }
            s8.addAll(arrayList, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final void o(Iterable iterable) {
            h290 h290VarMutableCopy = this.submittedAddressLine_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.submittedAddressLine_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final void p(Iterable iterable) {
            h290 h290VarMutableCopy = this.suggestedAddressLine_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.suggestedAddressLine_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final String q() {
            return this.acceptCta_;
        }

        public final String r() {
            return this.body_;
        }

        public final String s() {
            return this.cancelCta_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final h290 u() {
            return this.fieldValues_;
        }

        public final String v() {
            return this.submittedAddressLabel_;
        }

        public final h290 w() {
            return this.submittedAddressLine_;
        }

        public final String x() {
            return this.suggestedAddressLabel_;
        }

        public final h290 y() {
            return this.suggestedAddressLine_;
        }
    }

    static {
        SubmitFormResponse submitFormResponse = new SubmitFormResponse();
        DEFAULT_INSTANCE = submitFormResponse;
        com.google.protobuf.h.registerDefaultInstance(SubmitFormResponse.class, submitFormResponse);
    }

    private SubmitFormResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static l r() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"response_", "responseCase_", SubmitSuccess.class, Suggestion.class, SubmitError.class});
        }
        if (iOrdinal == 3) {
            return new SubmitFormResponse();
        }
        if (iOrdinal == 4) {
            return new l(DEFAULT_INSTANCE);
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
        synchronized (SubmitFormResponse.class) {
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

    public final SubmitError n() {
        return this.responseCase_ == 3 ? (SubmitError) this.response_ : SubmitError.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.responseCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final SubmitSuccess p() {
        return this.responseCase_ == 1 ? (SubmitSuccess) this.response_ : SubmitSuccess.n();
    }

    public final Suggestion q() {
        return this.responseCase_ == 2 ? (Suggestion) this.response_ : Suggestion.t();
    }

    public final void s(SubmitError submitError) {
        submitError.getClass();
        this.response_ = submitError;
        this.responseCase_ = 3;
    }

    public final void t(SubmitSuccess submitSuccess) {
        submitSuccess.getClass();
        this.response_ = submitSuccess;
        this.responseCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Suggestion suggestion) {
        suggestion.getClass();
        this.response_ = suggestion;
        this.responseCase_ = 2;
    }
}
