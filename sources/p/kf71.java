package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kf71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lc20 a;

    public kf71(lc20 lc20Var) {
        this.a = lc20Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String string;
        String string2;
        String str;
        mmr0 mmr0Var;
        ch71 ch71Var = (ch71) obj;
        lc20 lc20Var = this.a;
        Context context = (Context) lc20Var.d;
        o571 o571Var = ch71Var.c;
        pe71 pe71Var = ch71Var.d;
        if (pe71Var instanceof oe71) {
            oe71 oe71Var = (oe71) pe71Var;
            String str2 = oe71Var.c;
            Logger.d(str2, new Object[0]);
            g871 g871Var = (g871) lc20Var.b;
            k771 k771Var = oe71Var.e;
            String str3 = oe71Var.a;
            String str4 = oe71Var.d;
            ela1 ela1Var = ch71Var.e;
            yy61 yy61Var = oe71Var.b;
            g871Var.a(new i771(k771Var, str4, str2, str3, ela1Var.c, ela1Var.b, ela1Var.a, o571Var != null ? o571Var.a : null, yy61Var != null ? yy61Var.a : null, 512));
            if (u890.j(o571Var, m471.d)) {
                mmr0Var = new mmr0(2131962337, 2131962334);
            } else {
                mmr0Var = u890.j(o571Var, p471.d) ? new mmr0(2131962338, 2131962335) : new mmr0(2131962336, 2131962333);
            }
            int iIntValue = ((Number) mmr0Var.a).intValue();
            int iIntValue2 = ((Number) mmr0Var.b).intValue();
            string = context.getString(iIntValue);
            string2 = context.getString(iIntValue2);
            str = null;
        } else {
            if (!(pe71Var instanceof ne71)) {
                eg.o();
                return null;
            }
            ne71 ne71Var = (ne71) pe71Var;
            string = ne71Var.b;
            string2 = ne71Var.a;
            str = ne71Var.c;
        }
        String str5 = string2;
        String str6 = string;
        kjz kjzVar = (kjz) lc20Var.c;
        ou80 ou80Var = ch71Var.f;
        String str7 = ou80Var != null ? ou80Var.a : null;
        kjzVar.getClass();
        a1r0.j(kjzVar.a, nik1.m2.a, str7, mno1.h(new mmr0[]{new mmr0("share.sheet.error", new th71(str6, str5, str, dz.a, (dz) null))}), false, 8);
        return rih1.a;
    }
}
