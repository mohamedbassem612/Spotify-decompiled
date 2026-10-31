package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aw40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public final Object invoke(Object obj) {
        List listSubList;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                Paint paint = (Paint) obj2;
                eqc eqcVar = (eqc) obj;
                bor0 bor0Var = (bor0) obj5;
                float fH = eqcVar.h() * bor0Var.c();
                float fH2 = eqcVar.h() * bor0Var.d();
                n511 n511Var = (n511) ((Function0) obj4).invoke();
                n511 n511VarD = n511Var != null ? jo31.d(((Offset) ((Function0) obj3).invoke()).a, n511Var) : new n511(0.0f, 0.0f, Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)));
                float f = n511VarD.b;
                float f2 = n511VarD.d;
                float f3 = n511VarD.c - n511VarD.a;
                float f4 = f2 - f;
                float fMin = Math.min(eqcVar.h() * bor0Var.a(), Math.min(f3, f4) / 4.0f);
                if (Build.VERSION.SDK_INT >= 33 && paint != null && f3 > 0.0f && f4 > 0.0f) {
                    ol10.a(paint, n511VarD, fMin, fH, fH2, bor0Var.b(), (Bitmap) obj6);
                    return eqcVar.a(new ja5(n511VarD, fH2, paint, (byte) 3));
                }
                if (f3 <= 0.0f || f4 <= 0.0f) {
                    return eqcVar.a(vc40.S0);
                }
                float f5 = Math.min(f3, f4) < eqcVar.h() * 60.0f ? 1.0f : 0.25f;
                Bitmap bitmapY = suo1.y(n511VarD, fMin * f5, f5 * 0.0f, fH * f5, fH2 * f5, bor0Var.b(), f5);
                float f6 = fH2 * 3.0f;
                float f7 = 2.0f * f6;
                int iCeil = (int) Math.ceil(f3 + f7);
                if (iCeil < 1) {
                    iCeil = 1;
                }
                int iCeil2 = (int) Math.ceil(f4 + f7);
                if (iCeil2 < 1) {
                    iCeil2 = 1;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapY, (Rect) null, new RectF(0.0f, 0.0f, iCeil, iCeil2), new Paint(2));
                bitmapY.recycle();
                suo1.t(bitmapCreateBitmap, (Bitmap) obj6);
                return eqcVar.a(new xv40(bitmapCreateBitmap, n511VarD, f6, (byte) 1));
            case 1:
                hnn0 hnn0Var = (hnn0) obj;
                n811 n811Var = (n811) obj3;
                ((l811) obj5).a = true;
                ArrayList arrayList = (ArrayList) obj4;
                int iIndexOf = arrayList.indexOf(hnn0Var);
                if (iIndexOf != -1) {
                    int i = iIndexOf + 1;
                    listSubList = arrayList.subList(n811Var.a, i);
                    n811Var.a = i;
                } else {
                    listSubList = z6x.a;
                }
                gon0.a((gon0) obj2, hnn0Var.b, (Bundle) obj6, hnn0Var, listSubList);
                return rih1Var;
            case 2:
                mxc mxcVar = (mxc) obj;
                ln21 ln21Var = (ln21) obj6;
                if (mxcVar.c) {
                    Logger.b("Response cannot be decorated twice " + ln21Var.a, new Object[0]);
                } else {
                    mxcVar.c = true;
                    ((p811) obj5).a = new uzp0((ry21) obj3, (vzp0) obj4, new i4g1((jf01) obj2), ln21Var, (byte) 0);
                }
                return rih1Var;
            default:
                SmartShuffleButtonView smartShuffleButtonView = (SmartShuffleButtonView) obj;
                ven0 ven0Var = (ven0) obj6;
                om91 om91Var = (om91) obj5;
                if (om91Var.b() && om91Var.a() != 0 && !rbc0.g(ven0Var)) {
                    rbc0.h(ven0Var);
                    rbc0.i((rbc0) obj4, (c9n) obj3, smartShuffleButtonView, guo1.I(om91Var.a()), (um91) obj2);
                }
                return rih1Var;
        }
    }
}
