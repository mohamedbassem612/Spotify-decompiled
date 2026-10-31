package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rf10 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sf10 b;

    public /* synthetic */ rf10(sf10 sf10Var, byte b) {
        this.a = b;
        this.b = sf10Var;
    }

    public final void accept(Object obj) {
        View view;
        byte b = this.a;
        sf10 sf10Var = this.b;
        switch (b) {
            case 0:
                if10 if10Var = (if10) obj;
                if (if10Var instanceof gf10) {
                    pf10 pf10Var = sf10Var.g;
                    if (pf10Var == null || (view = pf10Var.M1) == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                if (!(if10Var instanceof hf10)) {
                    if (!(if10Var instanceof ff10)) {
                        pf10 pf10Var2 = sf10Var.g;
                        if (pf10Var2 != null) {
                            pf10Var2.Z0();
                            return;
                        }
                        return;
                    }
                    String str = ((ff10) if10Var).a;
                    sf10Var.c.k(String.format("Failed to get facebook me: %s", Arrays.copyOf(new Object[]{str}, 1)));
                    Logger.d("Failed to get facebook me: %s", new Object[]{str});
                    pf10 pf10Var3 = sf10Var.g;
                    if (pf10Var3 != null) {
                        pf10Var3.Z0();
                        return;
                    }
                    return;
                }
                String strOptString = ((hf10) if10Var).a.optString("id");
                Date date = xd.Y;
                xd xdVarS = fuo1.s();
                String str2 = xdVarS != null ? xdVarS.e : null;
                if (str2 == null) {
                    eg.m("Required value was null.");
                    return;
                }
                pf10 pf10Var4 = sf10Var.g;
                if (pf10Var4 != null) {
                    kg0 kg0Var = pf10Var4.J1;
                    if (kg0Var != null) {
                        kg0Var.d(new yit(new a3f0(strOptString, str2), bk8.f, (n5o) null, 12), true);
                        return;
                    } else {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Failed to get facebook me", new Object[0]);
                sf10Var.c.k(String.format("Failed to get facebook me: %s", Arrays.copyOf(new Object[]{th}, 1)));
                pf10 pf10Var5 = sf10Var.g;
                if (pf10Var5 != null) {
                    pf10Var5.Z0();
                    return;
                }
                return;
        }
    }
}
