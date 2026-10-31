package p;

import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lsb implements hsw, mqb1 {
    public final u9c0 a;
    public final bct b;
    public final c3p c;
    public final cab d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h = true;
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final bbc k = mno1.a(Integer.MAX_VALUE, 0, 6);
    public final bpb1 l;
    public final zob1 m;
    public final zob1 n;
    public final xe01 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final huz f26p;
    public final mr20 q;
    public final yd91 r;

    public lsb(u9c0 u9c0Var, bct bctVar, c3p c3pVar, cab cabVar) {
        this.a = u9c0Var;
        this.b = bctVar;
        this.c = c3pVar;
        this.d = cabVar;
        lnm lnmVar = null;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.l = bpb1VarB;
        kp5 kp5Var = bctVar.c;
        this.m = d5p1.t(rqt0.u(new hs6((mr20) kp5Var.f, (byte) 18)), u9c0Var, new alb1(0L, Long.MAX_VALUE), (Object) null);
        this.n = d5p1.t(rqt0.u(new hs6((xe01) kp5Var.h, (byte) 19)), u9c0Var, new alb1(0L, Long.MAX_VALUE), (Object) null);
        xe01 xe01VarT = d5p1.t(h4p1.g(new tya(rqt0.u(hu20.e(bpb1VarB, new i64(3, (lnm) null, (byte) 4))), (lnm) null, (byte) 1)), u9c0Var, new alb1(0L, Long.MAX_VALUE), (Object) null);
        this.o = xe01VarT;
        this.f26p = new huz(Boolean.TRUE, (byte) 10);
        this.q = rqt0.u(new x72(new any(xe01VarT, (byte) 18), (byte) 11));
        this.r = new yd91(3, new vv8(this, (byte) 29));
        fn31.T(u9c0Var, (o8n) null, 0, new wt(this, lnmVar, (byte) 19), 3);
        fn31.T(u9c0Var, (o8n) null, 0, new esb(this, lnmVar, (byte) 0), 3);
        fn31.T(u9c0Var, (o8n) null, 0, new esb(this, lnmVar, (byte) 2), 3);
        fn31.T(u9c0Var, (o8n) null, 0, new esb(this, lnmVar, (byte) 1), 3);
    }

    public final void A(Map map) {
        LinkedHashMap linkedHashMap = this.i;
        r7h.Z(linkedHashMap.entrySet(), new csb(map, (byte) 0), true);
        LinkedHashMap linkedHashMap2 = this.j;
        r7h.Z(linkedHashMap2.entrySet(), new csb(map, (byte) 1), true);
        if (this.g && this.h) {
            Collection collectionValues = map.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                drb drbVar = (drb) obj;
                if (drbVar.s().a || drbVar.s().b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!linkedHashMap.containsKey(((drb) obj2).v())) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList<drb> arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (!linkedHashMap2.containsKey(((drb) obj3).v())) {
                    arrayList3.add(obj3);
                }
            }
            for (drb drbVar2 : arrayList3) {
                linkedHashMap2.put(drbVar2.v(), drbVar2);
                fn31.T(this.a, (o8n) null, 0, new wt(this, drbVar2, null, (byte) 18), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(drb drbVar, boolean z, onm onmVar) {
        gsb gsbVar;
        if (onmVar instanceof gsb) {
            gsbVar = (gsb) onmVar;
            int i = gsbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gsbVar.c = i - Integer.MIN_VALUE;
            } else {
                gsbVar = new gsb(this, onmVar);
            }
        } else {
            gsbVar = new gsb(this, onmVar);
        }
        Object obj = gsbVar.a;
        int i2 = gsbVar.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (drbVar.s().b) {
                cab cabVar = this.d;
                String strV = drbVar.v();
                gsbVar.c = 1;
                Object objY = cabVar.y(strV, gsbVar, z);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        } catch (IOException unused) {
        }
    }

    public final Object C(Map map, wt wtVar) {
        drb drbVar = (drb) this.l.getValue();
        String str = this.e;
        drb drbVar2 = str != null ? (drb) map.get(str) : null;
        d9n d9nVar = d9n.a;
        if (drbVar != null && map.get(drbVar.v()) != drbVar) {
            Object objD = D(null, wtVar);
            if (objD == d9nVar) {
                return objD;
            }
        } else if (drbVar == null && drbVar2 != null) {
            this.e = null;
            Object objD2 = D(drbVar2, wtVar);
            if (objD2 == d9nVar) {
                return objD2;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(drb drbVar, onm onmVar) {
        hsb hsbVar;
        if (onmVar instanceof hsb) {
            hsbVar = (hsb) onmVar;
            int i = hsbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsbVar.d = i - Integer.MIN_VALUE;
            } else {
                hsbVar = new hsb(this, onmVar);
            }
        } else {
            hsbVar = new hsb(this, onmVar);
        }
        Object obj = hsbVar.b;
        int i2 = hsbVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            bpb1 bpb1Var = this.l;
            drb drbVar2 = (drb) bpb1Var.getValue();
            if (drbVar2 != drbVar) {
                bpb1Var.l(drbVar);
                if (drbVar2 != null) {
                    qrb qrbVar = new qrb(false);
                    hsbVar.a = drbVar;
                    hsbVar.d = 1;
                    if (drbVar2.o(qrbVar, hsbVar) != d9nVar) {
                    }
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        drbVar = hsbVar.a;
        hm5.M(obj);
        if (drbVar != null) {
            qrb qrbVar2 = new qrb(true);
            hsbVar.a = null;
            hsbVar.d = 2;
            if (drbVar.o(qrbVar2, hsbVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (B(r8, r2, r0) == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(p.drb r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.jsb
            if (r0 == 0) goto L13
            r0 = r9
            p.jsb r0 = (p.jsb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.jsb r0 = new p.jsb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L32
            if (r1 != r3) goto L2c
            p.hm5.M(r9)
            goto L70
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L32:
            int r8 = r0.b
            p.drb r1 = r0.a
            p.hm5.M(r9)
            r9 = r8
            r8 = r1
            goto L60
        L3c:
            p.hm5.M(r9)
            p.bpb1 r9 = r7.l
            java.lang.Object r9 = r9.getValue()
            if (r9 == r8) goto L49
            r9 = r5
            goto L4a
        L49:
            r9 = r2
        L4a:
            r7.e = r4
            r7.f = r5
            if (r9 == 0) goto L52
            r1 = r8
            goto L53
        L52:
            r1 = r4
        L53:
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r1 = r7.D(r1, r0)
            if (r1 != r6) goto L60
            goto L6f
        L60:
            if (r9 == 0) goto L63
            r2 = r5
        L63:
            r0.a = r4
            r0.b = r9
            r0.e = r3
            java.lang.Object r7 = r7.B(r8, r2, r0)
            if (r7 != r6) goto L70
        L6f:
            return r6
        L70:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lsb.E(p.drb, p.onm):java.lang.Object");
    }

    @Override // p.anc0
    public final void b() {
        this.k.l(krb.a);
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.r;
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        this.k.l(new jrb(bundle != null ? bundle.getString("bottom_actions_active_chip_id") : null, bundle == null));
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        String strV;
        drb drbVar = (drb) this.l.getValue();
        if (drbVar == null || (strV = drbVar.v()) == null) {
            strV = this.e;
        }
        bundle.putString("bottom_actions_active_chip_id", strV);
    }

    @Override // p.hsw
    public final mr20 g() {
        return this.f26p;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(Boolean bool, drb drbVar, onm onmVar) {
        wrb wrbVar;
        if (onmVar instanceof wrb) {
            wrbVar = (wrb) onmVar;
            int i = wrbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wrbVar.d = i - Integer.MIN_VALUE;
            } else {
                wrbVar = new wrb(this, onmVar);
            }
        } else {
            wrbVar = new wrb(this, onmVar);
        }
        Object obj = wrbVar.b;
        int i2 = wrbVar.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            this.j.remove(drbVar.v());
            Map map = (Map) this.m.getValue();
            if ((map != null ? (drb) map.get(drbVar.v()) : null) == drbVar) {
                Map map2 = (Map) this.n.getValue();
                if ((map2 != null ? (drb) map2.get(drbVar.v()) : null) == drbVar) {
                    this.i.put(drbVar.v(), drbVar);
                    if (!this.f && this.l.getValue() == null) {
                        if (u890.j(bool, Boolean.TRUE)) {
                            wrbVar.a = null;
                            wrbVar.d = 1;
                            if (D(drbVar, wrbVar) == obj2) {
                                return obj2;
                            }
                        } else if (bool == null && drbVar.s().a) {
                            wrbVar.a = drbVar;
                            wrbVar.d = 2;
                            if (D(drbVar, wrbVar) != obj2) {
                            }
                            return obj2;
                        }
                    }
                }
            }
            return rih1Var;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        drbVar = wrbVar.a;
        hm5.M(obj);
        wrbVar.a = null;
        wrbVar.d = 3;
        if (B(drbVar, true, wrbVar) == obj2) {
            return obj2;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(ta0 ta0Var, onm onmVar) {
        bsb bsbVar;
        if (onmVar instanceof bsb) {
            bsbVar = (bsb) onmVar;
            int i = bsbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bsbVar.d = i - Integer.MIN_VALUE;
            } else {
                bsbVar = new bsb(this, onmVar);
            }
        } else {
            bsbVar = new bsb(this, onmVar);
        }
        Object obj = bsbVar.b;
        int i2 = bsbVar.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.l.getValue() == ta0Var.c) {
                this.f = true;
                bsbVar.a = ta0Var;
                bsbVar.d = 1;
                if (D(null, bsbVar) != obj2) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ta0Var = bsbVar.a;
        hm5.M(obj);
        drb drbVar = ta0Var.c;
        bsbVar.a = null;
        bsbVar.d = 2;
        return B(drbVar, false, bsbVar) == obj2 ? obj2 : rih1Var;
    }
}
