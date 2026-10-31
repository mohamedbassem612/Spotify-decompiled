package p;

import androidx.datastore.preferences.protobuf.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vnv0 extends e {
    private static final vnv0 DEFAULT_INSTANCE;
    private static volatile rzr0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private i290 strings_ = tiy0.e();

    static {
        vnv0 vnv0Var = new vnv0();
        DEFAULT_INSTANCE = vnv0Var;
        e.h(vnv0.class, vnv0Var);
    }

    public static vnv0 k() {
        return DEFAULT_INSTANCE;
    }

    public static unv0 m() {
        return (ye40) DEFAULT_INSTANCE.d(5);
    }

    @Override // androidx.datastore.preferences.protobuf.e
    public final Object d(int i) {
        cf40 cf40Var;
        switch (l1d.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yvz0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new vnv0();
            case 4:
                return new unv0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                rzr0 rzr0Var = PARSER;
                if (rzr0Var != null) {
                    return rzr0Var;
                }
                synchronized (vnv0.class) {
                    try {
                        cf40Var = PARSER;
                        if (cf40Var == null) {
                            cf40Var = new cf40();
                            PARSER = cf40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cf40Var;
            default:
                k220.c();
                return null;
        }
    }

    public final void j(Iterable iterable) {
        if (!this.strings_.c()) {
            i290 i290Var = this.strings_;
            int size = i290Var.size();
            this.strings_ = i290Var.h(size == 0 ? 10 : size * 2);
        }
        pvb0 pvb0Var = this.strings_;
        Charset charset = n290.a;
        if (iterable instanceof pvb0) {
            List listA = ((pvb0) iterable).a();
            pvb0 pvb0Var2 = pvb0Var;
            int size2 = pvb0Var.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (pvb0Var2.size() - size2) + " is null.";
                    for (int size3 = pvb0Var2.size() - 1; size3 >= size2; size3--) {
                        pvb0Var2.remove(size3);
                    }
                    bhn0.i(str);
                    return;
                }
                if (obj instanceof ihc) {
                    pvb0Var2.H0((ihc) obj);
                } else {
                    pvb0Var2.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof pnw0) {
            pvb0Var.addAll((Collection) iterable);
            return;
        }
        if ((pvb0Var instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) pvb0Var).ensureCapacity(((Collection) iterable).size() + pvb0Var.size());
        }
        int size4 = pvb0Var.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (pvb0Var.size() - size4) + " is null.";
                for (int size5 = pvb0Var.size() - 1; size5 >= size4; size5--) {
                    pvb0Var.remove(size5);
                }
                bhn0.i(str2);
                return;
            }
            pvb0Var.add(obj2);
        }
    }

    public final i290 l() {
        return this.strings_;
    }
}
