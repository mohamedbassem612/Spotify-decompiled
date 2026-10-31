package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h6c1 {
    public static final Set j = f46.S0(new String[]{"http", "https"});
    public final o771 a;
    public final kp00 b;
    public final Context c;
    public final t7y d;
    public final uo5 e;
    public final ua91 f;
    public final DisplayMetrics g;
    public final zxa h;
    public final q8n i;

    public h6c1(o771 o771Var, nfb nfbVar, kp00 kp00Var, Context context, t7y t7yVar, uo5 uo5Var, ua91 ua91Var, DisplayMetrics displayMetrics, zxa zxaVar, q8n q8nVar) {
        this.a = o771Var;
        this.b = kp00Var;
        this.c = context;
        this.d = t7yVar;
        this.e = uo5Var;
        this.f = ua91Var;
        this.g = displayMetrics;
        this.h = zxaVar;
        this.i = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable a(int i, int i2, onm onmVar) {
        d6c1 d6c1Var;
        if (onmVar instanceof d6c1) {
            d6c1Var = (d6c1) onmVar;
            int i3 = d6c1Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d6c1Var.c = i3 - Integer.MIN_VALUE;
            } else {
                d6c1Var = new d6c1(this, onmVar);
            }
        } else {
            d6c1Var = new d6c1(this, onmVar);
        }
        Object objC = d6c1Var.a;
        int i4 = d6c1Var.c;
        if (i4 == 0) {
            hm5.M(objC);
            int i5 = this.g.widthPixels;
            int i6 = (i5 * 16) / 9;
            float f = i6;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f, i, i2, Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setDither(true);
            paint.setShader(linearGradient);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawRect(0.0f, 0.0f, i5, f, paint);
            d6c1Var.c = 1;
            objC = this.h.c(bitmapCreateBitmap, Bitmap.CompressFormat.PNG, 100, d6c1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        Uri uri = (Uri) objC;
        if (uri != null) {
            return uri;
        }
        k220.i("Saving bitmap to local storage failed");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.t0c r7, p.onm r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.e6c1
            if (r0 == 0) goto L13
            r0 = r8
            p.e6c1 r0 = (p.e6c1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.e6c1 r0 = new p.e6c1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L36
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            p.hm5.M(r8)
            return r8
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L32:
            p.hm5.M(r8)
            return r8
        L36:
            p.hm5.M(r8)
            goto L61
        L3a:
            p.hm5.M(r8)
            boolean r8 = r7 instanceof p.bnt
            p.d9n r1 = p.d9n.a
            if (r8 == 0) goto L66
            p.bnt r7 = (p.bnt) r7
            java.lang.String r7 = r7.e
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r0.c = r5
            p.ua91 r6 = r6.f
            java.lang.Object r8 = r6.c
            p.q8n r8 = (p.q8n) r8
            p.w621 r3 = new p.w621
            r4 = 11
            r3.<init>(r6, r7, r2, r4)
            java.lang.Object r8 = p.fn31.Y(r8, r3, r0)
            if (r8 != r1) goto L61
            goto L90
        L61:
            p.u57 r8 = (p.u57) r8
            android.net.Uri r6 = r8.b
            return r6
        L66:
            boolean r8 = r7 instanceof p.cnt
            if (r8 == 0) goto L7e
            p.cnt r7 = (p.cnt) r7
            java.lang.String r8 = r7.e
            android.net.Uri r8 = android.net.Uri.parse(r8)
            boolean r7 = r7.f
            r0.c = r4
            java.lang.Comparable r6 = r6.d(r8, r7, r0)
            if (r6 != r1) goto L7d
            goto L90
        L7d:
            return r6
        L7e:
            boolean r8 = r7 instanceof p.ant
            if (r8 == 0) goto L92
            p.ant r7 = (p.ant) r7
            int r8 = r7.e
            int r7 = r7.f
            r0.c = r3
            java.lang.Comparable r6 = r6.a(r8, r7, r0)
            if (r6 != r1) goto L91
        L90:
            return r1
        L91:
            return r6
        L92:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h6c1.b(p.t0c, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable c(bnt bntVar, onm onmVar) {
        f6c1 f6c1Var;
        if (onmVar instanceof f6c1) {
            f6c1Var = (f6c1) onmVar;
            int i = f6c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6c1Var.c = i - Integer.MIN_VALUE;
            } else {
                f6c1Var = new f6c1(this, onmVar);
            }
        } else {
            f6c1Var = new f6c1(this, onmVar);
        }
        Object objY = f6c1Var.a;
        int i2 = f6c1Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            if (bntVar != null) {
                Uri uri = Uri.parse(bntVar.e);
                f6c1Var.c = 1;
                ua91 ua91Var = this.f;
                objY = fn31.Y((q8n) ua91Var.c, new w621(ua91Var, uri, (lnm) null, (byte) 11), f6c1Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objY);
        u57 u57Var = (u57) objY;
        if (u57Var != null) {
            return u57Var.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        if (r0 == r11) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [p.l420] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [p.l420] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [p.l420] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Comparable d(android.net.Uri r16, boolean r17, p.onm r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h6c1.d(android.net.Uri, boolean, p.onm):java.lang.Comparable");
    }
}
