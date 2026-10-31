package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class r3f {
    public static final idd1 a = new idd1(xrc.Y0);

    public static String a(Context context, ctf ctfVar, String str, w4i1 w4i1Var, List list, tol tolVar, boolean z) {
        String string;
        String str2;
        String str3 = w4i1Var.b;
        if (!ctfVar.equals(atf.a) && !(ctfVar instanceof btf)) {
            eg.o();
            return null;
        }
        boolean zJ = u890.j(w4i1Var.a, str);
        if (tolVar.equals(iol.a)) {
            string = zJ ? context.getString(2131953801) : context.getString(2131953800, str3);
        } else if (tolVar.equals(jol.a)) {
            string = zJ ? context.getString(2131953803) : context.getString(2131953802, str3);
        } else if (tolVar.equals(lol.a)) {
            string = zJ ? context.getString(2131953805) : context.getString(2131953804, str3);
        } else if (tolVar.equals(mol.a)) {
            string = zJ ? context.getString(2131953807) : context.getString(2131953806, str3);
        } else if (tolVar.equals(nol.a)) {
            string = zJ ? context.getString(2131953809) : context.getString(2131953808, str3);
        } else if (tolVar instanceof ool) {
            if (zJ) {
                string = context.getString(2131953811, ((ool) tolVar).a.b);
            } else {
                w4i1 w4i1Var2 = ((ool) tolVar).a;
                string = u890.j(w4i1Var2.a, str) ? context.getString(2131953812, str3) : context.getString(2131953810, str3, w4i1Var2.b);
            }
        } else if (tolVar.equals(qol.a)) {
            if (zJ) {
                if (ctfVar instanceof btf) {
                    string = context.getString(2131953814);
                } else {
                    if (!(ctfVar instanceof atf)) {
                        eg.o();
                        return null;
                    }
                    if (z) {
                        if (list.isEmpty()) {
                            string = context.getString(2131953814);
                        } else {
                            w4i1 w4i1Var3 = (w4i1) o7h.s0(list);
                            str2 = w4i1Var3 != null ? w4i1Var3.b : null;
                            string = context.getString(2131953799, str2 != null ? str2 : "");
                        }
                    } else if (list.isEmpty()) {
                        string = context.getString(2131953814);
                    } else {
                        w4i1 w4i1Var4 = (w4i1) o7h.s0(list);
                        str2 = w4i1Var4 != null ? w4i1Var4.b : null;
                        string = context.getString(2131953796, str2 != null ? str2 : "");
                    }
                }
            } else if (ctfVar instanceof btf) {
                string = context.getString(2131953813, str3);
            } else {
                if (!(ctfVar instanceof atf)) {
                    eg.o();
                    return null;
                }
                string = z ? context.getString(2131953798, str3) : context.getString(2131953796, str3);
            }
        } else if (tolVar.equals(rol.a)) {
            string = zJ ? context.getString(2131953816) : context.getString(2131953815, str3);
        } else if (tolVar instanceof sol) {
            if (zJ) {
                string = context.getString(2131953818, ((sol) tolVar).a.b);
            } else {
                w4i1 w4i1Var5 = ((sol) tolVar).a;
                string = u890.j(w4i1Var5.a, str) ? context.getString(2131953819, str3) : context.getString(2131953817, str3, w4i1Var5.b);
            }
        } else {
            if (!(tolVar instanceof kol)) {
                eg.o();
                return null;
            }
            idd1 idd1Var = a;
            Calendar calendar = Calendar.getInstance((Locale) idd1Var.getValue());
            calendar.setTimeInMillis(((kol) tolVar).a * 1000);
            string = context.getString(2131953797, DateFormat.getInstanceForSkeleton("yMMMd", (Locale) idd1Var.getValue()).format(calendar.getTime()));
        }
        string.getClass();
        return string;
    }
}
