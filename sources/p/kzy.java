package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kzy implements owy0 {
    public final /* synthetic */ byte a;
    public final d520 b;
    public final wmy c;
    public final dc31 d;
    public final Context e;
    public final tka0 f;

    public kzy(d520 d520Var, wmy wmyVar, dc31 dc31Var, Context context) {
        this.a = (byte) 1;
        this.b = d520Var;
        this.c = wmyVar;
        this.d = dc31Var;
        this.e = context;
        this.f = rc11.a.b(wto0.class);
    }

    @Override // p.owy0
    public final tka0 a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    @Override // p.owy0
    public final /* bridge */ /* synthetic */ Object b(omo1 omo1Var, gca gcaVar) {
        switch (this.a) {
            case 0:
                return c((tto0) omo1Var, gcaVar);
            default:
                return d((wto0) omo1Var, gcaVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x019e  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0216  */
    /* JADX WARN: Code duplicated, block: B:63:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0268 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object c(tto0 tto0Var, onm onmVar) throws Throwable {
        izy izyVar;
        iu30 jzyVar;
        iu30 iu30Var;
        iu30 iu30Var2;
        String str;
        tto0 tto0Var2;
        int i;
        t45 t45Var;
        dc31 dc31Var;
        t45 t45Var2;
        Object objG;
        iu30 iu30Var3;
        iu30 iu30Var4;
        iu30 iu30Var5;
        tto0 tto0Var3;
        iu30 iu30Var6;
        iu30 iu30Var7;
        Bitmap bitmap;
        int iX;
        ShapeDrawable shapeDrawable;
        Drawable drawable;
        int i2;
        InsetDrawable insetDrawable;
        Bitmap bitmapCreateBitmap;
        tto0 tto0Var4;
        Bitmap bitmap2;
        iu30 iu30Var8;
        Bitmap bitmap3;
        iu30 iu30Var9;
        iu30 iu30Var10;
        String str2;
        String str3;
        tto0 tto0Var5;
        Drawable drawableMutate;
        rxd1 cai0Var;
        Object objS;
        if (onmVar instanceof izy) {
            izyVar = (izy) onmVar;
            int i3 = izyVar.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                izyVar.Y = i3 - Integer.MIN_VALUE;
            } else {
                izyVar = new izy(this, onmVar);
            }
        } else {
            izyVar = new izy(this, onmVar);
        }
        Object objG2 = izyVar.t;
        int i4 = izyVar.Y;
        byte b = 1;
        byte b2 = 2;
        byte b3 = 0;
        t45 t45Var3 = d9n.a;
        switch (i4) {
            case 0:
                hm5.M(objG2);
                jzy jzyVar2 = new jzy(this, tto0Var, b2);
                jzy jzyVar3 = new jzy(this, tto0Var, b);
                jzyVar = new jzy(this, tto0Var, b3);
                izyVar.a = tto0Var;
                izyVar.b = jzyVar2;
                izyVar.c = jzyVar3;
                izyVar.d = jzyVar;
                izyVar.e = "image_load";
                izyVar.i = 0;
                izyVar.Y = 1;
                t45 t45VarP = qgo1.p(izyVar);
                if (t45VarP != t45Var3) {
                    iu30Var = jzyVar2;
                    objG2 = t45VarP;
                    iu30Var2 = jzyVar3;
                    str = "image_load";
                    tto0Var2 = tto0Var;
                    i = 0;
                    t45Var = (t45) objG2;
                    dc31Var = this.d;
                    if (t45Var == null) {
                        String str4 = tto0Var2.d;
                        izyVar.a = tto0Var2;
                        izyVar.b = iu30Var;
                        izyVar.c = iu30Var2;
                        izyVar.d = jzyVar;
                        izyVar.e = null;
                        izyVar.f = null;
                        izyVar.i = i;
                        izyVar.Y = 2;
                        objG2 = dc31Var.g(str4, izyVar);
                        if (objG2 != t45Var3) {
                            iu30Var3 = jzyVar;
                            iu30Var4 = iu30Var2;
                            iu30Var5 = iu30Var;
                            tto0Var3 = tto0Var2;
                            iu30 iu30Var11 = iu30Var5;
                            jzyVar = iu30Var3;
                            iu30Var6 = iu30Var4;
                            iu30Var7 = iu30Var11;
                            tto0Var2 = tto0Var3;
                            bitmap = (Bitmap) objG2;
                            String str5 = tto0Var2.e;
                            String str6 = tto0Var2.f;
                            int color = Color.parseColor("#FFFFFF");
                            int color2 = Color.parseColor("#1ED760");
                            Context context = this.e;
                            iX = (int) o0c.x(context, 36);
                            int iX2 = (int) o0c.x(context, 10);
                            plm plmVar = new plm(context, 2132018135);
                            int iO = ago1.o(plmVar, 2130968780, color);
                            int iO2 = ago1.o(plmVar, 2130968781, color2);
                            shapeDrawable = new ShapeDrawable(new OvalShape());
                            shapeDrawable.setIntrinsicWidth(iX);
                            shapeDrawable.setIntrinsicHeight(iX);
                            shapeDrawable.getPaint().setColor(iO2);
                            drawable = context.getDrawable(2131232314);
                            if (drawable != null || (drawableMutate = drawable.mutate()) == null) {
                                i2 = 0;
                                insetDrawable = null;
                            } else {
                                drawableMutate.setTint(iO);
                                i2 = 0;
                                drawableMutate.setBounds(0, 0, iX, iX);
                                insetDrawable = new InsetDrawable(drawableMutate, iX2);
                            }
                            if (insetDrawable != null) {
                                Drawable[] drawableArr = new Drawable[2];
                                drawableArr[i2] = shapeDrawable;
                                drawableArr[1] = insetDrawable;
                                bitmapCreateBitmap = mno1.z(new LayerDrawable(drawableArr), i2, i2, 7);
                            } else {
                                bitmapCreateBitmap = Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
                            }
                            if (bitmap != null || str5 == null || str6 == null) {
                                izyVar.a = tto0Var2;
                                izyVar.b = iu30Var7;
                                izyVar.c = iu30Var6;
                                izyVar.d = null;
                                izyVar.e = null;
                                izyVar.f = null;
                                izyVar.g = null;
                                izyVar.h = null;
                                izyVar.Y = 5;
                                if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                    tto0Var4 = tto0Var2;
                                    cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                    rxd1 rxd1Var = cai0Var;
                                    izyVar.a = null;
                                    izyVar.b = null;
                                    izyVar.c = null;
                                    izyVar.d = null;
                                    izyVar.e = null;
                                    izyVar.f = null;
                                    izyVar.g = null;
                                    izyVar.h = null;
                                    izyVar.Y = 6;
                                    objS = this.b.s(rxd1Var, izyVar);
                                    if (objS == t45Var3) {
                                        return objS;
                                    }
                                }
                            } else {
                                izyVar.a = tto0Var2;
                                izyVar.b = iu30Var7;
                                izyVar.c = iu30Var6;
                                izyVar.d = jzyVar;
                                izyVar.e = bitmap;
                                izyVar.f = str5;
                                izyVar.g = str6;
                                izyVar.h = bitmapCreateBitmap;
                                izyVar.Y = 4;
                                if (qgo1.i("presenter_type", "media_with_action_button", izyVar) != t45Var3) {
                                    bitmap2 = bitmapCreateBitmap;
                                    iu30Var8 = iu30Var6;
                                    bitmap3 = bitmap;
                                    iu30Var9 = iu30Var7;
                                    iu30Var10 = jzyVar;
                                    str2 = str5;
                                    str3 = str6;
                                    tto0Var5 = tto0Var2;
                                    cai0Var = new cai0(tto0Var5.c, bitmap3, str2, str3, bitmap2, iu30Var9, iu30Var8, iu30Var10, tto0Var5.h, tto0Var5.g);
                                    rxd1 rxd1Var2 = cai0Var;
                                    izyVar.a = null;
                                    izyVar.b = null;
                                    izyVar.c = null;
                                    izyVar.d = null;
                                    izyVar.e = null;
                                    izyVar.f = null;
                                    izyVar.g = null;
                                    izyVar.h = null;
                                    izyVar.Y = 6;
                                    objS = this.b.s(rxd1Var2, izyVar);
                                    if (objS == t45Var3) {
                                        return objS;
                                    }
                                }
                            }
                        }
                    } else {
                        t45.m(t45Var, str, 2);
                        try {
                            String str7 = tto0Var2.d;
                            izyVar.a = tto0Var2;
                            izyVar.b = iu30Var;
                            izyVar.c = iu30Var2;
                            izyVar.d = jzyVar;
                            izyVar.e = str;
                            izyVar.f = null;
                            izyVar.g = t45Var;
                            izyVar.i = i;
                            izyVar.Y = 3;
                            objG = dc31Var.g(str7, izyVar);
                            if (objG != t45Var3) {
                                objG2 = objG;
                                t45Var2 = t45Var;
                                t45Var2.g(str);
                                iu30Var6 = iu30Var2;
                                iu30Var7 = iu30Var;
                                bitmap = (Bitmap) objG2;
                                String str8 = tto0Var2.e;
                                String str9 = tto0Var2.f;
                                int color3 = Color.parseColor("#FFFFFF");
                                int color4 = Color.parseColor("#1ED760");
                                Context context2 = this.e;
                                iX = (int) o0c.x(context2, 36);
                                int iX3 = (int) o0c.x(context2, 10);
                                plm plmVar2 = new plm(context2, 2132018135);
                                int iO3 = ago1.o(plmVar2, 2130968780, color3);
                                int iO4 = ago1.o(plmVar2, 2130968781, color4);
                                shapeDrawable = new ShapeDrawable(new OvalShape());
                                shapeDrawable.setIntrinsicWidth(iX);
                                shapeDrawable.setIntrinsicHeight(iX);
                                shapeDrawable.getPaint().setColor(iO4);
                                drawable = context2.getDrawable(2131232314);
                                if (drawable != null) {
                                    i2 = 0;
                                    insetDrawable = null;
                                } else {
                                    i2 = 0;
                                    insetDrawable = null;
                                }
                                if (insetDrawable != null) {
                                    Drawable[] drawableArr2 = new Drawable[2];
                                    drawableArr2[i2] = shapeDrawable;
                                    drawableArr2[1] = insetDrawable;
                                    bitmapCreateBitmap = mno1.z(new LayerDrawable(drawableArr2), i2, i2, 7);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
                                }
                                if (bitmap != null) {
                                    izyVar.a = tto0Var2;
                                    izyVar.b = iu30Var7;
                                    izyVar.c = iu30Var6;
                                    izyVar.d = null;
                                    izyVar.e = null;
                                    izyVar.f = null;
                                    izyVar.g = null;
                                    izyVar.h = null;
                                    izyVar.Y = 5;
                                    if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                        tto0Var4 = tto0Var2;
                                        cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                        rxd1 rxd1Var3 = cai0Var;
                                        izyVar.a = null;
                                        izyVar.b = null;
                                        izyVar.c = null;
                                        izyVar.d = null;
                                        izyVar.e = null;
                                        izyVar.f = null;
                                        izyVar.g = null;
                                        izyVar.h = null;
                                        izyVar.Y = 6;
                                        objS = this.b.s(rxd1Var3, izyVar);
                                        if (objS == t45Var3) {
                                            return objS;
                                        }
                                    }
                                } else {
                                    izyVar.a = tto0Var2;
                                    izyVar.b = iu30Var7;
                                    izyVar.c = iu30Var6;
                                    izyVar.d = null;
                                    izyVar.e = null;
                                    izyVar.f = null;
                                    izyVar.g = null;
                                    izyVar.h = null;
                                    izyVar.Y = 5;
                                    if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                        tto0Var4 = tto0Var2;
                                        cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                        rxd1 rxd1Var4 = cai0Var;
                                        izyVar.a = null;
                                        izyVar.b = null;
                                        izyVar.c = null;
                                        izyVar.d = null;
                                        izyVar.e = null;
                                        izyVar.f = null;
                                        izyVar.g = null;
                                        izyVar.h = null;
                                        izyVar.Y = 6;
                                        objS = this.b.s(rxd1Var4, izyVar);
                                        if (objS == t45Var3) {
                                            return objS;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            t45Var2 = t45Var;
                            t45Var2.g(str);
                            throw th;
                        }
                    }
                }
                return t45Var3;
            case 1:
                i = izyVar.i;
                str = (String) izyVar.e;
                jzyVar = izyVar.d;
                iu30Var2 = izyVar.c;
                iu30Var = izyVar.b;
                tto0Var2 = izyVar.a;
                hm5.M(objG2);
                t45Var = (t45) objG2;
                dc31Var = this.d;
                if (t45Var == null) {
                    String str10 = tto0Var2.d;
                    izyVar.a = tto0Var2;
                    izyVar.b = iu30Var;
                    izyVar.c = iu30Var2;
                    izyVar.d = jzyVar;
                    izyVar.e = null;
                    izyVar.f = null;
                    izyVar.i = i;
                    izyVar.Y = 2;
                    objG2 = dc31Var.g(str10, izyVar);
                    if (objG2 != t45Var3) {
                        iu30Var3 = jzyVar;
                        iu30Var4 = iu30Var2;
                        iu30Var5 = iu30Var;
                        tto0Var3 = tto0Var2;
                        iu30 iu30Var12 = iu30Var5;
                        jzyVar = iu30Var3;
                        iu30Var6 = iu30Var4;
                        iu30Var7 = iu30Var12;
                        tto0Var2 = tto0Var3;
                        bitmap = (Bitmap) objG2;
                        String str11 = tto0Var2.e;
                        String str12 = tto0Var2.f;
                        int color5 = Color.parseColor("#FFFFFF");
                        int color6 = Color.parseColor("#1ED760");
                        Context context3 = this.e;
                        iX = (int) o0c.x(context3, 36);
                        int iX4 = (int) o0c.x(context3, 10);
                        plm plmVar3 = new plm(context3, 2132018135);
                        int iO5 = ago1.o(plmVar3, 2130968780, color5);
                        int iO6 = ago1.o(plmVar3, 2130968781, color6);
                        shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.setIntrinsicWidth(iX);
                        shapeDrawable.setIntrinsicHeight(iX);
                        shapeDrawable.getPaint().setColor(iO6);
                        drawable = context3.getDrawable(2131232314);
                        if (drawable != null) {
                            i2 = 0;
                            insetDrawable = null;
                        } else {
                            i2 = 0;
                            insetDrawable = null;
                        }
                        if (insetDrawable != null) {
                            Drawable[] drawableArr3 = new Drawable[2];
                            drawableArr3[i2] = shapeDrawable;
                            drawableArr3[1] = insetDrawable;
                            bitmapCreateBitmap = mno1.z(new LayerDrawable(drawableArr3), i2, i2, 7);
                        } else {
                            bitmapCreateBitmap = Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
                        }
                        if (bitmap != null) {
                            izyVar.a = tto0Var2;
                            izyVar.b = iu30Var7;
                            izyVar.c = iu30Var6;
                            izyVar.d = null;
                            izyVar.e = null;
                            izyVar.f = null;
                            izyVar.g = null;
                            izyVar.h = null;
                            izyVar.Y = 5;
                            if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                tto0Var4 = tto0Var2;
                                cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                rxd1 rxd1Var5 = cai0Var;
                                izyVar.a = null;
                                izyVar.b = null;
                                izyVar.c = null;
                                izyVar.d = null;
                                izyVar.e = null;
                                izyVar.f = null;
                                izyVar.g = null;
                                izyVar.h = null;
                                izyVar.Y = 6;
                                objS = this.b.s(rxd1Var5, izyVar);
                                if (objS == t45Var3) {
                                    return objS;
                                }
                            }
                        } else {
                            izyVar.a = tto0Var2;
                            izyVar.b = iu30Var7;
                            izyVar.c = iu30Var6;
                            izyVar.d = null;
                            izyVar.e = null;
                            izyVar.f = null;
                            izyVar.g = null;
                            izyVar.h = null;
                            izyVar.Y = 5;
                            if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                tto0Var4 = tto0Var2;
                                cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                rxd1 rxd1Var6 = cai0Var;
                                izyVar.a = null;
                                izyVar.b = null;
                                izyVar.c = null;
                                izyVar.d = null;
                                izyVar.e = null;
                                izyVar.f = null;
                                izyVar.g = null;
                                izyVar.h = null;
                                izyVar.Y = 6;
                                objS = this.b.s(rxd1Var6, izyVar);
                                if (objS == t45Var3) {
                                    return objS;
                                }
                            }
                        }
                    }
                } else {
                    t45.m(t45Var, str, 2);
                    String str13 = tto0Var2.d;
                    izyVar.a = tto0Var2;
                    izyVar.b = iu30Var;
                    izyVar.c = iu30Var2;
                    izyVar.d = jzyVar;
                    izyVar.e = str;
                    izyVar.f = null;
                    izyVar.g = t45Var;
                    izyVar.i = i;
                    izyVar.Y = 3;
                    objG = dc31Var.g(str13, izyVar);
                    if (objG != t45Var3) {
                        objG2 = objG;
                        t45Var2 = t45Var;
                        t45Var2.g(str);
                        iu30Var6 = iu30Var2;
                        iu30Var7 = iu30Var;
                        bitmap = (Bitmap) objG2;
                        String str14 = tto0Var2.e;
                        String str15 = tto0Var2.f;
                        int color7 = Color.parseColor("#FFFFFF");
                        int color8 = Color.parseColor("#1ED760");
                        Context context4 = this.e;
                        iX = (int) o0c.x(context4, 36);
                        int iX5 = (int) o0c.x(context4, 10);
                        plm plmVar4 = new plm(context4, 2132018135);
                        int iO7 = ago1.o(plmVar4, 2130968780, color7);
                        int iO8 = ago1.o(plmVar4, 2130968781, color8);
                        shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.setIntrinsicWidth(iX);
                        shapeDrawable.setIntrinsicHeight(iX);
                        shapeDrawable.getPaint().setColor(iO8);
                        drawable = context4.getDrawable(2131232314);
                        if (drawable != null) {
                            i2 = 0;
                            insetDrawable = null;
                        } else {
                            i2 = 0;
                            insetDrawable = null;
                        }
                        if (insetDrawable != null) {
                            Drawable[] drawableArr4 = new Drawable[2];
                            drawableArr4[i2] = shapeDrawable;
                            drawableArr4[1] = insetDrawable;
                            bitmapCreateBitmap = mno1.z(new LayerDrawable(drawableArr4), i2, i2, 7);
                        } else {
                            bitmapCreateBitmap = Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
                        }
                        if (bitmap != null) {
                            izyVar.a = tto0Var2;
                            izyVar.b = iu30Var7;
                            izyVar.c = iu30Var6;
                            izyVar.d = null;
                            izyVar.e = null;
                            izyVar.f = null;
                            izyVar.g = null;
                            izyVar.h = null;
                            izyVar.Y = 5;
                            if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                tto0Var4 = tto0Var2;
                                cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                rxd1 rxd1Var7 = cai0Var;
                                izyVar.a = null;
                                izyVar.b = null;
                                izyVar.c = null;
                                izyVar.d = null;
                                izyVar.e = null;
                                izyVar.f = null;
                                izyVar.g = null;
                                izyVar.h = null;
                                izyVar.Y = 6;
                                objS = this.b.s(rxd1Var7, izyVar);
                                if (objS == t45Var3) {
                                    return objS;
                                }
                            }
                        } else {
                            izyVar.a = tto0Var2;
                            izyVar.b = iu30Var7;
                            izyVar.c = iu30Var6;
                            izyVar.d = null;
                            izyVar.e = null;
                            izyVar.f = null;
                            izyVar.g = null;
                            izyVar.h = null;
                            izyVar.Y = 5;
                            if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                                tto0Var4 = tto0Var2;
                                cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                                rxd1 rxd1Var8 = cai0Var;
                                izyVar.a = null;
                                izyVar.b = null;
                                izyVar.c = null;
                                izyVar.d = null;
                                izyVar.e = null;
                                izyVar.f = null;
                                izyVar.g = null;
                                izyVar.h = null;
                                izyVar.Y = 6;
                                objS = this.b.s(rxd1Var8, izyVar);
                                if (objS == t45Var3) {
                                    return objS;
                                }
                            }
                        }
                    }
                }
                return t45Var3;
            case 2:
                lnm lnmVar = izyVar.f;
                iu30Var3 = izyVar.d;
                iu30Var4 = izyVar.c;
                iu30Var5 = izyVar.b;
                tto0Var3 = izyVar.a;
                hm5.M(objG2);
                iu30 iu30Var13 = iu30Var5;
                jzyVar = iu30Var3;
                iu30Var6 = iu30Var4;
                iu30Var7 = iu30Var13;
                tto0Var2 = tto0Var3;
                bitmap = (Bitmap) objG2;
                String str16 = tto0Var2.e;
                String str17 = tto0Var2.f;
                int color9 = Color.parseColor("#FFFFFF");
                int color10 = Color.parseColor("#1ED760");
                Context context5 = this.e;
                iX = (int) o0c.x(context5, 36);
                int iX6 = (int) o0c.x(context5, 10);
                plm plmVar5 = new plm(context5, 2132018135);
                int iO9 = ago1.o(plmVar5, 2130968780, color9);
                int iO10 = ago1.o(plmVar5, 2130968781, color10);
                shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.setIntrinsicWidth(iX);
                shapeDrawable.setIntrinsicHeight(iX);
                shapeDrawable.getPaint().setColor(iO10);
                drawable = context5.getDrawable(2131232314);
                if (drawable != null) {
                    i2 = 0;
                    insetDrawable = null;
                } else {
                    i2 = 0;
                    insetDrawable = null;
                }
                if (insetDrawable != null) {
                    Drawable[] drawableArr5 = new Drawable[2];
                    drawableArr5[i2] = shapeDrawable;
                    drawableArr5[1] = insetDrawable;
                    bitmapCreateBitmap = mno1.z(new LayerDrawable(drawableArr5), i2, i2, 7);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
                }
                if (bitmap != null) {
                    izyVar.a = tto0Var2;
                    izyVar.b = iu30Var7;
                    izyVar.c = iu30Var6;
                    izyVar.d = null;
                    izyVar.e = null;
                    izyVar.f = null;
                    izyVar.g = null;
                    izyVar.h = null;
                    izyVar.Y = 5;
                    if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                        tto0Var4 = tto0Var2;
                        cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                        rxd1 rxd1Var9 = cai0Var;
                        izyVar.a = null;
                        izyVar.b = null;
                        izyVar.c = null;
                        izyVar.d = null;
                        izyVar.e = null;
                        izyVar.f = null;
                        izyVar.g = null;
                        izyVar.h = null;
                        izyVar.Y = 6;
                        objS = this.b.s(rxd1Var9, izyVar);
                        if (objS == t45Var3) {
                            return objS;
                        }
                    }
                } else {
                    izyVar.a = tto0Var2;
                    izyVar.b = iu30Var7;
                    izyVar.c = iu30Var6;
                    izyVar.d = null;
                    izyVar.e = null;
                    izyVar.f = null;
                    izyVar.g = null;
                    izyVar.h = null;
                    izyVar.Y = 5;
                    if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                        tto0Var4 = tto0Var2;
                        cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                        rxd1 rxd1Var10 = cai0Var;
                        izyVar.a = null;
                        izyVar.b = null;
                        izyVar.c = null;
                        izyVar.d = null;
                        izyVar.e = null;
                        izyVar.f = null;
                        izyVar.g = null;
                        izyVar.h = null;
                        izyVar.Y = 6;
                        objS = this.b.s(rxd1Var10, izyVar);
                        if (objS == t45Var3) {
                            return objS;
                        }
                    }
                }
                return t45Var3;
            case 3:
                t45Var2 = (t45) izyVar.g;
                lnm lnmVar2 = izyVar.f;
                str = (String) izyVar.e;
                jzyVar = izyVar.d;
                iu30Var2 = izyVar.c;
                iu30Var = izyVar.b;
                tto0Var2 = izyVar.a;
                try {
                    hm5.M(objG2);
                    t45Var2.g(str);
                    iu30Var6 = iu30Var2;
                    iu30Var7 = iu30Var;
                    bitmap = (Bitmap) objG2;
                    String str18 = tto0Var2.e;
                    String str19 = tto0Var2.f;
                    int color11 = Color.parseColor("#FFFFFF");
                    int color12 = Color.parseColor("#1ED760");
                    Context context6 = this.e;
                    iX = (int) o0c.x(context6, 36);
                    int iX7 = (int) o0c.x(context6, 10);
                    plm plmVar6 = new plm(context6, 2132018135);
                    int iO11 = ago1.o(plmVar6, 2130968780, color11);
                    int iO12 = ago1.o(plmVar6, 2130968781, color12);
                    shapeDrawable = new ShapeDrawable(new OvalShape());
                    shapeDrawable.setIntrinsicWidth(iX);
                    shapeDrawable.setIntrinsicHeight(iX);
                    shapeDrawable.getPaint().setColor(iO12);
                    drawable = context6.getDrawable(2131232314);
                    if (drawable != null) {
                        i2 = 0;
                        insetDrawable = null;
                    } else {
                        i2 = 0;
                        insetDrawable = null;
                    }
                    if (insetDrawable != null) {
                        Drawable[] drawableArr6 = new Drawable[2];
                        drawableArr6[i2] = shapeDrawable;
                        drawableArr6[1] = insetDrawable;
                        bitmapCreateBitmap = mno1.z(new LayerDrawable(drawableArr6), i2, i2, 7);
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(iX, iX, Bitmap.Config.ARGB_8888);
                    }
                    if (bitmap != null) {
                        izyVar.a = tto0Var2;
                        izyVar.b = iu30Var7;
                        izyVar.c = iu30Var6;
                        izyVar.d = null;
                        izyVar.e = null;
                        izyVar.f = null;
                        izyVar.g = null;
                        izyVar.h = null;
                        izyVar.Y = 5;
                        if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                            tto0Var4 = tto0Var2;
                            cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                            rxd1 rxd1Var11 = cai0Var;
                            izyVar.a = null;
                            izyVar.b = null;
                            izyVar.c = null;
                            izyVar.d = null;
                            izyVar.e = null;
                            izyVar.f = null;
                            izyVar.g = null;
                            izyVar.h = null;
                            izyVar.Y = 6;
                            objS = this.b.s(rxd1Var11, izyVar);
                            if (objS == t45Var3) {
                                return objS;
                            }
                        }
                    } else {
                        izyVar.a = tto0Var2;
                        izyVar.b = iu30Var7;
                        izyVar.c = iu30Var6;
                        izyVar.d = null;
                        izyVar.e = null;
                        izyVar.f = null;
                        izyVar.g = null;
                        izyVar.h = null;
                        izyVar.Y = 5;
                        if (qgo1.i("presenter_type", "simple", izyVar) != t45Var3) {
                            tto0Var4 = tto0Var2;
                            cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                            rxd1 rxd1Var12 = cai0Var;
                            izyVar.a = null;
                            izyVar.b = null;
                            izyVar.c = null;
                            izyVar.d = null;
                            izyVar.e = null;
                            izyVar.f = null;
                            izyVar.g = null;
                            izyVar.h = null;
                            izyVar.Y = 6;
                            objS = this.b.s(rxd1Var12, izyVar);
                            if (objS == t45Var3) {
                                return objS;
                            }
                        }
                    }
                    return t45Var3;
                } catch (Throwable th2) {
                    th = th2;
                    t45Var2.g(str);
                    throw th;
                }
            case 4:
                Bitmap bitmap4 = izyVar.h;
                String str20 = (String) izyVar.g;
                String str21 = izyVar.f;
                Bitmap bitmap5 = (Bitmap) izyVar.e;
                iu30 iu30Var14 = izyVar.d;
                iu30 iu30Var15 = izyVar.c;
                iu30 iu30Var16 = izyVar.b;
                tto0Var5 = izyVar.a;
                hm5.M(objG2);
                bitmap2 = bitmap4;
                str3 = str20;
                str2 = str21;
                bitmap3 = bitmap5;
                iu30Var10 = iu30Var14;
                iu30Var8 = iu30Var15;
                iu30Var9 = iu30Var16;
                cai0Var = new cai0(tto0Var5.c, bitmap3, str2, str3, bitmap2, iu30Var9, iu30Var8, iu30Var10, tto0Var5.h, tto0Var5.g);
                rxd1 rxd1Var13 = cai0Var;
                izyVar.a = null;
                izyVar.b = null;
                izyVar.c = null;
                izyVar.d = null;
                izyVar.e = null;
                izyVar.f = null;
                izyVar.g = null;
                izyVar.h = null;
                izyVar.Y = 6;
                objS = this.b.s(rxd1Var13, izyVar);
                if (objS == t45Var3) {
                    return t45Var3;
                }
                return objS;
            case 5:
                iu30Var6 = izyVar.c;
                iu30Var7 = izyVar.b;
                tto0Var4 = izyVar.a;
                hm5.M(objG2);
                cai0Var = new jx81(tto0Var4.c, iu30Var7, iu30Var6, tto0Var4.h, tto0Var4.g, 32);
                rxd1 rxd1Var14 = cai0Var;
                izyVar.a = null;
                izyVar.b = null;
                izyVar.c = null;
                izyVar.d = null;
                izyVar.e = null;
                izyVar.f = null;
                izyVar.g = null;
                izyVar.h = null;
                izyVar.Y = 6;
                objS = this.b.s(rxd1Var14, izyVar);
                if (objS == t45Var3) {
                    return t45Var3;
                }
                return objS;
            case 6:
                hm5.M(objG2);
                return objG2;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0129  */
    /* JADX WARN: Code duplicated, block: B:43:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0207 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0208 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01db, code lost:
    
        if (p.qgo1.i("presenter_type", "simple", r3) == r6) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(p.wto0 r26, p.onm r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kzy.d(p.wto0, p.onm):java.lang.Object");
    }

    public kzy(d520 d520Var, wmy wmyVar, dc31 dc31Var, Context context, jxa jxaVar) {
        this.a = (byte) 0;
        this.b = d520Var;
        this.c = wmyVar;
        this.d = dc31Var;
        this.e = context;
        this.f = rc11.a.b(tto0.class);
    }
}
