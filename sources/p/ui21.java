package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ui21 implements Update {
    public static final ui21 a = new ui21();

    public final Next a(Object obj, Object obj2) {
        yi21 yi21Var = (yi21) obj;
        si21 si21Var = (si21) obj2;
        uh21 uh21Var = uh21.b;
        boolean z = yi21Var.e;
        sqw0 pqw0Var = yi21Var.c;
        String str = yi21Var.d;
        boolean z2 = si21Var instanceof gi21;
        qqw0 qqw0Var = qqw0.a;
        if (z2) {
            boolean z3 = ((gi21) si21Var).a;
            return Next.h(yi21.a(yi21Var, null, null, z3, false, z3 ? o7a.a : new q7a(2131954270, 2132018006), null, z3 && !u890.j(pqw0Var, qqw0Var), 431));
        }
        if (si21Var instanceof ii21) {
            sqw0 sqw0Var = ((ii21) si21Var).a;
            boolean z4 = !ihc1.y0(str) && str.length() > 0;
            if (sqw0Var.equals(oqw0.a) || sqw0Var.equals(rqw0.a)) {
                return Next.h(yi21.a(yi21Var, sqw0Var, "", false, false, null, null, yi21Var.e, 467));
            }
            if (sqw0Var instanceof pqw0) {
                return Next.h(yi21.a(yi21Var, new pqw0(str), str, false, true, null, null, z && z4, 467));
            }
            if (sqw0Var.equals(qqw0Var)) {
                return Next.h(yi21.a(yi21Var, sqw0Var, "", false, false, null, null, false, 467));
            }
            eg.o();
            return null;
        }
        if (si21Var instanceof hi21) {
            String str2 = ((hi21) si21Var).a;
            return Next.h(yi21.a(yi21Var, pqw0Var instanceof pqw0 ? new pqw0(str2) : pqw0Var, str2, false, false, null, null, z && (!yi21Var.f ? u890.j(pqw0Var, qqw0Var) : ihc1.y0(str2) || str2.length() <= 0), 499));
        }
        if (si21Var instanceof mi21) {
            yi21 yi21VarA = yi21.a(yi21Var, null, null, false, false, null, null, false, 511);
            String str3 = yi21Var.a;
            String str4 = yi21Var.b;
            if (pqw0Var instanceof pqw0) {
                pqw0Var = new pqw0(str);
            }
            return Next.i(yi21VarA, Collections.singleton(new zh21(str3, str4, pqw0Var)));
        }
        if (si21Var instanceof ni21) {
            return Next.a(Collections.singleton(new wh21(yi21Var.h)));
        }
        if (si21Var instanceof ki21) {
            return Next.h(yi21.a(yi21Var, null, null, false, false, null, new yr10(((ki21) si21Var).a), false, 767));
        }
        if (si21Var instanceof ji21) {
            return Next.a(Collections.singleton(uh21Var));
        }
        if (si21Var instanceof li21) {
            return Next.i(yi21.a(yi21Var, null, null, false, false, null, xr10.a, false, 767), Collections.singleton(uh21Var));
        }
        eg.o();
        return null;
    }
}
