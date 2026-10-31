package com.spotify.checkout.proto.model.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ChangeCountry extends com.google.protobuf.h implements v2j0 {
    private static final ChangeCountry DEFAULT_INSTANCE;
    public static final int FORM_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private PickerForm form_;
    private String label_ = "";

    public static final class PickerForm extends com.google.protobuf.h implements v2j0 {
        public static final int COUNTRIES_FIELD_NUMBER = 10;
        public static final int CTA_FIELD_NUMBER = 1;
        private static final PickerForm DEFAULT_INSTANCE;
        public static final int INPUT_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Cta cta_;
        private SearchInput input_;
        private String title_ = "";
        private h290 countries_ = com.google.protobuf.h.emptyProtobufList();

        public static final class CountryType extends com.google.protobuf.h implements v2j0 {
            public static final int ACTIVE_FIELD_NUMBER = 2;
            private static final CountryType DEFAULT_INSTANCE;
            public static final int INACTIVE_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private int typeCase_ = 0;
            private Object type_;

            public static final class Active extends com.google.protobuf.h implements v2j0 {
                public static final int CODE_FIELD_NUMBER = 1;
                private static final Active DEFAULT_INSTANCE;
                public static final int NAME_FIELD_NUMBER = 2;
                private static volatile qzr0 PARSER;
                private String code_ = "";
                private String name_ = "";

                static {
                    Active active = new Active();
                    DEFAULT_INSTANCE = active;
                    com.google.protobuf.h.registerDefaultInstance(Active.class, active);
                }

                private Active() {
                }

                public static Active o() {
                    return DEFAULT_INSTANCE;
                }

                public static c p() {
                    return (c) DEFAULT_INSTANCE.createBuilder();
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"code_", "name_"});
                    }
                    if (iOrdinal == 3) {
                        return new Active();
                    }
                    if (iOrdinal == 4) {
                        return new c(DEFAULT_INSTANCE);
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
                    synchronized (Active.class) {
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

                public final String getName() {
                    return this.name_;
                }

                public final String n() {
                    return this.code_;
                }

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final void q(String str) {
                    str.getClass();
                    this.code_ = str;
                }

                public final void setName(String str) {
                    str.getClass();
                    this.name_ = str;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            public static final class Inactive extends com.google.protobuf.h implements v2j0 {
                public static final int CODE_FIELD_NUMBER = 1;
                private static final Inactive DEFAULT_INSTANCE;
                public static final int NAME_FIELD_NUMBER = 2;
                private static volatile qzr0 PARSER = null;
                public static final int URL_FIELD_NUMBER = 3;
                private String code_ = "";
                private String name_ = "";
                private String url_ = "";

                static {
                    Inactive inactive = new Inactive();
                    DEFAULT_INSTANCE = inactive;
                    com.google.protobuf.h.registerDefaultInstance(Inactive.class, inactive);
                }

                private Inactive() {
                }

                public static Inactive o() {
                    return DEFAULT_INSTANCE;
                }

                public static e p() {
                    return (e) DEFAULT_INSTANCE.createBuilder();
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
                        return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"code_", "name_", "url_"});
                    }
                    if (iOrdinal == 3) {
                        return new Inactive();
                    }
                    if (iOrdinal == 4) {
                        return new e(DEFAULT_INSTANCE);
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
                    synchronized (Inactive.class) {
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

                public final String getName() {
                    return this.name_;
                }

                public final String getUrl() {
                    return this.url_;
                }

                public final String n() {
                    return this.code_;
                }

                public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                    return newBuilderForType();
                }

                public final void q(String str) {
                    str.getClass();
                    this.code_ = str;
                }

                public final void r(String str) {
                    str.getClass();
                    this.name_ = str;
                }

                public final void s(String str) {
                    this.url_ = str;
                }

                public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                    return toBuilder();
                }
            }

            static {
                CountryType countryType = new CountryType();
                DEFAULT_INSTANCE = countryType;
                com.google.protobuf.h.registerDefaultInstance(CountryType.class, countryType);
            }

            private CountryType() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static d r() {
                return (d) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", Inactive.class, Active.class});
                }
                if (iOrdinal == 3) {
                    return new CountryType();
                }
                if (iOrdinal == 4) {
                    return new d(DEFAULT_INSTANCE);
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
                synchronized (CountryType.class) {
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

            public final Active n() {
                return this.typeCase_ == 2 ? (Active) this.type_ : Active.o();
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final Inactive o() {
                return this.typeCase_ == 1 ? (Inactive) this.type_ : Inactive.o();
            }

            public final int p() {
                int i = this.typeCase_;
                if (i == 0) {
                    return 3;
                }
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        return 0;
                    }
                }
                return i2;
            }

            public final boolean q() {
                return this.typeCase_ == 2;
            }

            public final void s(Active active) {
                active.getClass();
                this.type_ = active;
                this.typeCase_ = 2;
            }

            public final void t(Inactive inactive) {
                inactive.getClass();
                this.type_ = inactive;
                this.typeCase_ = 1;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Cta extends com.google.protobuf.h implements v2j0 {
            private static final Cta DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private String label_ = "";

            static {
                Cta cta = new Cta();
                DEFAULT_INSTANCE = cta;
                com.google.protobuf.h.registerDefaultInstance(Cta.class, cta);
            }

            private Cta() {
            }

            public static Cta n() {
                return DEFAULT_INSTANCE;
            }

            public static f p() {
                return (f) DEFAULT_INSTANCE.createBuilder();
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"label_"});
                }
                if (iOrdinal == 3) {
                    return new Cta();
                }
                if (iOrdinal == 4) {
                    return new f(DEFAULT_INSTANCE);
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
                synchronized (Cta.class) {
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

            public final String o() {
                return this.label_;
            }

            public final void q() {
                this.label_ = "Change Country";
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class SearchInput extends com.google.protobuf.h implements v2j0 {
            private static final SearchInput DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int PLACEHOLDER_FIELD_NUMBER = 1;
            private String placeholder_ = "";

            static {
                SearchInput searchInput = new SearchInput();
                DEFAULT_INSTANCE = searchInput;
                com.google.protobuf.h.registerDefaultInstance(SearchInput.class, searchInput);
            }

            private SearchInput() {
            }

            public static SearchInput n() {
                return DEFAULT_INSTANCE;
            }

            public static g p() {
                return (g) DEFAULT_INSTANCE.createBuilder();
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"placeholder_"});
                }
                if (iOrdinal == 3) {
                    return new SearchInput();
                }
                if (iOrdinal == 4) {
                    return new g(DEFAULT_INSTANCE);
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
                synchronized (SearchInput.class) {
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

            public final String o() {
                return this.placeholder_;
            }

            public final void q() {
                this.placeholder_ = "Find your country";
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            PickerForm pickerForm = new PickerForm();
            DEFAULT_INSTANCE = pickerForm;
            com.google.protobuf.h.registerDefaultInstance(PickerForm.class, pickerForm);
        }

        private PickerForm() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static PickerForm q() {
            return DEFAULT_INSTANCE;
        }

        public static b s() {
            return (b) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\n\u001b", new Object[]{"bitField0_", "cta_", "title_", "input_", "countries_", CountryType.class});
            }
            if (iOrdinal == 3) {
                return new PickerForm();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (PickerForm.class) {
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
            h290 h290VarMutableCopy = this.countries_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.countries_ = h290VarMutableCopy;
            }
            s8.addAll(arrayList, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.countries_;
        }

        public final Cta p() {
            Cta cta = this.cta_;
            return cta == null ? Cta.n() : cta;
        }

        public final SearchInput r() {
            SearchInput searchInput = this.input_;
            return searchInput == null ? SearchInput.n() : searchInput;
        }

        public final void t(Cta cta) {
            cta.getClass();
            this.cta_ = cta;
            this.bitField0_ |= 1;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void u(SearchInput searchInput) {
            searchInput.getClass();
            this.input_ = searchInput;
            this.bitField0_ |= 2;
        }

        public final void v() {
            this.title_ = "Choose your country";
        }
    }

    static {
        ChangeCountry changeCountry = new ChangeCountry();
        DEFAULT_INSTANCE = changeCountry;
        com.google.protobuf.h.registerDefaultInstance(ChangeCountry.class, changeCountry);
    }

    private ChangeCountry() {
    }

    public static ChangeCountry n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static a q() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "label_", "form_"});
        }
        if (iOrdinal == 3) {
            return new ChangeCountry();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (ChangeCountry.class) {
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

    public final PickerForm o() {
        PickerForm pickerForm = this.form_;
        return pickerForm == null ? PickerForm.q() : pickerForm;
    }

    public final String p() {
        return this.label_;
    }

    public final void r(PickerForm pickerForm) {
        pickerForm.getClass();
        this.form_ = pickerForm;
        this.bitField0_ |= 1;
    }

    public final void s() {
        this.label_ = "France";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
