package p;

import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u73 extends a8d1 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Parcelable O0;
    public final /* synthetic */ Object P0;
    public Object X;
    public Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public s2t b;
    public l2t c;
    public l2t d;
    public boolean e;
    public byte f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u73(String str, String str2, x73 x73Var, mb3 mb3Var, lnm lnmVar, lik1 lik1Var) {
        super(2, lnmVar);
        this.Y = x73Var;
        this.Z = str;
        this.N0 = str2;
        this.O0 = mb3Var;
        this.P0 = lik1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.P0;
        qxc0 qxc0Var = this.O0;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                u73 u73Var = new u73((String) obj4, (String) obj3, (x73) this.Y, (mb3) qxc0Var, lnmVar, (lik1) obj2);
                u73Var.g = obj;
                return u73Var;
            default:
                u73 u73Var2 = new u73((jl1) obj4, (hti0) obj3, qxc0Var, (d0r) obj2, lnmVar);
                u73Var2.g = obj;
                return u73Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0156  */
    /* JADX WARN: Code duplicated, block: B:30:0x0181  */
    /* JADX WARN: Code duplicated, block: B:57:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0313  */
    public final Object invokeSuspend(Object obj) {
        s2t s2tVar;
        l2t l2tVarQ;
        Object objQ;
        l2t l2tVar;
        l2t l2tVar2;
        l2t l2tVar3;
        Object objE;
        l2t l2tVar4;
        y73 y73Var;
        l2t l2tVar5;
        wg7 wg7Var;
        Object objE2;
        y73 y73Var2;
        wg7 wg7Var2;
        l2t l2tVar6;
        vum1 vum1Var;
        Object objE3;
        wg7 wg7Var3;
        vum1 vum1Var2;
        l2t l2tVar7;
        boolean zBooleanValue;
        Object objE4;
        vum1 vum1Var3;
        boolean z;
        wg7 wg7Var4;
        s2t s2tVar2;
        l2t l2tVarQ2;
        l2t l2tVarQ3;
        qxc0 qxc0Var;
        Object objQ2;
        hti0 hti0Var;
        l2t l2tVar8;
        Object objE5;
        l2t l2tVar9;
        hti0 hti0Var2;
        l2t l2tVar10;
        vnb1 vnb1Var;
        jl1 jl1Var;
        h2v h2vVar;
        Object objE6;
        vnb1 vnb1Var2;
        qxc0 qxc0Var2;
        h2v h2vVar2;
        hti0 hti0Var3;
        boolean zBooleanValue2;
        Object objE7;
        qxc0 qxc0Var3;
        jl1 jl1Var2;
        vnb1 vnb1Var3;
        h2v h2vVar3;
        hti0 hti0Var4;
        boolean z2;
        byte b = this.a;
        qxc0 qxc0Var4 = this.O0;
        d9n d9nVar = d9n.a;
        Object obj2 = this.Z;
        Object obj3 = this.N0;
        Object obj4 = this.P0;
        switch (b) {
            case 0:
                String str = (String) obj3;
                x73 x73Var = (x73) this.Y;
                c9n c9nVar = (c9n) this.g;
                byte b2 = this.f;
                byte b3 = 5;
                if (b2 == 0) {
                    hm5.M(obj);
                    s2tVar = null;
                    s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new c6(x73Var, (String) obj2, str, (lnm) null, (byte) 17), 3);
                    l2t l2tVarQ4 = fn31.q(c9nVar, (o8n) null, 0, new c6(x73Var, str, (mb3) qxc0Var4, (lnm) null, (byte) 19), 3);
                    l2t l2tVarQ5 = fn31.q(c9nVar, (o8n) null, 0, new c6(x73Var, (lik1) obj4, str, (lnm) null, (byte) 18), 3);
                    l2t l2tVarQ6 = fn31.q(c9nVar, (o8n) null, 0, new r73(x73Var, null, (byte) 2), 3);
                    l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new r73(x73Var, null, (byte) 1), 3);
                    this.g = null;
                    this.b = l2tVarQ4;
                    this.c = l2tVarQ5;
                    this.d = l2tVarQ6;
                    this.h = l2tVarQ;
                    this.f = (byte) 1;
                    objQ = s2tVarQ.Q(this);
                    if (objQ != d9nVar) {
                        l2tVar = l2tVarQ4;
                        l2tVar2 = l2tVarQ6;
                        l2tVar3 = l2tVarQ5;
                    }
                    return d9nVar;
                }
                if (b2 == 1) {
                    l2tVarQ = (l2t) this.h;
                    l2tVar2 = this.d;
                    l2t l2tVar11 = this.c;
                    l2t l2tVar12 = this.b;
                    hm5.M(obj);
                    objQ = obj;
                    l2tVar3 = l2tVar11;
                    l2tVar = l2tVar12;
                    s2tVar = null;
                } else {
                    if (b2 == 2) {
                        y73Var = (y73) this.i;
                        l2tVar4 = (l2t) this.h;
                        l2t l2tVar13 = this.d;
                        l2t l2tVar14 = this.c;
                        hm5.M(obj);
                        objE = obj;
                        l2tVar5 = l2tVar13;
                        l2tVar3 = l2tVar14;
                        b3 = 5;
                        s2tVar = null;
                        wg7Var = (wg7) objE;
                        this.g = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = l2tVar5;
                        this.h = l2tVar4;
                        this.i = y73Var;
                        this.t = wg7Var;
                        this.f = (byte) 3;
                        objE2 = l2tVar3.E(this);
                        if (objE2 != d9nVar) {
                            l2t l2tVar15 = l2tVar4;
                            y73Var2 = y73Var;
                            wg7Var2 = wg7Var;
                            l2tVar6 = l2tVar15;
                            vum1Var = (vum1) objE2;
                            this.g = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.h = l2tVar6;
                            this.i = y73Var2;
                            this.t = wg7Var2;
                            this.X = vum1Var;
                            this.f = (byte) 4;
                            objE3 = l2tVar5.E(this);
                            if (objE3 != d9nVar) {
                                l2t l2tVar16 = l2tVar6;
                                wg7Var3 = wg7Var2;
                                vum1Var2 = vum1Var;
                                l2tVar7 = l2tVar16;
                                zBooleanValue = ((Boolean) objE3).booleanValue();
                                this.g = s2tVar;
                                this.b = s2tVar;
                                this.c = s2tVar;
                                this.d = s2tVar;
                                this.h = s2tVar;
                                this.i = y73Var2;
                                this.t = wg7Var3;
                                this.X = vum1Var2;
                                this.e = zBooleanValue;
                                this.f = b3;
                                objE4 = l2tVar7.E(this);
                                if (objE4 != d9nVar) {
                                    vum1Var3 = vum1Var2;
                                    z = zBooleanValue;
                                    wg7Var4 = wg7Var3;
                                }
                            }
                        }
                        return d9nVar;
                    }
                    if (b2 == 3) {
                        wg7Var2 = (wg7) this.t;
                        y73Var2 = (y73) this.i;
                        l2t l2tVar17 = (l2t) this.h;
                        l2t l2tVar18 = this.d;
                        hm5.M(obj);
                        objE2 = obj;
                        l2tVar6 = l2tVar17;
                        l2tVar5 = l2tVar18;
                        b3 = 5;
                        s2tVar = null;
                        vum1Var = (vum1) objE2;
                        this.g = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.h = l2tVar6;
                        this.i = y73Var2;
                        this.t = wg7Var2;
                        this.X = vum1Var;
                        this.f = (byte) 4;
                        objE3 = l2tVar5.E(this);
                        if (objE3 != d9nVar) {
                            l2t l2tVar19 = l2tVar6;
                            wg7Var3 = wg7Var2;
                            vum1Var2 = vum1Var;
                            l2tVar7 = l2tVar19;
                            zBooleanValue = ((Boolean) objE3).booleanValue();
                            this.g = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.h = s2tVar;
                            this.i = y73Var2;
                            this.t = wg7Var3;
                            this.X = vum1Var2;
                            this.e = zBooleanValue;
                            this.f = b3;
                            objE4 = l2tVar7.E(this);
                            if (objE4 != d9nVar) {
                                vum1Var3 = vum1Var2;
                                z = zBooleanValue;
                                wg7Var4 = wg7Var3;
                            }
                        }
                        return d9nVar;
                    }
                    if (b2 == 4) {
                        vum1Var2 = (vum1) this.X;
                        wg7 wg7Var5 = (wg7) this.t;
                        y73 y73Var3 = (y73) this.i;
                        l2t l2tVar20 = (l2t) this.h;
                        hm5.M(obj);
                        objE3 = obj;
                        wg7Var3 = wg7Var5;
                        y73Var2 = y73Var3;
                        l2tVar7 = l2tVar20;
                        b3 = 5;
                        s2tVar = null;
                        zBooleanValue = ((Boolean) objE3).booleanValue();
                        this.g = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.h = s2tVar;
                        this.i = y73Var2;
                        this.t = wg7Var3;
                        this.X = vum1Var2;
                        this.e = zBooleanValue;
                        this.f = b3;
                        objE4 = l2tVar7.E(this);
                        if (objE4 != d9nVar) {
                            vum1Var3 = vum1Var2;
                            z = zBooleanValue;
                            wg7Var4 = wg7Var3;
                        }
                        return d9nVar;
                    }
                    if (b2 != 5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = this.e;
                    vum1 vum1Var4 = (vum1) this.X;
                    wg7 wg7Var6 = (wg7) this.t;
                    y73 y73Var4 = (y73) this.i;
                    hm5.M(obj);
                    vum1Var3 = vum1Var4;
                    wg7Var4 = wg7Var6;
                    y73Var2 = y73Var4;
                    z = z3;
                    objE4 = obj;
                }
                return new n73(y73Var2, z, vum1Var3, wg7Var4, ((Boolean) objE4).booleanValue());
                y73 y73Var5 = (y73) objQ;
                this.g = s2tVar;
                this.b = s2tVar;
                this.c = l2tVar3;
                this.d = l2tVar2;
                this.h = l2tVarQ;
                this.i = y73Var5;
                this.f = (byte) 2;
                objE = l2tVar.E(this);
                if (objE != d9nVar) {
                    l2t l2tVar21 = l2tVar2;
                    l2tVar4 = l2tVarQ;
                    y73Var = y73Var5;
                    l2tVar5 = l2tVar21;
                    wg7Var = (wg7) objE;
                    this.g = s2tVar;
                    this.b = s2tVar;
                    this.c = s2tVar;
                    this.d = l2tVar5;
                    this.h = l2tVar4;
                    this.i = y73Var;
                    this.t = wg7Var;
                    this.f = (byte) 3;
                    objE2 = l2tVar3.E(this);
                    if (objE2 != d9nVar) {
                        l2t l2tVar110 = l2tVar4;
                        y73Var2 = y73Var;
                        wg7Var2 = wg7Var;
                        l2tVar6 = l2tVar110;
                        vum1Var = (vum1) objE2;
                        this.g = s2tVar;
                        this.b = s2tVar;
                        this.c = s2tVar;
                        this.d = s2tVar;
                        this.h = l2tVar6;
                        this.i = y73Var2;
                        this.t = wg7Var2;
                        this.X = vum1Var;
                        this.f = (byte) 4;
                        objE3 = l2tVar5.E(this);
                        if (objE3 != d9nVar) {
                            l2t l2tVar111 = l2tVar6;
                            wg7Var3 = wg7Var2;
                            vum1Var2 = vum1Var;
                            l2tVar7 = l2tVar111;
                            zBooleanValue = ((Boolean) objE3).booleanValue();
                            this.g = s2tVar;
                            this.b = s2tVar;
                            this.c = s2tVar;
                            this.d = s2tVar;
                            this.h = s2tVar;
                            this.i = y73Var2;
                            this.t = wg7Var3;
                            this.X = vum1Var2;
                            this.e = zBooleanValue;
                            this.f = b3;
                            objE4 = l2tVar7.E(this);
                            if (objE4 != d9nVar) {
                                vum1Var3 = vum1Var2;
                                z = zBooleanValue;
                                wg7Var4 = wg7Var3;
                                return new n73(y73Var2, z, vum1Var3, wg7Var4, ((Boolean) objE4).booleanValue());
                            }
                        }
                    }
                }
                return d9nVar;
            default:
                d0r d0rVar = (d0r) obj4;
                hti0 hti0Var5 = (hti0) obj3;
                jl1 jl1Var3 = (jl1) obj2;
                c9n c9nVar2 = (c9n) this.g;
                byte b4 = this.f;
                if (b4 == 0) {
                    hm5.M(obj);
                    s2t s2tVarQ2 = fn31.q(c9nVar2, (o8n) null, 0, new jrg1(jl1Var3, d0rVar, hti0Var5, (lnm) null, (byte) 0), 3);
                    s2tVar2 = null;
                    l2tVarQ2 = fn31.q(c9nVar2, (o8n) null, 0, new jrg1(jl1Var3, d0rVar, hti0Var5, (lnm) null, (byte) 1), 3);
                    l2t l2tVarQ7 = fn31.q(c9nVar2, (o8n) null, 0, new krg1(jl1Var3, null, (byte) 0), 3);
                    l2tVarQ3 = fn31.q(c9nVar2, (o8n) null, 0, new krg1(jl1Var3, null, (byte) 1), 3);
                    qxc0Var = qxc0Var4;
                    this.g = null;
                    this.b = l2tVarQ2;
                    this.c = l2tVarQ7;
                    this.d = l2tVarQ3;
                    this.h = jl1Var3;
                    this.i = hti0Var5;
                    this.t = qxc0Var;
                    this.f = (byte) 1;
                    objQ2 = s2tVarQ2.Q(this);
                    if (objQ2 != d9nVar) {
                        hti0Var = hti0Var5;
                        l2tVar8 = l2tVarQ7;
                    }
                    return d9nVar;
                }
                if (b4 == 1) {
                    qxc0 qxc0Var5 = (qxc0) this.t;
                    hti0 hti0Var6 = (hti0) this.i;
                    jl1Var3 = (jl1) this.h;
                    l2t l2tVar22 = this.d;
                    l2tVar8 = this.c;
                    l2t l2tVar23 = this.b;
                    hm5.M(obj);
                    qxc0Var = qxc0Var5;
                    l2tVarQ3 = l2tVar22;
                    l2tVarQ2 = l2tVar23;
                    hti0Var = hti0Var6;
                    s2tVar2 = null;
                    objQ2 = obj;
                } else {
                    if (b4 == 2) {
                        vnb1Var = (vnb1) this.X;
                        qxc0Var = (qxc0) this.t;
                        hti0Var2 = (hti0) this.i;
                        jl1Var = (jl1) this.h;
                        l2t l2tVar24 = this.d;
                        l2t l2tVar25 = this.c;
                        hm5.M(obj);
                        l2tVar10 = l2tVar24;
                        l2tVar9 = l2tVar25;
                        s2tVar2 = null;
                        objE5 = obj;
                        h2vVar = (h2v) objE5;
                        this.g = s2tVar2;
                        this.b = s2tVar2;
                        this.c = s2tVar2;
                        this.d = l2tVar10;
                        this.h = jl1Var;
                        this.i = hti0Var2;
                        this.t = qxc0Var;
                        this.X = vnb1Var;
                        this.Y = h2vVar;
                        this.f = (byte) 3;
                        objE6 = l2tVar9.E(this);
                        if (objE6 != d9nVar) {
                            hti0 hti0Var7 = hti0Var2;
                            vnb1Var2 = vnb1Var;
                            qxc0Var2 = qxc0Var;
                            h2vVar2 = h2vVar;
                            hti0Var3 = hti0Var7;
                            zBooleanValue2 = ((Boolean) objE6).booleanValue();
                            this.g = s2tVar2;
                            this.b = s2tVar2;
                            this.c = s2tVar2;
                            this.d = s2tVar2;
                            this.h = jl1Var;
                            this.i = hti0Var3;
                            this.t = qxc0Var2;
                            this.X = vnb1Var2;
                            this.Y = h2vVar2;
                            this.e = zBooleanValue2;
                            this.f = (byte) 4;
                            objE7 = l2tVar10.E(this);
                            if (objE7 != d9nVar) {
                                vnb1 vnb1Var4 = vnb1Var2;
                                qxc0Var3 = qxc0Var2;
                                jl1Var2 = jl1Var;
                                vnb1Var3 = vnb1Var4;
                                h2vVar3 = h2vVar2;
                                hti0Var4 = hti0Var3;
                                z2 = zBooleanValue2;
                            }
                        }
                        return d9nVar;
                    }
                    if (b4 == 3) {
                        h2v h2vVar4 = (h2v) this.Y;
                        vnb1 vnb1Var5 = (vnb1) this.X;
                        qxc0 qxc0Var6 = (qxc0) this.t;
                        hti0 hti0Var8 = (hti0) this.i;
                        jl1 jl1Var4 = (jl1) this.h;
                        l2t l2tVar26 = this.d;
                        hm5.M(obj);
                        h2vVar2 = h2vVar4;
                        qxc0Var2 = qxc0Var6;
                        vnb1Var2 = vnb1Var5;
                        objE6 = obj;
                        l2tVar10 = l2tVar26;
                        hti0Var3 = hti0Var8;
                        jl1Var = jl1Var4;
                        s2tVar2 = null;
                        zBooleanValue2 = ((Boolean) objE6).booleanValue();
                        this.g = s2tVar2;
                        this.b = s2tVar2;
                        this.c = s2tVar2;
                        this.d = s2tVar2;
                        this.h = jl1Var;
                        this.i = hti0Var3;
                        this.t = qxc0Var2;
                        this.X = vnb1Var2;
                        this.Y = h2vVar2;
                        this.e = zBooleanValue2;
                        this.f = (byte) 4;
                        objE7 = l2tVar10.E(this);
                        if (objE7 != d9nVar) {
                            vnb1 vnb1Var6 = vnb1Var2;
                            qxc0Var3 = qxc0Var2;
                            jl1Var2 = jl1Var;
                            vnb1Var3 = vnb1Var6;
                            h2vVar3 = h2vVar2;
                            hti0Var4 = hti0Var3;
                            z2 = zBooleanValue2;
                        }
                        return d9nVar;
                    }
                    if (b4 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = this.e;
                    h2v h2vVar5 = (h2v) this.Y;
                    vnb1 vnb1Var7 = (vnb1) this.X;
                    qxc0 qxc0Var7 = (qxc0) this.t;
                    hti0 hti0Var9 = (hti0) this.i;
                    jl1 jl1Var5 = (jl1) this.h;
                    hm5.M(obj);
                    h2vVar3 = h2vVar5;
                    hti0Var4 = hti0Var9;
                    vnb1Var3 = vnb1Var7;
                    qxc0Var3 = qxc0Var7;
                    z2 = z4;
                    jl1Var2 = jl1Var5;
                    objE7 = obj;
                }
                return jl1Var2.i(hti0Var4, qxc0Var3, vnb1Var3, h2vVar3, z2, (Map) objE7);
                vnb1 vnb1Var8 = (vnb1) objQ2;
                this.g = s2tVar2;
                this.b = s2tVar2;
                this.c = l2tVar8;
                this.d = l2tVarQ3;
                this.h = jl1Var3;
                this.i = hti0Var;
                this.t = qxc0Var;
                this.X = vnb1Var8;
                this.f = (byte) 2;
                objE5 = l2tVarQ2.E(this);
                if (objE5 != d9nVar) {
                    hti0 hti0Var10 = hti0Var;
                    l2tVar9 = l2tVar8;
                    hti0Var2 = hti0Var10;
                    l2tVar10 = l2tVarQ3;
                    vnb1Var = vnb1Var8;
                    jl1Var = jl1Var3;
                    h2vVar = (h2v) objE5;
                    this.g = s2tVar2;
                    this.b = s2tVar2;
                    this.c = s2tVar2;
                    this.d = l2tVar10;
                    this.h = jl1Var;
                    this.i = hti0Var2;
                    this.t = qxc0Var;
                    this.X = vnb1Var;
                    this.Y = h2vVar;
                    this.f = (byte) 3;
                    objE6 = l2tVar9.E(this);
                    if (objE6 != d9nVar) {
                        hti0 hti0Var11 = hti0Var2;
                        vnb1Var2 = vnb1Var;
                        qxc0Var2 = qxc0Var;
                        h2vVar2 = h2vVar;
                        hti0Var3 = hti0Var11;
                        zBooleanValue2 = ((Boolean) objE6).booleanValue();
                        this.g = s2tVar2;
                        this.b = s2tVar2;
                        this.c = s2tVar2;
                        this.d = s2tVar2;
                        this.h = jl1Var;
                        this.i = hti0Var3;
                        this.t = qxc0Var2;
                        this.X = vnb1Var2;
                        this.Y = h2vVar2;
                        this.e = zBooleanValue2;
                        this.f = (byte) 4;
                        objE7 = l2tVar10.E(this);
                        if (objE7 != d9nVar) {
                            vnb1 vnb1Var9 = vnb1Var2;
                            qxc0Var3 = qxc0Var2;
                            jl1Var2 = jl1Var;
                            vnb1Var3 = vnb1Var9;
                            h2vVar3 = h2vVar2;
                            hti0Var4 = hti0Var3;
                            z2 = zBooleanValue2;
                            return jl1Var2.i(hti0Var4, qxc0Var3, vnb1Var3, h2vVar3, z2, (Map) objE7);
                        }
                    }
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u73(jl1 jl1Var, hti0 hti0Var, qxc0 qxc0Var, d0r d0rVar, lnm lnmVar) {
        super(2, lnmVar);
        this.Z = jl1Var;
        this.N0 = hti0Var;
        this.O0 = qxc0Var;
        this.P0 = d0rVar;
    }
}
