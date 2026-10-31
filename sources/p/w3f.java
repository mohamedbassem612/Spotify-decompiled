package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w3f {
    public final Observable a;
    public final bfd b;
    public final pd71 c;
    public final jjz d;

    public w3f(Observable observable, bfd bfdVar, pd71 pd71Var, jjz jjzVar) {
        this.a = observable;
        this.b = bfdVar;
        this.c = pd71Var;
        this.d = jjzVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x01af A[Catch: CancellationException -> 0x0052, Exception -> 0x01c2, TryCatch #5 {CancellationException -> 0x0052, Exception -> 0x01c2, blocks: (B:15:0x004d, B:99:0x01a9, B:101:0x01af, B:103:0x01be, B:20:0x0062, B:93:0x018a), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0211  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TRY_ENTER, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5 A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TRY_ENTER, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106 A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, PHI: r13 r14 r15
      0x0106: PHI (r13v14 ??) = (r13v42 ??), (r13v43 ??) binds: [B:65:0x0102, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r14v21 ??) = (r14v51 ??), (r14v52 ??) binds: [B:65:0x0102, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r15v24 ??) = (r15v51 ??), (r15v52 ??) binds: [B:65:0x0102, B:35:0x009c] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, PHI: r13 r14 r15
      0x011f: PHI (r13v16 ??) = (r13v40 ??), (r13v41 ??) binds: [B:68:0x011b, B:32:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r14v23 ??) = (r14v49 ??), (r14v50 ??) binds: [B:68:0x011b, B:32:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r15v28 ??) = (r15v49 ??), (r15v50 ??) binds: [B:68:0x011b, B:32:0x0093] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0132 A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TRY_ENTER, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d A[Catch: Exception -> 0x0079, CancellationException -> 0x007c, TryCatch #4 {CancellationException -> 0x007c, Exception -> 0x0079, blocks: (B:23:0x0071, B:88:0x016f, B:29:0x0086, B:84:0x0152, B:32:0x0093, B:70:0x011f, B:35:0x009c, B:67:0x0106, B:38:0x00a4, B:48:0x00c6, B:50:0x00cc, B:64:0x00f5, B:77:0x0132, B:80:0x013d, B:51:0x00d1, B:55:0x00dc, B:57:0x00e4, B:59:0x00ea, B:60:0x00ef, B:42:0x00ad, B:45:0x00b6), top: B:125:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0189  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a6  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e5, code lost:
    
        if (r3 == r5) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v22, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [byte] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r13, java.lang.String r14, p.onm r15) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w3f.a(int, java.lang.String, p.onm):java.lang.Object");
    }

    public final Object b(String str, String str2, String str3, v3f v3fVar) {
        Object objG = this.b.G(new g8d(str2, str2, new e8d(new tom("", str2, new w4i1(str, str, 12, (String) null), 0L, false, new lpl(str3, null, null, null, null, null, null, 126), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 4032), false), true), v3fVar);
        return objG == d9n.a ? objG : rih1.a;
    }
}
