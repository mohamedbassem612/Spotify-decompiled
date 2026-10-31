package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pm90 extends wfa0 {
    public static final pm90 d = new pm90(rc11.a.b(bi90.class));

    public final nma0 c(ega0 ega0Var) {
        ega0 ega0Var2 = (ega0) fga0.l(ega0Var).get("type");
        String strB = ega0Var2 != null ? fga0.m(ega0Var2).b() : null;
        if (u890.j(strB, "preference")) {
            return rh90.Companion.serializer();
        }
        if (u890.j(strB, "group")) {
            return mh90.Companion.serializer();
        }
        uh61.j(gvg.g(fga0.l(ega0Var).get("type"), "Unknown Item type: "));
        return null;
    }
}
