package p;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class phi0 implements Function, elf {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public phi0(Flowable flowable, c3s c3sVar, q8n q8nVar, tka0 tka0Var) {
        this.a = (byte) 16;
        this.b = tka0Var;
        llm llmVarK = i3a.k(q8nVar);
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        sua suaVar = ey71.a;
        xe01 xe01VarT = d5p1.t(rqt0.u(new m9r0(d5p1.r(kgeVar, llmVarK, suaVar, 1), this, (byte) 16)), llmVarK, suaVar, (Object) null);
        this.c = xe01VarT;
        mr20 mr20VarU = rqt0.u(new xr0(xe01VarT, (byte) 29));
        Boolean bool = Boolean.FALSE;
        this.d = d5p1.t(mr20VarU, llmVarK, suaVar, bool);
        xe01 xe01VarT2 = d5p1.t(rqt0.u(new x010(xe01VarT, yoi1.g(c3sVar.e), new lok0(3, (lnm) null, (byte) 11), (byte) 1)), llmVarK, suaVar, (Object) null);
        this.e = xe01VarT2;
        this.f = d5p1.t(rqt0.u(new xr0(xe01VarT2, (byte) 29)), llmVarK, suaVar, bool);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        if (r2.a(r3, r4, r5, r6, r7, r14, r9) == r12) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, p.onm r20) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.phi0.A(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    public void B() {
        np00 np00Var;
        koe1 koe1Var = (koe1) this.e;
        if (koe1Var != null && (np00Var = (np00) this.d) != null) {
            np00Var.c(koe1Var);
        }
        this.c = null;
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(boolean z, onm onmVar) {
        ol01 ol01Var;
        Exception e;
        boolean z2;
        bpb1 bpb1Var = (bpb1) this.f;
        if (onmVar instanceof ol01) {
            ol01Var = (ol01) onmVar;
            int i = ol01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ol01Var.d = i - Integer.MIN_VALUE;
            } else {
                ol01Var = new ol01(this, onmVar);
            }
        } else {
            ol01Var = new ol01(this, onmVar);
        }
        Object obj = ol01Var.b;
        int i2 = ol01Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) bpb1Var.getValue()).booleanValue();
                bpb1Var.m((Object) null, Boolean.valueOf(z));
                try {
                    bfd bfdVar = (bfd) this.e;
                    String str = (String) this.b;
                    sl01 sl01Var = (sl01) this.c;
                    boolean z3 = !z;
                    try {
                        ol01Var.a = zBooleanValue;
                        ol01Var.d = 1;
                        Object objK = bfdVar.K(str, sl01Var, z3, ol01Var);
                        d9n d9nVar = d9n.a;
                        if (objK == d9nVar) {
                            return d9nVar;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z2 = zBooleanValue;
                        Logger.e(e, "Failed to update receipt preference", new Object[0]);
                        bpb1Var.m((Object) null, Boolean.valueOf(z2));
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = ol01Var.a;
                try {
                    hm5.M(obj);
                } catch (Exception e4) {
                    e = e4;
                    Logger.e(e, "Failed to update receipt preference", new Object[0]);
                    bpb1Var.m((Object) null, Boolean.valueOf(z2));
                }
            }
            return rih1.a;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    public Object apply(Object obj) {
        Completable completableFlatMapCompletable;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj2);
                upc upcVar = upc.o;
                upcVar.getClass();
                linkedHashMap.put("Cache-Control", nyn1.Z(upcVar));
                ytp0 ytp0Var = (ytp0) this.c;
                b510 b510Var = (b510) this.d;
                return b510Var.a(linkedHashMap, d7r.a(((yqg) ytp0Var.d).d()), h510.a((k510) this.e)).map(new myq0(b510Var, ((r9c) this.f).c, (byte) 15)).toObservable();
            case 14:
                va20 va20Var = va20.X0;
                st01 st01Var = (st01) this.f;
                tyt0 tyt0Var = (tyt0) this.e;
                ynb0 ynb0Var = tyt0Var.a;
                String str = (String) obj2;
                f7h f7hVar = (f7h) ((Map) obj).get(str);
                if (f7hVar != null && f7hVar.b) {
                    Observable observableJust = Observable.just(new qs01(str));
                    observableJust.getClass();
                    return observableJust;
                }
                y6b1 y6b1Var = (y6b1) this.c;
                if (y6b1Var == null || ((pyt0) this.d) == pyt0.b) {
                    completableFlatMapCompletable = ((muz) ynb0Var.get()).a(tyt0Var.a(str, str, st01Var)).flatMapCompletable(va20Var);
                } else {
                    completableFlatMapCompletable = ((muz) ynb0Var.get()).a(tyt0Var.a(y6b1Var.g(), str, st01Var)).flatMapCompletable(va20Var);
                }
                return completableFlatMapCompletable.w();
            default:
                xtv0 xtv0Var = (xtv0) obj;
                mzr0 mzr0Var = (mzr0) obj2;
                Single singleG = mzr0Var.g(xtv0Var.b, xtv0Var.a, xtv0Var.d, (String) null, xtv0Var.c);
                rrv0 rrv0Var = (rrv0) this.e;
                return singleG.doOnSubscribe(new fuv0(rrv0Var, (byte) 0)).doOnDispose(new guv0(rrv0Var, (byte) 0)).doOnSuccess(new fuv0(rrv0Var, (byte) 1)).map(new uqv0((nfa0) this.f, (byte) 1)).map(new qkn0((aru0) this.c, (byte) 29)).map(new vqv0((gal) this.d, (byte) 1)).doOnSuccess(new fuv0(rrv0Var, (byte) 2)).map(yj20.b1).doOnError(new fuv0(rrv0Var, (byte) 3)).onErrorReturn(new pob((byte) 20, false));
        }
    }

    public mr20 b() {
        return new m441(new ian0(this, null, (byte) 26));
    }

    public void c(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-702629372);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            if (i4 != 0) {
                qim0Var = qim0Var2;
            }
            qim0 qim0VarX = uyn1.x(u291.f(anm1.N("loading-spinner", qim0Var), 1.0f), 16.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarM = u291.m(qim0Var2, 24.0f);
            uwr uwrVar = cbx.a;
            xto1.e(qim0VarM, 0, cbx.a(x340Var).b.a, 0L, x340Var, 6, 10);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, qim0Var3, i, i2, (byte) 26);
        }
    }

    public void d(xtb0 xtb0Var, int i, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1589766832);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(xtb0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = yv91.a(new il9(xtb0Var, i, (byte) 1));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            boolean zG = x340Var.g(tob1Var) | ((i3 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new b201(tob1Var, function0, (lnm) null, (byte) 2);
                x340Var.s0(objT2);
            }
            qxd0.t(tob1Var, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(this, xtb0Var, i, function0, i2, (byte) 14);
        }
    }

    public void e(l201 l201Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-347363428);
        int i2 = i | (x340Var.g(l201Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            cce0 cce0Var = l201Var.a;
            if (cce0Var instanceof gbe0) {
                x340Var.i0(-1727481730);
                xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
                int i3 = l201Var.d;
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new j9z0(iu30Var, (byte) 10);
                    x340Var.s0(objT);
                }
                d(xtb0VarA, i3, (Function0) objT, x340Var, (i2 << 3) & 7168);
                qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                int i5 = i2 & 14;
                boolean z2 = (i5 == 4) | (i4 == 32);
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new zkz0((byte) 1, l201Var, iu30Var);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarA = ws41.a(qim0VarD, xtb0VarA, qqq0.a, new n201((Function0) objT2), false, false, (idn0) null, 248);
                WeakHashMap weakHashMap = osl1.x;
                vk80 vk80VarC = hqq0.C(lhc.g(x340Var).g, x340Var);
                boolean zI = (i5 == 4) | x340Var.i(this) | (i4 == 32);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new ozu0(l201Var, this, iu30Var, (byte) 18);
                    x340Var.s0(objT3);
                }
                ujo1.d(qim0VarA, xtb0VarA, vk80VarC, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT3, x340Var, 0, 504);
                x340Var.r(false);
            } else if (cce0Var instanceof qbe0) {
                x340Var.i0(-1725792664);
                c((i2 >> 3) & 112, 1, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-1725763834);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(this, l201Var, iu30Var, i, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v31 */
    public void f(lfi1 lfi1Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        tob1 tob1Var;
        vu30 vu30Var;
        Function0 function0;
        ?? r6;
        llj lljVar;
        ksl kslVar;
        x340 x340Var;
        x340 x340Var2;
        String strA;
        phi0 phi0Var = this;
        lfi1 lfi1Var2 = lfi1Var;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-205269606);
        j06 j06Var = x340Var3.a;
        int i2 = i | (x340Var3.i(lfi1Var2) ? 4 : 2) | (x340Var3.h(z) ? 32 : 16) | (x340Var3.i(iu30Var) ? 256 : 128) | (x340Var3.g(qim0Var) ? 2048 : 1024) | (x340Var3.i(phi0Var) ? 16384 : 8192);
        if (x340Var3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var3).a.a.a();
            long jC = cbx.a(x340Var3).a.a.c();
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new u7h(jA));
                x340Var3.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            qim0 qim0VarN = anm1.N("reactions-list-row", qim0Var);
            jtr jtrVar = jtr.f;
            boolean zF = ((i2 & 896) == 256) | ((i2 & 112) == 32) | x340Var3.f(jC) | x340Var3.i(phi0Var) | x340Var3.i(lfi1Var2);
            Object objT2 = x340Var3.T();
            if (zF || objT2 == m4cVar) {
                tob1Var = tob1Var2;
                o201 o201Var = new o201(z, jC, phi0Var, lfi1Var2, iu30Var, tob1Var);
                phi0Var = phi0Var;
                lfi1Var2 = lfi1Var2;
                x340Var3.s0(o201Var);
                objT2 = o201Var;
            } else {
                tob1Var = tob1Var2;
            }
            qim0 qim0VarY = uyn1.y(dug.f(u291.f(bin.v(qim0VarN, (idn0) null, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28), 1.0f), ((u7h) tob1Var.getValue()).a, d4o1.a), 16.0f, 8.0f);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var3, 48);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z2 = x340Var3.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var3.l(function1);
            } else {
                x340Var3.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(jw31VarA, x340Var3, vu30Var2);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarM = u291.m(nim0Var, 48.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarM);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(function1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, vu30Var2);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            ifi1 ifi1Var = lfi1Var2.a;
            boolean z3 = ifi1Var instanceof ifi1;
            ksl kslVar2 = isl.a;
            if (z3) {
                x340Var3.i0(-1596141649);
                ifi1 ifi1Var2 = ifi1Var;
                Uri uri = Uri.parse(ifi1Var2.c);
                String str = ifi1Var2.b;
                String str2 = ifi1Var2.a;
                lljVar = lljVar3;
                vu30Var = vu30Var2;
                r6 = 0;
                function0 = function1;
                bmq0.a(uri, u291.m(nim0Var, 48.0f), hcx.c, str, str2, 0L, 0L, false, x340Var3, 432, 224);
                x340Var = x340Var3;
                x340Var.r(false);
                kslVar = kslVar2;
            } else {
                vu30Var = vu30Var2;
                function0 = function1;
                r6 = 0;
                if (!(ifi1Var instanceof hfi1)) {
                    throw p3d1.k(x340Var3, -744228050, false);
                }
                x340Var3.i0(-744214637);
                lljVar = lljVar3;
                kslVar = kslVar2;
                eso1.e(Uri.parse(((hfi1) ifi1Var).c), kslVar, (qim0) null, new p3v(48.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 3120, 0, 4084);
                x340Var = x340Var3;
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0 qim0VarB = uyn1.B(new wnb0(1.0f, true), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r6);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, vu30Var);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            jw31 jw31VarA2 = ew31.a(gex0Var, een.Z, x340Var, (int) r6);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, vu30Var);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            ifi1 ifi1Var3 = lfi1Var2.a;
            if (ifi1Var3 instanceof ifi1) {
                x340Var.i0(839138103);
                x340 x340Var4 = x340Var;
                uwo1.e(ifi1Var3.a, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                x340Var2 = x340Var4;
                x340Var2.r((boolean) r6);
            } else {
                if (!(ifi1Var3 instanceof hfi1)) {
                    throw p3d1.k(x340Var, 27066189, (boolean) r6);
                }
                x340Var.i0(839388800);
                x340 x340Var5 = x340Var;
                w0h1.a(lrx.c, kslVar, eqr0.D(0.0f, 2.0f, 1, uyn1.B(u291.m(nim0Var, 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11)), cbx.a(x340Var5).b.b, 0L, false, x340Var5, lrx.d | 432, 48);
                uwo1.e(((hfi1) ifi1Var3).a, (qim0) null, cbx.d(x340Var5).h, cbx.a(x340Var5).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2034);
                x340Var2 = x340Var5;
                x340Var2.r((boolean) r6);
            }
            x340Var2.r(true);
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.b;
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            if (z) {
                strA = context.getString(2131960879);
                strA.getClass();
            } else {
                strA = ((xjh) phi0Var.c).a(lfi1Var2.c, ((yqg) phi0Var.b).b());
            }
            x340 x340Var6 = x340Var2;
            uwo1.e(strA, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2034);
            x340Var6.r(true);
            uwo1.e(((nmv0) ((mmv0) phi0Var.f)).c(lfi1Var2.b), (qim0) null, cbx.d(x340Var6).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2042);
            x340Var3 = x340Var6;
            x340Var3.r(true);
        } else {
            x340Var3.b0();
        }
        h311 h311VarV = x340Var3.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(phi0Var, lfi1Var2, z, iu30Var, qim0Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x025c  */
    /* JADX WARN: Code duplicated, block: B:120:0x026d  */
    /* JADX WARN: Code duplicated, block: B:135:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x011b A[Catch: all -> 0x0246, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0246, blocks: (B:42:0x00f6, B:49:0x011b), top: B:131:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0162 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #6 {all -> 0x015b, blocks: (B:58:0x0155, B:63:0x0162, B:66:0x0171, B:70:0x0194), top: B:137:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0171 A[Catch: all -> 0x015b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x015b, blocks: (B:58:0x0155, B:63:0x0162, B:66:0x0171, B:70:0x0194), top: B:137:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0194 A[Catch: all -> 0x015b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x015b, blocks: (B:58:0x0155, B:63:0x0162, B:66:0x0171, B:70:0x0194), top: B:137:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7 A[Catch: all -> 0x022e, TryCatch #9 {all -> 0x022e, blocks: (B:79:0x01c2, B:81:0x01d7, B:83:0x01e3, B:93:0x0214, B:86:0x01ee, B:88:0x01fa, B:90:0x0204, B:92:0x020c), top: B:143:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[Catch: all -> 0x022e, TryCatch #9 {all -> 0x022e, blocks: (B:79:0x01c2, B:81:0x01d7, B:83:0x01e3, B:93:0x0214, B:86:0x01ee, B:88:0x01fa, B:90:0x0204, B:92:0x020c), top: B:143:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee A[Catch: all -> 0x022e, TryCatch #9 {all -> 0x022e, blocks: (B:79:0x01c2, B:81:0x01d7, B:83:0x01e3, B:93:0x0214, B:86:0x01ee, B:88:0x01fa, B:90:0x0204, B:92:0x020c), top: B:143:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01fa A[Catch: all -> 0x022e, TryCatch #9 {all -> 0x022e, blocks: (B:79:0x01c2, B:81:0x01d7, B:83:0x01e3, B:93:0x0214, B:86:0x01ee, B:88:0x01fa, B:90:0x0204, B:92:0x020c), top: B:143:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0204 A[Catch: all -> 0x022e, TryCatch #9 {all -> 0x022e, blocks: (B:79:0x01c2, B:81:0x01d7, B:83:0x01e3, B:93:0x0214, B:86:0x01ee, B:88:0x01fa, B:90:0x0204, B:92:0x020c), top: B:143:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x020c A[Catch: all -> 0x022e, TryCatch #9 {all -> 0x022e, blocks: (B:79:0x01c2, B:81:0x01d7, B:83:0x01e3, B:93:0x0214, B:86:0x01ee, B:88:0x01fa, B:90:0x0204, B:92:0x020c), top: B:143:0x01c2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0288, code lost:
    
        if (r1 == r15) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(p.ih71 r26, p.onm r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.phi0.g(p.ih71, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(ww00 ww00Var, onm onmVar) {
        biw0 biw0Var;
        if (onmVar instanceof biw0) {
            biw0Var = (biw0) onmVar;
            int i = biw0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                biw0Var.d = i - Integer.MIN_VALUE;
            } else {
                biw0Var = new biw0(this, onmVar);
            }
        } else {
            biw0Var = new biw0(this, onmVar);
        }
        Object obj = biw0Var.b;
        int i2 = biw0Var.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ww00 ww00Var2 = biw0Var.a;
                hm5.M(obj);
                return ww00Var2;
            }
            hm5.M(obj);
            biw0Var.a = ww00Var;
            biw0Var.d = 1;
            Object objI = i(biw0Var);
            d9n d9nVar = d9n.a;
            return objI == d9nVar ? d9nVar : ww00Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Preview cleanup failed";
            }
            return new nw00(message);
        }
    }

    public Object i(onm onmVar) {
        Object objY = fn31.Y((q8n) this.d, new kdt0(this, null, (byte) 5), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public mr20 isEnabled() {
        return (lt20) this.d;
    }

    public Function0 j() {
        return (Function0) this.c;
    }

    public Long k() {
        return (Long) this.c;
    }

    public s1q0 l() {
        return (s1q0) this.b;
    }

    public tbr0 m() {
        return (tbr0) this.e;
    }

    public myq0 n() {
        return (myq0) this.f;
    }

    public zob1 o() {
        return (xe01) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (t(r8, r9, r0) == r5) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(p.bew r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.mkt0
            if (r0 == 0) goto L13
            r0 = r9
            p.mkt0 r0 = (p.mkt0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.mkt0 r0 = new p.mkt0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L76
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            java.lang.String r8 = r0.b
            p.bew r1 = r0.a
            p.hm5.M(r9)
            goto L63
        L39:
            p.hm5.M(r9)
            p.mst0 r9 = r8.b
            java.lang.String r1 = r8.a
            if (r9 == 0) goto L4f
            java.lang.String r9 = r9.getUri()
            if (r9 == 0) goto L4f
            boolean r6 = r9.equals(r1)
            if (r6 != 0) goto L4f
            goto L50
        L4f:
            r9 = r4
        L50:
            if (r9 != 0) goto L53
            goto L54
        L53:
            r1 = r9
        L54:
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r1 = r7.u(r1, r8, r0)
            if (r1 != r5) goto L61
            goto L75
        L61:
            r1 = r8
            r8 = r9
        L63:
            if (r8 != 0) goto L67
            java.lang.String r8 = r1.a
        L67:
            p.tv80 r9 = r1.c
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r7 = r7.t(r8, r9, r0)
            if (r7 != r5) goto L76
        L75:
            return r5
        L76:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.phi0.p(p.bew, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e A[Catch: Exception -> 0x002e, CancellationException -> 0x00ad, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:30:0x0078, B:32:0x007e, B:35:0x008b, B:37:0x008e, B:39:0x0092, B:42:0x009e), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: Exception -> 0x002e, CancellationException -> 0x00ad, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:30:0x0078, B:32:0x007e, B:35:0x008b, B:37:0x008e, B:39:0x0092, B:42:0x009e), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: Exception -> 0x002e, CancellationException -> 0x00ad, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:30:0x0078, B:32:0x007e, B:35:0x008b, B:37:0x008e, B:39:0x0092, B:42:0x009e), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[Catch: Exception -> 0x002e, CancellationException -> 0x00ad, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:30:0x0078, B:32:0x007e, B:35:0x008b, B:37:0x008e, B:39:0x0092, B:42:0x009e), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009e A[Catch: Exception -> 0x002e, CancellationException -> 0x00ad, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:30:0x0078, B:32:0x007e, B:35:0x008b, B:37:0x008e, B:39:0x0092, B:42:0x009e), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object q(s4b1 s4b1Var, onm onmVar) {
        v9n0 v9n0Var;
        String strZ;
        Exception e;
        String str;
        i1r i1rVar;
        d4e0 d4e0Var = (d4e0) this.b;
        if (onmVar instanceof v9n0) {
            v9n0Var = (v9n0) onmVar;
            int i = v9n0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9n0Var.d = i - Integer.MIN_VALUE;
            } else {
                v9n0Var = new v9n0(this, onmVar);
            }
        } else {
            v9n0Var = new v9n0(this, onmVar);
        }
        Object objO = v9n0Var.b;
        int i2 = v9n0Var.d;
        lnm lnmVar = null;
        a8n0 a8n0Var = a8n0.a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = v9n0Var.a;
                try {
                    hm5.M(objO);
                    i1rVar = (k1r) objO;
                    if (i1rVar instanceof i1r) {
                        if (l4o1.R((zoy0) i1rVar.a)) {
                            return c8n0.a;
                        }
                    } else {
                        if (i1rVar instanceof h1r) {
                            Logger.k("MusicVideoPrereleaseCheckerImpl: trait unavailable for %s, defaulting to CDP", new Object[]{str});
                            return a8n0Var;
                        }
                        if (i1rVar == null) {
                            Logger.k("MusicVideoPrereleaseCheckerImpl: timed out fetching prerelease status for %s, defaulting to CDP", new Object[]{str});
                        }
                    }
                    return a8n0Var;
                } catch (Exception e2) {
                    e = e2;
                    Logger.e(e, "MusicVideoPrereleaseCheckerImpl: failed to check prerelease status for %s, defaulting to CDP", new Object[]{str});
                    return a8n0Var;
                }
            }
            hm5.M(objO);
            boolean zA = ((ug4) d4e0Var.b).a();
            b8n0 b8n0Var = b8n0.a;
            if (!zA || !u890.j(s4b1Var.n("feature"), "mvcdp") || (strZ = s4b1Var.z()) == null) {
                return b8n0Var;
            }
            try {
                long jB = ((ug4) d4e0Var.b).b();
                m3n0 m3n0Var = new m3n0((Object) this, (Object) strZ, lnmVar, (byte) 3);
                v9n0Var.a = strZ;
                v9n0Var.d = 1;
                objO = rc2.O(jB, m3n0Var, v9n0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
                str = strZ;
                i1rVar = (k1r) objO;
                if (i1rVar instanceof i1r) {
                    if (l4o1.R((zoy0) i1rVar.a)) {
                        return c8n0.a;
                    }
                } else {
                    if (i1rVar instanceof h1r) {
                        Logger.k("MusicVideoPrereleaseCheckerImpl: trait unavailable for %s, defaulting to CDP", new Object[]{str});
                        return a8n0Var;
                    }
                    if (i1rVar == null) {
                        Logger.k("MusicVideoPrereleaseCheckerImpl: timed out fetching prerelease status for %s, defaulting to CDP", new Object[]{str});
                    }
                }
                return a8n0Var;
            } catch (Exception e3) {
                e = e3;
                str = strZ;
                Logger.e(e, "MusicVideoPrereleaseCheckerImpl: failed to check prerelease status for %s, defaulting to CDP", new Object[]{str});
                return a8n0Var;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    public xe01 r() {
        return (xe01) this.d;
    }

    public mr20 s(ArrayList arrayList, su01 su01Var, long j) {
        boolean zIsEmpty = arrayList.isEmpty();
        b7x b7xVar = b7x.a;
        if (zIsEmpty) {
            return new huz(new cbr(b7xVar), (byte) 10);
        }
        su01Var.h("decorate_playlists");
        trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) this.f, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
        Set setP1 = o7h.p1(arrayList);
        int iS = zno1.s(q7h.U(setP1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : setP1) {
            linkedHashMap.put(obj, trc0Var);
        }
        return j6p1.m(new m441(new us0(((xr01) this.d).a, b7xVar, o4p1.r(new iib(new m441(new a38(su01Var, this, linkedHashMap, (int) ((j > 0 ? j : 3000L) / 1000), (lnm) null)), new lok0(su01Var, (lnm) null, (byte) 12), (byte) 6), (q8n) this.c), (lnm) null, (byte) 27)), rku0.g, new t0r0(0, su01Var, su01.class, "endPlaylistPoint", "endPlaylistPoint()V", 0, (byte) 24), new dsr0(su01Var, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object t(String str, tv80 tv80Var, onm onmVar) {
        okt0 okt0Var;
        if (onmVar instanceof okt0) {
            okt0Var = (okt0) onmVar;
            int i = okt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                okt0Var.c = i - Integer.MIN_VALUE;
            } else {
                okt0Var = new okt0(this, onmVar);
            }
        } else {
            okt0Var = new okt0(this, onmVar);
        }
        Object obj = okt0Var.a;
        int i2 = okt0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                f1n0 f1n0Var = (f1n0) this.b;
                bwn0 bwn0Var = tv80Var != null ? new bwn0(tv80Var) : null;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                dwn0 dwn0Var = new dwn0(str, "", false, false, 0, 0, false, null, null, bwn0Var);
                okt0Var.c = 1;
                Object objD = f1n0.d(f1n0Var, dwn0Var, okt0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "ExtendedUserActivityRowElement: Navigation failed", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object u(String str, bew bewVar, onm onmVar) throws NoWhenBranchMatchedException {
        qkt0 qkt0Var;
        ou80 ou80Var;
        if (onmVar instanceof qkt0) {
            qkt0Var = (qkt0) onmVar;
            int i = qkt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qkt0Var.c = i - Integer.MIN_VALUE;
            } else {
                qkt0Var = new qkt0(this, onmVar);
            }
        } else {
            qkt0Var = new qkt0(this, onmVar);
        }
        qkt0 qkt0Var2 = qkt0Var;
        Object objB = qkt0Var2.a;
        int i2 = qkt0Var2.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                long jB = ((yqg) this.e).b();
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.w(((lik1) this.d).a);
                zpzVarY.s("listening-activity");
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                tv80 tv80Var = bewVar.c;
                String str2 = (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                cozVarR.n(str2);
                y6r0 y6r0Var = ((b7r0) this.f).get();
                String str3 = y6r0Var != null ? y6r0Var.a : null;
                cozVarR.q(str3 != null ? str3 : "");
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(jB);
                cozVarR.t(qpzVarP);
                EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
                lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(bewVar.a);
                lqzVarS.C(wrzVarP.build());
                EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
                xrc0 xrc0Var = (xrc0) this.c;
                playOriginBuild.getClass();
                trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
                preparePlayOptionsBuild.getClass();
                loggingParamsBuild.getClass();
                qkt0Var2.c = 1;
                objB = xrc0.b(xrc0Var, str, trc0Var, preparePlayOptionsBuild, playOriginBuild, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParamsBuild, (ayc0) null, qkt0Var2, 176);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            ly21 ly21Var = (py21) objB;
            ly21Var.getClass();
            if (ly21Var instanceof ly21) {
                Logger.d("ExtendedUserActivityRowElement: Play in context failed: %s", new Object[]{ly21Var.a.b()});
                return rih1Var;
            }
            if (!(ly21Var instanceof oy21)) {
                throw new NoWhenBranchMatchedException();
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "ExtendedUserActivityRowElement: Play in context failed", new Object[0]);
            return rih1Var;
        }
    }

    public void v(Long l) {
        Long l2 = (Long) this.c;
        if (l2 != null) {
            if (l2.longValue() == l.longValue()) {
                return;
            }
        }
        this.c = l;
        if (l.longValue() < 0 || ((np00) this.d) == null) {
            return;
        }
        w();
    }

    public void w() {
        Long l;
        np00 np00Var;
        koe1 koe1Var = (koe1) this.e;
        if (koe1Var != null && (np00Var = (np00) this.d) != null) {
            np00Var.c(koe1Var);
        }
        np00 np00Var2 = (np00) this.d;
        if (np00Var2 == null || (l = (Long) this.c) == null) {
            return;
        }
        long jLongValue = l.longValue();
        this.e = np00Var2.b(new long[]{jLongValue}, true, new o0g(this, jLongValue, (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(String str, dwu0 dwu0Var, boolean z, rss rssVar, onm onmVar) {
        awu0 awu0Var;
        Object objA;
        if (onmVar instanceof awu0) {
            awu0Var = (awu0) onmVar;
            int i = awu0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                awu0Var.g = i - Integer.MIN_VALUE;
            } else {
                awu0Var = new awu0(this, onmVar);
            }
        } else {
            awu0Var = new awu0(this, onmVar);
        }
        Object obj = awu0Var.e;
        int i2 = awu0Var.g;
        if (i2 == 0) {
            hm5.M(obj);
            cwu0 cwu0Var = (cwu0) this.c;
            awu0Var.a = str;
            awu0Var.b = dwu0Var;
            awu0Var.c = rssVar;
            awu0Var.d = z;
            awu0Var.g = 1;
            objA = cwu0Var.a(str, dwu0Var, awu0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = awu0Var.d;
            rssVar = awu0Var.c;
            dwu0Var = awu0Var.b;
            str = awu0Var.a;
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        String str2 = str;
        dwu0 dwu0Var2 = dwu0Var;
        rss rssVar2 = rssVar;
        if (e331.a(objA) == null) {
            if (z && rssVar2 != null) {
                rssVar2.a(new yva1(dwu0Var2), new odp0(this, str2, dwu0Var2, rssVar2, (byte) 5));
            }
        } else if (rssVar2 != null) {
            rssVar2.a(xva1.a, null);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015d, code lost:
    
        if (z(r1, r2, r3, r4, r0, r9) == r12) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, p.vt81 r23, p.onm r24) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.phi0.y(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, p.vt81, p.onm):java.lang.Object");
    }

    public Object z(String str, String str2, String str3, String str4, vt81 vt81Var, jyx0 jyx0Var) {
        ResolveInteractiveContextRequest.PromptInputType promptInputType;
        au81 au81Var = (au81) this.b;
        ResolveInteractiveContextRequest.Builder builderNewBuilder = ResolveInteractiveContextRequest.newBuilder();
        builderNewBuilder.setPrompt(str);
        builderNewBuilder.setSessionId(str2);
        builderNewBuilder.setDeviceId(str3);
        builderNewBuilder.setCurrentSegmentId(str4);
        int iOrdinal = vt81Var.ordinal();
        if (iOrdinal == 0) {
            promptInputType = ResolveInteractiveContextRequest.PromptInputType.PROMPT_INPUT_TYPE_TEXT;
        } else if (iOrdinal == 1) {
            promptInputType = ResolveInteractiveContextRequest.PromptInputType.PROMPT_INPUT_TYPE_SUGGESTED;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            promptInputType = ResolveInteractiveContextRequest.PromptInputType.PROMPT_INPUT_TYPE_VOICE;
        }
        builderNewBuilder.setInputType(promptInputType);
        ResolveInteractiveContextRequest resolveInteractiveContextRequestBuild = builderNewBuilder.build();
        rs81 rs81Var = au81Var.a;
        resolveInteractiveContextRequestBuild.getClass();
        Object objD = rs81Var.d(resolveInteractiveContextRequestBuild, jyx0Var);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }

    public /* synthetic */ phi0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public phi0(m9n m9nVar) {
        this.a = (byte) 15;
        this.b = m9nVar;
    }

    public phi0(o751 o751Var, q8n q8nVar) {
        this.a = (byte) 12;
        this.b = o751Var;
        this.c = q8nVar;
        this.d = new o4e0(this, (byte) 15);
        this.e = new vrk1((byte) 29);
        this.f = new jkt0((byte) 0);
    }

    public phi0(String str, sl01 sl01Var, lt20 lt20Var, bfd bfdVar) {
        this.a = (byte) 27;
        this.b = str;
        this.c = sl01Var;
        this.d = lt20Var;
        this.e = bfdVar;
        this.f = gio1.b(Boolean.FALSE);
    }

    public /* synthetic */ phi0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public phi0(drj0 drj0Var, twb twbVar, ilh1 ilh1Var, jqd0 jqd0Var, ewn0 ewn0Var, mar0 mar0Var) {
        this.a = (byte) 8;
        this.b = drj0Var;
        this.c = ilh1Var;
        this.d = jqd0Var;
        this.e = ewn0Var;
        this.f = new vqv0(mar0Var, (byte) 23);
    }

    public phi0(ttm0 ttm0Var, yqg yqgVar, q8n q8nVar) {
        this.a = (byte) 22;
        this.b = ttm0Var;
        this.c = yqgVar;
        this.d = q8nVar;
    }

    public phi0(d4e0 d4e0Var, ynb0 ynb0Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.b = d4e0Var;
        this.c = ynb0Var;
        this.d = q8nVar;
        this.e = new idd1(new zem0(this, (byte) 22));
        this.f = w3p1.o(new l4r(new wlu(rc11.a.b(zoy0.class)), 1, l9n0.d, new j4r(l9n0.f), l9n0.e), l9n0.g);
    }

    public phi0(xrc0 xrc0Var, nf61 nf61Var, c23 c23Var, mka mkaVar, mwm1 mwm1Var) {
        this.a = (byte) 29;
        this.b = xrc0Var;
        this.c = nf61Var;
        this.d = c23Var;
        this.e = mwm1Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        sku0VarP.Z();
        sku0VarP.r();
        hru0VarS.x(sku0VarP);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        this.f = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public phi0(xrc0 xrc0Var, q8n q8nVar, xr01 xr01Var, t2j0 t2j0Var) {
        this.a = (byte) 17;
        this.b = xrc0Var;
        this.c = q8nVar;
        this.d = xr01Var;
        this.e = t2j0Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        hru0VarS.u(iou0VarV.build());
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.R();
        sku0VarP.d0();
        sku0VarP.j0();
        sku0VarP.G();
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.s();
        sku0VarP.X(i8i1VarO.build());
        sku0VarP.q(hz00.X3);
        hru0VarS.w(sku0VarP.build());
        this.f = hru0VarS.build();
    }

    public phi0(agz0 agz0Var, SpotifyIconView spotifyIconView, SpotifyIconView spotifyIconView2, ImageView imageView, TextView textView, FrameLayout frameLayout) {
        this.a = (byte) 25;
        this.b = agz0Var;
        this.c = spotifyIconView;
        this.d = spotifyIconView2;
        this.e = imageView;
        this.f = textView;
    }

    public phi0(Function0 function0, s1q0 s1q0Var, wbr0 wbr0Var, vbr0 vbr0Var, tbr0 tbr0Var, myq0 myq0Var) {
        this.a = (byte) 7;
        this.c = function0;
        this.b = s1q0Var;
        this.d = wbr0Var;
        this.e = tbr0Var;
        this.f = myq0Var;
    }

    public phi0(yqg yqgVar, xjh xjhVar, pux0 pux0Var, g4q g4qVar, List list) {
        this.a = (byte) 26;
        this.b = yqgVar;
        this.c = xjhVar;
        this.d = pux0Var;
        this.e = list;
        this.f = g4qVar.a(list);
    }
}
