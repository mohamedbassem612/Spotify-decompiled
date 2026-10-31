package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeIntentChecker;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.c;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d4e0 implements Function, rb, ete0, jrn0, Predicate, rbh0, pah, Function3, w710, enm {
    public final /* synthetic */ byte a;
    public final Object b;

    public d4e0(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = new py9((byte) 4);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                this.b = Observable.just(Boolean.TRUE);
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public void a(String str, String str2) {
        ((wre0) this.b).a.a('I', "Spotify", wre0.g(str, str2), (Throwable) null);
    }

    public boolean accept(Object obj) {
        iw81 iw81Var = (iw81) obj;
        Intent intent = iw81Var.a;
        if (intent == null) {
            return false;
        }
        ((vjc1) this.b).getClass();
        Set set = s4b1.f;
        return uic.x(iw81Var.b).c == blc0.ka && AudioMimeIntentChecker.INSTANCE.isAudioMimeIntent(intent);
    }

    public Object apply(Object obj) {
        String str;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                e821 e821Var = (e821) ((o4e0) obj2).b;
                return ((gae) e821Var.e).g((String) e821Var.c, (lik1) e821Var.b).flatMap(r3x0.t).flatMap(new dc31(e821Var, ((xc7) obj).e, (byte) 13)).map(xi20.X).onErrorReturn(yi20.t);
            case 4:
                String str2 = (String) obj;
                if (str2.length() == 0) {
                    return Observable.just(Boolean.FALSE);
                }
                byp0 byp0Var = (byp0) ((pbq) obj2).d;
                List listSingletonList = Collections.singletonList(str2);
                vpp0 vpp0Var = byp0Var.a;
                c cVarQ = EsOffline.GetContextsRequest.q();
                cVarQ.n(listSingletonList);
                return vpp0Var.c(cVarQ.build()).map(yi20.T0).map(yj20.X);
            case 5:
                vng1 vng1Var = (vng1) obj;
                if (vng1Var instanceof ung1) {
                    khf0 khf0Var = (khf0) obj2;
                    return new vif0(khf0Var.a, ((ung1) vng1Var).a, khf0Var.c);
                }
                if (vng1Var instanceof tng1) {
                    return uif0.a;
                }
                eg.o();
                return null;
            case 6:
                return ((ObservableFromPublisher) obj2).map(new hod0(obj, (byte) 8)).distinctUntilChanged();
            case 12:
                return new vki0(!((lki0) obj2).c);
            case 16:
                return Completable.l(((sam0) obj2).o).d(Observable.just(kam0.a));
            case 19:
                q1o0 q1o0Var = (q1o0) obj2;
                dma1 dma1VarB = q1o0Var.a.b(q1o0Var.e, (String) obj);
                nbc nbcVar = bma1.b;
                int iL = dma1VarB.l(nbcVar.n("key_bt_permissions_flow_started_count_v2"), 0);
                hma1 hma1VarEdit = dma1VarB.edit();
                hma1VarEdit.b(nbcVar.n("key_bt_permissions_flow_started_count_v2"), iL + 1);
                hma1VarEdit.g();
                return CompletableEmpty.a;
            case 20:
                p2o0 p2o0Var = (p2o0) obj2;
                return ((Boolean) obj).booleanValue() ? Observable.just(n2o0.a) : ((d3o0) p2o0Var.c).a().map(new o2o0(p2o0Var)).flatMapObservable(new hod0((Object) p2o0Var, (byte) 23));
            case 26:
                return new mmr0((vad1) obj2, ((spq0) obj).b());
            case 27:
                i5e0 i5e0Var = (o5e0) obj;
                dsp0 dsp0Var = (dsp0) obj2;
                if (!dsp0Var.a) {
                    return Single.just(i5e0Var);
                }
                if (!(i5e0Var instanceof i5e0)) {
                    return i5e0Var instanceof m5e0 ? dsp0Var.b.map(new jkp0(dsp0Var, i5e0Var)) : Single.just(i5e0Var);
                }
                i5e0 i5e0Var2 = i5e0Var;
                return Single.just(new l5e0(i5e0Var2.a, i5e0Var2.b));
            case 28:
                List list = (List) obj;
                b8p1 b8p1Var = (b8p1) obj2;
                if (list.isEmpty()) {
                    return Single.zip((Single) b8p1Var.c, (Single) b8p1Var.d, new drj0((Object) list, (Object) b8p1Var, (byte) 24));
                }
                cup0 cup0Var = (cup0) list.get(b8p1Var.b);
                int i = b8p1Var.b + 1;
                int size = list.size();
                int i2 = i % size;
                b8p1Var.b = i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31));
                return Single.just(spq0.d(cup0Var));
            default:
                EsOffline.Progress progress = (EsOffline.Progress) obj;
                exp0 exp0Var = (exp0) obj2;
                if (progress.s()) {
                    str = progress.y() <= 0 ? "idle_zero_total" : "downloading";
                } else {
                    str = "idle_not_downloading";
                }
                exp0Var.d(str);
                return (!progress.s() || progress.y() <= 0) ? qcd1.a : new pcd1(progress, false);
        }
    }

    @Override // p.enm
    public Observable b() {
        return (Observable) this.b;
    }

    public void c(int i) {
        ((i1p0) this.b).d.getBackground().setTint(i);
    }

    public ovh0 d() {
        return new ovh0((Bundle) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, iyr0 iyr0Var, onm onmVar) {
        c4e0 c4e0Var;
        if (onmVar instanceof c4e0) {
            c4e0Var = (c4e0) onmVar;
            int i = c4e0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4e0Var.d = i - Integer.MIN_VALUE;
            } else {
                c4e0Var = new c4e0(this, onmVar);
            }
        } else {
            c4e0Var = new c4e0(this, onmVar);
        }
        Object objD = c4e0Var.b;
        int i2 = c4e0Var.d;
        if (i2 == 0) {
            hm5.M(objD);
            va40 va40Var = (va40) this.b;
            c4e0Var.a = iyr0Var;
            c4e0Var.d = 1;
            objD = va40Var.d(str, iyr0Var, c4e0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iyr0Var = c4e0Var.a;
            hm5.M(objD);
        }
        iyr0 iyr0Var2 = iyr0Var;
        nxr0 nxr0Var = (nxr0) objD;
        g4a g4aVarD = ilo1.D(iyr0Var2);
        String str2 = nxr0Var.a;
        boolean z = nxr0Var.b;
        ArrayList arrayList = nxr0Var.d;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new mxr0(UUID.randomUUID().toString(), ((ixr0) it.next()).a, g4aVarD, false, false));
        }
        ArrayList arrayList3 = nxr0Var.c;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new bzr0(UUID.randomUUID().toString(), ((pyr0) it2.next()).a, g4aVarD, false, false));
        }
        return new b4e0(str2, iyr0Var2, z, arrayList2, arrayList4);
    }

    public rqw f(u710 u710Var) {
        return n3o1.q(u710Var).a(new x3o0(this, (byte) 7), n3o0.c1);
    }

    public float g() {
        return -((NestedScrollView) this.b).getVerticalScrollFactorCompat();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (p.f1n0.d(r0, r7, r3) == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(p.xcw r19, p.onm r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof p.prn0
            if (r3 == 0) goto L19
            r3 = r2
            p.prn0 r3 = (p.prn0) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            p.prn0 r3 = new p.prn0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            int r4 = r3.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 == r6) goto L32
            if (r4 != r5) goto L2b
            goto L32
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L32:
            p.hm5.M(r2)     // Catch: java.lang.Exception -> L70
            goto L84
        L36:
            p.hm5.M(r2)
            java.lang.String r2 = r1.a     // Catch: java.lang.Exception -> L70
            java.lang.String r8 = p.pcf.g(r2)     // Catch: java.lang.Exception -> L70
            p.tqw r1 = r1.b     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = r0.b
            p.f1n0 r0 = (p.f1n0) r0
            p.d9n r2 = p.d9n.a
            if (r1 == 0) goto L56
            p.tv80 r1 = p.n3o1.y(r1)     // Catch: java.lang.Exception -> L70
            r3.c = r6     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = p.f1n0.f(r0, r8, r1, r3)     // Catch: java.lang.Exception -> L70
            if (r0 != r2) goto L84
            goto L6f
        L56:
            java.lang.String r9 = ""
            p.dwn0 r7 = new p.dwn0     // Catch: java.lang.Exception -> L70
            r17 = 0
            r16 = 0
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L70
            r3.c = r5     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = p.f1n0.d(r0, r7, r3)     // Catch: java.lang.Exception -> L70
            if (r0 != r2) goto L84
        L6f:
            return r2
        L70:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "Navigate to chat failed: "
            java.lang.String r0 = p.l1d.m(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "AudienceUserRowElement"
            com.spotify.base.java.logging.Logger.d(r1, r0)
        L84:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d4e0.h(p.xcw, p.onm):java.lang.Object");
    }

    public void i(String str, String str2, Throwable th) {
        ((wre0) this.b).a.a('I', "Spotify", wre0.g(str, str2), th);
    }

    public opl0 j(String str) {
        return new opl0((byte) 1, (Integer) null, str, (r6h1) this.b);
    }

    public void k(String str, Bundle bundle, List list) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        o(3, bundle2);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String path;
        mbh0 mbh0VarD;
        Uri data = intent.getData();
        String str = null;
        if (data != null && (path = data.getPath()) != null && (mbh0VarD = m9g0.a.d(path)) != null) {
            str = (String) mbh0VarD.a().get(1);
        }
        if (str == null) {
            str = "";
        }
        return ((nw3) this.b).b(str);
    }

    public void m() {
        ((MaterialButtonToggleGroup) this.b).invalidate();
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        ivq0 ivq0Var;
        Boolean bool = (Boolean) obj3;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        bool.getClass();
        boolean zBooleanValue2 = bool.booleanValue();
        pqq0 pqq0Var = (pqq0) this.b;
        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
        if ((zBooleanValue || zBooleanValue2) && pqq0Var == pqq0.a) {
            ivq0Var = ivq0.d;
        } else if (zBooleanValue && zBooleanValue3 && pqq0Var == pqq0.b) {
            ivq0Var = ivq0.a;
        } else {
            ivq0Var = zBooleanValue ? ivq0.c : ivq0.b;
        }
        return new hvq0(ivq0Var, zBooleanValue);
    }

    public void o(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.b).send(messageObtain);
    }

    public void p(String str) {
        ((Bundle) this.b).putString("clientPackageName", str);
    }

    public boolean q(float f) {
        if (f == 0.0f) {
            return false;
        }
        r();
        ((NestedScrollView) this.b).r((int) f);
        return true;
    }

    public void r() {
        ((NestedScrollView) this.b).d.abortAnimation();
    }

    public boolean test(Object obj) {
        return ((ttg0) obj).a.equals((m0u0) this.b);
    }

    public d4e0(va40 va40Var, twb twbVar) {
        this.a = (byte) 0;
        this.b = va40Var;
    }

    public /* synthetic */ d4e0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public d4e0(ovh0 ovh0Var) {
        this.a = (byte) 11;
        Bundle bundle = new Bundle();
        this.b = bundle;
        Bundle bundle2 = (Bundle) ovh0Var.a.getParcelable("controlHints");
        bundle.putParcelable("controlHints", bundle2 == null ? Bundle.EMPTY : bundle2);
        p(ovh0Var.a.getString("clientPackageName", ""));
    }
}
