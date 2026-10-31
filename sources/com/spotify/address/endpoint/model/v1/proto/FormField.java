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
public final class FormField extends com.google.protobuf.h implements v2j0 {
    public static final int AUTOCOMPLETE_FIELD_NUMBER = 5;
    private static final FormField DEFAULT_INSTANCE;
    public static final int DROPDOWN_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int VALIDATION_RULES_FIELD_NUMBER = 100;
    private Object field_;
    private int fieldCase_ = 0;
    private String id_ = "";
    private String label_ = "";
    private h290 validationRules_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Autocomplete extends com.google.protobuf.h implements v2j0 {
        public static final int ATTRIBUTION_TEXT_FIELD_NUMBER = 4;
        private static final Autocomplete DEFAULT_INSTANCE;
        public static final int INITIAL_VALUE_FIELD_NUMBER = 5;
        public static final int MANUAL_ENTRY_CTA_FIELD_NUMBER = 2;
        public static final int NO_RESULTS_MESSAGE_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int SEARCH_PLACEHOLDER_FIELD_NUMBER = 1;
        private String searchPlaceholder_ = "";
        private String manualEntryCta_ = "";
        private String noResultsMessage_ = "";
        private String attributionText_ = "";
        private String initialValue_ = "";

        static {
            Autocomplete autocomplete = new Autocomplete();
            DEFAULT_INSTANCE = autocomplete;
            com.google.protobuf.h.registerDefaultInstance(Autocomplete.class, autocomplete);
        }

        private Autocomplete() {
        }

        public static Autocomplete o() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static d t() {
            return (d) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"searchPlaceholder_", "manualEntryCta_", "noResultsMessage_", "attributionText_", "initialValue_"});
            }
            if (iOrdinal == 3) {
                return new Autocomplete();
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
            synchronized (Autocomplete.class) {
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

        public final String n() {
            return this.attributionText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.initialValue_;
        }

        public final String q() {
            return this.manualEntryCta_;
        }

        public final String r() {
            return this.noResultsMessage_;
        }

        public final String s() {
            return this.searchPlaceholder_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void u() {
            this.attributionText_ = "Powered by Google Maps";
        }

        public final void v(String str) {
            this.initialValue_ = str;
        }

        public final void w() {
            this.manualEntryCta_ = "Enter address manually";
        }

        public final void x() {
            this.noResultsMessage_ = "Keep typing for address suggestions";
        }

        public final void y() {
            this.searchPlaceholder_ = "Search address";
        }
    }

    public static final class Dropdown extends com.google.protobuf.h implements v2j0 {
        private static final Dropdown DEFAULT_INSTANCE;
        public static final int INITIAL_KEY_FIELD_NUMBER = 3;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int PLACEHOLDER_FIELD_NUMBER = 2;
        private h290 options_ = com.google.protobuf.h.emptyProtobufList();
        private String placeholder_ = "";
        private String initialKey_ = "";

        public static final class Option extends com.google.protobuf.h implements v2j0 {
            private static final Option DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 2;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";
            private String label_ = "";

            static {
                Option option = new Option();
                DEFAULT_INSTANCE = option;
                com.google.protobuf.h.registerDefaultInstance(Option.class, option);
            }

            private Option() {
            }

            public static g o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"value_", "label_"});
                }
                if (iOrdinal == 3) {
                    return new Option();
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
                synchronized (Option.class) {
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

            public final String getValue() {
                return this.value_;
            }

            public final String n() {
                return this.label_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final void p(String str) {
                str.getClass();
                this.label_ = str;
            }

            public final void q(String str) {
                str.getClass();
                this.value_ = str;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Dropdown dropdown = new Dropdown();
            DEFAULT_INSTANCE = dropdown;
            com.google.protobuf.h.registerDefaultInstance(Dropdown.class, dropdown);
        }

        private Dropdown() {
        }

        public static Dropdown o() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static f s() {
            return (f) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ", new Object[]{"options_", Option.class, "placeholder_", "initialKey_"});
            }
            if (iOrdinal == 3) {
                return new Dropdown();
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
            synchronized (Dropdown.class) {
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
            h290 h290VarMutableCopy = this.options_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.options_ = h290VarMutableCopy;
            }
            s8.addAll(arrayList, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.initialKey_;
        }

        public final h290 q() {
            return this.options_;
        }

        public final String r() {
            return this.placeholder_;
        }

        public final void t(String str) {
            this.initialKey_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void u() {
            this.placeholder_ = "Choose a state";
        }
    }

    public static final class Text extends com.google.protobuf.h implements v2j0 {
        private static final Text DEFAULT_INSTANCE;
        public static final int INITIAL_VALUE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String initialValue_ = "";

        static {
            Text text = new Text();
            DEFAULT_INSTANCE = text;
            com.google.protobuf.h.registerDefaultInstance(Text.class, text);
        }

        private Text() {
        }

        public static Text n() {
            return DEFAULT_INSTANCE;
        }

        public static h p() {
            return (h) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"initialValue_"});
            }
            if (iOrdinal == 3) {
                return new Text();
            }
            if (iOrdinal == 4) {
                return new h(DEFAULT_INSTANCE);
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
            synchronized (Text.class) {
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
            return this.initialValue_;
        }

        public final void q(String str) {
            this.initialValue_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ValidationRule extends com.google.protobuf.h implements v2j0 {
        private static final ValidationRule DEFAULT_INSTANCE;
        public static final int FAIL_MESSAGE_FIELD_NUMBER = 1;
        public static final int FAIL_MESSAGE_ID_FIELD_NUMBER = 4;
        public static final int MANDATORY_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int REG_EX_FIELD_NUMBER = 3;
        private Object type_;
        private int typeCase_ = 0;
        private String failMessage_ = "";
        private String failMessageId_ = "";

        public static final class Mandatory extends com.google.protobuf.h implements v2j0 {
            private static final Mandatory DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;

            static {
                Mandatory mandatory = new Mandatory();
                DEFAULT_INSTANCE = mandatory;
                com.google.protobuf.h.registerDefaultInstance(Mandatory.class, mandatory);
            }

            private Mandatory() {
            }

            public static Mandatory n() {
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
                    return new Mandatory();
                }
                if (iOrdinal == 4) {
                    return new j(DEFAULT_INSTANCE);
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
                synchronized (Mandatory.class) {
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

        public static final class RegEx extends com.google.protobuf.h implements v2j0 {
            private static final RegEx DEFAULT_INSTANCE;
            public static final int EXPRESSION_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private String expression_ = "";

            static {
                RegEx regEx = new RegEx();
                DEFAULT_INSTANCE = regEx;
                com.google.protobuf.h.registerDefaultInstance(RegEx.class, regEx);
            }

            private RegEx() {
            }

            public static RegEx n() {
                return DEFAULT_INSTANCE;
            }

            public static k p() {
                return (k) DEFAULT_INSTANCE.createBuilder();
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"expression_"});
                }
                if (iOrdinal == 3) {
                    return new RegEx();
                }
                if (iOrdinal == 4) {
                    return new k(DEFAULT_INSTANCE);
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
                synchronized (RegEx.class) {
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
                return this.expression_;
            }

            public final void q() {
                this.expression_ = "\\d{5}";
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            ValidationRule validationRule = new ValidationRule();
            DEFAULT_INSTANCE = validationRule;
            com.google.protobuf.h.registerDefaultInstance(ValidationRule.class, validationRule);
        }

        private ValidationRule() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static i r() {
            return (i) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"type_", "typeCase_", "failMessage_", Mandatory.class, RegEx.class, "failMessageId_"});
            }
            if (iOrdinal == 3) {
                return new ValidationRule();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (ValidationRule.class) {
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

        public final String n() {
            return this.failMessage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.failMessageId_;
        }

        public final RegEx p() {
            return this.typeCase_ == 3 ? (RegEx) this.type_ : RegEx.n();
        }

        public final int q() {
            int i = this.typeCase_;
            if (i == 0) {
                return 3;
            }
            if (i != 2) {
                return i != 3 ? 0 : 2;
            }
            return 1;
        }

        public final void s(String str) {
            this.failMessage_ = str;
        }

        public final void t(Mandatory mandatory) {
            mandatory.getClass();
            this.type_ = mandatory;
            this.typeCase_ = 2;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final void u(RegEx regEx) {
            regEx.getClass();
            this.type_ = regEx;
            this.typeCase_ = 3;
        }
    }

    static {
        FormField formField = new FormField();
        DEFAULT_INSTANCE = formField;
        com.google.protobuf.h.registerDefaultInstance(FormField.class, formField);
    }

    private FormField() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static e u() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001d\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000d\u001b", new Object[]{"field_", "fieldCase_", "id_", "label_", Text.class, Dropdown.class, Autocomplete.class, "validationRules_", ValidationRule.class});
        }
        if (iOrdinal == 3) {
            return new FormField();
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
        synchronized (FormField.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.validationRules_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.validationRules_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Autocomplete o() {
        return this.fieldCase_ == 5 ? (Autocomplete) this.field_ : Autocomplete.o();
    }

    public final Dropdown p() {
        return this.fieldCase_ == 4 ? (Dropdown) this.field_ : Dropdown.o();
    }

    public final int q() {
        int i = this.fieldCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    public final String r() {
        return this.label_;
    }

    public final Text s() {
        return this.fieldCase_ == 3 ? (Text) this.field_ : Text.n();
    }

    public final h290 t() {
        return this.validationRules_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void v(Autocomplete autocomplete) {
        autocomplete.getClass();
        this.field_ = autocomplete;
        this.fieldCase_ = 5;
    }

    public final void w(Dropdown dropdown) {
        dropdown.getClass();
        this.field_ = dropdown;
        this.fieldCase_ = 4;
    }

    public final void x(String str) {
        this.id_ = str;
    }

    public final void y(String str) {
        this.label_ = str;
    }

    public final void z(Text text) {
        text.getClass();
        this.field_ = text;
        this.fieldCase_ = 3;
    }
}
