package p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bx8 implements su30 {
    public static final bx8 b = new bx8((byte) 0);
    public static final bx8 c = new bx8((byte) 1);
    public static final bx8 d = new bx8((byte) 2);
    public static final bx8 e = new bx8((byte) 3);
    public static final bx8 f = new bx8((byte) 4);
    public static final bx8 g = new bx8((byte) 5);
    public static final bx8 h = new bx8((byte) 6);
    public static final bx8 i = new bx8((byte) 7);
    public static final bx8 j = new bx8((byte) 8);
    public static final bx8 k = new bx8((byte) 9);
    public static final bx8 l = new bx8((byte) 10);
    public static final bx8 m = new bx8((byte) 11);
    public static final bx8 n = new bx8((byte) 12);
    public final /* synthetic */ byte a;

    public bx8() {
        this.a = (byte) 13;
        Set set = s4b1.f;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((o5e0) obj) instanceof i5e0);
            case 1:
                return ((ContextTrack) obj).uri();
            case 2:
                return ((ContextTrack) obj).uri();
            case 3:
                return ((ContextTrack) obj).metadata();
            case 4:
                return ((ContextTrack) obj).uri();
            case 5:
                return ((ContextTrack) obj).uri();
            case 6:
                return ((ContextTrack) obj).uri();
            case 7:
                return ((ContextTrack) obj).provider();
            case 8:
                ContextTrack contextTrack = (ContextTrack) obj;
                if (contextTrack != null) {
                    return contextTrack.uid();
                }
                return null;
            case 9:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                if (contextTrack2 != null) {
                    return contextTrack2.uri();
                }
                return null;
            case 10:
                ContextTrack contextTrack3 = (ContextTrack) obj;
                if (contextTrack3 != null) {
                    return contextTrack3.uri();
                }
                return null;
            case 11:
                ContextTrack contextTrack4 = (ContextTrack) obj;
                contextTrack4.getClass();
                return Boolean.valueOf(l4o1.S(contextTrack4));
            case 12:
                return Boolean.valueOf(l4o1.E((ContextTrack) obj));
            case 13:
                Set set = s4b1.f;
                return uic.x((String) obj);
            case 14:
                return ((s4b1) obj).c == blc0.Pg ? enh0.c : enh0.b;
            default:
                s570 s570Var = (s570) obj;
                s570Var.getClass();
                int iOrdinal = s570Var.ordinal();
                if (iOrdinal == 0) {
                    d970 d970Var = h970.b;
                    return 2131429184;
                }
                if (iOrdinal == 1) {
                    return Integer.valueOf(u970.X);
                }
                if (iOrdinal == 2) {
                    va70 va70Var = eb70.b;
                    return 2131429200;
                }
                if (iOrdinal == 3) {
                    ac70[] ac70VarArr = ac70.b;
                    return 2131429207;
                }
                if (iOrdinal == 4) {
                    k570.c.getClass();
                    return 2131429145;
                }
                eg.f("Category without a default: ".concat(String.valueOf(s570Var)));
                return null;
        }
    }

    public /* synthetic */ bx8(byte b2) {
        this.a = b2;
    }

    public bx8(inh0 inh0Var) {
        this.a = (byte) 14;
    }
}
