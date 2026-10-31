package p;

import io.reactivex.rxjava3.core.SingleConverter;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class us71 {
    public static int[] _values() {
        return l1d.H(13);
    }

    public static int a(int i) {
        if (i == 0) {
            return 13;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 6) {
                            return 5;
                        }
                        if (i == 9) {
                            return 6;
                        }
                        if (i == 21) {
                            return 12;
                        }
                        if (i == 17) {
                            return 10;
                        }
                        if (i == 18) {
                            return 11;
                        }
                        switch (i) {
                            case 11:
                                return 7;
                            case 12:
                                return 8;
                            case 13:
                                return 9;
                            default:
                                return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 5 ? 0 : 1;
        }
        return 2;
    }

    public static final String c(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "readiness_failed";
        }
        if (i == 3) {
            return "gen_playlist_timeout";
        }
        if (i == 4) {
            return "cancel";
        }
        if (i == 5) {
            return "player_failed";
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw null;
    }

    public static float e(int i, float f, float f2) {
        return (Float.intBitsToFloat(i) * f) + f2;
    }

    public static String f(jd11 jd11Var, Class cls, StringBuilder sb) {
        sb.append(jd11Var.b(cls));
        return sb.toString();
    }

    public static pe g(gw70 gw70Var, ryj ryjVar) {
        c8o.l(gw70Var);
        pe peVarH = ryjVar.h();
        c8o.l(peVarH);
        return peVarH;
    }

    public static llm h(q8n q8nVar) {
        return smo1.e(flo1.l(guo1.B(), q8nVar));
    }

    public static drr0 i(float f, x340 x340Var) {
        drr0 drr0Var = new drr0(f);
        x340Var.s0(drr0Var);
        return drr0Var;
    }

    public static void j(int i, vu30 vu30Var, x340 x340Var, boolean z) {
        vu30Var.invoke(x340Var, Integer.valueOf(i));
        x340Var.r(z);
    }

    public static void k(int i, vu30 vu30Var, x340 x340Var, boolean z, boolean z2) {
        vu30Var.invoke(x340Var, Integer.valueOf(i));
        x340Var.r(z);
        x340Var.r(z2);
    }

    public static /* synthetic */ void l(SingleConverter singleConverter) {
        throw new ClassCastException();
    }

    public static void m(x340 x340Var, boolean z, boolean z2, boolean z3) {
        x340Var.r(z);
        x340Var.r(z2);
        x340Var.r(z3);
    }

    public static /* synthetic */ boolean n(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference, Object obj, Collection collection) {
        while (!atomicReference.compareAndSet(obj, collection)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "Presented";
        }
        if (i == 2) {
            return "Dismissed";
        }
        if (i == 3) {
            return "ConnectClicked";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "REAL";
        }
        if (i == 2) {
            return "PLACE_HOLDER";
        }
        throw null;
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "FUNCTION";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FIELD_IN_JAVA_CLASS";
        }
        return "PROPERTY";
    }

    public static /* synthetic */ int s(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("REAL")) {
            return 1;
        }
        if (str.equals("PLACE_HOLDER")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.statsitemview.SocialDataType.".concat(str));
        return 0;
    }
}
