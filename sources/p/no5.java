package p;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class no5 {
    public final Context a;

    public String a(kaw0 kaw0Var, ctf ctfVar, String str, ArrayList arrayList) {
        int i;
        String quantityString;
        String string;
        String string2;
        String str2;
        boolean z = kaw0Var instanceof baw0;
        Object obj = null;
        Context context = this.a;
        if (z) {
            baw0 baw0Var = (baw0) kaw0Var;
            w4i1 w4i1Var = baw0Var.b;
            String str3 = baw0Var.c;
            if (ctfVar.equals(atf.a)) {
                return str3;
            }
            if (ctfVar instanceof btf) {
                return context.getString(2131953321, w4i1Var.b, str3);
            }
            eg.o();
            return null;
        }
        int i2 = 0;
        if (!(kaw0Var instanceof gaw0)) {
            if (!(kaw0Var instanceof faw0)) {
                if (kaw0Var instanceof eaw0) {
                    eaw0 eaw0Var = (eaw0) kaw0Var;
                    w4i1 w4i1Var2 = eaw0Var.b;
                    String str4 = eaw0Var.c;
                    if (ctfVar instanceof atf) {
                        return context.getString(2131953344, str4);
                    }
                    if (ctfVar instanceof btf) {
                        return context.getString(2131953329, w4i1Var2.b, str4);
                    }
                    eg.o();
                    return null;
                }
                if (kaw0Var instanceof y9w0) {
                    idd1 idd1Var = r3f.a;
                    y9w0 y9w0Var = (y9w0) kaw0Var;
                    return r3f.a(context, ctfVar, str, y9w0Var.b, arrayList, y9w0Var.c, true);
                }
                if (kaw0Var instanceof caw0) {
                    int iC = l1d.C(((caw0) kaw0Var).c);
                    if (iC == 0) {
                        return context.getString(2131953346);
                    }
                    if (iC == 1) {
                        return context.getString(2131953345);
                    }
                    eg.o();
                    return null;
                }
                if (kaw0Var instanceof daw0) {
                    return context.getString(2131953339);
                }
                if (!(kaw0Var instanceof aaw0)) {
                    if (kaw0Var instanceof iaw0) {
                        return "";
                    }
                    eg.o();
                    return null;
                }
                if (u890.j(((aaw0) kaw0Var).b.a, str)) {
                    String string3 = context.getString(2131953320);
                    string3.getClass();
                    return string3;
                }
                String string4 = context.getString(2131953319);
                string4.getClass();
                return string4;
            }
            faw0 faw0Var = (faw0) kaw0Var;
            w4i1 w4i1Var3 = faw0Var.b;
            ppl pplVar = faw0Var.c;
            if (pplVar instanceof wol) {
                quantityString = context.getString(2131953349);
            } else if (pplVar instanceof mpl) {
                quantityString = context.getString(2131953350);
            } else {
                if (!(pplVar instanceof ppl)) {
                    eg.o();
                    return null;
                }
                List list = pplVar.b;
                boolean z2 = list instanceof Collection;
                if (z2 && list.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((opl) it.next()).b == 1 && (i = i + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                if (!z2 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((opl) it2.next()).b == 2 && (i2 = i2 + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                quantityString = (i <= 0 || i2 <= 0) ? i > 0 ? context.getResources().getQuantityString(2131820598, i, Integer.valueOf(i)) : context.getResources().getQuantityString(2131820599, i2, Integer.valueOf(i2)) : context.getString(2131953366, context.getResources().getQuantityString(2131820598, i, Integer.valueOf(i)), context.getResources().getQuantityString(2131820599, i2, Integer.valueOf(i2)));
                quantityString.getClass();
            }
            if (ctfVar instanceof atf) {
                return context.getString(2131953352, quantityString);
            }
            if (ctfVar instanceof btf) {
                return context.getString(2131953332, w4i1Var3.b, quantityString);
            }
            eg.o();
            return null;
        }
        gaw0 gaw0Var = (gaw0) kaw0Var;
        w4i1 w4i1Var4 = gaw0Var.b;
        String str5 = gaw0Var.c;
        bpl bplVar = gaw0Var.d;
        vb71 vb71Var = gaw0Var.e;
        String str6 = w4i1Var4.b;
        blc0[] blc0VarArr = nzy.a;
        Set set = s4b1.f;
        blc0[] blc0VarArr2 = nzy.l;
        if (uic.h(str5, (blc0[]) Arrays.copyOf(blc0VarArr2, blc0VarArr2.length)) && !u890.j(w4i1Var4.a, str)) {
            return context.getString(2131953334);
        }
        if (bplVar instanceof bpl) {
            bpl bplVar2 = bplVar;
            String str7 = bplVar2.b;
            i2 = bplVar2.a.length() == 0 ? 1 : 0;
            if (ctfVar instanceof atf) {
                return context.getString(i2 != 0 ? 2131953336 : 2131953335);
            }
            if (!(ctfVar instanceof btf)) {
                eg.o();
                return null;
            }
            if (u890.j(str7, str)) {
                string2 = context.getString(i2 != 0 ? 2131953324 : 2131953322, str6);
            } else {
                for (Object obj2 : arrayList) {
                    if (u890.j(((w4i1) obj2).a, str7)) {
                        obj = obj2;
                        break;
                    }
                }
                w4i1 w4i1Var5 = (w4i1) obj;
                if (w4i1Var5 != null && (str2 = w4i1Var5.b) != null) {
                    str7 = str2;
                }
                string2 = context.getString(i2 != 0 ? 2131953325 : 2131953323, str6, str7);
            }
            string2.getClass();
            return string2;
        }
        if (bplVar instanceof hpl) {
            if (ctfVar instanceof atf) {
                return context.getString(2131953341);
            }
            if (ctfVar instanceof btf) {
                return context.getString(2131953326, str6);
            }
            eg.o();
            return null;
        }
        if (bplVar instanceof jpl) {
            if (ctfVar instanceof atf) {
                return context.getString(2131953343);
            }
            if (ctfVar instanceof btf) {
                return context.getString(2131953328, str6);
            }
            eg.o();
            return null;
        }
        if (bplVar instanceof ipl) {
            if (ctfVar instanceof atf) {
                return context.getString(2131953342);
            }
            if (ctfVar instanceof btf) {
                return context.getString(2131953327, str6);
            }
            eg.o();
            return null;
        }
        if (nzy.g(str5)) {
            string = context.getString(2131953364);
        } else if (nzy.a(str5)) {
            string = context.getString(2131953353);
        } else if (nzy.d(str5)) {
            string = context.getString(2131953360);
        } else if (nzy.f(str5)) {
            string = vb71Var instanceof tb71 ? context.getString(2131953355) : context.getString(2131953361);
        } else if (nzy.c(str5)) {
            string = context.getString(2131953357);
        } else {
            blc0[] blc0VarArr3 = nzy.e;
            if (uic.h(str5, (blc0[]) Arrays.copyOf(blc0VarArr3, blc0VarArr3.length))) {
                string = context.getString(2131953354);
            } else if (nzy.h(str5)) {
                string = context.getString(2131953363);
            } else if (nzy.e(str5)) {
                string = context.getString(2131953362);
            } else {
                blc0[] blc0VarArr4 = nzy.g;
                if (uic.h(str5, (blc0[]) Arrays.copyOf(blc0VarArr4, blc0VarArr4.length))) {
                    string = context.getString(2131953356);
                } else {
                    blc0[] blc0VarArr5 = nzy.m;
                    string = uic.h(str5, (blc0[]) Arrays.copyOf(blc0VarArr5, blc0VarArr5.length)) ? context.getString(2131953359) : context.getString(2131953358);
                }
            }
        }
        if (ctfVar instanceof atf) {
            String string5 = pcf.o(uic.x(str5)) ? context.getString(2131953347) : context.getString(2131953352, string);
            string5.getClass();
            return string5;
        }
        if (ctfVar instanceof btf) {
            return context.getString(2131953332, str6, string);
        }
        eg.o();
        return null;
    }

    public ia00 b(xpw xpwVar, xu30 xu30Var) {
        return qro1.q(n3o1.q(xpwVar), new kk11(this, (byte) 2), new ws31(xu30Var, (byte) 1));
    }

    public Object c() {
        File file = new File(new File(new File(new File(this.a.getFilesDir(), "wearos_assets").getPath()), "streamtmp").getPath());
        file.mkdirs();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        return file;
    }
}
