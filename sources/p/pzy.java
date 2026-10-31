package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pzy extends z031 implements vu30 {
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public boolean i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pzy(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.Y = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                pzy pzyVar = new pzy((qzy) obj2, lnmVar, (byte) 0);
                pzyVar.t = obj;
                return pzyVar;
            case 1:
                pzy pzyVar2 = new pzy((qzy) obj2, lnmVar, (byte) 1);
                pzyVar2.t = obj;
                return pzyVar2;
            case 2:
                pzy pzyVar3 = new pzy((jj41) obj2, lnmVar, (byte) 2);
                pzyVar3.t = obj;
                return pzyVar3;
            case 3:
                pzy pzyVar4 = new pzy((yl61) obj2, lnmVar, (byte) 3);
                pzyVar4.t = obj;
                return pzyVar4;
            default:
                pzy pzyVar5 = new pzy((dti1) obj2, lnmVar, (byte) 4);
                pzyVar5.t = obj;
                return pzyVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        r561 r561Var = (r561) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(r561Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02f5 A[DONT_INVERT, PHI: r1 r3 r4 r5 r8
      0x02f5: PHI (r1v6 p.r561) = (r1v4 p.r561), (r1v8 p.r561) binds: [B:97:0x02a5, B:105:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r3v4 long[]) = (r3v2 long[]), (r3v6 long[]) binds: [B:97:0x02a5, B:105:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r4v4 int) = (r4v2 int), (r4v6 int) binds: [B:97:0x02a5, B:105:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r5v2 int) = (r5v1 int), (r5v4 int) binds: [B:97:0x02a5, B:105:0x02f0] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r8v4 p.qzy) = (r8v2 p.qzy), (r8v6 p.qzy) binds: [B:97:0x02a5, B:105:0x02f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x02c0 -> B:103:0x02eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0068 -> B:22:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006a -> B:15:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:19:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fc -> B:43:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fe -> B:36:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0115 -> B:40:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x018a -> B:64:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x018c -> B:57:0x019d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a3 -> B:61:0x01c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0218 -> B:85:0x0258). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x021a -> B:78:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0231 -> B:82:0x024f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x02a5 -> B:106:0x02f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02a7 -> B:99:0x02ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pzy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
