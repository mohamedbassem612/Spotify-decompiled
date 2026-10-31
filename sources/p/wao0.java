package p;

import android.content.SharedPreferences;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.component.icons.IconCheckAltFill;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.local_files_esperanto.proto.EsLocalFiles;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.c;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class wao0 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wao0(xpp0 xpp0Var, byte b) {
        super(1, xpp0Var, xpp0.class, "observeContextOfflineState", "observeContextOfflineState(Ljava/util/Set;)Lio/reactivex/rxjava3/core/Observable;", 0);
        this.a = b;
        switch (b) {
            case 13:
                super(1, xpp0Var, xpp0.class, "observeLocalFilesOfflineState", "observeLocalFilesOfflineState(Ljava/util/Set;)Lio/reactivex/rxjava3/core/Observable;", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke(Object obj) {
        zf30 zf30Var;
        Object tyzVar;
        Object tyzVar2;
        boolean z;
        byte b = this.a;
        int i = 8;
        boolean z2 = true;
        boolean zA = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((ValueCallback) ((lyc) this).receiver).onReceiveValue((Uri[]) obj);
                return rih1Var;
            case 1:
                return Boolean.valueOf(((cbv) ((lyc) this).receiver).a((ContextTrack) obj));
            case 2:
                return Boolean.valueOf(((cbv) ((lyc) this).receiver).a((ContextTrack) obj));
            case 3:
                vgp0 vgp0Var = (vgp0) obj;
                ((yiq0) ((lyc) this).receiver).getClass();
                SharedPreferences sharedPreferences = yiq0.c;
                return Double.valueOf(sharedPreferences != null ? ((double) sharedPreferences.getInt("OopsSamplingOverride:".concat(vgp0Var.a()), 0)) / 10000.0d : 0.0d);
            case 4:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 5:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 6:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 7:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 8:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 9:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 10:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 11:
                ((rhp0) ((lyc) this).receiver).getClass();
                return Double.valueOf(rhp0.a((vgp0) obj));
            case 12:
                vpp0 vpp0Var = ((xpp0) ((lyc) this).receiver).a;
                c cVarQ = EsOffline.GetContextsRequest.q();
                Set set = (Set) obj;
                cVarQ.n(set);
                Observable map = vpp0Var.c(cVarQ.build()).map(ak20.Q0);
                woz wozVarO = EsOffline.GetContextsProgressRequest.o();
                wozVarO.n(set);
                return Observable.combineLatest(map, vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContextsProgress", wozVarO.build()).map(yi20.S0).map(zj20.Q0), yj20.R0);
            case 13:
                eee0 eee0Var = ((xpp0) ((lyc) this).receiver).b;
                znz znzVarN = EsLocalFiles.GetTracksRequest.n();
                znzVarN.r(EsLocalFiles.Query.n().build());
                vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setLocallyPlayable(true));
                znzVarN.q(vwu0VarR);
                return yoi1.i(new sii0(new mnc0(eee0Var.callStream("spotify.local_files_esperanto.proto.LocalFiles", "SubscribeTracks", znzVarN.build()), (byte) 26), (Set) obj, (byte) 19), o6x.a);
            case 14:
                ((n8r0) ((lyc) this).receiver).a((o8r0) obj);
                return rih1Var;
            case 15:
                qwq0 qwq0Var = (qwq0) obj;
                zvq0 zvq0Var = (zvq0) ((lyc) this).receiver;
                fvn0 fvn0Var = zvq0Var.d;
                zvq0Var.e = qwq0Var;
                if (qwq0Var == null) {
                    pnr0 pnr0Var = zvq0Var.g;
                    zvq0Var.f = null;
                    zvq0Var.g = null;
                    fvn0Var.f(pnr0Var);
                    xun0 xun0VarH = zvq0Var.a.h();
                    vun0 vun0Var = xun0VarH instanceof vun0 ? (vun0) xun0VarH : null;
                    if (vun0Var != null && (zf30Var = vun0Var.a) != null) {
                        fvn0Var.a(zf30Var, 1, true);
                    }
                }
                return rih1Var;
            case 16:
                rj41 rj41Var = (rj41) obj;
                qtq qtqVar = (qtq) ((ptq) ((lyc) this).receiver).a.c;
                return new bjr0(qtqVar.a.c(), (t7h1) qtqVar.c.get(), qtqVar.a.a(), (Flowable) qtqVar.k.get(), cto1.q(krw0.i), rj41Var);
            case 17:
                q151 q151Var = (q151) obj;
                g931 g931Var = ((d751) ((lyc) this).receiver).a;
                ((y451) g931Var.c).d(q151Var);
                u551 u551Var = (u551) g931Var.d;
                if (u551Var != null) {
                    u551Var.U(q151Var);
                    return rih1Var;
                }
                u890.C("mobiusViewModel");
                throw null;
            case 18:
                Function0 function0 = (Function0) obj;
                air0 air0Var = (air0) ((lyc) this).receiver;
                if (air0Var.t.Z.e().e() == l3r.c) {
                    function0.invoke();
                } else {
                    air0Var.Z.add(function0);
                }
                return rih1Var;
            case 19:
                ((qbs0) ((lyc) this).receiver).Z0().U(new r200(((ics0) obj).a));
                return rih1Var;
            case 20:
                yqw0 yqw0Var = (brw0) obj;
                qbs0 qbs0Var = (qbs0) ((lyc) this).receiver;
                qbs0Var.getClass();
                if (yqw0Var instanceof yqw0) {
                    MobiusLoopViewModel mobiusLoopViewModelZ0 = qbs0Var.Z0();
                    jj80 jj80Var = yqw0Var.a;
                    if (jj80Var instanceof jj80) {
                        tyzVar2 = new wyz(jj80Var.b, jj80Var.a);
                    } else if (jj80Var instanceof hj80) {
                        tyzVar2 = new uyz(((hj80) jj80Var).b, ((hj80) jj80Var).a);
                    } else {
                        if (!(jj80Var instanceof ij80)) {
                            eg.o();
                            return null;
                        }
                        tyzVar2 = new tyz(((ij80) jj80Var).a);
                    }
                    mobiusLoopViewModelZ0.U(tyzVar2);
                } else if (yqw0Var instanceof xqw0) {
                    MobiusLoopViewModel mobiusLoopViewModelZ1 = qbs0Var.Z0();
                    aav aavVar = ((xqw0) yqw0Var).a;
                    if (aavVar instanceof bav) {
                        tyzVar = new uyz(((bav) aavVar).b, ((bav) aavVar).a);
                    } else {
                        if (!(aavVar instanceof aav)) {
                            eg.o();
                            return null;
                        }
                        tyzVar = new tyz(aavVar.a);
                    }
                    mobiusLoopViewModelZ1.U(tyzVar);
                } else if (yqw0Var instanceof vqw0) {
                    MobiusLoopViewModel mobiusLoopViewModelZ2 = qbs0Var.Z0();
                    o4g o4gVar = ((vqw0) yqw0Var).a;
                    mobiusLoopViewModelZ2.U(new uyz(o4gVar.b, o4gVar.a));
                } else if (yqw0Var instanceof uqw0) {
                    MobiusLoopViewModel mobiusLoopViewModelZ3 = qbs0Var.Z0();
                    ivf ivfVar = ((uqw0) yqw0Var).a;
                    mobiusLoopViewModelZ3.U(new uyz(ivfVar.b, String.valueOf(ivfVar.a)));
                } else if (yqw0Var instanceof wqw0) {
                    qbs0Var.Z0().U(fyz.a);
                } else {
                    boolean z3 = yqw0Var instanceof zqw0;
                    c500 c500Var = c500.a;
                    if (z3) {
                        qbs0Var.Z0().U(c500Var);
                    } else {
                        if (!(yqw0Var instanceof arw0)) {
                            eg.o();
                            return null;
                        }
                        ces0 ces0Var = ((arw0) yqw0Var).a;
                        if (ces0Var instanceof aes0) {
                            aes0 aes0Var = (aes0) ces0Var;
                            qbs0Var.Z0().U(new b300(((ecs0) qbs0Var.Z0().V()).q(), aes0Var.a, aes0Var.b));
                        } else if (ces0Var instanceof zds0) {
                            qbs0Var.Z0().U(new a300(((ecs0) qbs0Var.Z0().V()).q()));
                        } else if (ces0Var instanceof yds0) {
                            qbs0Var.Z0().U(c500Var);
                        } else if (ces0Var instanceof bes0) {
                            bes0 bes0Var = (bes0) ces0Var;
                            qbs0Var.Z0().U(new w200(bes0Var.a, bes0Var.b));
                        } else if (ces0Var instanceof wds0) {
                            qbs0Var.Z0().U(new tyz(((wds0) ces0Var).a));
                        } else if (ces0Var instanceof uds0) {
                            qbs0Var.Z0().U(new u200(((ecs0) qbs0Var.Z0().V()).q(), ((uds0) ces0Var).a));
                        } else if (ces0Var instanceof tds0) {
                            qbs0Var.Z0().U(new t200(((ecs0) qbs0Var.Z0().V()).q()));
                        } else if (ces0Var instanceof vds0) {
                            qbs0Var.Z0().U(new v200(((vds0) ces0Var).a));
                        } else {
                            if (!(ces0Var instanceof xds0)) {
                                eg.o();
                                return null;
                            }
                            qbs0Var.Z0().U(new y200(((ecs0) qbs0Var.Z0().V()).q()));
                        }
                    }
                }
                return rih1Var;
            case 21:
                int i2 = ((yx20) obj).a;
                ((nxs0) ((lyc) this).receiver).getClass();
                return lz20.b;
            case 22:
                KeyEvent keyEvent = ((cpa0) obj).a;
                nxs0 nxs0Var = (nxs0) ((lyc) this).receiver;
                nxs0Var.getClass();
                if (ern1.t(keyEvent) == 2) {
                    long jD = mno1.d(keyEvent.getKeyCode());
                    if (toa0.a(jD, toa0.q)) {
                        zA = nxs0Var.a(keyEvent.isShiftPressed() ? 33 : 130);
                    } else if (toa0.a(jD, toa0.f)) {
                        zA = nxs0Var.a(130);
                    } else if (toa0.a(jD, toa0.e)) {
                        zA = nxs0Var.a(33);
                    }
                }
                return Boolean.valueOf(zA);
            case 23:
                ((snc0) ((lyc) this).receiver).a((qnc0) obj);
                return rih1Var;
            case 24:
                hot0 hot0Var = (hot0) obj;
                lot0 lot0Var = (lot0) ((lyc) this).receiver;
                lot0Var.getClass();
                boolean z4 = hot0Var.b;
                String str = hot0Var.a;
                return new x010(lot0Var.a.h.o(str), z4 ? new yv8(lot0Var.d.b(str), (byte) 7) : new huz(Boolean.FALSE, (byte) 10), new vm0(3, (lnm) null, (byte) 24), (byte) 1);
            case 25:
                oqt0 oqt0Var = (oqt0) obj;
                PlayProgressBarView playProgressBarView = (PlayProgressBarView) ((lyc) this).receiver;
                int i3 = PlayProgressBarView.X0;
                r0s0 r0s0Var = playProgressBarView.T0;
                boolean z5 = oqt0Var.b;
                float f = oqt0Var.c;
                if (z5 || (f > 0.0f && (f < 1.0d || !oqt0Var.a))) {
                    ((ProgressBar) r0s0Var.c).setProgress(jch0.U(f * 100.0f));
                    ((ProgressBar) r0s0Var.c).setVisibility(0);
                } else {
                    ((ProgressBar) r0s0Var.c).setVisibility(8);
                }
                return rih1Var;
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PlayProgressBarView playProgressBarView2 = (PlayProgressBarView) ((lyc) this).receiver;
                int i4 = PlayProgressBarView.X0;
                ((IconCheckAltFill) playProgressBarView2.T0.b).setVisibility(zBooleanValue ? 0 : 8);
                return rih1Var;
            case 27:
                oqt0 oqt0Var2 = (oqt0) obj;
                PlayProgressBarView playProgressBarView3 = (PlayProgressBarView) ((lyc) this).receiver;
                int i5 = PlayProgressBarView.X0;
                EncoreTextView encoreTextView = (EncoreTextView) playProgressBarView3.T0.d;
                int i6 = oqt0Var2.d;
                encoreTextView.setText(i6 == 2 ? encoreTextView.getContext().getString(2131956038) : encoreTextView.getContext().getString(2131959880));
                encoreTextView.setTextColor(xfo1.r(encoreTextView, oqt0Var2.e.b));
                if (oqt0Var2.a && i6 != 3) {
                    i = 0;
                }
                encoreTextView.setVisibility(i);
                return rih1Var;
            case 28:
                ((q590) ((lyc) this).receiver).A0((iu30) obj);
                return rih1Var;
            default:
                cbu0 cbu0Var = (cbu0) obj;
                acu0 acu0Var = (acu0) ((lyc) this).receiver;
                if (acu0Var.f.remove(cbu0Var)) {
                    acu0Var.d++;
                    z = true;
                } else {
                    z = false;
                }
                try {
                    if (acu0Var.c && z) {
                        try {
                            new yt3("MultiPlayer.PlayerPool.reserve", (byte) 5).invoke();
                        } catch (Exception | LinkageError unused) {
                            z2 = false;
                        }
                        try {
                            w590 w590Var = cbu0Var.c;
                            if (w590Var != null) {
                                acu0Var.e.add(w590Var);
                            }
                            if (z2) {
                                new sjf1().invoke();
                            }
                            break;
                        } catch (Throwable th) {
                            if (!z2) {
                                throw th;
                            }
                            try {
                                new sjf1().invoke();
                                throw th;
                            } catch (Exception | LinkageError unused2) {
                                throw th;
                            }
                        }
                    } else {
                        try {
                            new yt3("MultiPlayer.PlayerPool.release", (byte) 5).invoke();
                        } catch (Exception | LinkageError unused3) {
                            z2 = false;
                        }
                        try {
                            w590 w590Var2 = cbu0Var.c;
                            if (w590Var2 != null) {
                                w590Var2.q();
                            }
                            if (z2) {
                                new sjf1().invoke();
                            }
                            break;
                        } catch (Throwable th2) {
                            if (!z2) {
                                throw th2;
                            }
                            try {
                                new sjf1().invoke();
                                throw th2;
                            } catch (Exception | LinkageError unused4) {
                                throw th2;
                            }
                        }
                    }
                    break;
                } catch (Exception | LinkageError unused5) {
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wao0() {
        super(1, yiq0.a, yiq0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0);
        this.a = (byte) 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wao0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wao0(air0 air0Var) {
        super(1, air0Var, air0.class, "runWhenUIHolderLoaded", "runWhenUIHolderLoaded(Lkotlin/jvm/functions/Function0;)V", 0);
        this.a = (byte) 18;
    }
}
