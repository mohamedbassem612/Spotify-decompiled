package p;

import android.content.Context;
import android.os.Environment;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase_Impl;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase_Impl;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cc00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc00(n830 n830Var, int i) {
        super(0);
        this.a = (byte) 10;
        this.b = n830Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new ue00((EventSenderDatabase_Impl) obj);
            case 1:
                tj00 tj00Var = (tj00) obj;
                tp60 tp60Var = tj00Var.g;
                qj00 qj00Var = tj00Var.X;
                iac0 iac0Var = tj00Var.t;
                kq60 kq60Var = kq60.R0;
                tp60Var.g(kq60Var);
                ml00 ml00Var = tj00Var.f;
                ml00Var.g = false;
                Set set = ml00Var.e;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((hs80) it.next()).start();
                }
                ku71 ku71Var = ml00Var.f;
                bpb1 bpb1Var = ku71Var.c;
                if (((Map) bpb1Var.getValue()).isEmpty()) {
                    String strE = ku71Var.a.e(ku71.d, "");
                    Map mapA = b7x.a;
                    if (strE != null && strE.length() != 0) {
                        try {
                            mapA = ((ju71) ku71Var.b.a(strE, ju71.Companion.serializer())).a();
                        } catch (SerializationException e) {
                            Logger.e(e, "Unexpected json format", new Object[0]);
                        } catch (IOException e2) {
                            Logger.e(e2, "Exception while reading the json string", new Object[0]);
                        }
                    }
                    bpb1Var.l(mapA);
                    break;
                }
                rzo0 rzo0Var = new rzo0(tj00Var.N0.a, iac0Var);
                Set set2 = set;
                kko kkoVarB = ((mko) o7h.q0(o7h.n0(set2, mko.class))).b();
                MobiusLoop mobiusLoop = ((kj00) o7h.q0(o7h.n0(set2, kj00.class))).b;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                bpb1 bpb1VarL = aym.l(mobiusLoop);
                mwn mwnVar = (mwn) o7h.q0(o7h.n0(set2, mwn.class));
                qj00Var.e(new xk00(kkoVarB, bpb1VarL, mwnVar, tj00Var, ml00Var.a, ml00Var.b, ml00Var.c, ml00Var.d, (flv0) o7h.q0(o7h.n0(set2, flv0.class)), (nvn) o7h.q0(o7h.n0(set2, nvn.class)), rzo0Var, ((ll00) o7h.q0(o7h.n0(set2, ll00.class))).a()), new pdy(tj00Var, (byte) 22), tj00Var.i.a.path());
                t5p1.j(qj00Var.a(), 3).f(iac0Var, new z11(tj00Var, (byte) 14));
                tp60Var.p(kq60Var);
                tj00Var.h.k();
                rj00 rj00Var = new rj00(tj00Var);
                tj00Var.X0 = rj00Var;
                iac0Var.getLifecycle().a(rj00Var);
                return rih1Var;
            case 2:
                return new xgx0(((kv01) obj).a, 2);
            case 3:
                el00 el00Var = (el00) obj;
                tp60 tp60Var2 = el00Var.g;
                tp60Var2.k(el00Var.c.Z0);
                tp60Var2.p(kq60.N0);
                tp60Var2.g(kq60.O0);
                return rih1Var;
            case 4:
                ((RecyclerView) obj).y0(0);
                return rih1Var;
            case 5:
                Context context = ((kf10) obj).a;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            case 6:
                zm10 zm10Var = (zm10) obj;
                zm10Var.c.i();
                zm10Var.d.a();
                return rih1Var;
            case 7:
                m020 m020Var = (m020) obj;
                luk lukVarA = m020.a(m020Var);
                if (lukVarA != null) {
                    return lukVarA.e(new d26(m020Var, (byte) 18));
                }
                return null;
            case 8:
                v520 v520Var = (v520) obj;
                TreeMap treeMap = new TreeMap((Comparator) new xvd(new cvt((byte) 8), (byte) 16));
                Context context2 = v520Var.c;
                String absolutePath = new File(context2.getFilesDir(), "settings").getAbsolutePath();
                String strS0 = f46.s0(new String[]{Environment.getExternalStorageDirectory().getAbsolutePath(), "Android/data/", v520Var.d.a, "cache"}, File.separator, (String) null, (String) null, (iu30) null, 62);
                String absolutePath2 = new File(context2.getFilesDir(), "spotifycache").getAbsolutePath();
                String absolutePath3 = context2.getCacheDir().getAbsolutePath();
                String absolutePath4 = Environment.getExternalStorageDirectory().getAbsolutePath();
                String absolutePath5 = context2.getFilesDir().getAbsolutePath();
                File externalCacheDir = context2.getExternalCacheDir();
                String absolutePath6 = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
                treeMap.put(absolutePath, v0c1.b);
                v0c1 v0c1Var = v0c1.a;
                treeMap.put(strS0, v0c1Var);
                treeMap.put(absolutePath2, v0c1Var);
                treeMap.put(absolutePath3, v0c1.c);
                if (absolutePath6 != null) {
                    treeMap.put(absolutePath6, v0c1.d);
                }
                treeMap.put(absolutePath5, v0c1.e);
                treeMap.put(absolutePath4, v0c1.f);
                return treeMap;
            case 9:
                return new xoa1((FilterMetadataDatabase_Impl) obj);
            case 10:
                return hap1.w(n830.b((n830) obj));
            case 11:
                return fap1.h(((md4) obj).a().a);
            case 12:
                return (ViewGroup) ((hw30) obj).X.findViewById(2131428878);
            case 13:
                d460 d460Var = (d460) obj;
                return new thq0(d460Var.e, d460Var.b);
            case 14:
                return new sul1((HeadphoneFilterStateDatabase_Impl) obj);
            case 15:
                return Integer.valueOf(Objects.hash(ld70.a((ld70) obj)));
            case 16:
                th70 th70Var = (th70) obj;
                ReentrantLock reentrantLock = th70Var.b;
                reentrantLock.lock();
                try {
                    th70Var.a = null;
                    return rih1Var;
                } finally {
                    reentrantLock.unlock();
                }
            case 17:
                q8n q8nVar = ((v480) obj).e;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return ilo1.B(q8nVar, j0d1VarB);
            case 18:
                return new DispatcherWorker(((se80) obj).e);
            case 19:
                return new DispatcherWorker(((bz80) obj).g);
            case 20:
                return ((bbr0) obj).b0(yxe1.class);
            case 21:
                fjf1 fjf1Var = ((zuc0) obj).p;
                if (!(fjf1Var instanceof hkj0)) {
                    if (fjf1Var instanceof fjf1) {
                        z = fjf1Var.g;
                    } else {
                        if (!(fjf1Var instanceof k1z)) {
                            eg.o();
                            return null;
                        }
                        z = ((k1z) fjf1Var).d;
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                hgd0 hgd0Var = (hgd0) obj;
                tgp0 tgp0Var = hgd0Var.s;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new ouz(hgd0Var, (byte) 27))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
            case 23:
                return (lzn0) ((mrd0) obj).h.get();
            case 24:
                return (u2n) ((en31) obj).j.get(rc11.a.b(u2n.class));
            case 25:
                return d5p1.h((wen0) ((e1g0) obj).c.getValue());
            case 26:
                return s24.p((s24) obj).x(eh10.O0).J(mi10.O0).t(Functions.a);
            case 27:
                ((xwh0) obj).a();
                return rih1Var;
            case 28:
                return ycm.a((ycm) obj);
            default:
                return ((myq0) obj).e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc00(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
