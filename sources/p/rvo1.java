package p;

import com.google.android.recaptcha.internal.zzhm;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rvo1 {
    public final zwo1 a;
    public final Integer b;
    public final long c;
    public final int d;

    public rvo1(zwo1 zwo1Var, int i, Integer num) {
        this.a = zwo1Var;
        this.d = i;
        this.b = num;
        long jCurrentTimeMillis = System.currentTimeMillis();
        akn1 akn1VarB = hkn1.b((int) ((jCurrentTimeMillis % 1000) * 1000000), jCurrentTimeMillis / 1000);
        hkn1.a(akn1VarB);
        long jX = akn1VarB.x();
        int iY = akn1VarB.y();
        ((SimpleDateFormat) hkn1.a.get()).format(new Date(jX * 1000));
        if (iY != 0) {
            if (iY % 1000000 == 0) {
                String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iY / 1000000));
            } else if (iY % 1000 == 0) {
                String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iY / 1000));
            } else {
                String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iY));
            }
        }
        this.c = System.currentTimeMillis();
    }

    public final zwo1 a() {
        return this.a;
    }

    public final void b(zzhm zzhmVar) {
        int i;
        ukn1 ukn1VarX = vkn1.x();
        String strValueOf = String.valueOf((int) zzhmVar.a.a);
        ukn1VarX.d();
        ((vkn1) ukn1VarX.b).y(strValueOf);
        int i2 = zzhmVar.b.b;
        ukn1VarX.d();
        ((vkn1) ukn1VarX.b).z(i2);
        switch (zzhmVar.c().a) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 100;
                break;
            default:
                throw null;
        }
        ukn1VarX.d();
        ((vkn1) ukn1VarX.b).B(i);
        String str = zzhmVar.c;
        if (str != null) {
            ukn1VarX.d();
            ((vkn1) ukn1VarX.b).A(str);
        }
        this.a.c(c(4), (vkn1) ukn1VarX.e());
    }

    public final zkn1 c(int i) {
        zkn1 zkn1VarD = aln1.D();
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).y(this.d);
        String str = yuo1.d;
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).F(str);
        zwo1 zwo1Var = this.a;
        String str2 = zwo1Var.d;
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).H(str2);
        swo1 swo1Var = zwo1Var.c;
        String str3 = swo1Var.d;
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).G(str3);
        int i2 = swo1Var.e;
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).z(i2);
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).A(i);
        long j = this.c;
        akn1 akn1VarB = hkn1.b((int) ((j % 1000) * 1000000), j / 1000);
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).L(akn1VarB);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        gin1 gin1VarB = gkn1.b((int) ((jCurrentTimeMillis % 1000) * 1000000), jCurrentTimeMillis / 1000);
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).I(gin1VarB);
        Integer num = this.b;
        if (num != null) {
            int iIntValue = num.intValue();
            zkn1VarD.d();
            ((aln1) zkn1VarD.b).N(iIntValue);
        }
        long j2 = zwo1Var.e;
        zkn1VarD.d();
        ((aln1) zkn1VarD.b).O(j2);
        return zkn1VarD;
    }
}
