package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rjf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LyricsFullscreenPageActivity b;
    public final /* synthetic */ umf0 c;
    public final /* synthetic */ wjf0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rjf0(LyricsFullscreenPageActivity lyricsFullscreenPageActivity, umf0 umf0Var, wjf0 wjf0Var, byte b) {
        super(2);
        this.a = b;
        this.b = lyricsFullscreenPageActivity;
        this.c = umf0Var;
        this.d = wjf0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wjf0 wjf0Var = this.d;
        umf0 umf0Var = this.c;
        LyricsFullscreenPageActivity lyricsFullscreenPageActivity = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1938435838, new d0e0(lyricsFullscreenPageActivity, umf0Var, wjf0Var), x340Var2), x340Var2, 3078, 6);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = lyricsFullscreenPageActivity.m1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(-1159268821, new rjf0(lyricsFullscreenPageActivity, umf0Var, wjf0Var, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    View view = (View) x340Var6.k(AndroidCompositionLocals_androidKt.f);
                    int i = LyricsFullscreenPageActivity.p1;
                    l6h1 l6h1Var = lyricsFullscreenPageActivity.h1;
                    if (l6h1Var == null) {
                        u890.C("ubiDwellTimeLogger");
                        throw null;
                    }
                    i8h1 i8h1Var = lyricsFullscreenPageActivity.g1;
                    if (i8h1Var == null) {
                        u890.C("ubiLogger");
                        throw null;
                    }
                    n7h1 n7h1Var = lyricsFullscreenPageActivity.i1;
                    if (n7h1Var == null) {
                        u890.C("ubiImpressionLogger");
                        throw null;
                    }
                    op80 eq80Var = new eq80(new e3h1(l6h1Var, n7h1Var, i8h1Var));
                    op80 jp80Var = new jp80(view);
                    op80 wchVar = q6x.b;
                    if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                        eq80Var = wchVar;
                    } else if (!jp80Var.equals(wchVar)) {
                        if (eq80Var.equals(wchVar)) {
                            eq80Var = jp80Var;
                        } else {
                            wchVar = new wch(jp80Var, eq80Var);
                            eq80Var = wchVar;
                        }
                    }
                    xhk1.c(view, eq80Var);
                    qsw.c(new obk1(view), apo.r(807399787, new rjf0(lyricsFullscreenPageActivity, umf0Var, wjf0Var, b2), x340Var6), x340Var6, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
