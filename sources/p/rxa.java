package p;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rxa extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxa(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                return new rxa((String) obj4, (String) obj3, (zsc) obj2, lnmVar);
            case 1:
                return new rxa((byte) 1, (zy70) this.c, (rf01) this.d, (k291) obj4, (va00) obj3, (oq70) obj2, lnmVar);
            case 2:
                return new rxa((byte) 2, (ui01) this.c, (p811) this.d, (o811) obj4, (o811) obj3, (o811) obj2, lnmVar);
            default:
                return new rxa((byte) 3, (gfu0) this.c, (ven0) this.d, (tob1) obj4, (upk1) obj3, (iu30) obj2, lnmVar);
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((rxa) create(c9nVar, lnmVar)).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.String] */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        String strA;
        String str;
        Object objO;
        r091 r091Var;
        gfu0 gfu0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        ?? r5 = this.f;
        Object obj3 = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                zsc zscVar = (zsc) obj2;
                String str2 = (String) obj3;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        strA = txa.a(str2);
                        str = (String) r5;
                        if (str.length() == 0) {
                            str = str2;
                        }
                        w7a w7aVar = new w7a(zscVar, str, (lnm) null, (byte) 8);
                        this.c = strA;
                        this.d = str;
                        this.b = true;
                        objO = rc2.O(3000L, w7aVar, this);
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) this.d;
                        String str3 = (String) this.c;
                        hm5.M(obj);
                        strA = str3;
                        objO = obj;
                    }
                    Bitmap bitmap = (Bitmap) objO;
                    if (bitmap == null) {
                        Logger.k("[WidgetBitmapPreloader] preload null/timeout for " + str, new Object[0]);
                        return rih1Var;
                    }
                    String queryParameter = Uri.parse(str2).getQueryParameter("transformation");
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCopy = bitmap.copy(config, false);
                    bitmapCopy.getClass();
                    Bitmap bitmapG = kw7.g(queryParameter, bitmapCopy);
                    if (!bitmapG.equals(bitmapCopy) && !bitmapCopy.isRecycled()) {
                        bitmapCopy.recycle();
                    }
                    ((rol1) zscVar.c).a.put(strA, bitmapG);
                    return rih1Var;
                } catch (Exception e) {
                    String strR = rc11.a.b(e.getClass()).r();
                    String message = e.getMessage();
                    StringBuilder sbN = gvg.n("[WidgetBitmapPreloader] preload failed for ", (String) r5, ": ", strR, ": ");
                    sbN.append(message);
                    Logger.k(sbN.toString(), new Object[0]);
                    return rih1Var;
                }
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zy70 zy70Var = (zy70) this.c;
                vf01 vf01Var = new vf01(zy70Var, ((rf01) this.d).d.a, 0, zy70Var, (k291) obj3, (va00) r5, ((oq70) obj2) != null);
                this.b = true;
                Object objC = vf01Var.c(this);
                return objC == d9nVar ? d9nVar : objC;
            case 2:
                ui01 ui01Var = (ui01) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowableC = ui01.a(ui01Var).c();
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableC);
                d9l d9lVar = new d9l((p811) this.d, ui01Var, (o811) obj3, (o811) r5, (o811) obj2);
                this.b = true;
                return kgeVar.collect(d9lVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((Boolean) ((ven0) this.d).getValue()).booleanValue() || (r091Var = (r091) ((tob1) obj3).getValue()) == null || (gfu0Var = (gfu0) this.c) == null) {
                    return rih1Var;
                }
                r091Var.b(new lsm0(gfu0Var.b(), new ksm0(fec1.c, (String) null, (String) null, "voices_preview", (String) null, (String) null, 502), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                r091.f(r091Var, null, null, qky0.a(), 7);
                r091Var.k();
                mr20 mr20VarU = rqt0.u(new rpk1(r091Var.g, (upk1) r5, gfu0Var, (byte) 0));
                lm31 lm31Var = new lm31((iu30) obj2, (byte) 16);
                this.b = true;
                return mr20VarU.collect(lm31Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxa(String str, String str2, zsc zscVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.e = str;
        this.f = str2;
        this.g = zscVar;
    }
}
