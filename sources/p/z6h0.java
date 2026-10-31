package p;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.speechlessupload.proto.v1.SubmitChatMediaUploadResponse;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z6h0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6h0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                fad0 fad0Var = (fad0) obj2;
                return new b8d0((mr20) fad0Var.b, fad0Var, (byte) 20);
            case 1:
                ((fyg0) obj2).c.invoke(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)));
                return rih1Var;
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                q8h0 q8h0Var = (q8h0) obj2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawScope.X0(8.0f))) << 32) | (((long) Float.floatToRawIntBits(drawScope.X0(2.6666667f))) & 4294967295L);
                int i = (int) (jFloatToRawIntBits >> 32);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) - (Float.intBitsToFloat(i) * 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - (Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * 2.0f))) & 4294967295L);
                float fX0 = drawScope.X0(8.0f);
                DrawScope.g0(drawScope, q8h0Var.a, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
                float fX1 = drawScope.X0(1.0f);
                int i2 = (int) (jFloatToRawIntBits2 >> 32);
                mic0 mic0VarH = v9c.h(p7h.M(new u7h[]{new u7h(u7h.b(q8h0Var.b, 0.3f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(q8h0Var.b, 0.6f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(q8h0Var.b, 0.3f, 0.0f, 0.0f, 0.0f, 14))}), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat(i), 8);
                float f = fX1 / 2.0f;
                float f2 = fX0 - f;
                DrawScope.c0(drawScope, mic0VarH, Offset.g(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) - fX1)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) - fX1)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 208);
                return rih1Var;
            case 3:
                return new k6r((p410) obj2, (byte) 24);
            case 4:
                xnb xnbVar = (xnb) obj2;
                return d3p1.H(xnbVar.b, xnbVar.c, (hbh0) obj);
            case 5:
                pfj1 pfj1Var = (pfj1) obj;
                nm1 nm1Var = (nm1) obj2;
                List list = pfj1Var.c.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ltj1) it.next()).e);
                }
                return arrayList.isEmpty() ? new huz(z6x.a, (byte) 10) : h4p1.g(new v4e0((Object) t2p1.u((rzq) nm1Var.f, (o3r) nm1Var.c, arrayList), (Object) new ydh0(nm1Var, pfj1Var), lnmVar, (byte) 17));
            case 6:
                ((h5z) obj2).accept((List) obj);
                return rih1Var;
            case 7:
                hsh0 hsh0Var = (hsh0) obj;
                pt ptVar = (pt) obj2;
                int iB = ((k3i0) ptVar.e).b(hsh0Var.b > 0);
                int i3 = hsh0Var.a;
                int i4 = hsh0Var.b;
                boolean zHasSystemFeature = ((r3d) ptVar.f).a.getPackageManager().hasSystemFeature("android.hardware.camera.any");
                p8i0 p8i0Var = p8i0.b;
                z6x z6xVar = z6x.a;
                return new gsh0(iB, z6xVar, false, false, z6xVar, i3, i4, zHasSystemFeature, false, false, p8i0Var);
            case 8:
                ((nuh0) obj2).a.a(nuh0.b, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 9:
                bxh0 bxh0Var = (bxh0) obj2;
                AnimatorSet animatorSet = bxh0Var.c;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                bxh0Var.c = null;
                bxh0Var.d = false;
                return rih1Var;
            case 10:
                return new q6i0(!((z3i0) obj2).b);
            case 11:
                return new uxh1(((SubmitChatMediaUploadResponse) obj2).getNodeIdentifier().getNodePathId());
            case 12:
                b261.n((e261) obj, ((z9i0) obj2).b);
                return rih1Var;
            case 13:
                ubw0 ubw0Var = (ubw0) obj;
                return ((aru0) ((qq) obj2).j).d(ubw0Var, ubw0Var, true, ubw0Var);
            case 14:
                ((kd31) obj).b(((hob1) obj2).a() ? 0.4f : 1.0f);
                return rih1Var;
            case 15:
                ubw0 ubw0Var2 = (ubw0) obj;
                return ((aru0) obj2).d(ubw0Var2, ubw0Var2, true, ubw0Var2);
            case 16:
                hgi0 hgi0Var = (hgi0) obj;
                rgi0 rgi0Var = (rgi0) obj2;
                hs00 hs00Var = rgi0Var.i;
                Set setB = hs00Var != null ? hs00Var.b() : w7x.a;
                Object objE = rgi0Var.d.e();
                objE.getClass();
                return zqo1.s(hgi0Var, new egi0((ioj0) objE, setB));
            case 17:
                uk00 uk00Var = ((zhi0) obj2).c;
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 18:
                String str = ((mey0) obj).c;
                if (((gii0) obj2).d.a) {
                    return str;
                }
                return null;
            case 19:
                cm0 cm0Var = (cm0) obj2;
                hs00 hs00Var2 = (hs00) cm0Var.h;
                ezc ezcVarG = hs00Var2 != null ? yoi1.g(hs00Var2.d()) : null;
                epb1 epb1Var = (epb1) cm0Var.d;
                return ezcVarG != null ? new x010(t5p1.i(epb1Var), ezcVarG, new o30(3, (lnm) null, (byte) 3), (byte) 1) : new f8f0(t5p1.i(epb1Var), (byte) 22);
            case 20:
                r8s r8sVar = (r8s) obj2;
                return new sii0(yoi1.g(((hs00) r8sVar.i).d()), r8sVar, (byte) 0);
            case 21:
                p091 p091Var = (p091) obj2;
                ((VideoSurfaceView) obj).setScaleType((p091Var == null || p091Var.b <= p091Var.a) ? b3k1.c : b3k1.b);
                return rih1Var;
            case 22:
                qjp qjpVar = (qjp) ((dmi0) obj2).a.a.b;
                nwa nwaVar = (nwa) ((emi0) qjpVar.b).d.get();
                c8o.l(nwaVar);
                emi0 emi0Var = (emi0) qjpVar.b;
                yqg yqgVar = (yqg) emi0Var.e.get();
                c8o.l(yqgVar);
                i8h1 i8h1Var = (i8h1) emi0Var.f.get();
                c8o.l(i8h1Var);
                yge0 yge0Var = new yge0(i8h1Var, new ksk0((byte) 12), (byte) 21);
                gmi0 gmi0Var = (gmi0) qjpVar.c;
                lzn0 lzn0Var = (lzn0) emi0Var.g.get();
                c8o.l(lzn0Var);
                kt91 kt91Var = (kt91) emi0Var.h.get();
                c8o.l(kt91Var);
                return new sak(nwaVar, yqgVar, yge0Var, gmi0Var, lzn0Var, kt91Var);
            case 23:
                hmi0 hmi0Var = (hmi0) obj;
                return gj10.k((gj10) obj2, hmi0Var.a, hmi0Var.b, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 60).d(Observable.just(imi0.c)).onErrorReturn(ta20.O0);
            case 24:
                int iIntValue = ((Number) obj).intValue();
                h72 h72Var = (h72) ((gwa0) obj2).f;
                View view = (View) h72Var.X;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
                View view2 = (View) h72Var.Y;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams2.height = iIntValue;
                view2.setLayoutParams(layoutParams2);
                return rih1Var;
            case 25:
                ((qtr) obj).b(new kr((koi0) obj2, (lnm) null, (byte) 29));
                return rih1Var;
            case 26:
                ((qtr) obj).b(new eri0((ng20) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 27:
                ufx ufxVar = ((xfx) ((rt01) obj2).d).b;
                return new b8s(ufxVar.a, ufxVar.b, aj20.O0);
            case 28:
                return new m441(new tfo((Set) obj, (wui0) obj2, (lnm) null, (byte) 3));
            default:
                ((zyi0) obj2).w.invoke(new gyi0((String) obj));
                return rih1Var;
        }
    }
}
