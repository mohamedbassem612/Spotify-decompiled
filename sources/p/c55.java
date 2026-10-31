package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c55 implements pdy0 {
    public final a55 a;
    public final b55 b;
    public final luk c;
    public final idd1 d;

    public c55(a55 a55Var, b55 b55Var, luk lukVar) {
        this.a = a55Var;
        this.b = b55Var;
        this.c = lukVar;
        this.d = new idd1(new k25(this, (byte) 28));
    }

    public final a55 a() {
        a55 a55VarA;
        c55 c55Var = (c55) this.d.getValue();
        return (c55Var == null || (a55VarA = c55Var.a()) == null) ? this.a : a55VarA;
    }

    public final b55 b() {
        b55 b55VarB;
        c55 c55Var = (c55) this.d.getValue();
        return (c55Var == null || (b55VarB = c55Var.b()) == null) ? this.b : b55VarB;
    }

    public final List models() {
        String str = a().a;
        a55[] a55VarArrValues = a55.values();
        ArrayList arrayList = new ArrayList(a55VarArrValues.length);
        for (a55 a55Var : a55VarArrValues) {
            arrayList.add(a55Var.a);
        }
        fpb fpbVar = new fpb("chip_fills_background", "android-toolbar", str, arrayList);
        String str2 = b().a;
        b55[] b55VarArrValues = b55.values();
        ArrayList arrayList2 = new ArrayList(b55VarArrValues.length);
        for (b55 b55Var : b55VarArrValues) {
            arrayList2.add(b55Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("chip_fills_contrast", "android-toolbar", str2, arrayList2)});
    }

    public c55(luk lukVar) {
        this(a55.BASE, b55.OFF, lukVar);
    }
}
