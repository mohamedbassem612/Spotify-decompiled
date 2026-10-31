package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xcd {
    public final r630 a;
    public final f971 b;
    public final jl21 c;
    public final dc31 d;
    public final oh41 e;
    public final d7b f;
    public final igh1 g;
    public final i4q h;
    public final cex0 i;
    public final sbi1 j;
    public final xy91 k;
    public final gdx0 l;
    public final kbd m;
    public final mr20 n;

    public xcd(r630 r630Var, f971 f971Var, jl21 jl21Var, dc31 dc31Var, oh41 oh41Var, d7b d7bVar, igh1 igh1Var, i4q i4qVar, cex0 cex0Var, sbi1 sbi1Var, xy91 xy91Var, gdx0 gdx0Var, kbd kbdVar, mr20 mr20Var) {
        this.a = r630Var;
        this.b = f971Var;
        this.c = jl21Var;
        this.d = dc31Var;
        this.e = oh41Var;
        this.f = d7bVar;
        this.g = igh1Var;
        this.h = i4qVar;
        this.i = cex0Var;
        this.j = sbi1Var;
        this.k = xy91Var;
        this.l = gdx0Var;
        this.m = kbdVar;
        this.n = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, w4i1 w4i1Var, onm onmVar) {
        vcd vcdVar;
        String str2;
        w4i1 w4i1Var2;
        Object objI;
        String str3;
        boolean z;
        String str4;
        w4i1 w4i1Var3;
        xy91 xy91Var;
        String strZ;
        String str5;
        Object objB;
        if (onmVar instanceof vcd) {
            vcdVar = (vcd) onmVar;
            int i = vcdVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vcdVar.h = i - Integer.MIN_VALUE;
            } else {
                vcdVar = new vcd(this, onmVar);
            }
        } else {
            vcdVar = new vcd(this, onmVar);
        }
        Object obj = vcdVar.f;
        int i2 = vcdVar.h;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.l.a.p()) {
                return null;
            }
            str2 = str;
            vcdVar.a = str2;
            w4i1Var2 = w4i1Var;
            vcdVar.b = w4i1Var2;
            vcdVar.h = 1;
            objI = b5p1.i(this.n, vcdVar);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            w4i1Var2 = vcdVar.b;
            String str6 = vcdVar.a;
            hm5.M(obj);
            objI = obj;
            str2 = str6;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = vcdVar.e;
            xy91Var = vcdVar.d;
            str3 = vcdVar.c;
            w4i1Var3 = vcdVar.b;
            str4 = vcdVar.a;
            hm5.M(obj);
            z = z2;
        }
        String str7 = str3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str8 = w4i1Var3.a;
        Set set = s4b1.f;
        strZ = uic.C(str8, (String) null).z();
        if (strZ == null) {
            str5 = str4;
        } else {
            str5 = strZ;
        }
        qy91 qy91Var = new qy91(str8, str5, str7, w4i1Var3.c, w4i1Var3.b, z, zBooleanValue, true);
        vcdVar.a = null;
        vcdVar.b = null;
        vcdVar.c = null;
        vcdVar.d = null;
        vcdVar.h = 3;
        objB = xy91Var.b(qy91Var, vcdVar);
        if (objB != d9nVar) {
            return d9nVar;
        }
        return objB;
        str3 = ((th61) objI).a;
        boolean zJ = u890.j(w4i1Var2.a, str3);
        mr20 mr20VarB = this.m.b();
        vcdVar.a = str2;
        vcdVar.b = w4i1Var2;
        vcdVar.c = str3;
        xy91 xy91Var2 = this.k;
        vcdVar.d = xy91Var2;
        vcdVar.e = zJ;
        vcdVar.h = 2;
        Object objI2 = b5p1.i(mr20VarB, vcdVar);
        if (objI2 != d9nVar) {
            z = zJ;
            str4 = str2;
            obj = objI2;
            w4i1Var3 = w4i1Var2;
            xy91Var = xy91Var2;
            String str9 = str3;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            String str10 = w4i1Var3.a;
            Set set2 = s4b1.f;
            strZ = uic.C(str10, (String) null).z();
            if (strZ == null) {
                str5 = str4;
            } else {
                str5 = strZ;
            }
            qy91 qy91Var2 = new qy91(str10, str5, str9, w4i1Var3.c, w4i1Var3.b, z, zBooleanValue2, true);
            vcdVar.a = null;
            vcdVar.b = null;
            vcdVar.c = null;
            vcdVar.d = null;
            vcdVar.h = 3;
            objB = xy91Var.b(qy91Var2, vcdVar);
            if (objB != d9nVar) {
                return objB;
            }
        }
        return d9nVar;
    }

    public final void b(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        aji1 aji1Var = s4b1VarX.d;
        aji1 aji1Var2 = aji1Var instanceof aji1 ? aji1Var : null;
        String strS = s4b1VarX.s();
        if (strS == null && aji1Var2 == null) {
            return;
        }
        lik1 lik1Var = new lik1(str2);
        mfm mfmVarA = this.h.a(lik1Var);
        Observable observableL = anm1.L(o6x.a, new wcd(strS, this, aji1Var2, str, nk51Var, lik1Var, null));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableL, yon1.d1(), new bjm(4, str, str2), tv80Var, 16);
    }
}
