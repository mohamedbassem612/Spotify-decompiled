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
public final class ProductBreakdown extends com.google.protobuf.h implements v2j0 {
    public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 4;
    private static final ProductBreakdown DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_LABEL_FIELD_NUMBER = 2;
    public static final int TOTAL_PRICE_FIELD_NUMBER = 3;
    private h290 groups_ = com.google.protobuf.h.emptyProtobufList();
    private String totalLabel_ = "";
    private String totalPrice_ = "";
    private String additionalTaxLabel_ = "";

    public static final class BreakdownGroup extends com.google.protobuf.h implements v2j0 {
        private static final BreakdownGroup DEFAULT_INSTANCE;
        public static final int GROUPTYPE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int ROWS_FIELD_NUMBER = 1;
        private int groupType_;
        private h290 rows_ = com.google.protobuf.h.emptyProtobufList();

        public static final class BreakdownRow extends com.google.protobuf.h implements v2j0 {
            public static final int ADDITIONAL_TAX_LABEL_FIELD_NUMBER = 3;
            private static final BreakdownRow DEFAULT_INSTANCE;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int ROWTYPE_FIELD_NUMBER = 4;
            private int rowType_;
            private String label_ = "";
            private String price_ = "";
            private String additionalTaxLabel_ = "";

            static {
                BreakdownRow breakdownRow = new BreakdownRow();
                DEFAULT_INSTANCE = breakdownRow;
                com.google.protobuf.h.registerDefaultInstance(BreakdownRow.class, breakdownRow);
            }

            private BreakdownRow() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public static r0 r() {
                return (r0) DEFAULT_INSTANCE.createBuilder();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"label_", "price_", "additionalTaxLabel_", "rowType_"});
                }
                if (iOrdinal == 3) {
                    return new BreakdownRow();
                }
                if (iOrdinal == 4) {
                    return new r0(DEFAULT_INSTANCE);
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
                synchronized (BreakdownRow.class) {
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
                return this.additionalTaxLabel_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.label_;
            }

            public final String p() {
                return this.price_;
            }

            public final q0 q() {
                q0 q0Var;
                int i = this.rowType_;
                if (i == 0) {
                    q0Var = q0.DEFAULT;
                } else if (i == 1) {
                    q0Var = q0.ADDED;
                } else if (i != 2) {
                    q0Var = i != 3 ? null : q0.STRIKETHROUGH;
                } else {
                    q0Var = q0.REMOVED;
                }
                return q0Var == null ? q0.UNRECOGNIZED : q0Var;
            }

            public final void s(String str) {
                this.additionalTaxLabel_ = str;
            }

            public final void t(String str) {
                this.label_ = str;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public final void u(String str) {
                this.price_ = str;
            }

            public final void v(q0 q0Var) {
                this.rowType_ = q0Var.getNumber();
            }
        }

        static {
            BreakdownGroup breakdownGroup = new BreakdownGroup();
            DEFAULT_INSTANCE = breakdownGroup;
            com.google.protobuf.h.registerDefaultInstance(BreakdownGroup.class, breakdownGroup);
        }

        private BreakdownGroup() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static s0 r() {
            return (s0) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"rows_", BreakdownRow.class, "groupType_"});
            }
            if (iOrdinal == 3) {
                return new BreakdownGroup();
            }
            if (iOrdinal == 4) {
                return new s0(DEFAULT_INSTANCE);
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
            synchronized (BreakdownGroup.class) {
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
            h290 h290VarMutableCopy = this.rows_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.rows_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final p0 o() {
            p0 p0Var;
            int i = this.groupType_;
            if (i != 0) {
                p0Var = i != 1 ? null : p0.HIGHLIGHTED;
            } else {
                p0Var = p0.DEFAULT;
            }
            return p0Var == null ? p0.UNRECOGNIZED : p0Var;
        }

        public final int p() {
            return this.rows_.size();
        }

        public final h290 q() {
            return this.rows_;
        }

        public final void s(p0 p0Var) {
            this.groupType_ = p0Var.getNumber();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ProductBreakdown productBreakdown = new ProductBreakdown();
        DEFAULT_INSTANCE = productBreakdown;
        com.google.protobuf.h.registerDefaultInstance(ProductBreakdown.class, productBreakdown);
    }

    private ProductBreakdown() {
    }

    public static ProductBreakdown p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static t0 t() {
        return (t0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"groups_", BreakdownGroup.class, "totalLabel_", "totalPrice_", "additionalTaxLabel_"});
        }
        if (iOrdinal == 3) {
            return new ProductBreakdown();
        }
        if (iOrdinal == 4) {
            return new t0(DEFAULT_INSTANCE);
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
        synchronized (ProductBreakdown.class) {
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
        h290 h290VarMutableCopy = this.groups_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.groups_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.additionalTaxLabel_;
    }

    public final h290 q() {
        return this.groups_;
    }

    public final String r() {
        return this.totalLabel_;
    }

    public final String s() {
        return this.totalPrice_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.additionalTaxLabel_ = "+ tax";
    }

    public final void v() {
        this.totalLabel_ = "New monthly total:";
    }

    public final void w(String str) {
        this.totalPrice_ = str;
    }
}
