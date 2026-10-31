package p;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kks0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kks0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 8;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        boolean z2 = true;
        kja1 kja1Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) ((lks0) obj).a.getSystemService("activity")).getMemoryInfo(memoryInfo);
                return new x4r(memoryInfo.totalMem);
            case 1:
                gvs0 gvs0Var = (gvs0) ((qkn0) obj).b;
                if (gvs0Var.a() && gvs0Var.b.h(hvs0.a, false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                gys0 gys0Var = (gys0) obj;
                luk lukVar = gys0Var.b;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(gys0Var, (byte) 5));
                }
                return null;
            case 3:
                hys0 hys0Var = (hys0) obj;
                luk lukVar2 = hys0Var.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(hys0Var, (byte) 6));
                }
                return null;
            case 4:
                String str = ((z1t0) obj).a;
                return v8r.q(str != null ? str : "");
            case 5:
                return ((b4t0) obj).h;
            case 6:
                f4t0 f4t0Var = (f4t0) obj;
                f4t0Var.t.g(f4t0Var.R0);
                return rih1Var;
            case 7:
                return ((zbt0) obj).a.getString(2131961939);
            case 8:
                return Long.valueOf(((sq51) obj).a);
            case 9:
                return ((tzf1) ((yir) obj).b).g();
            case 10:
                return ycm.a(((rmt0) obj).d);
            case 11:
                ((m0t) obj).b();
                return rih1Var;
            case 12:
                return Boolean.valueOf(((rma) obj).a().A1);
            case 13:
                return BehaviorSubject.g(Boolean.valueOf(((dma1) ((qut0) obj).a.get()).h(qut0.d, false)));
            case 14:
                sjq0 sjq0Var = (sjq0) obj;
                e5l0 e5l0Var = (e5l0) sjq0Var.c;
                Context context = (Context) sjq0Var.b;
                String string = ((mut0) e5l0Var.b).a;
                z2 = context.getResources().getConfiguration().getLayoutDirection() == 1;
                int iY = a8o.y(1280.0f, context.getResources());
                Drawable drawableJ = f0o1.j(context, 2131233764);
                Bitmap bitmapY = drawableJ != null ? mno1.y(drawableJ, iY, iY, Bitmap.Config.ARGB_8888) : null;
                if (bitmapY == null) {
                    return null;
                }
                Canvas canvas = new Canvas(bitmapY);
                TextPaint textPaintC = e5l0.c(context);
                Rect rect = new Rect();
                float fY = a8o.y(48.0f, context.getResources());
                float width = canvas.getWidth() - (2.0f * fY);
                textPaintC.setTextSize(a8o.y(150.0f, context.getResources()));
                textPaintC.getTextBounds(string, 0, string.length(), rect);
                if (rect.width() > width) {
                    float fY2 = width - a8o.y(20.0f, context.getResources());
                    TextPaint textPaintC2 = e5l0.c(context);
                    int i = 150;
                    do {
                        i--;
                        float f = i;
                        textPaintC2.setTextSize(a8o.y(f, context.getResources()));
                        if (i > 50) {
                        }
                        textPaintC.setTextSize(a8o.y(f, context.getResources()));
                        string = TextUtils.ellipsize(string, textPaintC, fY2, TextUtils.TruncateAt.END).toString();
                        textPaintC.getTextBounds(string, 0, string.length(), rect);
                    } while (textPaintC2.measureText(string) > fY2);
                    textPaintC.setTextSize(a8o.y(f, context.getResources()));
                    string = TextUtils.ellipsize(string, textPaintC, fY2, TextUtils.TruncateAt.END).toString();
                    textPaintC.getTextBounds(string, 0, string.length(), rect);
                }
                if (z2) {
                    fY = (canvas.getWidth() - rect.width()) - fY;
                }
                canvas.drawText(string, fY, canvas.getHeight() - a8o.y(104.0f, context.getResources()), textPaintC);
                return bitmapY;
            case 15:
                return ((evt0) obj).a.e();
            case 16:
                return ((xwt0) obj).f;
            case 17:
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.w(nik1.w6.a);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                zpzVarY.s(yon1.N2().d);
                zpzVarY.u(((uyt0) obj).c.a());
                return zpzVarY.build();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                byp bypVar = (byp) obj;
                ((x8c0) bypVar.a).a((ct6) bypVar.i);
                ((rku) bypVar.g).b(((Flowable) bypVar.b).W((Scheduler) bypVar.e).L((Scheduler) bypVar.d).subscribe(new ixp0(bypVar, (byte) 17)));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                t1u0 t1u0Var = (t1u0) obj;
                t1u0Var.t = null;
                t1u0Var.X = null;
                t1u0Var.Y.c();
                return rih1Var;
            case 20:
                ((rm5) obj).H();
                return rih1Var;
            case 21:
                return (w9u0) ((ywp) obj).get();
            case 22:
                return new o4e0((myq0) obj, (byte) 16);
            case 23:
                klu0 klu0Var = (klu0) obj;
                String strE = klu0Var.c.e(klu0.e, "");
                if (strE != null && strE.length() != 0) {
                    try {
                        kja1Var = (kja1) klu0Var.b.a(strE, kja1.Companion.serializer());
                    } catch (SerializationException e) {
                        l1d.z("Failed to fetch sorting for items ", e.getMessage(), ".");
                    } catch (IllegalArgumentException e2) {
                        l1d.z("Failed to fetch sorting for items ", e2.getMessage(), ".");
                    }
                }
                return kja1Var == null ? new kja1(new qzq(1001, 1.0f, z2, b2)) : kja1Var;
            case 24:
                wmu0 wmu0Var = (wmu0) obj;
                return ((q940) wmu0Var.a.get()).a(wmu0Var.b).b(p7h.M(new m9d0[]{rmu0.b, rmu0.c}));
            case 25:
                return new uvk0(((tvu0) obj).b);
            case 26:
                return ((v1v0) obj).b.n(7);
            case 27:
                h2v0 h2v0Var = (h2v0) obj;
                MobiusLoop mobiusLoop = h2v0Var.c;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                mmr0 mmr0VarR = bin.r(mobiusLoop);
                Disposable disposable = (Disposable) mmr0VarR.a;
                wen0 wen0Var = (wen0) mmr0VarR.b;
                h2v0Var.d = disposable;
                return wen0Var;
            case 28:
                q5v0 q5v0Var = (q5v0) ((oas) obj).b.get();
                sap sapVar = q5v0Var.b;
                dxy dxyVar = q5v0Var.n;
                ye51 ye51Var = new ye51(dxyVar.t(new p5v0(q5v0Var, (byte) 1), new p5v0(q5v0Var, (byte) 4), 2), dxyVar.t(new p5v0(q5v0Var, (byte) 5), new p5v0(q5v0Var, (byte) 6), 2));
                ye51 ye51Var2 = new ye51(dxyVar.t(new p5v0(q5v0Var, (byte) 7), new p5v0(q5v0Var, (byte) 8), 2), dxyVar.t(new p5v0(q5v0Var, (byte) 9), new p5v0(q5v0Var, (byte) 10), 2));
                wpw wpwVarT = dxyVar.t(new p5v0(q5v0Var, (byte) 11), new p5v0(q5v0Var, (byte) 0), 2);
                yl1 yl1Var = q5v0Var.c;
                xfx xfxVar = q5v0Var.a;
                uo5 uo5Var = new uo5(new jpg0(yl1Var.a(voo1.i(xfxVar)), o5v0.c), new jpg0(yl1Var.a(voo1.i(xfxVar)), o5v0.d), (Object) null, (byte) 17);
                bs0 bs0VarA = q5v0Var.q.a(voo1.o(xfxVar));
                im0 im0VarA = o671.a(q5v0Var.o, voo1.u(xfxVar));
                v3i0 v3i0Var = q5v0Var.f54p;
                eyh0 eyh0Var = new eyh0(bs0VarA, im0VarA, f6o1.A(new z3i0(v3i0Var.a, v3i0Var.b, v3i0Var.c, v3i0Var.d, v3i0Var.e, true), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (byte) 7);
                List listM = p7h.M(new lzd[]{new lzd(lkf1.h, (Object) null), new lzd(lkf1.g, (Object) null)});
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new wzq(q5v0Var.r.a(), o5v0.e));
                smc0VarN.add(new jpg0(f6o1.A(duy.a(q5v0Var.t, 3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), o5v0.f));
                if (q5v0Var.B.a()) {
                    mhe mheVar = (mhe) q5v0Var.s.get();
                    smc0VarN.add(new jpg0(f6o1.A(new ldo(mheVar.a, new xlr(mheVar.b)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), o5v0.g));
                }
                smc0VarN.add(new wzq(fdg1.m0(vsy.a(q5v0Var.u), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), o5v0.h));
                if (q5v0Var.A.b()) {
                    smc0VarN.add(new jpg0(f6o1.A((maa) q5v0Var.v.get(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), o5v0.i));
                }
                return sap.b(sapVar, ye51Var, ye51Var2, wpwVarT, uo5Var, eyh0Var, listM, new xq60(k4p1.k(smc0VarN)), (yxb0) null, new bjx(new n5u0(q5v0Var, (byte) 16), o5v0.t, o5v0.X, o5v0.Y, o5v0.Z, o5v0.N0, (byte) 18), new a5p0(q5v0Var.x, q5v0Var.y, q5v0Var.w), new p5v0(q5v0Var, (byte) 2), new p5v0(q5v0Var, (byte) 3), 128);
            default:
                f6v0 f6v0Var = (f6v0) obj;
                luk lukVar3 = f6v0Var.b;
                if (lukVar3 != null) {
                    return lukVar3.e(new e4n0(f6v0Var, (byte) 7));
                }
                return null;
        }
    }
}
