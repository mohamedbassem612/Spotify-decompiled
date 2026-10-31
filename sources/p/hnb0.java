package p;

import androidx.glance.appwidget.protobuf.e;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hnb0 extends e {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final hnb0 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile ozr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private f290 children_ = qiy0.d;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        hnb0 hnb0Var = new hnb0();
        DEFAULT_INSTANCE = hnb0Var;
        e.i(hnb0.class, hnb0Var);
    }

    public static hnb0 m() {
        return DEFAULT_INSTANCE;
    }

    public static gnb0 n() {
        return (ve40) DEFAULT_INSTANCE.b(5);
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
                return new vvz0(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", hnb0.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new hnb0();
            case 4:
                return new gnb0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ozr0 ozr0Var = PARSER;
                if (ozr0Var != null) {
                    return ozr0Var;
                }
                synchronized (hnb0.class) {
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

    public final void l(ArrayList arrayList) {
        f290 f290VarD = this.children_;
        if (!((g9) f290VarD).a) {
            int size = f290VarD.size();
            f290VarD = ((qiy0) f290VarD).d(size == 0 ? 10 : size * 2);
            this.children_ = f290VarD;
        }
        Charset charset = j290.a;
        if (f290VarD instanceof ArrayList) {
            ((ArrayList) f290VarD).ensureCapacity(arrayList.size() + f290VarD.size());
        }
        int size2 = f290VarD.size();
        for (Object obj : arrayList) {
            if (obj == null) {
                String str = "Element at index " + (f290VarD.size() - size2) + " is null.";
                for (int size3 = f290VarD.size() - 1; size3 >= size2; size3--) {
                    f290VarD.remove(size3);
                }
                bhn0.i(str);
                return;
            }
            f290VarD.add(obj);
        }
    }

    public final void o(boolean z) {
        this.hasAction_ = z;
    }

    public final void p(boolean z) {
        this.hasImageColorFilter_ = z;
    }

    public final void q(boolean z) {
        this.hasImageDescription_ = z;
    }

    public final void r(anb0 anb0Var) {
        this.height_ = anb0Var.a();
    }

    public final void s(bnb0 bnb0Var) {
        this.horizontalAlignment_ = bnb0Var.a();
    }

    public final void t() {
        this.identity_ = jnb0.b.a();
    }

    public final void u(zmb0 zmb0Var) {
        this.imageScale_ = zmb0Var.a();
    }

    public final void v(inb0 inb0Var) {
        this.type_ = inb0Var.a();
    }

    public final void w(knb0 knb0Var) {
        this.verticalAlignment_ = knb0Var.a();
    }

    public final void x(anb0 anb0Var) {
        this.width_ = anb0Var.a();
    }
}
