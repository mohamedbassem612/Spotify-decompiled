package p;

import android.content.Intent;
import android.content.res.Resources;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class kl4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kl4(qoo qooVar, hyp0 hyp0Var, c8e1 c8e1Var, r1c0 r1c0Var, Brush brush) {
        this.a = (byte) 4;
        this.c = qooVar;
        this.d = hyp0Var;
        this.b = c8e1Var;
        this.e = r1c0Var;
        this.f = brush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, java.lang.Object, p.ifv0] */
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                s1c0 s1c0Var = (s1c0) obj;
                vzb0 vzb0Var = ((ml4) obj6).a;
                s1c0Var.h = (c8e1) obj4;
                s1c0Var.i = (x180) obj5;
                s1c0Var.c = (d5e1) obj3;
                s1c0Var.d = (iu30) obj2;
                s1c0Var.e = vzb0Var != null ? vzb0Var.P0 : null;
                s1c0Var.f = vzb0Var != null ? vzb0Var.Q0 : null;
                s1c0Var.g = vzb0Var != null ? (e8k1) lcc.z(vzb0Var, t4k.t) : null;
                return rih1Var;
            case 1:
                ?? r11 = (ifv0) obj4;
                r11.T0.addView(r11, r11.U0);
                r11.A((Function0) obj6, (nfv0) obj5, (String) obj3, (flb0) obj2);
                return new rm((Object) r11, (byte) 5);
            case 2:
                wnm0 wnm0Var = (wnm0) obj4;
                p811 p811Var = (p811) obj6;
                m811 m811Var = (m811) obj5;
                du41 du41Var = (du41) obj3;
                l811 l811Var = (l811) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                snm0 snm0VarI = wnm0.i(wnm0Var.g);
                if (snm0VarI != null) {
                    jut jutVar = ((weo0) wnm0Var).e;
                    long j = snm0VarI.b;
                    long j2 = snm0VarI.a;
                    ((sui1) jutVar.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((sui1) jutVar.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    snm0 snm0VarA = ((snm0) p811Var.a).a(snm0VarI);
                    p811Var.a = snm0VarA;
                    float fJ = du41Var.j(du41Var.f(snm0VarA.a));
                    m811Var.a = fJ;
                    l811Var.a = !dsa0.q(fJ - fFloatValue);
                }
                return Boolean.valueOf(snm0VarI != null);
            case 3:
                hyy0 hyy0Var = (hyy0) obj4;
                mzc mzcVar = (mzc) obj6;
                xjn1 xjn1Var = (xjn1) obj5;
                kdy0 kdy0Var = (kdy0) obj3;
                Executor executor = (Executor) kdy0Var.d;
                Intent intent = (Intent) obj2;
                List<zio1> list = (List) obj;
                if (list.size() == 0) {
                    ((mzc) hyy0Var.c).c(new Resources.NotFoundException("No devices connected"));
                } else {
                    qy11 qy11Var = new qy11(mzcVar, list.size());
                    for (zio1 zio1Var : list) {
                        String str = zio1Var.a;
                        asd1 asd1VarB = asd1.b();
                        asd1VarB.d = new frl1(xjn1Var, str, (byte) 19);
                        asd1VarB.a = new pl10[]{oqo1.a};
                        asd1VarB.c = (char) 24023;
                        hfp1 hfp1VarE = xjn1Var.e(0, asd1VarB.a());
                        qy11 qy11Var2 = qy11Var;
                        hfp1VarE.d(executor, new jf11(new k95(hyy0Var, kdy0Var, intent, qy11Var2, zio1Var), (byte) 2));
                        hfp1VarE.c(executor, new py11(hyy0Var, (byte) 1));
                        qy11Var = qy11Var2;
                    }
                }
                return rih1Var;
            default:
                hyp0 hyp0Var = (hyp0) obj5;
                c8e1 c8e1Var = (c8e1) obj4;
                r1c0 r1c0Var = (r1c0) obj3;
                Brush brush = (Brush) obj2;
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float fS = ((qoo) obj6).c.s();
                if (fS != 0.0f) {
                    long j3 = c8e1Var.b;
                    int i = nbe1.c;
                    int iO = hyp0Var.o((int) (j3 >> 32));
                    z9e1 z9e1VarD = r1c0Var.d();
                    n511 n511VarC = z9e1VarD != null ? z9e1VarD.a.c(iO) : new n511(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(lslVar.X0(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = n511VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    DrawScope.z(lslVar, brush, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(n511VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(n511VarC.d)) & 4294967295L), fFloor, fS, 432);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ kl4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
