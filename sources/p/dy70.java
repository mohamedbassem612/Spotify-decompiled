package p;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dy70 implements owy0 {
    public final d520 a;
    public final wmy b;
    public final dc31 c;
    public final xmu0 d;
    public final mvy0 e;
    public final tka0 f = rc11.a.b(uto0.class);

    public dy70(d520 d520Var, wmy wmyVar, dc31 dc31Var, xmu0 xmu0Var, mvy0 mvy0Var) {
        this.a = d520Var;
        this.b = wmyVar;
        this.c = dc31Var;
        this.d = xmu0Var;
        this.e = mvy0Var;
    }

    @Override // p.owy0
    public final tka0 a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, String str2, onm onmVar) {
        ay70 ay70Var;
        if (onmVar instanceof ay70) {
            ay70Var = (ay70) onmVar;
            int i = ay70Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ay70Var.e = i - Integer.MIN_VALUE;
            } else {
                ay70Var = new ay70(this, onmVar);
            }
        } else {
            ay70Var = new ay70(this, onmVar);
        }
        Object objD = ay70Var.c;
        int i2 = ay70Var.e;
        if (i2 == 0) {
            hm5.M(objD);
            if (Build.VERSION.SDK_INT >= 31) {
                ay70Var.a = str;
                ay70Var.b = str2;
                ay70Var.e = 1;
                objD = this.d.d(str, ay70Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = ay70Var.b;
        str = ay70Var.a;
        hm5.M(objD);
        String str3 = str;
        String str4 = str2;
        if (((Boolean) objD).booleanValue()) {
            return new fe6(this, str4, str3, (lnm) null, (byte) 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x0112  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:41:0x013b  */
    /* JADX WARN: Code duplicated, block: B:45:0x014f  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.owy0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object b(uto0 uto0Var, onm onmVar) throws Throwable {
        by70 by70Var;
        int i;
        iu30 iu30Var;
        String str;
        iu30 iu30Var2;
        String str2;
        t45 t45Var;
        dc31 dc31Var;
        t45 t45Var2;
        Object objG;
        uto0 uto0Var2;
        iu30 iu30Var3;
        iu30 iu30Var4;
        uto0 uto0Var3;
        String str3;
        iu30 iu30Var5;
        iu30 iu30Var6;
        iu30 iu30Var7;
        iu30 iu30Var8;
        Bitmap bitmap;
        uto0 uto0Var4;
        uto0 uto0Var5;
        iu30 iu30Var9;
        String str4;
        iu30 iu30Var10;
        Bitmap bitmap2;
        ujo0 ujo0Var;
        Serializable serializableC;
        ujo0 ujo0Var2;
        rxd1 g080Var;
        Object objS;
        uto0 uto0Var6 = uto0Var;
        if (onmVar instanceof by70) {
            by70Var = (by70) onmVar;
            int i2 = by70Var.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                by70Var.X = i2 - Integer.MIN_VALUE;
            } else {
                by70Var = new by70(this, onmVar);
            }
        } else {
            by70Var = new by70(this, onmVar);
        }
        Object objG2 = by70Var.i;
        int i3 = by70Var.X;
        Serializable serializable = d9n.a;
        switch (i3) {
            case 0:
                hm5.M(objG2);
                cy70 cy70Var = new cy70(this, uto0Var6, (byte) 1);
                i = 0;
                cy70 cy70Var2 = new cy70(this, uto0Var6, 0 == true ? 1 : 0);
                String str5 = uto0Var6.d;
                by70Var.a = uto0Var6;
                by70Var.b = cy70Var;
                by70Var.c = cy70Var2;
                by70Var.d = str5;
                by70Var.e = "image_load";
                by70Var.h = 0;
                by70Var.X = 1;
                Serializable serializableP = qgo1.p(by70Var);
                if (serializableP != serializable) {
                    iu30Var = cy70Var;
                    objG2 = serializableP;
                    str = "image_load";
                    iu30Var2 = cy70Var2;
                    str2 = str5;
                    t45Var = (t45) objG2;
                    dc31Var = this.c;
                    if (t45Var == null) {
                        by70Var.a = uto0Var6;
                        by70Var.b = iu30Var;
                        by70Var.c = iu30Var2;
                        by70Var.d = str2;
                        by70Var.e = null;
                        by70Var.f = null;
                        by70Var.h = i;
                        by70Var.X = 2;
                        objG2 = dc31Var.g(str2, by70Var);
                        if (objG2 != serializable) {
                            uto0Var3 = uto0Var6;
                            str3 = str2;
                            iu30Var5 = iu30Var2;
                            iu30Var6 = iu30Var;
                            iu30 iu30Var11 = iu30Var6;
                            str2 = str3;
                            iu30Var7 = iu30Var5;
                            iu30Var8 = iu30Var11;
                            bitmap = (Bitmap) objG2;
                            if (bitmap != null) {
                                by70Var.a = uto0Var3;
                                by70Var.b = iu30Var8;
                                by70Var.c = iu30Var7;
                                by70Var.d = str2;
                                by70Var.e = bitmap;
                                by70Var.f = null;
                                by70Var.g = null;
                                by70Var.X = 4;
                                if (qgo1.i("presenter_type", "image", by70Var) != serializable) {
                                    uto0Var5 = uto0Var3;
                                    iu30Var9 = iu30Var8;
                                    str4 = str2;
                                    iu30Var10 = iu30Var7;
                                    bitmap2 = bitmap;
                                    ujo0Var = uto0Var5.c;
                                    String str6 = uto0Var5.f.c;
                                    by70Var.a = uto0Var5;
                                    by70Var.b = iu30Var9;
                                    by70Var.c = iu30Var10;
                                    by70Var.d = null;
                                    by70Var.e = null;
                                    by70Var.f = ujo0Var;
                                    by70Var.g = bitmap2;
                                    by70Var.X = 5;
                                    serializableC = c(str4, str6, by70Var);
                                    if (serializableC != serializable) {
                                        ujo0Var2 = ujo0Var;
                                        objG2 = serializableC;
                                        g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                                        by70Var.a = null;
                                        by70Var.b = null;
                                        by70Var.c = null;
                                        by70Var.d = null;
                                        by70Var.e = null;
                                        by70Var.f = null;
                                        by70Var.g = null;
                                        by70Var.X = 7;
                                        objS = this.a.s(g080Var, by70Var);
                                        if (objS != serializable) {
                                            return objS;
                                        }
                                    }
                                }
                            } else {
                                by70Var.a = uto0Var3;
                                by70Var.b = iu30Var8;
                                by70Var.c = iu30Var7;
                                by70Var.d = null;
                                by70Var.e = null;
                                by70Var.f = null;
                                by70Var.g = null;
                                by70Var.X = 6;
                                if (qgo1.i("presenter_type", "simple", by70Var) != serializable) {
                                    uto0Var4 = uto0Var3;
                                    g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                                    by70Var.a = null;
                                    by70Var.b = null;
                                    by70Var.c = null;
                                    by70Var.d = null;
                                    by70Var.e = null;
                                    by70Var.f = null;
                                    by70Var.g = null;
                                    by70Var.X = 7;
                                    objS = this.a.s(g080Var, by70Var);
                                    if (objS != serializable) {
                                        return objS;
                                    }
                                }
                            }
                        }
                    } else {
                        t45.m(t45Var, str, 2);
                        try {
                            by70Var.a = uto0Var6;
                            by70Var.b = iu30Var;
                            by70Var.c = iu30Var2;
                            by70Var.d = str2;
                            by70Var.e = str;
                            by70Var.f = null;
                            by70Var.g = t45Var;
                            by70Var.h = i;
                            by70Var.X = 3;
                            objG = dc31Var.g(str2, by70Var);
                            if (objG != serializable) {
                                iu30 iu30Var12 = iu30Var;
                                uto0Var2 = uto0Var6;
                                t45Var2 = t45Var;
                                objG2 = objG;
                                iu30Var3 = iu30Var2;
                                iu30Var4 = iu30Var12;
                                t45Var2.g(str);
                                iu30Var7 = iu30Var3;
                                iu30Var8 = iu30Var4;
                                uto0Var3 = uto0Var2;
                                bitmap = (Bitmap) objG2;
                                if (bitmap != null) {
                                    by70Var.a = uto0Var3;
                                    by70Var.b = iu30Var8;
                                    by70Var.c = iu30Var7;
                                    by70Var.d = str2;
                                    by70Var.e = bitmap;
                                    by70Var.f = null;
                                    by70Var.g = null;
                                    by70Var.X = 4;
                                    if (qgo1.i("presenter_type", "image", by70Var) != serializable) {
                                        uto0Var5 = uto0Var3;
                                        iu30Var9 = iu30Var8;
                                        str4 = str2;
                                        iu30Var10 = iu30Var7;
                                        bitmap2 = bitmap;
                                        ujo0Var = uto0Var5.c;
                                        String str7 = uto0Var5.f.c;
                                        by70Var.a = uto0Var5;
                                        by70Var.b = iu30Var9;
                                        by70Var.c = iu30Var10;
                                        by70Var.d = null;
                                        by70Var.e = null;
                                        by70Var.f = ujo0Var;
                                        by70Var.g = bitmap2;
                                        by70Var.X = 5;
                                        serializableC = c(str4, str7, by70Var);
                                        if (serializableC != serializable) {
                                            ujo0Var2 = ujo0Var;
                                            objG2 = serializableC;
                                            g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                                            by70Var.a = null;
                                            by70Var.b = null;
                                            by70Var.c = null;
                                            by70Var.d = null;
                                            by70Var.e = null;
                                            by70Var.f = null;
                                            by70Var.g = null;
                                            by70Var.X = 7;
                                            objS = this.a.s(g080Var, by70Var);
                                            if (objS != serializable) {
                                                return objS;
                                            }
                                        }
                                    }
                                } else {
                                    by70Var.a = uto0Var3;
                                    by70Var.b = iu30Var8;
                                    by70Var.c = iu30Var7;
                                    by70Var.d = null;
                                    by70Var.e = null;
                                    by70Var.f = null;
                                    by70Var.g = null;
                                    by70Var.X = 6;
                                    if (qgo1.i("presenter_type", "simple", by70Var) != serializable) {
                                        uto0Var4 = uto0Var3;
                                        g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                                        by70Var.a = null;
                                        by70Var.b = null;
                                        by70Var.c = null;
                                        by70Var.d = null;
                                        by70Var.e = null;
                                        by70Var.f = null;
                                        by70Var.g = null;
                                        by70Var.X = 7;
                                        objS = this.a.s(g080Var, by70Var);
                                        if (objS != serializable) {
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
                return serializable;
            case 1:
                int i4 = by70Var.h;
                str = (String) by70Var.e;
                str2 = by70Var.d;
                iu30 iu30Var13 = by70Var.c;
                iu30 iu30Var14 = by70Var.b;
                uto0 uto0Var7 = by70Var.a;
                hm5.M(objG2);
                i = i4;
                uto0Var6 = uto0Var7;
                iu30Var = iu30Var14;
                iu30Var2 = iu30Var13;
                t45Var = (t45) objG2;
                dc31Var = this.c;
                if (t45Var == null) {
                    by70Var.a = uto0Var6;
                    by70Var.b = iu30Var;
                    by70Var.c = iu30Var2;
                    by70Var.d = str2;
                    by70Var.e = null;
                    by70Var.f = null;
                    by70Var.h = i;
                    by70Var.X = 2;
                    objG2 = dc31Var.g(str2, by70Var);
                    if (objG2 != serializable) {
                        uto0Var3 = uto0Var6;
                        str3 = str2;
                        iu30Var5 = iu30Var2;
                        iu30Var6 = iu30Var;
                        iu30 iu30Var15 = iu30Var6;
                        str2 = str3;
                        iu30Var7 = iu30Var5;
                        iu30Var8 = iu30Var15;
                        bitmap = (Bitmap) objG2;
                        if (bitmap != null) {
                            by70Var.a = uto0Var3;
                            by70Var.b = iu30Var8;
                            by70Var.c = iu30Var7;
                            by70Var.d = str2;
                            by70Var.e = bitmap;
                            by70Var.f = null;
                            by70Var.g = null;
                            by70Var.X = 4;
                            if (qgo1.i("presenter_type", "image", by70Var) != serializable) {
                                uto0Var5 = uto0Var3;
                                iu30Var9 = iu30Var8;
                                str4 = str2;
                                iu30Var10 = iu30Var7;
                                bitmap2 = bitmap;
                                ujo0Var = uto0Var5.c;
                                String str8 = uto0Var5.f.c;
                                by70Var.a = uto0Var5;
                                by70Var.b = iu30Var9;
                                by70Var.c = iu30Var10;
                                by70Var.d = null;
                                by70Var.e = null;
                                by70Var.f = ujo0Var;
                                by70Var.g = bitmap2;
                                by70Var.X = 5;
                                serializableC = c(str4, str8, by70Var);
                                if (serializableC != serializable) {
                                    ujo0Var2 = ujo0Var;
                                    objG2 = serializableC;
                                    g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                                    by70Var.a = null;
                                    by70Var.b = null;
                                    by70Var.c = null;
                                    by70Var.d = null;
                                    by70Var.e = null;
                                    by70Var.f = null;
                                    by70Var.g = null;
                                    by70Var.X = 7;
                                    objS = this.a.s(g080Var, by70Var);
                                    if (objS != serializable) {
                                        return objS;
                                    }
                                }
                            }
                        } else {
                            by70Var.a = uto0Var3;
                            by70Var.b = iu30Var8;
                            by70Var.c = iu30Var7;
                            by70Var.d = null;
                            by70Var.e = null;
                            by70Var.f = null;
                            by70Var.g = null;
                            by70Var.X = 6;
                            if (qgo1.i("presenter_type", "simple", by70Var) != serializable) {
                                uto0Var4 = uto0Var3;
                                g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                                by70Var.a = null;
                                by70Var.b = null;
                                by70Var.c = null;
                                by70Var.d = null;
                                by70Var.e = null;
                                by70Var.f = null;
                                by70Var.g = null;
                                by70Var.X = 7;
                                objS = this.a.s(g080Var, by70Var);
                                if (objS != serializable) {
                                    return objS;
                                }
                            }
                        }
                    }
                } else {
                    t45.m(t45Var, str, 2);
                    by70Var.a = uto0Var6;
                    by70Var.b = iu30Var;
                    by70Var.c = iu30Var2;
                    by70Var.d = str2;
                    by70Var.e = str;
                    by70Var.f = null;
                    by70Var.g = t45Var;
                    by70Var.h = i;
                    by70Var.X = 3;
                    objG = dc31Var.g(str2, by70Var);
                    if (objG != serializable) {
                        iu30 iu30Var16 = iu30Var;
                        uto0Var2 = uto0Var6;
                        t45Var2 = t45Var;
                        objG2 = objG;
                        iu30Var3 = iu30Var2;
                        iu30Var4 = iu30Var16;
                        t45Var2.g(str);
                        iu30Var7 = iu30Var3;
                        iu30Var8 = iu30Var4;
                        uto0Var3 = uto0Var2;
                        bitmap = (Bitmap) objG2;
                        if (bitmap != null) {
                            by70Var.a = uto0Var3;
                            by70Var.b = iu30Var8;
                            by70Var.c = iu30Var7;
                            by70Var.d = str2;
                            by70Var.e = bitmap;
                            by70Var.f = null;
                            by70Var.g = null;
                            by70Var.X = 4;
                            if (qgo1.i("presenter_type", "image", by70Var) != serializable) {
                                uto0Var5 = uto0Var3;
                                iu30Var9 = iu30Var8;
                                str4 = str2;
                                iu30Var10 = iu30Var7;
                                bitmap2 = bitmap;
                                ujo0Var = uto0Var5.c;
                                String str9 = uto0Var5.f.c;
                                by70Var.a = uto0Var5;
                                by70Var.b = iu30Var9;
                                by70Var.c = iu30Var10;
                                by70Var.d = null;
                                by70Var.e = null;
                                by70Var.f = ujo0Var;
                                by70Var.g = bitmap2;
                                by70Var.X = 5;
                                serializableC = c(str4, str9, by70Var);
                                if (serializableC != serializable) {
                                    ujo0Var2 = ujo0Var;
                                    objG2 = serializableC;
                                    g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                                    by70Var.a = null;
                                    by70Var.b = null;
                                    by70Var.c = null;
                                    by70Var.d = null;
                                    by70Var.e = null;
                                    by70Var.f = null;
                                    by70Var.g = null;
                                    by70Var.X = 7;
                                    objS = this.a.s(g080Var, by70Var);
                                    if (objS != serializable) {
                                        return objS;
                                    }
                                }
                            }
                        } else {
                            by70Var.a = uto0Var3;
                            by70Var.b = iu30Var8;
                            by70Var.c = iu30Var7;
                            by70Var.d = null;
                            by70Var.e = null;
                            by70Var.f = null;
                            by70Var.g = null;
                            by70Var.X = 6;
                            if (qgo1.i("presenter_type", "simple", by70Var) != serializable) {
                                uto0Var4 = uto0Var3;
                                g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                                by70Var.a = null;
                                by70Var.b = null;
                                by70Var.c = null;
                                by70Var.d = null;
                                by70Var.e = null;
                                by70Var.f = null;
                                by70Var.g = null;
                                by70Var.X = 7;
                                objS = this.a.s(g080Var, by70Var);
                                if (objS != serializable) {
                                    return objS;
                                }
                            }
                        }
                    }
                }
                return serializable;
            case 2:
                lnm lnmVar = by70Var.f;
                str3 = by70Var.d;
                iu30Var5 = by70Var.c;
                iu30Var6 = by70Var.b;
                uto0Var3 = by70Var.a;
                hm5.M(objG2);
                iu30 iu30Var17 = iu30Var6;
                str2 = str3;
                iu30Var7 = iu30Var5;
                iu30Var8 = iu30Var17;
                bitmap = (Bitmap) objG2;
                if (bitmap != null) {
                    by70Var.a = uto0Var3;
                    by70Var.b = iu30Var8;
                    by70Var.c = iu30Var7;
                    by70Var.d = str2;
                    by70Var.e = bitmap;
                    by70Var.f = null;
                    by70Var.g = null;
                    by70Var.X = 4;
                    if (qgo1.i("presenter_type", "image", by70Var) != serializable) {
                        uto0Var5 = uto0Var3;
                        iu30Var9 = iu30Var8;
                        str4 = str2;
                        iu30Var10 = iu30Var7;
                        bitmap2 = bitmap;
                        ujo0Var = uto0Var5.c;
                        String str10 = uto0Var5.f.c;
                        by70Var.a = uto0Var5;
                        by70Var.b = iu30Var9;
                        by70Var.c = iu30Var10;
                        by70Var.d = null;
                        by70Var.e = null;
                        by70Var.f = ujo0Var;
                        by70Var.g = bitmap2;
                        by70Var.X = 5;
                        serializableC = c(str4, str10, by70Var);
                        if (serializableC != serializable) {
                            ujo0Var2 = ujo0Var;
                            objG2 = serializableC;
                            g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                            by70Var.a = null;
                            by70Var.b = null;
                            by70Var.c = null;
                            by70Var.d = null;
                            by70Var.e = null;
                            by70Var.f = null;
                            by70Var.g = null;
                            by70Var.X = 7;
                            objS = this.a.s(g080Var, by70Var);
                            if (objS != serializable) {
                                return objS;
                            }
                        }
                    }
                } else {
                    by70Var.a = uto0Var3;
                    by70Var.b = iu30Var8;
                    by70Var.c = iu30Var7;
                    by70Var.d = null;
                    by70Var.e = null;
                    by70Var.f = null;
                    by70Var.g = null;
                    by70Var.X = 6;
                    if (qgo1.i("presenter_type", "simple", by70Var) != serializable) {
                        uto0Var4 = uto0Var3;
                        g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                        by70Var.a = null;
                        by70Var.b = null;
                        by70Var.c = null;
                        by70Var.d = null;
                        by70Var.e = null;
                        by70Var.f = null;
                        by70Var.g = null;
                        by70Var.X = 7;
                        objS = this.a.s(g080Var, by70Var);
                        if (objS != serializable) {
                            return objS;
                        }
                    }
                }
                return serializable;
            case 3:
                t45Var2 = (t45) by70Var.g;
                lnm lnmVar2 = by70Var.f;
                str = (String) by70Var.e;
                str2 = by70Var.d;
                iu30Var3 = by70Var.c;
                iu30Var4 = by70Var.b;
                uto0Var2 = by70Var.a;
                try {
                    hm5.M(objG2);
                    t45Var2.g(str);
                    iu30Var7 = iu30Var3;
                    iu30Var8 = iu30Var4;
                    uto0Var3 = uto0Var2;
                    bitmap = (Bitmap) objG2;
                    if (bitmap != null) {
                        by70Var.a = uto0Var3;
                        by70Var.b = iu30Var8;
                        by70Var.c = iu30Var7;
                        by70Var.d = str2;
                        by70Var.e = bitmap;
                        by70Var.f = null;
                        by70Var.g = null;
                        by70Var.X = 4;
                        if (qgo1.i("presenter_type", "image", by70Var) != serializable) {
                            uto0Var5 = uto0Var3;
                            iu30Var9 = iu30Var8;
                            str4 = str2;
                            iu30Var10 = iu30Var7;
                            bitmap2 = bitmap;
                            ujo0Var = uto0Var5.c;
                            String str11 = uto0Var5.f.c;
                            by70Var.a = uto0Var5;
                            by70Var.b = iu30Var9;
                            by70Var.c = iu30Var10;
                            by70Var.d = null;
                            by70Var.e = null;
                            by70Var.f = ujo0Var;
                            by70Var.g = bitmap2;
                            by70Var.X = 5;
                            serializableC = c(str4, str11, by70Var);
                            if (serializableC != serializable) {
                                ujo0Var2 = ujo0Var;
                                objG2 = serializableC;
                                g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                                by70Var.a = null;
                                by70Var.b = null;
                                by70Var.c = null;
                                by70Var.d = null;
                                by70Var.e = null;
                                by70Var.f = null;
                                by70Var.g = null;
                                by70Var.X = 7;
                                objS = this.a.s(g080Var, by70Var);
                                if (objS != serializable) {
                                    return objS;
                                }
                            }
                        }
                    } else {
                        by70Var.a = uto0Var3;
                        by70Var.b = iu30Var8;
                        by70Var.c = iu30Var7;
                        by70Var.d = null;
                        by70Var.e = null;
                        by70Var.f = null;
                        by70Var.g = null;
                        by70Var.X = 6;
                        if (qgo1.i("presenter_type", "simple", by70Var) != serializable) {
                            uto0Var4 = uto0Var3;
                            g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                            by70Var.a = null;
                            by70Var.b = null;
                            by70Var.c = null;
                            by70Var.d = null;
                            by70Var.e = null;
                            by70Var.f = null;
                            by70Var.g = null;
                            by70Var.X = 7;
                            objS = this.a.s(g080Var, by70Var);
                            if (objS != serializable) {
                                return objS;
                            }
                        }
                    }
                    return serializable;
                } catch (Throwable th2) {
                    th = th2;
                    t45Var2.g(str);
                    throw th;
                }
            case 4:
                bitmap2 = (Bitmap) by70Var.e;
                str4 = by70Var.d;
                iu30Var10 = by70Var.c;
                iu30Var9 = by70Var.b;
                uto0Var5 = by70Var.a;
                hm5.M(objG2);
                ujo0Var = uto0Var5.c;
                String str12 = uto0Var5.f.c;
                by70Var.a = uto0Var5;
                by70Var.b = iu30Var9;
                by70Var.c = iu30Var10;
                by70Var.d = null;
                by70Var.e = null;
                by70Var.f = ujo0Var;
                by70Var.g = bitmap2;
                by70Var.X = 5;
                serializableC = c(str4, str12, by70Var);
                if (serializableC != serializable) {
                    ujo0Var2 = ujo0Var;
                    objG2 = serializableC;
                    g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                    by70Var.a = null;
                    by70Var.b = null;
                    by70Var.c = null;
                    by70Var.d = null;
                    by70Var.e = null;
                    by70Var.f = null;
                    by70Var.g = null;
                    by70Var.X = 7;
                    objS = this.a.s(g080Var, by70Var);
                    if (objS != serializable) {
                        return objS;
                    }
                }
                return serializable;
            case 5:
                bitmap2 = (Bitmap) by70Var.g;
                ujo0 ujo0Var3 = by70Var.f;
                iu30Var10 = by70Var.c;
                iu30Var9 = by70Var.b;
                uto0Var5 = by70Var.a;
                hm5.M(objG2);
                ujo0Var2 = ujo0Var3;
                g080Var = new g080(ujo0Var2, bitmap2, (vu30) objG2, iu30Var9, iu30Var10, uto0Var5.f, uto0Var5.e, null);
                by70Var.a = null;
                by70Var.b = null;
                by70Var.c = null;
                by70Var.d = null;
                by70Var.e = null;
                by70Var.f = null;
                by70Var.g = null;
                by70Var.X = 7;
                objS = this.a.s(g080Var, by70Var);
                if (objS != serializable) {
                    return serializable;
                }
                return objS;
            case 6:
                iu30Var7 = by70Var.c;
                iu30Var8 = by70Var.b;
                uto0Var4 = by70Var.a;
                hm5.M(objG2);
                g080Var = new jx81(uto0Var4.c, iu30Var8, iu30Var7, uto0Var4.f, uto0Var4.e, 32);
                by70Var.a = null;
                by70Var.b = null;
                by70Var.c = null;
                by70Var.d = null;
                by70Var.e = null;
                by70Var.f = null;
                by70Var.g = null;
                by70Var.X = 7;
                objS = this.a.s(g080Var, by70Var);
                if (objS != serializable) {
                    return serializable;
                }
                return objS;
            case 7:
                rxd1 rxd1Var = by70Var.f;
                hm5.M(objG2);
                return objG2;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
