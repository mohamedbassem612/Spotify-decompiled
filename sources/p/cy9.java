package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.net.Uri;
import android.view.View;
import com.google.protobuf.Int32Value;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cy9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy9(oei1 oei1Var, int i, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.d = oei1Var;
        this.c = i;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new cy9(obj2, this.c, lnmVar, (byte) 0);
            case 1:
                return new cy9(obj2, this.c, lnmVar, (byte) 1);
            case 2:
                cy9 cy9Var = new cy9(obj2, lnmVar, (byte) 2);
                cy9Var.c = ((Number) obj).intValue();
                return cy9Var;
            case 3:
                return new cy9(obj2, this.c, lnmVar, (byte) 3);
            case 4:
                cy9 cy9Var2 = new cy9(obj2, lnmVar, (byte) 4);
                cy9Var2.c = ((Number) obj).intValue();
                return cy9Var2;
            case 5:
                return new cy9(obj2, this.c, lnmVar, (byte) 5);
            case 6:
                return new cy9(this.c, (mtr) obj2, lnmVar);
            case 7:
                return new cy9(obj2, this.c, lnmVar, (byte) 7);
            case 8:
                return new cy9(obj2, this.c, lnmVar, (byte) 8);
            case 9:
                return new cy9(obj2, this.c, lnmVar, (byte) 9);
            case 10:
                return new cy9((oei1) obj2, this.c, this.b, lnmVar);
            case 11:
                return new cy9(obj2, this.c, lnmVar, (byte) 11);
            case 12:
                return new cy9(obj2, this.c, lnmVar, (byte) 12);
            case 13:
                return new cy9(obj2, this.c, lnmVar, (byte) 13);
            case 14:
                cy9 cy9Var3 = new cy9(obj2, lnmVar, (byte) 14);
                cy9Var3.c = ((Number) obj).intValue();
                return cy9Var3;
            default:
                cy9 cy9Var4 = new cy9(obj2, lnmVar, (byte) 15);
                cy9Var4.c = ((Number) obj).intValue();
                return cy9Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objC;
        qoo qooVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                    return (Uri) objC;
                }
                hm5.M(obj);
                d6b d6bVar = ((by9) obj2).a;
                if (d6bVar != null) {
                    int i = this.c;
                    this.b = true;
                    ic9 ic9Var = d6bVar.a;
                    Bitmap bitmap = d6bVar.b;
                    int iG = z4p1.G(z4p1.e(i));
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    paint.setColor(iG);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
                    paint.setColor(-15592942);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
                    objC = ((zxa) ic9Var.c).c(bitmapCreateBitmap, Bitmap.CompressFormat.PNG, 100, this);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                    return (Uri) objC;
                }
                return null;
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
                h0y h0yVar = (h0y) ((q59) obj2).c;
                int i2 = this.c;
                this.b = true;
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                Paint paint2 = new Paint(1);
                paint2.setShader(new RadialGradient(540.0f, 960.0f, 540.0f, new int[]{uah.i(855638016, -14737633), uah.i(855638016, i2)}, new float[]{0.2f, 1.0f}, Shader.TileMode.CLAMP));
                int iSave = canvas2.save();
                canvas2.scale(3.6f, 5.688889f, 540.0f, 960.0f);
                try {
                    canvas2.drawRect(0.0f, 0.0f, 1080.0f, 1920.0f, paint2);
                    canvas2.restoreToCount(iSave);
                    Object objC2 = ((zxa) h0yVar.b).c(bitmapCreateBitmap2, Bitmap.CompressFormat.PNG, 100, this);
                    return objC2 == d9nVar ? d9nVar : objC2;
                } catch (Throwable th) {
                    canvas2.restoreToCount(iSave);
                    throw th;
                }
            case 2:
                int i3 = this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (i3 <= 0) {
                        return rih1Var;
                    }
                    this.c = i3;
                    this.b = true;
                    if (hap1.i(100L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((ven0) obj2).setValue(Boolean.FALSE);
                return rih1Var;
            case 3:
                him himVar = (him) obj2;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    mr20 mr20VarI = t5p1.i(himVar.d.a);
                    bvg bvgVar = new bvg(2, (lnm) null, (byte) 1);
                    this.b = true;
                    if (b5p1.j(mr20VarI, bvgVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                himVar.d.a(ixb.c);
                kt91 kt91Var = himVar.e;
                int i4 = this.c;
                n57.k(i4 != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i4)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i4), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 4:
                int i5 = this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zq80 zq80VarP = Int32Value.p();
                zq80VarP.n(i5);
                Int32Value int32ValueBuild = zq80VarP.build();
                this.c = i5;
                this.b = true;
                return ((vu30) obj2).invoke(int32ValueBuild, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                sir sirVar = (sir) obj2;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dkm dkmVar = new dkm(sirVar.c, (byte) 23);
                ytw0 ytw0Var = jfv.b;
                bge bgeVarR = fbp1.r(dkmVar, fdg1.k0(this.c, ngv.e));
                fdd fddVar = new fdd(sirVar, (byte) 28);
                this.b = true;
                return bgeVarR.collect(fddVar, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    long j = ((long) this.c) * 1000;
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((mtr) obj2).a();
                return rih1Var;
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    int i6 = this.c;
                    this.b = true;
                    return ((bp60) obj2).a(i6, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z8) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int i7 = this.c;
                this.b = true;
                o3r o3rVar = w5b0.h;
                Object objJ = b5p1.j(((w5b0) obj2).b.c(), new s5x(i7, null, (byte) 1), this);
                if (objJ != d9nVar) {
                    objJ = rih1Var;
                }
                return objJ == d9nVar ? d9nVar : rih1Var;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ysb0 ysb0Var = ((ftb0) obj2).P0;
                int i8 = this.c;
                this.b = true;
                return ysb0Var.f(i8, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                hm5.M(obj);
                return rih1Var;
            case 11:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xtb0 xtb0Var = ((fgz0) obj2).a;
                int i9 = this.c;
                this.b = true;
                df41 df41Var = xtb0.y;
                return xtb0Var.k(i9, 0, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gm01 gm01Var = (gm01) ((l0x0) obj2).b;
                int i10 = this.c;
                this.b = true;
                Object objZ = qyo1.z(this, new po60(i10, (byte) 27), gm01Var.a, false, true);
                if (objZ != d9nVar) {
                    objZ = rih1Var;
                }
                return objZ == d9nVar ? d9nVar : rih1Var;
            case 13:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt41 dt41Var = (dt41) obj2;
                es41 es41Var = dt41Var.a;
                int i11 = this.c;
                pxg1 pxg1Var = dt41Var.c;
                this.b = true;
                return es41Var.f(i11, pxg1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                icd1 icd1Var = (icd1) obj2;
                int i12 = this.c;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (i12 <= icd1Var.f.a.l(q8o.a, 0)) {
                    return rih1Var;
                }
                this.c = i12;
                this.b = true;
                return icd1Var.d(i12, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (Math.abs(this.c) != 1 || (qooVar = ((n4e1) obj2).b1) == null) {
                    return rih1Var;
                }
                this.b = true;
                Object objS = smo1.s(new eum(qooVar, (lnm) null, (byte) 12), this);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy9(Object obj, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy9(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy9(int i, mtr mtrVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.c = i;
        this.d = mtrVar;
    }
}
