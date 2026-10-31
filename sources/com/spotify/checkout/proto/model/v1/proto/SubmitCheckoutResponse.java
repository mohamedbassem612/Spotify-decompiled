package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SubmitCheckoutResponse extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKOUT_ITEM_UNAVAILABLE_FIELD_NUMBER = 4;
    public static final int CHECKOUT_STATUS_FIELD_NUMBER = 5;
    private static final SubmitCheckoutResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int UPDATE_SPOTIFY_CHECKOUT_FIELD_NUMBER = 3;
    private int responseCase_ = 0;
    private Object response_;

    public static final class Dialog extends com.google.protobuf.h implements v2j0 {
        private static final Dialog DEFAULT_INSTANCE;
        public static final int DISMISS_CTA_LABEL_FIELD_NUMBER = 3;
        public static final int PARAGRAPHS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private h290 paragraphs_ = com.google.protobuf.h.emptyProtobufList();
        private String dismissCtaLabel_ = "";

        static {
            Dialog dialog = new Dialog();
            DEFAULT_INSTANCE = dialog;
            com.google.protobuf.h.registerDefaultInstance(Dialog.class, dialog);
        }

        private Dialog() {
        }

        public static Dialog o() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static j1 r() {
            return (j1) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ", new Object[]{"title_", "paragraphs_", "dismissCtaLabel_"});
            }
            if (iOrdinal == 3) {
                return new Dialog();
            }
            if (iOrdinal == 4) {
                return new j1(DEFAULT_INSTANCE);
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
            synchronized (Dialog.class) {
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

        public final void n(Iterable iterable) {
            h290 h290VarMutableCopy = this.paragraphs_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.paragraphs_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.dismissCtaLabel_;
        }

        public final h290 q() {
            return this.paragraphs_;
        }

        public final void s() {
            this.dismissCtaLabel_ = "Dismiss dialog";
        }

        public final void t() {
            this.title_ = "Dialog title";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Success extends com.google.protobuf.h implements v2j0 {
        private static final Success DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Success success = new Success();
            DEFAULT_INSTANCE = success;
            com.google.protobuf.h.registerDefaultInstance(Success.class, success);
        }

        private Success() {
        }

        public static Success n() {
            return DEFAULT_INSTANCE;
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Success();
            }
            if (iOrdinal == 4) {
                return new k1(DEFAULT_INSTANCE);
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
            synchronized (Success.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class UpdateSpotifyCheckout extends com.google.protobuf.h implements v2j0 {
        private static final UpdateSpotifyCheckout DEFAULT_INSTANCE;
        public static final int DIALOG_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int SPOTIFY_CHECKOUT_FIELD_NUMBER = 1;
        private int bitField0_;
        private Dialog dialog_;
        private SpotifyCheckoutNative spotifyCheckout_;

        static {
            UpdateSpotifyCheckout updateSpotifyCheckout = new UpdateSpotifyCheckout();
            DEFAULT_INSTANCE = updateSpotifyCheckout;
            com.google.protobuf.h.registerDefaultInstance(UpdateSpotifyCheckout.class, updateSpotifyCheckout);
        }

        private UpdateSpotifyCheckout() {
        }

        public static UpdateSpotifyCheckout n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static l1 r() {
            return (l1) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "spotifyCheckout_", "dialog_"});
            }
            if (iOrdinal == 3) {
                return new UpdateSpotifyCheckout();
            }
            if (iOrdinal == 4) {
                return new l1(DEFAULT_INSTANCE);
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
            synchronized (UpdateSpotifyCheckout.class) {
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

        public final Dialog o() {
            Dialog dialog = this.dialog_;
            return dialog == null ? Dialog.o() : dialog;
        }

        public final SpotifyCheckoutNative p() {
            SpotifyCheckoutNative spotifyCheckoutNative = this.spotifyCheckout_;
            return spotifyCheckoutNative == null ? SpotifyCheckoutNative.r() : spotifyCheckoutNative;
        }

        public final boolean q() {
            return (this.bitField0_ & 2) != 0;
        }

        public final void s(Dialog dialog) {
            dialog.getClass();
            this.dialog_ = dialog;
            this.bitField0_ |= 2;
        }

        public final void t(SpotifyCheckoutNative spotifyCheckoutNative) {
            spotifyCheckoutNative.getClass();
            this.spotifyCheckout_ = spotifyCheckoutNative;
            this.bitField0_ |= 1;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SubmitCheckoutResponse submitCheckoutResponse = new SubmitCheckoutResponse();
        DEFAULT_INSTANCE = submitCheckoutResponse;
        com.google.protobuf.h.registerDefaultInstance(SubmitCheckoutResponse.class, submitCheckoutResponse);
    }

    private SubmitCheckoutResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static i1 t() {
        return (i1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"response_", "responseCase_", Success.class, Error.class, UpdateSpotifyCheckout.class, CheckoutItemUnavailable.class, CheckoutStatus.class});
        }
        if (iOrdinal == 3) {
            return new SubmitCheckoutResponse();
        }
        if (iOrdinal == 4) {
            return new i1(DEFAULT_INSTANCE);
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
        synchronized (SubmitCheckoutResponse.class) {
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

    public final CheckoutItemUnavailable n() {
        return this.responseCase_ == 4 ? (CheckoutItemUnavailable) this.response_ : CheckoutItemUnavailable.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CheckoutStatus o() {
        return this.responseCase_ == 5 ? (CheckoutStatus) this.response_ : CheckoutStatus.p();
    }

    public final Error p() {
        return this.responseCase_ == 2 ? (Error) this.response_ : Error.s();
    }

    public final int q() {
        int i = this.responseCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final UpdateSpotifyCheckout r() {
        return this.responseCase_ == 3 ? (UpdateSpotifyCheckout) this.response_ : UpdateSpotifyCheckout.n();
    }

    public final boolean s() {
        return this.responseCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(CheckoutItemUnavailable checkoutItemUnavailable) {
        checkoutItemUnavailable.getClass();
        this.response_ = checkoutItemUnavailable;
        this.responseCase_ = 4;
    }

    public final void v(CheckoutStatus checkoutStatus) {
        checkoutStatus.getClass();
        this.response_ = checkoutStatus;
        this.responseCase_ = 5;
    }

    public final void w(Error error) {
        error.getClass();
        this.response_ = error;
        this.responseCase_ = 2;
    }

    public final void x(Success success) {
        success.getClass();
        this.response_ = success;
        this.responseCase_ = 1;
    }

    public final void y(UpdateSpotifyCheckout updateSpotifyCheckout) {
        updateSpotifyCheckout.getClass();
        this.response_ = updateSpotifyCheckout;
        this.responseCase_ = 3;
    }
}
