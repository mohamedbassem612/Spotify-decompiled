package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lck1 extends a8d1 implements vu30 {
    public PlayerState a;
    public byte b;
    public final /* synthetic */ pck1 c;
    public final /* synthetic */ t45 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lck1(pck1 pck1Var, t45 t45Var, String str, String str2, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.c = pck1Var;
        this.d = t45Var;
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new lck1(this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
    
        if (r0 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (r0 == r9) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lck1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
