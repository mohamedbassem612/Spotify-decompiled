package p;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xn1 implements i570 {
    public final /* synthetic */ byte a;
    public final i8h1 b;
    public final Object c;
    public final Object d;

    public xn1(vu1 vu1Var, i8h1 i8h1Var) {
        this.a = (byte) 0;
        this.d = new brl0((byte) 14);
        this.c = vu1Var;
        this.b = i8h1Var;
    }

    public final void a(j570 j570Var, u570 u570Var) {
        tv80 tv80VarM;
        byte b = this.a;
        Object obj = this.c;
        i8h1 i8h1Var = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                String strB = ((sc70) j570Var).b.c.B("uri");
                if (strB == null) {
                    n57.e("URI for track cannot be null.");
                } else {
                    x6h1 x6h1VarC = ((brl0) obj2).b.c();
                    x6h1VarC.i.add(new a7h1("add_to_playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str = nik1.F1.a;
                    ((vu1) obj).a(Collections.singletonList(strB), "freetiertrack", strB, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null), ay1.a, false);
                }
                break;
            default:
                hl00 hl00Var = (hl00) obj2;
                String strF = ((sc70) j570Var).b.c.F("uri", "");
                if (!TextUtils.isEmpty(strF)) {
                    Iterator it = hl00.j(u570Var).s().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tv80VarM = null;
                        } else if (((String) it.next()).startsWith("ubi:")) {
                            Set set = s4b1.f;
                            tv80VarM = i8h1Var.m(uic.u(strF) ? hl00Var.h(u570Var).s(strF) : hl00Var.h(u570Var).n(strF), (xj61) null);
                        }
                    }
                    lzn0 lzn0Var = (lzn0) obj;
                    if (tv80VarM == null) {
                        lzn0Var.h(strF);
                    } else {
                        lzn0Var.a(strF, tv80VarM, (Bundle) null);
                    }
                }
                break;
        }
    }

    public xn1(lzn0 lzn0Var, hl00 hl00Var, i8h1 i8h1Var) {
        this.a = (byte) 1;
        this.c = lzn0Var;
        this.d = hl00Var;
        this.b = i8h1Var;
    }
}
