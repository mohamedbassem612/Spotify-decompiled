package p;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import j$.time.Instant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g4c implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g4c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r2.emit(r10, r1) == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r2.emit(r12, r1) == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(java.lang.Object r11, p.lnm r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            p.fbh r0 = (p.fbh) r0
            boolean r1 = r12 instanceof p.ebh
            if (r1 == 0) goto L17
            r1 = r12
            p.ebh r1 = (p.ebh) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            goto L1c
        L17:
            p.ebh r1 = new p.ebh
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.a
            int r2 = r1.b
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            p.hm5.M(r12)
            goto Lbb
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r6
        L37:
            int r10 = r1.f
            int r11 = r1.e
            p.vr20 r2 = r1.d
            p.hm5.M(r12)
            goto L6e
        L41:
            p.hm5.M(r12)
            java.lang.Object r10 = r10.b
            r2 = r10
            p.vr20 r2 = (p.vr20) r2
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            p.wen0 r10 = r0.a
            p.bpb1 r10 = (p.bpb1) r10
            java.lang.Object r10 = r10.getValue()
            if (r10 != 0) goto L6d
            p.ymc0 r10 = new p.ymc0
            r10.<init>(r11, r6)
            r1.d = r2
            r1.e = r11
            r1.f = r3
            r1.b = r5
            java.lang.Object r10 = r2.emit(r10, r1)
            if (r10 != r7) goto L6d
            goto Lba
        L6d:
            r10 = r3
        L6e:
            p.ymc0 r12 = new p.ymc0
            p.vxe1 r0 = r0.b
            p.c55 r8 = r0.b
            p.b55 r9 = r8.b()
            int r9 = r9.ordinal()
            if (r9 == 0) goto L8d
            if (r9 == r5) goto L8c
            if (r9 == r4) goto L8a
            r3 = 3
            if (r9 != r3) goto L86
            goto L8d
        L86:
            p.eg.o()
            return r6
        L8a:
            r3 = r4
            goto L8d
        L8c:
            r3 = r5
        L8d:
            if (r3 == 0) goto La8
            p.c9c r0 = r0.a
            p.a55 r8 = r8.a()
            int r8 = r8.ordinal()
            if (r8 == 0) goto La3
            if (r8 != r5) goto L9f
            r5 = r4
            goto La3
        L9f:
            p.eg.o()
            return r6
        La3:
            p.rxe1 r0 = r0.v(r11, r3, r5)
            goto La9
        La8:
            r0 = r6
        La9:
            r12.<init>(r11, r0)
            r1.d = r6
            r1.e = r11
            r1.f = r10
            r1.b = r4
            java.lang.Object r10 = r2.emit(r12, r1)
            if (r10 != r7) goto Lbb
        Lba:
            return r7
        Lbb:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g4c.b(java.lang.Object, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private final Object c(Object obj, lnm lnmVar) {
        p0k p0kVar;
        l0k l0kVar = (l0k) ((cce) this.c).c;
        if (lnmVar instanceof p0k) {
            p0kVar = (p0k) lnmVar;
            int i = p0kVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                p0kVar.b = i - os00.INVALID_ID;
            } else {
                p0kVar = new p0k(this, lnmVar);
            }
        } else {
            p0kVar = new p0k(this, lnmVar);
        }
        Object obj2 = p0kVar.a;
        int i2 = p0kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            m0k m0kVar = (m0k) obj;
            smc0 smc0VarN = k4p1.n();
            z0k z0kVar = new z0k(l0kVar.a, l0kVar.b);
            smc0VarN.add(new h8k1(z0kVar, z0kVar));
            List list = m0kVar.i;
            List list2 = m0kVar.g;
            List list3 = m0kVar.c;
            List list4 = m0kVar.e;
            List list5 = m0kVar.d;
            String str = m0kVar.f;
            List list6 = m0kVar.b;
            List list7 = m0kVar.a;
            if (!list.isEmpty()) {
                j1k j1kVar = new j1k(l0kVar.a);
                smc0VarN.add(new h8k1(j1kVar, j1kVar));
                Iterator it = o7h.d1(list, 5).iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    h1k h1kVar = new h1k((ovl1) it.next());
                    smc0VarN.add(new h8k1(h1kVar, h1kVar));
                    it = it2;
                }
                if (list.size() > 5) {
                    i1k i1kVar = new i1k(l0kVar.a);
                    smc0VarN.add(new h8k1(i1kVar, i1kVar));
                }
            }
            if (!list7.isEmpty()) {
                d1k d1kVar = new d1k(l0kVar.a);
                smc0VarN.add(new h8k1(d1kVar, d1kVar));
                for (Iterator it3 = list7.iterator(); it3.hasNext(); it3 = it3) {
                    b1k b1kVar = new b1k(new uv11(((no11) it3.next()).a, l0kVar.a, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252));
                    smc0VarN.add(new h8k1(b1kVar, b1kVar));
                }
                c1k c1kVar = new c1k(l0kVar.a);
                smc0VarN.add(new h8k1(c1kVar, c1kVar));
            }
            if (!list6.isEmpty()) {
                f1k f1kVar = new f1k(str == null ? "" : str);
                smc0VarN.add(new h8k1(f1kVar, f1kVar));
                e1k e1kVar = new e1k(list6);
                smc0VarN.add(new h8k1(e1kVar, e1kVar));
            }
            if (!list5.isEmpty()) {
                a1k a1kVar = new a1k(l0kVar.a, list5);
                smc0VarN.add(new h8k1(a1kVar, a1kVar));
            }
            if (!list4.isEmpty()) {
                g1k g1kVar = new g1k(l0kVar.a, list4, str);
                smc0VarN.add(new h8k1(g1kVar, g1kVar));
            }
            if (m0kVar.h != null) {
                u0k u0kVar = u0k.a;
                smc0VarN.add(new h8k1(u0kVar, u0kVar));
                t0k t0kVar = new t0k(l0kVar.a);
                smc0VarN.add(new h8k1(t0kVar, t0kVar));
            }
            if (!list3.isEmpty()) {
                w0k w0kVar = w0k.a;
                smc0VarN.add(new h8k1(w0kVar, w0kVar));
                v0k v0kVar = new v0k(list3);
                smc0VarN.add(new h8k1(v0kVar, v0kVar));
            }
            if (!list2.isEmpty()) {
                y0k y0kVar = y0k.a;
                smc0VarN.add(new h8k1(y0kVar, y0kVar));
                x0k x0kVar = new x0k(list2);
                smc0VarN.add(new h8k1(x0kVar, x0kVar));
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            p0kVar.b = 1;
            Object objEmit = vr20Var.emit(smc0VarK, p0kVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        v9k v9kVar;
        if (lnmVar instanceof v9k) {
            v9kVar = (v9k) lnmVar;
            int i = v9kVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                v9kVar.b = i - os00.INVALID_ID;
            } else {
                v9kVar = new v9k(this, lnmVar);
            }
        } else {
            v9kVar = new v9k(this, lnmVar);
        }
        Object obj2 = v9kVar.a;
        int i2 = v9kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            o3r o3rVar = hr21.a;
            yak yakVar = new yak(hr21.a(((xrk) this.c).b, (k1r) obj));
            v9kVar.b = 1;
            Object objEmit = vr20Var.emit(yakVar, v9kVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object f(Object obj, lnm lnmVar) {
        w9k w9kVar;
        r9k r9kVar = (r9k) this.c;
        if (lnmVar instanceof w9k) {
            w9kVar = (w9k) lnmVar;
            int i = w9kVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                w9kVar.b = i - os00.INVALID_ID;
            } else {
                w9kVar = new w9k(this, lnmVar);
            }
        } else {
            w9kVar = new w9k(this, lnmVar);
        }
        Object obj2 = w9kVar.a;
        int i2 = w9kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            uv00 uv00Var = (uv00) obj;
            if (uv00Var.a(jek.class, r9kVar.a).b != null && uv00Var.a(eek.class, r9kVar.a).b != null) {
                w9kVar.b = 1;
                Object objEmit = vr20Var.emit(obj, w9kVar);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        pbk pbkVar;
        if (lnmVar instanceof pbk) {
            pbkVar = (pbk) lnmVar;
            int i = pbkVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                pbkVar.b = i - os00.INVALID_ID;
            } else {
                pbkVar = new pbk(this, lnmVar);
            }
        } else {
            pbkVar = new pbk(this, lnmVar);
        }
        Object obj2 = pbkVar.a;
        int i2 = pbkVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Boolean boolValueOf = Boolean.valueOf(((List) obj).contains(((nbk) this.c).a));
            pbkVar.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, pbkVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object h(Object obj, lnm lnmVar) {
        ldk ldkVar;
        if (lnmVar instanceof ldk) {
            ldkVar = (ldk) lnmVar;
            int i = ldkVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                ldkVar.b = i - os00.INVALID_ID;
            } else {
                ldkVar = new ldk(this, lnmVar);
            }
        } else {
            ldkVar = new ldk(this, lnmVar);
        }
        Object obj2 = ldkVar.a;
        int i2 = ldkVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            fdk fdkVar = (fdk) this.c;
            ldkVar.b = 1;
            Object objEmit = vr20Var.emit(fdkVar, ldkVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(Object obj, lnm lnmVar) {
        cjk cjkVar;
        if (lnmVar instanceof cjk) {
            cjkVar = (cjk) lnmVar;
            int i = cjkVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                cjkVar.b = i - os00.INVALID_ID;
            } else {
                cjkVar = new cjk(this, lnmVar);
            }
        } else {
            cjkVar = new cjk(this, lnmVar);
        }
        Object obj2 = cjkVar.a;
        int i2 = cjkVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            klk klkVar = new klk(((djk) this.c).x.e());
            cjkVar.b = 1;
            Object objEmit = vr20Var.emit(klkVar, cjkVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object j(Object obj, lnm lnmVar) {
        qqk qqkVar;
        if (lnmVar instanceof qqk) {
            qqkVar = (qqk) lnmVar;
            int i = qqkVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                qqkVar.b = i - os00.INVALID_ID;
            } else {
                qqkVar = new qqk(this, lnmVar);
            }
        } else {
            qqkVar = new qqk(this, lnmVar);
        }
        Object obj2 = qqkVar.a;
        int i2 = qqkVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            k1r map = ((k1r) this.c).map(new mwh((Boolean) obj, (byte) 26));
            qqkVar.b = 1;
            Object objEmit = vr20Var.emit(map, qqkVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0383  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:212:0x0433  */
    /* JADX WARN: Code duplicated, block: B:234:0x047d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0529  */
    /* JADX WARN: Code duplicated, block: B:371:0x067d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0716  */
    /* JADX WARN: Code duplicated, block: B:429:0x078b  */
    /* JADX WARN: Code duplicated, block: B:451:0x0816  */
    /* JADX WARN: Code duplicated, block: B:463:0x0847  */
    /* JADX WARN: Code duplicated, block: B:497:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:514:0x091a  */
    /* JADX WARN: Code duplicated, block: B:533:0x0967  */
    /* JADX WARN: Code duplicated, block: B:552:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:577:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:601:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v71, types: [int] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    public final Object emit(Object obj, lnm lnmVar) {
        f4c f4cVar;
        a7c a7cVar;
        sdc sdcVar;
        rih1 rih1Var;
        kh81 kh81Var;
        r8d r8dVar;
        x8d x8dVar;
        ned nedVar;
        mud mudVar;
        hud budVar;
        e4e e4eVar;
        Iterator it;
        int i;
        int i2;
        vr20 vr20Var;
        h4e h4eVar;
        gee geeVar;
        d300 d300Var;
        qcf qcfVar;
        rih1 rih1Var2;
        mcm1 ocm1Var;
        i1r jbfVar;
        i1r lbfVar;
        vhf vhfVar;
        String str;
        i1r i1rVarJ;
        i1r i1rVar;
        zpf zpfVar;
        vzf vzfVar;
        xbg xbgVar;
        bqg bqgVar;
        Set set;
        hqg hqgVar;
        ArrayList<qqg> arrayList;
        goj0 goj0VarA;
        bz6 bz6Var;
        tqg tqgVar;
        x2k x2kVar;
        tzk tzkVar;
        Map map;
        ?? r2;
        Object obj2;
        List list = obj;
        byte b = this.a;
        boolean z = false;
        i = 0;
        int i3 = 0;
        int i4 = 0;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        Serializable serializable = d9n.a;
        rih1 rih1Var3 = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        i1r i1rVar2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof f4c) {
                    f4cVar = (f4c) lnmVar;
                    int i5 = f4cVar.b;
                    if ((i5 & os00.INVALID_ID) != 0) {
                        f4cVar.b = i5 - os00.INVALID_ID;
                    } else {
                        f4cVar = new f4c(this, lnmVar);
                    }
                } else {
                    f4cVar = new f4c(this, lnmVar);
                }
                Object obj5 = f4cVar.a;
                int i6 = f4cVar.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    ((Boolean) list).getClass();
                    f4cVar.b = 1;
                    if (((vr20) obj4).emit((wm60) obj3, f4cVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var3;
            case 1:
                fta ftaVar = (fta) obj3;
                if (lnmVar instanceof a7c) {
                    a7cVar = (a7c) lnmVar;
                    int i7 = a7cVar.b;
                    if ((i7 & os00.INVALID_ID) != 0) {
                        a7cVar.b = i7 - os00.INVALID_ID;
                    } else {
                        a7cVar = new a7c(this, lnmVar);
                    }
                } else {
                    a7cVar = new a7c(this, lnmVar);
                }
                Object obj6 = a7cVar.a;
                int i8 = a7cVar.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var2 = (vr20) obj4;
                    Boolean bool = (Boolean) list;
                    Boolean bool2 = (Boolean) ftaVar.e;
                    if (bool2 != null && !u890.j(bool, bool2)) {
                        z = true;
                    }
                    ftaVar.e = bool;
                    if (z) {
                        a7cVar.b = 1;
                        if (vr20Var2.emit(list, a7cVar) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var3;
            case 2:
                if (lnmVar instanceof sdc) {
                    sdcVar = (sdc) lnmVar;
                    int i9 = sdcVar.b;
                    if ((i9 & os00.INVALID_ID) != 0) {
                        sdcVar.b = i9 - os00.INVALID_ID;
                    } else {
                        sdcVar = new sdc(this, lnmVar);
                    }
                } else {
                    sdcVar = new sdc(this, lnmVar);
                }
                Object obj7 = sdcVar.a;
                int i10 = sdcVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                vr20 vr20Var3 = (vr20) obj4;
                kly0 kly0Var = (kly0) obj3;
                if (!((Boolean) list).booleanValue()) {
                    kly0Var = null;
                }
                if (kly0Var != null) {
                    rih1Var = rih1Var3;
                    kh81Var = new kh81(new ng81(rih1Var, (xpw) kly0Var.get()));
                } else {
                    rih1Var = rih1Var3;
                    kh81Var = null;
                }
                sdcVar.b = 1;
                return vr20Var3.emit(kh81Var, sdcVar) == serializable ? serializable : rih1Var;
            case 3:
                if (lnmVar instanceof r8d) {
                    r8dVar = (r8d) lnmVar;
                    int i11 = r8dVar.b;
                    if ((i11 & os00.INVALID_ID) != 0) {
                        r8dVar.b = i11 - os00.INVALID_ID;
                    } else {
                        r8dVar = new r8d(this, lnmVar);
                    }
                } else {
                    r8dVar = new r8d(this, lnmVar);
                }
                Object obj8 = r8dVar.a;
                int i12 = r8dVar.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var4 = (vr20) obj4;
                    if (u890.j(((v7d) list).a(), ((v8d) obj3).b.a)) {
                        r8dVar.b = 1;
                        if (vr20Var4.emit(list, r8dVar) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var3;
            case 4:
                if (lnmVar instanceof x8d) {
                    x8dVar = (x8d) lnmVar;
                    int i13 = x8dVar.b;
                    if ((i13 & os00.INVALID_ID) != 0) {
                        x8dVar.b = i13 - os00.INVALID_ID;
                    } else {
                        x8dVar = new x8d(this, lnmVar);
                    }
                } else {
                    x8dVar = new x8d(this, lnmVar);
                }
                Object obj9 = x8dVar.a;
                int i14 = x8dVar.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var5 = (vr20) obj4;
                    if (u890.j(((w8d) list).a, ((z8d) obj3).b.a)) {
                        x8dVar.b = 1;
                        if (vr20Var5.emit(list, x8dVar) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var3;
            case 5:
                if (lnmVar instanceof ned) {
                    nedVar = (ned) lnmVar;
                    int i15 = nedVar.b;
                    if ((i15 & os00.INVALID_ID) != 0) {
                        nedVar.b = i15 - os00.INVALID_ID;
                    } else {
                        nedVar = new ned(this, lnmVar);
                    }
                } else {
                    nedVar = new ned(this, lnmVar);
                }
                Object obj10 = nedVar.a;
                int i16 = nedVar.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    e331 e331Var = new e331(goe.a((goe) obj3, (String) null, (btf) null, (gxz0) null, (ArrayList) null, (List) list, 0, 4063));
                    nedVar.b = 1;
                    if (((vr20) obj4).emit(e331Var, nedVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var3;
            case 6:
                if (lnmVar instanceof mud) {
                    mudVar = (mud) lnmVar;
                    int i17 = mudVar.b;
                    if ((i17 & os00.INVALID_ID) != 0) {
                        mudVar.b = i17 - os00.INVALID_ID;
                    } else {
                        mudVar = new mud(this, lnmVar);
                    }
                } else {
                    mudVar = new mud(this, lnmVar);
                }
                Object obj11 = mudVar.a;
                int i18 = mudVar.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                vr20 vr20Var6 = (vr20) obj4;
                yhw0 yhw0Var = (aiw0) list;
                int i19 = ((oud) obj3).c;
                if (yhw0Var instanceof zhw0) {
                    yhw0 yhw0Var2 = (zhw0) yhw0Var;
                    if (yhw0Var2.a() != i19) {
                        budVar = null;
                    } else if (yhw0Var2 instanceof yhw0) {
                        budVar = new hud(yhw0Var2.b);
                    } else if (yhw0Var2 instanceof vhw0) {
                        budVar = new eud(((vhw0) yhw0Var2).b);
                    } else if (yhw0Var2 instanceof xhw0) {
                        budVar = new gud(((xhw0) yhw0Var2).b);
                    } else if (yhw0Var2 instanceof whw0) {
                        budVar = fud.a;
                    } else {
                        if (!(yhw0Var2 instanceof uhw0)) {
                            eg.o();
                            return null;
                        }
                        budVar = new dud(((uhw0) yhw0Var2).b);
                    }
                } else if (yhw0Var instanceof shw0) {
                    shw0 shw0Var = (shw0) yhw0Var;
                    if (shw0Var.a != i19) {
                        budVar = null;
                    } else {
                        budVar = new bud(shw0Var.b);
                    }
                } else {
                    budVar = null;
                }
                if (budVar != null) {
                    mudVar.b = 1;
                    if (vr20Var6.emit(budVar, mudVar) == serializable) {
                        return serializable;
                    }
                }
                return rih1Var3;
            case 7:
                int iIntValue = ((Number) list).intValue();
                err0 err0Var = (hdn0) obj3;
                ((iu30) obj4).invoke(new qxd(err0Var.s(), iIntValue));
                err0Var.t(iIntValue);
                return rih1Var3;
            case 8:
                if (lnmVar instanceof e4e) {
                    e4eVar = (e4e) lnmVar;
                    int i20 = e4eVar.b;
                    if ((i20 & os00.INVALID_ID) != 0) {
                        e4eVar.b = i20 - os00.INVALID_ID;
                    } else {
                        e4eVar = new e4e(this, lnmVar);
                    }
                } else {
                    e4eVar = new e4e(this, lnmVar);
                }
                Object obj12 = e4eVar.a;
                int i21 = e4eVar.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    it = ((Iterable) ((nty) obj3).invoke((cf61) list)).iterator();
                    i = 0;
                    i2 = 0;
                    vr20Var = (vr20) obj4;
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = e4eVar.g;
                    int i22 = e4eVar.f;
                    it = e4eVar.e;
                    vr20Var = e4eVar.d;
                    hm5.M(obj12);
                    i = i22;
                }
                while (it.hasNext()) {
                    ie61 ie61Var = (ie61) it.next();
                    e4eVar.d = vr20Var;
                    e4eVar.e = it;
                    e4eVar.f = i;
                    e4eVar.g = i2;
                    e4eVar.b = 1;
                    if (vr20Var.emit(ie61Var, e4eVar) == serializable) {
                        return serializable;
                    }
                }
                return rih1Var3;
            case 9:
                AtomicReference atomicReference = ((i4e) obj3).e;
                if (lnmVar instanceof h4e) {
                    h4eVar = (h4e) lnmVar;
                    int i23 = h4eVar.b;
                    if ((i23 & os00.INVALID_ID) != 0) {
                        h4eVar.b = i23 - os00.INVALID_ID;
                    } else {
                        h4eVar = new h4e(this, lnmVar);
                    }
                } else {
                    h4eVar = new h4e(this, lnmVar);
                }
                Object obj13 = h4eVar.a;
                int i24 = h4eVar.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var7 = (vr20) obj4;
                    ie61 ie61Var2 = (ie61) list;
                    if (ie61Var2 instanceof be61) {
                        atomicReference.set(new lg61());
                        atomicReference.toString();
                    } else if (ie61Var2 instanceof he61) {
                        he61 he61Var = (he61) ie61Var2;
                        lg61 lg61Var = he61Var.a;
                        lg61 lg61Var2 = he61Var.b;
                        while (!atomicReference.compareAndSet(lg61Var, lg61Var2)) {
                            if (atomicReference.get() != lg61Var) {
                                Logger.k("CastBasic->%s", new Object[]{"Model was set the same value as before: was that intended?"});
                            }
                        }
                        atomicReference.toString();
                    } else {
                        h4eVar.b = 1;
                        if (vr20Var7.emit(ie61Var2, h4eVar) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var3;
            case 10:
                if (lnmVar instanceof gee) {
                    geeVar = (gee) lnmVar;
                    int i25 = geeVar.b;
                    if ((i25 & os00.INVALID_ID) != 0) {
                        geeVar.b = i25 - os00.INVALID_ID;
                    } else {
                        geeVar = new gee(this, lnmVar);
                    }
                } else {
                    geeVar = new gee(this, lnmVar);
                }
                Object obj14 = geeVar.a;
                int i26 = geeVar.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var8 = (vr20) obj4;
                    Map map2 = (Map) list;
                    if (map2.isEmpty()) {
                        d300Var = null;
                    } else {
                        Map.Entry entry = (Map.Entry) o7h.p0(map2.entrySet());
                        d300Var = ((Boolean) entry.getValue()).booleanValue() ? new d300((String) entry.getKey()) : ((iee) obj3).b.k().d((String) entry.getKey()).equals(cat.b) ? new c300((String) entry.getKey()) : null;
                    }
                    geeVar.b = 1;
                    if (vr20Var8.emit(d300Var, geeVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i26 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var3;
            case 11:
                qt80 qt80Var = (qt80) list;
                ven0 ven0Var = (ven0) obj3;
                if (!((Boolean) ven0Var.getValue()).booleanValue() && (qt80Var instanceof o5v)) {
                    ven0Var.setValue(Boolean.TRUE);
                    ((Function0) obj4).invoke();
                }
                return rih1Var3;
            case 12:
                if (lnmVar instanceof qcf) {
                    qcfVar = (qcf) lnmVar;
                    int i27 = qcfVar.b;
                    if ((i27 & os00.INVALID_ID) != 0) {
                        qcfVar.b = i27 - os00.INVALID_ID;
                    } else {
                        qcfVar = new qcf(this, lnmVar);
                    }
                } else {
                    qcfVar = new qcf(this, lnmVar);
                }
                Object obj15 = qcfVar.a;
                int i28 = qcfVar.b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return i1rVar2;
                    }
                    hm5.M(obj15);
                    rih1Var2 = rih1Var3;
                    return rih1Var2;
                }
                hm5.M(obj15);
                vr20 vr20Var9 = (vr20) obj4;
                Object obj16 = ((e331) list).a;
                Throwable thA = e331.a(obj16);
                if (thA == null) {
                    cce cceVar = (cce) obj3;
                    List<tom> list2 = ((goe) obj16).f;
                    ArrayList arrayList2 = new ArrayList();
                    for (tom tomVar : list2) {
                        nom nomVar = tomVar.t;
                        if (nomVar instanceof kom) {
                            vol volVar = tomVar.f;
                            if (volVar instanceof vol) {
                                lbfVar = new lbf(volVar.a);
                            } else if ((volVar instanceof wol) || (volVar instanceof mpl)) {
                                lbfVar = kbf.a;
                            } else {
                                if (!(volVar instanceof lpl) && !(volVar instanceof ppl) && !(volVar instanceof npl) && !(volVar instanceof uol)) {
                                    eg.o();
                                    return i1rVar2;
                                }
                                lbfVar = i1rVar2;
                            }
                            if (lbfVar == null) {
                                jbfVar = i1rVar2;
                            } else {
                                String str2 = tomVar.a;
                                w4i1 w4i1Var = tomVar.c;
                                ykf ykfVar = new ykf(w4i1Var.a, w4i1Var.b);
                                String string = Instant.ofEpochSecond(tomVar.d).toString();
                                lbf lbfVar2 = lbfVar instanceof lbf ? (lbf) lbfVar : null;
                                jbfVar = new jbf(str2, ykfVar, string, lbfVar2 != null ? lbfVar2.a : null, lbfVar instanceof kbf ? new wlh1(((vnr) cceVar.c).a.getResources().getString(2131953787)) : null);
                            }
                        } else {
                            if (!(nomVar instanceof mom) && !(nomVar instanceof lom) && !(nomVar instanceof hom) && !(nomVar instanceof iom) && !(nomVar instanceof jom)) {
                                eg.o();
                                return null;
                            }
                            jbfVar = null;
                        }
                        if (jbfVar != null) {
                            arrayList2.add(jbfVar);
                        }
                        rih1Var3 = rih1Var3;
                        i1rVar2 = null;
                    }
                    rih1Var2 = rih1Var3;
                    ocm1Var = new mcm1(arrayList2);
                } else {
                    rih1Var2 = rih1Var3;
                    ocm1Var = new ocm1(thA);
                }
                qcfVar.b = 1;
                if (vr20Var9.emit(ocm1Var, qcfVar) == serializable) {
                    return serializable;
                }
                return rih1Var2;
            case 13:
                if (lnmVar instanceof vhf) {
                    vhfVar = (vhf) lnmVar;
                    int i29 = vhfVar.b;
                    if ((i29 & os00.INVALID_ID) != 0) {
                        vhfVar.b = i29 - os00.INVALID_ID;
                    } else {
                        vhfVar = new vhf(this, lnmVar);
                    }
                } else {
                    vhfVar = new vhf(this, lnmVar);
                }
                Object obj17 = vhfVar.a;
                int i30 = vhfVar.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    vr20 vr20Var10 = (vr20) obj4;
                    PlayerState playerState = (PlayerState) list;
                    if (playerState.isPlaying() && !playerState.isPaused() && (str = (String) ((d18) obj3).b) != null) {
                        String strContextUri = playerState.contextUri();
                        Set set2 = s4b1.f;
                        s4b1 s4b1VarX = uic.x(strContextUri);
                        if (s4b1VarX.c != blc0.ea) {
                            s4b1VarX = null;
                        }
                        if (s4b1VarX == null || (i1rVarJ = s4b1VarX.j()) == null) {
                            i1rVarJ = null;
                        }
                        if (i1rVarJ == null) {
                            jxu0 jxu0VarC = oxu0.a.c(strContextUri);
                            jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
                            if (jxu0Var != null) {
                                if (!u890.j(jxu0Var.a, "listening-party") || !cmd0.a.e(jxu0Var.b)) {
                                    jxu0Var = null;
                                }
                                if (jxu0Var != null && (i1rVar = jxu0Var.b) != null) {
                                    i1rVar2 = i1rVar;
                                }
                            }
                        } else {
                            i1rVar2 = i1rVarJ;
                        }
                        if (i1rVar2 == null ? false : i1rVar2.equals(str)) {
                            z3 = true;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    vhfVar.b = 1;
                    if (vr20Var10.emit(boolValueOf, vhfVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i30 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var3;
            case 14:
                if (lnmVar instanceof zpf) {
                    zpfVar = (zpf) lnmVar;
                    int i31 = zpfVar.b;
                    if ((i31 & os00.INVALID_ID) != 0) {
                        zpfVar.b = i31 - os00.INVALID_ID;
                    } else {
                        zpfVar = new zpf(this, lnmVar);
                    }
                } else {
                    zpfVar = new zpf(this, lnmVar);
                }
                Object obj18 = zpfVar.a;
                int i32 = zpfVar.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    vr20 vr20Var11 = (vr20) obj4;
                    if (((Boolean) list).booleanValue()) {
                        wpf wpfVar = (wpf) obj3;
                        if (!wpfVar.e && !wpfVar.f) {
                            zpfVar.b = 1;
                            if (vr20Var11.emit(list, zpfVar) == serializable) {
                                return serializable;
                            }
                        }
                    }
                } else {
                    if (i32 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1Var3;
            case 15:
                if (lnmVar instanceof vzf) {
                    vzfVar = (vzf) lnmVar;
                    int i33 = vzfVar.b;
                    if ((i33 & os00.INVALID_ID) != 0) {
                        vzfVar.b = i33 - os00.INVALID_ID;
                    } else {
                        vzfVar = new vzf(this, lnmVar);
                    }
                } else {
                    vzfVar = new vzf(this, lnmVar);
                }
                Object obj19 = vzfVar.a;
                int i34 = vzfVar.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    vr20 vr20Var12 = (vr20) obj4;
                    i1rVar2 = ((Boolean) list).booleanValue() ? (vgc0) ((wzf) obj3).c.getValue() : null;
                    vzfVar.b = 1;
                    if (vr20Var12.emit(i1rVar2, vzfVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i34 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var3;
            case 16:
                if (lnmVar instanceof xbg) {
                    xbgVar = (xbg) lnmVar;
                    int i35 = xbgVar.b;
                    if ((i35 & os00.INVALID_ID) != 0) {
                        xbgVar.b = i35 - os00.INVALID_ID;
                    } else {
                        xbgVar = new xbg(this, lnmVar);
                    }
                } else {
                    xbgVar = new xbg(this, lnmVar);
                }
                Object obj20 = xbgVar.a;
                int i36 = xbgVar.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var13 = (vr20) obj4;
                    boolean zBooleanValue = ((Boolean) list).booleanValue();
                    ybg ybgVar = (ybg) obj3;
                    bma1 bma1Var = ybg.d;
                    dma1 dma1Var = ybgVar.b;
                    bma1 bma1Var2 = ybg.d;
                    yqg yqgVar = ybgVar.c;
                    if (yqgVar.b() - dma1Var.g(bma1Var2, yqgVar.b() - 86400000) >= 86400000 && zBooleanValue) {
                        z2 = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                    xbgVar.b = 1;
                    if (vr20Var13.emit(boolValueOf2, xbgVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i36 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var3;
            case 17:
                res resVar = (res) obj3;
                ArrayList arrayList3 = (ArrayList) resVar.g;
                if (lnmVar instanceof bqg) {
                    bqgVar = (bqg) lnmVar;
                    int i37 = bqgVar.b;
                    if ((i37 & os00.INVALID_ID) != 0) {
                        bqgVar.b = i37 - os00.INVALID_ID;
                    } else {
                        bqgVar = new bqg(this, lnmVar);
                    }
                } else {
                    bqgVar = new bqg(this, lnmVar);
                }
                Object obj21 = bqgVar.a;
                int i38 = bqgVar.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var14 = (vr20) obj4;
                    i1r i1rVar3 = (k1r) list;
                    i1rVar2 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                    if (i1rVar2 == null || (set = (Set) i1rVar2.a) == null) {
                        set = w7x.a;
                    }
                    Collection collectionValues = ((Map) resVar.f).values();
                    ArrayList arrayList4 = new ArrayList(q7h.U(collectionValues, 10));
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((fqg) it2.next()).c);
                    }
                    Set setP1 = o7h.p1(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj22 : arrayList3) {
                        ypg ypgVar = (ypg) obj22;
                        if (set.contains(ypgVar.d) && setP1.contains(ypgVar.d)) {
                            arrayList5.add(obj22);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(((ypg) it3.next()).a);
                    }
                    aqg aqgVar = new aqg(arrayList3, o7h.p1(arrayList6));
                    bqgVar.b = 1;
                    if (vr20Var14.emit(aqgVar, bqgVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i38 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var3;
            case 18:
                if (lnmVar instanceof hqg) {
                    hqgVar = (hqg) lnmVar;
                    int i39 = hqgVar.b;
                    if ((i39 & os00.INVALID_ID) != 0) {
                        hqgVar.b = i39 - os00.INVALID_ID;
                    } else {
                        hqgVar = new hqg(this, lnmVar);
                    }
                } else {
                    hqgVar = new hqg(this, lnmVar);
                }
                Object obj23 = hqgVar.a;
                int i40 = hqgVar.b;
                if (i40 == 0) {
                    hm5.M(obj23);
                    vr20 vr20Var15 = (vr20) obj4;
                    ioj0 ioj0Var = (ioj0) list;
                    smc0 smc0VarN = k4p1.n();
                    smc0VarN.add(new h8k1(rqg.a, "clips-grid-heading"));
                    String str3 = ((lqg) obj3).a.b;
                    hoj0 hoj0VarC = ioj0Var.c(bz6.class, str3);
                    if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (bz6Var = (bz6) goj0VarA.a) == null) {
                        arrayList = z6x.a;
                    } else {
                        ArrayList arrayList7 = bz6Var.a;
                        List listK0 = z561.k0(new sgg1(new ib5(arrayList7, (byte) 8), z561.j0(new i46(yoi1.O(p7h.K(arrayList7), 3), (byte) 1), 5)));
                        arrayList = new ArrayList(q7h.U(listK0, 10));
                        for (Object obj24 : listK0) {
                            int i41 = i4 + 1;
                            if (i4 < 0) {
                                p7h.T();
                                throw null;
                            }
                            arrayList.add(new qqg(str3, (tr80) obj24, f4i1.c(i4, "clips-grid-")));
                            i4 = i41;
                        }
                    }
                    for (qqg qqgVar : arrayList) {
                        smc0VarN.add(new h8k1(qqgVar, qqgVar.c));
                    }
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    hqgVar.b = 1;
                    if (vr20Var15.emit(smc0VarK, hqgVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i40 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1Var3;
            case 19:
                if (lnmVar instanceof tqg) {
                    tqgVar = (tqg) lnmVar;
                    int i42 = tqgVar.b;
                    if ((i42 & os00.INVALID_ID) != 0) {
                        tqgVar.b = i42 - os00.INVALID_ID;
                    } else {
                        tqgVar = new tqg(this, lnmVar);
                    }
                } else {
                    tqgVar = new tqg(this, lnmVar);
                }
                Object obj25 = tqgVar.a;
                int i43 = tqgVar.b;
                if (i43 == 0) {
                    hm5.M(obj25);
                    ly50 ly50VarA = ly50.a((ly50) list, iy50.a, true, false, 2131953944, false, (px50) null, new by50(((Context) ((uqg) obj3).b).getColor(2131104799)), 176);
                    tqgVar.b = 1;
                    if (((vr20) obj4).emit(ly50VarA, tqgVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i43 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return rih1Var3;
            case 20:
                return b(obj, lnmVar);
            case 21:
                return c(obj, lnmVar);
            case 22:
                if (lnmVar instanceof x2k) {
                    x2kVar = (x2k) lnmVar;
                    int i44 = x2kVar.b;
                    if ((i44 & os00.INVALID_ID) != 0) {
                        x2kVar.b = i44 - os00.INVALID_ID;
                    } else {
                        x2kVar = new x2k(this, lnmVar);
                    }
                } else {
                    x2kVar = new x2k(this, lnmVar);
                }
                Object obj26 = x2kVar.a;
                int i45 = x2kVar.b;
                if (i45 == 0) {
                    hm5.M(obj26);
                    ((Number) list).intValue();
                    List listL1 = o7h.l1(((IdentityHashMap) ((z2k) obj3).k.c).values());
                    x2kVar.b = 1;
                    if (((vr20) obj4).emit(listL1, x2kVar) == serializable) {
                        return serializable;
                    }
                } else {
                    if (i45 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj26);
                }
                return rih1Var3;
            case 23:
                return e(obj, lnmVar);
            case 24:
                return f(obj, lnmVar);
            case 25:
                return g(obj, lnmVar);
            case 26:
                return h(obj, lnmVar);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return i(obj, lnmVar);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return j(obj, lnmVar);
            default:
                if (lnmVar instanceof tzk) {
                    tzkVar = (tzk) lnmVar;
                    int i46 = tzkVar.b;
                    if ((i46 & os00.INVALID_ID) != 0) {
                        tzkVar.b = i46 - os00.INVALID_ID;
                    } else {
                        tzkVar = new tzk(this, lnmVar);
                    }
                } else {
                    tzkVar = new tzk(this, lnmVar);
                }
                Object obj27 = tzkVar.a;
                ?? r3 = tzkVar.b;
                try {
                    if (r3 != 0) {
                        if (r3 == 1) {
                            i3 = tzkVar.d;
                            list = tzkVar.f;
                            vr20 vr20Var16 = tzkVar.c;
                            hm5.M(obj27);
                            obj2 = obj27;
                            r3 = vr20Var16;
                        } else {
                            if (r3 != 2) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj27);
                        }
                        return rih1Var3;
                    }
                    hm5.M(obj27);
                    vr20 vr20Var17 = (vr20) obj4;
                    list = (List) list;
                    z2h z2hVar = (z2h) obj3;
                    Iterable iterable = (Iterable) list;
                    ArrayList arrayList8 = new ArrayList(q7h.U(iterable, 10));
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(((qzk) it4.next()).a);
                    }
                    tzkVar.c = vr20Var17;
                    tzkVar.f = (List) list;
                    tzkVar.d = 0;
                    tzkVar.b = 1;
                    Serializable serializableD = z2hVar.d(arrayList8, tzkVar);
                    obj2 = serializableD;
                    r3 = vr20Var17;
                    if (serializableD == serializable) {
                        return serializable;
                    }
                    map = (Map) obj2;
                    r2 = r3;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    map = null;
                    r2 = r3;
                }
                Iterable<qzk> iterable2 = (Iterable) list;
                ArrayList arrayList9 = new ArrayList(q7h.U(iterable2, 10));
                for (qzk qzkVar : iterable2) {
                    String str4 = qzkVar.a;
                    arrayList9.add(new s781(str4, qzkVar.b, qzkVar.c, z6x.a, map != null ? (Integer) map.get(str4) : null, 2));
                }
                tzkVar.c = null;
                tzkVar.f = null;
                tzkVar.d = i3;
                tzkVar.b = 2;
                if (r2.emit(arrayList9, tzkVar) == serializable) {
                    return serializable;
                }
                return rih1Var3;
        }
    }
}
