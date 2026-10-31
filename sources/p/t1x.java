package p;

import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t1x implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ z1x c;

    public /* synthetic */ t1x(vr20 vr20Var, z1x z1xVar, byte b) {
        this.a = b;
        this.c = z1xVar;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0222  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        s1x s1xVar;
        boolean zF;
        u1x u1xVar;
        w1x w1xVar;
        ju0 ju0Var;
        int i;
        Object objA;
        ruw ruwVar;
        int i2;
        int i3;
        anf1 anf1Var;
        ju0 ju0Var2;
        mmr0 mmr0Var;
        ju0 ju0Var3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        z1x z1xVar = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof s1x) {
                    s1xVar = (s1x) lnmVar;
                    int i4 = s1xVar.b;
                    if ((i4 & os00.INVALID_ID) != 0) {
                        s1xVar.b = i4 - os00.INVALID_ID;
                    } else {
                        s1xVar = new s1x(this, lnmVar);
                    }
                } else {
                    s1xVar = new s1x(this, lnmVar);
                }
                Object obj2 = s1xVar.a;
                int i5 = s1xVar.b;
                if (i5 == 0) {
                    hm5.M(obj2);
                    mmr0 mmr0Var2 = (mmr0) obj;
                    uuw uuwVar = (uuw) mmr0Var2.a;
                    ju0 ju0Var4 = (ju0) mmr0Var2.b;
                    j44 j44Var = z1xVar.h;
                    int iOrdinal = ju0Var4.ordinal();
                    if (iOrdinal == 0) {
                        zF = true;
                    } else if (iOrdinal == 1) {
                        zF = j44Var.f();
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                        zF = true;
                    } else if (iOrdinal == 4) {
                        zF = j44Var.e();
                    } else {
                        eg.o();
                    }
                    if (!zF) {
                        return rih1Var;
                    }
                    Set setB = z1xVar.b(uuwVar.b());
                    if (setB.isEmpty() && (uuwVar instanceof ruw)) {
                        mmr0 mmr0Var3 = new mmr0(uuwVar, ju0Var4);
                        s1xVar.b = 2;
                        if (vr20Var.emit(mmr0Var3, s1xVar) != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        s1xVar.b = 1;
                        if (z1x.c(this.c, uuwVar, 3, ju0Var4, setB, null, s1xVar, 16) != d9nVar) {
                            return rih1Var;
                        }
                    }
                    return d9nVar;
                }
                if (i5 == 1 || i5 == 2) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof u1x) {
                    u1xVar = (u1x) lnmVar;
                    int i6 = u1xVar.b;
                    if ((i6 & os00.INVALID_ID) != 0) {
                        u1xVar.b = i6 - os00.INVALID_ID;
                    } else {
                        u1xVar = new u1x(this, lnmVar);
                    }
                } else {
                    u1xVar = new u1x(this, lnmVar);
                }
                Object obj3 = u1xVar.a;
                int i7 = u1xVar.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                mmr0 mmr0Var4 = (mmr0) obj;
                uuw uuwVar2 = (uuw) mmr0Var4.a;
                PlayerState playerState = (PlayerState) mmr0Var4.b;
                if (playerState.isPaused() && !((Boolean) z1xVar.l.c.getValue()).booleanValue()) {
                    mmr0 mmr0Var5 = new mmr0(uuwVar2, ju0.NPV_PAUSE);
                    u1xVar.b = 1;
                    return vr20Var.emit(mmr0Var5, u1xVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (playerState.isPaused()) {
                    return rih1Var;
                }
                Set setB2 = z1xVar.b(uuwVar2.b());
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : setB2) {
                    if (((iu0) obj4) != iu0.g) {
                        arrayList.add(obj4);
                    }
                }
                if (!arrayList.isEmpty() || !(uuwVar2 instanceof ruw)) {
                    return rih1Var;
                }
                q1x q1xVar = z1xVar.f181p;
                d1x.b(z1xVar.f, 15, (q1xVar == null || !q1xVar.b) ? q1xVar != null ? q1xVar.a.a : null : null, (Map) null, (String) null, 12);
                return rih1Var;
            default:
                if (lnmVar instanceof w1x) {
                    w1xVar = (w1x) lnmVar;
                    int i8 = w1xVar.b;
                    if ((i8 & os00.INVALID_ID) != 0) {
                        w1xVar.b = i8 - os00.INVALID_ID;
                    } else {
                        w1xVar = new w1x(this, lnmVar);
                    }
                } else {
                    w1xVar = new w1x(this, lnmVar);
                }
                Object objN = w1xVar.a;
                int i9 = w1xVar.b;
                if (i9 == 0) {
                    hm5.M(objN);
                    mmr0 mmr0Var6 = (mmr0) obj;
                    ruw ruwVar2 = (ruw) mmr0Var6.a;
                    ju0Var = (ju0) mmr0Var6.b;
                    w1xVar.c = vr20Var;
                    w1xVar.f = ruwVar2;
                    w1xVar.g = ju0Var;
                    i = 0;
                    w1xVar.d = 0;
                    w1xVar.i = 0;
                    w1xVar.b = 1;
                    objA = z1xVar.a(ruwVar2, ju0Var, w1xVar);
                    if (objA != d9nVar) {
                        ruwVar = ruwVar2;
                        i2 = 0;
                    }
                    return d9nVar;
                }
                if (i9 == 1) {
                    int i10 = w1xVar.i;
                    i2 = w1xVar.d;
                    ju0Var = w1xVar.g;
                    ruw ruwVar3 = w1xVar.f;
                    vr20 vr20Var2 = w1xVar.c;
                    hm5.M(objN);
                    ruwVar = ruwVar3;
                    objA = objN;
                    i = i10;
                    vr20Var = vr20Var2;
                } else {
                    if (i9 == 2) {
                        int i11 = w1xVar.i;
                        int i12 = w1xVar.d;
                        anf1 anf1Var2 = w1xVar.h;
                        ju0Var2 = w1xVar.g;
                        vr20 vr20Var3 = w1xVar.c;
                        hm5.M(objN);
                        i = i11;
                        i3 = i12;
                        anf1Var = anf1Var2;
                        vr20Var = vr20Var3;
                        ay0 ay0Var = z1xVar.d;
                        w1xVar.c = vr20Var;
                        w1xVar.f = null;
                        w1xVar.g = ju0Var2;
                        w1xVar.h = anf1Var;
                        w1xVar.d = i3;
                        w1xVar.i = i;
                        w1xVar.b = 3;
                        objN = g3p1.n(ay0Var, w1xVar);
                        if (objN != d9nVar) {
                            ju0Var3 = ju0Var2;
                        }
                        return d9nVar;
                    }
                    if (i9 != 3) {
                        if (i9 == 4) {
                            hm5.M(objN);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = w1xVar.d;
                    anf1Var = w1xVar.h;
                    ju0Var3 = w1xVar.g;
                    vr20Var = w1xVar.c;
                    hm5.M(objN);
                }
                i2 = i3;
                mmr0Var = new mmr0(new anf1((ji0) objN, anf1Var.b), ju0Var3);
                w1xVar.c = null;
                w1xVar.f = null;
                w1xVar.g = null;
                w1xVar.h = null;
                w1xVar.d = i2;
                w1xVar.b = 4;
                if (vr20Var.emit(mmr0Var, w1xVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
                anf1 anf1Var3 = (anf1) objA;
                if (anf1Var3.a == null) {
                    mmr0Var = new mmr0(anf1Var3, ju0Var);
                    w1xVar.c = null;
                    w1xVar.f = null;
                    w1xVar.g = null;
                    w1xVar.h = null;
                    w1xVar.d = i2;
                    w1xVar.b = 4;
                    if (vr20Var.emit(mmr0Var, w1xVar) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    w1xVar.c = vr20Var;
                    w1xVar.f = null;
                    w1xVar.g = ju0Var;
                    w1xVar.h = anf1Var3;
                    w1xVar.d = i2;
                    w1xVar.i = i;
                    w1xVar.b = 2;
                    ju0 ju0Var5 = ju0Var;
                    if (z1x.c(this.c, ruwVar, 1, ju0Var5, null, null, w1xVar, 24) != d9nVar) {
                        i3 = i2;
                        anf1Var = anf1Var3;
                        ju0Var2 = ju0Var5;
                        ay0 ay0Var2 = z1xVar.d;
                        w1xVar.c = vr20Var;
                        w1xVar.f = null;
                        w1xVar.g = ju0Var2;
                        w1xVar.h = anf1Var;
                        w1xVar.d = i3;
                        w1xVar.i = i;
                        w1xVar.b = 3;
                        objN = g3p1.n(ay0Var2, w1xVar);
                        if (objN != d9nVar) {
                            ju0Var3 = ju0Var2;
                            i2 = i3;
                            mmr0Var = new mmr0(new anf1((ji0) objN, anf1Var.b), ju0Var3);
                            w1xVar.c = null;
                            w1xVar.f = null;
                            w1xVar.g = null;
                            w1xVar.h = null;
                            w1xVar.d = i2;
                            w1xVar.b = 4;
                            if (vr20Var.emit(mmr0Var, w1xVar) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return d9nVar;
        }
    }
}
