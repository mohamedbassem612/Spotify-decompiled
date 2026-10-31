package p;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v9e1 extends hba {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final t9e1 F;
    public final t9e1 G;
    public final HashMap H;
    public final q5f0 I;
    public final ArrayList J;
    public final i9e1 K;
    public final cdf0 L;
    public final fcf0 M;
    public final y8h N;
    public isi1 O;
    public final y8h P;
    public isi1 Q;
    public final cr20 R;
    public isi1 S;
    public final cr20 T;
    public isi1 U;
    public isi1 V;
    public isi1 W;

    public v9e1(cdf0 cdf0Var, qkb0 qkb0Var) {
        q95 q95Var;
        q95 q95Var2;
        p95 p95Var;
        p95 p95Var2;
        super(cdf0Var, qkb0Var);
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        t9e1 t9e1Var = new t9e1(1);
        t9e1Var.setStyle(Paint.Style.FILL);
        this.F = t9e1Var;
        t9e1 t9e1Var2 = new t9e1(1);
        t9e1Var2.setStyle(Paint.Style.STROKE);
        this.G = t9e1Var2;
        this.H = new HashMap();
        this.I = new q5f0((Object) null);
        this.J = new ArrayList();
        this.L = cdf0Var;
        this.M = qkb0Var.b;
        i9e1 i9e1Var = new i9e1((List) qkb0Var.q.b);
        this.K = i9e1Var;
        i9e1Var.a(this);
        d(i9e1Var);
        yu3 yu3Var = qkb0Var.r;
        if (yu3Var != null && (p95Var2 = (p95) yu3Var.b) != null) {
            y8h y8hVarC0 = p95Var2.c0();
            this.N = y8hVarC0;
            y8hVarC0.a(this);
            d(y8hVarC0);
        }
        if (yu3Var != null && (p95Var = (p95) yu3Var.c) != null) {
            y8h y8hVarC1 = p95Var.c0();
            this.P = y8hVarC1;
            y8hVarC1.a(this);
            d(y8hVarC1);
        }
        if (yu3Var != null && (q95Var2 = (q95) yu3Var.d) != null) {
            cr20 cr20VarC0 = q95Var2.c0();
            this.R = cr20VarC0;
            cr20VarC0.a(this);
            d(cr20VarC0);
        }
        if (yu3Var == null || (q95Var = (q95) yu3Var.e) == null) {
            return;
        }
        cr20 cr20VarC1 = q95Var.c0();
        this.T = cr20VarC1;
        cr20VarC1.a(this);
        d(cr20VarC1);
    }

    public static void s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        fcf0 fcf0Var = this.M;
        rectF.set(0.0f, 0.0f, fcf0Var.k.width(), fcf0Var.k.height());
    }

    public final void g(Object obj, j2e0 j2e0Var) {
        super.g(obj, j2e0Var);
        PointF pointF = ndf0.a;
        if (obj == 1) {
            isi1 isi1Var = this.O;
            if (isi1Var != null) {
                o(isi1Var);
            }
            if (j2e0Var == null) {
                this.O = null;
                return;
            }
            isi1 isi1Var2 = new isi1((Object) null, j2e0Var);
            this.O = isi1Var2;
            isi1Var2.a(this);
            d(this.O);
            return;
        }
        if (obj == 2) {
            isi1 isi1Var3 = this.Q;
            if (isi1Var3 != null) {
                o(isi1Var3);
            }
            if (j2e0Var == null) {
                this.Q = null;
                return;
            }
            isi1 isi1Var4 = new isi1((Object) null, j2e0Var);
            this.Q = isi1Var4;
            isi1Var4.a(this);
            d(this.Q);
            return;
        }
        if (obj == ndf0.n) {
            isi1 isi1Var5 = this.S;
            if (isi1Var5 != null) {
                o(isi1Var5);
            }
            if (j2e0Var == null) {
                this.S = null;
                return;
            }
            isi1 isi1Var6 = new isi1((Object) null, j2e0Var);
            this.S = isi1Var6;
            isi1Var6.a(this);
            d(this.S);
            return;
        }
        if (obj == ndf0.o) {
            isi1 isi1Var7 = this.U;
            if (isi1Var7 != null) {
                o(isi1Var7);
            }
            if (j2e0Var == null) {
                this.U = null;
                return;
            }
            isi1 isi1Var8 = new isi1((Object) null, j2e0Var);
            this.U = isi1Var8;
            isi1Var8.a(this);
            d(this.U);
            return;
        }
        if (obj == ndf0.A) {
            isi1 isi1Var9 = this.V;
            if (isi1Var9 != null) {
                o(isi1Var9);
            }
            if (j2e0Var == null) {
                this.V = null;
                return;
            }
            isi1 isi1Var10 = new isi1((Object) null, j2e0Var);
            this.V = isi1Var10;
            isi1Var10.a(this);
            d(this.V);
            return;
        }
        if (obj != ndf0.H) {
            if (obj == ndf0.J) {
                i9e1 i9e1Var = this.K;
                i9e1Var.getClass();
                i9e1Var.j(new h9e1(new fdf0(), j2e0Var, new zpu()));
                return;
            }
            return;
        }
        isi1 isi1Var11 = this.W;
        if (isi1Var11 != null) {
            o(isi1Var11);
        }
        if (j2e0Var == null) {
            this.W = null;
            return;
        }
        isi1 isi1Var12 = new isi1((Object) null, j2e0Var);
        this.W = isi1Var12;
        isi1Var12.a(this);
        d(this.W);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x035a  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:157:0x0407  */
    /* JADX WARN: Code duplicated, block: B:160:0x0410  */
    /* JADX WARN: Code duplicated, block: B:163:0x0426  */
    /* JADX WARN: Code duplicated, block: B:179:0x0474  */
    /* JADX WARN: Code duplicated, block: B:180:0x047d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0488 A[LOOP:9: B:181:0x0486->B:182:0x0488, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:187:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:204:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:55:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:60:0x018c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01da A[LOOP:4: B:67:0x01d8->B:68:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:75:0x022e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0235  */
    /* JADX WARN: Code duplicated, block: B:81:0x0262  */
    public final void j(Canvas canvas, Matrix matrix, int i) {
        String str;
        Typeface typeface;
        Typeface typefaceCreateFromAsset;
        int i2;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i3;
        int i4;
        PointF pointF;
        float f;
        float f2;
        List listW;
        int i5;
        u9e1 u9e1Var;
        String str2;
        int length;
        int iCodePointAt;
        int iCharCount;
        z830 z830Var;
        long j;
        q5f0 q5f0Var;
        StringBuilder sb;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        Canvas canvas2;
        float fFloatValue2;
        float f3;
        int i6;
        int i7;
        PointF pointF2;
        float f4;
        float f5;
        List listW2;
        int i8;
        u9e1 u9e1Var2;
        String str3;
        int i9;
        c930 c930Var;
        HashMap map;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i10;
        List list;
        int i11;
        Path path;
        v9e1 v9e1Var = this;
        zpu zpuVar = (zpu) v9e1Var.K.e();
        fcf0 fcf0Var = v9e1Var.M;
        z830 z830Var2 = (z830) fcf0Var.f.get(zpuVar.b);
        if (z830Var2 == null) {
            return;
        }
        String str4 = z830Var2.c;
        String str5 = z830Var2.a;
        canvas.save();
        canvas.concat(matrix);
        isi1 isi1Var = v9e1Var.O;
        t9e1 t9e1Var = v9e1Var.F;
        if (isi1Var != null) {
            t9e1Var.setColor(((Integer) isi1Var.e()).intValue());
        } else {
            y8h y8hVar = v9e1Var.N;
            if (y8hVar != null) {
                t9e1Var.setColor(((Integer) y8hVar.e()).intValue());
            } else {
                t9e1Var.setColor(zpuVar.h);
            }
        }
        isi1 isi1Var2 = v9e1Var.Q;
        t9e1 t9e1Var2 = v9e1Var.G;
        if (isi1Var2 != null) {
            t9e1Var2.setColor(((Integer) isi1Var2.e()).intValue());
        } else {
            y8h y8hVar2 = v9e1Var.P;
            if (y8hVar2 != null) {
                t9e1Var2.setColor(((Integer) y8hVar2.e()).intValue());
            } else {
                t9e1Var2.setColor(zpuVar.i);
            }
        }
        fba fbaVar = ((hba) v9e1Var).w.j;
        int iIntValue = ((((fbaVar == null ? 100 : ((Integer) fbaVar.e()).intValue()) * 255) / 100) * i) / 255;
        t9e1Var.setAlpha(iIntValue);
        t9e1Var2.setAlpha(iIntValue);
        isi1 isi1Var3 = v9e1Var.S;
        if (isi1Var3 != null) {
            t9e1Var2.setStrokeWidth(((Float) isi1Var3.e()).floatValue());
        } else {
            cr20 cr20Var = v9e1Var.R;
            if (cr20Var != null) {
                t9e1Var2.setStrokeWidth(((Float) cr20Var.e()).floatValue());
            } else {
                t9e1Var2.setStrokeWidth(qpi1.c() * zpuVar.j);
            }
        }
        cdf0 cdf0Var = v9e1Var.L;
        Map map2 = cdf0Var.t;
        String str6 = "\n";
        cr20 cr20Var2 = v9e1Var.T;
        if (map2 != null || cdf0Var.a.h.g() <= 0) {
            isi1 isi1Var4 = v9e1Var.W;
            if (isi1Var4 == null || (typeface = (Typeface) isi1Var4.e()) == null) {
                Map map3 = cdf0Var.t;
                if (map3 != null) {
                    if (map3.containsKey(str5)) {
                        typeface = (Typeface) map3.get(str5);
                    } else {
                        String str7 = z830Var2.b;
                        if (map3.containsKey(str7)) {
                            typeface = (Typeface) map3.get(str7);
                        } else {
                            String strI = xcg1.i(str5, "-", str);
                            if (map3.containsKey(strI)) {
                                str = str4;
                                typeface = (Typeface) map3.get(strI);
                            }
                            if (typeface == null) {
                                typeface = z830Var2.d;
                            }
                        }
                    }
                    str6 = "\n";
                    if (typeface == null) {
                        typeface = z830Var2.d;
                    }
                } else {
                    str = str4;
                }
                str = str4;
                ur00 ur00VarI = cdf0Var.i();
                if (ur00VarI != null) {
                    rok0 rok0Var = (rok0) ur00VarI.b;
                    rok0Var.b = str5;
                    rok0Var.c = str;
                    HashMap map4 = (HashMap) ur00VarI.c;
                    Typeface typeface2 = (Typeface) map4.get(rok0Var);
                    if (typeface2 != null) {
                        str6 = "\n";
                    } else {
                        HashMap map5 = (HashMap) ur00VarI.d;
                        Typeface typeface3 = (Typeface) map5.get(str5);
                        if (typeface3 != null) {
                            typefaceCreateFromAsset = typeface3;
                        } else {
                            Typeface typeface4 = z830Var2.d;
                            if (typeface4 != null) {
                                typefaceCreateFromAsset = typeface4;
                            } else {
                                StringBuilder sbG = dv20.g("fonts/", str5);
                                sbG.append((String) ur00VarI.f);
                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) ur00VarI.e, sbG.toString());
                                map5.put(str5, typefaceCreateFromAsset);
                            }
                        }
                        boolean zContains = str.contains("Italic");
                        boolean zContains2 = str.contains("Bold");
                        if (zContains && zContains2) {
                            i2 = 3;
                        } else if (zContains) {
                            i2 = 2;
                        } else {
                            i2 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i2) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i2);
                        }
                        typeface2 = typefaceCreateFromAsset;
                        map4.put(rok0Var, typeface2);
                    }
                    typeface = typeface2;
                } else {
                    str6 = "\n";
                    typeface = null;
                }
                if (typeface == null) {
                    typeface = z830Var2.d;
                }
            } else {
                str6 = "\n";
            }
            if (typeface != null) {
                String str8 = zpuVar.a;
                t9e1Var.setTypeface(typeface);
                isi1 isi1Var5 = v9e1Var.V;
                float fFloatValue3 = isi1Var5 != null ? ((Float) isi1Var5.e()).floatValue() : zpuVar.c;
                t9e1Var.setTextSize(qpi1.c() * fFloatValue3);
                t9e1Var2.setTypeface(t9e1Var.getTypeface());
                t9e1Var2.setTextSize(t9e1Var.getTextSize());
                float f6 = zpuVar.e / 10.0f;
                isi1 isi1Var6 = v9e1Var.U;
                if (isi1Var6 != null) {
                    fFloatValue = ((Float) isi1Var6.e()).floatValue();
                } else {
                    if (cr20Var2 != null) {
                        fFloatValue = ((Float) cr20Var2.e()).floatValue();
                    }
                    fC = ((qpi1.c() * f6) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str8.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str6, "\r").split("\r"));
                    size = listAsList.size();
                    i3 = -1;
                    i4 = 0;
                    while (i4 < size) {
                        String str9 = (String) listAsList.get(i4);
                        pointF = zpuVar.m;
                        if (pointF == null) {
                            f = 0.0f;
                        } else {
                            f = pointF.x;
                        }
                        f2 = fC;
                        listW = v9e1Var.w(str9, f, z830Var2, 0.0f, f2, false);
                        i5 = 0;
                        while (i5 < listW.size()) {
                            u9e1Var = (u9e1) listW.get(i5);
                            i3++;
                            canvas.save();
                            if (v9e1Var.v(canvas, zpuVar, i3, u9e1Var.b)) {
                                str2 = u9e1Var.a;
                                length = 0;
                                while (length < str2.length()) {
                                    iCodePointAt = str2.codePointAt(length);
                                    List list2 = listW;
                                    iCharCount = Character.charCount(iCodePointAt) + length;
                                    int i12 = i5;
                                    while (true) {
                                        if (iCharCount < str2.length()) {
                                            z830Var = z830Var2;
                                            break;
                                        }
                                        iCodePointAt2 = str2.codePointAt(iCharCount);
                                        z830Var = z830Var2;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        z830Var2 = z830Var;
                                    }
                                    j = iCodePointAt;
                                    q5f0Var = v9e1Var.I;
                                    if (q5f0Var.d(j) >= 0) {
                                        string = (String) q5f0Var.b(j);
                                    } else {
                                        sb = v9e1Var.C;
                                        sb.setLength(0);
                                        iCharCount2 = length;
                                        while (iCharCount2 < iCharCount) {
                                            int i13 = iCharCount;
                                            int iCodePointAt3 = str2.codePointAt(iCharCount2);
                                            sb.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i13;
                                        }
                                        string = sb.toString();
                                        q5f0Var.g(j, string);
                                    }
                                    length += string.length();
                                    if (zpuVar.k) {
                                        s(string, t9e1Var, canvas);
                                        s(string, t9e1Var2, canvas);
                                    } else {
                                        s(string, t9e1Var2, canvas);
                                        s(string, t9e1Var, canvas);
                                    }
                                    canvas.translate(t9e1Var.measureText(string) + f2, 0.0f);
                                    v9e1Var = this;
                                    listW = list2;
                                    f2 = f2;
                                    i5 = i12;
                                    z830Var2 = z830Var;
                                }
                            }
                            canvas.restore();
                            i5++;
                            v9e1Var = this;
                            listW = listW;
                            f2 = f2;
                            z830Var2 = z830Var2;
                        }
                        i4++;
                        v9e1Var = this;
                        fC = f2;
                    }
                }
                f6 += fFloatValue;
                fC = ((qpi1.c() * f6) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str8.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str6, "\r").split("\r"));
                size = listAsList.size();
                i3 = -1;
                i4 = 0;
                while (i4 < size) {
                    String str10 = (String) listAsList.get(i4);
                    pointF = zpuVar.m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    f2 = fC;
                    listW = v9e1Var.w(str10, f, z830Var2, 0.0f, f2, false);
                    i5 = 0;
                    while (i5 < listW.size()) {
                        u9e1Var = (u9e1) listW.get(i5);
                        i3++;
                        canvas.save();
                        if (v9e1Var.v(canvas, zpuVar, i3, u9e1Var.b)) {
                            str2 = u9e1Var.a;
                            length = 0;
                            while (length < str2.length()) {
                                iCodePointAt = str2.codePointAt(length);
                                List list3 = listW;
                                iCharCount = Character.charCount(iCodePointAt) + length;
                                int i14 = i5;
                                while (true) {
                                    if (iCharCount < str2.length()) {
                                        z830Var = z830Var2;
                                        break;
                                    }
                                    iCodePointAt2 = str2.codePointAt(iCharCount);
                                    z830Var = z830Var2;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    z830Var2 = z830Var;
                                }
                                j = iCodePointAt;
                                q5f0Var = v9e1Var.I;
                                if (q5f0Var.d(j) >= 0) {
                                    string = (String) q5f0Var.b(j);
                                } else {
                                    sb = v9e1Var.C;
                                    sb.setLength(0);
                                    iCharCount2 = length;
                                    while (iCharCount2 < iCharCount) {
                                        int i15 = iCharCount;
                                        int iCodePointAt4 = str2.codePointAt(iCharCount2);
                                        sb.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i15;
                                    }
                                    string = sb.toString();
                                    q5f0Var.g(j, string);
                                }
                                length += string.length();
                                if (zpuVar.k) {
                                    s(string, t9e1Var, canvas);
                                    s(string, t9e1Var2, canvas);
                                } else {
                                    s(string, t9e1Var2, canvas);
                                    s(string, t9e1Var, canvas);
                                }
                                canvas.translate(t9e1Var.measureText(string) + f2, 0.0f);
                                v9e1Var = this;
                                listW = list3;
                                f2 = f2;
                                i5 = i14;
                                z830Var2 = z830Var;
                            }
                        }
                        canvas.restore();
                        i5++;
                        v9e1Var = this;
                        listW = listW;
                        f2 = f2;
                        z830Var2 = z830Var2;
                    }
                    i4++;
                    v9e1Var = this;
                    fC = f2;
                }
            }
            canvas2 = canvas;
        } else {
            isi1 isi1Var7 = v9e1Var.V;
            float fFloatValue4 = (isi1Var7 != null ? ((Float) isi1Var7.e()).floatValue() : zpuVar.c) / 100.0f;
            qpi1.d(matrix);
            List listAsList2 = Arrays.asList(zpuVar.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            float f7 = zpuVar.e / 10.0f;
            isi1 isi1Var8 = v9e1Var.U;
            if (isi1Var8 != null) {
                fFloatValue2 = ((Float) isi1Var8.e()).floatValue();
            } else {
                if (cr20Var2 != null) {
                    fFloatValue2 = ((Float) cr20Var2.e()).floatValue();
                }
                f3 = f7;
                i6 = 0;
                i7 = -1;
                while (i6 < size3) {
                    String str11 = (String) listAsList2.get(i6);
                    pointF2 = zpuVar.m;
                    if (pointF2 == null) {
                        f4 = 0.0f;
                    } else {
                        f4 = pointF2.x;
                    }
                    int i16 = i6;
                    f5 = fFloatValue4;
                    int i17 = size3;
                    listW2 = w(str11, f4, z830Var2, f5, f3, true);
                    i8 = 0;
                    while (i8 < listW2.size()) {
                        u9e1Var2 = (u9e1) listW2.get(i8);
                        List list4 = listW2;
                        i7++;
                        canvas.save();
                        int i18 = i8;
                        if (v(canvas, zpuVar, i7, u9e1Var2.b)) {
                            str3 = u9e1Var2.a;
                            i9 = 0;
                            while (i9 < str3.length()) {
                                int iA = c930.a(str5, str3.charAt(i9), str4);
                                String str12 = str3;
                                ina1 ina1Var = fcf0Var.h;
                                ina1Var.getClass();
                                c930Var = (c930) dio1.r(ina1Var, iA);
                                if (c930Var == null) {
                                    f3 = f3;
                                    i9 = i9;
                                    str4 = str4;
                                    listAsList2 = listAsList2;
                                } else {
                                    map = this.H;
                                    if (map.containsKey(c930Var)) {
                                        list = (List) map.get(c930Var);
                                    } else {
                                        arrayList = c930Var.a;
                                        size2 = arrayList.size();
                                        arrayList2 = new ArrayList(size2);
                                        i10 = 0;
                                        while (i10 < size2) {
                                            arrayList2.add(new stl(cdf0Var, this, (qw61) arrayList.get(i10), fcf0Var));
                                            i10++;
                                            size2 = size2;
                                            arrayList = arrayList;
                                        }
                                        map.put(c930Var, arrayList2);
                                        list = arrayList2;
                                    }
                                    i11 = 0;
                                    while (i11 < list.size()) {
                                        path = ((stl) list.get(i11)).getPath();
                                        path.computeBounds(this.D, false);
                                        Matrix matrix2 = this.E;
                                        matrix2.reset();
                                        List list5 = list;
                                        matrix2.preTranslate(0.0f, (-zpuVar.g) * qpi1.c());
                                        matrix2.preScale(f5, f5);
                                        path.transform(matrix2);
                                        if (zpuVar.k) {
                                            t(path, t9e1Var, canvas);
                                            t(path, t9e1Var2, canvas);
                                        } else {
                                            t(path, t9e1Var2, canvas);
                                            t(path, t9e1Var, canvas);
                                        }
                                        i11++;
                                        list = list5;
                                    }
                                    canvas.translate((qpi1.c() * ((float) c930Var.c) * f5) + f3, 0.0f);
                                }
                                i9++;
                                str3 = str12;
                                f3 = f3;
                                listAsList2 = listAsList2;
                                str4 = str4;
                            }
                        }
                        float f8 = f3;
                        String str13 = str4;
                        List list6 = listAsList2;
                        canvas.restore();
                        i8 = i18 + 1;
                        listW2 = list4;
                        f3 = f8;
                        listAsList2 = list6;
                        str4 = str13;
                    }
                    i6 = i16 + 1;
                    fFloatValue4 = f5;
                    size3 = i17;
                }
                canvas2 = canvas;
            }
            f7 += fFloatValue2;
            f3 = f7;
            i6 = 0;
            i7 = -1;
            while (i6 < size3) {
                String str14 = (String) listAsList2.get(i6);
                pointF2 = zpuVar.m;
                if (pointF2 == null) {
                    f4 = 0.0f;
                } else {
                    f4 = pointF2.x;
                }
                int i19 = i6;
                f5 = fFloatValue4;
                int i110 = size3;
                listW2 = w(str14, f4, z830Var2, f5, f3, true);
                i8 = 0;
                while (i8 < listW2.size()) {
                    u9e1Var2 = (u9e1) listW2.get(i8);
                    List list7 = listW2;
                    i7++;
                    canvas.save();
                    int i111 = i8;
                    if (v(canvas, zpuVar, i7, u9e1Var2.b)) {
                        str3 = u9e1Var2.a;
                        i9 = 0;
                        while (i9 < str3.length()) {
                            int iA2 = c930.a(str5, str3.charAt(i9), str4);
                            String str15 = str3;
                            ina1 ina1Var2 = fcf0Var.h;
                            ina1Var2.getClass();
                            c930Var = (c930) dio1.r(ina1Var2, iA2);
                            if (c930Var == null) {
                                f3 = f3;
                                i9 = i9;
                                str4 = str4;
                                listAsList2 = listAsList2;
                            } else {
                                map = this.H;
                                if (map.containsKey(c930Var)) {
                                    list = (List) map.get(c930Var);
                                } else {
                                    arrayList = c930Var.a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i10 = 0;
                                    while (i10 < size2) {
                                        arrayList2.add(new stl(cdf0Var, this, (qw61) arrayList.get(i10), fcf0Var));
                                        i10++;
                                        size2 = size2;
                                        arrayList = arrayList;
                                    }
                                    map.put(c930Var, arrayList2);
                                    list = arrayList2;
                                }
                                i11 = 0;
                                while (i11 < list.size()) {
                                    path = ((stl) list.get(i11)).getPath();
                                    path.computeBounds(this.D, false);
                                    Matrix matrix3 = this.E;
                                    matrix3.reset();
                                    List list8 = list;
                                    matrix3.preTranslate(0.0f, (-zpuVar.g) * qpi1.c());
                                    matrix3.preScale(f5, f5);
                                    path.transform(matrix3);
                                    if (zpuVar.k) {
                                        t(path, t9e1Var, canvas);
                                        t(path, t9e1Var2, canvas);
                                    } else {
                                        t(path, t9e1Var2, canvas);
                                        t(path, t9e1Var, canvas);
                                    }
                                    i11++;
                                    list = list8;
                                }
                                canvas.translate((qpi1.c() * ((float) c930Var.c) * f5) + f3, 0.0f);
                            }
                            i9++;
                            str3 = str15;
                            f3 = f3;
                            listAsList2 = listAsList2;
                            str4 = str4;
                        }
                    }
                    float f9 = f3;
                    String str16 = str4;
                    List list9 = listAsList2;
                    canvas.restore();
                    i8 = i111 + 1;
                    listW2 = list7;
                    f3 = f9;
                    listAsList2 = list9;
                    str4 = str16;
                }
                i6 = i19 + 1;
                fFloatValue4 = f5;
                size3 = i110;
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final u9e1 u(int i) {
        ArrayList arrayList = this.J;
        for (int size = arrayList.size(); size < i; size++) {
            u9e1 u9e1Var = new u9e1();
            u9e1Var.a = "";
            u9e1Var.b = 0.0f;
            arrayList.add(u9e1Var);
        }
        return (u9e1) arrayList.get(i - 1);
    }

    public final boolean v(Canvas canvas, zpu zpuVar, int i, float f) {
        PointF pointF = zpuVar.l;
        PointF pointF2 = zpuVar.m;
        float fC = qpi1.c();
        float f2 = (i * zpuVar.f * fC) + (pointF == null ? 0.0f : (zpuVar.f * fC) + pointF.y);
        if (this.L.T0 && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + zpuVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iC = l1d.C(zpuVar.d);
        if (iC == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iC == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iC != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List w(String str, float f, z830 z830Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = c930.a(z830Var.a, cCharAt, z830Var.c);
                ina1 ina1Var = this.M.h;
                ina1Var.getClass();
                c930 c930Var = (c930) dio1.r(ina1Var, iA);
                if (c930Var != null) {
                    fMeasureText = (qpi1.c() * ((float) c930Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.F.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                u9e1 u9e1VarU = u(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    u9e1VarU.a = strTrim;
                    u9e1VarU.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    u9e1VarU.a = strTrim2;
                    u9e1VarU.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            u9e1 u9e1VarU2 = u(i);
            u9e1VarU2.a = str.substring(i2);
            u9e1VarU2.b = f4;
        }
        return this.J.subList(0, i);
    }
}
