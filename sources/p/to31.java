package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class to31 implements aim0 {
    public final /* synthetic */ byte a;
    public final fab0 b;
    public final td41 c;
    public final Object d;
    public final ab20 e;
    public final evm1 f;
    public final Parcelable g;

    public to31(fab0 fab0Var, td41 td41Var, g3t0 g3t0Var, ab20 ab20Var, evm1 evm1Var, rvm1 rvm1Var) {
        this.a = (byte) 1;
        this.b = fab0Var;
        this.c = td41Var;
        this.d = g3t0Var;
        this.e = ab20Var;
        this.f = evm1Var;
        this.g = rvm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    public final Object invoke() {
        mml mmlVar;
        String strF;
        byte b = this.a;
        j230 j230Var = this.g;
        Object obj = this.d;
        ab20 ab20Var = this.e;
        td41 td41Var = this.c;
        evm1 evm1Var = this.f;
        switch (b) {
            case 0:
                List listA = ab20Var.a();
                int iU = evm1Var.u();
                as3 as3VarC = td41Var.c();
                g3t0 g3t0Var = (g3t0) obj;
                rvm1 rvm1Var = (rvm1) j230Var;
                String str = rvm1Var.c;
                nu71 nu71Var = g3t0Var.a;
                a3t0 a3t0VarB = g3t0Var.b(nu71Var.a(str).e(g3t0.d, (String) null));
                boolean zH = g3t0Var.b.a.k() ? nu71Var.a(str).h(g3t0.c, true) : false;
                int iV = evm1Var.v();
                jml jmlVar = jml.a;
                return iqo1.s(b6p1.o(b4x0.b(this.b, jmlVar, iU, listA, td41Var.d(jmlVar, listA), as3VarC, a3t0VarB, zH, iV, null, td41Var.a(jmlVar, listA), 1536), rvm1Var.f), (List) null);
            case 1:
                g3t0 g3t0Var2 = (g3t0) obj;
                nu71 nu71Var2 = g3t0Var2.a;
                rvm1 rvm1Var2 = (rvm1) j230Var;
                String str2 = rvm1Var2.c;
                List listA2 = ab20Var.a();
                if (za20.a[ab20Var.c.c.ordinal()] == 1) {
                    w0t w0tVar = ab20Var.a;
                    String str3 = ab20Var.b;
                    a820 a820Var = w0tVar.a;
                    mmr0 mmr0Var = a820Var.b;
                    mmlVar = (mmr0Var == null || !u890.j(mmr0Var.a, str3)) ? null : (lml) mmr0Var.b;
                    if (mmlVar == null && w0tVar.b()) {
                        String strF2 = w0tVar.a().f(w0t.h);
                        if (strF2 == null || (strF = w0tVar.a().f(w0t.i)) == null) {
                            mmlVar = null;
                        } else {
                            lml lmlVar = new lml(strF2, strF);
                            a820Var.b = new mmr0(str3, lmlVar);
                            mmlVar = lmlVar;
                        }
                    }
                } else {
                    mmlVar = null;
                }
                if (mmlVar == null) {
                    mmlVar = jml.a;
                }
                mml mmlVar2 = mmlVar;
                return iqo1.s(b6p1.o(b4x0.b(this.b, mmlVar2, evm1Var.u(), listA2, td41Var.d(mmlVar2, listA2), td41Var.c(), g3t0Var2.b(nu71Var2.a(str2).e(g3t0.d, (String) null)), g3t0Var2.b.a.k() ? nu71Var2.a(str2).h(g3t0.c, true) : false, evm1Var.v(), null, td41Var.a(mmlVar2, listA2), 1536), rvm1Var2.f), mmlVar2 instanceof jml ? null : z6x.a);
            default:
                List listA3 = ab20Var.a();
                String strF3 = ((s4b1) obj).f();
                if (strF3 != null) {
                    iml imlVar = new iml(strF3, null, j230Var.e);
                    return b4x0.b(this.b, imlVar, evm1Var.u(), listA3, td41Var.d(imlVar, listA3), td41Var.c(), null, false, evm1Var.v(), null, td41Var.a(imlVar, listA3), 1728);
                }
                hhg1.n("Required value was null.");
                return null;
        }
    }

    public /* synthetic */ to31(fab0 fab0Var, ab20 ab20Var, td41 td41Var, Object obj, evm1 evm1Var, Parcelable parcelable, byte b) {
        this.a = b;
        this.b = fab0Var;
        this.e = ab20Var;
        this.c = td41Var;
        this.d = obj;
        this.f = evm1Var;
        this.g = parcelable;
    }
}
