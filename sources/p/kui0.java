package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kui0 implements t1i {
    public final /* synthetic */ byte a;
    public pee0 b;

    public final void k(r1i r1iVar) {
        Object s1w0Var;
        Object d2w0Var;
        boolean z = false;
        int i = 0;
        z = false;
        switch (this.a) {
            case 0:
                lui0 lui0Var = (lui0) r1iVar.d;
                pee0 pee0Var = this.b;
                if (pee0Var != null) {
                    int i2 = lui0Var.a;
                    gui0 gui0Var = (gui0) ((mui0) r1iVar.c).a.get(i2);
                    pee0Var.accept(new t1w0(i2, gui0Var.a, gui0Var.c, null));
                }
                break;
            case 1:
                rzu0 rzu0Var = (rzu0) r1iVar.d;
                pee0 pee0Var2 = this.b;
                if (pee0Var2 != null) {
                    pee0Var2.accept(new w1w0(rzu0Var.a, null));
                }
                break;
            case 2:
                gjd0 gjd0Var = (gjd0) r1iVar.d;
                ljd0 ljd0Var = (ljd0) r1iVar.c;
                String str = ljd0Var.a;
                pee0 pee0Var3 = this.b;
                if (pee0Var3 != null) {
                    if (gjd0Var.equals(ejd0.a)) {
                        s1w0Var = new r1w0(str, null);
                    } else if (!gjd0Var.equals(fjd0.a)) {
                        eg.o();
                    } else {
                        s1w0Var = new s1w0(str, null, ljd0Var.f);
                    }
                    pee0Var3.accept(s1w0Var);
                }
                break;
            case 3:
                hzf1 hzf1Var = (hzf1) r1iVar.d;
                izf1 izf1Var = (izf1) r1iVar.c;
                String str2 = izf1Var.a;
                String str3 = izf1Var.b;
                if (izf1Var.g && izf1Var.h) {
                    z = true;
                }
                pee0 pee0Var4 = this.b;
                if (pee0Var4 != null) {
                    int iOrdinal = hzf1Var.ordinal();
                    if (iOrdinal == 0) {
                        d2w0Var = new d2w0(str2, z);
                    } else if (iOrdinal != 1) {
                        eg.o();
                    } else {
                        d2w0Var = new k1w0(str2, str3);
                    }
                    pee0Var4.accept(d2w0Var);
                }
                break;
            default:
                Object obj = r1iVar.c;
                q3w0 q3w0Var = (q3w0) r1iVar.d;
                pee0 pee0Var5 = this.b;
                if (pee0Var5 != null) {
                    if (!(q3w0Var instanceof q3w0)) {
                        eg.o();
                    } else {
                        List list = ((r3w0) obj).a;
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (!u890.j(((s3w0) it.next()).a, q3w0Var.a.a)) {
                                i++;
                            }
                        }
                        String str4 = ((s3w0) list.get(i)).d.a;
                        String str5 = q3w0Var.a.a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        pee0Var5.accept(new g2w0(i, str5, str4, null));
                    }
                }
                break;
        }
    }
}
