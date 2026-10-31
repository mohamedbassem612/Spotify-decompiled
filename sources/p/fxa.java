package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fxa {
    public final Context a;

    public fxa(Context context, byte b) {
        switch (b) {
            case 1:
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(p.ie30 r5) {
        /*
            java.lang.String r0 = r5.f66p
            r1 = 0
            if (r0 == 0) goto L84
            boolean r0 = p.asj0.m(r0)
            if (r0 != 0) goto Ld
            goto L84
        Ld:
            java.lang.String r5 = r5.f66p
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L5f;
                case -1487464693: goto L54;
                case -1487464690: goto L49;
                case -1487394660: goto L3e;
                case -1487018032: goto L33;
                case -879272239: goto L28;
                case -879258763: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L69
        L1d:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L26
            goto L69
        L26:
            r4 = 6
            goto L69
        L28:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L31
            goto L69
        L31:
            r4 = 5
            goto L69
        L33:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3c
            goto L69
        L3c:
            r4 = r2
            goto L69
        L3e:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L47
            goto L69
        L47:
            r4 = 3
            goto L69
        L49:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L52
            goto L69
        L52:
            r4 = 2
            goto L69
        L54:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5d
            goto L69
        L5d:
            r4 = r3
            goto L69
        L5f:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L68
            goto L69
        L68:
            r4 = r1
        L69:
            switch(r4) {
                case 0: goto L74;
                case 1: goto L6d;
                case 2: goto L6d;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L6c;
            }
        L6c:
            goto L7f
        L6d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L7f
            goto L7a
        L74:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L7f
        L7a:
            int r5 = p.jca.a(r2, r1, r1, r1)
            return r5
        L7f:
            int r5 = p.jca.a(r3, r1, r1, r1)
            return r5
        L84:
            int r5 = p.jca.a(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fxa.a(p.ie30):int");
    }
}
