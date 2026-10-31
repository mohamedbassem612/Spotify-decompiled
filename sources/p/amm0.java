package p;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class amm0 {
    public static final Paint c = new Paint(3);
    public final fuz a;
    public final dmm0 b;

    public amm0(fuz fuzVar, dmm0 dmm0Var) {
        this.a = fuzVar;
        this.b = dmm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, int i, int i2, onm onmVar) throws IOException {
        wlm0 wlm0Var;
        List listA;
        int i3;
        if (onmVar instanceof wlm0) {
            wlm0Var = (wlm0) onmVar;
            int i4 = wlm0Var.g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wlm0Var.g = i4 - Integer.MIN_VALUE;
            } else {
                wlm0Var = new wlm0(this, onmVar);
            }
        } else {
            wlm0Var = new wlm0(this, onmVar);
        }
        Object obj = wlm0Var.e;
        int i5 = wlm0Var.g;
        d9n d9nVar = d9n.a;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    i3 = wlm0Var.d;
                    i2 = wlm0Var.c;
                    i = wlm0Var.b;
                    listA = wlm0Var.a;
                    hm5.M(obj);
                } else if (i5 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            List list = wlm0Var.a;
            hm5.M(obj);
            return obj;
        }
        hm5.M(obj);
        bmm0 bmm0VarA = this.b.a(str);
        if (bmm0VarA == null) {
            hhg1.n("Failed requirement.");
            return null;
        }
        listA = bmm0VarA.a();
        int iMax = (i == 0 || i2 == 0) ? 300 : Math.max(i, i2);
        if (bmm0VarA.b()) {
            wlm0Var.a = listA;
            wlm0Var.b = i;
            wlm0Var.c = i2;
            wlm0Var.d = iMax;
            wlm0Var.g = 2;
            Object objB = b(listA, iMax, wlm0Var);
            if (objB != d9nVar) {
                int i6 = iMax;
                obj = objB;
                i3 = i6;
            }
        } else {
            wlm0Var.a = null;
            wlm0Var.b = i;
            wlm0Var.c = i2;
            wlm0Var.d = iMax;
            wlm0Var.g = 1;
            Object objD = d(listA, iMax, wlm0Var);
            if (objD != d9nVar) {
                return objD;
            }
        }
        iq80 iq80Var = (iq80) obj;
        if (iq80Var != null) {
            return iq80Var;
        }
        wlm0Var.a = null;
        wlm0Var.b = i;
        wlm0Var.c = i2;
        wlm0Var.d = i3;
        wlm0Var.g = 3;
        Object objD2 = d(listA, i3, wlm0Var);
        return objD2 == d9nVar ? d9nVar : objD2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:25:0x0123  */
    /* JADX WARN: Code duplicated, block: B:28:0x0138  */
    /* JADX WARN: Code duplicated, block: B:29:0x0140  */
    /* JADX WARN: Code duplicated, block: B:32:0x016b  */
    /* JADX WARN: Code duplicated, block: B:35:0x017a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0180  */
    /* JADX WARN: Code duplicated, block: B:39:0x0189 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x019d A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x01a9 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01d0 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0200 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0206  */
    /* JADX WARN: Code duplicated, block: B:58:0x0209  */
    /* JADX WARN: Code duplicated, block: B:60:0x020e  */
    /* JADX WARN: Code duplicated, block: B:61:0x020f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0216  */
    /* JADX WARN: Code duplicated, block: B:64:0x0217 A[PHI: r0 r4 r21
      0x0217: PHI (r0v13 int) = (r0v12 int), (r0v16 int), (r0v17 int) binds: [B:62:0x0214, B:59:0x020c, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r4v11 int) = (r4v10 int), (r4v13 int), (r4v14 int) binds: [B:62:0x0214, B:59:0x020c, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r21v1 p.g5n) = (r21v0 p.g5n), (r21v2 p.g5n), (r21v2 p.g5n) binds: [B:62:0x0214, B:59:0x020c, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x021f A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0224 A[Catch: all -> 0x0199, TryCatch #1 {all -> 0x0199, blocks: (B:37:0x0183, B:39:0x0189, B:42:0x019d, B:44:0x01a9, B:46:0x01e4, B:65:0x0219, B:67:0x021f, B:71:0x0227, B:70:0x0224, B:55:0x0200, B:56:0x0205, B:45:0x01d0), top: B:85:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x025f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0265  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x016b -> B:13:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r24, int r25, p.onm r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.amm0.b(java.util.List, int, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, String str, onm onmVar) throws IOException {
        ylm0 ylm0Var;
        n811 n811Var;
        if (onmVar instanceof ylm0) {
            ylm0Var = (ylm0) onmVar;
            int i2 = ylm0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ylm0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                ylm0Var = new ylm0(this, onmVar);
            }
        } else {
            ylm0Var = new ylm0(this, onmVar);
        }
        Object obj = ylm0Var.c;
        int i3 = ylm0Var.e;
        if (i3 == 0) {
            hm5.M(obj);
            n811 n811Var2 = new n811();
            n811Var2.a = 1;
            ylm0Var.a = n811Var2;
            ylm0Var.b = i;
            ylm0Var.e = 1;
            Object objC = this.a.d.c(str, i, i, ylm0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            obj = objC;
            n811Var = n811Var2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ylm0Var.b;
            n811Var = ylm0Var.a;
            hm5.M(obj);
        }
        ls70 ls70Var = (ls70) obj;
        if (ls70Var == null) {
            return null;
        }
        InputStream inputStream = ls70Var.a;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outHeight > i || options.outWidth > i) {
                float f = i;
                n811Var.a = Math.min(jch0.U(options.outHeight / f), jch0.U(options.outWidth / f));
            }
            inputStream.close();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = n811Var.a;
            return options2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008a -> B:29:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b4 -> B:17:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.List r9, int r10, p.onm r11) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.zlm0
            if (r0 == 0) goto L13
            r0 = r11
            p.zlm0 r0 = (p.zlm0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.zlm0 r0 = new p.zlm0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L36
            int r9 = r0.d
            android.graphics.BitmapFactory$Options r10 = r0.c
            java.util.Iterator r1 = r0.a
            p.hm5.M(r11)
            r7 = r11
            r11 = r9
            r9 = r1
            r1 = r0
            r0 = r7
            goto L8e
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L3c:
            int r9 = r0.d
            java.lang.String r10 = r0.b
            java.util.Iterator r1 = r0.a
            p.hm5.M(r11)
            r7 = r11
            r11 = r9
            r9 = r1
            r1 = r7
            goto L71
        L4a:
            p.hm5.M(r11)
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            r0.a = r9
            r0.b = r11
            r0.c = r4
            r0.d = r10
            r0.g = r3
            java.lang.Object r1 = r8.c(r10, r11, r0)
            if (r1 != r5) goto L6e
            goto L89
        L6e:
            r7 = r11
            r11 = r10
            r10 = r7
        L71:
            android.graphics.BitmapFactory$Options r1 = (android.graphics.BitmapFactory.Options) r1
            if (r1 == 0) goto Lb4
            r0.a = r9
            r0.b = r4
            r0.c = r1
            r0.d = r11
            r0.g = r2
            p.fuz r6 = r8.a
            p.f5t r6 = r6.d
            java.lang.Object r10 = r6.c(r10, r11, r11, r0)
            if (r10 != r5) goto L8a
        L89:
            return r5
        L8a:
            r7 = r0
            r0 = r10
            r10 = r1
            r1 = r7
        L8e:
            p.ls70 r0 = (p.ls70) r0
            if (r0 == 0) goto Lb1
            java.io.InputStream r6 = r0.a
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r6, r4, r10)     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto La7
            p.iq80 r8 = new p.iq80     // Catch: java.lang.Throwable -> La5
            p.g5n r9 = r0.b     // Catch: java.lang.Throwable -> La5
            r8.<init>(r10, r9, r4)     // Catch: java.lang.Throwable -> La5
            r6.close()
            return r8
        La5:
            r8 = move-exception
            goto Lab
        La7:
            r6.close()
            goto Lb1
        Lab:
            throw r8     // Catch: java.lang.Throwable -> Lac
        Lac:
            r9 = move-exception
            p.u890.p(r6, r8)
            throw r9
        Lb1:
            r10 = r11
            r0 = r1
            goto L51
        Lb4:
            r10 = r11
            goto L51
        Lb6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.amm0.d(java.util.List, int, p.onm):java.lang.Object");
    }
}
