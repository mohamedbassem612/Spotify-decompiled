package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dpr0 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        wee1[] wee1VarArr = TextUnit.b;
        a = f7p1.k();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    public static final cpr0 a(cpr0 cpr0Var, int i, int i2, long j, u8e1 u8e1Var, edt0 edt0Var, shc0 shc0Var, int i3, int i4, gbe1 gbe1Var) {
        long j2;
        edt0 edt0Var2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        u8e1 u8e1Var2 = u8e1Var;
        edt0 edt0Var3 = edt0Var;
        shc0 shc0Var2 = shc0Var;
        int i7 = i3;
        int i8 = i4;
        gbe1 gbe1Var2 = gbe1Var;
        if (i5 != 0) {
            j2 = 0;
            if (i5 == cpr0Var.a) {
            }
            wee1[] wee1VarArr = TextUnit.b;
            if ((j3 & 1095216660480L) == j2) {
                j3 = cpr0Var.c;
            }
            if (u8e1Var2 == null) {
                u8e1Var2 = cpr0Var.d;
            }
            if (i5 == 0) {
                i5 = cpr0Var.a;
            }
            if (z3e1.b(i6, 0)) {
                i6 = cpr0Var.b;
            }
            edt0Var2 = cpr0Var.e;
            if (edt0Var2 != null && edt0Var3 == null) {
                edt0Var3 = edt0Var2;
            }
            if (shc0Var2 == null) {
                shc0Var2 = cpr0Var.f;
            }
            int i9 = mhc0.b;
            cuo1.C();
            if (i7 == 0) {
                i7 = cpr0Var.g;
            }
            if (yf70.b(i8, 0)) {
                i8 = cpr0Var.h;
            }
            if (gbe1Var2 == null) {
                gbe1Var2 = cpr0Var.i;
            }
            return new cpr0(i5, i6, j3, u8e1Var2, edt0Var3, shc0Var2, i7, i8, gbe1Var2);
        }
        j2 = 0;
        wee1[] wee1VarArr2 = TextUnit.b;
        if (((j3 & 1095216660480L) == j2 || TextUnit.a(j3, cpr0Var.c)) && ((u8e1Var2 == null || u8e1Var2.equals(cpr0Var.d)) && ((z3e1.b(i6, 0) || z3e1.b(i6, cpr0Var.b)) && ((edt0Var3 == null || edt0Var3.equals(cpr0Var.e)) && (shc0Var2 == null || shc0Var2.equals(cpr0Var.f)))))) {
            int i10 = mhc0.b;
            cuo1.C();
            if ((i7 == 0 || i7 == cpr0Var.g) && ((yf70.b(i8, 0) || yf70.b(i8, cpr0Var.h)) && (gbe1Var2 == null || gbe1Var2.equals(cpr0Var.i)))) {
                return cpr0Var;
            }
        }
        wee1[] wee1VarArr3 = TextUnit.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = cpr0Var.c;
        }
        if (u8e1Var2 == null) {
            u8e1Var2 = cpr0Var.d;
        }
        if (i5 == 0) {
            i5 = cpr0Var.a;
        }
        if (z3e1.b(i6, 0)) {
            i6 = cpr0Var.b;
        }
        edt0Var2 = cpr0Var.e;
        if (edt0Var2 != null) {
            edt0Var3 = edt0Var2;
        }
        if (shc0Var2 == null) {
            shc0Var2 = cpr0Var.f;
        }
        int i11 = mhc0.b;
        cuo1.C();
        if (i7 == 0) {
            i7 = cpr0Var.g;
        }
        if (yf70.b(i8, 0)) {
            i8 = cpr0Var.h;
        }
        if (gbe1Var2 == null) {
            gbe1Var2 = cpr0Var.i;
        }
        return new cpr0(i5, i6, j3, u8e1Var2, edt0Var3, shc0Var2, i7, i8, gbe1Var2);
    }
}
