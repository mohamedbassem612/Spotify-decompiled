package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bxh implements uwh {
    public final e390 a;
    public final uu00 b;
    public final xrc0 c;
    public final q8n d;
    public final xgn0 e = ygn0.a();

    public bxh(e390 e390Var, uu00 uu00Var, xrc0 xrc0Var, q8n q8nVar) {
        this.a = e390Var;
        this.b = uu00Var;
        this.c = xrc0Var;
        this.d = q8nVar;
    }

    public final Observable a(List list) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zvh zvhVar = (zvh) this.a.a.c(str);
            if (zvhVar != null) {
                map.put(str, zvhVar);
            } else {
                arrayList.add(str);
            }
        }
        return Observable.just(arrayList).switchMap(new mp8(this, (byte) 23)).map(new cfd(list, map, (byte) 24));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0099 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:13:0x0029, B:31:0x0093, B:33:0x0099), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, String str, onm onmVar) throws Throwable {
        ywh ywhVar;
        vgn0 vgn0Var;
        int i2;
        vgn0 vgn0Var2;
        wwh wwhVar;
        rzh rzhVarA;
        if (onmVar instanceof ywh) {
            ywhVar = (ywh) onmVar;
            int i3 = ywhVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ywhVar.g = i3 - Integer.MIN_VALUE;
            } else {
                ywhVar = new ywh(this, onmVar);
            }
        } else {
            ywhVar = new ywh(this, onmVar);
        }
        Object obj = ywhVar.e;
        int i4 = ywhVar.g;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(obj);
                ywhVar.a = str;
                vgn0Var = this.e;
                ywhVar.b = vgn0Var;
                ywhVar.c = i;
                i2 = 0;
                ywhVar.d = 0;
                ywhVar.g = 1;
                if (vgn0Var.a(ywhVar) != d9nVar) {
                }
                return d9nVar;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = ywhVar.b;
                try {
                    hm5.M(obj);
                    wwhVar = (xwh) obj;
                    if (wwhVar instanceof wwh) {
                        rzhVarA = wwhVar.a();
                    } else {
                        rzhVarA = null;
                    }
                    vgn0Var2.c((Object) null);
                    return rzhVarA;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            int i5 = ywhVar.d;
            int i6 = ywhVar.c;
            vgn0 vgn0Var3 = ywhVar.b;
            String str2 = ywhVar.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            i2 = i5;
            i = i6;
            str = str2;
            Set set = s4b1.f;
            if (!uic.g(str, blc0.Pg)) {
                vgn0Var.c((Object) null);
                return null;
            }
            Observable observableSwitchMap = a(k4p1.x(str)).switchMap(new sw9(this, i, (byte) 3));
            vwh vwhVar = vwh.a;
            ywhVar.a = null;
            ywhVar.b = vgn0Var;
            ywhVar.c = i;
            ywhVar.d = i2;
            ywhVar.g = 2;
            Object objL = fc11.l(observableSwitchMap, 2, vwhVar, ywhVar);
            if (objL != d9nVar) {
                vgn0 vgn0Var4 = vgn0Var;
                obj = objL;
                vgn0Var2 = vgn0Var4;
                wwhVar = (xwh) obj;
                if (wwhVar instanceof wwh) {
                    rzhVarA = wwhVar.a();
                } else {
                    rzhVarA = null;
                }
                vgn0Var2.c((Object) null);
                return rzhVarA;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) throws Throwable {
        zwh zwhVar;
        vgn0 vgn0Var;
        int i;
        Throwable th;
        d9n d9nVarD;
        Object obj;
        int i2;
        vgn0 vgn0Var2;
        Object objL;
        if (onmVar instanceof zwh) {
            zwhVar = (zwh) onmVar;
            int i3 = zwhVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zwhVar.g = i3 - Integer.MIN_VALUE;
            } else {
                zwhVar = new zwh(this, onmVar);
            }
        } else {
            zwhVar = new zwh(this, onmVar);
        }
        Object obj2 = zwhVar.e;
        int i4 = zwhVar.g;
        int i5 = 0;
        d9n d9nVar = z6x.a;
        d9n d9nVar2 = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(obj2);
                zwhVar.a = str;
                vgn0Var = this.e;
                zwhVar.b = vgn0Var;
                zwhVar.c = 0;
                zwhVar.g = 1;
                if (vgn0Var.a(zwhVar) != d9nVar2) {
                    i = 0;
                }
                return d9nVar2;
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    i5 = zwhVar.d;
                    i2 = zwhVar.c;
                    vgn0 vgn0Var3 = zwhVar.b;
                    try {
                        hm5.M(obj2);
                        obj = obj2;
                        vgn0Var = vgn0Var3;
                        Observable observableA = a((List) obj);
                        zwhVar.a = null;
                        zwhVar.b = vgn0Var;
                        zwhVar.c = i2;
                        zwhVar.d = i5;
                        zwhVar.g = 3;
                        objL = fc11.l(observableA, 2, d9nVar, zwhVar);
                        if (objL != d9nVar2) {
                            vgn0 vgn0Var4 = vgn0Var;
                            obj2 = objL;
                            vgn0Var2 = vgn0Var4;
                        }
                        return d9nVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        vgn0Var2 = vgn0Var3;
                    }
                } else {
                    if (i4 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vgn0Var2 = zwhVar.b;
                    try {
                        hm5.M(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                vgn0Var2.c((Object) null);
                throw th;
            }
            int i6 = zwhVar.c;
            vgn0 vgn0Var5 = zwhVar.b;
            String str2 = zwhVar.a;
            hm5.M(obj2);
            vgn0Var = vgn0Var5;
            i = i6;
            str = str2;
            vgn0Var2.c((Object) null);
            return obj2;
            Set set = s4b1.f;
            blc0 blc0Var = blc0.Pg;
            blc0 blc0Var2 = blc0.fh;
            if (!uic.h(str, new blc0[]{blc0Var, blc0Var2})) {
                vgn0Var.c((Object) null);
                return d9nVar;
            }
            zwhVar.a = null;
            zwhVar.b = vgn0Var;
            zwhVar.c = i;
            zwhVar.d = 0;
            zwhVar.g = 2;
            try {
                if (uic.g(str, blc0Var)) {
                    d9nVarD = k4p1.x(str);
                } else {
                    d9nVarD = uic.g(str, blc0Var2) ? d(str, zwhVar) : d9nVar;
                }
                if (d9nVarD != d9nVar2) {
                    int i7 = i;
                    obj = d9nVarD;
                    i2 = i7;
                    Observable observableA2 = a((List) obj);
                    zwhVar.a = null;
                    zwhVar.b = vgn0Var;
                    zwhVar.c = i2;
                    zwhVar.d = i5;
                    zwhVar.g = 3;
                    objL = fc11.l(observableA2, 2, d9nVar, zwhVar);
                    if (objL != d9nVar2) {
                        vgn0 vgn0Var6 = vgn0Var;
                        obj2 = objL;
                        vgn0Var2 = vgn0Var6;
                        vgn0Var2.c((Object) null);
                        return obj2;
                    }
                }
                return d9nVar2;
            } catch (Throwable th4) {
                th = th4;
                vgn0Var2 = vgn0Var;
                vgn0Var2.c((Object) null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable d(String str, onm onmVar) {
        axh axhVar;
        if (onmVar instanceof axh) {
            axhVar = (axh) onmVar;
            int i = axhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                axhVar.c = i - Integer.MIN_VALUE;
            } else {
                axhVar = new axh(this, onmVar);
            }
        } else {
            axhVar = new axh(this, onmVar);
        }
        Object objF = axhVar.a;
        int i2 = axhVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
            llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true));
            hru0VarS.t(llu0VarR);
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
            playlistRequestDecorationPolicyBuild.getClass();
            trc0 trc0Var = new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
            axhVar.c = 1;
            objF = this.c.f(str, trc0Var, axhVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var == null) {
            return z6x.a;
        }
        List list = wsc0Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zuc0) it.next()).c);
        }
        return arrayList;
    }
}
