package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yu3 implements qhh0, Function {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public yu3(Flowable flowable, xrc0 xrc0Var, q8n q8nVar) {
        this.a = (byte) 21;
        this.b = xrc0Var;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.c = dt71VarE;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.d = bpb1VarB;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowable.J(ns80.N0).t(Functions.a);
        vbm[] vbmVarArr = q601.a;
        this.e = o4p1.r(new lt20(new x010(hu20.e(new x010(new kge(flowableDistinctUntilChangedT), new ht20(dt71VarE, new sd0(2, (lnm) null, (byte) 15)), new a89(3, (lnm) null, (byte) 0), (byte) 1), new qt((lnm) null, this, (byte) 19)), bpb1VarB, new l2(3, (lnm) null, (byte) 12), (byte) 1), new re1(3, (lnm) null, (byte) 7), (byte) 0), q8nVar);
    }

    public List a(z310 z310Var, String str, t380 t380Var, y310 y310Var) {
        String str2;
        a6h1 a6h1Var = (a6h1) this.d;
        smc0 smc0VarN = k4p1.n();
        f410 f410Var = z310Var.b;
        if (f410Var != null) {
            d410 d410VarA = f410Var.a();
            if (d410VarA != null) {
                Bundle bundleG = pzm.g("com.spotify.music.extra.SHUFFLE", true);
                if (y310Var != null) {
                    ArrayList arrayListO0 = o7h.O0(new p710(26, null, "SHUFFLE_PLAY", null, d410VarA.c, null), y310Var.a);
                    y310 y310Var2 = new y310(arrayListO0);
                    a6h1Var.a.put(Integer.valueOf(y310Var2.hashCode()), y310Var2);
                    bundleG.putInt("spotify.ubi", arrayListO0.hashCode());
                }
                smc0VarN.add(new phh0(uic.d(str, d410VarA.c).a, d410VarA.a, d410VarA.b, (Uri) null, ((aai0) this.b).c(d410VarA.d), bundleG, 2));
            }
            k310 k310Var = f410Var.c;
            if (k310Var != null) {
                String str3 = k310Var.b;
                Bundle bundle = new Bundle();
                if (y310Var != null) {
                    ArrayList arrayListO1 = o7h.O0(new p710(26, null, "AUDIOBOOK_HEADER", null, k310Var.b, null), y310Var.a);
                    y310 y310Var3 = new y310(arrayListO1);
                    a6h1Var.a.put(Integer.valueOf(y310Var3.hashCode()), y310Var3);
                    bundle.putInt("spotify.ubi", arrayListO1.hashCode());
                }
                Double d = k310Var.f;
                String str4 = uic.d(str, str3).a;
                String str5 = k310Var.c;
                boolean z = k310Var.a;
                String str6 = k310Var.d;
                if (!z && ((d == null || u890.g(d, 0.0d)) && (str2 = k310Var.g) != null)) {
                    str6 = str2;
                }
                Uri uri = k310Var.e;
                if (TextUtils.isEmpty(str3)) {
                    bundle.remove("com.spotify.music.extra.CONTEXT_URI");
                } else {
                    bundle.putString("com.spotify.music.extra.CONTEXT_URI", str3);
                }
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                if (dDoubleValue >= 0.0d && dDoubleValue <= 1.0d) {
                    bundle.putDouble("androidx.media.MediaItem.Extras.COMPLETION_PERCENTAGE", dDoubleValue);
                }
                smc0VarN.add(0, new phh0(str4, str5, str6, (Uri) null, uri, bundle, 2));
            }
        }
        q881 q881Var = (q881) this.c;
        List<u310> list = z310Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (u310 u310VarB : list) {
            String str7 = u310VarB.z;
            if (str7 != null) {
                u310VarB = u310.b(u310VarB, (String) null, ((Context) this.e).getString(2131963439, str7, u310VarB.d), (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -9, 15);
            }
            arrayList.add(u310VarB);
        }
        smc0VarN.addAll(q881Var.b(arrayList, str, t380Var));
        return k4p1.k(smc0VarN);
    }

    public Object apply(Object obj) {
        Intent intentC;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                String str = ((ch90) obj2).b;
                List<bh90> list = (List) obj;
                List list2 = (List) this.c;
                List list3 = (List) this.d;
                List list4 = (List) this.e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (bh90 bh90VarA : list) {
                    if (bh90VarA instanceof bh90) {
                        bh90VarA = bh90VarA;
                        String str2 = bh90VarA.a;
                        if (list2.contains(str2)) {
                            bh90VarA = bh90.a(bh90VarA, 2);
                        } else if (list3.contains(str2)) {
                            bh90VarA = bh90.a(bh90VarA, 3);
                        } else if (list4.contains(str2)) {
                            bh90VarA = bh90.a(bh90VarA, 4);
                        }
                    }
                    arrayList.add(bh90VarA);
                }
                return new hey(str, arrayList);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Context context = (Context) this.d;
                Observable observable = (Observable) ((km3) obj2).b;
                wq8 wq8Var = (wq8) this.e;
                Single singleFirstOrError = observable.filter(new x5j1(wq8Var, (byte) 28)).map(q9w.X).firstOrError();
                String str3 = (String) this.c;
                if (str3 == null) {
                    intentC = n9x0.c(context, wq8Var);
                } else {
                    Intent intentC2 = n9x0.c(context, wq8Var);
                    intentC2.putExtra("ID_TOKEN", str3);
                    intentC2.addFlags(268435456);
                    intentC = intentC2;
                }
                context.startActivity(intentC);
                return singleFirstOrError;
            default:
                return ((e06) obj) instanceof c06 ? new an41(new f80((tif1) obj2, (dn41) this.c, (l3n1) this.d, (kly0) this.e, (byte) 11)) : bn41.a;
        }
    }

    public List b(List list, String str, t380 t380Var) {
        return ((q881) this.c).b(list, str, t380Var);
    }

    public void c(bqk0 bqk0Var, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z6;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1098755269);
        int i2 = i | (x340Var.i(bqk0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.h(z4) ? 1048576 : 524288) | (x340Var.h(z5) ? 8388608 : 4194304) | 100663296 | (x340Var.i(this) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            String strO0 = cwl1.o0(x340Var, 2131953082);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new nb9(strO0, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarY = voo1.y(s161.b(qim0VarF, false, (iu30) objT), voo1.g);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarY, 16.0f, 16.0f, 16.0f, cbx.b(x340Var).b.b);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zI = x340Var.i(bqk0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                z6 = true;
                objT2 = new vs9(bqk0Var, (byte) 1);
                x340Var.s0(objT2);
            } else {
                z6 = true;
            }
            dgo1.c("byom_volume_controls_page", (iu30) objT2, apo.r(-1136238739, new ws9(z4, str, this, z, z2, str2, z3, z5), x340Var), x340Var, 390);
            x340Var.r(z6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xs9(this, bqk0Var, str, z, z2, str2, z3, z4, z5, qim0Var2, i);
        }
    }

    public void d(int i, String str, b0k b0kVar, boolean z, boolean z2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(830852236);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            i1o1.e((gm9) this.b, new bm9(str, z, z2), (d0r) this.e, (qim0) null, (ipb1) null, apo.r(1313183503, new dr0((byte) 4, z), x340Var), x8i.a, 0, (xu30) null, x340Var, 1769480, 204);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(this, str, z, z2, i, (byte) 2);
        }
    }

    public void e(int i, String str, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1925206139);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            i1o1.e((gm9) this.c, new rs9(str, z), (d0r) this.e, (qim0) null, (ipb1) null, x8i.b, x8i.c, 0, (xu30) null, x340Var, 1769480, 204);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(this, str, z, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r8.emit(p.qp9.a, r0) == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p.vr20 r8, com.spotify.player.model.ContextTrack r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.zp9
            if (r0 == 0) goto L13
            r0 = r10
            p.zp9 r0 = (p.zp9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.zp9 r0 = new p.zp9
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L45
            if (r1 == r5) goto L3d
            if (r1 == r4) goto L35
            if (r1 != r2) goto L2f
            p.hm5.M(r10)
            goto La5
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L35:
            com.spotify.player.model.ContextTrack r7 = r0.b
            p.vr20 r8 = r0.a
            p.hm5.M(r10)
            goto L78
        L3d:
            com.spotify.player.model.ContextTrack r9 = r0.b
            p.vr20 r8 = r0.a
            p.hm5.M(r10)
            goto L59
        L45:
            p.hm5.M(r10)
            java.lang.Object r10 = r7.d
            p.ix7 r10 = (p.ix7) r10
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Enum r10 = r10.F(r9, r5, r0)
            if (r10 != r6) goto L59
            goto La4
        L59:
            p.tr9 r10 = (p.tr9) r10
            int r10 = r10.ordinal()
            if (r10 == r5) goto La8
            if (r10 == r4) goto L66
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L66:
            java.lang.Object r7 = r7.b
            p.mr20 r7 = (p.mr20) r7
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r10 = p.b5p1.i(r7, r0)
            if (r10 != r6) goto L77
            goto La4
        L77:
            r7 = r9
        L78:
            com.spotify.player.model.PlayerState r10 = (com.spotify.player.model.PlayerState) r10
            p.spq0 r9 = r10.track()
            java.lang.Object r9 = r9.h()
            com.spotify.player.model.ContextTrack r9 = (com.spotify.player.model.ContextTrack) r9
            if (r9 == 0) goto L8b
            java.lang.String r9 = r9.uri()
            goto L8c
        L8b:
            r9 = r3
        L8c:
            java.lang.String r7 = r7.uri()
            boolean r7 = p.u890.j(r9, r7)
            if (r7 == 0) goto La5
            r0.a = r3
            r0.b = r3
            r0.e = r2
            p.qp9 r7 = p.qp9.a
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r6) goto La5
        La4:
            return r6
        La5:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        La8:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yu3.f(p.vr20, com.spotify.player.model.ContextTrack, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r10.emit(p.rp9.a, r0) == r7) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(p.vr20 r10, p.xp9 r11, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.aq9
            if (r0 == 0) goto L13
            r0 = r12
            p.aq9 r0 = (p.aq9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.aq9 r0 = new p.aq9
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L4c
            if (r1 == r5) goto L44
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            p.hm5.M(r12)
            return r12
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r6
        L37:
            p.hm5.M(r12)
            goto La9
        L3c:
            p.xp9 r10 = r0.b
            p.vr20 r11 = r0.a
            p.hm5.M(r12)
            goto L79
        L44:
            p.xp9 r11 = r0.b
            p.vr20 r10 = r0.a
            p.hm5.M(r12)
            goto L5e
        L4c:
            p.hm5.M(r12)
            r0.a = r10
            r0.b = r11
            r0.e = r5
            p.up9 r12 = p.up9.a
            java.lang.Object r12 = r10.emit(r12, r0)
            if (r12 != r7) goto L5e
            goto La8
        L5e:
            boolean r12 = r11.d
            if (r12 == 0) goto L9a
            java.lang.Object r12 = r9.d
            p.ix7 r12 = (p.ix7) r12
            com.spotify.player.model.ContextTrack r1 = r11.a
            r0.a = r10
            r0.b = r11
            r0.e = r4
            r4 = 0
            java.lang.Enum r12 = r12.F(r1, r4, r0)
            if (r12 != r7) goto L76
            goto La8
        L76:
            r8 = r11
            r11 = r10
            r10 = r8
        L79:
            p.tr9 r1 = p.tr9.b
            if (r12 != r1) goto L7f
            r10 = r11
            goto L9a
        L7f:
            java.lang.Object r12 = r9.e
            p.c3s r12 = (p.c3s) r12
            boolean r12 = r12.c()
            if (r12 != 0) goto L97
            r0.a = r6
            r0.b = r6
            r0.e = r2
            java.lang.Object r9 = r9.h(r11, r10, r0)
            if (r9 != r7) goto L96
            goto La8
        L96:
            return r9
        L97:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L9a:
            r0.a = r6
            r0.b = r6
            r0.e = r3
            p.rp9 r9 = p.rp9.a
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r7) goto La9
        La8:
            return r7
        La9:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yu3.g(p.vr20, p.xp9, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r1.emit(r10, r0) == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(p.vr20 r11, p.xp9 r12, p.onm r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yu3.h(p.vr20, p.xp9, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, onm onmVar) {
        zw9 zw9Var;
        xkk1 xkk1Var;
        mq70 mq70Var;
        pp70 pp70Var;
        if (onmVar instanceof zw9) {
            zw9Var = (zw9) onmVar;
            int i = zw9Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zw9Var.d = i - Integer.MIN_VALUE;
            } else {
                zw9Var = new zw9(this, onmVar);
            }
        } else {
            zw9Var = new zw9(this, onmVar);
        }
        Object objL = zw9Var.b;
        int i2 = zw9Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFilter = ((uu00) this.c).b(new oi("companion-content-npv", false, new nb9(str, (byte) 6))).filter(vgp1.X);
            zw9Var.a = str;
            zw9Var.d = 1;
            objL = fc11.l(observableFilter, 2, (Object) null, zw9Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zw9Var.a;
            hm5.M(objL);
        }
        uv00 uv00Var = (uv00) objL;
        if (uv00Var == null || (xkk1Var = uv00Var.a(xkk1.class, str).b) == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) {
            return null;
        }
        return new u7h(pp70Var.b.a.c);
    }

    public void j() {
        Messenger messenger;
        ohh0 ohh0Var = (ohh0) this.e;
        if (ohh0Var != null) {
            mhh0 mhh0Var = ohh0Var.a;
            fad0 fad0Var = mhh0Var.f;
            if (fad0Var != null && (messenger = mhh0Var.g) != null) {
                try {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 7;
                    messageObtain.arg1 = 1;
                    messageObtain.setData(null);
                    messageObtain.replyTo = messenger;
                    ((Messenger) fad0Var.b).send(messageObtain);
                } catch (RemoteException unused) {
                }
            }
            mhh0Var.b.disconnect();
        }
    }

    public a56 k(chr0 chr0Var) {
        Object obj = ((Map) this.b).get(chr0Var);
        if (obj != null) {
            return ((b56) obj).a((u46) this.c, (d0r) ((Function0) this.d).invoke(), (da6) this.e);
        }
        jah.h("No ArtifactPageDataConfigProvider registered for ", chr0Var, ". Did you install the config module in MainActivityModule?");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(hqq0 hqq0Var, onm onmVar) {
        uu3 uu3Var;
        Object objK;
        if (onmVar instanceof uu3) {
            uu3Var = (uu3) onmVar;
            int i = uu3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uu3Var.c = i - Integer.MIN_VALUE;
            } else {
                uu3Var = new uu3(this, onmVar);
            }
        } else {
            uu3Var = new uu3(this, onmVar);
        }
        Object obj = uu3Var.a;
        int i2 = uu3Var.c;
        ev3 ev3Var = ev3.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (!(hqq0Var instanceof ou3)) {
                    if (hqq0Var instanceof pu3) {
                        return ev3Var;
                    }
                    eg.o();
                    return null;
                }
                if (!((dxz0) this.e).d()) {
                    return fv3.a;
                }
                hyy0 hyy0Var = (hyy0) this.b;
                String str = ((ou3) hqq0Var).d;
                uu3Var.c = 1;
                objK = hyy0Var.k(str, (String) null, uu3Var);
                Object obj2 = d9n.a;
                if (objK == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objK = ((xv3) obj).a;
            }
            return new hv3((String) objK);
        } catch (Exception unused) {
            return ev3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, onm onmVar) {
        vu3 vu3Var;
        if (onmVar instanceof vu3) {
            vu3Var = (vu3) onmVar;
            int i = vu3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vu3Var.c = i - Integer.MIN_VALUE;
            } else {
                vu3Var = new vu3(this, onmVar);
            }
        } else {
            vu3Var = new vu3(this, onmVar);
        }
        Object obj = vu3Var.a;
        int i2 = vu3Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            ((kt91) this.c).k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            vu3Var.c = 1;
            Object objQ = q(vu3Var);
            Object obj2 = d9n.a;
            if (objQ == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return dv3.a;
    }

    public void n(String str) {
        it8 it8Var = (it8) this.e;
        ((i8h1) ((idd1) it8Var.c).getValue()).f(new wqk0(t7l0.b, str, ((w6h1) it8Var.b).b()).e(), (Set) null);
        ((kt91) this.c).k(new er91((fs91) null, ((Resources) this.b).getString(2131958074), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public synchronized void o() {
        CompositeDisposable compositeDisposable = (CompositeDisposable) this.e;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        ((LinkedBlockingDeque) this.b).clear();
        ((AtomicBoolean) this.c).set(true);
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.e = compositeDisposable2;
        compositeDisposable2.b(((g38) this.d).a().subscribe(new op7(this, (byte) 0), new op7(this, (byte) 1)));
    }

    public synchronized void p() {
        ((AtomicBoolean) this.c).set(false);
        CompositeDisposable compositeDisposable = (CompositeDisposable) this.e;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(onm onmVar) {
        wu3 wu3Var;
        boolean zBooleanValue;
        if (onmVar instanceof wu3) {
            wu3Var = (wu3) onmVar;
            int i = wu3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wu3Var.c = i - Integer.MIN_VALUE;
            } else {
                wu3Var = new wu3(this, onmVar);
            }
        } else {
            wu3Var = new wu3(this, onmVar);
        }
        Object objM = wu3Var.a;
        int i2 = wu3Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                qm qmVar = new qm(this, (lnm) null, (byte) 22);
                wu3Var.c = 1;
                objM = rc2.M(5000L, qmVar, wu3Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objM);
            }
            zBooleanValue = ((Boolean) objM).booleanValue();
        } catch (TimeoutCancellationException unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public yu3(lzn0 lzn0Var, gw70 gw70Var, mmr mmrVar, xrk xrkVar) {
        this.a = (byte) 8;
        this.d = lzn0Var;
        this.b = gw70Var;
        this.c = mmrVar;
        this.e = xrkVar;
    }

    public yu3(g38 g38Var) {
        this.a = (byte) 11;
        this.b = new LinkedBlockingDeque();
        this.c = new AtomicBoolean();
        this.d = g38Var;
    }

    public yu3(aai0 aai0Var, q881 q881Var, a6h1 a6h1Var, Context context, uic uicVar) {
        this.a = (byte) 1;
        this.b = aai0Var;
        this.c = q881Var;
        this.d = a6h1Var;
        this.e = context;
    }

    public yu3(Activity activity, ryf ryfVar, hhr hhrVar, lzn0 lzn0Var) {
        this.a = (byte) 16;
        this.b = activity;
        this.c = ryfVar;
        this.e = hhrVar;
        this.d = lzn0Var;
    }

    public yu3(ijr ijrVar, dg30 dg30Var, q8n q8nVar) {
        this.a = (byte) 28;
        this.b = ijrVar;
        this.c = dg30Var;
        this.d = q8nVar;
        this.e = new idd1(new vv8(this, (byte) 8));
    }

    public /* synthetic */ yu3(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public yu3(cbr0 cbr0Var, em0 em0Var, i26 i26Var) {
        this.a = (byte) 5;
        this.b = cbr0Var;
        this.c = em0Var;
        this.d = i26Var;
    }

    public yu3(yb7 yb7Var, cir0 cir0Var, xb7 xb7Var) {
        this.a = (byte) 10;
        this.b = yb7Var;
        this.c = xb7Var;
        this.d = mno1.a(1, 2, 4);
        this.e = cir0Var.h().a(uj1.h, new wj1(this, (byte) 2));
    }

    public yu3(w6h1 w6h1Var, pwo pwoVar, Resources resources, kt91 kt91Var, dlg1 dlg1Var) {
        it8 it8Var;
        this.a = (byte) 27;
        this.b = resources;
        this.c = kt91Var;
        this.d = dlg1Var;
        switch (pwoVar.a) {
            case 0:
                it8Var = new it8(w6h1Var, (fwo) ((qq) pwoVar.b.c).d);
                break;
            default:
                it8Var = new it8(w6h1Var, (blp) ((wj3) pwoVar.b.c).e);
                break;
        }
        this.e = it8Var;
    }

    public yu3(Context context) {
        this.a = (byte) 15;
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = pbo1.T0;
        if (context == null) {
            this.e = qp7.f;
        }
    }

    public yu3(ie30 ie30Var) {
        this.a = (byte) 12;
        this.b = ie30Var;
        this.c = null;
        this.d = sqe1.a;
        this.e = null;
    }

    public yu3(AudioTrack audioTrack, ps7 ps7Var) {
        this.a = (byte) 14;
        this.b = audioTrack;
        this.c = ps7Var;
        Handler handlerR = zoi1.r((lkh0) null);
        this.d = handlerR;
        k58 k58Var = new k58(this);
        this.e = k58Var;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) k58Var, handlerR);
    }

    public yu3(hh hhVar) {
        this.a = (byte) 2;
        this.b = new qr4(this, (byte) 1);
        this.d = hhVar;
    }
}
