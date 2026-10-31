package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y3s extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3s(z610 z610Var, v9u0 v9u0Var, sst0 sst0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 9;
        this.d = z610Var;
        this.e = v9u0Var;
        this.f = sst0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                y3s y3sVar = new y3s((lnm) obj3, this.f, (byte) 0);
                y3sVar.d = (vr20) obj;
                y3sVar.e = obj2;
                return y3sVar.invokeSuspend(rih1Var);
            case 1:
                y3s y3sVar2 = new y3s((lnm) obj3, this.f, (byte) 1);
                y3sVar2.d = (vr20) obj;
                y3sVar2.e = obj2;
                return y3sVar2.invokeSuspend(rih1Var);
            case 2:
                y3s y3sVar3 = new y3s((lnm) obj3, this.f, (byte) 2);
                y3sVar3.d = (vr20) obj;
                y3sVar3.e = obj2;
                return y3sVar3.invokeSuspend(rih1Var);
            case 3:
                y3s y3sVar4 = new y3s((lnm) obj3, (tks) this.f, b2);
                y3sVar4.d = (vr20) obj;
                y3sVar4.e = (Object[]) obj2;
                return y3sVar4.invokeSuspend(rih1Var);
            case 4:
                y3s y3sVar5 = new y3s((fty) this.e, (xsy) this.f, (lnm) obj3);
                y3sVar5.b = (vr20) obj;
                y3sVar5.d = (PlayerState) obj2;
                return y3sVar5.invokeSuspend(rih1Var);
            case 5:
                y3s y3sVar6 = new y3s((vu30) this.f, (lnm) obj3);
                y3sVar6.d = (vr20) obj;
                y3sVar6.e = obj2;
                return y3sVar6.invokeSuspend(rih1Var);
            case 6:
                y3s y3sVar7 = new y3s((lnm) obj3, this.f, (byte) 6);
                y3sVar7.d = (vr20) obj;
                y3sVar7.e = (Object[]) obj2;
                return y3sVar7.invokeSuspend(rih1Var);
            case 7:
                y3s y3sVar8 = new y3s((lnm) obj3, this.f, (byte) 7);
                y3sVar8.d = (vr20) obj;
                y3sVar8.e = (Object[]) obj2;
                return y3sVar8.invokeSuspend(rih1Var);
            case 8:
                y3s y3sVar9 = new y3s((lnm) obj3, this.f, (byte) 8);
                y3sVar9.d = (vr20) obj;
                y3sVar9.e = (Object[]) obj2;
                return y3sVar9.invokeSuspend(rih1Var);
            case 9:
                y3s y3sVar10 = new y3s((z610) this.d, (v9u0) this.e, (sst0) this.f, (lnm) obj3);
                y3sVar10.b = (x610) obj;
                return y3sVar10.invokeSuspend(rih1Var);
            case 10:
                y3s y3sVar11 = new y3s(b2, (lnm) obj3);
                y3sVar11.d = (vr20) obj;
                y3sVar11.e = obj2;
                return y3sVar11.invokeSuspend(rih1Var);
            case 11:
                y3s y3sVar12 = new y3s((lnm) obj3, this.f, (byte) 11);
                y3sVar12.d = (vr20) obj;
                y3sVar12.e = obj2;
                return y3sVar12.invokeSuspend(rih1Var);
            default:
                y3s y3sVar13 = new y3s((lnm) obj3, this.f, (byte) 12);
                y3sVar13.d = (vr20) obj;
                y3sVar13.e = obj2;
                return y3sVar13.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0586, code lost:
    
        if (r1 == r8) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x05ec, code lost:
    
        if (r1 == r8) goto L281;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y3s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3s(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3s(fty ftyVar, xsy xsyVar, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 4;
        this.e = ftyVar;
        this.f = xsyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3s(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3s(vu30 vu30Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 5;
        this.f = vu30Var;
    }
}
