package p;

import android.net.Uri;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class po71 extends a8d1 implements vu30 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ opa Z;
    public Locale a;
    public qo71 b;
    public mlg c;
    public long d;
    public long e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qo71 h;
    public final /* synthetic */ Uri i;
    public final /* synthetic */ mlg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po71(qo71 qo71Var, Uri uri, mlg mlgVar, long j, long j2, opa opaVar, lnm lnmVar) {
        super(2, lnmVar);
        this.h = qo71Var;
        this.i = uri;
        this.t = mlgVar;
        this.X = j;
        this.Y = j2;
        this.Z = opaVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        po71 po71Var = new po71(this.h, this.i, this.t, this.X, this.Y, this.Z, lnmVar);
        po71Var.g = obj;
        return po71Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02be A[Catch: Exception -> 0x02c4, all -> 0x02ea, TryCatch #7 {all -> 0x02ea, blocks: (B:101:0x02b0, B:102:0x02b2, B:104:0x02be, B:109:0x02ca), top: B:140:0x02b0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ca A[Catch: Exception -> 0x02c4, all -> 0x02ea, TRY_LEAVE, TryCatch #7 {all -> 0x02ea, blocks: (B:101:0x02b0, B:102:0x02b2, B:104:0x02be, B:109:0x02ca), top: B:140:0x02b0 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:138:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x021c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118 A[PHI: r5 r11 r12 r15 r17 r18 r19
      0x0118: PHI (r5v9 java.util.Locale) = (r5v5 java.util.Locale), (r5v27 java.util.Locale) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r11v7 p.mlg) = (r11v5 p.mlg), (r11v21 p.mlg) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r12v18 long) = (r12v9 long), (r12v30 long) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r15v8 p.qo71) = (r15v3 p.qo71), (r15v15 p.qo71) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r17v4 android.net.Uri) = (r17v1 android.net.Uri), (r17v7 android.net.Uri) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r18v5 java.util.List) = (r18v1 java.util.List), (r18v8 java.util.List) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r19v4 long) = (r19v2 long), (r19v8 long) binds: [B:73:0x0113, B:69:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x012e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x018b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0228  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259 A[LOOP:0: B:91:0x0208->B:99:0x0259, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0329, code lost:
    
        if (p.jch0.s(r3, r0, r31) == r14) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r12 == r14) goto L129;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0228, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.po71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
