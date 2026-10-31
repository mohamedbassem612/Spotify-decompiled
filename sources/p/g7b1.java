package p;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g7b1 implements anh0 {
    public final nfa0 a;
    public final ua91 b;
    public final t2j0 c;
    public final o5n d;
    public final yt91 e;
    public final l270 f;
    public final qma g;
    public final ir51 h;
    public final int i;

    public g7b1(nfa0 nfa0Var, ua91 ua91Var, t2j0 t2j0Var, o5n o5nVar, yt91 yt91Var, l270 l270Var, qma qmaVar, ir51 ir51Var, int i) {
        this.a = nfa0Var;
        this.b = ua91Var;
        this.c = t2j0Var;
        this.d = o5nVar;
        this.e = yt91Var;
        this.f = l270Var;
        this.g = qmaVar;
        this.h = ir51Var;
        this.i = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    @Override // p.anh0
    public final qba a(hoh0 hoh0Var, bpa bpaVar, gxu gxuVar, bnh0 bnh0Var, yeg1 yeg1Var) throws NoWhenBranchMatchedException {
        List list;
        ycc1 ycc1VarN;
        List listC;
        List listA;
        boolean z;
        boolean zJ;
        String strW = wqn1.w(hoh0Var.a());
        if (strW == null) {
            strW = "";
        }
        String str = strW;
        String strD = gxuVar != null ? gxuVar.d() : d(str);
        qma qmaVar = this.g;
        boolean zX = j2p1.x(hoh0Var, qmaVar.c);
        ua91 ua91Var = this.b;
        yyp0 yyp0VarB = this.f;
        if (zX) {
            yyp0VarB = yyp0VarB.a(new lma(this.c, ua91Var, hoh0Var.c(), strD)).b(new yug((byte) 3));
        }
        boolean z2 = true;
        ir51 ir51Var = this.h;
        if (ir51Var != null && (hoh0Var instanceof m0u0) && (bnh0Var instanceof r590) && gxuVar == null) {
            m0u0 m0u0Var = (m0u0) hoh0Var;
            String strD2 = m0u0Var.d();
            int iC = l1d.C(this.i);
            if (iC == 0) {
                list = null;
                zJ = false;
            } else if (iC != 1) {
                list = null;
                if (iC == 2) {
                    zJ = u890.j(strD2, "context-player-vodcast");
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    zJ = true;
                }
            } else {
                list = null;
                zJ = u890.j(strD2, "context-player-music-video");
            }
            if (zJ) {
                z2 = true;
                hr51 hr51Var = new hr51(str, ir51Var.a, (r590) bnh0Var, new nsm0(ir51Var), m0u0Var, qmaVar.K1);
                ycc1VarN = new ycc1(hr51Var, hr51Var, (byte) 11);
            }
            koh0 koh0Var = new koh0();
            if (gxuVar != null) {
                listC = gxuVar.c();
            } else {
                listC = list;
            }
            koh0Var.b(listC);
            koh0Var.c(strD);
            yoh0 yoh0VarA = koh0Var.a();
            if (gxuVar != null) {
                listA = gxuVar.a();
            } else {
                listA = list;
            }
            f9v f9vVarB = this.e.b(bnh0Var, 3, listA, hoh0Var.c());
            lls0 lls0Var = new lls0((byte) 9);
            lls0Var.n();
            jg10 jg10Var = new jg10(ycc1VarN.f(), ua91Var, lls0Var, qmaVar.x1, qmaVar.y1);
            sl21 sl21Var = new sl21(this, ycc1VarN, hoh0Var, (byte) 9);
            k2r k2rVarE = ycc1VarN.e();
            Handler handler = new Handler(Looper.getMainLooper());
            if ((hoh0Var instanceof swu) && gxuVar == null) {
                z = false;
            } else {
                z = z2;
            }
            return new f2b1(this.a, hoh0Var, yoh0VarA, k2rVarE, handler, bnh0Var, jg10Var, this.g, f9vVarB, sl21Var, this.d, z);
        }
        list = null;
        ycc1VarN = f4p1.n(yyp0VarB, bpaVar, yeg1Var);
        koh0 koh0Var2 = new koh0();
        if (gxuVar != null) {
            listC = gxuVar.c();
        } else {
            listC = list;
        }
        koh0Var2.b(listC);
        koh0Var2.c(strD);
        yoh0 yoh0VarA2 = koh0Var2.a();
        if (gxuVar != null) {
            listA = gxuVar.a();
        } else {
            listA = list;
        }
        f9v f9vVarB2 = this.e.b(bnh0Var, 3, listA, hoh0Var.c());
        lls0 lls0Var2 = new lls0((byte) 9);
        lls0Var2.n();
        jg10 jg10Var2 = new jg10(ycc1VarN.f(), ua91Var, lls0Var2, qmaVar.x1, qmaVar.y1);
        sl21 sl21Var2 = new sl21(this, ycc1VarN, hoh0Var, (byte) 9);
        k2r k2rVarE2 = ycc1VarN.e();
        Handler handler2 = new Handler(Looper.getMainLooper());
        if (hoh0Var instanceof swu) {
            z = z2;
        } else {
            z = z2;
        }
        return new f2b1(this.a, hoh0Var, yoh0VarA2, k2rVarE2, handler2, bnh0Var, jg10Var2, this.g, f9vVarB2, sl21Var2, this.d, z);
    }

    @Override // p.anh0
    public final String b(hoh0 hoh0Var) {
        return d(wqn1.w(hoh0Var.a()));
    }

    @Override // p.anh0
    public final boolean c(hoh0 hoh0Var) {
        return wqn1.y(hoh0Var.a()) && !this.g.f;
    }

    public final String d(String str) {
        String str2 = this.g.a.b;
        if (TextUtils.isEmpty(str2)) {
            eg.m("Unable to create Spotify Manifest url. Manifest url template not found");
            return null;
        }
        String strW = nhc1.W(str2, "{type}", "json");
        str.getClass();
        return nhc1.W(strW, "{source_id}", str);
    }

    @Override // p.anh0
    public final int getType() {
        return 5;
    }
}
