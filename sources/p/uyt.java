package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uyt implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ oxt c;

    public /* synthetic */ uyt(vr20 vr20Var, ezt eztVar, oxt oxtVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = oxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        tyt tytVar;
        bxt bxtVarC;
        wyt wytVar;
        yyt yytVar;
        zyt zytVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oxt oxtVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof tyt) {
                    tytVar = (tyt) lnmVar;
                    int i = tytVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tytVar.b = i - Integer.MIN_VALUE;
                    } else {
                        tytVar = new tyt(this, lnmVar);
                    }
                } else {
                    tytVar = new tyt(this, lnmVar);
                }
                Object obj2 = tytVar.a;
                int i2 = tytVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                nzt nztVarJ = ezt.j((szt) obj, oxtVar);
                bxtVarC = nztVarJ != null ? nztVarJ.c() : null;
                tytVar.b = 1;
                return vr20Var.emit(bxtVarC, tytVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof wyt) {
                    wytVar = (wyt) lnmVar;
                    int i3 = wytVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wytVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        wytVar = new wyt(this, lnmVar);
                    }
                } else {
                    wytVar = new wyt(this, lnmVar);
                }
                Object obj3 = wytVar.a;
                int i4 = wytVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                nzt nztVarJ2 = ezt.j((szt) obj, oxtVar);
                bxtVarC = nztVarJ2 != null ? nztVarJ2.c() : null;
                wytVar.b = 1;
                return vr20Var.emit(bxtVarC, wytVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof yyt) {
                    yytVar = (yyt) lnmVar;
                    int i5 = yytVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yytVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        yytVar = new yyt(this, lnmVar);
                    }
                } else {
                    yytVar = new yyt(this, lnmVar);
                }
                Object obj4 = yytVar.a;
                int i6 = yytVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                nzt nztVarJ3 = ezt.j((szt) obj, oxtVar);
                bxtVarC = nztVarJ3 != null ? nztVarJ3.c() : null;
                yytVar.b = 1;
                return vr20Var.emit(bxtVarC, yytVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof zyt) {
                    zytVar = (zyt) lnmVar;
                    int i7 = zytVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        zytVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        zytVar = new zyt(this, lnmVar);
                    }
                } else {
                    zytVar = new zyt(this, lnmVar);
                }
                Object obj5 = zytVar.a;
                int i8 = zytVar.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    nzt nztVarJ4 = ezt.j((szt) obj, oxtVar);
                    zytVar.b = 1;
                    return vr20Var.emit(nztVarJ4, zytVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
