package p;

import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzu0 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzu0(smp0 smp0Var, uce1 uce1Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 1;
        this.d = smp0Var;
        this.e = uce1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                xzu0 xzu0Var = new xzu0(obj5, (lnm) obj4, (byte) 0);
                xzu0Var.c = (tzu0) obj2;
                xzu0Var.d = (tqw) obj3;
                return xzu0Var.invokeSuspend(rih1Var);
            case 1:
                xzu0 xzu0Var2 = new xzu0((smp0) this.d, (uce1) obj5, (lnm) obj4);
                xzu0Var2.c = (tce1) obj2;
                return xzu0Var2.invokeSuspend(rih1Var);
            case 2:
                xzu0 xzu0Var3 = new xzu0(obj5, (lnm) obj4, (byte) 2);
                xzu0Var3.c = (q2f1) obj;
                xzu0Var3.d = (k2f1) obj2;
                return xzu0Var3.invokeSuspend(rih1Var);
            case 3:
                xzu0 xzu0Var4 = new xzu0(obj5, (lnm) obj4, (byte) 3);
                xzu0Var4.c = (gch1) obj;
                xzu0Var4.d = (fch1) obj2;
                return xzu0Var4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                xzu0 xzu0Var5 = new xzu0(obj5, (lnm) obj4, (byte) 4);
                xzu0Var5.c = (PlayerState) obj;
                xzu0Var5.d = (ne2) obj2;
                xzu0Var5.b = zBooleanValue;
                return xzu0Var5.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                xzu0 xzu0Var6 = new xzu0(obj5, (lnm) obj4, (byte) 5);
                xzu0Var6.c = (m7e0) obj;
                xzu0Var6.d = (cxc0) obj2;
                xzu0Var6.b = zBooleanValue2;
                return xzu0Var6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        b7x b7xVarB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                tzu0 tzu0Var = (tzu0) this.c;
                tqw tqwVar = (tqw) this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (tzu0Var != null) {
                        f1n0 f1n0Var = (f1n0) ((ngs0) obj2).d;
                        tv80 tv80VarD = cvl1.d(tqwVar);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return f1n0.f(f1n0Var, "spotify:new:playlist", tv80VarD, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                tce1 tce1Var = (tce1) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (tce1Var != null) {
                        wce1 wce1Var = (wce1) ((smp0) this.d).c;
                        int i = ((uce1) obj2).a;
                        this.c = null;
                        this.b = true;
                        Object objEmit = wce1Var.a.emit(new Integer(i), this);
                        if (objEmit != d9nVar) {
                            objEmit = rih1Var;
                        }
                        return objEmit == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                z2f1 z2f1Var = (z2f1) obj2;
                d160 d160Var = z2f1Var.f;
                q2f1 q2f1Var = (q2f1) this.c;
                i2f1 i2f1Var = (k2f1) this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    byte b3 = 0;
                    if (u890.j(i2f1Var, f2f1.a)) {
                        if (!q2f1Var.e) {
                            z2f1Var.a.e();
                            return rih1Var;
                        }
                        fn31.T(d160Var.e, (o8n) null, 0, new x060(d160Var, "", lnmVar, b2), 3);
                        d0r d0rVar = z2f1Var.c;
                        jd0 jd0Var = jd0.x;
                        zf90 zf90Var = new zf90(false);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return d0r.d(d0rVar, jd0Var, rih1Var, zf90Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (u890.j(i2f1Var, h2f1.a)) {
                        fn31.T(d160Var.e, (o8n) null, 0, new c160(d160Var, lnmVar, b3), 3);
                        return rih1Var;
                    }
                    if (i2f1Var instanceof i2f1) {
                        fn31.T(d160Var.e, (o8n) null, 0, new x060(d160Var, i2f1Var.a, lnmVar, b2), 3);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                gch1 gch1Var = (gch1) this.c;
                fch1 fch1Var = (fch1) this.d;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (hch1.a[fch1Var.ordinal()] == 1) {
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return ((rwj) obj2).o(gch1Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 4:
                PlayerState playerState = (PlayerState) this.c;
                ne2 ne2Var = (ne2) this.d;
                boolean z5 = this.b;
                hm5.M(obj);
                playerState.getClass();
                return guo1.D(playerState, ne2Var, z5, (cn4) ((qu2) obj2).c);
            default:
                m7e0 m7e0Var = (m7e0) this.c;
                cxc0 cxc0Var = (cxc0) this.d;
                boolean z6 = this.b;
                hm5.M(obj);
                vbe1 vbe1Var = (vbe1) obj2;
                sua suaVar = (sua) vbe1Var.e;
                List list = m7e0Var.b;
                Map map = cxc0Var.f.q;
                String str = (String) vbe1Var.g;
                ArrayList arrayListZ = suaVar.z(list);
                if (arrayListZ.isEmpty()) {
                    b7xVarB = b7x.a;
                } else {
                    kp51 kp51Var = (kp51) o7h.q0(arrayListZ);
                    kp51 kp51Var2 = (kp51) o7h.A0(arrayListZ);
                    ArrayList<kp51> arrayListW = sua.w(arrayListZ);
                    String str2 = kp51Var2.c.c;
                    if (str2 == null) {
                        String str3 = (String) map.get("workout.finish_label");
                        if (str3 != null) {
                            str = str3;
                        }
                    } else {
                        str = str2;
                    }
                    xkg0 xkg0Var = new xkg0();
                    hzl1 hzl1Var = kp51Var.c.a;
                    if (hzl1Var != null) {
                    }
                    for (kp51 kp51Var3 : arrayListW) {
                        hzl1 hzl1Var2 = kp51Var3.c.a;
                        if (hzl1Var2 != null) {
                            xkg0Var.put(Integer.valueOf(kp51Var3.a), new lq51(2, hzl1Var2.b, hzl1Var2.c));
                        }
                    }
                    if (!xkg0Var.isEmpty()) {
                        xkg0Var.put(Integer.valueOf(kp51Var2.a + 1), new lq51(1, str, null));
                    }
                    b7xVarB = xkg0Var.b();
                }
                return new mq51(b7xVarB, z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xzu0(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
