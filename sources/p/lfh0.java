package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lfh0 implements nma0 {
    public static final lfh0 a = new lfh0();
    public static final j661 b;

    static {
        h661[] h661VarArr = new h661[0];
        if (ihc1.y0("MeasuredLoudness")) {
            hhg1.n("Blank serial names are prohibited");
            return;
        }
        neg negVar = new neg("MeasuredLoudness");
        qnw0 qnw0Var = er20.b;
        negVar.a("loudness", qnw0Var, false);
        negVar.a("true_peak", qnw0Var, false);
        negVar.a("max_momentary_loudness", qnw0Var, false);
        b = new j661("MeasuredLoudness", uic1.h, negVar.c.size(), f46.Q0(h661VarArr), negVar);
    }

    public static float a(uga0 uga0Var, String str) {
        ega0 ega0Var = (ega0) uga0Var.get(str);
        if (ega0Var == null) {
            return 0.0f;
        }
        aha0 aha0VarM = fga0.m(ega0Var);
        String strB = aha0VarM.b();
        if (u890.j(strB, "Infinity")) {
            return Float.MAX_VALUE;
        }
        if (u890.j(strB, "-Infinity")) {
            return Float.MIN_VALUE;
        }
        Float fB0 = nhc1.b0(aha0VarM.b());
        if (fB0 == null) {
            return 0.0f;
        }
        if (Float.isNaN(fB0.floatValue())) {
            fB0 = null;
        }
        if (fB0 != null) {
            return fB0.floatValue();
        }
        return 0.0f;
    }

    public final Object deserialize(dar darVar) {
        if (!(darVar instanceof bga0)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        ega0 ega0VarM = ((bga0) darVar).m();
        uga0 uga0Var = ega0VarM instanceof uga0 ? (uga0) ega0VarM : null;
        return uga0Var == null ? new kfh0(0.0f, 0.0f, 0.0f) : new kfh0(a(uga0Var, "loudness"), a(uga0Var, "true_peak"), a(uga0Var, "max_momentary_loudness"));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kfh0 kfh0Var = (kfh0) obj;
        if (!(uaxVar instanceof jga0)) {
            hhg1.n("Failed requirement.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((jga0) uaxVar).R(new uga0(linkedHashMap));
    }
}
