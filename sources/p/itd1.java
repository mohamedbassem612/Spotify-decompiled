package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class itd1 extends hab0 implements xu30 {
    public final /* synthetic */ wat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ zma1 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ yae1 g;
    public final /* synthetic */ zma1 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itd1(wat watVar, String str, String str2, lee1 lee1Var, zma1 zma1Var, long j, yae1 yae1Var, zma1 zma1Var2, long j2) {
        super(3);
        this.a = watVar;
        this.b = str;
        this.c = str2;
        this.d = lee1Var;
        this.e = zma1Var;
        this.f = j;
        this.g = yae1Var;
        this.h = zma1Var2;
        this.i = j2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        int iI0 = this.a.i0(((i2c) obj).d());
        x340 x340Var = (b0k) obj2;
        String str = this.b;
        boolean zG = x340Var.g(str);
        String str2 = this.c;
        boolean zG2 = zG | x340Var.g(str2) | x340Var.e(iI0);
        lee1 lee1Var = this.d;
        boolean zG3 = zG2 | x340Var.g(lee1Var);
        zma1 zma1Var = this.e;
        boolean zG4 = zG3 | x340Var.g(zma1Var) | x340Var.f(this.f) | x340Var.g(this.g);
        Object objT = x340Var.T();
        boolean z = false;
        if (zG4 || objT == m4cVar) {
            if (ihc1.h0(str, "\u0000", false)) {
                af5 af5VarP = i1p1.p(str, str2, zma1Var);
                if (iI0 <= 0) {
                    objT = str2;
                } else {
                    long j = this.f;
                    yae1 yae1Var = this.g;
                    if (i1p1.t(lee1Var, j, iI0, yae1Var, af5VarP)) {
                        objT = str2;
                    } else {
                        ArrayList arrayListO = p7h.O(new Integer[]{0});
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.forLanguageTag(upn1.p()));
                        characterInstance.setText(str2);
                        while (true) {
                            int next = characterInstance.next();
                            if (next == -1) {
                                break;
                            }
                            arrayListO.add(Integer.valueOf(next));
                        }
                        if (arrayListO.size() == 1) {
                            objT = str2;
                        } else {
                            int iL = p7h.L(arrayListO);
                            String strE = f4i1.e(ihc1.f1(str2.substring(0, ((Number) arrayListO.get(1)).intValue())).toString(), "…");
                            int i = iL;
                            int i2 = 1;
                            while (i2 <= i) {
                                int i3 = i;
                                int i4 = (i2 + i) / 2;
                                ArrayList arrayList = arrayListO;
                                String strE2 = f4i1.e(ihc1.f1(str2.substring(0, ((Number) arrayListO.get(i4)).intValue())).toString(), "…");
                                int i5 = i2;
                                if (i1p1.t(lee1Var, j, iI0, yae1Var, i1p1.p(str, strE2, zma1Var))) {
                                    i2 = i4 + 1;
                                    strE = strE2;
                                    i = i3;
                                } else {
                                    i = i4 - 1;
                                    i2 = i5;
                                }
                                arrayListO = arrayList;
                            }
                            objT = strE;
                        }
                    }
                }
            } else {
                objT = str2;
            }
            z = false;
            x340Var.s0(objT);
        }
        af5 af5VarP2 = i1p1.p(str, (String) objT, this.h);
        boolean z2 = z;
        lee1 lee1VarA = lee1.a(lee1Var, this.i, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
        boolean zG5 = x340Var.g(str) | x340Var.g("\u0000") | x340Var.g(str2);
        Object objT2 = x340Var.T();
        if (zG5 || objT2 == m4cVar) {
            objT2 = new ec21(str, str2, (byte) 6);
            x340Var.s0(objT2);
        }
        uwo1.d(af5VarP2, this.i, s161.b(nim0.a, z2, (iu30) objT2), lee1VarA, null, null, 2, false, new cjc0(3), 0, new px8(this.f, lee1VarA.a.b, 0L, (mx8) null, 12), null, x340Var, 0, 8, 2736);
        return rih1.a;
    }
}
