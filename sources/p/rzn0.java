package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rzn0 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(mzn0 mzn0Var) {
        String strU = rzn1.u(mzn0Var.getClass());
        if (strU.length() <= 0) {
            hhg1.n("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        mzn0 mzn0Var2 = (mzn0) linkedHashMap.get(strU);
        if (u890.j(mzn0Var2, mzn0Var)) {
            return;
        }
        if (mzn0Var2 != null && mzn0Var2.b) {
            ncn0.j("Navigator ", mzn0Var, " is replacing an already attached ", mzn0Var2);
        } else if (mzn0Var.b) {
            jah.h("Navigator ", mzn0Var, " is already attached to another NavController");
        }
    }

    public final mzn0 b(String str) {
        if (str.length() <= 0) {
            hhg1.n("navigator name cannot be an empty string");
            return null;
        }
        mzn0 mzn0Var = (mzn0) this.a.get(str);
        if (mzn0Var != null) {
            return mzn0Var;
        }
        eg.m(f4i1.f("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
