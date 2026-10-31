package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class olf0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ tob1 O0;
    public final /* synthetic */ int X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ bmf0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tob1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ lee1 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olf0(bmf0 bmf0Var, boolean z, boolean z2, ven0 ven0Var, boolean z3, tob1 tob1Var, boolean z4, iu30 iu30Var, lee1 lee1Var, boolean z5, int i, tob1 tob1Var2, boolean z6, Function0 function0, tob1 tob1Var3) {
        super(2);
        this.a = bmf0Var;
        this.b = z;
        this.c = z2;
        this.d = ven0Var;
        this.e = z3;
        this.f = tob1Var;
        this.g = z4;
        this.h = iu30Var;
        this.i = lee1Var;
        this.t = z5;
        this.X = i;
        this.Y = tob1Var2;
        this.Z = z6;
        this.N0 = function0;
        this.O0 = tob1Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0VarX;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = fkj0.X;
        bmf0 bmf0Var = this.a;
        int i = bmf0Var.d;
        String str = bmf0Var.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x340Var2.i0(-445691180);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("#LyricsLineTag", nim0Var);
            boolean zG = x340Var2.g(bmf0Var);
            boolean z = this.b;
            boolean zH = zG | x340Var2.h(z);
            Object objT = x340Var2.T();
            if (zH || objT == obj3) {
                objT = new cb8(bmf0Var, z, (byte) 15);
                x340Var2.s0(objT);
            }
            qim0 qim0VarF = u291.f(s161.b(qim0VarN, false, (iu30) objT), 1.0f);
            tob1 tob1Var = this.f;
            boolean z2 = this.c;
            if (z2) {
                if (this.Z) {
                    x340Var2.i0(-479117782);
                    qim0VarX = j9k1.x(nim0Var, new h6a0(this.N0, (flb0) x340Var2.k(t4k.n), (byte) 20));
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-479028564);
                    qim0VarX = j9k1.x(nim0Var, new ye6(((Number) tob1Var.getValue()).floatValue(), (flb0) x340Var2.k(t4k.n), (byte) 4));
                    x340Var2.r(false);
                }
                qim0VarF = qim0VarF.then(qim0VarX);
            }
            qim0 qim0Var = qim0VarF;
            x340Var2.r(false);
            ven0 ven0Var = this.d;
            y9e1 y9e1Var = (y9e1) ven0Var.getValue();
            boolean zG2 = x340Var2.g(tob1Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == obj3) {
                objT2 = new bu2(tob1Var, (byte) 9);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean zG3 = x340Var2.g(bmf0Var);
            iu30 iu30Var = this.h;
            boolean zG4 = zG3 | x340Var2.g(iu30Var);
            Object objT3 = x340Var2.T();
            if (zG4 || objT3 == obj3) {
                objT3 = new nlf0(bmf0Var, iu30Var);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarD = o0c.d(fae1.C(qim0Var, y9e1Var, this.e, function0, this.g, (iu30) objT3), irn1.l0(0.0f, 1000.0f, (Object) null, 5), 2);
            long j = this.i.a.b;
            float fFloatValue = ((Number) this.O0.getValue()).floatValue();
            fc11.o(j);
            lee1 lee1VarA = lee1.a(this.i, u7h.k, fc11.Y(TextUnit.c(j) * fFloatValue, 1095216660480L & j), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777212);
            boolean z3 = this.e;
            boolean zH2 = x340Var2.h(z3);
            Object objT4 = x340Var2.T();
            if (zH2 || objT4 == obj3) {
                objT4 = new mlf0(z3, ven0Var, (byte) 0);
                x340Var2.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            boolean z4 = this.t;
            tob1 tob1Var2 = this.Y;
            int i2 = this.X;
            if (z4) {
                x340Var2.i0(-930327780);
                boolean zG5 = x340Var2.g(str) | x340Var2.e(i2) | x340Var2.f(bmf0Var.h);
                Object objT5 = x340Var2.T();
                if (zG5 || objT5 == obj3) {
                    long j2 = bmf0Var.h;
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    sb.append(str);
                    int iP = yoi1.p(i2, 0, str.length());
                    if (iP < str.length()) {
                        arrayListM.add(new xe5(iP, str.length(), 8, new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), (String) null));
                    }
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int size = arrayListM.size();
                    for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                    }
                    objT5 = new af5(string, arrayList);
                    x340Var2.s0(objT5);
                }
                af5 af5Var = (af5) objT5;
                boolean zH3 = x340Var2.h(z2) | x340Var2.g(tob1Var2) | x340Var2.g(bmf0Var);
                Object objT6 = x340Var2.T();
                if (zH3 || objT6 == obj3) {
                    objT6 = new llf0(z2, tob1Var2, bmf0Var);
                    x340Var2.s0(objT6);
                }
                uwo1.f(af5Var, qim0VarD, lee1VarA, (x9h) objT6, new a0e1(i), iu30Var2, 2, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 1572864, 0, 3968);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-929745445);
                ye5 ye5Var = new ye5();
                ye5Var.g(str);
                int iP2 = yoi1.p(i2, 0, str.length());
                ye5Var.d(new zma1(z2 ? ((u7h) tob1Var2.getValue()).a : bmf0Var.i, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), 0, iP2);
                ye5Var.d(new zma1(bmf0Var.h, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iP2, str.length());
                uwo1.f(ye5Var.p(), qim0VarD, lee1VarA, (x9h) null, new a0e1(i), iu30Var2, 2, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 1572864, 0, 3976);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
