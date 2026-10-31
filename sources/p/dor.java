package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dor extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dor(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        wpw wpwVarT;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((aod) ((vun) obj).b).i());
            case 1:
                return flo1.l(((tor) obj).c, guo1.B());
            case 2:
                Context context = ((err) obj).a;
                Drawable drawable = context.getDrawable(2131231458);
                if (drawable == null) {
                    hhg1.n("Icon drawable resource must be valid");
                    return null;
                }
                int iO = ago1.o(context, 2130968791, 0);
                int iO2 = ago1.o(context, 2130968769, 0);
                drawable.setTint(iO);
                return new x10(drawable, 0.33f, iO2, (byte) 2);
            case 3:
                atr atrVar = (atr) obj;
                return nln.w(nln.x(tsr.b, nln.v(new ptj(1, atrVar, atr.class, "renderTitle", "renderTitle(Ljava/lang/String;)V", 0, (byte) 29))), nln.x(vsr.b, nln.v(new wsr(1, atrVar, atr.class, "renderSubtitle", "renderSubtitle(Ljava/lang/String;)V", 0, (byte) 0))), nln.x(xsr.b, nln.v(new wsr(1, atrVar, atr.class, "renderArtwork", "renderArtwork(Lcom/spotify/nowplayingqueue/uiusecases/currenttrackrow/ArtworkData;)V", 0, (byte) 1))), nln.x(ysr.b, nln.v(new wsr(1, atrVar, atr.class, "renderEnhancedBadge", "renderEnhancedBadge(Z)V", 0, (byte) 2))), nln.x(zsr.b, nln.v(new ptj(1, atrVar, atr.class, "renderQueuedBadge", "renderQueuedBadge(Z)V", 0, (byte) 23))), nln.x(osr.b, nln.v(new ptj(1, atrVar, atr.class, "renderVideoBadge", "renderVideoBadge(Z)V", 0, (byte) 24))), nln.x(psr.b, nln.v(new ptj(1, atrVar, atr.class, "renderContentRestriction", "renderContentRestriction(Lcom/spotify/encoreconsumermobile/elements/badge/contentrestriction/ContentRestriction;)V", 0, (byte) 25))), nln.x(qsr.b, nln.v(new ptj(1, atrVar, atr.class, "renderPlayIndicator", "renderPlayIndicator(Lcom/spotify/reprise/playindicator/PlayIndicatorState;)V", 0, (byte) 26))), nln.x(rsr.b, nln.v(new ptj(1, atrVar, atr.class, "renderFaces", "renderFaces(Ljava/util/List;)V", 0, (byte) 27))), nln.x(ssr.b, nln.v(new ptj(1, atrVar, atr.class, "renderMixingMetadata", "renderMixingMetadata(Lcom/spotify/nowplayingqueue/uiusecases/common/MixingMetadata;)V", 0, (byte) 28))), nln.x(usr.b, nln.v(new m4r(atrVar, (byte) 16))));
            case 4:
                byp bypVar = (byp) obj;
                c9c0 c9c0Var = (c9c0) bypVar.d;
                zob1 zob1VarAvailable = c9c0Var.c.available();
                zob1 zob1VarCurrent = c9c0Var.b.current();
                wef wefVar = new wef(yoi1.g(((g0l) bypVar.b).j()), (byte) 22);
                boolean zA = ((lbq) bypVar.a).a();
                z6x z6xVar = z6x.a;
                return d5p1.t(r4p1.k(h5p1.q(zob1VarAvailable, zob1VarCurrent, wefVar, zA ? ((hir) bypVar.c).h : new huz(z6xVar, (byte) 10), d5p1.h(((sfr) bypVar.e).c), new ytr(bypVar, null, (byte) 0)), 500L), (llm) bypVar.h, new alb1(0L, Long.MAX_VALUE), ((iir) bypVar.g).l(z6xVar, (pp90) null, z6xVar, z6xVar, z6xVar, b7x.a, 1));
            case 5:
                return (wzq) obj;
            case 6:
                return (jpg0) obj;
            case 7:
                return Integer.valueOf(((Context) ((nwr) obj).c).getResources().getDimensionPixelSize(2131165283));
            case 8:
                k9r k9rVar = (k9r) obj;
                ww40 ww40VarB = xw40.b((Context) k9rVar.b, (ViewGroup) k9rVar.c);
                ww40VarB.getClass();
                View view = ww40VarB.a;
                view.setVisibility(8);
                view.setBackgroundColor(0);
                view.setId(2131431616);
                return ww40VarB;
            case 9:
                zwr zwrVar = (zwr) obj;
                return new kpg0(((bzo) zwrVar.f).a(new dgy(6, 56, (Integer) null)), new qrk(zwrVar, (byte) 11));
            case 10:
                ViewStub viewStub = (ViewStub) ((wj3) ((yir) obj).b).O0;
                viewStub.setLayoutResource(2131624520);
                return viewStub.inflate();
            case 11:
                return Boolean.valueOf(((saz) obj).c <= 0.0f);
            case 12:
                return Boolean.valueOf(((z0t) ((gfr) obj).c).a.a());
            case 13:
                wzr wzrVar = (wzr) obj;
                return wzrVar.g.a(wzrVar.b, new wsr(1, wzrVar, wzr.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, (byte) 5));
            case 14:
                return Boolean.valueOf(((jde0) ((ogr) obj).b).a.h(kde0.a, false));
            case 15:
                return (mwh0) ((p7s) obj).b.get();
            case 16:
                return (aej0) ((l8s) obj).b.get();
            case 17:
                was wasVar = (was) ((oas) obj).b.get();
                yl1 yl1Var = wasVar.d;
                dxy dxyVar = wasVar.g;
                xfx xfxVar = wasVar.a;
                sap sapVar = wasVar.b;
                vm4 vm4Var = wasVar.C;
                ye51 ye51Var = new ye51(vm4Var.b() ? dxyVar.t(new uas(wasVar, (byte) 1), new uas(wasVar, (byte) 4), 3) : ((s691) wasVar.j.get()).a(voo1.s(xfxVar)), vm4Var.b() ? dxyVar.t(new uas(wasVar, (byte) 5), new uas(wasVar, (byte) 6), 3) : ((k691) wasVar.k.get()).a(voo1.r(xfxVar)));
                wpw wpwVarT2 = vm4Var.b() ? dxyVar.t(new uas(wasVar, (byte) 7), new uas(wasVar, (byte) 8), 3) : ((dm91) wasVar.h.get()).a(voo1.v(xfxVar), false);
                if (vm4Var.b()) {
                    wpwVarT = dxyVar.t(new uas(wasVar, (byte) 9), new uas(wasVar, (byte) 10), 3);
                } else {
                    Object obj2 = wasVar.l.get();
                    obj2.getClass();
                    wpwVarT = (wpw) obj2;
                }
                ye51 ye51Var2 = new ye51(wpwVarT2, wpwVarT);
                wpw wpwVarT3 = vm4Var.b() ? dxyVar.t(new uas(wasVar, (byte) 11), new uas(wasVar, (byte) 0), 1) : new jpg0(((mo51) wasVar.e.get()).a(voo1.t(xfxVar, (xzf1) null)), c6s.h);
                jpg0 jpg0Var = new jpg0(yl1Var.a(voo1.i(xfxVar)), c6s.i);
                jpg0 jpg0Var2 = new jpg0(yl1Var.a(voo1.i(xfxVar)), c6s.t);
                p410 p410Var = wasVar.i;
                uo5 uo5Var = new uo5(jpg0Var, jpg0Var2, new sbk((Flowable) p410Var.b, (w9u0) p410Var.c, (ip91) p410Var.d, (mzr0) p410Var.e, (jo91) p410Var.f, (sas) p410Var.g, new fcs(xfxVar.a.a, (byte) 0), (g7h) p410Var.h), (byte) 17);
                bs0 bs0VarA = wasVar.t.a(voo1.o(xfxVar));
                im0 im0VarA = o671.a(wasVar.r, voo1.u(xfxVar));
                v3i0 v3i0Var = wasVar.s;
                eyh0 eyh0Var = new eyh0(bs0VarA, im0VarA, f6o1.A(new z3i0(v3i0Var.a, v3i0Var.b, v3i0Var.c, v3i0Var.d, v3i0Var.e, true), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (byte) 7);
                lzd lzdVar = new lzd(lkf1.c, (Object) null);
                mr20 mr20Var = wasVar.D;
                List listM = p7h.M(new lzd[]{lzdVar, new lzd(lkf1.b, mr20Var), new lzd(lkf1.a, mr20Var), new lzd(lkf1.g, (Object) null)});
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new wzq(wasVar.u.a(), c6s.X));
                smc0VarN.add(new jpg0(f6o1.A(duy.a(wasVar.q, 3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), c6s.Y));
                smc0VarN.add(new wzq(fdg1.m0(vsy.a(wasVar.E), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), c6s.Z));
                return sapVar.a(ye51Var, ye51Var2, wpwVarT3, uo5Var, eyh0Var, listM, new xq60(k4p1.k(smc0VarN)), wasVar.c.a(), new bjx(new vas(wasVar, (byte) 0), c6s.N0, c6s.O0, c6s.P0, c6s.Q0, c6s.R0, (byte) 18), new a5p0(wasVar.w, wasVar.x, wasVar.v), new uas(wasVar, (byte) 2), new uas(wasVar, (byte) 3));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (i8h1) ((tas) obj).b.get();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                av1 av1Var = (av1) ((pbq) obj).h;
                ey1 ey1Var = av1Var.i;
                ey1 ey1Var2 = ey1Var instanceof ey1 ? ey1Var : null;
                if (ey1Var2 != null) {
                    return new zpa1(av1Var.e, av1Var.d, ey1Var2.a);
                }
                return null;
            case 20:
                ((dgs) obj).q.onNext(v7v0.a);
                return rih1.a;
            case 21:
                return (e5a0) d5p1.h(((p5a0) obj).c).a.getValue();
            case 22:
                wyr wyrVar = (wyr) obj;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from((Context) wyrVar.b).inflate(2131625457, (ViewGroup) null, false);
                int i = 2131428563;
                EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131428563);
                if (encoreTextViewT != null) {
                    i = 2131428564;
                    EditText editText = (EditText) m5n1.t(constraintLayoutInflate, 2131428564);
                    if (editText != null) {
                        i = 2131428565;
                        View viewT = m5n1.t(constraintLayoutInflate, 2131428565);
                        if (viewT != null) {
                            i = 2131428566;
                            EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428566);
                            if (encoreButtonT != null) {
                                i = 2131428567;
                                EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131428567);
                                if (encoreTextViewT2 != null) {
                                    oxw0 oxw0Var = new oxw0(constraintLayoutInflate, encoreTextViewT, editText, viewT, encoreButtonT, encoreTextViewT2);
                                    editText.addTextChangedListener(new p96(wyrVar, (byte) 6));
                                    return oxw0Var;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                return null;
            case 23:
                Context context2 = ((kis) obj).b;
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context2).inflate(2131625458, (ViewGroup) null, false);
                int i2 = 2131428569;
                EncoreTextView encoreTextViewT3 = m5n1.t(constraintLayoutInflate2, 2131428569);
                if (encoreTextViewT3 != null) {
                    i2 = 2131428570;
                    EncoreTextView encoreTextViewT4 = m5n1.t(constraintLayoutInflate2, 2131428570);
                    if (encoreTextViewT4 != null) {
                        i2 = 2131428571;
                        FaceView faceViewT = m5n1.t(constraintLayoutInflate2, 2131428571);
                        if (faceViewT != null) {
                            i2 = 2131428572;
                            EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate2, 2131428572);
                            if (encoreButtonT2 != null) {
                                i2 = 2131428573;
                                EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate2, 2131428573);
                                if (encoreButtonT3 != null) {
                                    i2 = 2131428574;
                                    EncoreTextView encoreTextViewT5 = m5n1.t(constraintLayoutInflate2, 2131428574);
                                    if (encoreTextViewT5 != null) {
                                        uxw0 uxw0Var = new uxw0(constraintLayoutInflate2, encoreTextViewT3, encoreTextViewT4, faceViewT, encoreButtonT2, encoreButtonT3, encoreTextViewT5);
                                        b8k1.m(faceViewT, fg.g, context2.getText(2131960463), (sh) null);
                                        b8k1.p(faceViewT, new zdc((byte) 6));
                                        return uxw0Var;
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i2)));
                return null;
            case 24:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(((kis) obj).b).inflate(2131625459, (ViewGroup) null, false);
                int i3 = 2131430220;
                EncoreTextView encoreTextViewT6 = m5n1.t(constraintLayoutInflate3, 2131430220);
                if (encoreTextViewT6 != null) {
                    i3 = 2131430222;
                    EncoreTextView encoreTextViewT7 = m5n1.t(constraintLayoutInflate3, 2131430222);
                    if (encoreTextViewT7 != null) {
                        i3 = 2131430224;
                        FaceView faceViewT2 = m5n1.t(constraintLayoutInflate3, 2131430224);
                        if (faceViewT2 != null) {
                            i3 = 2131430226;
                            EncoreButton encoreButtonT4 = m5n1.t(constraintLayoutInflate3, 2131430226);
                            if (encoreButtonT4 != null) {
                                i3 = 2131430227;
                                EncoreButton encoreButtonT5 = m5n1.t(constraintLayoutInflate3, 2131430227);
                                if (encoreButtonT5 != null) {
                                    i3 = 2131430228;
                                    EncoreTextView encoreTextViewT8 = m5n1.t(constraintLayoutInflate3, 2131430228);
                                    if (encoreTextViewT8 != null) {
                                        return new szw0(constraintLayoutInflate3, encoreTextViewT6, encoreTextViewT7, faceViewT2, encoreButtonT4, encoreButtonT5, encoreTextViewT8);
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i3)));
                return null;
            case 25:
                ConstraintLayout constraintLayoutInflate4 = LayoutInflater.from(((kis) obj).b).inflate(2131625460, (ViewGroup) null, false);
                int i4 = 2131430676;
                EncoreTextView encoreTextViewT9 = m5n1.t(constraintLayoutInflate4, 2131430676);
                if (encoreTextViewT9 != null) {
                    i4 = 2131430677;
                    EncoreTextView encoreTextViewT10 = m5n1.t(constraintLayoutInflate4, 2131430677);
                    if (encoreTextViewT10 != null) {
                        i4 = 2131430678;
                        EncoreButton encoreButtonT6 = m5n1.t(constraintLayoutInflate4, 2131430678);
                        if (encoreButtonT6 != null) {
                            i4 = 2131430679;
                            FaceView faceViewT3 = m5n1.t(constraintLayoutInflate4, 2131430679);
                            if (faceViewT3 != null) {
                                i4 = 2131430681;
                                EncoreProgressIndicatorButton encoreProgressIndicatorButtonT = m5n1.t(constraintLayoutInflate4, 2131430681);
                                if (encoreProgressIndicatorButtonT != null) {
                                    i4 = 2131430682;
                                    EncoreTextView encoreTextViewT11 = m5n1.t(constraintLayoutInflate4, 2131430682);
                                    if (encoreTextViewT11 != null) {
                                        return new c0x0(constraintLayoutInflate4, encoreTextViewT9, encoreTextViewT10, encoreButtonT6, faceViewT3, encoreProgressIndicatorButtonT, encoreTextViewT11);
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate4.getResources().getResourceName(i4)));
                return null;
            case 26:
                return ((cks) obj).c.p0().b.e;
            case 27:
                q8n q8nVar = ((jks) obj).d;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return flo1.l(q8nVar, j0d1VarB);
            case 28:
                return (voq) ((jly0) new tjq(((wks) obj).a).e).get();
            default:
                bns bnsVar = (bns) obj;
                return new vap((ans) bnsVar.a.get(), bnsVar.b);
        }
    }
}
