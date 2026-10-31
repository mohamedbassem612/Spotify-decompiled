package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class no2 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no2(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new no2((hrj0) this.c, (q8n) this.d, (uz5) obj2, (Context) obj, lnmVar, (byte) 0);
            case 1:
                return new no2((b0a) obj2, (bhf) obj, lnmVar);
            case 2:
                return new no2((g4b) this.d, (String) obj2, (gzx0) obj, lnmVar);
            case 3:
                return new no2((h72) this.c, (w6e0) this.d, (String) obj2, (kp00) obj, lnmVar, (byte) 3);
            default:
                return new no2((hke) this.c, (jmb1) this.d, (String) obj2, (tv80) obj, lnmVar, (byte) 4);
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
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.TimeoutCancellationException */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r2.h(r6, r4, r5, r21) == r7) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws kotlinx.coroutines.TimeoutCancellationException {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.no2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no2(b0a b0aVar, bhf bhfVar, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 1;
        this.e = b0aVar;
        this.f = bhfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no2(g4b g4bVar, String str, gzx0 gzx0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 2;
        this.d = g4bVar;
        this.e = str;
        this.f = gzx0Var;
    }
}
