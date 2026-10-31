package p;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hrl1 implements View.OnApplyWindowInsetsListener {
    public final jme a;
    public hsl1 b;

    public hrl1(View view, jme jmeVar) {
        hsl1 hsl1VarB;
        this.a = jmeVar;
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(view);
        if (hsl1VarA != null) {
            int i = Build.VERSION.SDK_INT;
            hsl1VarB = (i >= 36 ? new url1(hsl1VarA) : i >= 35 ? new trl1(hsl1VarA) : i >= 34 ? new srl1(hsl1VarA) : i >= 31 ? new rrl1(hsl1VarA) : i >= 30 ? new qrl1(hsl1VarA) : i >= 29 ? new prl1(hsl1VarA) : new nrl1(hsl1VarA)).b();
        } else {
            hsl1VarB = null;
        }
        this.b = hsl1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k6f0 k6f0Var;
        if (!view.isLaidOut()) {
            this.b = hsl1.g(view, windowInsets);
            return irl1.j(view, windowInsets);
        }
        hsl1 hsl1VarG = hsl1.g(view, windowInsets);
        esl1 esl1Var = hsl1VarG.a;
        hsl1 hsl1VarA = this.b;
        if (hsl1VarA == null) {
            WeakHashMap weakHashMap = b8k1.a;
            hsl1VarA = s7k1.a(view);
            this.b = hsl1VarA;
        }
        if (hsl1VarA == null) {
            this.b = hsl1VarG;
            return irl1.j(view, windowInsets);
        }
        jme jmeVarK = irl1.k(view);
        if (jmeVarK != null && Objects.equals((hsl1) jmeVarK.b, hsl1VarG)) {
            return irl1.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        hsl1 hsl1Var = this.b;
        int i = 1;
        while (i <= 512) {
            nk80 nk80VarI = esl1Var.i(i);
            nk80 nk80VarI2 = hsl1Var.a.i(i);
            int i2 = nk80VarI.a;
            int i3 = nk80VarI.d;
            int i4 = nk80VarI.c;
            int i5 = nk80VarI.b;
            int i6 = nk80VarI2.a;
            int i7 = nk80VarI2.d;
            int i8 = nk80VarI2.c;
            int i9 = nk80VarI2.b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = hsl1VarG;
            return irl1.j(view, windowInsets);
        }
        hsl1 hsl1Var2 = this.b;
        if ((i10 & 8) != 0) {
            k6f0Var = irl1.e;
        } else if ((i11 & 8) != 0) {
            k6f0Var = irl1.f;
        } else if ((i10 & 519) != 0) {
            k6f0Var = irl1.g;
        } else {
            k6f0Var = (i11 & 519) != 0 ? irl1.h : null;
        }
        mrl1 mrl1Var = new mrl1(i12, k6f0Var, (i12 & 8) != 0 ? 160L : 250L);
        mrl1Var.f(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(mrl1Var.a.b());
        nk80 nk80VarI3 = esl1Var.i(i12);
        nk80 nk80VarI4 = hsl1Var2.a.i(i12);
        int iMin = Math.min(nk80VarI3.a, nk80VarI4.a);
        int i13 = nk80VarI3.b;
        int i14 = nk80VarI4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = nk80VarI3.c;
        int i16 = nk80VarI4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = nk80VarI3.d;
        int i18 = nk80VarI4.d;
        frl1 frl1Var = new frl1(nk80.c(iMin, iMin2, iMin3, Math.min(i17, i18)), nk80.c(Math.max(nk80VarI3.a, nk80VarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 0);
        irl1.g(view, mrl1Var, hsl1VarG, false);
        duration.addUpdateListener(new grl1(mrl1Var, hsl1VarG, hsl1Var2, i12, view));
        duration.addListener(new oqr(mrl1Var, view, (byte) 7));
        aiq0.a(view, new hw9(view, mrl1Var, frl1Var, duration, (byte) 16));
        this.b = hsl1VarG;
        return irl1.j(view, windowInsets);
    }
}
