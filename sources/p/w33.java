package p;

import com.spotify.watchfeedentrypoints.api.v1.Status;
import com.spotify.watchfeedentrypoints.api.v1.SubmitMessageResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w33 extends a8d1 implements vu30 {
    public SubmitMessageResponse a;
    public Status b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u961 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w33(u961 u961Var, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = u961Var;
        this.g = str;
        this.h = str2;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        w33 w33Var = new w33(this.f, this.g, this.h, lnmVar);
        w33Var.e = obj;
        return w33Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((w33) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x0027, CancellationException -> 0x0136, TryCatch #2 {CancellationException -> 0x0136, Exception -> 0x0027, blocks: (B:9:0x0021, B:43:0x00d5, B:33:0x0089, B:37:0x00ac, B:40:0x00bf, B:44:0x00da, B:46:0x00e0, B:47:0x00e6, B:50:0x0101, B:51:0x0105, B:16:0x0034, B:17:0x003a, B:30:0x007f, B:18:0x003e, B:27:0x0068, B:21:0x0045, B:22:0x0049, B:24:0x0058), top: B:64:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: Exception -> 0x0027, CancellationException -> 0x0136, TryCatch #2 {CancellationException -> 0x0136, Exception -> 0x0027, blocks: (B:9:0x0021, B:43:0x00d5, B:33:0x0089, B:37:0x00ac, B:40:0x00bf, B:44:0x00da, B:46:0x00e0, B:47:0x00e6, B:50:0x0101, B:51:0x0105, B:16:0x0034, B:17:0x003a, B:30:0x007f, B:18:0x003e, B:27:0x0068, B:21:0x0045, B:22:0x0049, B:24:0x0058), top: B:64:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00da A[Catch: Exception -> 0x0027, CancellationException -> 0x0136, PHI: r1 r15
      0x00da: PHI (r1v8 com.spotify.watchfeedentrypoints.api.v1.Status) = (r1v12 com.spotify.watchfeedentrypoints.api.v1.Status), (r1v13 com.spotify.watchfeedentrypoints.api.v1.Status) binds: [B:39:0x00bc, B:32:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r15v11 com.spotify.watchfeedentrypoints.api.v1.SubmitMessageResponse) = 
      (r15v18 com.spotify.watchfeedentrypoints.api.v1.SubmitMessageResponse)
      (r15v19 com.spotify.watchfeedentrypoints.api.v1.SubmitMessageResponse)
     binds: [B:39:0x00bc, B:32:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0136, Exception -> 0x0027, blocks: (B:9:0x0021, B:43:0x00d5, B:33:0x0089, B:37:0x00ac, B:40:0x00bf, B:44:0x00da, B:46:0x00e0, B:47:0x00e6, B:50:0x0101, B:51:0x0105, B:16:0x0034, B:17:0x003a, B:30:0x007f, B:18:0x003e, B:27:0x0068, B:21:0x0045, B:22:0x0049, B:24:0x0058), top: B:64:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0 A[Catch: Exception -> 0x0027, CancellationException -> 0x0136, TryCatch #2 {CancellationException -> 0x0136, Exception -> 0x0027, blocks: (B:9:0x0021, B:43:0x00d5, B:33:0x0089, B:37:0x00ac, B:40:0x00bf, B:44:0x00da, B:46:0x00e0, B:47:0x00e6, B:50:0x0101, B:51:0x0105, B:16:0x0034, B:17:0x003a, B:30:0x007f, B:18:0x003e, B:27:0x0068, B:21:0x0045, B:22:0x0049, B:24:0x0058), top: B:64:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0101 A[Catch: Exception -> 0x0027, CancellationException -> 0x0136, TryCatch #2 {CancellationException -> 0x0136, Exception -> 0x0027, blocks: (B:9:0x0021, B:43:0x00d5, B:33:0x0089, B:37:0x00ac, B:40:0x00bf, B:44:0x00da, B:46:0x00e0, B:47:0x00e6, B:50:0x0101, B:51:0x0105, B:16:0x0034, B:17:0x003a, B:30:0x007f, B:18:0x003e, B:27:0x0068, B:21:0x0045, B:22:0x0049, B:24:0x0058), top: B:64:0x0011 }] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (p.hap1.i(r11, r14) == r9) goto L42;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d2 -> B:10:0x0024). Please report as a decompilation issue!!! */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w33.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
