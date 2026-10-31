package p;

import com.spotify.appauthorization.builtinauth.model.FieldValidator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e6j0 extends nhc {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void G(String str, String str2, boolean z) throws FieldValidator.ValidationException {
        if (z) {
            return;
        }
        n57.e(" Error validating ".concat(str2));
        throw new FieldValidator.ValidationException(cy30.p("\"", str2, "\" has no value for key \"", str, "\""));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void H(String str, zq5 zq5Var) throws FieldValidator.ValidationException {
        fr5 fr5Var = zq5Var.b;
        nhc.C("uri", "spotify", str);
        cr5 cr5Var = zq5Var.c;
        G("info", "details", cr5Var != null);
        nhc.C("protocol version", 1, cr5Var.b);
        nhc.D(cr5Var.e, "name");
        nhc.D(cr5Var.d, "id");
        nhc.F(0, 10000, cr5Var.l.intValue(), "default image width");
        nhc.F(0, 10000, cr5Var.k.intValue(), "default image height");
        nhc.F(0, 10000, cr5Var.n.intValue(), "default thumbnail image width");
        nhc.F(0, 10000, cr5Var.m.intValue(), "default thumbnail image height");
        G("subscriber", "roles", fr5Var.d != null);
        G("caller", "roles", fr5Var.e != null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException */
    public static void I(zq5 zq5Var) throws FieldValidator.ValidationException {
        nhc.D(zq5Var.e, "authid");
        List<String> list = zq5Var.d;
        if (list == null || list.size() == 0) {
            throw new FieldValidator.ValidationException("\"authmethods\" can not be empty");
        }
        for (String str : list) {
            if (!dh8.a.contains(str)) {
                throw new FieldValidator.ValidationException(f4i1.f("\"", str, "\" is not a valid auth method"));
            }
        }
    }
}
