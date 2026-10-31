package p;

import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class wuh {
    public static final void a(WidgetState.InactiveSession inactiveSession, gt40 gt40Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        whb1 cz31Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-637947380);
        int i2 = (b0kVar3.i(inactiveSession) ? 4 : 2) | i | (b0kVar3.i(gt40Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            kiv kivVar = p4k.a;
            float fB = s3v.b(((s3v) b0kVar3.k(kivVar)).a);
            float fA = s3v.a(((s3v) b0kVar3.k(kivVar)).a);
            nmo metadata = inactiveSession.getMetadata();
            boolean z = p3v.b(fB, 180.0f) >= 0;
            boolean z2 = p3v.b(fB, 250.0f) >= 0;
            String str = (String) b0kVar3.k(wol1.a);
            String str2 = (String) b0kVar3.k(wol1.b);
            String str3 = (String) b0kVar3.k(wol1.c);
            boolean zI = b0kVar3.i(inactiveSession) | b0kVar3.g(str2) | b0kVar3.g(str3);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new vuh(inactiveSession, str2, str3);
                b0kVar3.s0(objT);
            }
            WidgetInteraction widgetInteraction = (WidgetInteraction) ((Function0) objT).invoke();
            x60 x60Var = apl1.b;
            y60 y60Var = new y60(x60Var, widgetInteraction);
            x60 x60Var2 = apl1.a;
            cz31 cz31Var2 = new cz31(w0h1.A(new y60[]{y60Var, new y60(x60Var2, str)}));
            boolean zI2 = b0kVar3.i(inactiveSession) | b0kVar3.g(str2) | b0kVar3.g(str3);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new uuh(inactiveSession, str2, str3);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (inactiveSession.getShouldOpenEntityPage()) {
                Intent intentB = dro.B((String) null, str, (WidgetInteraction) function0.invoke());
                intentB.setFlags(268435456);
                cz31Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            } else {
                cz31Var = new cz31(w0h1.A(new y60[]{new y60(x60Var, (WidgetInteraction) function0.invoke()), new y60(x60Var2, str)}));
            }
            whb1 whb1Var = cz31Var;
            float fMin = Math.min(56.0f, fA - 24.0f);
            gt40 gt40VarH = eqr0.H(dm5.I(gt40Var), zjy.p(0.0f, new p3v(Math.min(12.0f - ((48.0f - fMin) / 2.0f), 12.0f))).a, 0.0f, zjy.p(0.0f, new p3v(0.0f)).a, 0.0f, 10);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = quh.a;
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            jch0.f(iko1.x(gt40VarH, (iu30) objT3), 1, apo.r(1060716328, new suh(fMin, whb1Var, z, metadata, z2, inactiveSession, cz31Var2), b0kVar3), b0kVar2, 3072, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tuh(inactiveSession, gt40Var, i);
        }
    }
}
