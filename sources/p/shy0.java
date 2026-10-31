package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class shy0 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final vnr0 a(Paragraph paragraph, b0k b0kVar) throws NoWhenBranchMatchedException {
        hor0 gor0Var;
        lee1 lee1VarA;
        int iU = paragraph.u();
        int i = iU == 0 ? -1 : rhy0.a[l1d.C(iU)];
        cjc0 cjc0Var = bjc0.a;
        int i2 = 1;
        if (i == 1) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1161865439);
            Paragraph.Hero heroP = paragraph.p();
            mmr0 mmr0VarB = ror0.b(heroP.s(), x340Var);
            lee1 lee1Var = (lee1) mmr0VarB.a;
            String str = (String) mmr0VarB.b;
            if (heroP.v()) {
                Paragraph.AutoSize autoSizeN = heroP.n();
                gor0Var = new gor0(autoSizeN.q(), autoSizeN.p(), 8, 0, autoSizeN.n() != 0 ? fc11.G(autoSizeN.n()) : fc11.G(1));
            } else {
                gor0Var = for0.a;
            }
            hor0 hor0Var = gor0Var;
            long jE = ror0.e(u7h.j, heroP.s().w());
            eor0 eor0VarH = ror0.h(heroP.u());
            float fT = heroP.t();
            int iR = heroP.r();
            if (iR != 0) {
                cjc0Var = new cjc0(iR);
            }
            vnr0 vnr0Var = new vnr0(str, lee1Var, new jor0(eor0VarH, hor0Var, (djc0) cjc0Var, heroP.w() ? ror0.c(heroP.o()) : new tnr0(), heroP.x() ? ror0.f(heroP.q()) : null, fT), jE, (a0e1) null);
            x340Var.r(false);
            return vnr0Var;
        }
        if (i == 2) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-1161863615);
            Paragraph.Single singleR = paragraph.r();
            mmr0 mmr0VarB2 = ror0.b(singleR.s(), x340Var2);
            lee1 lee1Var2 = (lee1) mmr0VarB2.a;
            String str2 = (String) mmr0VarB2.b;
            long jE2 = ror0.e(u7h.j, singleR.s().w());
            a0e1 a0e1VarI = ror0.i(singleR.n());
            eor0 eor0VarH2 = ror0.h(singleR.u());
            float fT2 = singleR.t();
            int iR2 = singleR.r();
            if (iR2 != 0) {
                cjc0Var = new cjc0(iR2);
            }
            vnr0 vnr0Var2 = new vnr0(str2, lee1Var2, new jor0(eor0VarH2, (djc0) cjc0Var, singleR.v() ? ror0.c(singleR.o()) : new tnr0(), singleR.w() ? ror0.f(singleR.q()) : null, fT2, 2), jE2, a0e1VarI);
            x340Var2.r(false);
            return vnr0Var2;
        }
        if (i != 3) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-1161860571);
            x340Var3.r(false);
            k220.f("Unrecognized Paragraph type: ".concat(jup0.m(paragraph.u())));
            return null;
        }
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.i0(-1161861840);
        Paragraph.Multi multiQ = paragraph.q();
        wnr0 wnr0VarO = paragraph.o();
        mmr0 mmr0VarB3 = ror0.b(multiQ.t(), x340Var4);
        lee1 lee1Var3 = (lee1) mmr0VarB3.a;
        String str3 = (String) mmr0VarB3.b;
        boolean z = wnr0VarO == wnr0.c;
        Object objK = x340Var4.k(t4k.n);
        flb0 flb0Var = flb0.b;
        ira iraVar = objK == flb0Var ? ira.e : ira.d;
        x340Var4.i0(1568209766);
        h290<Paragraph.TextStyle> h290VarU = multiQ.u();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarU, 10));
        for (Paragraph.TextStyle textStyle : h290VarU) {
            String strG = r5b1.a.g("-\u200b", textStyle.u());
            if (!z) {
                strG = iraVar.e(strG);
            }
            strG.getClass();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new mor0(strG, ror0.g(textStyle, textStyle.u(), textStyle.o(), ror0.j(textStyle), ror0.k(textStyle), x340Var4).a));
            arrayList = arrayList2;
            i2 = i2;
        }
        int i3 = i2;
        ArrayList arrayList3 = arrayList;
        x340Var4.r(false);
        if (z) {
            x340Var4.i0(1568225863);
            x340Var4.r(false);
            lee1VarA = lee1.a(lee1Var3, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
        } else {
            x340Var4.i0(1568227925);
            lee1VarA = lee1.a(lee1Var3, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, x340Var4.k(t4k.n) == flb0Var ? 2 : i3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
            x340Var4.r(false);
        }
        lee1 lee1Var4 = lee1VarA;
        long jE3 = ror0.e(u7h.j, multiQ.t().w());
        a0e1 a0e1VarI2 = ror0.i(multiQ.o());
        int iS = multiQ.s();
        if (iS != 0) {
            cjc0Var = new cjc0(iS);
        }
        vnr0 vnr0Var3 = new vnr0(str3, lee1Var4, new ior0(arrayList3, multiQ.v() ? ror0.c(multiQ.p()) : new tnr0(), multiQ.w() ? ror0.f(multiQ.r()) : null, cjc0Var), jE3, a0e1VarI2);
        x340Var4.r(false);
        return vnr0Var3;
    }
}
