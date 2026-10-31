package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class thm1 {
    public static final void a(WidgetState.WrappedStory wrappedStory, gt40 gt40Var, b0k b0kVar, int i) {
        gt40 gt40Var2;
        j2i j2iVar = nki.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(143861184);
        int i2 = 48 | (x340Var.i(wrappedStory) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = (String) x340Var.k(wol1.a);
            String str2 = (String) x340Var.k(wol1.b);
            String str3 = (String) x340Var.k(wol1.c);
            String deeplink = wrappedStory.getDeeplink();
            boolean zG = x340Var.g(str2) | x340Var.g(str3) | x340Var.i(wrappedStory);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new shm1(str2, str3, wrappedStory);
                x340Var.s0(objT);
            }
            Intent intentB = dro.B(deeplink, str, (WidgetInteraction) ((Function0) objT).invoke());
            intentB.setFlags(268435456);
            whb1 whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            Map mapF = q6m1.f(wrappedStory);
            if (q6m1.g((Map) x340Var.k(vce0.a), mapF).size() == mapF.size()) {
                int i3 = i2 & 14;
                if (eim1.b(wrappedStory, fim1.b, 4, 24.0f, x340Var)) {
                    x340Var.i0(811671250);
                    eim1.a(wrappedStory, whb1Var, null, 0, 0.0f, null, null, x340Var, i3 | 384, 248);
                    x340Var.r(false);
                } else if (eim1.b(wrappedStory, fim1.a, 2, 16.0f, x340Var)) {
                    x340Var.i0(811674050);
                    nol1.a(wrappedStory, whb1Var, x340Var, i3 | 384);
                    x340Var.r(false);
                } else {
                    String titleSmall = wrappedStory.getTitleSmall();
                    kiv kivVar = p4k.a;
                    long j = ((s3v) x340Var.k(kivVar)).a;
                    kiv kivVar2 = p4k.b;
                    Context context = (Context) x340Var.k(kivVar2);
                    float fB = s3v.b(j) - 32.0f;
                    kee1 kee1Var = fim1.d;
                    if (p3v.b(s3v.a(j), (vy9.a(l6m1.STORY_SQUARE_TALL.a, j) * 100.0f) + ph5.J(fB, 2, context, titleSmall, kee1Var) + 48.0f + 8.0f + 32.0f + 48.0f + 24.0f) >= 0) {
                        x340Var.i0(811676648);
                        l9b1.a(wrappedStory, whb1Var, x340Var, i3 | 384);
                        x340Var.r(false);
                    } else {
                        String titleSmall2 = wrappedStory.getTitleSmall();
                        long j2 = ((s3v) x340Var.k(kivVar)).a;
                        if (p3v.b((s3v.a(j2) - (81.0f * vy9.a(l6m1.STORY_SQUARE.a, j2))) - 8.0f, 32.0f + ph5.J(s3v.b(j2) - 32.0f, 2, (Context) x340Var.k(kivVar2), titleSmall2, kee1Var)) >= 0) {
                            x340Var.i0(811679300);
                            b9b1.a(wrappedStory, whb1Var, x340Var, i3 | 384);
                            x340Var.r(false);
                        } else {
                            if (ph5.m((Context) x340Var.k(kivVar2), wrappedStory.getTitle(), jhc1.c(s3v.b(((s3v) x340Var.k(kivVar)).a) * 0.45f, s3v.a(((s3v) x340Var.k(kivVar)).a) - (32.0f + 12.0f)), fim1.c, 2, true)) {
                                x340Var.i0(811681891);
                                dg91.a(wrappedStory, whb1Var, x340Var, i3 | 384);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(811683416);
                                j2iVar.invoke(wrappedStory.getFallback(), x340Var, 48);
                                x340Var.r(false);
                            }
                        }
                    }
                }
            } else {
                x340Var.i0(811669112);
                j2iVar.invoke(wrappedStory.getFallback(), x340Var, 48);
                x340Var.r(false);
            }
            gt40Var2 = et40.a;
        } else {
            x340Var.b0();
            gt40Var2 = gt40Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rhm1(wrappedStory, gt40Var2, i);
        }
    }
}
