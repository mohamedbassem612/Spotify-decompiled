package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g980 extends f8x0 {
    public static final /* synthetic */ int X0 = 0;
    public static final /* synthetic */ int Y0 = 0;
    public static final /* synthetic */ int Z0 = 0;
    public final /* synthetic */ byte U0 = 0;
    public final Object V0;
    public final Object W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g980(i8x0 i8x0Var, nwr nwrVar) {
        super((ConstraintLayout) ((s880) nwrVar.c).b);
        this.W0 = i8x0Var;
        this.V0 = nwrVar;
    }

    @Override // p.f8x0
    public final void E(obx0 obx0Var, int i) {
        byte b = this.U0;
        Object obj = this.V0;
        switch (b) {
            case 0:
                dtw dtwVar = (dtw) obj;
                Set set = s4b1.f;
                String str = obx0Var.b;
                String strS = uic.x(str).s();
                if (strS != null) {
                    String str2 = obx0Var.b;
                    String str3 = obx0Var.c;
                    String str4 = str3.length() == 0 ? strS : str3;
                    String str5 = obx0Var.d;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = obx0Var.e;
                    f980 f980Var = new f980(str2, str4, str6, str7 == null ? "" : str7, strS, obx0Var.Y, new lg60(this, obx0Var, i, (byte) 5));
                    joa0 joa0Var = new joa0(str);
                    tka0 tka0Var = dtw.C;
                    dtwVar.k(f980Var, joa0Var, (vu30) null);
                    ha71.C(dtwVar, i);
                    break;
                }
                break;
            case 1:
                dtw dtwVar2 = (dtw) obj;
                Set set2 = s4b1.f;
                String str8 = obx0Var.b;
                String strS2 = uic.x(str8).s();
                String str9 = strS2 == null ? "" : strS2;
                String str10 = obx0Var.b;
                String str11 = obx0Var.c;
                String str12 = str11.length() == 0 ? str9 : str11;
                String str13 = obx0Var.d;
                String str14 = str13 == null ? "" : str13;
                String str15 = obx0Var.e;
                qe90 qe90Var = new qe90(str10, str12, str14, str15 == null ? "" : str15, str9, new lg60(this, obx0Var, i, (byte) 7));
                joa0 joa0Var2 = new joa0(str8);
                tka0 tka0Var2 = dtw.C;
                dtwVar2.k(qe90Var, joa0Var2, (vu30) null);
                ha71.C(dtwVar2, i);
                break;
            case 2:
                i8x0 i8x0Var = (i8x0) this.W0;
                nwr nwrVar = (nwr) obj;
                String str16 = obx0Var.c;
                String str17 = obx0Var.e;
                String str18 = str17 == null ? "" : str17;
                Set set3 = s4b1.f;
                String strS3 = uic.x(obx0Var.b).s();
                bjs0 bjs0Var = new bjs0(str16, (String) null, str18, strS3 == null ? "" : strS3, false, (bro1) wis0.b, 82);
                nwrVar.n(new gu2(i8x0Var, obx0Var, i, (byte) 25));
                nwrVar.f(bjs0Var);
                break;
            default:
                dtw dtwVar3 = (dtw) obj;
                Set set4 = s4b1.f;
                String str19 = obx0Var.b;
                String strS4 = uic.x(str19).s();
                String str20 = strS4 == null ? "" : strS4;
                kbx0 kbx0Var = (kbx0) obx0Var.a;
                String str21 = obx0Var.b;
                String str22 = obx0Var.c;
                String str23 = str22.length() == 0 ? str20 : str22;
                String str24 = obx0Var.d;
                String str25 = str24 == null ? "" : str24;
                String str26 = obx0Var.e;
                htc1 htc1Var = new htc1(str21, str23, str25, str26 == null ? "" : str26, str20, obx0Var.Y, kbx0Var.a, new heb1(this, obx0Var, i, (byte) 11));
                joa0 joa0Var3 = new joa0(str19);
                tka0 tka0Var3 = dtw.C;
                dtwVar3.k(htc1Var, joa0Var3, (vu30) null);
                ha71.C(dtwVar3, i);
                break;
        }
    }

    public g980(dtw dtwVar, h8x0 h8x0Var, byte b) {
        super(dtwVar.w);
        this.V0 = dtwVar;
        this.W0 = h8x0Var;
    }

    public g980(dtw dtwVar, h8x0 h8x0Var, char c) {
        super(dtwVar.w);
        this.V0 = dtwVar;
        this.W0 = h8x0Var;
    }

    public g980(dtw dtwVar, h8x0 h8x0Var) {
        super(dtwVar.w);
        this.V0 = dtwVar;
        this.W0 = h8x0Var;
    }
}
