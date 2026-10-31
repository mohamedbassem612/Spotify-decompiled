package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class moc0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ roc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ moc0(lnm lnmVar, roc0 roc0Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = roc0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        roc0 roc0Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                moc0 moc0Var = new moc0(lnmVar, roc0Var, (byte) 0);
                moc0Var.c = vr20Var;
                moc0Var.d = obj2;
                return moc0Var.invokeSuspend(rih1Var);
            case 1:
                moc0 moc0Var2 = new moc0(lnmVar, roc0Var, (byte) 1);
                moc0Var2.c = vr20Var;
                moc0Var2.d = obj2;
                return moc0Var2.invokeSuspend(rih1Var);
            case 2:
                moc0 moc0Var3 = new moc0(lnmVar, roc0Var, (byte) 2);
                moc0Var3.c = vr20Var;
                moc0Var3.d = obj2;
                return moc0Var3.invokeSuspend(rih1Var);
            case 3:
                moc0 moc0Var4 = new moc0(lnmVar, roc0Var, (byte) 3);
                moc0Var4.c = vr20Var;
                moc0Var4.d = obj2;
                return moc0Var4.invokeSuspend(rih1Var);
            case 4:
                moc0 moc0Var5 = new moc0(lnmVar, roc0Var, (byte) 4);
                moc0Var5.c = vr20Var;
                moc0Var5.d = obj2;
                return moc0Var5.invokeSuspend(rih1Var);
            default:
                moc0 moc0Var6 = new moc0(lnmVar, roc0Var, (byte) 5);
                moc0Var6.c = vr20Var;
                moc0Var6.d = obj2;
                return moc0Var6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object huzVar;
        Object huzVar2;
        Object huzVar3;
        vr20 vr20Var;
        mr20 m441Var;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        roc0 roc0Var = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        byte b4 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var2 = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ly21 ly21Var = (py21) obj2;
                ooc0 ooc0Var = new ooc0(roc0Var, b3);
                ly21Var.getClass();
                if (ly21Var instanceof ly21) {
                    huzVar = ooc0Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    huzVar = new huz((wsc0) ((oy21) ly21Var).a, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                if (l4p1.s(vr20Var2, (mr20) huzVar, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 1:
                vr20 vr20Var3 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ly21 ly21Var2 = (py21) obj3;
                z8b0 z8b0Var = new z8b0(roc0Var, (byte) 11);
                ly21Var2.getClass();
                if (ly21Var2 instanceof ly21) {
                    huzVar2 = z8b0Var.invoke(ly21Var2.a);
                } else {
                    if (!(ly21Var2 instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    huzVar2 = new huz((otl1) ((oy21) ly21Var2).a, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                if (l4p1.s(vr20Var3, (mr20) huzVar2, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 2:
                vr20 vr20Var4 = this.c;
                Object obj4 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ly21 ly21Var3 = (py21) obj4;
                ooc0 ooc0Var2 = new ooc0(roc0Var, b4);
                ly21Var3.getClass();
                if (ly21Var3 instanceof ly21) {
                    huzVar3 = ooc0Var2.invoke(ly21Var3.a);
                } else {
                    if (!(ly21Var3 instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    huzVar3 = new huz((wsc0) ((oy21) ly21Var3).a, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                if (l4p1.s(vr20Var4, (mr20) huzVar3, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                vr20 vr20Var5 = this.c;
                Object obj5 = this.d;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    trc0 trc0Var = (trc0) obj5;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = roc0Var.q;
                    String str = roc0Var.b;
                    tf2 tf2Var = roc0Var.m.b ? new tf2(hu20.e(roc0Var.c.k(str, new trc0(playlistRequestDecorationPolicy, (g3d0) null, (Set) null, true, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 470)), new moc0(null, roc0Var, b3)), (byte) 13) : new huz(z6x.a, (byte) 10);
                    boolean z5 = (roc0Var.j != null || roc0Var.k || roc0Var.s) ? false : true;
                    roc0Var.s = true;
                    ezu0 ezu0Var = roc0Var.f;
                    xrc0 xrc0Var = ezu0Var.a;
                    zo4 zo4Var = ezu0Var.b;
                    xtl1 xtl1Var = new xtl1(str, xrc0Var, z5, zo4Var);
                    trc0 trc0VarA = trc0.a(trc0Var, playlistRequestDecorationPolicy, (g3d0) null, (Set) null, (mqz0) null, 502);
                    any anyVar = new any(roc0Var.g, (byte) 18);
                    if (zo4Var.a()) {
                        m441Var = new m441(new nsf1(trc0VarA, xtl1Var, anyVar, (lnm) null, (byte) 18));
                        vr20Var = null;
                    } else {
                        vr20Var = null;
                        m441Var = new m441(new l3g1(xtl1Var, anyVar, trc0VarA, false, (lnm) null, (byte) 10));
                    }
                    mr20 mr20VarE = hu20.e(m441Var, new moc0(vr20Var, roc0Var, b4));
                    vv70 vv70Var = new vv70(3, vr20Var, (byte) 8);
                    this.c = vr20Var;
                    this.d = vr20Var;
                    this.b = true;
                    u4p1.S(vr20Var5);
                    Object objS = fc11.s(vrl.c, this, vr20Var5, new ekv(vv70Var, vr20Var), new mr20[]{mr20VarE, tf2Var});
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 4:
                vr20 vr20Var6 = this.c;
                Object obj6 = this.d;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    jge jgeVarE = hu20.e(roc0Var.c.k(roc0Var.b, trc0.a((trc0) obj6, roc0Var.r, (g3d0) null, (Set) null, jqz0.a, 478)), new moc0(lnmVar, roc0Var, b2));
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    u4p1.S(vr20Var6);
                    Object objCollect = jgeVarE.collect(new om70(vr20Var6, roc0Var, (byte) 22), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                vr20 vr20Var7 = this.c;
                Object obj7 = this.d;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    mmr0 mmr0Var = (mmr0) obj7;
                    Set set = (Set) mmr0Var.a;
                    g3d0 g3d0Var = (g3d0) mmr0Var.b;
                    roc0 roc0Var2 = this.e;
                    mr20 mr20VarA = roc0Var2.a.a(s6n.a);
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    u4p1.S(vr20Var7);
                    Object objCollect2 = mr20VarA.collect(new u60(vr20Var7, roc0Var2, g3d0Var, set, (byte) 23), this);
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
