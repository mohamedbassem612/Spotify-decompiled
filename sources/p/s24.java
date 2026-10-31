package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.video.VideoBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.share.ShareButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.playlistmixing.proto.BackendTransition;
import com.spotify.playlistmixing.proto.ExplicitFeedback;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s24 implements phv, o8g1, or60, iwt0 {
    public Object N0;
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public s24(d0r d0rVar, cbk0 cbk0Var, kkg1 kkg1Var, rxj0 rxj0Var, z6k0 z6k0Var, ank0 ank0Var, xrc0 xrc0Var) {
        this.a = (byte) 13;
        this.b = d0rVar;
        this.c = cbk0Var;
        this.d = kkg1Var;
        this.e = rxj0Var;
        this.f = ank0Var;
        this.g = xrc0Var;
        jd11 jd11Var = rc11.a;
        this.h = w3p1.o(new l4r(new xv00(jd11Var.b(mig1.class)), 1, b980.V0, new j4r(b980.P0), b980.W0), b980.Q0);
        this.i = w3p1.o(new l4r(pwc0.o, 1, b980.X0, new j4r(b980.h), b980.Y0), b980.i);
        this.t = w3p1.o(new l4r(new xv00(jd11Var.b(hll.class)), 1, b980.Z0, new j4r(b980.t), b980.a1), b980.X);
        hvm hvmVar = hvm.c;
        this.X = w3p1.o(new l4r(hvmVar, 1, b980.b1, new j4r(new sc80(this, (byte) 0)), b980.c1), b980.Y);
        this.Y = w3p1.o(new l4r(hvmVar, 2, b980.R0, new j4r(new sc80(this, (byte) 1)), b980.S0), b980.Z);
        this.Z = w3p1.o(new l4r(pwc0.b, 2, b980.T0, new j4r(b980.N0), b980.U0), b980.O0);
        this.N0 = new idd1(new nd70(this, (byte) 12));
    }

    public static boolean M(lhg1 lhg1Var, lhg1 lhg1Var2) {
        ruq0 ruq0Var = lhg1Var.b;
        String str = ruq0Var.c;
        ruq0 ruq0Var2 = lhg1Var2.b;
        if (u890.j(str, ruq0Var2.c) && u890.j(ruq0Var.d, ruq0Var2.d)) {
            return true;
        }
        String str2 = ruq0Var.e;
        String str3 = ruq0Var.f;
        String str4 = ruq0Var2.e;
        String str5 = ruq0Var2.f;
        return (str2.length() == 0 || str3.length() == 0 || str4.length() == 0 || str5.length() == 0 || !str2.equals(str4) || !str3.equals(str5)) ? false : true;
    }

    public static /* bridge */ /* synthetic */ p1f0 n(s24 s24Var) {
        return (p1f0) s24Var.e;
    }

    public static final /* synthetic */ Flowable p(s24 s24Var) {
        return (Flowable) s24Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x019a A[Catch: all -> 0x019f, TryCatch #0 {all -> 0x019f, blocks: (B:96:0x0185, B:99:0x018c, B:103:0x0194, B:105:0x019a, B:113:0x01ac), top: B:211:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ac A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #0 {all -> 0x019f, blocks: (B:96:0x0185, B:99:0x018c, B:103:0x0194, B:105:0x019a, B:113:0x01ac), top: B:211:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:161:0x0262  */
    /* JADX WARN: Code duplicated, block: B:211:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0180 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x01ac, please report this as an issue */
    public static kak0 w(s24 s24Var, nig1 nig1Var, lhg1 lhg1Var, lhg1 lhg1Var2, lhg1 lhg1Var3, lhg1 lhg1Var4, lhg1 lhg1Var5, boolean z, boolean z2, dbk0 dbk0Var, String str, Float f, Float f2, boolean z3, List list, smc0 smc0Var, List list2, int i) {
        lhg1 lhg1Var6;
        boolean z4;
        lhg1 lhg1VarA;
        lhg1 lhg1Var7;
        Float f3;
        boolean z5;
        ymk0 ymk0Var;
        int i2;
        int i3;
        xmk0 xmk0VarA;
        int i4;
        boolean z6;
        boolean z7;
        boolean z8;
        smc0 smc0VarN;
        boolean zIsEmpty;
        boolean z9;
        l8w0 l8w0Var;
        Integer num;
        Float f4 = (i & 1024) != 0 ? null : f;
        Float f5 = (i & 2048) != 0 ? null : f2;
        boolean z10 = (i & 4096) != 0 ? false : z3;
        boolean z11 = (i & 8192) == 0;
        boolean z12 = (i & 16384) != 0;
        List list3 = (32768 & i) != 0 ? z6x.a : list;
        smc0 smc0Var2 = (65536 & i) != 0 ? z6x.a : smc0Var;
        List list4 = (i & 131072) != 0 ? z6x.a : list2;
        lhg1 lhg1Var8 = lhg1Var5 == null ? lhg1Var4 : lhg1Var5;
        lhg1 lhg1Var9 = lhg1Var8 == null ? lhg1Var : lhg1Var8;
        double dFloatValue = f4 != null ? f4.floatValue() : 0.0d;
        double dFloatValue2 = f5 != null ? f5.floatValue() : 0.0d;
        lhg1 lhg1VarX = lhg1Var2 != null ? x(lhg1Var2, dFloatValue, dFloatValue2) : null;
        if (lhg1VarX != null) {
            ruq0 ruq0Var = lhg1VarX.b;
            z4 = z12;
            boolean z13 = ruq0Var.X == 1 && (num = ruq0Var.N0) != null && num.intValue() == 0;
            lhg1 lhg1Var10 = lhg1VarX;
            if (lhg1VarX.a.a == b8w0.b && (ruq0Var.O0 || z13)) {
                lhg1VarA = lhg1.a(lhg1Var10, (q6w0) null, lhg1Var9.b, false, false, 13);
                lhg1Var6 = lhg1Var10;
            } else {
                lhg1Var6 = lhg1Var10;
                lhg1VarA = lhg1Var6;
            }
        } else {
            lhg1Var6 = lhg1VarX;
            z4 = z12;
            lhg1VarA = null;
        }
        if (lhg1VarA == null) {
            lhg1VarA = lhg1Var8 == null ? lhg1Var : lhg1Var8;
        }
        lhg1 lhg1VarX2 = x(lhg1VarA, dFloatValue, dFloatValue2);
        long jH = jfv.h(((hll) u890.k(((d0r) s24Var.b).b(((o3r) s24Var.t).a(((cbk0) s24Var.c).b.a)), (d0r) null, (n4r) null)).a);
        lhg1 lhg1Var11 = lhg1Var6;
        long jH2 = jfv.h(((hll) u890.k(((d0r) s24Var.b).b(((o3r) s24Var.t).a(((cbk0) s24Var.c).c.a)), (d0r) null, (n4r) null)).a);
        cbk0 cbk0Var = (cbk0) s24Var.c;
        String str2 = cbk0Var.b.a;
        String str3 = cbk0Var.c.a;
        ank0 ank0Var = (ank0) s24Var.f;
        if (ank0Var.a.g0) {
            boolean z14 = lhg1Var3 == null;
            if (f4 == null || u890.h(f4, 1.0f)) {
                lhg1Var7 = lhg1Var8;
                f3 = f5;
                z5 = f5 == 0 || u890.h(f3, 1.0f);
                ymk0Var = ank0Var.b;
                rxj0 rxj0Var = ank0Var.a;
                i2 = rxj0Var.h0;
                i3 = rxj0Var.i0;
                synchronized (ymk0Var) {
                    if (i2 <= 0) {
                        try {
                            if (str2.length() != 0 && str3.length() != 0) {
                                xmk0VarA = ymk0Var.a(i3);
                                if (xmk0VarA != null) {
                                    i4 = xmk0VarA.b;
                                } else {
                                    i4 = 0;
                                }
                                if (i4 < i2) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (xmk0VarA != null) {
                                    if (xmk0VarA.c.contains(str2.length() + ":" + str2 + str3)) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                } else {
                                    z7 = true;
                                }
                                if (z6 || !z7) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    dFloatValue2 = dFloatValue2;
                    z8 = false;
                }
                smc0VarN = k4p1.n();
                if (z) {
                    smc0VarN.add(c3d1.a);
                }
                if (!z14) {
                    smc0VarN.add(c3d1.b);
                }
                if (!z5) {
                    smc0VarN.add(c3d1.c);
                }
                if (!z8) {
                    smc0VarN.add(c3d1.d);
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                zIsEmpty = smc0VarK.isEmpty();
                smc0VarK.toString();
            } else {
                lhg1Var7 = lhg1Var8;
                f3 = f5;
            }
            ymk0Var = ank0Var.b;
            rxj0 rxj0Var2 = ank0Var.a;
            i2 = rxj0Var2.h0;
            i3 = rxj0Var2.i0;
            synchronized (ymk0Var) {
                if (i2 <= 0) {
                    if (str2.length() != 0) {
                        xmk0VarA = ymk0Var.a(i3);
                        if (xmk0VarA != null) {
                            i4 = xmk0VarA.b;
                        } else {
                            i4 = 0;
                        }
                        if (i4 < i2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (xmk0VarA != null) {
                            if (xmk0VarA.c.contains(str2.length() + ":" + str2 + str3)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                        } else {
                            z7 = true;
                        }
                        if (z6) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        smc0VarN = k4p1.n();
                        if (z) {
                            smc0VarN.add(c3d1.a);
                        }
                        if (!z14) {
                            smc0VarN.add(c3d1.b);
                        }
                        if (!z5) {
                            smc0VarN.add(c3d1.c);
                        }
                        if (!z8) {
                            smc0VarN.add(c3d1.d);
                        }
                        smc0 smc0VarK2 = k4p1.k(smc0VarN);
                        zIsEmpty = smc0VarK2.isEmpty();
                        smc0VarK2.toString();
                    }
                }
                dFloatValue2 = dFloatValue2;
                z8 = false;
                smc0VarN = k4p1.n();
                if (z) {
                    smc0VarN.add(c3d1.a);
                }
                if (!z14) {
                    smc0VarN.add(c3d1.b);
                }
                if (!z5) {
                    smc0VarN.add(c3d1.c);
                }
                if (!z8) {
                    smc0VarN.add(c3d1.d);
                }
                smc0 smc0VarK3 = k4p1.k(smc0VarN);
                zIsEmpty = smc0VarK3.isEmpty();
                smc0VarK3.toString();
            }
        } else {
            lhg1Var7 = lhg1Var8;
            dFloatValue2 = dFloatValue2;
            f3 = f5;
            zIsEmpty = false;
        }
        ank0 ank0Var2 = (ank0) s24Var.f;
        int size = list4.size();
        if (ank0Var2.a.g0 && size >= 2 && ((f4 == null || u890.h(f4, 1.0f)) && (f3 == null || u890.h(f3, 1.0f)))) {
            if (lhg1Var3 != null) {
                ruq0 ruq0Var2 = lhg1Var3.b;
                String str4 = ruq0Var2.e;
                String str5 = ruq0Var2.f;
                ruq0 ruq0Var3 = lhg1Var9.b;
                String str6 = ruq0Var3.e;
                String str7 = ruq0Var3.f;
                if (str4.length() == 0 || str5.length() == 0 || str6.length() == 0 || str7.length() == 0 || !str4.equals(str6) || !str5.equals(str7)) {
                    z9 = false;
                }
            }
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z15 = (f4 == null || u890.h(f4, 1.0f)) && (f3 == null || u890.h(f3, 1.0f));
        odm0 odm0Var = (!zIsEmpty || list3.size() < 2) ? ndm0.a : new odm0(str2, list3, str3);
        int i5 = nig1Var.c;
        int i6 = nig1Var.d;
        double d = dFloatValue2;
        lhg1 lhg1VarX3 = x(lhg1Var9, dFloatValue, d);
        boolean z16 = z4;
        lhg1 lhg1VarX4 = x(lhg1Var, dFloatValue, d);
        lhg1 lhg1VarX5 = lhg1Var7 != null ? x(lhg1Var7, dFloatValue, d) : null;
        xx8 xx8Var = lhg1Var9 == lhg1Var ? xx8.a : xx8.b;
        Float f6 = nig1Var.b;
        boolean z17 = nig1Var.e;
        lhg1 lhg1Var12 = nig1Var.f;
        Boolean bool = nig1Var.g;
        rxj0 rxj0Var3 = (rxj0) s24Var.e;
        int i7 = rxj0Var3.B;
        boolean z18 = rxj0Var3.K;
        int i8 = (int) jH;
        int i9 = (int) jH2;
        lhg1 lhg1Var13 = (lhg1Var11 == null || (!ila0.u(lhg1Var11.a) && (!lhg1Var11.c || lhg1Var11.d))) ? null : lhg1VarX2;
        if (lhg1Var11 != null) {
            l8w0Var = (ila0.u(lhg1Var11.a) || (lhg1Var11.c && !lhg1Var11.d)) ? k8w0.a : new l8w0(lhg1Var11.a.a);
        } else {
            l8w0Var = j8w0.a;
        }
        l8w0 l8w0Var2 = l8w0Var;
        rxj0 rxj0Var4 = (rxj0) s24Var.e;
        return new kak0(z, dbk0Var, z2, z16, odm0Var, (Boolean) null, (ycu0) null, lhg1VarX3, lhg1VarX4, lhg1VarX5, xx8Var, smc0Var2, list4, z9, z15, f6, lhg1Var11, lhg1Var13, lhg1VarX2, (String) null, (String) null, (lhg1) null, l8w0Var2, false, i5, i6, rxj0Var4.g, rxj0Var4.k, rxj0Var4.h, i8, i9, 0, f4, f3, i7, z10, z11, str, z17, lhg1Var12, bool, (Integer) null, (lyj0) null, 0L, z18, -2135424928, 901151);
    }

    public static final lhg1 x(lhg1 lhg1Var, double d, double d2) {
        if (d <= 0.0d && d2 <= 0.0d) {
            return lhg1Var;
        }
        ruq0 ruq0Var = lhg1Var.b;
        return lhg1.a(lhg1Var, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, d > 0.0d ? d : ruq0Var.R0, d2 > 0.0d ? d2 : ruq0Var.S0, 131071), false, false, 13);
    }

    public rbx0 A() {
        return (rbx0) ((jly0) this.N0).get();
    }

    public toj0 B() {
        uwh uwhVarA = ((nwp) this.c).a.A();
        c8o.l(uwhVarA);
        return new toj0(uwhVarA, new lvc1((Flowable) ((jly0) this.f).get(), f2u0.D((Flowable) ((jly0) this.e).get())), (iac0) ((jly0) this.g).get());
    }

    public oi C() {
        nwp nwpVar = (nwp) this.c;
        b5s0 b5s0Var = (b5s0) ((daq) nwpVar.a.b).Rr.get();
        c8o.l(b5s0Var);
        return new oi(b5s0Var, (q8n) nwpVar.A.get(), s().b(), (byte) 13);
    }

    public xfx D() {
        xff xffVar = (xff) this.b;
        Context context = (Context) xffVar.c.a;
        c8o.l(context);
        gw70 gw70VarB = xffVar.b();
        c8o.l(gw70VarB);
        luk lukVar = (luk) xffVar.f.get();
        c8o.l(lukVar);
        new im4(false, lukVar);
        return new xfx(context, gw70VarB, new sua((byte) 9));
    }

    public zhy E() {
        vhy vhyVar = (vhy) ((teq) ((nwp) this.c).a.c).Ah.get();
        c8o.l(vhyVar);
        return vhyVar.a(new ruc0(((jly0) this.h).get(), (byte) 26));
    }

    public Completable F(String str, Bundle bundle, m210 m210Var) {
        int i;
        String string;
        dxu dxuVar = dxu.U0;
        eu4 eu4Var = (eu4) this.e;
        Flowable flowable = (Flowable) this.d;
        g510 g510Var = (g510) this.c;
        x610 x610Var = (x610) this.b;
        if (str.equals("PLAY")) {
            return x610Var.c().h(LoggingParams.EMPTY).ignoreElement().q(g510Var.j(m210Var).ignoreElement());
        }
        if (str.equals("PAUSE")) {
            return x610Var.c().d(j5.a).ignoreElement().q(g510Var.d(m210Var).ignoreElement());
        }
        if (str.equals("TURN_SHUFFLE_ON") || str.equals("TURN_SHUFFLE_OFF") || str.equals("TURN_SMART_SHUFFLE_OFF") || str.equals("TURN_SMART_SHUFFLE_ON") || str.equals("NEXT_SHUFFLE")) {
            ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable, flowable);
            g710 g710VarC = x610Var.c();
            return Observable.combineLatest(observableFromPublisherJ, new ObservableFromPublisher(g710VarC.a.J(c710.b).t(Functions.a)).switchMap(new bm00(g710VarC, (byte) 1)), yb10.O0).take(1L).singleOrError().flatMapCompletable(new j2e0(this, m210Var, (byte) 20));
        }
        boolean zH = false;
        if (str.equals("SKIP_TO_NEXT")) {
            g710 g710VarC2 = x610Var.c();
            g710VarC2.getClass();
            return g710VarC2.k.a(new l9u0()).doOnSuccess(new b710(g710VarC2, (byte) 0)).ignoreElement().q(g510Var.n(m210Var).ignoreElement());
        }
        if (str.equals("SKIP_TO_PREVIOUS")) {
            g710 g710VarC3 = x610Var.c();
            g710VarC3.getClass();
            return g710VarC3.k.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).doOnSuccess(new b710(g710VarC3, (byte) 1)).ignoreElement().q(g510Var.o(m210Var).ignoreElement());
        }
        if (str.equals("START_RADIO")) {
            String str2 = "";
            if (bundle != null && (string = bundle.getString("com.spotify.music.extra.CONTEXT_URI", "")) != null) {
                str2 = string;
            }
            if (str2.length() != 0) {
                Set set = s4b1.f;
                zH = uic.h(str2, new blc0[]{blc0.g1, blc0.u1, blc0.ti});
            }
            return zH ? h0(str2, m210Var) : new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new fad0(this, m210Var, (byte) 22));
        }
        if (str.equals("TURN_REPEAT_ALL_ON")) {
            return x610Var.c().k(2).ignoreElement().q(g510Var.g(m210Var).ignoreElement());
        }
        if (str.equals("TURN_REPEAT_ONE_ON")) {
            return x610Var.c().k(3).ignoreElement().q(g510Var.i(m210Var).ignoreElement());
        }
        if (str.equals("TURN_REPEAT_OFF")) {
            return x610Var.c().k(1).ignoreElement().q(g510Var.h(m210Var).ignoreElement());
        }
        if (str.equals("ADD_TO")) {
            return K(m210Var, eu4Var.a());
        }
        if (str.equals("ADD_TO_YOUR_EPISODES")) {
            return K(m210Var, false);
        }
        if (str.equals("CHECK_FILL")) {
            return K(m210Var, eu4Var.a());
        }
        if (str.equals("REMOVE_FROM_YOUR_EPISODES")) {
            return K(m210Var, false);
        }
        if (str.equals("SEEK_15_SECONDS_FORWARD")) {
            return y(1, m210Var);
        }
        if (str.equals("SEEK_15_SECONDS_BACK")) {
            return y(2, m210Var);
        }
        if (str.equals("SKIP_TO_NEXT_CHAPTER")) {
            return new FlowableSingleSingle(new FlowableTake(yoi1.h(((o791) ((idd1) this.N0).getValue()).c, o6x.a))).flatMapCompletable(new o3e0(x610Var.c(), this, m210Var, (byte) 22));
        }
        if (str.equals("PLAYBACK_SPEED")) {
            i = bundle != null ? bundle.getInt("com.spotify.music.extra.EPISODE_PLAYBACK_SPEED", 100) : 100;
            g710 g710VarC4 = x610Var.c();
            return ((pta1) g710VarC4.l.getValue()).c(g710VarC4.j, i).h(dxuVar).q(g510Var.b.u0().map(new sw9(g510Var, i, (byte) 7)).flatMap(new t64(i, m210Var, g510Var)).ignoreElement());
        }
        if (str.equals("NEXT_PLAYBACK_SPEED")) {
            if (!u890.j(m210Var.a, "wear_os")) {
                g710 g710VarC5 = x610Var.c();
                return t3k1.n((pta1) g710VarC5.l.getValue()).take(1L).singleOrError().flatMapCompletable(new o3e0(g710VarC5, this, m210Var, (byte) 23));
            }
            i = bundle != null ? bundle.getInt("com.spotify.music.extra.EPISODE_PLAYBACK_SPEED", 100) : 100;
            g710 g710VarC6 = x610Var.c();
            return ((pta1) g710VarC6.l.getValue()).c(g710VarC6.j, i).h(dxuVar).q(g510Var.b.u0().map(new sw9(g510Var, i, (byte) 7)).flatMap(new t64(i, m210Var, g510Var)).ignoreElement());
        }
        if (str.equals("SKIP_TO_NEXT_DISABLED") || str.equals("SKIP_TO_PREVIOUS_DISABLED") || str.equals("NO_ACTION") || str.equals("TOGGLE_REPEAT") || str.equals("TOGGLE_SHUFFLE")) {
            return CompletableEmpty.a;
        }
        if (str.equals("CHAPTER_LIST")) {
            return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new eb80(this, (byte) 24));
        }
        if (str.equals("SUMMON_DJ")) {
            Completable completableA = zq51.a(x610Var.c().f.a);
            uqk0 uqk0Var = g510Var.h;
            b7x b7xVar = b7x.a;
            return completableA.q(g510.q(g510Var, m210Var, new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), uqk0Var.c, uqk0Var.b, System.currentTimeMillis())).ignoreElement());
        }
        if (str.equals("BAN")) {
            return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new zud0(this, (byte) 9)).q(g510Var.b.u0().map(new ouz(g510Var, (byte) 3)).flatMap(new d510(g510Var, m210Var)).ignoreElement());
        }
        Logger.d(f4i1.f("Media action ", str, " is not supported"), new Object[0]);
        CompletableEmpty completableEmpty = CompletableEmpty.a;
        completableEmpty.getClass();
        return completableEmpty;
    }

    public Flowable G() {
        return ((Flowable) ((jly0) this.d).get()).j(mo9.O0);
    }

    public zsc H() {
        l8x0 l8x0Var = (l8x0) this.b;
        ccc0 ccc0Var = (ccc0) l8x0Var.w.get();
        c8o.l(ccc0Var);
        g7h g7hVar = (g7h) l8x0Var.x.get();
        c8o.l(g7hVar);
        uo5 uo5Var = new uo5(ccc0Var, g7hVar, new c4n0((q7r0) this.d));
        r630 r630Var = (r630) l8x0Var.h.get();
        c8o.l(r630Var);
        w430 w430Var = (w430) l8x0Var.t.get();
        c8o.l(w430Var);
        q8n q8nVar = (q8n) l8x0Var.d.get();
        c8o.l(q8nVar);
        return new zsc(uo5Var, r630Var, w430Var, q8nVar, (byte) 9);
    }

    public zmg0 I() {
        return (zmg0) ((hrr0) this.t).getValue();
    }

    public q24 J() {
        return (q24) this.g;
    }

    public Completable K(m210 m210Var, boolean z) {
        Flowable flowable = (Flowable) this.d;
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new jqd0(this, z, m210Var, (byte) 1));
    }

    public boolean L() {
        return ((hrr0) this.i).getValue() != null;
    }

    public boolean N(lhg1 lhg1Var, lhg1 lhg1Var2) {
        cbk0 cbk0Var = (cbk0) this.c;
        return kkg1.d(cbk0Var.c.a, cbk0Var.b.a, lhg1Var) && M(lhg1Var, lhg1Var2);
    }

    public b6e0 O() {
        nwp nwpVar = (nwp) this.c;
        w701 w701Var = (w701) ((teq) nwpVar.a.c).Fc.get();
        c8o.l(w701Var);
        uu00 uu00VarP = nwpVar.a.P();
        c8o.l(uu00VarP);
        return new b6e0(w701Var, uu00VarP, C(), (iac0) ((jly0) this.g).get(), (q8n) nwpVar.A.get(), s().b());
    }

    public Object P(String str, String str2, jwt0 jwt0Var) {
        Object objY = fn31.Y((q8n) this.X, new rwm0((Object) str2, (Object) this, (Object) "spotify:gatedcontent:bottomsheet:".concat(ihc1.V0(str, ':', str)), (lnm) null, (byte) 19), jwt0Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    public float Q(float f) {
        drr0 drr0Var = (drr0) this.Y;
        float fS = (Float.isNaN(drr0Var.s()) ? 0.0f : drr0Var.s()) + f;
        float fC = I().c();
        Float fE0 = o7h.E0(I().a.values());
        return yoi1.o(fS, fC, fE0 != null ? fE0.floatValue() : Float.NaN);
    }

    public FlowableMap R() {
        return f2u0.D((Flowable) ((jly0) this.d).get());
    }

    public aru0 S() {
        nwp nwpVar = (nwp) this.c;
        uwh uwhVarA = nwpVar.a.A();
        c8o.l(uwhVarA);
        em0 em0Var = nwpVar.a;
        gw70 gw70VarA0 = em0Var.a0();
        c8o.l(gw70VarA0);
        q8n q8nVarG0 = em0Var.g0();
        c8o.l(q8nVarG0);
        return new aru0(uwhVarA, gw70VarA0, q8nVarG0, (byte) 13);
    }

    public k8x0 T() {
        sbx0 sbx0Var = (sbx0) this.c;
        dkq dkqVar = (dkq) ((jly0) this.e).get();
        ekq ekqVar = (ekq) ((jly0) this.f).get();
        fkq fkqVar = (fkq) ((jly0) this.g).get();
        gkq gkqVar = (gkq) ((jly0) this.h).get();
        hkq hkqVar = (hkq) ((jly0) this.i).get();
        ikq ikqVar = (ikq) ((jly0) this.t).get();
        String str = sbx0Var.a;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        String strS = s4b1VarX.s();
        strS.getClass();
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal == 705) {
            s24 s24Var = (s24) gkqVar.a.c;
            Activity activityA = ((l8x0) s24Var.b).a();
            c8o.l(activityA);
            return new l830(strS, activityA, s24Var.m0(), s24Var.U(), (byte) 2);
        }
        if (iOrdinal == 706) {
            s24 s24Var2 = (s24) hkqVar.a.c;
            Activity activityA2 = ((l8x0) s24Var2.b).a();
            c8o.l(activityA2);
            j0a1 j0a1Var = (j0a1) ((l8x0) s24Var2.b).L.get();
            c8o.l(j0a1Var);
            return new fta(strS, activityA2, j0a1Var, s24Var2.U());
        }
        if (iOrdinal == 717) {
            s24 s24Var3 = (s24) dkqVar.a.c;
            Activity activityA3 = ((l8x0) s24Var3.b).a();
            c8o.l(activityA3);
            return new l830(strS, activityA3, s24Var3.m0(), s24Var3.U(), (byte) 0);
        }
        if (iOrdinal == 718) {
            s24 s24Var4 = (s24) ekqVar.a.c;
            Activity activityA4 = ((l8x0) s24Var4.b).a();
            c8o.l(activityA4);
            return new l830(strS, activityA4, s24Var4.m0(), s24Var4.U(), (byte) 1);
        }
        if (iOrdinal == 720) {
            s24 s24Var5 = (s24) ikqVar.a.c;
            Activity activityA5 = ((l8x0) s24Var5.b).a();
            c8o.l(activityA5);
            l8x0 l8x0Var = (l8x0) s24Var5.b;
            kwg1 kwg1Var = (kwg1) l8x0Var.J.get();
            c8o.l(kwg1Var);
            j0a1 j0a1Var2 = (j0a1) l8x0Var.L.get();
            c8o.l(j0a1Var2);
            tzr0 tzr0VarU = s24Var5.U();
            gdx0 gdx0Var = (gdx0) l8x0Var.v.get();
            c8o.l(gdx0Var);
            q8n q8nVar = (q8n) l8x0Var.e.get();
            c8o.l(q8nVar);
            return new p410(activityA5, kwg1Var, strS, j0a1Var2, tzr0VarU, gdx0Var, q8nVar);
        }
        if (iOrdinal != 723) {
            eg.f("No profile list page found for uri: ".concat(str));
            return null;
        }
        s24 s24Var6 = (s24) fkqVar.a.c;
        Activity activityA6 = ((l8x0) s24Var6.b).a();
        c8o.l(activityA6);
        cfi1 cfi1VarM0 = s24Var6.m0();
        tzr0 tzr0VarU2 = s24Var6.U();
        vwm1 vwm1Var = (vwm1) ((l8x0) s24Var6.b).R.get();
        c8o.l(vwm1Var);
        koy0 koy0Var = new koy0(vwm1Var);
        rpv0 rpv0Var = new rpv0((sbx0) s24Var6.c, (byte) 5);
        kl1 kl1Var = new kl1();
        kl1Var.b = strS;
        kl1Var.c = activityA6;
        kl1Var.d = cfi1VarM0;
        kl1Var.e = tzr0VarU2;
        kl1Var.f = koy0Var;
        kl1Var.a = strS.equals(((sbx0) rpv0Var.b).b);
        return kl1Var;
    }

    public tzr0 U() {
        l8x0 l8x0Var = (l8x0) this.b;
        Activity activityA = l8x0Var.a();
        c8o.l(activityA);
        zsc zscVarH = H();
        v5n v5nVar = (v5n) l8x0Var.y.get();
        c8o.l(v5nVar);
        gdx0 gdx0Var = (gdx0) l8x0Var.v.get();
        c8o.l(gdx0Var);
        return new tzr0(activityA, zscVarH, v5nVar, gdx0Var, (byte) 24);
    }

    public float V() {
        drr0 drr0Var = (drr0) this.Y;
        if (!Float.isNaN(drr0Var.s())) {
            return drr0Var.s();
        }
        eg.m("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object W(onm onmVar) {
        tc80 tc80Var;
        cbk0 cbk0Var = (cbk0) this.c;
        if (onmVar instanceof tc80) {
            tc80Var = (tc80) onmVar;
            int i = tc80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tc80Var.c = i - Integer.MIN_VALUE;
            } else {
                tc80Var = new tc80(this, onmVar);
            }
        } else {
            tc80Var = new tc80(this, onmVar);
        }
        Object objJ = tc80Var.a;
        int i2 = tc80Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objJ);
            if (cbk0Var.d == null) {
                return rih1Var;
            }
            rsc0 rsc0Var = (xrc0) this.g;
            rxc0 rxc0Var = new rxc0(cbk0Var.a);
            tc80Var.c = 1;
            objJ = rsc0Var.j(rxc0Var, tc80Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        ly21 ly21Var = (py21) objJ;
        ly21 ly21Var2 = ly21Var instanceof ly21 ? ly21Var : null;
        jy21 jy21Var = ly21Var2 != null ? ly21Var2.a : null;
        cbk0Var.k = ((jy21Var instanceof cy21) || (jy21Var instanceof gy21)) ? false : true;
        return rih1Var;
    }

    public Completable X(long j, m210 m210Var) {
        return ((g510) this.c).k(j, m210Var).map(ehh0.a).flatMap(new o0g(this, j, (byte) 6)).ignoreElement();
    }

    public void Y(es5 es5Var, String str) {
        a0(new Object[]{3, es5Var, str});
    }

    public void Z(int i, int i2, Object obj, String str) {
        a0(new Object[]{8, Integer.valueOf(i), Integer.valueOf(i2), obj, str});
    }

    public void a0(Object[] objArr) {
        ExecutorService executorService = (ExecutorService) this.d;
        if (executorService.isShutdown()) {
            return;
        }
        try {
            executorService.execute(new qub1(this, objArr, (byte) 17));
        } catch (RejectedExecutionException e) {
            if (executorService.isShutdown()) {
                return;
            }
            n57.g("Failed to execute :" + executorService.isShutdown() + ", " + executorService.isTerminated() + ", " + e.getMessage(), e);
        }
    }

    public void b() {
        p7s p7sVar = (p7s) this.c;
        p7sVar.c();
        owh0.b();
        irn1.m0(p7sVar.f, owh0.c().e()).size();
        ((ilr) this.i).b(m4e.i);
        l0();
    }

    public void b0(Object obj) {
        ((hrr0) this.h).setValue(obj);
    }

    public void c(String str) {
        pr31 pr31VarJ;
        hv40 hv40VarF;
        m0s m0sVar = (m0s) this.h;
        m0sVar.getClass();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-google-output-switcher";
        x6h1VarI.f = "3.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
        x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("member_device", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        m0sVar.a(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
        zfr zfrVar = (zfr) this.f;
        pr31 pr31Var = (pr31) this.Y;
        sn50 sn50VarO = pr31Var != null ? e130.o(pr31Var, (String) zfrVar.c) : null;
        if (sn50VarO == null || (pr31VarJ = zfrVar.j(str)) == null || !irn1.d0(sn50VarO, pr31VarJ)) {
            return;
        }
        iwh0 iwh0Var = sn50VarO.d;
        if (iwh0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        lwh0 lwh0Var = pr31VarJ.l;
        if (lwh0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        owh0.b();
        kv40 kv40VarC = owh0.c();
        kv40VarC.getClass();
        boolean zP = iwh0Var.p(lwh0Var);
        String str2 = lwh0Var.b;
        if (!zP || !Collections.unmodifiableList(((lwh0) iwh0Var).v).contains(lwh0Var)) {
            lwh0Var.toString();
        } else if (Collections.unmodifiableList(((lwh0) iwh0Var).v).size() > 1) {
            if (iwh0Var.f()) {
                mvh0 mvh0Var = kv40VarC.e;
                if (mvh0Var instanceof mvh0) {
                    mvh0Var.m(str2);
                } else {
                    eg.m("There is no currently selected dynamic group route.");
                }
            } else if (!iwh0Var.n() || (hv40VarF = kv40VarC.f(iwh0Var)) == null) {
                iwh0Var.toString();
            } else {
                hv40.a(hv40VarF).m(str2);
            }
        }
        l0();
    }

    public void c0(Object obj) {
        ((hrr0) this.i).setValue(obj);
    }

    public void d(int i) {
        gvh0 gvh0Var;
        ((y7l) this.d).b(i);
        gvh0 gvh0Var2 = (gvh0) this.Z;
        if (gvh0Var2 != null) {
            new ArrayList();
            new ArrayList();
            new HashSet();
            new ArrayList();
            Bundle bundle = new Bundle(gvh0Var2.a);
            ArrayList arrayListE = gvh0Var2.e();
            ArrayList arrayListB = gvh0Var2.b();
            HashSet hashSetA = gvh0Var2.a();
            List list = gvh0Var2.c;
            String str = gvh0Var2.b;
            bundle.putInt("volume", i);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            gvh0Var = new gvh0(str, bundle, list);
        } else {
            gvh0Var = null;
        }
        this.Z = gvh0Var;
        if (gvh0Var != null) {
            ihv ihvVar = (ihv) this.N0;
            this.N0 = ihvVar != null ? new ihv(gvh0Var, ihvVar.b) : null;
        }
        ihv ihvVar2 = (ihv) this.N0;
        if (ihvVar2 != null) {
            m4d m4dVar = (m4d) this.X;
            if (m4dVar != null) {
                m4dVar.invoke(ihvVar2);
            } else {
                u890.C("onDescriptorsChanged");
                throw null;
            }
        }
    }

    public no5 d0() {
        Context context = (Context) ((ku61) this.b).f.get();
        c8o.l(context);
        return new no5(context);
    }

    public void e(m4d m4dVar) {
        this.X = m4dVar;
        llm llmVar = (llm) this.t;
        fn31.T(llmVar, (o8n) null, 0, new f3e(this, (lnm) null, (byte) 0), 3);
        fn31.T(llmVar, (o8n) null, 0, new f3e(this, (lnm) null, (byte) 1), 3);
    }

    public Object e0(float f, a8d1 a8d1Var) throws Throwable {
        Object value = ((hrr0) this.h).getValue();
        Object objZ = z(V(), f, value);
        boolean zBooleanValue = ((Boolean) ((iu30) this.e).invoke(objZ)).booleanValue();
        hfn0 hfn0Var = hfn0.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (zBooleanValue) {
            Object objQ = q(objZ, hfn0Var, new k14(this, f, (lnm) null), a8d1Var);
            if (objQ != d9nVar) {
                objQ = rih1Var;
            }
            if (objQ == d9nVar) {
                return objQ;
            }
        } else {
            Object objQ2 = q(value, hfn0Var, new k14(this, f, (lnm) null), a8d1Var);
            if (objQ2 != d9nVar) {
                objQ2 = rih1Var;
            }
            if (objQ2 == d9nVar) {
                return objQ2;
            }
        }
        return rih1Var;
    }

    public boolean f(Intent intent, hwh0 hwh0Var) {
        jwh0 jwh0Var;
        nvh0 nvh0Var;
        pr31 pr31Var = (pr31) this.Y;
        rih1 rih1Var = null;
        if (pr31Var != null) {
            lwh0 lwh0Var = pr31Var.l;
            if (lwh0Var == null) {
                eg.m("Required value was null.");
                return false;
            }
            owh0.b();
            kv40 kv40VarC = owh0.c();
            nvh0 nvh0VarG = kv40VarC.g(lwh0Var);
            if ((nvh0VarG == null || !nvh0VarG.d(intent, hwh0Var)) && (((jwh0Var = kv40VarC.f) == null || lwh0Var != jwh0Var.f || (nvh0Var = jwh0Var.a) == null || !nvh0Var.d(intent, hwh0Var)) && hwh0Var != null)) {
                hwh0Var.a((String) null, (Bundle) null);
            }
            rih1Var = rih1.a;
        }
        return rih1Var != null;
    }

    public yp91 f0() {
        j3q j3qVar = (j3q) this.b;
        uvy uvyVar = (uvy) j3qVar.c.a.o5.get();
        c8o.l(uvyVar);
        luk lukVarA = j3qVar.a();
        c8o.l(lukVarA);
        yu4 yu4Var = new yu4(false, lukVarA);
        fns fnsVar = igu.a;
        return new yp91(R(), uvyVar, yu4Var, b3s.c);
    }

    public void g(List list) {
        Objects.toString(list);
    }

    public wh41 g0() {
        n9o0 n9o0Var = (n9o0) this.b;
        zxl zxlVar = (zxl) n9o0Var.w.get();
        c8o.l(zxlVar);
        kt91 kt91Var = (kt91) n9o0Var.u.get();
        c8o.l(kt91Var);
        return new wh41(zxlVar, kt91Var, xqu.a((jly0) this.X), false, (byte) 4);
    }

    public lr60 h() {
        return new lr60((sxo) ((jly0) this.Z).get(), (hnl) ((jly0) this.N0).get(), ((v5q) this.d).i(), new dn4((luk) ((daq) this.c).L1.get()));
    }

    public Completable h0(String str, m210 m210Var) {
        k710 k710Var = (k710) ((x610) this.b).a.i.get();
        CompletablePeek completablePeekH = new MaybeFlatMapCompletable(k710Var.b.a(str).singleOrError().observeOn(k710Var.a).filter(e710.O0).f(o810.O0), new yge0(this, m210Var, (byte) 17)).h(new dy40(str, (byte) 7));
        g510 g510Var = (g510) this.c;
        return completablePeekH.q(g510.q(g510Var, m210Var, g510Var.h.i(str)).ignoreElement());
    }

    public void i(String str) {
        pr31 pr31VarJ;
        hv40 hv40VarF;
        m0s m0sVar = (m0s) this.h;
        m0sVar.getClass();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-google-output-switcher";
        x6h1VarI.f = "3.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
        x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        x6h1 x6h1VarC = x6h1VarR.a().c();
        x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("member_device", str, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        m0sVar.a(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
        zfr zfrVar = (zfr) this.f;
        pr31 pr31Var = (pr31) this.Y;
        sn50 sn50VarO = pr31Var != null ? e130.o(pr31Var, (String) zfrVar.c) : null;
        if (sn50VarO == null || (pr31VarJ = zfrVar.j(str)) == null || !irn1.c0(sn50VarO, pr31VarJ)) {
            return;
        }
        iwh0 iwh0Var = sn50VarO.d;
        if (iwh0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        lwh0 lwh0Var = pr31VarJ.l;
        if (lwh0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        owh0.b();
        kv40 kv40VarC = owh0.c();
        kv40VarC.getClass();
        boolean zO = iwh0Var.o(lwh0Var);
        String str2 = lwh0Var.b;
        if (!zO || Collections.unmodifiableList(((lwh0) iwh0Var).v).contains(lwh0Var)) {
            lwh0Var.toString();
        } else if (iwh0Var.f()) {
            mvh0 mvh0Var = kv40VarC.e;
            if (mvh0Var instanceof mvh0) {
                mvh0Var.l(str2);
            } else {
                eg.m("There is no currently selected dynamic group route.");
            }
        } else if (!iwh0Var.n() || (hv40VarF = kv40VarC.f(iwh0Var)) == null) {
            iwh0Var.toString();
        } else {
            hv40.a(hv40VarF).l(str2);
        }
        l0();
    }

    public FlowableFilter i0() {
        return ((vqb1) ((jly0) this.f).get()).a().x(fmv.P0);
    }

    public void j(int i) {
        ((y7l) this.d).c(i);
    }

    public jqd0 j0() {
        nwp nwpVar = (nwp) this.c;
        zuf zufVar = (zuf) ((daq) nwpVar.a.b).Dr.get();
        c8o.l(zufVar);
        uu00 uu00VarP = nwpVar.a.P();
        c8o.l(uu00VarP);
        return new jqd0(zufVar, uu00VarP, f2u0.f((Flowable) ((jly0) this.e).get()), s().b());
    }

    public lud0 k() {
        Object obj = this.d;
        gkd gkdVar = (gkd) ((jly0) obj).get();
        toj0 toj0VarB = B();
        nwp nwpVar = (nwp) this.c;
        gw70 gw70VarA0 = nwpVar.a.a0();
        c8o.l(gw70VarA0);
        em0 em0Var = nwpVar.a;
        woa woaVarS = em0Var.s();
        c8o.l(woaVarS);
        kma kmaVarR = em0Var.r();
        c8o.l(kmaVarR);
        uwh uwhVarA = em0Var.A();
        c8o.l(uwhVarA);
        uu00 uu00VarP = em0Var.P();
        c8o.l(uu00VarP);
        return new lud0(new tp7(new pt(gkdVar, toj0VarB, gw70VarA0, woaVarS, kmaVarR, new yu3(uwhVarA, uu00VarP, (Flowable) ((jly0) this.f).get(), f2u0.D((Flowable) ((jly0) this.e).get()), (byte) 25)), (p2p) this.i, new uym0(f2u0.j((Flowable) ((jly0) this.e).get()), (Flowable) ((jly0) this.X).get(), ((Flowable) ((jly0) this.e).get()).j(mo9.O0), (w9u0) ((jly0) this.Y).get(), (d0r) ((jly0) this.Z).get()), (owp) ((jly0) this.N0).get(), (d0r) ((jly0) this.Z).get(), s().d(), new v1k(B(), new asn(O(), new lvc1((Flowable) ((jly0) this.f).get(), f2u0.D((Flowable) ((jly0) this.e).get()))), (iac0) ((jly0) this.g).get(), (byte) 28), (gkd) ((jly0) obj).get(), (iac0) ((jly0) this.g).get(), nwpVar.e(), new et90(new xu4(false, (luk) nwpVar.g.get()), f2u0.f((Flowable) ((jly0) this.e).get()), (cbv) nwpVar.P.get())), (byte) 3);
    }

    public dlg1 k0() {
        i8h1 i8h1Var = (i8h1) ((n9o0) this.b).e.get();
        c8o.l(i8h1Var);
        sfs sfsVar = (sfs) ((jly0) this.i).get();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarK6 = yon1.k6();
        return new dlg1(i8h1Var, sfsVar, new fjl0(p6r0VarK6.a(), p6r0VarK6.path(), (byte) 28));
    }

    public void l() {
        p7s p7sVar = (p7s) this.c;
        p7sVar.c();
        owh0.b();
        if (irn1.m0(p7sVar.f, owh0.c().e()).isEmpty()) {
            zfr zfrVar = (zfr) this.f;
            pr31 pr31Var = (pr31) this.Y;
            sn50 sn50VarO = pr31Var != null ? e130.o(pr31Var, (String) zfrVar.c) : null;
            if (sn50VarO != null) {
                ArrayList<pr31> arrayList = sn50VarO.c;
                arrayList.size();
                for (pr31 pr31Var2 : arrayList) {
                    String str = pr31Var2.a;
                    lwh0 lwh0Var = pr31Var2.l;
                    if (lwh0Var == null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    lwh0Var.a();
                }
            }
        }
        this.Y = null;
        smo1.p((llm) this.t, (CancellationException) null);
    }

    public void l0() {
        gvh0 gvh0Var;
        fwr fwrVar;
        String str;
        String str2;
        pr31 pr31Var;
        gvh0 gvh0Var2;
        LinkedHashMap linkedHashMap;
        ihv ihvVar;
        List list;
        Iterator it;
        gvh0 gvh0Var3;
        Object obj;
        boolean z;
        kvh0 kvh0Var;
        String str3;
        List list2;
        Object next;
        fwr fwrVar2 = (fwr) this.g;
        odc1 odc1Var = (odc1) this.b;
        String str4 = odc1Var.c;
        String str5 = odc1Var.a;
        pr31 pr31Var2 = (pr31) this.Y;
        String str6 = odc1Var.b;
        y7l y7lVar = fwrVar2.c;
        l7s l7sVar = fwrVar2.b;
        sn50 sn50VarO = pr31Var2 != null ? e130.o(pr31Var2, fwrVar2.d) : null;
        jqd0 jqd0VarA = l7sVar.a();
        if (jqd0VarA == null || (list2 = (List) jqd0VarA.d) == null) {
            gvh0Var = null;
        } else {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!str5.equals(((gvh0) next).g()));
            gvh0Var = (gvh0) next;
        }
        if (gvh0Var == null) {
            if (pr31Var2 == null || (str3 = pr31Var2.b) == null) {
                str3 = "";
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            Bundle bundleF = pzm.f("id", str5, "name", str3);
            bundleF.putParcelableArrayList("controlFilters", new ArrayList<>(arrayList2));
            bundleF.putStringArrayList("groupMemberIds", new ArrayList<>(arrayList));
            bundleF.putStringArrayList("allowedPackages", new ArrayList<>(hashSet));
            gvh0Var = new gvh0((String) null, bundleF, arrayList3);
            Logger.d("No descriptor found for ".concat(str5), new Object[0]);
            n57.s("No descriptor found for ".concat(str5));
        }
        if (sn50VarO == null) {
            String strA = fwrVar2.a(str6);
            if (strA == null) {
                strA = gvh0Var.j();
            }
            wmy wmyVar = new wmy(str4, strA);
            wmyVar.v(2);
            wmyVar.d(gvh0Var.b());
            wmyVar.F(gvh0Var.k());
            wmyVar.H(gvh0Var.m());
            wmyVar.G(gvh0Var.l());
            ihvVar = new ihv(wmyVar.h(), Collections.singletonList(fwr.b(gvh0Var)));
        } else {
            jqd0 jqd0VarA2 = l7sVar.a();
            if (jqd0VarA2 == null || (list = (List) jqd0VarA2.d) == null) {
                fwrVar = fwrVar2;
                str = str6;
                str2 = str4;
                pr31Var = pr31Var2;
                gvh0Var2 = gvh0Var;
                linkedHashMap = b7x.a;
            } else {
                List list3 = list;
                int iS = zno1.s(q7h.U(list3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    gvh0 gvh0Var4 = (gvh0) it3.next();
                    String strG = gvh0Var4.g();
                    c3e c3eVarH = ekb.H(gvh0Var4.d());
                    if (c3eVarH == null) {
                        it = it3;
                        gvh0Var3 = gvh0Var;
                    } else {
                        ArrayList arrayListD = fwrVar2.a.d();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : arrayListD) {
                            Iterator it4 = it3;
                            gvh0 gvh0Var5 = gvh0Var;
                            if (!((pr31) obj2).m) {
                                arrayList4.add(obj2);
                            }
                            it3 = it4;
                            gvh0Var = gvh0Var5;
                        }
                        it = it3;
                        gvh0Var3 = gvh0Var;
                        Iterator it5 = arrayList4.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next2 = it5.next();
                            Iterator it6 = it5;
                            obj = next2;
                            if (nhc1.R(((pr31) next2).a, c3eVarH.a, false)) {
                                break;
                            } else {
                                it5 = it6;
                            }
                        }
                        pr31 pr31Var3 = (pr31) obj;
                        if (pr31Var3 != null) {
                            ArrayList arrayList5 = sn50VarO.c;
                            if (arrayList5.isEmpty()) {
                                z = false;
                                break;
                            }
                            Iterator it7 = arrayList5.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (u890.j(((pr31) it7.next()).a, pr31Var3.a)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            new ArrayList();
                            new ArrayList();
                            new HashSet();
                            new ArrayList();
                            Bundle bundle = new Bundle(gvh0Var4.a);
                            ArrayList arrayListE = gvh0Var4.e();
                            boolean z2 = z;
                            ArrayList arrayListB = gvh0Var4.b();
                            str4 = str4;
                            HashSet hashSetA = gvh0Var4.a();
                            pr31Var2 = pr31Var2;
                            List list4 = gvh0Var4.c;
                            String str7 = gvh0Var4.b;
                            fwrVar2 = fwrVar2;
                            str6 = str6;
                            bundle.putInt("volumeHandling", y7lVar.a().a ? 1 : 0);
                            bundle.putInt("volume", y7lVar.a().b);
                            bundle.putInt("volumeMax", y7lVar.a().c);
                            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
                            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                            gvh0 gvh0Var6 = new gvh0(str7, bundle, list4);
                            boolean zC0 = irn1.c0(sn50VarO, pr31Var3);
                            iwh0 iwh0Var = sn50VarO.d;
                            if (iwh0Var == null) {
                                eg.m("Required value was null.");
                                return;
                            }
                            lwh0 lwh0Var = pr31Var3.l;
                            if (lwh0Var == null) {
                                eg.m("Required value was null.");
                                return;
                            }
                            kvh0 kvh0Var2 = (kvh0) iwh0Var.x.get(lwh0Var.c);
                            kvh0Var = new kvh0(gvh0Var6, z2 ? 3 : 1, irn1.d0(sn50VarO, pr31Var3), zC0, kvh0Var2 != null && kvh0Var2.e);
                        }
                        linkedHashMap2.put(strG, kvh0Var);
                        it3 = it;
                        gvh0Var = gvh0Var3;
                        str4 = str4;
                        pr31Var2 = pr31Var2;
                        fwrVar2 = fwrVar2;
                        str6 = str6;
                    }
                    kvh0Var = null;
                    linkedHashMap2.put(strG, kvh0Var);
                    it3 = it;
                    gvh0Var = gvh0Var3;
                    str4 = str4;
                    pr31Var2 = pr31Var2;
                    fwrVar2 = fwrVar2;
                    str6 = str6;
                }
                fwrVar = fwrVar2;
                str = str6;
                str2 = str4;
                pr31Var = pr31Var2;
                gvh0Var2 = gvh0Var;
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((kvh0) entry.getValue()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            smc0 smc0VarN = k4p1.n();
            smc0VarN.addAll(linkedHashMap.values());
            Collection collectionValues = linkedHashMap.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it8 = collectionValues.iterator();
                do {
                    if (!it8.hasNext()) {
                        Logger.d("GOS->Connected Cast route was not found for originalId=".concat(str5), new Object[0]);
                        n57.s("Connected Cast route was not found for ".concat(str5));
                        smc0VarN.add(fwr.b(gvh0Var2));
                        break;
                    }
                } while (!u890.j(((kvh0) it8.next()).a.g(), str5));
            } else {
                Logger.d("GOS->Connected Cast route was not found for originalId=".concat(str5), new Object[0]);
                n57.s("Connected Cast route was not found for ".concat(str5));
                smc0VarN.add(fwr.b(gvh0Var2));
                break;
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            String strA2 = fwrVar.a(str);
            if (strA2 == null) {
                String str8 = pr31Var != null ? pr31Var.b : null;
                strA2 = str8 == null ? gvh0Var2.j() : str8;
            }
            wmy wmyVar2 = new wmy(str2, strA2);
            wmyVar2.G(y7lVar.a().a ? 1 : 0);
            wmyVar2.H(y7lVar.a().c);
            wmyVar2.F(y7lVar.a().b);
            wmyVar2.v(2);
            wmyVar2.d(gvh0Var2.b());
            ihvVar = new ihv(wmyVar2.h(), smc0VarK);
        }
        this.Z = ihvVar.a;
        this.N0 = ihvVar;
        m4d m4dVar = (m4d) this.X;
        if (m4dVar == null) {
            u890.C("onDescriptorsChanged");
            throw null;
        }
        m4dVar.invoke(ihvVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x0175  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
    
        if (p.bq11.c(r0, r2, r1, r11, r12, (java.lang.Long) null, (p.wp11) null, false, r8, 240) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
    
        if (p.fn31.Y(r5, r3, r8) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        if (P(r1, r4, r8) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
    
        if (P(r1, r4, r8) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a2, code lost:
    
        if (p.bq11.a(r0, r4, r8) == r2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(p.gwt0 r30, java.lang.String r31, p.onm r32) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s24.m(p.gwt0, java.lang.String, p.onm):java.lang.Object");
    }

    public cfi1 m0() {
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((l8x0) this.b).i.get();
        c8o.l(retrofitMaker);
        return new cfi1(retrofitMaker);
    }

    public void o(c0b1 c0b1Var, iu30 iu30Var, fv0 fv0Var, woa woaVar, kma kmaVar, iu30 iu30Var2, zob1 zob1Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        woa woaVar2;
        s24 s24Var;
        fv0 fv0Var2;
        qim0 qim0Var2;
        long j;
        o2u0 o2u0Var;
        b0k b0kVar2;
        float f;
        byte b;
        boolean z2;
        Object uk71Var;
        Boolean bool;
        uoa uoaVar;
        tob1 tob1Var;
        uoa uoaVar2;
        boolean z3;
        o2u0 o2u0Var2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        wat watVar;
        boolean z4;
        Object obj;
        boolean z5;
        s24 s24Var2 = this;
        hrr0 hrr0Var = (hrr0) s24Var2.N0;
        hrr0 hrr0Var2 = (hrr0) s24Var2.i;
        hrr0 hrr0Var3 = (hrr0) s24Var2.t;
        Object obj2 = fkj0.X;
        sp00 sp00Var = (sp00) s24Var2.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-859731866);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(c0b1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(fv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            woaVar2 = woaVar;
            i2 |= b0kVar3.i(woaVar2) ? 2048 : 1024;
        } else {
            woaVar2 = woaVar;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(kmaVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.i(zob1Var) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.i(s24Var2) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            boolean z6 = ((Configuration) b0kVar3.k(kivVar)).orientation == 2;
            uoa uoaVarA = (uoa) s24Var2.f;
            if (uoaVarA == null) {
                uoaVarA = woa.a(woaVar2, "sponsored_playlist", (o2u0) null, (w2k1) null, kmaVar, Collections.singletonList(fv0Var), false, (bas) null, (sn10) null, 998);
                uoaVarA.q(true);
                uoaVarA.p(2);
                s24Var2.f = uoaVarA;
            }
            uoa uoaVar3 = uoaVarA;
            boolean zB = ((pe) ((xq81) s24Var2.e).b).b(4);
            boolean z7 = !zB;
            ven0 ven0VarH = rwq.h((xe01) sp00Var.c, b0kVar3, 0);
            boolean zH = b0kVar3.h(((Boolean) ven0VarH.getValue()).booleanValue());
            Object objT = b0kVar3.T();
            if (zH || objT == obj2) {
                Boolean bool2 = (Boolean) ven0VarH.getValue();
                bool2.getClass();
                Boolean bool3 = (Boolean) sp00Var.e;
                boolean z8 = (bool3 == null || bool3.equals(bool2)) ? false : true;
                sp00Var.e = bool2;
                objT = Boolean.valueOf(z8);
                b0kVar3.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            Object objT2 = b0kVar3.T();
            if (objT2 == obj2) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            vy71 vy71VarF = dem0.f(6, 2, b0kVar3, (iu30) null, true);
            Object objT3 = b0kVar3.T();
            if (objT3 == obj2) {
                objT3 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT3);
            }
            c9n c9nVar = (c9n) objT3;
            jge jgeVar = ((rbt) s24Var2.b).o.b;
            b0kVar3.i0(-1568550108);
            ven0 ven0VarG = rwq.g(jgeVar, (Object) null, (o8n) null, b0kVar3, 48, 2);
            b0kVar3.r(false);
            if (ven0VarG == null) {
                b0kVar3.i0(-1380371333);
                Object objT4 = b0kVar3.T();
                if (objT4 == obj2) {
                    objT4 = v8r.q((Object) null);
                    b0kVar3.s0(objT4);
                }
                ven0VarG = (ven0) objT4;
            } else {
                b0kVar3.i0(-1568551520);
            }
            b0kVar3.r(false);
            Integer num = (Integer) ven0VarG.getValue();
            u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
            if (u7hVar == null) {
                b0kVar3.i0(-1568544918);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).a.c;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1568546809);
                b0kVar3.r(false);
                j = u7hVar.a;
            }
            wat watVar2 = (wat) b0kVar3.k(t4k.h);
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            WeakHashMap weakHashMap = osl1.x;
            float fM0 = watVar2.M0(lhc.g(b0kVar3).f.e().b);
            uwr uwrVar2 = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            float f7 = ((Configuration) b0kVar3.k(kivVar)).screenWidthDp;
            float f8 = ((Configuration) b0kVar3.k(kivVar)).screenHeightDp;
            float f9 = p3v.b(((p3v) hrr0Var3.getValue()).a, 0.0f) > 0 ? ((p3v) hrr0Var3.getValue()).a : f7;
            boolean zA = ((l44) s24Var2.c).a();
            o2u0 o2u0Var3 = c0b1Var.c;
            o2u0 o2u0Var4 = c0b1Var.d;
            if (!zA || p3v.b(f9, f8) <= 0 || o2u0Var4 == null) {
                o2u0Var4 = o2u0Var3;
            }
            boolean zI = b0kVar3.i(o2u0Var4) | b0kVar3.i(s24Var2) | b0kVar3.h(z7);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == obj2) {
                float f10 = f9;
                o2u0Var = o2u0Var4;
                b0kVar2 = b0kVar3;
                f = f10;
                b = 6;
                z2 = false;
                objT5 = new hl0(o2u0Var, s24Var2, z7, (lnm) null, (byte) 25);
                b0kVar2.s0(objT5);
            } else {
                f = f9;
                b0kVar2 = b0kVar3;
                o2u0Var = o2u0Var4;
                b = 6;
                z2 = false;
            }
            qxd0.t(o2u0Var, b0kVar2, (vu30) objT5);
            uoaVar3.o(c0b1Var.f);
            ven0 ven0VarH2 = rwq.h(zob1Var, b0kVar2, (i4 >> 18) & 14);
            Object objT6 = b0kVar2.T();
            if (objT6 == obj2) {
                objT6 = yv91.a(new k7a1(ven0VarH2, s24Var2, b));
                b0kVar2.s0(objT6);
            }
            tob1 tob1Var2 = (tob1) objT6;
            boolean z9 = (o2u0Var == null || !(!zB ? u890.j(o2u0Var, (o2u0) hrr0Var2.getValue()) : true) || !((Boolean) tob1Var2.getValue()).booleanValue() || ((Boolean) ven0VarH.getValue()).booleanValue()) ? z2 : true;
            Boolean boolValueOf = Boolean.valueOf(z9);
            boolean zI2 = b0kVar2.i(o2u0Var) | b0kVar2.i(s24Var2) | b0kVar2.h(z9) | b0kVar2.i(uoaVar3);
            Object objT7 = b0kVar2.T();
            if (zI2 || objT7 == obj2) {
                bool = boolValueOf;
                uoaVar = uoaVar3;
                tob1Var = tob1Var2;
                uk71Var = new uk71(o2u0Var, s24Var2, z9, uoaVar, (lnm) null);
                b0kVar2.s0(uk71Var);
            } else {
                bool = boolValueOf;
                uk71Var = objT7;
                uoaVar = uoaVar3;
                tob1Var = tob1Var2;
            }
            qxd0.s(o2u0Var, bool, (vu30) uk71Var, b0kVar2);
            if (zB) {
                uoaVar2 = uoaVar;
                b0kVar2.i0(-1376102788);
                b0kVar2.r(z2);
            } else {
                b0kVar2.i0(-1376654402);
                Boolean bool4 = (Boolean) tob1Var.getValue();
                bool4.getClass();
                boolean zI3 = b0kVar2.i(o2u0Var) | b0kVar2.i(s24Var2) | b0kVar2.i(tob1Var) | b0kVar2.i(uoaVar);
                Object objT8 = b0kVar2.T();
                if (zI3 || objT8 == obj2) {
                    uoa uoaVar4 = uoaVar;
                    wba1 wba1Var = new wba1(o2u0Var, s24Var2, uoaVar4, tob1Var, (lnm) null, (byte) 1);
                    uoaVar2 = uoaVar4;
                    b0kVar2.s0(wba1Var);
                    objT8 = wba1Var;
                } else {
                    uoaVar2 = uoaVar;
                }
                qxd0.s(o2u0Var, bool4, (vu30) objT8, b0kVar2);
                b0kVar2.r(z2);
            }
            boolean zB2 = xoi1.b(context);
            float f11 = ((p3v) ((hrr0) s24Var2.Y).getValue()).a;
            float f12 = ((p3v) ((hrr0) s24Var2.Z).getValue()).a;
            float f13 = ((p3v) hrr0Var.getValue()).a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            zov0 zov0Var2 = cbx.b(b0kVar2).g;
            float f14 = f - 160.0f;
            if (z6) {
                float f15 = (f8 * 2.0f) / 3.0f;
                if (zB2) {
                    z3 = zB2;
                    o2u0Var2 = o2u0Var;
                    f14 = pap1.A(new p3v(f14), new p3v(f15), new p3v(256.0f)).a;
                } else {
                    z3 = zB2;
                    o2u0Var2 = o2u0Var;
                    f14 = zjy.j(f15, new p3v(f14)).a;
                }
            } else {
                z3 = zB2;
                o2u0Var2 = o2u0Var;
                if (z3) {
                    f14 = zjy.j(256.0f, new p3v(f14)).a;
                }
            }
            float f16 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0491: ARITH (r18v16 'f16' float) = (wrap float:0x048f: ARITH (wrap float:0x048d: ARITH (wrap float:0x048b: ARITH (wrap float:0x0489: ARITH (r20v2 float) + (r13v21 'f14' float) A[DONT_WRAP, WRAPPED] (LINE:1162)) + (wrap float:?: TERNARY null = ((r52v0 'z' boolean) != false) ? (16.0f float) : (8.0f float)) A[DONT_WRAP, WRAPPED] (LINE:1164)) + (r3v37 'f11' float) A[DONT_WRAP, WRAPPED] (LINE:1166)) + (r4v27 'f12' float) A[DONT_WRAP, WRAPPED] (LINE:1168)) + (16.0f float) A[DECLARE_VAR] (LINE:1170) in method: p.s24.o(p.c0b1, p.iu30, p.fv0, p.woa, p.kma, p.iu30, p.zob1, p.qim0, boolean, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v2 float
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.s24.o(p.c0b1, p.iu30, p.fv0, p.woa, p.kma, p.iu30, p.zob1, p.qim0, boolean, p.b0k, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        public Object q(Object obj, hfn0 hfn0Var, zu30 zu30Var, lnm lnmVar) throws Throwable {
            j24 j24Var;
            iu30 iu30Var = (iu30) this.e;
            drr0 drr0Var = (drr0) this.Y;
            if (lnmVar instanceof j24) {
                j24Var = (j24) lnmVar;
                int i = j24Var.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    j24Var.c = i - Integer.MIN_VALUE;
                } else {
                    j24Var = new j24(this, lnmVar);
                }
            } else {
                j24Var = new j24(this, lnmVar);
            }
            j24 j24Var2 = j24Var;
            Object obj2 = j24Var2.a;
            int i2 = j24Var2.c;
            Object obj3 = null;
            try {
                if (i2 == 0) {
                    hm5.M(obj2);
                    if (I().a.containsKey(obj)) {
                        j590 j590Var = (j590) this.f;
                        try {
                            l24 l24Var = new l24(this, obj, zu30Var, (lnm) null, (byte) 0);
                            j24Var2.c = 1;
                            j590Var.getClass();
                            Object objS = smo1.s(new ae1(hfn0Var, j590Var, l24Var, (lnm) null, (byte) 10), j24Var2);
                            d9n d9nVar = d9n.a;
                            if (objS == d9nVar) {
                                return d9nVar;
                            }
                        } catch (Throwable th) {
                            th = th;
                            obj3 = null;
                            c0(obj3);
                            Object objA = I().a(drr0Var.s());
                            if (objA != null && Math.abs(drr0Var.s() - I().d(objA)) <= 0.5f && ((Boolean) iu30Var.invoke(objA)).booleanValue()) {
                                b0(objA);
                            }
                            throw th;
                        }
                    } else {
                        b0(obj);
                    }
                    return rih1.a;
                }
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                c0(null);
                Object objA2 = I().a(drr0Var.s());
                if (objA2 != null && Math.abs(drr0Var.s() - I().d(objA2)) <= 0.5f && ((Boolean) iu30Var.invoke(objA2)).booleanValue()) {
                    b0(objA2);
                }
                return rih1.a;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        public Object r(hfn0 hfn0Var, ew0 ew0Var, onm onmVar) {
            e24 e24Var;
            iu30 iu30Var = (iu30) this.e;
            drr0 drr0Var = (drr0) this.Y;
            if (onmVar instanceof e24) {
                e24Var = (e24) onmVar;
                int i = e24Var.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    e24Var.c = i - Integer.MIN_VALUE;
                } else {
                    e24Var = new e24(this, onmVar);
                }
            } else {
                e24Var = new e24(this, onmVar);
            }
            Object obj = e24Var.a;
            int i2 = e24Var.c;
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    j590 j590Var = (j590) this.f;
                    i24 i24Var = new i24(this, ew0Var, (lnm) null, (byte) 0);
                    e24Var.c = 1;
                    j590Var.getClass();
                    Object objS = smo1.s(new ae1(hfn0Var, j590Var, i24Var, (lnm) null, (byte) 10), e24Var);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Object objA = I().a(drr0Var.s());
                if (objA != null && Math.abs(drr0Var.s() - I().d(objA)) <= 0.5f && ((Boolean) iu30Var.invoke(objA)).booleanValue()) {
                    b0(objA);
                }
                return rih1.a;
            } catch (Throwable th) {
                Object objA2 = I().a(drr0Var.s());
                if (objA2 == null || Math.abs(drr0Var.s() - I().d(objA2)) > 0.5f || !((Boolean) iu30Var.invoke(objA2)).booleanValue()) {
                    throw th;
                }
                b0(objA2);
                throw th;
            }
        }

        public ri4 s() {
            return new ri4((luk) ((nwp) this.c).g.get());
        }

        public kn4 t() {
            luk lukVarA = ((j3q) this.b).a();
            c8o.l(lukVarA);
            return new kn4(false, lukVarA);
        }

        public vu4 u() {
            byte b = this.a;
            Object obj = this.b;
            Object obj2 = this.c;
            switch (b) {
                case 5:
                    luk lukVar = (luk) ((xff) obj).f.get();
                    c8o.l(lukVar);
                    return new vu4(false, false, false, lukVar);
                case 6:
                    luk lukVarA = ((j3q) obj).a();
                    c8o.l(lukVarA);
                    return new vu4(false, false, false, lukVarA);
                case 7:
                default:
                    return new vu4(false, false, false, (luk) ((daq) obj2).L1.get());
                case 8:
                    return new vu4(false, false, false, (luk) ((nwp) obj2).g.get());
            }
        }

        public smc0 v(Map map, lhg1 lhg1Var, lhg1 lhg1Var2, boolean z) {
            ExplicitFeedback explicitFeedbackP;
            BackendTransition backendTransition;
            h290<BackendTransition> h290VarO;
            sr10 sr10Var;
            h290 h290VarO2;
            Object next;
            String str = (String) map.get("automix.explicit_feedback");
            if (str != null) {
                try {
                    explicitFeedbackP = ExplicitFeedback.p(n9a.b(n9a.e, str.getBytes(nne.a)));
                } catch (Exception unused) {
                    explicitFeedbackP = null;
                }
            } else {
                explicitFeedbackP = null;
            }
            if (explicitFeedbackP == null || (h290VarO2 = explicitFeedbackP.o()) == null) {
                backendTransition = null;
            } else {
                Iterator it = h290VarO2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((BackendTransition) next).n());
                backendTransition = (BackendTransition) next;
            }
            String strO = lhg1Var2 != null ? "shared_auto" : (!z || backendTransition == null) ? "core" : backendTransition.o();
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(new sr10("Core", "core", lhg1Var, u890.j(strO, "core")));
            if (lhg1Var2 != null) {
                smc0VarN.add(new sr10("Shared Auto", "shared_auto", lhg1Var2, true));
            }
            if (explicitFeedbackP != null && (h290VarO = explicitFeedbackP.o()) != null) {
                for (BackendTransition backendTransition2 : h290VarO) {
                    lhg1 lhg1VarA = kkg1.a(backendTransition2.q());
                    if (lhg1VarA == null) {
                        sr10Var = null;
                    } else {
                        ruq0 ruq0Var = lhg1VarA.b;
                        cbk0 cbk0Var = (cbk0) this.c;
                        sr10Var = new sr10(backendTransition2.o(), backendTransition2.o(), lhg1.a(lhg1VarA, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, cbk0Var.b.b, cbk0Var.c.b, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524095), false, false, 13), u890.j(strO, backendTransition2.o()));
                    }
                    if (sr10Var != null) {
                        smc0VarN.add(sr10Var);
                    }
                }
            }
            return k4p1.k(smc0VarN);
        }

        public Completable y(int i, m210 m210Var) {
            a710 a710VarC = ((x610) this.b).c();
            long j = i == 1 ? 15000L : -15000L;
            if (!((at4) this.t).a()) {
                return X(j, m210Var);
            }
            Flowable flowable = ((yp91) ((idd1) this.Z).getValue()).c;
            return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new dhh0(this, j, m210Var, i, a710VarC));
        }

        public Object z(float f, float f2, Object obj) {
            ki5 ki5Var = (ki5) this.b;
            zmg0 zmg0VarI = I();
            float fD = zmg0VarI.d(obj);
            float fFloatValue = ((Number) ((Function0) this.c).invoke()).floatValue();
            if (fD != f && !Float.isNaN(fD)) {
                if (fD < f) {
                    if (f2 >= fFloatValue) {
                        Object objB = zmg0VarI.b(f, true);
                        objB.getClass();
                        return objB;
                    }
                    Object objB2 = zmg0VarI.b(f, true);
                    objB2.getClass();
                    if (f >= Math.abs(Math.abs(((Number) ki5Var.invoke(Float.valueOf(Math.abs(zmg0VarI.d(objB2) - fD)))).floatValue()) + fD)) {
                        return objB2;
                    }
                } else {
                    if (f2 <= (-fFloatValue)) {
                        Object objB3 = zmg0VarI.b(f, false);
                        objB3.getClass();
                        return objB3;
                    }
                    Object objB4 = zmg0VarI.b(f, false);
                    objB4.getClass();
                    float fAbs = Math.abs(fD - Math.abs(((Number) ki5Var.invoke(Float.valueOf(Math.abs(fD - zmg0VarI.d(objB4))))).floatValue()));
                    if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                        return objB4;
                    }
                }
            }
            return obj;
        }

        public s24(lzn0 lzn0Var, gw70 gw70Var, tsq tsqVar, d0r d0rVar, t1p t1pVar, wmy wmyVar, ycc1 ycc1Var, p5q p5qVar, b9q b9qVar) {
            this.a = (byte) 20;
            this.b = lzn0Var;
            this.c = gw70Var;
            this.d = tsqVar;
            this.e = d0rVar;
            this.f = t1pVar;
            this.g = wmyVar;
            this.h = ycc1Var;
            this.i = p5qVar;
            this.t = b9qVar;
            this.X = new idd1(new hb81(this, (byte) 2));
            this.Y = new idd1(new hb81(this, (byte) 3));
            this.Z = new idd1(new hb81(this, (byte) 4));
            this.N0 = new idd1(new hb81(this, (byte) 0));
        }

        public s24(i1r0 i1r0Var, seq seqVar, qbq qbqVar, kt91 kt91Var, pp11 pp11Var, lzn0 lzn0Var, x1i1 x1i1Var, iac0 iac0Var, k740 k740Var, PlayOrigin playOrigin, q8n q8nVar) {
            this.a = (byte) 17;
            this.b = i1r0Var;
            this.c = qbqVar;
            this.d = kt91Var;
            this.e = pp11Var;
            this.f = lzn0Var;
            this.g = x1i1Var;
            this.h = iac0Var;
            this.i = k740Var;
            this.t = playOrigin;
            this.X = q8nVar;
            this.Y = new idd1(new lwt0(this, (byte) 1));
            this.Z = new idd1(new lwt0(this, (byte) 0));
            this.N0 = new mre0((y5v0) seqVar.a.d.T4.get(), iac0Var);
        }

        public s24(odc1 odc1Var, p7s p7sVar, y7l y7lVar, lpr lprVar, zfr zfrVar, fwr fwrVar, m0s m0sVar, ilr ilrVar, q8n q8nVar) {
            this.a = (byte) 1;
            this.b = odc1Var;
            this.c = p7sVar;
            this.d = y7lVar;
            this.e = lprVar;
            this.f = zfrVar;
            this.g = fwrVar;
            this.h = m0sVar;
            this.i = ilrVar;
            this.t = i3a.k(q8nVar);
        }

        public s24(x610 x610Var, g510 g510Var, Flowable flowable, eu4 eu4Var, oie oieVar, r961 r961Var, im51 im51Var, nn61 nn61Var, at4 at4Var, yqg yqgVar) {
            this.a = (byte) 14;
            this.b = x610Var;
            this.c = g510Var;
            this.d = flowable;
            this.e = eu4Var;
            this.f = oieVar;
            this.g = r961Var;
            this.h = im51Var;
            this.i = nn61Var;
            this.t = at4Var;
            this.X = yqgVar;
            this.Y = new idd1(new cc00(this, (byte) 26));
            this.Z = new idd1(new fhh0(this, (byte) 1));
            this.N0 = new idd1(new fhh0(this, (byte) 0));
        }

        public s24(x45 x45Var, aij0 aij0Var, ExecutorService executorService) {
            this.a = (byte) 24;
            this.g = new HashMap(1);
            this.h = new CompositeDisposable();
            this.i = new ssk1(this);
            this.t = new y1t0(this, (byte) 18);
            this.X = new yrg0(this, (byte) 21);
            this.Y = new h5a1(this, (byte) 25);
            this.Z = new lxh1(this, (byte) 7);
            this.N0 = new o2b1(this, (byte) 27);
            this.b = x45Var;
            this.c = aij0Var;
            executorService.getClass();
            this.d = executorService;
            aij0Var.c = this;
        }

        public s24(rbt rbtVar, l44 l44Var, sp00 sp00Var, xq81 xq81Var) {
            this.a = (byte) 21;
            this.b = rbtVar;
            this.c = l44Var;
            this.d = sp00Var;
            this.e = xq81Var;
            this.h = v8r.q(Float.valueOf(0.0f));
            this.i = v8r.q((Object) null);
            this.t = v8r.q(new p3v(0.0f));
            this.Y = v8r.q(new p3v(0.0f));
            this.Z = v8r.q(new p3v(0.0f));
            this.N0 = v8r.q(new p3v(0.0f));
        }

        public /* synthetic */ s24(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, byte b) {
            this.a = b;
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = obj4;
            this.f = obj5;
            this.g = obj6;
            this.h = obj7;
            this.i = obj8;
            this.t = obj9;
            this.X = obj10;
            this.Y = obj11;
            this.Z = obj12;
            this.N0 = obj13;
        }

        public s24(ConstraintLayout constraintLayout, EncoreButton encoreButton, ConstraintLayout constraintLayout2, MultiArtistAvatarView multiArtistAvatarView, TextView textView, ContextMenuButton contextMenuButton, Space space, Guideline guideline, Guideline guideline2, EncoreButton encoreButton2, AddToButtonView addToButtonView, EncoreButton encoreButton3, AddToButtonView addToButtonView2, ShareButton shareButton) {
            this.a = (byte) 3;
            this.b = constraintLayout;
            this.c = encoreButton;
            this.d = constraintLayout2;
            this.e = textView;
            this.f = contextMenuButton;
            this.g = space;
            this.h = guideline;
            this.i = guideline2;
            this.t = encoreButton2;
            this.X = addToButtonView;
            this.Y = encoreButton3;
            this.Z = addToButtonView2;
            this.N0 = shareButton;
        }

        public s24(dj5 dj5Var) {
            this.a = (byte) 4;
            this.b = dj5Var;
            this.c = new fwo(this, 1, (byte) 17);
            this.d = new fwo(this, 0, (byte) 17);
            this.e = new fwo(this, 2, (byte) 17);
            this.f = new fwo(this, 3, (byte) 17);
            this.g = new fwo(this, 4, (byte) 17);
            this.h = new fwo(this, 5, (byte) 17);
            this.i = new fwo(this, 6, (byte) 17);
            this.t = xqu.b(new fwo(this, 7, (byte) 17));
            this.X = new fwo(this, 8, (byte) 17);
            this.Y = new fwo(this, 9, (byte) 17);
            this.Z = new fwo(this, 10, (byte) 17);
            this.N0 = new fwo(this, 11, (byte) 17);
        }

        public s24(ConstraintLayout constraintLayout, EncoreViewStub encoreViewStub, ArtworkView artworkView, ComposeView composeView, TextView textView, LockedBadgeView lockedBadgeView, PlayIndicatorComposeView playIndicatorComposeView, PremiumBadgeView premiumBadgeView, TextView textView2, ContentRestrictionBadgeView contentRestrictionBadgeView, TextView textView3, TextView textView4, VideoBadgeView videoBadgeView, TextView textView5) {
            this.a = (byte) 23;
            this.b = constraintLayout;
            this.c = artworkView;
            this.d = composeView;
            this.e = textView;
            this.f = lockedBadgeView;
            this.g = playIndicatorComposeView;
            this.h = premiumBadgeView;
            this.i = textView2;
            this.t = contentRestrictionBadgeView;
            this.X = textView3;
            this.Y = textView4;
            this.Z = videoBadgeView;
            this.N0 = textView5;
        }

        public s24(ku61 ku61Var, lu61 lu61Var) {
            this.a = (byte) 11;
            this.b = ku61Var;
            this.c = lu61Var;
            this.d = new ipq(this, 1, (byte) 5);
            this.e = new ipq(this, 2, (byte) 5);
            this.f = new ipq(this, 3, (byte) 5);
            this.g = new ipq(this, 4, (byte) 5);
            this.h = iy81.a(new ipq(this, 6, (byte) 5));
            this.i = new ipq(this, 5, (byte) 5);
            this.t = iy81.a(new ipq(this, 8, (byte) 5));
            this.X = new ipq(this, 7, (byte) 5);
            this.Y = new ipq(this, 9, (byte) 5);
            this.Z = xqu.b(new ipq(this, 10, (byte) 5));
            this.N0 = new ipq(this, 0, (byte) 5);
        }

        public s24(l8x0 l8x0Var, sbx0 sbx0Var, q7r0 q7r0Var) {
            this.a = (byte) 10;
            this.b = l8x0Var;
            this.c = sbx0Var;
            this.d = q7r0Var;
            byte b = 29;
            this.e = iy81.a(new ywp(this, 1, b));
            this.f = iy81.a(new ywp(this, 2, b));
            this.g = iy81.a(new ywp(this, 3, b));
            this.h = iy81.a(new ywp(this, 4, b));
            this.i = iy81.a(new ywp(this, 5, b));
            this.t = iy81.a(new ywp(this, 6, b));
            this.X = new ywp(this, 8, b);
            this.Y = new ywp(this, 9, b);
            this.Z = new ywp(this, 7, b);
            this.N0 = xqu.b(new ywp(this, 0, b));
        }

        public s24(xff xffVar, agf agfVar, q7r0 q7r0Var) {
            this.a = (byte) 5;
            this.b = xffVar;
            this.c = q7r0Var;
            this.d = new b2p(this, 0, (byte) 17);
            this.e = xqu.b(new b2p(this, 1, (byte) 17));
            this.f = xqu.b(new b2p(this, 3, (byte) 17));
            this.g = new b2p(this, 2, (byte) 17);
            this.h = iy81.a(new b2p(this, 6, (byte) 17));
            this.i = iy81.a(new b2p(this, 7, (byte) 17));
            this.t = iy81.a(new b2p(this, 5, (byte) 17));
            this.X = new b2p(this, 4, (byte) 17);
            this.Y = new b2p(this, 8, (byte) 17);
            this.Z = new b2p(this, 9, (byte) 17);
            this.N0 = new b2p(this, 10, (byte) 17);
        }

        public s24(j3q j3qVar) {
            this.a = (byte) 6;
            this.b = j3qVar;
            byte b = 8;
            this.c = xqu.b(new bsp(this, 1, b));
            this.d = xqu.b(new bsp(this, 0, b));
            this.e = iy81.a(new bsp(this, 3, b));
            this.f = iy81.a(new bsp(this, 4, b));
            this.g = iy81.a(new bsp(this, 2, b));
            this.h = xqu.b(new bsp(this, 5, b));
            this.i = new bsp(this, 6, b);
            this.t = iy81.a(new bsp(this, 7, b));
            this.X = new bsp(this, 9, b);
            this.Y = new bsp(this, 10, b);
            this.Z = iy81.a(new bsp(this, b, b));
            this.N0 = iy81.a(new bsp(this, 11, b));
        }

        public s24(n9o0 n9o0Var, o9o0 o9o0Var, q7r0 q7r0Var) {
            this.a = (byte) 7;
            this.b = n9o0Var;
            this.c = o9o0Var;
            this.d = q7r0Var;
            byte b = 19;
            this.e = xqu.b(new bsp(this, 2, b));
            this.f = new bsp(this, 3, b);
            this.g = xqu.b(new bsp(this, 1, b));
            this.h = xqu.b(new bsp(this, 0, b));
            this.i = xqu.b(new bsp(this, 7, b));
            this.t = new g5t();
            this.X = xqu.b(new bsp(this, 8, b));
            this.Y = iy81.a(new bsp(this, 6, b));
            this.Z = new bsp(this, 9, b);
            this.N0 = xqu.b(new bsp(this, 5, b));
            g5t.a((g5t) this.t, xqu.b(new bsp(this, 4, b)));
        }

        public s24(xy71 xy71Var, ki5 ki5Var, Function0 function0, ww21 ww21Var, iu30 iu30Var) {
            final byte b = 0;
            this.a = (byte) 0;
            this.b = ki5Var;
            this.c = function0;
            this.d = ww21Var;
            this.e = iu30Var;
            this.f = new j590();
            this.g = new q24(this);
            this.h = v8r.q(xy71Var);
            this.X = yv91.a(new Function0(this) { // from class: p.c24
                public final /* synthetic */ s24 b;

                {
                    this.b = this;
                }

                public final Object invoke() {
                    byte b2 = b;
                    s24 s24Var = this.b;
                    switch (b2) {
                        case 0:
                            Object value = ((hrr0) s24Var.i).getValue();
                            if (value != null) {
                                return value;
                            }
                            float fS = ((drr0) s24Var.Y).s();
                            boolean zIsNaN = Float.isNaN(fS);
                            hrr0 hrr0Var = (hrr0) s24Var.h;
                            return !zIsNaN ? s24Var.z(fS, 0.0f, hrr0Var.getValue()) : hrr0Var.getValue();
                        case 1:
                            Object value2 = ((hrr0) s24Var.i).getValue();
                            if (value2 != null) {
                                return value2;
                            }
                            float fS2 = ((drr0) s24Var.Y).s();
                            boolean zIsNaN2 = Float.isNaN(fS2);
                            hrr0 hrr0Var2 = (hrr0) s24Var.h;
                            if (zIsNaN2) {
                                return hrr0Var2.getValue();
                            }
                            Object value3 = hrr0Var2.getValue();
                            zmg0 zmg0VarI = s24Var.I();
                            float fD = zmg0VarI.d(value3);
                            if (fD != fS2 && !Float.isNaN(fD)) {
                                if (fD < fS2) {
                                    Object objB = zmg0VarI.b(fS2, true);
                                    if (objB != null) {
                                        return objB;
                                    }
                                } else {
                                    Object objB2 = zmg0VarI.b(fS2, false);
                                    if (objB2 != null) {
                                        return objB2;
                                    }
                                }
                            }
                            return value3;
                        case 2:
                            return s24Var.I();
                        default:
                            return new mmr0(s24Var.I(), ((mdt) s24Var.X).getValue());
                    }
                }
            });
            final byte b2 = 1;
            yv91.a(new Function0(this) { // from class: p.c24
                public final /* synthetic */ s24 b;

                {
                    this.b = this;
                }

                public final Object invoke() {
                    byte b3 = b2;
                    s24 s24Var = this.b;
                    switch (b3) {
                        case 0:
                            Object value = ((hrr0) s24Var.i).getValue();
                            if (value != null) {
                                return value;
                            }
                            float fS = ((drr0) s24Var.Y).s();
                            boolean zIsNaN = Float.isNaN(fS);
                            hrr0 hrr0Var = (hrr0) s24Var.h;
                            return !zIsNaN ? s24Var.z(fS, 0.0f, hrr0Var.getValue()) : hrr0Var.getValue();
                        case 1:
                            Object value2 = ((hrr0) s24Var.i).getValue();
                            if (value2 != null) {
                                return value2;
                            }
                            float fS2 = ((drr0) s24Var.Y).s();
                            boolean zIsNaN2 = Float.isNaN(fS2);
                            hrr0 hrr0Var2 = (hrr0) s24Var.h;
                            if (zIsNaN2) {
                                return hrr0Var2.getValue();
                            }
                            Object value3 = hrr0Var2.getValue();
                            zmg0 zmg0VarI = s24Var.I();
                            float fD = zmg0VarI.d(value3);
                            if (fD != fS2 && !Float.isNaN(fD)) {
                                if (fD < fS2) {
                                    Object objB = zmg0VarI.b(fS2, true);
                                    if (objB != null) {
                                        return objB;
                                    }
                                } else {
                                    Object objB2 = zmg0VarI.b(fS2, false);
                                    if (objB2 != null) {
                                        return objB2;
                                    }
                                }
                            }
                            return value3;
                        case 2:
                            return s24Var.I();
                        default:
                            return new mmr0(s24Var.I(), ((mdt) s24Var.X).getValue());
                    }
                }
            });
            this.Y = new drr0(Float.NaN);
            new uj7(0);
            new ldt(pv91.h().g());
            this.Z = new drr0(0.0f);
            this.i = v8r.q((Object) null);
            this.t = v8r.q(new zmg0(b7x.a));
            this.N0 = new n24(this);
        }

        public s24(nwp nwpVar, q2p0 q2p0Var) {
            this.a = (byte) 8;
            this.c = nwpVar;
            this.b = q2p0Var;
            this.d = iy81.a(new p2p(nwpVar, this, 0, (byte) 7));
            this.e = iy81.a(new p2p(nwpVar, this, 2, (byte) 7));
            this.f = iy81.a(new p2p(nwpVar, this, 1, (byte) 7));
            this.g = iy81.a(new p2p(nwpVar, this, 3, (byte) 7));
            this.h = iy81.a(new p2p(nwpVar, this, 5, (byte) 7));
            this.i = new p2p(nwpVar, this, 4, (byte) 7);
            this.t = iy81.a(new p2p(nwpVar, this, 7, (byte) 7));
            this.X = iy81.a(new p2p(nwpVar, this, 6, (byte) 7));
            this.Y = iy81.a(new p2p(nwpVar, this, 8, (byte) 7));
            this.Z = iy81.a(new p2p(nwpVar, this, 9, (byte) 7));
            this.N0 = iy81.a(new p2p(nwpVar, this, 10, (byte) 7));
        }

        public s24(daq daqVar, v5q v5qVar, q2p0 q2p0Var) {
            this.a = (byte) 9;
            this.c = daqVar;
            this.d = v5qVar;
            this.b = q2p0Var;
            byte b = 1;
            this.e = iy81.a(new p2q(daqVar, v5qVar, this, 1, b));
            this.f = iy81.a(new p2q(daqVar, v5qVar, this, 3, b));
            this.g = iy81.a(new p2q(daqVar, v5qVar, this, 4, b));
            this.h = iy81.a(new p2q(daqVar, v5qVar, this, 2, b));
            this.i = iy81.a(new p2q(daqVar, v5qVar, this, 5, b));
            this.t = iy81.a(new p2q(daqVar, v5qVar, this, 6, b));
            this.X = iy81.a(new p2q(daqVar, v5qVar, this, 7, b));
            this.Y = iy81.a(new p2q(daqVar, v5qVar, this, 8, b));
            this.Z = iy81.a(new p2q(daqVar, v5qVar, this, 0, b));
            this.N0 = iy81.a(new p2q(daqVar, v5qVar, this, 9, b));
        }
    }
