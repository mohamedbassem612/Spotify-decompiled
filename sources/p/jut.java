package p;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.gms.tasks.Task;
import com.spotify.libs.sociallistening.events.proto.SocialListeningClientSessionEnded;
import com.spotify.mobius.functions.Consumer;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.on_demand_set.proto.Temporary;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jut implements ObservableOnSubscribe, puu, l381, Function, BiPredicate, c5x, i2q0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public jut(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                break;
            default:
                this.b = new sui1(2, true);
                this.c = new sui1(2, true);
                break;
        }
    }

    public void a() {
        ayl aylVar = (ayl) ((xvu) this.b).i;
        fvu fvuVar = (fvu) this.c;
        ayl.b(aylVar, fvuVar.d.c(), fvuVar.a, 4);
    }

    public Object apply(Object obj) {
        Single map;
        String str;
        String str2;
        switch (this.a) {
            case 7:
                Throwable th = (Throwable) obj;
                n57.g("Lyrics download failed unexpectedly", th);
                kpz kpzVarN = EsOfflinePlugin.DownloadResponse.n();
                EsOfflinePlugin.DownloadCommand downloadCommand = (EsOfflinePlugin.DownloadCommand) this.b;
                lpz lpzVar = (lpz) this.c;
                kpzVarN.u(downloadCommand.getLink());
                kpzVarN.q();
                kpzVarN.t(0L);
                kpzVarN.n(0L);
                kpzVarN.r(lpzVar);
                kpzVarN.s(cev0.v(th));
                return kpzVarN.build();
            case 8:
                String str3 = (String) obj;
                Set set = s4b1.f;
                r9c r9cVar = (r9c) this.b;
                s4b1 s4b1VarX = uic.x(r9cVar.b);
                r2a1 r2a1Var = ((k3v) this.c).e;
                return new bja1(r2a1Var.k(r9cVar, str3, s4b1VarX), r2a1Var.j(r9cVar, str3, s4b1VarX));
            case 14:
                SingleSubject singleSubject = new SingleSubject();
                lls0 lls0Var = (lls0) this.b;
                r0w r0wVar = (r0w) this.c;
                lls0Var.A(new jzv(singleSubject, r0wVar, (byte) 2), new jzv(singleSubject, r0wVar, (byte) 3), new jzv(singleSubject, r0wVar, (byte) 4), ((zyv) obj).b);
                return singleSubject;
            case 18:
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(Boolean.FALSE);
                }
                n3q0 n3q0Var = (n3q0) ((kl1) this.b).c;
                String str4 = ((p7w) this.c).b;
                xxd1 xxd1VarN = Temporary.n();
                xxd1VarN.n(str4);
                xxd1VarN.q();
                Temporary temporaryBuild = xxd1VarN.build();
                be beVar = n3q0Var.b;
                temporaryBuild.getClass();
                return beVar.callSingle("spotify.on_demand_set_esperanto.proto.OnDemandSetService", "Temporary", temporaryBuild).map(bj20.U0).flatMapCompletable(new ewn0(n3q0Var, (byte) 13)).n(n3q0Var.c).c(new CompletableDefer(new xf0(n3q0Var, str4, (byte) 10))).d(Observable.just(Boolean.TRUE));
            case 19:
                CompletableFromAction completableFromAction = new CompletableFromAction(new bm0((Consumer) this.c, obj, (byte) 21));
                Scheduler scheduler = (Scheduler) this.b;
                return scheduler == null ? completableFromAction : completableFromAction.s(scheduler);
            default:
                Long l = (Long) obj;
                f1y f1yVar = (f1y) this.b;
                i1k0 i1k0Var = f1yVar.a;
                boolean z = i1k0Var instanceof rzx;
                h1y h1yVar = (h1y) this.c;
                if (!z) {
                    gmt gmtVar = h1yVar.c;
                    k1y k1yVar = (k1y) gmtVar.b;
                    if (z) {
                        map = k1yVar.b(((rzx) i1k0Var).e).map(cxo1.a1);
                    } else {
                        if (!(i1k0Var instanceof qzx)) {
                            eg.o();
                            return null;
                        }
                        map = k1yVar.a(((qzx) i1k0Var).e).map(new rmr(gmtVar, (byte) 23));
                    }
                    return map.flatMapCompletable(new otu(h1yVar, f1yVar, l));
                }
                String str5 = (String) q5y.a.get(i1k0Var.p());
                if (str5 == null) {
                    eg.m(f4i1.f("No Playlist Uri found corresponding to Endless ", i1k0Var.p(), " Uri."));
                    return null;
                }
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.s("dynamic-sessions");
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                ou80 ou80Var = f1yVar.b;
                String str6 = "unknown";
                if (ou80Var == null || (str = ou80Var.a) == null) {
                    str = "unknown";
                }
                y6r0 y6r0Var = f1yVar.c;
                if (y6r0Var != null && (str2 = y6r0Var.a) != null) {
                    str6 = str2;
                }
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                cozVarR.n(str);
                cozVarR.q(str6);
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(h1yVar.a.b());
                cozVarR.t(qpzVarP);
                return j2h1.D(h1yVar.d, new g1y(h1yVar, playOriginBuild, cozVarR.build(), str5, (lnm) null, (byte) 0));
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public boolean c(CharSequence charSequence, int i, int i2, a2h1 a2h1Var) {
        if ((a2h1Var.c & 4) > 0) {
            return true;
        }
        if (((akh1) this.b) == null) {
            this.b = new akh1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ulc) this.c).getClass();
        ((akh1) this.b).setSpan(new b2h1(a2h1Var), i, i2, 33);
        return true;
    }

    public c8e1 d(List list) {
        nbe1 nbe1Var = null;
        try {
            int size = list.size();
            int i = 0;
            nbe1 nbe1Var2 = null;
            while (i < size) {
                try {
                    nbe1 nbe1Var3 = (lov) list.get(i);
                    try {
                        nbe1Var3.a((k4w) this.c);
                        i++;
                        nbe1Var2 = nbe1Var3;
                    } catch (Exception e) {
                        e = e;
                        nbe1Var = nbe1Var3;
                        StringBuilder sb = new StringBuilder();
                        int iP = ((w4c0) ((k4w) this.c).f).p();
                        nbe1 nbe1VarG = ((k4w) this.c).g();
                        k4w k4wVar = (k4w) this.c;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iP + ", composition=" + nbe1VarG + ", selection=" + nbe1.i(e6p1.e(k4wVar.b, k4wVar.c)) + "):");
                        sb.append('\n');
                        o7h.x0(list, sb, "\n", (String) null, (String) null, new j6(nbe1Var, this, (byte) 29), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    nbe1Var = nbe1Var2;
                }
            }
            k4w k4wVar2 = (k4w) this.c;
            k4wVar2.getClass();
            af5 af5Var = new af5(((w4c0) k4wVar2.f).toString());
            k4w k4wVar3 = (k4w) this.c;
            long jE = e6p1.e(k4wVar3.b, k4wVar3.c);
            nbe1Var = nbe1.h(((c8e1) this.b).b) ? null : new nbe1(jE);
            c8e1 c8e1Var = new c8e1(af5Var, nbe1Var != null ? nbe1Var.a : e6p1.e(nbe1.f(jE), nbe1.g(jE)), ((k4w) this.c).g());
            this.b = c8e1Var;
            return c8e1Var;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public r9c e() {
        return new r9c(null, "com.spotify.recently-played", null, null, lro1.r(((Context) this.b).getPackageName()), false, false, new hlr0(10), 3, 2, null, false, 189357);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, onm onmVar) {
        ssy ssyVar;
        io70 io70Var;
        if (onmVar instanceof ssy) {
            ssyVar = (ssy) onmVar;
            int i = ssyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssyVar.d = i - Integer.MIN_VALUE;
            } else {
                ssyVar = new ssy(this, onmVar);
            }
        } else {
            ssyVar = new ssy(this, onmVar);
        }
        Object objJ = ssyVar.b;
        int i2 = ssyVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            ezc ezcVarG = yoi1.g(((uu00) this.b).b(new oi("ChromelessChapterResolver", false, new kov(str, (byte) 18))));
            afv afvVar = new afv(2, (lnm) null, (byte) 4);
            ssyVar.a = str;
            ssyVar.d = 1;
            objJ = b5p1.j(ezcVarG, afvVar, ssyVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ssyVar.a;
            hm5.M(objJ);
        }
        jo70 jo70Var = ((uv00) objJ).a(jo70.class, str).b;
        if (jo70Var != null && (io70Var = jo70Var.e) != null) {
            String str2 = io70Var.b;
            if (str2.length() != 0) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(String str, wea0 wea0Var, qo90 qo90Var, lnm lnmVar) throws Throwable {
        o5u o5uVar;
        Throwable th;
        Disposable disposable;
        xx91 xx91Var = (lx91) this.b;
        if (lnmVar instanceof o5u) {
            o5uVar = (o5u) lnmVar;
            int i = o5uVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o5uVar.d = i - Integer.MIN_VALUE;
            } else {
                o5uVar = new o5u(this, (onm) lnmVar);
            }
        } else {
            o5uVar = new o5u(this, (onm) lnmVar);
        }
        Object objP = o5uVar.b;
        int i2 = o5uVar.d;
        if (i2 == 0) {
            hm5.M(objP);
            String str2 = qo90Var.c;
            ayh ayhVarA = sap1.a();
            r1a1 r1a1Var = xx91Var.j;
            Disposable disposableSubscribe = r1a1Var.b.subscribeOn(r1a1Var.a).filter(new yjp1((byte) 5, this, str2)).firstElement().subscribe(new p5u(ayhVarA, (byte) 0), new p5u(ayhVarA, (byte) 1), new f72(ayhVarA, (byte) 14));
            try {
                xx91Var.p.onNext(new v3a1(str2, true, wea0Var, qo90Var.b, 2));
                long j = q5u.a;
                lhb lhbVar = new lhb(ayhVarA, (lnm) null, (byte) 2);
                o5uVar.a = disposableSubscribe;
                o5uVar.d = 1;
                objP = rc2.P(j, lhbVar, o5uVar);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                disposable = disposableSubscribe;
            } catch (Throwable th2) {
                th = th2;
                disposable = disposableSubscribe;
                disposable.dispose();
                throw th;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            disposable = o5uVar.a;
            try {
                hm5.M(objP);
            } catch (Throwable th3) {
                th = th3;
                disposable.dispose();
                throw th;
            }
        }
        d1a1 d1a1Var = (q1a1) objP;
        if (d1a1Var instanceof d1a1) {
            ((z1s) this.c).a(new si70(d1a1Var.a instanceof qea0, d1a1Var.a.a));
        }
        disposable.dispose();
        return rih1.a;
    }

    public Object getResult() {
        return (akh1) this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (p.u890.j(r6 != null ? r6.getType() : null, p.wyu0.f) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.rxjava3.core.Single h(java.lang.String r6, java.lang.String r7, java.util.Map r8) {
        /*
            r5 = this;
            java.lang.Object r8 = r8.get(r6)
            p.f7h r8 = (p.f7h) r8
            if (r8 != 0) goto Lf
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            io.reactivex.rxjava3.core.Single r5 = io.reactivex.rxjava3.core.Single.just(r5)
            return r5
        Lf:
            boolean r0 = r8.a
            boolean r1 = r8.c
            java.util.Set r2 = p.s4b1.f
            p.s4b1 r2 = p.uic.x(r6)
            p.blc0 r2 = r2.c
            p.blc0 r3 = p.blc0.ed
            java.lang.String r4 = "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt"
            if (r2 != r3) goto L30
            boolean r2 = r7.equals(r4)
            if (r2 == 0) goto L30
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            io.reactivex.rxjava3.core.Single r5 = io.reactivex.rxjava3.core.Single.just(r5)
            return r5
        L30:
            p.s4b1 r6 = p.uic.x(r6)
            p.blc0 r6 = r6.c
            p.blc0 r2 = p.blc0.Pg
            r3 = 1
            if (r6 != r2) goto L4a
            if (r0 != 0) goto L41
            if (r1 == 0) goto L40
            goto L41
        L40:
            r3 = 0
        L41:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            io.reactivex.rxjava3.core.Single r5 = io.reactivex.rxjava3.core.Single.just(r5)
            return r5
        L4a:
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L9f
            p.s4b1 r6 = p.uic.x(r7)
            p.v5b1 r6 = r6.d
            r1 = 0
            if (r6 == 0) goto L5e
            p.b3i1 r2 = r6.getType()
            goto L5f
        L5e:
            r2 = r1
        L5f:
            p.ixu0 r4 = p.nyu0.e
            boolean r2 = p.u890.j(r2, r4)
            if (r2 != 0) goto L77
            if (r6 == 0) goto L6e
            p.b3i1 r6 = r6.getType()
            goto L6f
        L6e:
            r6 = r1
        L6f:
            p.uyu0 r2 = p.wyu0.f
            boolean r6 = p.u890.j(r6, r2)
            if (r6 == 0) goto L9f
        L77:
            p.ymu r6 = new p.ymu
            r0 = 12
            r6.<init>(r5, r7, r1, r0)
            p.o6x r7 = p.o6x.a
            io.reactivex.rxjava3.core.Single r6 = p.rqt0.F(r7, r6)
            p.qmr r7 = new p.qmr
            r0 = 21
            r7.<init>(r5, r0)
            io.reactivex.rxjava3.core.Single r5 = r6.map(r7)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            io.reactivex.rxjava3.core.Single r5 = r5.onErrorReturnItem(r6)
            p.j3v r6 = new p.j3v
            r6.<init>(r8, r3)
            io.reactivex.rxjava3.core.Single r5 = r5.map(r6)
            return r5
        L9f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            io.reactivex.rxjava3.core.Single r5 = io.reactivex.rxjava3.core.Single.just(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jut.h(java.lang.String, java.lang.String, java.util.Map):io.reactivex.rxjava3.core.Single");
    }

    public void i(int i, String str) {
        i8h1 i8h1Var = (i8h1) this.c;
        x6h1 x6h1VarC = ((txk0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("items_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("item_row", (String) null, numValueOf, str, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void j(String str, hr90 hr90Var) {
        String str2;
        t2j0 t2j0Var = (t2j0) this.b;
        w0a1 w0a1VarN = SocialListeningClientSessionEnded.n();
        switch (hr90Var.ordinal()) {
            case 0:
                str2 = "end_session_queue_button_pressed";
                break;
            case 1:
                str2 = "leave_session_queue_button_pressed";
                break;
            case 2:
                str2 = "host_toggled_off";
                break;
            case 3:
                str2 = "host_removed_all_participants";
                break;
            case 4:
                str2 = "host_removed_one_participant";
                break;
            case 5:
                str2 = "participant_removed_one_participant";
                break;
            case 6:
                str2 = "ipl_participant_kicked_out";
                break;
            case 7:
                str2 = "takeover_device";
                break;
            case 8:
                str2 = "end_ipl_session_confirmation_dialog";
                break;
            case 9:
                str2 = "ipl_host_disconnected";
                break;
            case 10:
                str2 = "active_playback_device_changed_connect";
                break;
            case 11:
                str2 = "active_playback_device_changed_local";
                break;
            case 12:
                str2 = "end_jam_from_device_picker";
                break;
            case 13:
                str2 = "leave_jam_from_device_picker";
                break;
            case 14:
                str2 = "rgs_host_disconnected";
                break;
            case 15:
                str2 = "google_meet_live_sharing_leave_jam_action";
                break;
            case 16:
                str2 = "bluetooth_device_disconnected";
                break;
            case 17:
                str2 = "ipl_participant_change_device";
                break;
            case 18:
                str2 = "create_menu_start_new_jam";
                break;
            case 19:
                str2 = "contextless_error_snackbar";
                break;
            case 20:
                str2 = "end_jam_from_android_auto";
                break;
            case 21:
                str2 = "end_jam_from_android_automotive";
                break;
            case 22:
                str2 = "leave_jam_from_android_automotive";
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                str2 = "chat_toolbar_end_button";
                break;
            case 24:
                str2 = "chat_toolbar_leave_button";
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                str2 = "chat_listening_activity_end_button";
                break;
            case 26:
                str2 = "chat_listening_activity_leave_button";
                break;
            case 27:
                str2 = "manage_participants_leave_button";
                break;
            case 28:
                str2 = "ads_disclaimer_leave_button";
                break;
            case 29:
                str2 = "permission_upgrade_sheet_leave_button";
                break;
            default:
                eg.o();
                return;
        }
        w0a1VarN.n(str2);
        w0a1VarN.q(str);
        t2j0Var.a(w0a1VarN.build());
        ((je61) this.c).a();
    }

    public void k(String str, w4l0 w4l0Var) {
        x6h1 x6h1VarC = ((yok0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("connect_bottom_sheet", w4l0Var.a, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        ((i8h1) this.c).f(k7h1Var.a(), (Set) null);
    }

    public String l(dug dugVar, String str, w4l0 w4l0Var) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        String str2 = w4l0Var.a;
        y6h1 y6h1Var = ((yok0) this.b).b;
        boolean z = dugVar instanceof iut;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("connect_bottom_sheet", str2, (Integer) null, (String) null, str));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("connect_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA = x6h1VarC2.a();
            String str3 = ((iut) dugVar).c;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str3 == null) {
                str3 = "";
            }
            w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", str3)), y6h1VarA, r6h1.c, System.currentTimeMillis());
        } else {
            if (dugVar.equals(hut.e)) {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("connect_bottom_sheet", str2, (Integer) null, (String) null, str));
                x6h1VarC3.j = true;
                w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            } else if (dugVar.equals(hut.c)) {
                x6h1 x6h1VarC4 = y6h1Var.c();
                x6h1VarC4.i.add(new a7h1("connect_bottom_sheet", str2, (Integer) null, (String) null, str));
                x6h1VarC4.j = true;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            } else {
                if (!dugVar.equals(hut.d)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC5 = y6h1Var.c();
                x6h1VarC5.i.add(new a7h1("connect_bottom_sheet", str2, (Integer) null, (String) null, str));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("show_all_devices_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:connect-device-picker")), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            }
            w7h1Var2 = w7h1Var;
        }
        return ((i8h1) this.c).m(w7h1Var2, (xj61) null).a.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, onm onmVar) {
        tsy tsyVar;
        String str2;
        if (onmVar instanceof tsy) {
            tsyVar = (tsy) onmVar;
            int i = tsyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsyVar.e = i - Integer.MIN_VALUE;
            } else {
                tsyVar = new tsy(this, onmVar);
            }
        } else {
            tsyVar = new tsy(this, onmVar);
        }
        Object objF = tsyVar.c;
        int i2 = tsyVar.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            tsyVar.a = str;
            tsyVar.e = 1;
            objF = f(str, tsyVar);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = tsyVar.a;
            hm5.M(objF);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = tsyVar.b;
            hm5.M(objF);
        }
        sq51 sq51Var = ((lvy) objF).b;
        return new bv21(sq51Var.a, str2, !sq51Var.b);
        String str3 = (String) objF;
        if (str3 == null) {
            return null;
        }
        uvy uvyVar = (uvy) this.c;
        tsyVar.a = null;
        tsyVar.b = str3;
        tsyVar.e = 2;
        Object objA = uvyVar.a(str3, str, tsyVar);
        if (objA != obj) {
            objF = objA;
            str2 = str3;
            sq51 sq51Var2 = ((lvy) objF).b;
            return new bv21(sq51Var2.a, str2, !sq51Var2.b);
        }
        return obj;
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        if (task.j()) {
            if (((Boolean) task.g()).booleanValue()) {
                l441Var.resumeWith(new o6y((km3) ((wcr) this.c).b));
                return;
            } else {
                l441Var.resumeWith((Object) null);
                return;
            }
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith((Object) null);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        zrj1 zrj1Var = (zrj1) ((s24) this.b).X;
        iau iauVar = new iau(observableEmitter, ((dma1) zrj1Var.b).g((bma1) zrj1Var.d, 0L));
        iac0 iac0Var = (iac0) this.c;
        iac0Var.getLifecycle().a(iauVar);
        observableEmitter.setDisposable(Disposable.d(new bm0(iac0Var, iauVar, (byte) 20)));
    }

    public boolean t(Object obj) {
        c1v c1vVar = (c1v) obj;
        mwu mwuVar = (mwu) this.c;
        qxc0 qxc0Var = c1vVar.a;
        return gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h, dlc0.g, dlc0.f}) && (yto.k(c1vVar.b, false) || mwuVar.f) && mwuVar.c.c(qxc0Var.X);
    }

    public boolean test(Object obj, Object obj2) {
        s0w s0wVar = (s0w) obj;
        s0w s0wVar2 = (s0w) obj2;
        kma0 kma0Var = (kma0) this.c;
        iu30 iu30Var = (iu30) this.b;
        s0wVar.getClass();
        boolean zBooleanValue = ((Boolean) iu30Var.invoke(s0wVar)).booleanValue();
        s0wVar2.getClass();
        return zBooleanValue == ((Boolean) iu30Var.invoke(s0wVar2)).booleanValue() && u890.j(kma0Var.invoke(s0wVar), kma0Var.invoke(s0wVar2));
    }

    public /* synthetic */ jut(i8h1 i8h1Var, t9h1 t9h1Var, byte b) {
        this.a = b;
        this.c = i8h1Var;
        this.b = t9h1Var;
    }

    public jut(i8h1 i8h1Var) {
        this.a = (byte) 21;
        this.c = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new h4l0((byte) 1);
    }

    public jut(ynb0 ynb0Var) {
        this.a = (byte) 16;
        this.b = ynb0Var;
        this.c = new tdl0((byte) 26);
    }

    public /* synthetic */ jut(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public jut(mwu mwuVar) {
        this.a = (byte) 6;
        this.c = mwuVar;
        this.b = mwuVar.h;
    }
}
