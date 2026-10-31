package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class vua0 {
    public static final ye90 a = ye90.m(new String[]{"k"});

    public static ArrayList a(eha0 eha0Var, fcf0 fcf0Var, float f, usi1 usi1Var, boolean z) {
        eha0 eha0Var2;
        fcf0 fcf0Var2;
        float f2;
        usi1 usi1Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (eha0Var.o() == 6) {
            fcf0Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        eha0Var.c();
        while (eha0Var.g()) {
            if (eha0Var.q(a) != 0) {
                eha0Var.v();
            } else if (eha0Var.o() == 1) {
                eha0Var.a();
                if (eha0Var.o() == 7) {
                    eha0 eha0Var3 = eha0Var;
                    fcf0 fcf0Var3 = fcf0Var;
                    float f3 = f;
                    usi1 usi1Var3 = usi1Var;
                    boolean z3 = z;
                    sua0 sua0VarB = uua0.b(eha0Var3, fcf0Var3, f3, usi1Var3, false, z3);
                    eha0Var2 = eha0Var3;
                    fcf0Var2 = fcf0Var3;
                    f2 = f3;
                    usi1Var2 = usi1Var3;
                    z2 = z3;
                    arrayList.add(sua0VarB);
                } else {
                    eha0Var2 = eha0Var;
                    fcf0Var2 = fcf0Var;
                    f2 = f;
                    usi1Var2 = usi1Var;
                    z2 = z;
                    while (eha0Var2.g()) {
                        arrayList.add(uua0.b(eha0Var2, fcf0Var2, f2, usi1Var2, true, z2));
                    }
                }
                eha0Var2.d();
                eha0Var = eha0Var2;
                fcf0Var = fcf0Var2;
                f = f2;
                usi1Var = usi1Var2;
                z = z2;
            } else {
                eha0 eha0Var4 = eha0Var;
                arrayList.add(uua0.b(eha0Var4, fcf0Var, f, usi1Var, false, z));
                eha0Var = eha0Var4;
            }
        }
        eha0Var.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            sua0 sua0Var = (sua0) arrayList.get(i2);
            i2++;
            sua0 sua0Var2 = (sua0) arrayList.get(i2);
            sua0Var.h = Float.valueOf(sua0Var2.g);
            if (sua0Var.c == null && (obj = sua0Var2.b) != null) {
                sua0Var.c = obj;
                if (sua0Var instanceof y8s0) {
                    ((y8s0) sua0Var).d();
                }
            }
        }
        sua0 sua0Var3 = (sua0) arrayList.get(i);
        if ((sua0Var3.b == null || sua0Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(sua0Var3);
        }
    }
}
