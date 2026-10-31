package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class une implements zg70 {
    public final q8a a;
    public final ArrayList b = new ArrayList();

    public une(q8a q8aVar) {
        this.a = q8aVar;
    }

    public static float d(ArrayList arrayList, float f, int i) {
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i960 i960Var = (i960) arrayList.get(i2);
            if (i960Var.f == i) {
                float fAbs = Math.abs(i960Var.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }

    @Override // p.zg70
    public i960 a(float f, float f2) {
        q8a q8aVar;
        float f3;
        rzy rzyVarB;
        q8a q8aVar2 = this.a;
        vi11 vi11Var = q8aVar2.y1;
        vi11Var.getClass();
        cuf0 cuf0Var = (cuf0) cuf0.d.b();
        cuf0Var.b = 0.0d;
        cuf0Var.c = 0.0d;
        vi11Var.x(f, f2, cuf0Var);
        float f4 = (float) cuf0Var.b;
        cuf0.b(cuf0Var);
        ArrayList arrayList = this.b;
        arrayList.clear();
        z8a z8aVarB = b();
        char c = 1;
        if (z8aVarB != null) {
            int iC = z8aVarB.c();
            int i = 0;
            while (i < iC) {
                rg70 rg70VarB = z8aVarB.b(i);
                if (((u8a) rg70VarB).e) {
                    ArrayList arrayList2 = new ArrayList();
                    u8a u8aVar = (u8a) rg70VarB;
                    ArrayList<rzy> arrayListA = u8aVar.a(f4);
                    if (arrayListA.size() == 0 && (rzyVarB = u8aVar.b(f4, Float.NaN)) != null) {
                        arrayListA = u8aVar.a(rzyVarB.c);
                    }
                    if (arrayListA.size() != 0) {
                        for (rzy rzyVar : arrayListA) {
                            vi11 vi11VarF = q8aVar2.f(u8aVar.d);
                            float f5 = rzyVar.c;
                            float fA = rzyVar.a();
                            float[] fArr = (float[]) vi11VarF.f;
                            fArr[0] = f5;
                            fArr[c] = fA;
                            vi11VarF.I(fArr);
                            double d = fArr[0];
                            double d2 = fArr[c];
                            q8a q8aVar3 = q8aVar2;
                            cuf0 cuf0Var2 = (cuf0) cuf0.d.b();
                            cuf0Var2.b = d;
                            cuf0Var2.c = d2;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new i960(rzyVar.c, rzyVar.a(), (float) cuf0Var2.b, (float) cuf0Var2.c, i, u8aVar.d));
                            u8aVar = u8aVar;
                            arrayList2 = arrayList3;
                            q8aVar2 = q8aVar3;
                            f4 = f4;
                            c = 1;
                        }
                    }
                    q8aVar = q8aVar2;
                    f3 = f4;
                    arrayList.addAll(arrayList2);
                } else {
                    q8aVar = q8aVar2;
                    f3 = f4;
                }
                i++;
                q8aVar2 = q8aVar;
                f4 = f3;
                c = 1;
            }
        }
        q8a q8aVar4 = q8aVar2;
        i960 i960Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int i2 = d(arrayList, f2, 1) < d(arrayList, f2, 2) ? 1 : 2;
        float maxHighlightDistance = q8aVar4.getMaxHighlightDistance();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i960 i960Var2 = (i960) arrayList.get(i3);
            if (i960Var2.f == i2) {
                float fC = c(f, f2, i960Var2.c, i960Var2.d);
                if (fC < maxHighlightDistance) {
                    i960Var = i960Var2;
                    maxHighlightDistance = fC;
                }
            }
        }
        return i960Var;
    }

    public z8a b() {
        return this.a.getData();
    }

    public float c(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }
}
