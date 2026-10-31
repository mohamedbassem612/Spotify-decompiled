package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import android.view.View;
import com.spotify.concertpageview.v1.TicketingTimeline;
import com.spotify.concertpageview.v1.TimelineEntry;
import io.reactivex.rxjava3.core.Completable;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class jik {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r9 == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(p.kba r6, java.lang.String r7, boolean r8, p.onm r9) {
        /*
            boolean r0 = r9 instanceof p.dhk
            if (r0 == 0) goto L13
            r0 = r9
            p.dhk r0 = (p.dhk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.dhk r0 = new p.dhk
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L80
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            boolean r8 = r0.c
            java.lang.String r7 = r0.b
            p.kba r6 = r0.a
            p.hm5.M(r9)
            goto L4d
        L3b:
            p.hm5.M(r9)
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.e = r3
            java.lang.Object r9 = b(r6, r7, r8, r0)
            if (r9 != r5) goto L4d
            goto L7f
        L4d:
            p.sy21 r9 = (p.sy21) r9
            if (r9 == 0) goto La1
            p.ry21 r1 = r9.a
            boolean r1 = r1.Q0
            if (r1 != 0) goto L58
            goto La1
        L58:
            java.lang.Object r9 = r9.b
            com.spotify.concertpageview.v1.GetTicketingTimelineResponse r9 = (com.spotify.concertpageview.v1.GetTicketingTimelineResponse) r9
            if (r9 == 0) goto L63
            com.spotify.concertpageview.v1.TicketingTimeline r9 = r9.n()
            goto L64
        L63:
            r9 = r4
        L64:
            if (r9 == 0) goto L6d
            boolean r1 = p.jap1.t(r9)
            if (r1 == 0) goto L6d
            return r9
        L6d:
            if (r8 != 0) goto L70
            goto La1
        L70:
            r0.a = r4
            r0.b = r4
            r0.c = r8
            r0.e = r2
            r8 = 0
            java.lang.Object r9 = b(r6, r7, r8, r0)
            if (r9 != r5) goto L80
        L7f:
            return r5
        L80:
            p.sy21 r9 = (p.sy21) r9
            if (r9 == 0) goto La1
            p.ry21 r6 = r9.a
            boolean r6 = r6.Q0
            if (r6 == 0) goto L8b
            goto L8c
        L8b:
            r9 = r4
        L8c:
            if (r9 == 0) goto La1
            java.lang.Object r6 = r9.b
            com.spotify.concertpageview.v1.GetTicketingTimelineResponse r6 = (com.spotify.concertpageview.v1.GetTicketingTimelineResponse) r6
            if (r6 == 0) goto La1
            com.spotify.concertpageview.v1.TicketingTimeline r6 = r6.n()
            if (r6 == 0) goto La1
            boolean r7 = p.jap1.t(r6)
            if (r7 == 0) goto La1
            return r6
        La1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jik.a(p.kba, java.lang.String, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(kba kbaVar, String str, boolean z, onm onmVar) {
        ehk ehkVar;
        if (onmVar instanceof ehk) {
            ehkVar = (ehk) onmVar;
            int i = ehkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehkVar.b = i - Integer.MIN_VALUE;
            } else {
                ehkVar = new ehk(onmVar);
            }
        } else {
            ehkVar = new ehk(onmVar);
        }
        Object objG = ehkVar.a;
        int i2 = ehkVar.b;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                ehkVar.b = 1;
                objG = kbaVar.g(str, z, ehkVar);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objG);
            }
            return (sy21) objG;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:24:0x0106  */
    /* JADX WARN: Code duplicated, block: B:29:0x0132  */
    /* JADX WARN: Code duplicated, block: B:31:0x013c  */
    /* JADX WARN: Code duplicated, block: B:33:0x014a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0151  */
    /* JADX WARN: Code duplicated, block: B:37:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x017e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01be  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(p.vr20 r21, java.lang.String r22, p.kba r23, p.dg8 r24, p.yqg r25, boolean r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jik.c(p.vr20, java.lang.String, p.kba, p.dg8, p.yqg, boolean, p.onm):java.lang.Object");
    }

    public static final void d(dg30 dg30Var, k6k k6kVar, Context context, kt91 kt91Var) {
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", k6kVar.a).putExtra("description", k6kVar.f).putExtra("beginTime", k6kVar.b).putExtra("endTime", k6kVar.c).putExtra("availability", 0);
        String str = k6kVar.e;
        if (str != null) {
            intentPutExtra.putExtra("eventLocation", str);
        }
        if (intentPutExtra.resolveActivity(dg30Var.getPackageManager()) != null) {
            try {
                dg30Var.startActivity(intentPutExtra);
                return;
            } catch (ActivityNotFoundException | SecurityException unused) {
            }
        }
        kt91Var.k(new er91((fs91) null, context.getString(2131954181), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0266 A[Catch: Exception -> 0x01ef, CancellationException -> 0x0439, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ef, blocks: (B:70:0x01a9, B:75:0x01b9, B:78:0x01c4, B:81:0x01d7, B:111:0x0266, B:114:0x027b), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ba A[Catch: Exception -> 0x0405, CancellationException -> 0x0439, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0439, blocks: (B:23:0x0083, B:28:0x009c, B:70:0x01a9, B:75:0x01b9, B:77:0x01c1, B:78:0x01c4, B:80:0x01d3, B:81:0x01d7, B:31:0x00c0, B:34:0x00de, B:37:0x00f6, B:135:0x030b, B:137:0x0315, B:140:0x0322, B:147:0x0333, B:149:0x0347, B:151:0x034c, B:139:0x031e, B:42:0x0111, B:130:0x02e4, B:132:0x02fa, B:46:0x013b, B:109:0x025e, B:111:0x0266, B:113:0x0279, B:114:0x027b, B:124:0x02ba, B:126:0x02d3, B:127:0x02d5, B:59:0x0174, B:66:0x0186, B:91:0x01fd, B:95:0x021f, B:97:0x0223, B:99:0x0229, B:105:0x0235), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0309  */
    /* JADX WARN: Code duplicated, block: B:135:0x030b A[Catch: Exception -> 0x031a, CancellationException -> 0x0439, PHI: r0 r1 r2 r3 r4 r5 r6 r9 r10 r14
      0x030b: PHI (r0v24 ??) = (r0v69 ??), (r0v70 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r1v36 ??) = (r1v73 ??), (r1v74 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r2v14 ??) = (r2v36 ??), (r2v37 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r3v10 p.yqg) = (r3v7 p.yqg), (r3v11 p.yqg) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r4v17 ??) = (r4v51 ??), (r4v52 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r5v9 p.kba) = (r5v6 p.kba), (r5v11 p.kba) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r6v14 ??) = (r6v48 ??), (r6v49 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r9v12 ??) = (r9v53 ??), (r9v54 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r10v12 ??) = (r10v17 ??), (r10v18 ??) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r14v20 p.vr20) = (r14v17 p.vr20), (r14v22 p.vr20) binds: [B:133:0x0307, B:38:0x00f9] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0439, blocks: (B:23:0x0083, B:28:0x009c, B:70:0x01a9, B:75:0x01b9, B:77:0x01c1, B:78:0x01c4, B:80:0x01d3, B:81:0x01d7, B:31:0x00c0, B:34:0x00de, B:37:0x00f6, B:135:0x030b, B:137:0x0315, B:140:0x0322, B:147:0x0333, B:149:0x0347, B:151:0x034c, B:139:0x031e, B:42:0x0111, B:130:0x02e4, B:132:0x02fa, B:46:0x013b, B:109:0x025e, B:111:0x0266, B:113:0x0279, B:114:0x027b, B:124:0x02ba, B:126:0x02d3, B:127:0x02d5, B:59:0x0174, B:66:0x0186, B:91:0x01fd, B:95:0x021f, B:97:0x0223, B:99:0x0229, B:105:0x0235), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0315 A[Catch: Exception -> 0x031a, CancellationException -> 0x0439, TryCatch #2 {CancellationException -> 0x0439, blocks: (B:23:0x0083, B:28:0x009c, B:70:0x01a9, B:75:0x01b9, B:77:0x01c1, B:78:0x01c4, B:80:0x01d3, B:81:0x01d7, B:31:0x00c0, B:34:0x00de, B:37:0x00f6, B:135:0x030b, B:137:0x0315, B:140:0x0322, B:147:0x0333, B:149:0x0347, B:151:0x034c, B:139:0x031e, B:42:0x0111, B:130:0x02e4, B:132:0x02fa, B:46:0x013b, B:109:0x025e, B:111:0x0266, B:113:0x0279, B:114:0x027b, B:124:0x02ba, B:126:0x02d3, B:127:0x02d5, B:59:0x0174, B:66:0x0186, B:91:0x01fd, B:95:0x021f, B:97:0x0223, B:99:0x0229, B:105:0x0235), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x031e A[Catch: Exception -> 0x031a, CancellationException -> 0x0439, TryCatch #2 {CancellationException -> 0x0439, blocks: (B:23:0x0083, B:28:0x009c, B:70:0x01a9, B:75:0x01b9, B:77:0x01c1, B:78:0x01c4, B:80:0x01d3, B:81:0x01d7, B:31:0x00c0, B:34:0x00de, B:37:0x00f6, B:135:0x030b, B:137:0x0315, B:140:0x0322, B:147:0x0333, B:149:0x0347, B:151:0x034c, B:139:0x031e, B:42:0x0111, B:130:0x02e4, B:132:0x02fa, B:46:0x013b, B:109:0x025e, B:111:0x0266, B:113:0x0279, B:114:0x027b, B:124:0x02ba, B:126:0x02d3, B:127:0x02d5, B:59:0x0174, B:66:0x0186, B:91:0x01fd, B:95:0x021f, B:97:0x0223, B:99:0x0229, B:105:0x0235), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0328  */
    /* JADX WARN: Code duplicated, block: B:143:0x0329  */
    /* JADX WARN: Code duplicated, block: B:145:0x032c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0330  */
    /* JADX WARN: Code duplicated, block: B:154:0x036d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0395  */
    /* JADX WARN: Code duplicated, block: B:159:0x0397  */
    /* JADX WARN: Code duplicated, block: B:162:0x039c A[Catch: CancellationException -> 0x03fa, Exception -> 0x0438, TryCatch #14 {CancellationException -> 0x03fa, Exception -> 0x0438, blocks: (B:13:0x003f, B:16:0x004b, B:172:0x03db, B:19:0x0059, B:160:0x0398, B:162:0x039c, B:164:0x03be, B:167:0x03ce, B:169:0x03d4, B:156:0x0375), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x03be A[Catch: CancellationException -> 0x03fa, Exception -> 0x0438, TryCatch #14 {CancellationException -> 0x03fa, Exception -> 0x0438, blocks: (B:13:0x003f, B:16:0x004b, B:172:0x03db, B:19:0x0059, B:160:0x0398, B:162:0x039c, B:164:0x03be, B:167:0x03ce, B:169:0x03d4, B:156:0x0375), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:171:0x03da  */
    /* JADX WARN: Code duplicated, block: B:172:0x03db A[Catch: CancellationException -> 0x03fa, Exception -> 0x0438, PHI: r0 r1 r4 r6 r7 r9 r14
      0x03db: PHI (r0v46 ??) = (r0v52 ??), (r0v53 ??) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r1v63 ??) = (r1v66 ??), (r1v67 ??) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r4v38 ??) = (r4v40 ??), (r4v41 ??) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r6v37 ??) = (r6v38 ??), (r6v39 ??) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r7v37 java.lang.Object) = (r7v36 java.lang.Object), (r7v1 java.lang.Object) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r9v35 ??) = (r9v38 ??), (r9v39 ??) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r14v34 p.vr20) = (r14v30 p.vr20), (r14v35 p.vr20) binds: [B:170:0x03d8, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #14 {CancellationException -> 0x03fa, Exception -> 0x0438, blocks: (B:13:0x003f, B:16:0x004b, B:172:0x03db, B:19:0x0059, B:160:0x0398, B:162:0x039c, B:164:0x03be, B:167:0x03ce, B:169:0x03d4, B:156:0x0375), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x040f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0437 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[Catch: Exception -> 0x01ef, CancellationException -> 0x0439, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ef, blocks: (B:70:0x01a9, B:75:0x01b9, B:78:0x01c4, B:81:0x01d7, B:111:0x0266, B:114:0x027b), top: B:194:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5 A[PHI: r0 r1 r2 r3 r5 r6 r9
      0x01f5: PHI (r0v32 ??) = (r0v13 ??), (r0v31 ??), (r0v33 ??) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r1v45 ??) = (r1v0 ??), (r1v44 ??), (r1v46 ??) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r2v21 p.dg8) = (r2v0 p.dg8), (r2v20 p.dg8), (r2v23 p.dg8) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r3v16 p.kba) = (r3v0 p.kba), (r3v15 p.kba), (r3v17 p.kba) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r5v16 p.yqg) = (r5v0 p.yqg), (r5v15 p.yqg), (r5v18 p.yqg) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r6v20 ??) = (r6v0 ??), (r6v19 ??), (r6v21 ??) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r9v18 ??) = (r9v3 ??), (r9v17 ??), (r9v19 ??) binds: [B:94:0x021c, B:32:0x00c3, B:74:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ad, code lost:
    
        if (r1 == r15) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e0, code lost:
    
        if (r2.f(r1, r8) == r15) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03f7, code lost:
    
        if (r0 == r15) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r10v9, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.vfk] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46, types: [p.vfk] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49, types: [p.vfk] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v59, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [p.tqe1] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [p.tqe1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.kt91] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [p.kt91] */
    /* JADX WARN: Type inference failed for: r4v12, types: [p.kt91] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [p.kt91] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, p.kt91] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.kt91] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [p.kt91] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v22, types: [p.dg8] */
    /* JADX WARN: Type inference failed for: r5v26, types: [p.dg8] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [p.dg8] */
    /* JADX WARN: Type inference failed for: r6v14, types: [p.dg8] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [p.vfk] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [p.tqe1] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.tqe1] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v12, types: [p.vfk] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, p.tqe1] */
    /* JADX WARN: Type inference failed for: r9v21, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6, types: [p.vfk] */
    /* JADX WARN: Type inference failed for: r9v9, types: [p.vfk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(p.vr20 r19, p.vfk r20, p.rm5 r21, p.dg8 r22, p.kba r23, p.kt91 r24, p.yqg r25, boolean r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jik.e(p.vr20, p.vfk, p.rm5, p.dg8, p.kba, p.kt91, p.yqg, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r8.emit(r13, r0) == r6) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(p.vr20 r7, java.lang.String r8, p.kba r9, p.dg8 r10, p.yqg r11, boolean r12, p.onm r13) {
        /*
            boolean r0 = r13 instanceof p.gik
            if (r0 == 0) goto L13
            r0 = r13
            p.gik r0 = (p.gik) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.gik r0 = new p.gik
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f
            int r1 = r0.g
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            p.hm5.M(r13)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            goto La9
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L35:
            boolean r7 = r0.e
            p.vr20 r8 = r0.d
            p.hm5.M(r13)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            goto L96
        L3d:
            boolean r12 = r0.e
            p.yqg r11 = r0.c
            p.dg8 r10 = r0.b
            p.vr20 r7 = r0.a
            p.hm5.M(r13)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            goto L5d
        L49:
            p.hm5.M(r13)
            r0.a = r7     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.b = r10     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.c = r11     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.e = r12     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.g = r4     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            java.lang.Object r13 = a(r9, r8, r12, r0)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            if (r13 != r6) goto L5d
            goto La8
        L5d:
            com.spotify.concertpageview.v1.TicketingTimeline r13 = (com.spotify.concertpageview.v1.TicketingTimeline) r13     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            if (r13 == 0) goto La9
            r0.a = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.b = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.c = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.d = r7     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.e = r12     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.g = r3     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            long r8 = r11.b()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            boolean r1 = r13.v()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            if (r1 == 0) goto L8c
            com.google.protobuf.Timestamp r1 = r13.s()     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            long r3 = p.jap1.w(r1)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            long r3 = r3 - r8
            r8 = 0
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 >= 0) goto L87
            r3 = r8
        L87:
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            goto L8d
        L8c:
            r8 = r5
        L8d:
            java.lang.Object r13 = h(r13, r11, r10, r8, r0)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            if (r13 != r6) goto L94
            goto La8
        L94:
            r8 = r7
            r7 = r12
        L96:
            r0.a = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.b = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.c = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.d = r5     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.e = r7     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            r0.g = r2     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            java.lang.Object r7 = r8.emit(r13, r0)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lac
            if (r7 != r6) goto La9
        La8:
            return r6
        La9:
            p.rih1 r7 = p.rih1.a
            return r7
        Lac:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jik.f(p.vr20, java.lang.String, p.kba, p.dg8, p.yqg, boolean, p.onm):java.lang.Object");
    }

    public static final long g(int i) {
        long jMin = Math.min(60000L, 1000 << Math.min(i, 6));
        return dqz0.b.k(0L, (jMin / 2) + 1) + jMin;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(TicketingTimeline ticketingTimeline, yqg yqgVar, dg8 dg8Var, Long l, onm onmVar) {
        hik hikVar;
        String strN;
        if (onmVar instanceof hik) {
            hikVar = (hik) onmVar;
            int i = hikVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hikVar.e = i - Integer.MIN_VALUE;
            } else {
                hikVar = new hik(onmVar);
            }
        } else {
            hikVar = new hik(onmVar);
        }
        Object objI = hikVar.d;
        int i2 = hikVar.e;
        boolean zBooleanValue = false;
        Long l2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                Iterator it = ticketingTimeline.p().iterator();
                do {
                    if (!it.hasNext()) {
                        strN = null;
                        break;
                    }
                    TimelineEntry timelineEntry = (TimelineEntry) it.next();
                    strN = timelineEntry.y().n();
                    if (timelineEntry.hasSource() && timelineEntry.y().s() && timelineEntry.F() && timelineEntry.o().n() == tqe1.CURATE) {
                        strN.getClass();
                        if (ihc1.y0(strN)) {
                            strN = null;
                        }
                    } else {
                        strN = null;
                    }
                } while (strN == null);
                if (strN != null) {
                    xs4 xs4VarW = dg8Var.w(strN);
                    hikVar.a = ticketingTimeline;
                    hikVar.b = yqgVar;
                    hikVar.c = l;
                    hikVar.e = 1;
                    objI = b5p1.i(xs4VarW, hikVar);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
                if (l != null) {
                    l2 = new Long(yqgVar.e() + l.longValue());
                }
                return new slk(ticketingTimeline, l2, zBooleanValue);
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l = hikVar.c;
            yqgVar = hikVar.b;
            ticketingTimeline = hikVar.a;
            hm5.M(objI);
            zBooleanValue = ((Boolean) objI).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        if (l != null) {
            l2 = new Long(yqgVar.e() + l.longValue());
        }
        return new slk(ticketingTimeline, l2, zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(qnv0 qnv0Var, String str, String str2, boolean z, onm onmVar) {
        iik iikVar;
        if (onmVar instanceof iik) {
            iikVar = (iik) onmVar;
            int i = iikVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iikVar.b = i - Integer.MIN_VALUE;
            } else {
                iikVar = new iik(onmVar);
            }
        } else {
            iikVar = new iik(onmVar);
        }
        Object obj = iikVar.a;
        int i2 = iikVar.b;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableD = qnv0Var.d(new smq0[]{new smq0(wm5.I(str), mmq0.b, z)}, 6, str2, false, (dg30) null);
                iikVar.b = 1;
                Object objI = fc11.i(completableD, iikVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }
}
