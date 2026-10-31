package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x9j0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ BackgroundColor b;
    public final /* synthetic */ MessageTemplate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9j0(float f, BackgroundColor backgroundColor, MessageTemplate messageTemplate) {
        super(3);
        this.a = f;
        this.b = backgroundColor;
        this.c = messageTemplate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        qim0 qim0VarS;
        qim0 qim0Var = (qim0) obj;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(746416332);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = p3d1.n(0L, x340Var);
        }
        ven0 ven0Var = (ven0) objT;
        qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(this.a));
        boolean zI = x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new abh0(ven0Var, (byte) 12);
            x340Var.s0(objT2);
        }
        qim0 qim0VarU = lrn1.u(qim0VarQ, (iu30) objT2);
        BackgroundColor.GradientBackgroundColor gradientBackgroundColor = this.b;
        boolean z2 = gradientBackgroundColor instanceof BackgroundColor.GradientBackgroundColor;
        nim0 nim0Var = nim0.a;
        MessageTemplate messageTemplate = this.c;
        if (z2) {
            x340Var.i0(1443520830);
            BackgroundColor.GradientBackgroundColor gradientBackgroundColor2 = gradientBackgroundColor;
            float degrees = (float) gradientBackgroundColor2.getDegrees();
            long j = ((yr80) ven0Var.getValue()).a;
            double radians = Math.toRadians(((double) (((degrees % 360.0f) + 360.0f) % 360.0f)) + 90.0d);
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((float) ((Math.cos(radians) * 0.5d) + 0.5d)) * f)) << 32) | (((long) Float.floatToRawIntBits(((float) ((Math.sin(radians) * 0.5d) + 0.5d)) * f2)) & 4294967295L);
            qim0VarS = dug.e(nim0Var, new mic0(0, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f2 - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L), p7h.M(new u7h[]{new u7h(v9p1.P(v9p1.C(messageTemplate, x340Var), gradientBackgroundColor2.getStartColor())), new u7h(v9p1.P(v9p1.C(messageTemplate, x340Var), gradientBackgroundColor2.getEndColor()))}), (List) null), (hw61) null, 0.0f, 6);
            x340Var.r(false);
        } else {
            boolean z3 = gradientBackgroundColor instanceof BackgroundColor.NotSet;
            u5j1 u5j1Var = d4o1.a;
            if (!z3) {
                if (gradientBackgroundColor instanceof BackgroundColor.SolidBackgroundColor) {
                    x340Var.i0(46592899);
                    qim0VarS = dug.f(nim0Var, v9p1.P(v9p1.C(messageTemplate, x340Var), ((BackgroundColor.SolidBackgroundColor) gradientBackgroundColor).getSolidBackgroundColor()), u5j1Var);
                    x340Var.r(false);
                } else {
                    if (!(gradientBackgroundColor instanceof BackgroundColor.ImageUrl)) {
                        throw p3d1.k(x340Var, 46563328, false);
                    }
                    x340Var.i0(1444620927);
                    z = false;
                    qim0VarS = xyn1.s(nim0Var, oi7.a(Uri.parse(((BackgroundColor.ImageUrl) gradientBackgroundColor).getImageUrl()), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, 52);
                    x340Var.r(false);
                }
                qim0 qim0VarThen = qim0VarU.then(qim0VarS);
                x340Var.r(z);
                return qim0VarThen;
            }
            x340Var.i0(46589297);
            x340Var.r(false);
            qim0VarS = dug.f(nim0Var, u7h.j, u5j1Var);
        }
        z = false;
        qim0 qim0VarThen2 = qim0VarU.then(qim0VarS);
        x340Var.r(z);
        return qim0VarThen2;
    }
}
