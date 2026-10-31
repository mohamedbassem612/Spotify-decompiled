package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xu01 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yu01 b;

    public /* synthetic */ xu01(yu01 yu01Var, byte b) {
        this.a = b;
        this.b = yu01Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        yu01 yu01Var = this.b;
        switch (b) {
            case 0:
                zr01 zr01Var = (zr01) obj;
                in8 in8Var = yu01Var.e;
                String str = zr01Var.c;
                tv80 tv80Var = zr01Var.d;
                lzn0 lzn0Var = in8Var.a;
                try {
                    if (tv80Var != null) {
                        lzn0Var.a(str, tv80Var, (Bundle) null);
                    } else {
                        lzn0Var.h(str);
                    }
                } catch (Exception e) {
                    n57.g("Failed to navigate to the uri:".concat(str), e);
                    return;
                }
                break;
            case 1:
                as01 as01Var = (as01) obj;
                vgm.b(yu01Var.f, as01Var.c, nik1.x0.a, as01Var.d, (tgm) null, 8);
                break;
            case 2:
                yu01Var.d.a(((fs01) obj).c);
                break;
            default:
                bs01 bs01Var = (bs01) obj;
                int i = bs01Var.d;
                String str2 = bs01Var.c;
                String strC = i > 0 ? f4i1.c(i, "?playTimestamp=") : "";
                t001 t001Var = yu01Var.g;
                String strF = f4i1.f("spotify:listeningactivity:", str2, strC);
                kik1 kik1Var = nik1.a;
                t001Var.a(strF, str2);
                break;
        }
    }
}
