package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.carmobile.waze.WazeReturnActivity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$DownloadCommand;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tjq implements dl4, quu, Function, cy81 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public tjq(LayoutInflater layoutInflater, ViewGroup viewGroup, egs egsVar, kt91 kt91Var) {
        this.b = kt91Var;
        View viewInflate = layoutInflater.inflate(2131624689, viewGroup, false);
        int i = 2131427651;
        FrameLayout frameLayout = (FrameLayout) m5n1.t(viewInflate, 2131427651);
        if (frameLayout != null) {
            i = 2131428433;
            ComposeView composeViewT = m5n1.t(viewInflate, 2131428433);
            if (composeViewT != null) {
                i = 2131430446;
                TextView textView = (TextView) m5n1.t(viewInflate, 2131430446);
                if (textView != null) {
                    i = 2131430447;
                    TextView textView2 = (TextView) m5n1.t(viewInflate, 2131430447);
                    if (textView2 != null) {
                        i = 2131430932;
                        ComposeView composeViewT2 = m5n1.t(viewInflate, 2131430932);
                        if (composeViewT2 != null) {
                            i = 2131430998;
                            ComposeView composeViewT3 = m5n1.t(viewInflate, 2131430998);
                            if (composeViewT3 != null) {
                                i = 2131431400;
                                FrameLayout frameLayout2 = (FrameLayout) m5n1.t(viewInflate, 2131431400);
                                if (frameLayout2 != null) {
                                    this.c = new p410((LinearLayout) viewInflate, frameLayout, composeViewT, textView, textView2, composeViewT2, composeViewT3, frameLayout2);
                                    this.a = new idd1(new d4e(this, (byte) 16));
                                    this.d = new idd1(new nxr(layoutInflater, this, (byte) 17));
                                    b2u.q(textView2);
                                    new xap(egsVar.a, frameLayout2, new s20(this, (byte) 14));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static final /* synthetic */ p410 f(tjq tjqVar) {
        return (p410) tjqVar.c;
    }

    public static final /* synthetic */ iu30 g(tjq tjqVar) {
        return (y0o) tjqVar.e;
    }

    public static yrw j(String str, uv00 uv00Var, Integer num) {
        d7u0 d7u0Var = uv00Var.a(d7u0.class, str).b;
        if (d7u0Var != null) {
            tqj1 tqj1Var = (tqj1) o7h.s0(d7u0Var.b);
            f2k1 f2k1Var = tqj1Var != null ? tqj1Var.b : null;
            if (f2k1Var == null) {
                f2k1Var = null;
            }
            if (f2k1Var != null) {
                String str2 = f2k1Var.a;
                if (ihc1.y0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    return new yrw(Collections.singletonList(new asw(num, str2, (Integer) null)));
                }
            }
        }
        return null;
    }

    public void a(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(931360998);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(686950716);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                qej0 qej0Var = new qej0(new q7u(iu30Var, (byte) 12), ((lfq) this.e).a.b.A5);
                x340Var.s0(qej0Var);
                objT = qej0Var;
            }
            otw.c((qej0) objT, rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            x340Var.r(false);
        } else {
            x340Var.i0(687227484);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xsv(this, z, iu30Var, i, (byte) 0);
        }
    }

    public Object apply(Object obj) {
        return Observable.defer(new ixu((EsOfflinePlugin$DownloadCommand) this.b, (onf0) this.c, (Scheduler) this.a, (pmf0) this.d, (lpz) this.e));
    }

    public void b(List list) {
        ayl aylVar = (ayl) ((mxr) this.c).c;
        lik1 lik1Var = (lik1) this.a;
        String str = (String) this.d;
        drj0 drj0Var = (drj0) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ayl.c(aylVar, (String) it.next(), lik1Var.a, 4);
        }
        ayl.c(aylVar, str, lik1Var.a, 4);
        drj0Var.j(str, 4, false);
        ((xab1) this.b).d((CancellationException) null);
    }

    public void c(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1617426629);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-481194665);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                uej0 uej0Var = new uej0(new v0j(iu30Var, (byte) 26), ((qfq) this.d).a.b.A5);
                x340Var.s0(uej0Var);
                objT = uej0Var;
            }
            uej0 uej0Var2 = (uej0) objT;
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ysv(this, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("override-warning-dialog", (iu30) objT2, apo.r(-775305010, new utt(uej0Var2, (byte) 19), x340Var), x340Var, 390);
            x340Var.r(false);
        } else {
            x340Var.i0(-480174083);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xsv(this, z, iu30Var, i, (byte) 1);
        }
    }

    public void d(String str, bek0 bek0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2055836775);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(bek0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                ifq ifqVar = (ifq) this.c;
                v0j v0jVar = new v0j(iu30Var, (byte) 27);
                teq teqVar = ifqVar.a.c;
                vek0 vek0Var = (vek0) teqVar.yf.get();
                ziq ziqVar = teqVar.a;
                jek0 jek0Var = new jek0(v0jVar, vek0Var, (jfq) ziqVar.m6.get(), (kfq) ziqVar.n6.get(), (lfq) ziqVar.o6.get(), (mfq) ziqVar.p6.get());
                x340Var.s0(jek0Var);
                objT = jek0Var;
            }
            otw.c((jek0) objT, new vdk0(str, bek0Var), (qim0) null, (ipb1) null, x340Var, 64, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(this, str, bek0Var, iu30Var, i, (byte) 22);
        }
    }

    public void e(String str, htv htvVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        h311 h311VarV;
        zsv zsvVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1242886681);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(htvVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (htvVar.h.e) {
                bek0 bek0VarT = mqn1.t(htvVar);
                if (bek0VarT == null) {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        zsvVar = new zsv(this, str, htvVar, iu30Var, qim0Var, i, (byte) 2);
                    }
                } else {
                    boolean z = (i2 & 896) == 256;
                    Object objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        pfq pfqVar = (pfq) this.a;
                        v0j v0jVar = new v0j(iu30Var, (byte) 28);
                        teq teqVar = pfqVar.a.c;
                        vek0 vek0Var = (vek0) teqVar.yf.get();
                        ziq ziqVar = teqVar.a;
                        pfk0 pfk0Var = new pfk0(v0jVar, vek0Var, (lfq) ziqVar.o6.get(), (kfq) ziqVar.n6.get(), (mfq) ziqVar.p6.get());
                        x340Var.s0(pfk0Var);
                        objT = pfk0Var;
                    }
                    pfk0 pfk0Var2 = (pfk0) objT;
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = ktd.n(x340Var);
                    }
                    idn0 idn0Var = (idn0) objT2;
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = xzu.P0;
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarV = bin.v(qim0Var, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT3, 28);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
                    otw.c(pfk0Var2, new gfk0(str, bek0VarT), (qim0) null, (ipb1) null, x340Var, 64, 12);
                    x340Var.r(true);
                }
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    zsvVar = new zsv(this, str, htvVar, iu30Var, qim0Var, i, (byte) 0);
                }
            }
            h311VarV.d = zsvVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            zsvVar = new zsv(this, str, htvVar, iu30Var, qim0Var, i, (byte) 1);
            h311VarV.d = zsvVar;
        }
    }

    public nm1 h() {
        d0r d0rVar = ((gl90) this.b).b;
        l3q l3qVar = (l3q) this.d;
        bl3 bl3Var = (bl3) l3qVar.a.q8.get();
        c8o.l(bl3Var);
        oj3 oj3Var = (oj3) l3qVar.b.k1.get();
        c8o.l(oj3Var);
        return new nm1(d0rVar, bl3Var, oj3Var, i());
    }

    public jq4 i() {
        luk lukVar = (luk) ((l3q) this.d).a.L1.get();
        c8o.l(lukVar);
        return new jq4(lukVar);
    }

    public Single k(List list, String str, boolean z, String str2, tv80 tv80Var) {
        oj3 oj3Var = (oj3) this.b;
        if (z || str2.length() <= 0) {
            return (z && ((t75) this.d).g()) ? oj3.e(oj3Var, list, str, "").e(Single.just(new lj3((dsa0) null))) : oj3Var.c(list, str, "", z, new gj3(27, tv80Var));
        }
        return j2h1.D(o6x.a, new el0(this, str2, list, str, tv80Var, (lnm) null, (byte) 24)).n((Scheduler) this.e).c(cfr.b((cfr) this.c, list, str, Collections.singletonList(str2), z6x.a, "")).e(Single.just(new kj3((dsa0) null)));
    }

    public void l() {
        ((vku) this.e).c();
    }

    public xvu m() {
        l3q l3qVar = (l3q) this.d;
        daq daqVar = l3qVar.a;
        Context context = (Context) daqVar.x1.a;
        c8o.l(context);
        teq teqVar = l3qVar.b;
        suu suuVar = (suu) teqVar.s3.get();
        c8o.l(suuVar);
        x1v x1vVar = (x1v) teqVar.v3.get();
        c8o.l(x1vVar);
        l78 l78VarY = daqVar.y();
        ayl aylVar = (ayl) teqVar.x3.get();
        c8o.l(aylVar);
        i1r0 i1r0Var = (i1r0) teqVar.y3.get();
        c8o.l(i1r0Var);
        y5v0 y5v0Var = (y5v0) teqVar.T4.get();
        c8o.l(y5v0Var);
        drp0 drp0Var = (drp0) teqVar.G4.get();
        c8o.l(drp0Var);
        d0r d0rVar = ((gl90) this.b).b;
        q8n q8nVar = (q8n) daqVar.V2.get();
        c8o.l(q8nVar);
        return new xvu(context, suuVar, x1vVar, l78VarY, aylVar, i1r0Var, y5v0Var, drp0Var, d0rVar, q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x0085, PHI: r7 r14 r15
      0x005c: PHI (r7v2 java.util.Iterator) = (r7v0 java.util.Iterator), (r7v3 java.util.Iterator), (r7v3 java.util.Iterator), (r7v3 java.util.Iterator) binds: [B:23:0x0056, B:73:0x012c, B:64:0x0104, B:68:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r14v5 ??) = (r14v20 ??), (r14v21 ??), (r14v22 ??), (r14v23 ??) binds: [B:23:0x0056, B:73:0x012c, B:64:0x0104, B:68:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r15v8 int) = (r15v6 int), (r15v9 int), (r15v12 int), (r15v9 int) binds: [B:23:0x0056, B:73:0x012c, B:64:0x0104, B:68:0x010f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013f A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x0082, B:40:0x00c2, B:55:0x00ec, B:57:0x00f5, B:59:0x00f9, B:62:0x00fe, B:24:0x005c, B:26:0x0062, B:27:0x0068, B:39:0x008d, B:77:0x0145, B:65:0x0107, B:67:0x010b, B:69:0x0111, B:70:0x0122, B:71:0x0127, B:72:0x0128, B:74:0x012e, B:43:0x00cf, B:46:0x00d8, B:49:0x00df, B:52:0x00e6, B:75:0x013f, B:76:0x0144, B:23:0x0056), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:92:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object n(java.util.ArrayList r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tjq.n(java.util.ArrayList, p.onm):java.lang.Object");
    }

    public Object o(sdh sdhVar, onm onmVar) {
        boolean z = sdhVar instanceof mdh;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            Object objA = ((tow) this.b).a(sdhVar, onmVar);
            if (objA == d9nVar) {
                return objA;
            }
        } else if (sdhVar instanceof pdh) {
            pdh pdhVar = (pdh) sdhVar;
            Object objJ = fc11.j(((ppw) this.c).a.k.a(q9u0.k(SkipToNextTrackCommand.builder().track(ContextTrack.builder(pdhVar.a).uid(pdhVar.b).build()).build())), onmVar);
            if (objJ != d9nVar) {
                objJ = rih1Var;
            }
            if (objJ == d9nVar) {
                return objJ;
            }
        } else if (sdhVar instanceof kdh) {
            Object objA2 = ((row) this.a).a(sdhVar, onmVar);
            if (objA2 == d9nVar) {
                return objA2;
            }
        } else if (sdhVar instanceof ndh) {
            Object objA3 = ((fpw) this.d).a(sdhVar, onmVar);
            if (objA3 == d9nVar) {
                return objA3;
            }
        } else {
            if (!(sdhVar instanceof qdh)) {
                eg.o();
                return null;
            }
            Object objI = fc11.i(((ki91) ((a710) ((qmr) this.e).b).h.get()).g((String) null, (tv80) null), onmVar);
            if (objI != d9nVar) {
                objI = rih1Var;
            }
            if (objI == d9nVar) {
                return objI;
            }
        }
        return rih1Var;
    }

    public Flowable p() {
        return (Flowable) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) {
        v5z v5zVar;
        if (onmVar instanceof v5z) {
            v5zVar = (v5z) onmVar;
            int i = v5zVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5zVar.d = i - Integer.MIN_VALUE;
            } else {
                v5zVar = new v5z(this, onmVar);
            }
        } else {
            v5zVar = new v5z(this, onmVar);
        }
        Object objD = v5zVar.b;
        int i2 = v5zVar.d;
        if (i2 == 0) {
            hm5.M(objD);
            jn7 jn7Var = (jn7) this.a;
            p831 p831VarP = ResumptionProgressEsperanto.GetResumePointRequest.p();
            p831VarP.q(str);
            p831VarP.r("predictive-episode-page");
            p831VarP.s("predictive-episode-page");
            ResumptionProgressEsperanto.GetResumePointRequest getResumePointRequestBuild = p831VarP.build();
            v5zVar.a = str;
            v5zVar.d = 1;
            objD = jn7Var.D(getResumePointRequestBuild, v5zVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = v5zVar.a;
            hm5.M(objD);
        }
        ResumptionProgressEsperanto.ItemResumePoint itemResumePoint = (ResumptionProgressEsperanto.ItemResumePoint) ((ResumptionProgressEsperanto.GetResumePointResponse) objD).o().get(str);
        if (itemResumePoint != null && itemResumePoint.o() == r831.c && itemResumePoint.q()) {
            return new Integer((int) (itemResumePoint.p().o().p() * 1000));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(String str, onm onmVar) {
        w5z w5zVar;
        if (onmVar instanceof w5z) {
            w5zVar = (w5z) onmVar;
            int i = w5zVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5zVar.c = i - Integer.MIN_VALUE;
            } else {
                w5zVar = new w5z(this, onmVar);
            }
        } else {
            w5zVar = new w5z(this, onmVar);
        }
        Object objO = w5zVar.a;
        int i2 = w5zVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                x5z x5zVar = new x5z(this, str, (lnm) null, (byte) 0);
                w5zVar.c = 1;
                objO = rc2.O(500L, x5zVar, w5zVar);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (Integer) objO;
        } catch (Exception e) {
            op71.x(w5zVar.getContext());
            Logger.e(e, "Resume position lookup failed, prefetching from start", new Object[0]);
            return null;
        }
    }

    public LinearLayout s() {
        return (LinearLayout) ((p410) this.c).b;
    }

    public void t(iu30 iu30Var, iu30 iu30Var2) {
        yvd0 yvd0Var;
        vqv0 vqv0Var = (vqv0) this.c;
        xvd0 xvd0Var = (xvd0) this.b;
        Resources resources = (Resources) vqv0Var.b;
        if (xvd0Var instanceof mvd0) {
            yvd0Var = vqv0Var.k(2131957578, 2131957577);
        } else if (xvd0Var instanceof nvd0) {
            yvd0Var = vqv0Var.k(2131957580, 2131957579);
        } else if (xvd0Var instanceof ovd0) {
            yvd0Var = new yvd0(resources.getString(2131957612), resources.getString(2131957609), resources.getString(2131957611), resources.getString(2131957610));
        } else if (xvd0Var instanceof rvd0) {
            yvd0Var = new yvd0(resources.getString(2131957585), resources.getString(2131957584), resources.getString(2131957581), null);
        } else if (xvd0Var instanceof svd0) {
            yvd0Var = vqv0Var.k(2131957587, 2131957586);
        } else if (xvd0Var instanceof tvd0) {
            yvd0Var = vqv0Var.k(2131957589, 2131957588);
        } else if (xvd0Var instanceof uvd0) {
            yvd0Var = vqv0Var.k(2131957591, 2131957590);
        } else if (xvd0Var instanceof qvd0) {
            yvd0Var = vqv0Var.k(2131957583, 2131957582);
        } else if ((xvd0Var instanceof pvd0) || (xvd0Var instanceof wvd0)) {
            yvd0Var = new yvd0(resources.getString(2131957604), resources.getString(2131957602), resources.getString(2131957603), null);
        } else {
            if (!(xvd0Var instanceof vvd0)) {
                eg.o();
                return;
            }
            yvd0Var = new yvd0(resources.getString(2131957595), resources.getString(2131957592), resources.getString(2131957594), resources.getString(2131957593));
        }
        iu30Var.invoke(new aqd0(yvd0Var.a, yvd0Var.b, yvd0Var.c, yvd0Var.d));
        this.e = iu30Var2;
        iu30Var2.invoke(new m4r(this, (byte) 25));
    }

    public void u() {
        ((iu30) this.e).invoke(c6s.b);
        ((hgv0) this.d).b();
    }

    public rit0 v() {
        gl90 gl90Var = (gl90) this.b;
        yzc0 yzc0Var = gl90Var.a;
        l3q l3qVar = (l3q) this.d;
        daq daqVar = l3qVar.a;
        yqg yqgVar = (yqg) daqVar.J1.get();
        c8o.l(yqgVar);
        qop qopVar = (qop) this.c;
        muz muzVarE = qopVar.e();
        lik1 lik1VarG = qopVar.g();
        d0r d0rVar = gl90Var.b;
        teq teqVar = l3qVar.b;
        f1n0 f1n0Var = (f1n0) teqVar.T2.get();
        c8o.l(f1n0Var);
        tzo tzoVar = qopVar.a;
        a690 a690VarL = u1n0.l((q7r0) ((uap) tzoVar.b).H);
        gn10 gn10VarD = ((uap) tzoVar.b).d();
        vb2 vb2Var = (vb2) teqVar.n3.get();
        c8o.l(vb2Var);
        l78 l78VarY = daqVar.y();
        i1r0 i1r0Var = (i1r0) teqVar.y3.get();
        c8o.l(i1r0Var);
        Flowable flowable = (Flowable) daqVar.D5.get();
        c8o.l(flowable);
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        b7r0 b7r0Var = (b7r0) daqVar.p7.get();
        c8o.l(b7r0Var);
        y5v0 y5v0Var = (y5v0) teqVar.T4.get();
        c8o.l(y5v0Var);
        return new rit0(yzc0Var, yqgVar, muzVarE, lik1VarG, d0rVar, f1n0Var, a690VarL, gn10VarD, vb2Var, l78VarY, i1r0Var, kgeVar, b7r0Var, y5v0Var, i().l());
    }

    public void w(Object obj) {
        WazeReturnActivity wazeReturnActivity = (WazeReturnActivity) obj;
        daq daqVar = (daq) this.c;
        ((t3b1) wazeReturnActivity).b1 = (jgu) daqVar.a.g0.get();
        ((t3b1) wazeReturnActivity).c1 = new tuk(xqu.a((obq) this.e));
        wazeReturnActivity.f1 = (l7a) daqVar.Lo.get();
    }

    public nm1 x() {
        d0r d0rVar = ((gl90) this.b).b;
        f1n0 f1n0Var = (f1n0) ((l3q) this.d).b.T2.get();
        c8o.l(f1n0Var);
        return new nm1(d0rVar, f1n0Var, i());
    }

    public void z() {
        ParagraphView paragraphView = (ParagraphView) this.b;
        paragraphView.setVisibility(0);
        paragraphView.setAlpha(0.0f);
        fyy fyyVar = (fyy) this.c;
        paragraphView.x(fyyVar.h);
        ParagraphView paragraphView2 = (ParagraphView) this.a;
        paragraphView2.setVisibility(0);
        paragraphView2.setAlpha(0.0f);
        paragraphView2.x(fyyVar.i);
        ImageView imageView = (ImageView) this.d;
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
        imageView.setImageBitmap(fyyVar.j);
        imageView.setTranslationY(fyy.i(imageView, (Guideline) this.e));
    }

    public /* synthetic */ tjq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public tjq(z1x z1xVar, List list, dwp dwpVar, gwp gwpVar, pxo pxoVar, d1x d1xVar) {
        this.b = z1xVar;
        this.c = list;
        this.a = dwpVar;
        this.d = gwpVar;
        this.e = d1xVar;
    }

    public tjq(xvd0 xvd0Var, vqv0 vqv0Var, afu afuVar, uy2 uy2Var) {
        hgv0 hgv0Var;
        this.b = xvd0Var;
        this.c = vqv0Var;
        this.a = afuVar;
        if (xvd0Var.equals(ovd0.a)) {
            hgv0Var = (hgv0) uy2Var.a.get();
        } else if (!xvd0Var.equals(pvd0.a)) {
            if (xvd0Var instanceof wvd0) {
                hgv0Var = (hgv0) uy2Var.d.get();
            } else {
                hgv0Var = (hgv0) uy2Var.b.get();
            }
        } else {
            hgv0Var = (hgv0) uy2Var.c.get();
        }
        this.d = hgv0Var;
        this.e = nvr.e1;
    }

    public tjq(l0x0 l0x0Var, rb00 rb00Var, ayl aylVar, rvy0 rvy0Var) {
        this.b = l0x0Var;
        this.c = rb00Var;
        this.a = aylVar;
        this.d = rvy0Var;
        this.e = new vku();
    }

    public tjq(Context context, ftr ftrVar, yqg yqgVar) {
        this.b = context;
        this.c = ftrVar;
        this.a = yqgVar;
        this.d = DateFormat.getDateInstance(2);
        this.e = new SimpleDateFormat("EEEE", Locale.getDefault());
    }

    public tjq(z320 z320Var, zur zurVar, q8n q8nVar, ro30 ro30Var) {
        o1u o1uVar = o1u.a;
        this.b = z320Var;
        this.c = zurVar;
        this.a = o1uVar;
        this.d = q8nVar;
        this.e = ro30Var;
    }

    public tjq(lh4 lh4Var, huh0 huh0Var, uu00 uu00Var, jn7 jn7Var) {
        this.b = lh4Var;
        this.c = uu00Var;
        this.a = jn7Var;
        this.d = new o3e0("predictive-episode-page", huh0Var);
    }

    public tjq(vi11 vi11Var) {
        this.b = vi11Var;
        this.c = new ipq(this, 0, (byte) 7);
        this.a = new ipq(this, 1, (byte) 7);
        this.d = new ipq(this, 2, (byte) 7);
        this.e = new ipq(this, 3, (byte) 7);
    }

    public tjq(jbq jbqVar, qop qopVar, bct bctVar) {
        this.b = qopVar;
        this.c = bctVar;
        this.d = jbqVar;
        this.a = xqu.b(new ttq(this, 1, (byte) 11));
        this.e = new ttq(this, 0, (byte) 11);
    }

    public tjq(kct kctVar, fmf1 fmf1Var, q7r0 q7r0Var) {
        this.b = kctVar;
        this.c = fmf1Var;
        this.e = q7r0Var;
        byte b = 26;
        this.a = xqu.b(new jxp(this, 1, b));
        this.d = xqu.b(new jxp(this, 0, b));
    }

    public tjq(rk81 rk81Var, qk81 qk81Var) {
        this.b = rk81Var;
        this.c = qk81Var;
        this.a = xqu.b(new ipq(this, 1, (byte) 14));
        this.d = iy81.a(new ipq(this, 0, (byte) 14));
        this.e = xqu.b(new ipq(this, 2, (byte) 14));
    }

    public tjq(aqk1 aqk1Var, q7r0 q7r0Var) {
        this.b = aqk1Var;
        this.c = q7r0Var;
        this.a = iy81.a(new tsq(this, 0, (byte) 21));
        this.d = xqu.b(new tsq(this, 1, (byte) 21));
        this.e = xqu.b(new tsq(this, 2, (byte) 21));
    }

    public tjq(e821 e821Var) {
        this.b = e821Var;
        this.a = iy81.a(new ykq(this, 1, (byte) 23));
        this.d = iy81.a(new ykq(this, 2, (byte) 23));
        this.c = iy81.a(new ykq(this, 3, (byte) 23));
        this.e = iy81.a(new ykq(this, 0, (byte) 23));
        iy81.a(new ykq(this, 4, (byte) 23));
    }

    public tjq(Context context, g871 g871Var, iyc0 iyc0Var, s6v0 s6v0Var, me30 me30Var, k3i0 k3i0Var, zid zidVar, lid lidVar, lo71 lo71Var, qwe1 qwe1Var, xmu0 xmu0Var, RetrofitMaker retrofitMaker, zwz0 zwz0Var, wh71 wh71Var, ol71 ol71Var, boolean z, q8n q8nVar, g2z g2zVar, bhf bhfVar) {
        this.b = context;
        this.c = zidVar;
        this.a = lidVar;
        this.d = xmu0Var;
        this.e = retrofitMaker;
    }

    public tjq(l3q l3qVar, qop qopVar, gl90 gl90Var) {
        this.b = gl90Var;
        this.c = qopVar;
        this.d = l3qVar;
        byte b = 7;
        this.a = iy81.a(new jxp(this, 1, b));
        this.e = new jxp(this, 0, b);
    }

    public /* synthetic */ tjq(ViewGroup viewGroup, ViewGroup viewGroup2, View view, View view2, View view3, ViewGroup viewGroup3) {
        this.b = viewGroup2;
        this.c = view;
        this.a = view2;
        this.d = view3;
        this.e = viewGroup3;
    }

    public tjq(daq daqVar, WazeReturnActivity wazeReturnActivity) {
        this.c = daqVar;
        this.b = wazeReturnActivity;
        byte b = 9;
        this.a = xqu.b(new obq(daqVar, this, 2, b));
        this.d = xqu.b(new obq(daqVar, this, 1, b));
        this.e = new obq(daqVar, this, 0, b);
    }
}
