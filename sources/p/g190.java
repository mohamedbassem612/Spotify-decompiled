package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g190 extends a8d1 implements iu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public String b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g190(o190 o190Var, r3b1 r3b1Var, cks0 cks0Var, add addVar, bfd bfdVar, kbd kbdVar, ttz ttzVar, lnm lnmVar) {
        super(1, lnmVar);
        this.f = o190Var;
        this.g = r3b1Var;
        this.h = cks0Var;
        this.i = addVar;
        this.t = bfdVar;
        this.X = kbdVar;
        this.Y = ttzVar;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.Y;
        Object obj2 = this.X;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (b) {
            case 0:
                return new g190((o190) this.f, (r3b1) this.g, (cks0) obj5, (add) obj4, (bfd) obj3, (kbd) obj2, (ttz) obj, lnmVar);
            default:
                return new g190((s2t) obj5, (s2t) obj4, (rb90) obj3, (ayg1) obj2, (SceneTemplate.WrappedTwinContent.TelepathyCard) obj, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0302  */
    /* JADX WARN: Code duplicated, block: B:48:0x0188  */
    /* JADX WARN: Code duplicated, block: B:51:0x019a  */
    /* JADX WARN: Code duplicated, block: B:52:0x019d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01be  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d7, code lost:
    
        if (r0 == r7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ed, code lost:
    
        if (r0 == r7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0254, code lost:
    
        if (r0 == r7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x027f, code lost:
    
        if (r0 == r7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a9, code lost:
    
        if (r0 == r7) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g190.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g190(s2t s2tVar, s2t s2tVar2, rb90 rb90Var, ayg1 ayg1Var, SceneTemplate.WrappedTwinContent.TelepathyCard telepathyCard, lnm lnmVar) {
        super(1, lnmVar);
        this.h = s2tVar;
        this.i = s2tVar2;
        this.t = rb90Var;
        this.X = ayg1Var;
        this.Y = telepathyCard;
    }
}
