package p;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mxr implements mod1, SingleOnSubscribe, Function {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public mxr(Context context, LayoutInflater layoutInflater, hwa1 hwa1Var, bgx bgxVar, mxr mxrVar, fp7 fp7Var) {
        this.a = mxrVar;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626187, (ViewGroup) null, false);
        int i = 2131428077;
        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131428077);
        if (recyclerViewT != null) {
            i = 2131429075;
            ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131429075);
            if (imageView != null) {
                i = 2131431356;
                if (((TextView) m5n1.t(constraintLayoutInflate, 2131431356)) != null) {
                    i = 2131431362;
                    View viewT = m5n1.t(constraintLayoutInflate, 2131431362);
                    if (viewT != null) {
                        i = 2131431693;
                        FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431693);
                        if (frameLayout != null) {
                            this.b = new yt91(constraintLayoutInflate, recyclerViewT, imageView, viewT, frameLayout);
                            wyr wyrVarA = bgxVar.a(hwa1Var.a);
                            frameLayout.addView(((knl1) ((idd1) wyrVarA.e).getValue()).a);
                            this.c = wyrVarA;
                            wyrVarA.c = new vas(this, (byte) 18);
                            an anVar = new an(hwa1Var.b, new lss(fp7Var, (byte) 2));
                            anVar.g = new qmr(this, (byte) 11);
                            recyclerViewT.setAdapter(anVar);
                            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
                            if (flexboxLayoutManager.S0 != 2) {
                                flexboxLayoutManager.S0 = (byte) 2;
                                flexboxLayoutManager.F0();
                            }
                            flexboxLayoutManager.k1(2);
                            flexboxLayoutManager.l1(0);
                            flexboxLayoutManager.m1(1);
                            recyclerViewT.setLayoutManager(flexboxLayoutManager);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static zws j(qyu qyuVar, qma qmaVar, boolean z) {
        zws zwsVar = qwu.p;
        zwsVar.getClass();
        yws ywsVar = new yws(zwsVar);
        int i = qyuVar.b;
        if (i <= 0) {
            ((j0g1) ywsVar).d = qyuVar.a;
        } else if (z) {
            ((j0g1) ywsVar).a = i;
            ((j0g1) ywsVar).b = Integer.MAX_VALUE;
        } else {
            ((j0g1) ywsVar).a = Integer.MAX_VALUE;
            ((j0g1) ywsVar).b = i;
        }
        if (qmaVar.E1) {
            ((j0g1) ywsVar).m = b380.q(new String[]{"video/av01", "video/avc"});
        } else {
            ((j0g1) ywsVar).m = b380.q(new String[]{"video/avc"});
        }
        if (qmaVar.C1) {
            ywsVar.m();
        }
        ((j0g1) ywsVar).G = true;
        return new zws(ywsVar);
    }

    public void A(qwu qwuVar, boolean z) {
        int i;
        mxr mxrVar = (mxr) this.b;
        qyu qyuVar = (qyu) this.a;
        if (qyuVar.b > 0 && z) {
            mxrVar.getClass();
            int iC = qwuVar.c();
            loop0: for (int i2 = 0; i2 < iC; i2++) {
                qwuVar.b();
                kqg0 kqg0Var = qwuVar.m[i2];
                int i3 = kqg0Var.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (kqg0Var.b[i4] == 2) {
                        qnf1 qnf1Var = kqg0Var.c[i4];
                        int i5 = qnf1Var.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            pnf1 pnf1VarA = qnf1Var.a(i6);
                            int i7 = pnf1VarA.a;
                            for (int i8 = 0; i8 < i7; i8++) {
                                ie30 ie30Var = pnf1VarA.d[i8];
                                int i9 = ie30Var.w;
                                if (i9 > 0 && (i = ie30Var.x) > 0) {
                                    if (i <= i9) {
                                        break loop0;
                                    }
                                    zws zwsVarJ = j(qyuVar, (qma) this.c, true);
                                    int iC2 = qwuVar.c();
                                    for (int i10 = 0; i10 < iC2; i10++) {
                                        try {
                                            qwuVar.b();
                                            qwuVar.b();
                                            for (int i11 = 0; i11 < ((jca[]) qwuVar.e.b).length; i11++) {
                                                qwuVar.n[i10][i11].clear();
                                            }
                                            qwuVar.a(i10, zwsVarJ);
                                        } catch (ExoPlaybackException e) {
                                            bhn0.p(e);
                                            return;
                                        }
                                    }
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
        }
        ((SingleEmitter) this.d).onSuccess(new rwu(qwuVar));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(tv80 tv80Var, String str, bca0 bca0Var, onm onmVar) {
        f5s f5sVar;
        if (onmVar instanceof f5s) {
            f5sVar = (f5s) onmVar;
            int i = f5sVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f5sVar.e = i - Integer.MIN_VALUE;
            } else {
                f5sVar = new f5s(this, onmVar);
            }
        } else {
            f5sVar = new f5s(this, onmVar);
        }
        Object objJ = f5sVar.c;
        int i2 = f5sVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            if (bca0Var.a.b == xea0.X && bca0Var.c.contains(ko90.e)) {
                f5sVar.a = null;
                f5sVar.b = null;
                f5sVar.e = 1;
                if (C(tv80Var, bca0Var, f5sVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
            pp90 pp90Var = (pp90) ((c9c0) this.a).b.current().getValue();
            Object eooVar = pp90Var == null ? foo.a : new eoo(pp90Var.h.b.e);
            if (eooVar instanceof foo) {
                f5sVar.a = null;
                f5sVar.b = null;
                f5sVar.e = 2;
                if (C(tv80Var, bca0Var, f5sVar) != d9nVar) {
                    return rih1Var;
                }
            } else {
                if (!(eooVar instanceof eoo)) {
                    eg.o();
                    return null;
                }
                ezc ezcVarG = yoi1.g(((z1s) this.c).i.doOnSubscribe(new y43(this, tv80Var, (eoo) eooVar, str)));
                eum eumVar = new eum(tv80Var, (lnm) null, (byte) 19);
                f5sVar.a = tv80Var;
                f5sVar.b = bca0Var;
                f5sVar.e = 3;
                objJ = b5p1.j(ezcVarG, eumVar, f5sVar);
                if (objJ != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objJ);
            return rih1Var;
        }
        if (i2 == 2) {
            hm5.M(objJ);
            return rih1Var;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                hm5.M(objJ);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bca0Var = f5sVar.b;
        tv80Var = f5sVar.a;
        hm5.M(objJ);
        lj70 lj70Var = (lj70) objJ;
        if (lj70Var instanceof jj70) {
            f5sVar.a = null;
            f5sVar.b = null;
            f5sVar.e = 4;
            if (C(tv80Var, bca0Var, f5sVar) == d9nVar) {
                return d9nVar;
            }
        } else if (!(lj70Var instanceof ij70) && !(lj70Var instanceof kj70)) {
            eg.o();
            return null;
        }
        return rih1Var;
    }

    public Object C(tv80 tv80Var, cca0 cca0Var, f5s f5sVar) {
        Object objY = fn31.Y((q8n) this.d, new zlo(this, tv80Var, cca0Var, (lnm) null, (byte) 11), f5sVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(String str, uio uioVar, boolean z, onm onmVar) throws Throwable {
        nms nmsVar;
        List m231Var;
        List list;
        iio iioVar;
        if (onmVar instanceof nms) {
            nmsVar = (nms) onmVar;
            int i = nmsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nmsVar.d = i - Integer.MIN_VALUE;
            } else {
                nmsVar = new nms(this, onmVar);
            }
        } else {
            nmsVar = new nms(this, onmVar);
        }
        Object objM = nmsVar.b;
        int i2 = nmsVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                if (!z && ((ol4) ((el3) this.b).a.getValue()).c()) {
                    if (!((uioVar != null ? uioVar.b : null) instanceof pio)) {
                        nmsVar.a = str;
                        nmsVar.d = 1;
                        objM = m(str, uioVar, nmsVar);
                        Object obj = d9n.a;
                        if (objM == obj) {
                            return obj;
                        }
                    }
                }
                return jms.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = nmsVar.a;
            hm5.M(objM);
            m231Var = (List) objM;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            list = m231Var;
        } else {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            Logger.l(thA, "DefaultSaveLocationCurationHandlerImpl: failed to resolve %s", new Object[]{str});
            list = z6x.a;
        }
        if (!list.isEmpty()) {
            List<dk3> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (dk3 dk3Var : list2) {
                if (dk3Var instanceof ck3) {
                    iioVar = new iio(((ck3) dk3Var).a);
                } else {
                    if (!(dk3Var instanceof bk3)) {
                        eg.o();
                        return null;
                    }
                    iioVar = gio.a;
                }
                arrayList.add(iioVar);
            }
            return new ims(new hio(arrayList));
        }
        return jms.a;
    }

    public Completable E() {
        return ((Observable) ((iir) this.a).c).observeOn((Scheduler) this.d).switchMapSingle(new wcr((h9n) this.b, (byte) 13)).map(new xap((zfr) this.c, (byte) 15)).ignoreElements();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object F(boolean z, m551 m551Var, onm onmVar) {
        d4u d4uVar;
        Activity activity = (Activity) this.a;
        if (onmVar instanceof d4u) {
            d4uVar = (d4u) onmVar;
            int i = d4uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4uVar.c = i - Integer.MIN_VALUE;
            } else {
                d4uVar = new d4u(this, onmVar);
            }
        } else {
            d4uVar = new d4u(this, onmVar);
        }
        Object objY = d4uVar.a;
        int i2 = d4uVar.c;
        if (i2 == 0) {
            hm5.M(objY);
            mw40 mw40VarT = yoi1.T(((nw40) this.c).a, activity.getString(2131955202), activity.getString(2131955201));
            String string = z ? activity.getString(2131955209) : activity.getString(2131955207);
            wzk wzkVar = new wzk(m551Var, (byte) 2);
            mw40VarT.a = string;
            mw40VarT.c = wzkVar;
            String string2 = activity.getString(2131955208);
            k6b k6bVar = k6b.d;
            mw40VarT.b = string2;
            mw40VarT.d = k6bVar;
            q8n q8nVar = (q8n) this.d;
            n3s n3sVar = new n3s(mw40VarT, (lnm) null, (byte) 6);
            d4uVar.c = 1;
            objY = fn31.Y(q8nVar, n3sVar, d4uVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object G(boolean z, nn61 nn61Var, onm onmVar) {
        e4u e4uVar;
        Activity activity = (Activity) this.a;
        if (onmVar instanceof e4u) {
            e4uVar = (e4u) onmVar;
            int i = e4uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4uVar.c = i - Integer.MIN_VALUE;
            } else {
                e4uVar = new e4u(this, onmVar);
            }
        } else {
            e4uVar = new e4u(this, onmVar);
        }
        Object objY = e4uVar.a;
        int i2 = e4uVar.c;
        if (i2 == 0) {
            hm5.M(objY);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, 5);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (activity.getPackageManager() != null && activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                arrayList.add(activity.getString(2131955205));
                arrayList2.add(new f4u(nn61Var, this));
            }
            arrayList.add(activity.getString(2131955203));
            arrayList2.add(new nx30(nn61Var, this, (byte) 19));
            if (z) {
                arrayList.add(activity.getString(2131955204));
                arrayList2.add(new f4u(this, nn61Var));
            }
            builder.setTitle(2131955206);
            builder.setItems((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) new oad(arrayList2, (byte) 13)).setOnCancelListener(new mn5(this, nn61Var, (byte) 9));
            q8n q8nVar = (q8n) this.d;
            n3s n3sVar = new n3s(builder, (lnm) null, (byte) 7);
            e4uVar.c = 1;
            objY = fn31.Y(q8nVar, n3sVar, e4uVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }

    public lt20 H(String str, String str2) {
        return new lt20(new ipr(rqt0.u(new qer(h5p1.s(new ld2(((c9c0) this.a).b.current(), str, (byte) 20), new ld2(((vcd0) this.b).k(Collections.singletonList(str)), str, (byte) 21), new x68(d5p1.h(((vu60) this.c).e), str, (byte) 2), e5s.h), str2, (byte) 20)), this, str, (byte) 1), new re1(3, null, (byte) 18), (byte) 0);
    }

    public void a(t681 t681Var, b0k b0kVar, int i) {
        a681 z581Var;
        a681 a681Var;
        c681 c681Var = (c681) this.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(594813171);
        int i2 = (x340Var.i(t681Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(t681Var, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zG = x340Var.g((eg40) this.b) | x340Var.g(c681Var) | x340Var.g((p681) this.c) | x340Var.g(c9nVar);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new ngs0((z6c) c681Var.b, new m3n(ven0VarS, c9nVar, this, (byte) 10));
                x340Var.s0(objT2);
            }
            xpw xpwVar = (xpw) objT2;
            nl51 nl51Var = (nl51) this.d;
            if (t681Var.equals(r681.a)) {
                a681Var = a681.a;
            } else {
                if (t681Var instanceof s681) {
                    List list = ((s681) t681Var).a;
                    z581Var = new z581(d9p1.r(nl51Var.d(list, true ^ list.isEmpty())));
                } else {
                    if (!(t681Var instanceof q681)) {
                        eg.o();
                        return;
                    }
                    z581Var = new z581(d9p1.r(nl51Var.d(((q681) t681Var).a, true)));
                }
                a681Var = z581Var;
            }
            otw.c(xpwVar, new y581(a681Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g1o(this, t681Var, i, (byte) 21);
        }
    }

    public Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return CompletableEmpty.a;
        }
        xyu xyuVar = (xyu) this.a;
        return new CompletableFromAction(new lig((String) this.b, (String) this.c, (tv80) this.d, xyuVar)).s(xyuVar.f);
    }

    public View b(ViewGroup viewGroup, jto jtoVar, iu30 iu30Var, iu30 iu30Var2, boolean z, Function0 function0, qwc1 qwc1Var) {
        ViewPager2 viewPager2;
        int i;
        lvc1 lvc1Var;
        ArrayList arrayList = jtoVar.a;
        kdn0 kdn0Var = jtoVar.b;
        iu30 iu30Var3 = jtoVar.c;
        int i2 = jtoVar.d;
        iac0 iac0VarH = x9p1.h(viewGroup);
        if (iac0VarH == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        lvc1 lvc1VarB = lvc1.B(LayoutInflater.from(viewGroup.getContext()));
        ViewPager2 viewPager3 = (ViewPager2) lvc1VarB.d;
        nxr nxrVar = new nxr(this, viewGroup, (byte) 24);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            arrayList2.add(new ubd1(new pgr(new rm5(new zun(viewGroup, (byte) 1), (byte) 13), true)));
            i3++;
            i2 = i2;
            lvc1VarB = lvc1VarB;
            arrayList = arrayList;
        }
        int i4 = i2;
        lvc1 lvc1Var2 = lvc1VarB;
        ArrayList arrayList3 = arrayList;
        ne neVar = new ne(3, new nod1(arrayList3, viewGroup, (twa) this.a, iu30Var, function0, new i4o(this, (byte) 24), z, arrayList2, new yts(this, (byte) 1)));
        lap1.p(viewPager3, (h3h1) null);
        l4o1.e0(viewPager3, (iu30) neVar.c, (nzb0) neVar.d);
        viewPager3.setOffscreenPageLimit(5);
        z511 adapter = viewPager3.getAdapter();
        if (adapter != null) {
            ib5 ib5Var = new ib5(arrayList3, (byte) 11);
            viewPager2 = viewPager3;
            vts vtsVar = new vts(this, lvc1Var2, arrayList3, i4, nxrVar, qwc1Var, iu30Var3);
            lvc1Var = lvc1Var2;
            i = i4;
            hyo1.p(vtsVar, ib5Var, adapter);
        } else {
            viewPager2 = viewPager3;
            i = i4;
            lvc1Var = lvc1Var2;
        }
        viewPager2.b(new wts(qwc1Var, this, arrayList3, viewGroup, arrayList2));
        xts xtsVar = new xts(this, lvc1Var, i, (byte) 0);
        p811 p811Var = new p811();
        zjr zjrVar = new zjr(xtsVar, kdn0Var, p811Var, (byte) 3);
        p811Var.a = zjrVar;
        kdn0Var.f(iac0VarH, zjrVar);
        iu30Var.invoke(new yts(this, (byte) 0));
        iu30Var2.invoke(new xts(this, lvc1Var, i, (byte) 1));
        return (LinearLayout) lvc1Var.b;
    }

    public void c(jwm1 jwm1Var, upb0 upb0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-726901562);
        int i2 = i | (x340Var.g(jwm1Var) ? 4 : 2) | (x340Var.g(upb0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                kns knsVar = new kns(iu30Var, ((Boolean) ((ovq) ((mvq) this.d).a.c).b.e.get()).booleanValue());
                x340Var.s0(knsVar);
                objT = knsVar;
            }
            mod.b(oi7.a.a((gw70) this.a), apo.r(1018806662, new p1t((kns) objT, jwm1Var, this, qim0Var, upb0Var, iu30Var, (byte) 2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 19, i, this, jwm1Var, upb0Var, iu30Var, qim0Var);
        }
    }

    public void d(View view, View view2) {
        jv81 jv81Var = (jv81) this.b;
        if (!jv81Var.containsKey(view) || !jv81Var.containsKey(view2)) {
            hhg1.n("All nodes must be present in the graph before being added as an edge");
            return;
        }
        ArrayList arrayList = (ArrayList) jv81Var.get(view);
        if (arrayList == null) {
            ArrayList arrayList2 = (ArrayList) ((up20) this.a).a();
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList = arrayList2;
            jv81Var.put(view, arrayList);
        }
        arrayList.add(view2);
    }

    public void e(View view) {
        jv81 jv81Var = (jv81) this.b;
        if (jv81Var.containsKey(view)) {
            return;
        }
        jv81Var.put(view, (Object) null);
    }

    public void f() {
        jv81 jv81Var = (jv81) this.b;
        int i = jv81Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) jv81Var.i(i2);
            if (arrayList != null) {
                arrayList.clear();
                ((up20) this.a).i(arrayList);
            }
        }
        jv81Var.clear();
    }

    public boolean g(View view) {
        return ((jv81) this.b).containsKey(view);
    }

    public Single h(swu swuVar, qyu qyuVar) {
        Object next;
        qma qmaVarA = ((rma) this.d).a();
        Iterator it = ((wna) this.c).a((l270) this.b, qmaVarA).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((anh0) next).c(swuVar));
        anh0 anh0Var = (anh0) next;
        if (anh0Var == null) {
            return Single.error(new Exception(l1d.m("No media extension for downloading ", swuVar.a.a)));
        }
        qba qbaVarA = anh0Var.a(swuVar, (bpa) null, (gxu) null, new ekb((byte) 8), (yeg1) null);
        zws zwsVarJ = j(qyuVar, qmaVarA, false);
        koh0 koh0Var = new koh0();
        koh0Var.c = pze0.d(anh0Var.getType());
        koh0Var.c(anh0Var.b(swuVar));
        yoh0 yoh0VarA = koh0Var.a();
        ojs ojsVar = new ojs((Context) this.a);
        ojsVar.c = true;
        return Single.create(new mxr(new qwu(yoh0VarA, qbaVarA, zwsVarJ, new wcr(ojsVar.b(zoi1.s((Handler.Callback) null), new twa(), new jxa((byte) 7), new ofr((byte) 18), new ofr((byte) 19)))), qyuVar, this, qmaVarA));
    }

    public jhm i(String str, String str2) {
        return new jhm("list_remove_item", cmx.c, (fhm) null, 2131954355, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.f, z6t.g), new ggh(str, this, str2, new fjl0(r6h1.c, (byte) 7), (byte) 20)), 244);
    }

    public jhm k(String str) {
        i6c i6cVar = (i6c) this.a;
        return new jhm("song_dna_track", osx.c, (fhm) null, 2131962697, (String) null, false, new tm81(0, 10, "song_dna_track", (iu30) null, true), new ihm(ahm.c, new ghm(uyf1.T0, new ysf1(str, (byte) 5)), new rzf1(i6cVar, str, (byte) 1)), 84);
    }

    public void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            jah.g("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((jv81) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                l(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, uio uioVar, onm onmVar) {
        lms lmsVar;
        ak3 ak3Var;
        List list;
        Object objN;
        if (onmVar instanceof lms) {
            lmsVar = (lms) onmVar;
            int i = lmsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmsVar.d = i - Integer.MIN_VALUE;
            } else {
                lmsVar = new lms(this, onmVar);
            }
        } else {
            lmsVar = new lms(this, onmVar);
        }
        Object objB = lmsVar.b;
        int i2 = lmsVar.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            j6g1 j6g1Var = (j6g1) this.c;
            lmsVar.d = 1;
            objB = j6g1Var.b(str, uioVar, lmsVar);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objB);
                    return objB;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ak3Var = lmsVar.a;
            hm5.M(objB);
        }
        list = (List) objB;
        if (((el3) this.b).a()) {
            return list;
        }
        lmsVar.a = null;
        lmsVar.d = 3;
        objN = n(list, ak3Var, lmsVar);
        if (objN != obj) {
            return obj;
        }
        return objN;
        ak3Var = (ak3) objB;
        if (ak3Var == null) {
            return z6x.a;
        }
        mr20 mr20VarN = ((bl3) this.a).n(ak3Var);
        lmsVar.a = ak3Var;
        lmsVar.d = 2;
        objB = b5p1.i(mr20VarN, lmsVar);
        if (objB != obj) {
            list = (List) objB;
            if (((el3) this.b).a()) {
                return list;
            }
            lmsVar.a = null;
            lmsVar.d = 3;
            objN = n(list, ak3Var, lmsVar);
            if (objN != obj) {
                return objN;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0067 -> B:34:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:33:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0069
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object n(java.util.List r12, p.ak3 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.mms
            if (r0 == 0) goto L13
            r0 = r14
            p.mms r0 = (p.mms) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            p.mms r0 = new p.mms
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.g
            int r1 = r0.i
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L3c
            if (r1 != r4) goto L36
            int r12 = r0.f
            int r13 = r0.e
            int r1 = r0.d
            java.lang.Object r5 = r0.c
            java.util.Iterator r6 = r0.b
            java.util.Collection r7 = r0.a
            java.util.Collection r7 = (java.util.Collection) r7
            p.hm5.M(r14)
            goto L94
        L36:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r2
        L3c:
            p.hm5.M(r14)
            p.ak3 r14 = p.ak3.c
            if (r13 != r14) goto L45
            r13 = r4
            goto L46
        L45:
            r13 = r3
        L46:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
            r6 = r12
            r1 = r13
            r7 = r14
            r12 = r3
            r13 = r12
        L56:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto La4
            java.lang.Object r5 = r6.next()
            r14 = r5
            p.dk3 r14 = (p.dk3) r14
            boolean r8 = r14 instanceof p.bk3
            if (r8 == 0) goto L69
            r14 = r4
            goto L9a
        L69:
            boolean r8 = r14 instanceof p.ck3
            if (r8 == 0) goto La0
            java.lang.Object r8 = r11.d
            p.thu0 r8 = (p.thu0) r8
            p.ck3 r14 = (p.ck3) r14
            java.lang.String r14 = r14.a
            if (r1 == 0) goto L79
            r9 = r4
            goto L7a
        L79:
            r9 = r3
        L7a:
            r10 = r7
            java.util.Collection r10 = (java.util.Collection) r10
            r0.a = r10
            r0.b = r6
            r0.c = r5
            r0.d = r1
            r0.e = r13
            r0.f = r12
            r0.i = r4
            java.io.Serializable r14 = r8.a(r14, r0, r9)
            p.d9n r8 = p.d9n.a
            if (r14 != r8) goto L94
            return r8
        L94:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
        L9a:
            if (r14 == 0) goto L56
            r7.add(r5)
            goto L56
        La0:
            p.eg.o()
            return r2
        La4:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mxr.n(java.util.List, p.ak3, p.onm):java.lang.Object");
    }

    public List o(View view) {
        return (List) ((jv81) this.b).get(view);
    }

    public ArrayList p(View view) {
        jv81 jv81Var = (jv81) this.b;
        int i = jv81Var.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) jv81Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jv81Var.f(i2));
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.clear();
        HashSet hashSet = (HashSet) this.d;
        hashSet.clear();
        jv81 jv81Var = (jv81) this.b;
        int i = jv81Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            l(jv81Var.f(i2), arrayList, hashSet);
        }
        return arrayList;
    }

    public ConstraintLayout r() {
        return (ConstraintLayout) ((yt91) this.b).b;
    }

    public boolean s(View view) {
        jv81 jv81Var = (jv81) this.b;
        int i = jv81Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) jv81Var.i(i2);
            if (arrayList != null && arrayList.contains(view)) {
                return true;
            }
        }
        return false;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        qwu qwuVar = (qwu) this.a;
        mxr mxrVar = new mxr((qyu) this.b, (mxr) this.c, (qma) this.d, singleEmitter);
        dm5.y(qwuVar.j == null);
        qwuVar.j = mxrVar;
        if (qwuVar.c == 0) {
            qwuVar.g.post(new e0i(qwuVar, mxrVar, (byte) 22));
            return;
        }
        qba qbaVar = qwuVar.b;
        qbaVar.getClass();
        qwuVar.k = new pwu(qbaVar, qwuVar);
    }

    public void t() {
        ((ImageView) ((yt91) this.b).c).setVisibility(8);
    }

    public boolean u(Calendar calendar) {
        int i = calendar.get(0);
        Calendar calendar2 = (Calendar) this.a;
        return i == calendar2.get(0) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(wea1 wea1Var, onm onmVar) {
        qrs qrsVar;
        if (onmVar instanceof qrs) {
            qrsVar = (qrs) onmVar;
            int i = qrsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qrsVar.d = i - Integer.MIN_VALUE;
            } else {
                qrsVar = new qrs(this, onmVar);
            }
        } else {
            qrsVar = new qrs(this, onmVar);
        }
        Object objX = qrsVar.b;
        int i2 = qrsVar.d;
        if (i2 == 0) {
            hm5.M(objX);
            qrsVar.a = this;
            qrsVar.d = 1;
            objX = x(wea1Var, qrsVar);
            d9n d9nVar = d9n.a;
            if (objX == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = qrsVar.a;
            hm5.M(objX);
        }
        sea1 sea1Var = (sea1) objX;
        Context context = (Context) this.d;
        f0a f0aVar = new f0a();
        f0aVar.b = sea1Var.a;
        Uri uri = sea1Var.c;
        jlw0 jlw0Var = uri != null ? new jlw0(uri, context.getString(2131962760, 1)) : null;
        Uri uri2 = sea1Var.d;
        jlw0 jlw0Var2 = uri2 != null ? new jlw0(uri2, context.getString(2131962760, 2)) : null;
        int iG = z4p1.G(u7h.b);
        List listI0 = f46.i0(new llw0[]{jlw0Var, jlw0Var2, new ilw0(iG, iG, context.getString(2131962760, 3))});
        ArrayList arrayList = (ArrayList) f0aVar.g;
        arrayList.clear();
        arrayList.addAll(listI0);
        f0aVar.i = new jlw0(sea1Var.b, context.getString(2131962762));
        f0aVar.X = new pz9(sz9.a, "SongDNA", (String) null, 60);
        f0aVar.h = tyo1.p(blc0.Bg, new String[0]);
        return Collections.singletonList(f0aVar.p());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(wea1 wea1Var, onm onmVar) {
        rrs rrsVar;
        List listM;
        List list;
        mq70 mq70Var;
        pp70 pp70Var;
        if (onmVar instanceof rrs) {
            rrsVar = (rrs) onmVar;
            int i = rrsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rrsVar.d = i - Integer.MIN_VALUE;
            } else {
                rrsVar = new rrs(this, onmVar);
            }
        } else {
            rrsVar = new rrs(this, onmVar);
        }
        Object objL = rrsVar.b;
        int i2 = rrsVar.d;
        if (i2 == 0) {
            hm5.M(objL);
            if (wea1Var instanceof vea1) {
                listM = Collections.singletonList(((vea1) wea1Var).a);
            } else if (wea1Var instanceof tea1) {
                listM = Collections.singletonList(((tea1) wea1Var).a);
            } else {
                if (!(wea1Var instanceof uea1)) {
                    eg.o();
                    return null;
                }
                uea1 uea1Var = (uea1) wea1Var;
                listM = p7h.M(new String[]{uea1Var.a, uea1Var.b});
            }
            rcy rcyVar = (rcy) this.c;
            s6 s6Var = new s6(listM, (byte) 22);
            rrsVar.a = listM;
            rrsVar.d = 1;
            objL = fc11.l(rcyVar.a.b(new oi("song_dna_share_menu_loader", false, s6Var)).filter(ios.d1), 2, (Object) null, rrsVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
            list = listM;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = rrsVar.a;
            hm5.M(objL);
        }
        uv00 uv00Var = (uv00) objL;
        if (uv00Var != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xkk1 xkk1Var = uv00Var.a(xkk1.class, (String) it.next()).b;
                u7h u7hVar = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) ? null : new u7h(pp70Var.c.a.b.a());
                if (u7hVar != null) {
                    return u7hVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(wea1 wea1Var, onm onmVar) {
        srs srsVar;
        prs prsVar;
        String strH;
        if (onmVar instanceof srs) {
            srsVar = (srs) onmVar;
            int i = srsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                srsVar.e = i - Integer.MIN_VALUE;
            } else {
                srsVar = new srs(this, onmVar);
            }
        } else {
            srsVar = new srs(this, onmVar);
        }
        Object objH = srsVar.c;
        int i2 = srsVar.e;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            ae1 ae1Var = new ae1(this, wea1Var, lnmVar, (byte) 7);
            srsVar.a = wea1Var;
            srsVar.e = 1;
            objH = guo1.H(ae1Var, srsVar);
            if (objH != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            wea1Var = srsVar.a;
            hm5.M(objH);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            prsVar = srsVar.b;
            wea1Var = srsVar.a;
            hm5.M(objH);
        }
        ay9 ay9Var = (ay9) objH;
        if (wea1Var instanceof vea1) {
            strH = ((vea1) wea1Var).a.concat(":dna");
        } else if (wea1Var instanceof tea1) {
            strH = ((tea1) wea1Var).a.concat(":dna");
        } else {
            if (wea1Var instanceof uea1) {
                eg.o();
                return null;
            }
            uea1 uea1Var = (uea1) wea1Var;
            strH = gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(uea1Var.a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(uea1Var.b, new String[]{":"}, 0, 6)));
        }
        return new sea1(strH, prsVar.a, ay9Var.a, ay9Var.b);
        prs prsVar2 = (prs) objH;
        q59 q59Var = (q59) this.b;
        by9 by9Var = prsVar2.c;
        u7h u7hVar = prsVar2.b;
        srsVar.a = wea1Var;
        srsVar.b = prsVar2;
        srsVar.e = 2;
        Object ay9Var2 = u7hVar == null ? new ay9(null, null) : guo1.H(new nx(u7hVar, q59Var, by9Var, (lnm) null), srsVar);
        if (ay9Var2 != d9nVar) {
            objH = ay9Var2;
            prsVar = prsVar2;
            ay9 ay9Var3 = (ay9) objH;
            if (wea1Var instanceof vea1) {
                strH = ((vea1) wea1Var).a.concat(":dna");
            } else if (wea1Var instanceof tea1) {
                strH = ((tea1) wea1Var).a.concat(":dna");
            } else {
                if (wea1Var instanceof uea1) {
                    eg.o();
                    return null;
                }
                uea1 uea1Var2 = (uea1) wea1Var;
                strH = gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(uea1Var2.a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(uea1Var2.b, new String[]{":"}, 0, 6)));
            }
            return new sea1(strH, prsVar.a, ay9Var3.a, ay9Var3.b);
        }
        return d9nVar;
    }

    public void y() {
        ((UnicastProcessor) this.d).onNext(new uss(this, (byte) 0));
    }

    public void z() {
        if (!((azs) this.d).w) {
            ((roj1) this.c).f(new tys((azs) this.d, (byte) 0), true);
        } else {
            ((Executor) this.a).execute(new fss((uoj1) this.b, (byte) 6));
            x8r.a();
        }
    }

    public mxr(Context context, Calendar calendar) {
        this.a = calendar;
        this.b = new SimpleDateFormat("EEE", Locale.getDefault());
        this.c = new SimpleDateFormat("d MMM", Locale.getDefault());
        this.d = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
    }

    public mxr(hcx0 hcx0Var, icx0 icx0Var, fp8 fp8Var, jqd0 jqd0Var, xaz0 xaz0Var, qpj1 qpj1Var) {
        this.a = fp8Var;
        this.b = jqd0Var;
        this.c = xaz0Var;
        this.d = qpj1Var;
    }

    public mxr(Flowable flowable, iac0 iac0Var, i8h1 i8h1Var, wqk0 wqk0Var, Scheduler scheduler) {
        this.a = i8h1Var;
        this.b = wqk0Var;
        this.c = scheduler;
        UnicastProcessor unicastProcessor = new UnicastProcessor(Flowable.a);
        this.d = unicastProcessor;
        unicastProcessor.L(scheduler).C(new rjn(new FlowableCreate(new vun(iac0Var, (byte) 21), BackpressureStrategy.d).X(new hur(flowable, this, (byte) 19)), (byte) 20), false, Integer.MAX_VALUE).subscribe(fcc.Z0, fcc.a1);
    }

    public mxr(c681 c681Var, eg40 eg40Var, p681 p681Var) {
        this.a = c681Var;
        this.b = eg40Var;
        this.c = p681Var;
        this.d = new nl51((byte) 9);
    }

    public mxr(l78 l78Var, i1r0 i1r0Var, Scheduler scheduler) {
        this.a = l78Var;
        this.b = i1r0Var;
        this.c = scheduler;
    }

    public mxr() {
        this.a = new up20(10, (byte) 3);
        this.b = new jv81(0);
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public /* synthetic */ mxr(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public mxr(twa twaVar) {
        this.a = twaVar;
        this.d = null;
    }

    public mxr(wht whtVar) {
        this.d = whtVar;
        List list = whtVar.e.T0;
        int iS = zno1.s(q7h.U(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : list) {
            linkedHashMap.put(dem1.y((zjn0) whtVar.Y.c, ((tfy0) obj).d), obj);
        }
        this.a = linkedHashMap;
        wht whtVar2 = (wht) this.d;
        this.b = ((s1c1) ((ks6) whtVar2.Y.b).a).b(new da(this, whtVar2, (byte) 18));
        voe0 voe0Var = (s1c1) ((ks6) ((wht) this.d).Y.b).a;
        ka kaVar = new ka(this, (byte) 26);
        voe0 voe0Var2 = voe0Var;
        voe0Var2.getClass();
        this.c = new toe0(voe0Var2, kaVar);
    }

    public mxr(azs azsVar, Executor executor, uoj1 uoj1Var, roj1 roj1Var, bg21 bg21Var) {
        this.d = azsVar;
        this.a = executor;
        this.b = uoj1Var;
        this.c = roj1Var;
    }
}
