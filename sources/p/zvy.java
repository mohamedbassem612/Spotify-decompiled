package p;

import com.spotify.player.model.Context;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zvy extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvy(q1d0 q1d0Var, hdn0 hdn0Var, hdn0 hdn0Var2, ven0 ven0Var, ven0 ven0Var2, wat watVar, xtb0 xtb0Var, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = q1d0Var;
        this.d = hdn0Var;
        this.e = hdn0Var2;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = watVar;
        this.i = xtb0Var;
        this.t = ven0Var3;
        this.X = ven0Var4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.X;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (b) {
            case 0:
                zvy zvyVar = new zvy((bwy) this.f, (z771) this.g, (oey) obj5, (exy) obj4, (t8r0) obj3, (oud) obj2, lnmVar, (byte) 0);
                zvyVar.e = obj;
                return zvyVar;
            case 1:
                return new zvy((q1d0) this.c, (hdn0) this.d, (hdn0) this.e, (ven0) this.f, (ven0) this.g, (wat) obj5, (xtb0) obj4, (ven0) obj3, (ven0) obj2, lnmVar);
            case 2:
                zvy zvyVar2 = new zvy((bkc0) this.f, (phi0) this.g, (p811) obj5, (ih71) obj4, (g471) obj3, (u771) obj2, lnmVar, (byte) 2);
                zvyVar2.d = obj;
                return zvyVar2;
            case 3:
                zvy zvyVar3 = new zvy((vna1) this.f, (CommandPlayRequest) this.g, (List) obj5, (t45) obj4, (VoiceAssistantLoggingContext) obj3, (Context) obj2, lnmVar, (byte) 3);
                zvyVar3.e = obj;
                return zvyVar3;
            default:
                zvy zvyVar4 = new zvy((idb1) obj5, (qxc0) obj4, (d0r) obj3, (hti0) obj2, lnmVar);
                zvyVar4.e = obj;
                return zvyVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021f  */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x020c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0215  */
    /* JADX WARN: Code duplicated, block: B:97:0x0218  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b5, code lost:
    
        if (r15.j(r29) == r8) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zvy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.t = obj5;
        this.X = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvy(idb1 idb1Var, qxc0 qxc0Var, d0r d0rVar, hti0 hti0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.h = idb1Var;
        this.i = qxc0Var;
        this.t = d0rVar;
        this.X = hti0Var;
    }
}
