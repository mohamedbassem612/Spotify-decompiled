package p;

import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tgg extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tgg(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new tgg((toj0) this.c, (y8n0) obj2, (tv80) obj, lnmVar, (byte) 0);
            case 1:
                return new tgg((iu30) this.c, (e4j0) obj2, (n3j0) obj, lnmVar, (byte) 1);
            case 2:
                return new tgg((k811) obj2, (rvk) obj, lnmVar, (byte) 2);
            case 3:
                return new tgg((SpotifyWearableListenerService) obj2, (iu30) obj, lnmVar, (byte) 3);
            case 4:
                return new tgg((sst0) this.c, (hnc0) obj2, (SpotifyWearableListenerService) obj, lnmVar, (byte) 4);
            default:
                return new tgg((x5f1) this.c, (l8t0) obj2, (hfn0) obj, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0178  */
    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0183  */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0196  */
    /* JADX WARN: Code duplicated, block: B:114:0x0199  */
    /* JADX WARN: Code duplicated, block: B:115:0x019f  */
    /* JADX WARN: Code duplicated, block: B:132:0x01db  */
    /* JADX WARN: Code duplicated, block: B:258:0x03ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:310:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:315:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:362:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:363:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:455:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0163  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (p.rc2.M(1500, r0, r23) == r6) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tgg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tgg(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }
}
