package p;

import androidx.compose.material.AnchoredDragFinishedSignal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v14 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ vu30 d;

    public /* synthetic */ v14(p811 p811Var, c9n c9nVar, vu30 vu30Var, byte b) {
        this.a = b;
        this.b = p811Var;
        this.c = c9nVar;
        this.d = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final Object emit(Object obj, lnm lnmVar) {
        s14 s14Var;
        t14 t14Var;
        u14 u14Var;
        Object obj2 = obj;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof s14) {
                    s14Var = (s14) lnmVar;
                    int i = s14Var.e;
                    if ((i & os00.INVALID_ID) != 0) {
                        s14Var.e = i - os00.INVALID_ID;
                    } else {
                        s14Var = new s14(this, lnmVar);
                    }
                } else {
                    s14Var = new s14(this, lnmVar);
                }
                Object obj3 = s14Var.c;
                int i2 = s14Var.e;
                if (i2 == 0) {
                    hm5.M(obj3);
                    faa0 faa0Var = (faa0) p811Var.a;
                    if (faa0Var != null) {
                        faa0Var.d(new AnchoredDragFinishedSignal());
                        s14Var.a = obj2;
                        s14Var.b = faa0Var;
                        s14Var.e = 1;
                        if (faa0Var.j(s14Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    faa0 faa0Var2 = s14Var.b;
                    obj2 = s14Var.a;
                    hm5.M(obj3);
                }
                vu30 vu30Var = this.d;
                c9n c9nVar = this.c;
                p811Var.a = fn31.T(c9nVar, null, 4, new r14(vu30Var, obj2, c9nVar, null, (byte) 0), 1);
                return rih1Var;
            case 1:
                if (lnmVar instanceof t14) {
                    t14Var = (t14) lnmVar;
                    int i3 = t14Var.e;
                    if ((i3 & os00.INVALID_ID) != 0) {
                        t14Var.e = i3 - os00.INVALID_ID;
                    } else {
                        t14Var = new t14(this, lnmVar);
                    }
                } else {
                    t14Var = new t14(this, lnmVar);
                }
                Object obj4 = t14Var.c;
                int i4 = t14Var.e;
                if (i4 == 0) {
                    hm5.M(obj4);
                    faa0 faa0Var3 = (faa0) p811Var.a;
                    if (faa0Var3 != null) {
                        faa0Var3.d(new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                        t14Var.a = obj2;
                        t14Var.b = faa0Var3;
                        t14Var.e = 1;
                        if (faa0Var3.j(t14Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    faa0 faa0Var4 = t14Var.b;
                    obj2 = t14Var.a;
                    hm5.M(obj4);
                }
                vu30 vu30Var2 = this.d;
                c9n c9nVar2 = this.c;
                p811Var.a = fn31.T(c9nVar2, null, 4, new r14(vu30Var2, obj2, c9nVar2, null, (byte) 1), 1);
                return rih1Var;
            default:
                if (lnmVar instanceof u14) {
                    u14Var = (u14) lnmVar;
                    int i5 = u14Var.e;
                    if ((i5 & os00.INVALID_ID) != 0) {
                        u14Var.e = i5 - os00.INVALID_ID;
                    } else {
                        u14Var = new u14(this, lnmVar);
                    }
                } else {
                    u14Var = new u14(this, lnmVar);
                }
                Object obj5 = u14Var.c;
                int i6 = u14Var.e;
                if (i6 == 0) {
                    hm5.M(obj5);
                    faa0 faa0Var5 = (faa0) p811Var.a;
                    if (faa0Var5 != null) {
                        faa0Var5.d(new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                        u14Var.a = obj2;
                        u14Var.b = faa0Var5;
                        u14Var.e = 1;
                        if (faa0Var5.j(u14Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    faa0 faa0Var6 = u14Var.b;
                    obj2 = u14Var.a;
                    hm5.M(obj5);
                }
                vu30 vu30Var3 = this.d;
                c9n c9nVar3 = this.c;
                p811Var.a = fn31.T(c9nVar3, null, 4, new r14(vu30Var3, obj2, c9nVar3, null, (byte) 2), 1);
                return rih1Var;
        }
    }
}
