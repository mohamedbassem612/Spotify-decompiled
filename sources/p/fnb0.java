package p;

import androidx.glance.appwidget.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fnb0 extends e {
    private static final fnb0 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile ozr0 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private hnb0 layout_;

    static {
        fnb0 fnb0Var = new fnb0();
        DEFAULT_INSTANCE = fnb0Var;
        e.i(fnb0.class, fnb0Var);
    }

    public static enb0 m() {
        return (enb0) ((ve40) DEFAULT_INSTANCE.b(5));
    }

    @Override // androidx.glance.appwidget.protobuf.e
    public final Object b(int i) {
        ze40 ze40Var;
        switch (l1d.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new vvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new fnb0();
            case 4:
                return new enb0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ozr0 ozr0Var = PARSER;
                if (ozr0Var != null) {
                    return ozr0Var;
                }
                synchronized (fnb0.class) {
                    try {
                        ze40Var = PARSER;
                        if (ze40Var == null) {
                            ze40Var = new ze40();
                            PARSER = ze40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ze40Var;
            default:
                k220.c();
                return null;
        }
    }

    public final hnb0 k() {
        hnb0 hnb0Var = this.layout_;
        return hnb0Var == null ? hnb0.m() : hnb0Var;
    }

    public final int l() {
        return this.layoutIndex_;
    }

    public final void n(hnb0 hnb0Var) {
        hnb0Var.getClass();
        this.layout_ = hnb0Var;
        this.bitField0_ |= 1;
    }

    public final void o(int i) {
        this.layoutIndex_ = i;
    }
}
