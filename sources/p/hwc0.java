package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hwc0 implements rhh0 {
    public final Context a;
    public final xrc0 b;
    public final iyc0 c;
    public final PlaylistRequestDecorationPolicy d;
    public final n3d0 e;
    public final Observable f;
    public final fdc g;
    public final ki91 h;
    public final pqs i;
    public final kly0 j;

    public hwc0(Context context, xrc0 xrc0Var, iyc0 iyc0Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, n3d0 n3d0Var, Observable observable, fdc fdcVar, ki91 ki91Var, pqs pqsVar, agc0 agc0Var, xrm1 xrm1Var, wqg wqgVar, chp chpVar) {
        this.a = context;
        this.b = xrc0Var;
        this.c = iyc0Var;
        this.d = playlistRequestDecorationPolicy;
        this.e = n3d0Var;
        this.f = observable;
        this.g = fdcVar;
        this.h = ki91Var;
        this.i = pqsVar;
        this.j = chpVar;
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        return yoi1.i(x4p1.h(h4p1.g(new z290(this, r9cVar, (lnm) null, (byte) 9)), new ob00((byte) 6)), o6x.a);
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        return rqt0.G(new ss90(this, r9cVar, (lnm) null, (byte) 25)).doOnError(k530.b1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(String str, boolean z, hlr0 hlr0Var, onm onmVar) {
        awc0 awc0Var;
        Set setW0;
        String str2;
        hlr0 hlr0Var2;
        Object objJ;
        Set set;
        hlr0 hlr0Var3;
        boolean z2 = z;
        if (onmVar instanceof awc0) {
            awc0Var = (awc0) onmVar;
            int i = awc0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                awc0Var.g = i - Integer.MIN_VALUE;
            } else {
                awc0Var = new awc0(this, onmVar);
            }
        } else {
            awc0Var = new awc0(this, onmVar);
        }
        Object obj = awc0Var.e;
        int i2 = awc0Var.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            setW0 = dm61.w0(sqc0.a, xqc0.a, yqc0.a, wqc0.a);
            if (!z2) {
                setW0.add(pqc0.a);
            }
            Single singleFirstOrError = this.f.firstOrError();
            str2 = str;
            awc0Var.a = str2;
            hlr0Var2 = hlr0Var;
            awc0Var.b = hlr0Var2;
            awc0Var.c = setW0;
            awc0Var.d = z2;
            awc0Var.g = 1;
            objJ = fc11.j(singleFirstOrError, awc0Var);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = awc0Var.d;
            Set set2 = awc0Var.c;
            hlr0 hlr0Var4 = awc0Var.b;
            str2 = awc0Var.a;
            hm5.M(obj);
            objJ = obj;
            setW0 = set2;
            hlr0Var2 = hlr0Var4;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set3 = awc0Var.c;
            hlr0Var3 = awc0Var.b;
            hm5.M(obj);
            set = set3;
        }
        g3d0 g3d0Var = (g3d0) obj;
        hlr0Var3.getClass();
        return new trc0(this.d, g3d0Var, set, false, qrc0.a, new iqz0(0, hlr0Var3.a()), null, 0, null, 448);
        r3d0 r3d0VarA = this.e.a((String) objJ);
        awc0Var.a = null;
        awc0Var.b = hlr0Var2;
        awc0Var.c = setW0;
        awc0Var.d = z2;
        awc0Var.g = 2;
        Object objA = r3d0VarA.a(str2, awc0Var);
        if (objA != d9nVar) {
            set = setW0;
            hlr0Var3 = hlr0Var2;
            obj = objA;
            g3d0 g3d0Var2 = (g3d0) obj;
            hlr0Var3.getClass();
            return new trc0(this.d, g3d0Var2, set, false, qrc0.a, new iqz0(0, hlr0Var3.a()), null, 0, null, 448);
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(r9c r9cVar, onm onmVar) throws Throwable {
        bwc0 bwc0Var;
        fkv fkvVar;
        if (onmVar instanceof bwc0) {
            bwc0Var = (bwc0) onmVar;
            int i = bwc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bwc0Var.d = i - Integer.MIN_VALUE;
            } else {
                bwc0Var = new bwc0(this, onmVar);
            }
        } else {
            bwc0Var = new bwc0(this, onmVar);
        }
        Object obj = bwc0Var.b;
        int i2 = bwc0Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fkvVar = bwc0Var.a;
            try {
                hm5.M(obj);
                fkvVar.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                fkvVar.a();
                throw th;
            }
        }
        hm5.M(obj);
        fkv fkvVar2 = (fkv) this.j.get();
        try {
            fkvVar2.getClass();
            bwc0Var.a = fkvVar2;
            bwc0Var.d = 1;
            Object objE = e(r9cVar, fkvVar2, bwc0Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
            obj = objE;
            fkvVar = fkvVar2;
            fkvVar.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            fkvVar = fkvVar2;
            fkvVar.a();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (((p.xyc0) r9).u(r1, r10, r0) == r8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.r9c r13, p.fkv r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hwc0.e(p.r9c, p.fkv, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047 A[PHI: r9
      0x0047: PHI (r9v3 p.wnb1) = (r9v2 p.wnb1), (r9v5 p.wnb1) binds: [B:6:0x0037, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    public final z310 f(wsc0 wsc0Var, rp91 rp91Var, Map map) {
        Context context;
        String string;
        Map map2;
        Map map3 = wsc0Var.j;
        kby kbyVar = wsc0Var.f;
        String str = kbyVar.a;
        List list = wsc0Var.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            context = this.a;
            u310 u310VarK = null;
            if (!zHasNext) {
                break;
            }
            zuc0 zuc0Var = (zuc0) it.next();
            Set set = s4b1.f;
            String str2 = zuc0Var.c;
            blc0 blc0Var = uic.x(str2).c;
            wnb1 wnb1VarT = (wnb1) map.get(new iey0(str2));
            if (wnb1VarT != null) {
                wnb1 wnb1Var = wnb1VarT;
                if (blc0Var == blc0.SHOW_SHOW) {
                    string = context.getResources().getString(2131952647);
                } else {
                    string = "%1$s";
                }
                String str3 = string;
                str3.getClass();
                map2 = map;
                u310VarK = this.g.K(zuc0Var, wnb1Var, str, str3, map2);
            } else {
                if (f7p1.m(str2)) {
                    wnb1VarT = z6p1.t(str2);
                    if (wnb1VarT != null) {
                        wnb1 wnb1Var2 = wnb1VarT;
                        if (blc0Var == blc0.SHOW_SHOW) {
                            string = context.getResources().getString(2131952647);
                        } else {
                            string = "%1$s";
                        }
                        String str4 = string;
                        str4.getClass();
                        map2 = map;
                        u310VarK = this.g.K(zuc0Var, wnb1Var2, str, str4, map2);
                    }
                } else {
                    Logger.k("EIS: No Kodiak decoration for item %s, skipping", new Object[]{str2});
                }
                map2 = map;
            }
            if (u310VarK != null) {
                arrayList.add(u310VarK);
            }
            map = map2;
        }
        smc0 smc0VarN = k4p1.n();
        if (!arrayList.isEmpty() && (map3.keySet().size() != 1 || !map3.containsKey(dlc0.b))) {
            smc0VarN.add(p8p1.s(context, str));
            if (!xrm1.a(str) && !str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
                smc0VarN.add(rp91Var == rp91.c ? p8p1.u(context, str, this.i) : p8p1.t(context, str));
            }
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        String string2 = sto1.m(str) ? context.getString(2131957638) : kbyVar.b;
        string2.getClass();
        return new z310(arrayList, new f410(string2, (String) null, (k310) null, smc0VarK));
    }
}
