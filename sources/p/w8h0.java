package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w8h0 implements nma0 {
    public static final w8h0 a = new w8h0();
    public static final j661 b = omo1.i("com.spotify.deeplink.deferreddeeplink.MatchResponse", new h661[0], s4h0.Z0);

    public static aha0 a(String str, ega0 ega0Var) {
        aha0 aha0Var = ega0Var instanceof aha0 ? (aha0) ega0Var : null;
        if (aha0Var != null) {
            return aha0Var;
        }
        uh61.j("Expected a primitive for ".concat(str));
        return null;
    }

    public static String b(uga0 uga0Var, String str, String str2) {
        ega0 ega0Var = uga0Var.containsKey(str) ? (ega0) sqg0.G(str, uga0Var) : (ega0) uga0Var.get(str2);
        if (ega0Var != null) {
            if (ega0Var instanceof rga0) {
                ega0Var = null;
            }
            if (ega0Var != null) {
                aha0 aha0VarA = a(str, ega0Var);
                if (aha0VarA.c() || nhc1.a0(aha0VarA.b()) != null) {
                    return aha0VarA.b();
                }
                uh61.j("Expected a string for ".concat(str));
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final Object deserialize(dar darVar) {
        boolean zBooleanValue;
        double dDoubleValue;
        bga0 bga0Var = darVar instanceof bga0 ? (bga0) darVar : null;
        if (bga0Var == null) {
            uh61.j("JSON required");
            return null;
        }
        uga0 uga0VarM = bga0Var.m();
        uga0 uga0Var = uga0VarM instanceof uga0 ? uga0VarM : null;
        if (uga0Var == null) {
            uh61.j("Expected a JSON object");
            return null;
        }
        ega0 ega0Var = (ega0) uga0Var.get("matched");
        if (ega0Var == null) {
            zBooleanValue = false;
        } else {
            if (ega0Var instanceof rga0) {
                ega0Var = null;
            }
            if (ega0Var != null) {
                aha0 aha0VarA = a("matched", ega0Var);
                if (aha0VarA.c()) {
                    uh61.j("Expected a boolean for matched");
                    return null;
                }
                Boolean boolF = fga0.f(aha0VarA);
                if (boolF == null) {
                    uh61.j("Expected a boolean for matched");
                    return null;
                }
                zBooleanValue = boolF.booleanValue();
            } else {
                zBooleanValue = false;
            }
        }
        boolean z = zBooleanValue;
        String strB = b(uga0Var, "deep_link", "deepLink");
        String strB2 = b(uga0Var, "match_method", "matchMethod");
        ega0 ega0Var2 = uga0Var.containsKey("match_confidence") ? (ega0) sqg0.G("match_confidence", uga0Var) : (ega0) uga0Var.get("matchConfidence");
        if (ega0Var2 == null || (ega0Var2 instanceof rga0)) {
            dDoubleValue = 0.0d;
        } else {
            aha0 aha0VarA2 = a("match_confidence", ega0Var2);
            mf80 mf80Var = fga0.a;
            Double dA0 = nhc1.a0(aha0VarA2.b());
            if (dA0 == null) {
                uh61.j("Expected a double for match_confidence");
                return null;
            }
            dDoubleValue = dA0.doubleValue();
            if (Math.abs(dDoubleValue) > Double.MAX_VALUE) {
                uh61.j("Expected a finite double for match_confidence");
                return null;
            }
        }
        return new v8h0(z, strB, strB2, dDoubleValue, b(uga0Var, "click_id", "clickId"), b(uga0Var, "match_id", "matchId"));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        v8h0 v8h0Var = (v8h0) obj;
        jga0 jga0Var = uaxVar instanceof jga0 ? (jga0) uaxVar : null;
        if (jga0Var == null) {
            uh61.j("JSON required");
            return;
        }
        vga0 vga0Var = new vga0();
        j9k1.y(vga0Var, "matched", Boolean.valueOf(v8h0Var.a));
        String str = v8h0Var.b;
        if (str != null) {
            j9k1.A(vga0Var, "deep_link", str);
        }
        String str2 = v8h0Var.c;
        if (str2 != null) {
            j9k1.A(vga0Var, "match_method", str2);
        }
        j9k1.z(vga0Var, "match_confidence", Double.valueOf(v8h0Var.d));
        String str3 = v8h0Var.e;
        if (str3 != null) {
            j9k1.A(vga0Var, "click_id", str3);
        }
        String str4 = v8h0Var.f;
        if (str4 != null) {
            j9k1.A(vga0Var, "match_id", str4);
        }
        jga0Var.R(vga0Var.a());
    }
}
