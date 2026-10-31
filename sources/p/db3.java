package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class db3 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public vr20 c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db3(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        switch (b) {
            case 0:
                db3 db3Var = new db3((lnm) obj3, (j2e0) this.f, (fb3) this.g, (byte) 0);
                db3Var.d = vr20Var;
                db3Var.e = obj2;
                return db3Var.invokeSuspend(rih1Var);
            case 1:
                db3 db3Var2 = new db3((uo5) this.e, (ig00) this.f, (dg8) this.g, (lnm) obj3, (byte) 1);
                db3Var2.c = vr20Var;
                db3Var2.d = (tf00) obj2;
                return db3Var2.invokeSuspend(rih1Var);
            case 2:
                db3 db3Var3 = new db3((en10) this.g, (lnm) obj3);
                db3Var3.c = vr20Var;
                db3Var3.f = (Map) obj2;
                return db3Var3.invokeSuspend(rih1Var);
            case 3:
                db3 db3Var4 = new db3((lnm) obj3, (vjd0) this.f, (String) this.g, (byte) 3);
                db3Var4.d = vr20Var;
                db3Var4.e = obj2;
                return db3Var4.invokeSuspend(rih1Var);
            case 4:
                db3 db3Var5 = new db3((l811) this.e, (tzr0) this.f, (oei1) this.g, (lnm) obj3, (byte) 4);
                db3Var5.c = vr20Var;
                db3Var5.d = (tei1) obj2;
                return db3Var5.invokeSuspend(rih1Var);
            default:
                db3 db3Var6 = new db3((lnm) obj3, (hgo) this.f);
                db3Var6.d = vr20Var;
                db3Var6.e = obj2;
                return db3Var6.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x029d  */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        if (r11.emit(r0, r18) == r6) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws com.spotify.liveroom.listeningparty.messagesourcefactory.PartyMessageSourceInstallException {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.db3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db3(lnm lnmVar, Object obj, Object obj2, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db3(lnm lnmVar, hgo hgoVar) {
        super(3, lnmVar);
        this.a = (byte) 5;
        this.f = hgoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db3(en10 en10Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.g = en10Var;
    }
}
