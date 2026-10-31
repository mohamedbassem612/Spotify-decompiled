package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.automix.proto.TransitionOuterClass;
import com.spotify.base.java.logging.Logger;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kkg1 {
    public static lhg1 a(String str) {
        try {
            TransitionOuterClass.Transition transitionS = TransitionOuterClass.Transition.s(n9a.b(n9a.e, str.getBytes(nne.a)));
            transitionS.getClass();
            return dem1.S(transitionS);
        } catch (IllegalArgumentException unused) {
            Logger.d("Failed decoding Transition Base64", new Object[0]);
            return null;
        } catch (InvalidProtocolBufferException unused2) {
            Logger.d("Failed decoding Transition proto", new Object[0]);
            return null;
        }
    }

    public static lhg1 b(Map map) {
        String str = (String) map.get("automix.auto_transition_recipe");
        if (str != null) {
            return a(str);
        }
        return null;
    }

    public static String c(lhg1 lhg1Var) {
        return n9a.c(n9a.e, dem1.R(lhg1Var).toByteArray());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[RETURN] */
    public static boolean d(String str, String str2, lhg1 lhg1Var) {
        ruq0 ruq0Var = lhg1Var.b;
        int iC = l1d.C(1);
        if (iC == 0) {
            if (u890.j(ruq0Var.a, str2) && u890.j(ruq0Var.b, str)) {
                return true;
            }
            return false;
        }
        if (iC != 1) {
            eg.o();
            return false;
        }
        if (u890.j(ruq0Var.c, str2) && u890.j(ruq0Var.d, str)) {
            return true;
        }
        return false;
    }
}
