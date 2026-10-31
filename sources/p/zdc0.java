package p;

import android.content.Context;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zdc0 implements xpw {
    public static final PlaylistRequestDecorationPolicy R0;
    public final ay8 N0;
    public final poy0 O0 = d4o1.f(new qdc0(this, 0), hyb0.e1, f7c0.e, new qdc0(this, 1), 8);
    public final psw P0;
    public final ia00 Q0;
    public final qp4 X;
    public final haa0 Y;
    public final vvu Z;
    public final d0r a;
    public final yge0 b;
    public final Context c;
    public final lzn0 d;
    public final String e;
    public final xrc0 f;
    public final iyc0 g;
    public final ff20 h;
    public final op31 i;
    public final q8n t;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.D(TrackDecorationPolicy.newBuilder().setLink(true).build());
        hru0VarS.y(vwu0VarR.build());
        R0 = hru0VarS.build();
    }

    public zdc0(d0r d0rVar, yge0 yge0Var, Context context, lzn0 lzn0Var, String str, xrc0 xrc0Var, iyc0 iyc0Var, ff20 ff20Var, op31 op31Var, q8n q8nVar, qp4 qp4Var, haa0 haa0Var) {
        this.a = d0rVar;
        this.b = yge0Var;
        this.c = context;
        this.d = lzn0Var;
        this.e = str;
        this.f = xrc0Var;
        this.g = iyc0Var;
        this.h = ff20Var;
        this.i = op31Var;
        this.t = q8nVar;
        this.X = qp4Var;
        this.Y = haa0Var;
        this.Z = new vvu(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, xdc0.d, new j4r(xdc0.b), xdc0.e), xdc0.c), str), (byte) 23);
        this.N0 = vxo1.l(d0rVar, str);
        j2i j2iVar = new j2i(-679859542, new pba0(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.P0 = new psw(j2iVar, (byte) 0);
        this.Q0 = n3o1.q(this).a(lta0.a1, new kds(this, (byte) 18));
    }

    public static String e(String str) {
        return ihc1.e1(nhc1.W(str, "tags contains ", "")).toString();
    }

    public final rqw a() {
        return this.Q0;
    }

    public final jsw c() {
        return this.P0;
    }

    public final String f() {
        return this.c.getString(2131957333, DateFormat.getDateInstance(3, Locale.getDefault()).format(new Date()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public final String g(ndc0 ndc0Var) {
        Set set;
        String str;
        String strY0;
        Object next;
        if (this.X.c()) {
            Iterator it = ndc0Var.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ldc0 ldc0Var = (ldc0) next;
                kdc0 kdc0Var = ldc0Var instanceof kdc0 ? (kdc0) ldc0Var : null;
                if (kdc0Var != null && kdc0Var.d) {
                    break;
                }
            }
            ldc0 ldc0Var2 = (ldc0) next;
            if (ldc0Var2 != null) {
                strY0 = ((kdc0) ldc0Var2).a;
            } else {
                strY0 = null;
            }
        } else {
            Object value = this.N0.a.getValue();
            i1r i1rVar = value instanceof i1r ? (i1r) value : null;
            if (i1rVar == null || (set = (Set) i1rVar.a) == null) {
                set = w7x.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (obj instanceof qqc0) {
                    arrayList.add(obj);
                }
            }
            qqc0 qqc0Var = (qqc0) o7h.s0(arrayList);
            if (qqc0Var == null || (str = qqc0Var.a) == null) {
                strY0 = null;
            } else {
                strY0 = o7h.y0(ihc1.Q0(str, new String[]{" "}, 0, 6), " ", (String) null, (String) null, (iu30) null, 62);
            }
        }
        if (strY0 == null) {
            return null;
        }
        if (strY0.length() <= 0) {
            return strY0;
        }
        return ((Object) String.valueOf(strY0.charAt(0)).toUpperCase(Locale.ROOT)) + strY0.substring(1);
    }

    public final mqw getBehavior() {
        return this.O0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ldc0 ldc0Var, onm onmVar) {
        rdc0 rdc0Var;
        qqc0 qqc0Var;
        if (onmVar instanceof rdc0) {
            rdc0Var = (rdc0) onmVar;
            int i = rdc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdc0Var.d = i - Integer.MIN_VALUE;
            } else {
                rdc0Var = new rdc0(this, onmVar);
            }
        } else {
            rdc0Var = new rdc0(this, onmVar);
        }
        Object obj = rdc0Var.b;
        int i2 = rdc0Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (ldc0Var instanceof kdc0) {
                String str = ((kdc0) ldc0Var).b;
                qqc0 qqc0Var2 = new qqc0(e(str));
                rdc0Var.a = qqc0Var2;
                rdc0Var.d = 1;
                if (this.h.a(str, rdc0Var) != d9nVar) {
                    qqc0Var = qqc0Var2;
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
        qqc0Var = rdc0Var.a;
        hm5.M(obj);
        jd0 jd0Var = jd0.D;
        ouc0 ouc0Var = new ouc0(this.e);
        muc0 muc0Var = new muc0(qqc0Var);
        rdc0Var.a = null;
        rdc0Var.d = 2;
        return d0r.d(this.a, jd0Var, ouc0Var, muc0Var, rdc0Var) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ldc0 ldc0Var, onm onmVar) {
        sdc0 sdc0Var;
        ouc0 ouc0Var;
        qqc0 qqc0Var;
        ouc0 ouc0Var2;
        jd0 jd0Var;
        luc0 luc0Var;
        if (onmVar instanceof sdc0) {
            sdc0Var = (sdc0) onmVar;
            int i = sdc0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdc0Var.f = i - Integer.MIN_VALUE;
            } else {
                sdc0Var = new sdc0(this, onmVar);
            }
        } else {
            sdc0Var = new sdc0(this, onmVar);
        }
        Object obj = sdc0Var.d;
        int i2 = sdc0Var.f;
        Object obj2 = rih1.a;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (ldc0Var instanceof kdc0) {
                kdc0 kdc0Var = (kdc0) ldc0Var;
                String strE = e(kdc0Var.b);
                qqc0 qqc0Var2 = new qqc0(strE);
                ouc0Var = new ouc0(this.e);
                sdc0Var.a = kdc0Var;
                sdc0Var.b = qqc0Var2;
                sdc0Var.c = ouc0Var;
                sdc0Var.f = 1;
                if (m(ouc0Var, strE, sdc0Var) != obj3) {
                    qqc0Var = qqc0Var2;
                }
                return obj3;
            }
            return obj2;
        }
        if (i2 == 1) {
            ouc0 ouc0Var3 = sdc0Var.c;
            qqc0Var = sdc0Var.b;
            kdc0 kdc0Var2 = sdc0Var.a;
            hm5.M(obj);
            ouc0Var = ouc0Var3;
            ldc0Var = kdc0Var2;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ouc0Var2 = sdc0Var.c;
            qqc0Var = sdc0Var.b;
            hm5.M(obj);
        }
        jd0Var = jd0.D;
        luc0Var = new luc0(qqc0Var);
        sdc0Var.a = null;
        sdc0Var.b = null;
        sdc0Var.c = null;
        sdc0Var.f = 3;
        if (d0r.d(this.a, jd0Var, ouc0Var2, luc0Var, sdc0Var) != obj3) {
            return obj3;
        }
        return obj2;
        String str = ((kdc0) ldc0Var).b;
        sdc0Var.a = null;
        sdc0Var.b = qqc0Var;
        sdc0Var.c = ouc0Var;
        sdc0Var.f = 2;
        ff20 ff20Var = this.h;
        Object objY = fn31.Y(ff20Var.b, new cf20(ff20Var, str, null, (byte) 1), sdc0Var);
        if (objY != obj3) {
            objY = obj2;
        }
        if (objY != obj3) {
            ouc0Var2 = ouc0Var;
            jd0Var = jd0.D;
            luc0Var = new luc0(qqc0Var);
            sdc0Var.a = null;
            sdc0Var.b = null;
            sdc0Var.c = null;
            sdc0Var.f = 3;
            if (d0r.d(this.a, jd0Var, ouc0Var2, luc0Var, sdc0Var) != obj3) {
                return obj2;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, onm onmVar) {
        tdc0 tdc0Var;
        if (onmVar instanceof tdc0) {
            tdc0Var = (tdc0) onmVar;
            int i = tdc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdc0Var.d = i - Integer.MIN_VALUE;
            } else {
                tdc0Var = new tdc0(this, onmVar);
            }
        } else {
            tdc0Var = new tdc0(this, onmVar);
        }
        Object obj = tdc0Var.b;
        int i2 = tdc0Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (str != null) {
                qqc0 qqc0Var = new qqc0(e(str));
                jd0 jd0Var = jd0.D;
                ouc0 ouc0Var = new ouc0(this.e);
                muc0 muc0Var = new muc0(qqc0Var);
                tdc0Var.a = str;
                tdc0Var.d = 1;
                if (d0r.d(this.a, jd0Var, ouc0Var, muc0Var, tdc0Var) != d9nVar) {
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
        str = tdc0Var.a;
        hm5.M(obj);
        tdc0Var.a = null;
        tdc0Var.d = 2;
        return this.h.a(str, tdc0Var) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[PHI: r0 r2
      0x0048: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v15 java.lang.String) binds: [B:69:0x0145, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r2v30 java.lang.Object) = (r2v29 java.lang.Object), (r2v1 java.lang.Object) binds: [B:69:0x0145, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x012c A[Catch: all -> 0x016b, CancellationException -> 0x016e, TryCatch #2 {CancellationException -> 0x016e, all -> 0x016b, blocks: (B:15:0x0038, B:20:0x0045, B:71:0x0148, B:73:0x014e, B:22:0x004f, B:66:0x0122, B:68:0x012c, B:25:0x0056, B:57:0x00db, B:58:0x00f6, B:60:0x00fc, B:61:0x0108, B:63:0x010e, B:46:0x0099, B:48:0x009d, B:51:0x00a3, B:54:0x00b6, B:53:0x00b3), top: B:81:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[Catch: all -> 0x016b, CancellationException -> 0x016e, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x016e, all -> 0x016b, blocks: (B:15:0x0038, B:20:0x0045, B:71:0x0148, B:73:0x014e, B:22:0x004f, B:66:0x0122, B:68:0x012c, B:25:0x0056, B:57:0x00db, B:58:0x00f6, B:60:0x00fc, B:61:0x0108, B:63:0x010e, B:46:0x0099, B:48:0x009d, B:51:0x00a3, B:54:0x00b6, B:53:0x00b3), top: B:81:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0168, code lost:
    
        if (p.fn31.Y(r6, r0, r10) == r14) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(p.ndc0 r28, p.onm r29) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zdc0.k(p.ndc0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:59:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(List list, onm onmVar) {
        vdc0 vdc0Var;
        Object next;
        Set set;
        ouc0 ouc0Var;
        Set set2;
        String str;
        if (onmVar instanceof vdc0) {
            vdc0Var = (vdc0) onmVar;
            int i = vdc0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdc0Var.f = i - Integer.MIN_VALUE;
            } else {
                vdc0Var = new vdc0(this, onmVar);
            }
        } else {
            vdc0Var = new vdc0(this, onmVar);
        }
        Object obj = vdc0Var.d;
        int i2 = vdc0Var.f;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = vdc0Var.c;
                    ouc0Var = vdc0Var.b;
                    set2 = vdc0Var.a;
                    hm5.M(obj);
                } else if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            Set set3 = vdc0Var.a;
            hm5.M(obj);
            return rih1Var;
        }
        hm5.M(obj);
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((xe20) next).d);
        xe20 xe20Var = (xe20) next;
        Object value = this.N0.a.getValue();
        i1r i1rVar = value instanceof i1r ? (i1r) value : null;
        if (i1rVar == null || (set = (Set) i1rVar.a) == null) {
            set = w7x.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : set) {
            if (obj3 instanceof qqc0) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((qqc0) it2.next()).a);
        }
        Set setP1 = o7h.p1(arrayList2);
        ouc0Var = new ouc0(this.e);
        if (xe20Var == null && !setP1.isEmpty()) {
            vdc0Var.a = null;
            vdc0Var.b = null;
            vdc0Var.f = 1;
            if (m(ouc0Var, null, vdc0Var) == obj2) {
                return obj2;
            }
            return rih1Var;
        }
        if (xe20Var != null) {
            String strE = e(xe20Var.a);
            vdc0Var.a = setP1;
            vdc0Var.b = ouc0Var;
            vdc0Var.c = strE;
            vdc0Var.f = 2;
            if (m(ouc0Var, strE, vdc0Var) != obj2) {
                set2 = setP1;
                str = strE;
            }
            return obj2;
        }
        return rih1Var;
        if (!set2.contains(str)) {
            qqc0 qqc0Var = new qqc0(str);
            jd0 jd0Var = jd0.D;
            luc0 luc0Var = new luc0(qqc0Var);
            vdc0Var.a = null;
            vdc0Var.b = null;
            vdc0Var.c = null;
            vdc0Var.f = 3;
            if (d0r.d(this.a, jd0Var, ouc0Var, luc0Var, vdc0Var) == obj2) {
                return obj2;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(ouc0 ouc0Var, String str, onm onmVar) {
        wdc0 wdc0Var;
        Set set;
        Iterator it;
        int i;
        if (onmVar instanceof wdc0) {
            wdc0Var = (wdc0) onmVar;
            int i2 = wdc0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wdc0Var.f = i2 - Integer.MIN_VALUE;
            } else {
                wdc0Var = new wdc0(this, onmVar);
            }
        } else {
            wdc0Var = new wdc0(this, onmVar);
        }
        Object obj = wdc0Var.d;
        int i3 = wdc0Var.f;
        if (i3 == 0) {
            hm5.M(obj);
            Object value = this.N0.a.getValue();
            i1r i1rVar = value instanceof i1r ? (i1r) value : null;
            if (i1rVar == null || (set = (Set) i1rVar.a) == null) {
                set = w7x.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof qqc0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                qqc0 qqc0Var = (qqc0) obj3;
                if (str == null || !u890.j(qqc0Var.a, str)) {
                    arrayList2.add(obj3);
                }
            }
            it = arrayList2.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = wdc0Var.c;
            it = wdc0Var.b;
            ouc0 ouc0Var2 = wdc0Var.a;
            hm5.M(obj);
            i = i4;
            ouc0Var = ouc0Var2;
        }
        while (it.hasNext()) {
            qqc0 qqc0Var2 = (qqc0) it.next();
            jd0 jd0Var = jd0.D;
            muc0 muc0Var = new muc0(qqc0Var2);
            wdc0Var.a = ouc0Var;
            wdc0Var.b = it;
            wdc0Var.c = i;
            wdc0Var.f = 1;
            Object objD = d0r.d(this.a, jd0Var, ouc0Var, muc0Var, wdc0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
