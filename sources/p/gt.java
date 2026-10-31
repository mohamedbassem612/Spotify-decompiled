package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gt extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt(ViewGroup viewGroup, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = viewGroup;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                gt gtVar = new gt(viewGroup, lnmVar, (byte) 0);
                gtVar.d = obj;
                return gtVar;
            case 1:
                gt gtVar2 = new gt(viewGroup, lnmVar, (byte) 1);
                gtVar2.d = obj;
                return gtVar2;
            default:
                gt gtVar3 = new gt(viewGroup, lnmVar, (byte) 2);
                gtVar3.d = obj;
                return gtVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r13 == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r13 == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r13 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        if (r13 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        if (r13 == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
    
        if (r13 == r6) goto L71;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:24:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b4 -> B:48:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010b -> B:72:0x010f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
