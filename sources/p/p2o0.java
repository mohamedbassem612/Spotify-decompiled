package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.icu.text.DateTimePatternGenerator;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;
import com.spotify.concertcampaignview.v1.CampaignCardDecoratedText;
import com.spotify.concertcampaignview.v1.CampaignCardPlaceholderValue;
import com.spotify.concertcampaignview.v1.CampaignRoutingWithStatus;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.marquee.marquee.MarqueeActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p2o0 implements kf5, vf5, h701, dl4, Function {
    public static final z740 h = new z740(1, "Spotify.Feature.OnDemandMusic", "skip_next");
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public p2o0(Context context, zfx zfxVar) {
        this.a = (byte) 27;
        this.b = new idd1(new mo2(context, (byte) 14));
        ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
        View view = (ConstraintLayout) ks6VarG.a;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        v9w0 v9w0VarQ = b2u.q(view);
        Collections.addAll(v9w0VarQ.c, (TextView) ks6VarG.R0, (TextView) ks6VarG.Q0);
        v9w0VarQ.e = false;
        v9w0VarQ.a();
        this.c = ks6VarG;
        this.d = new idd1(new nxr(zfxVar, this, (byte) 26));
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624036, (ViewGroup) null, false);
        int i = 2131428483;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428483);
        if (textView != null) {
            i = 2131430715;
            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131430715);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                ig3 ig3Var = new ig3(constraintLayout, textView, frameLayout);
                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                frameLayout.addView(view);
                this.e = ig3Var;
                this.f = w2g0.p(ks6VarG, 2131624471);
                this.g = new idd1(new ots(this, (byte) 4));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static /* synthetic */ List B(p2o0 p2o0Var, o5 o5Var, bqi0 bqi0Var, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return p2o0Var.A(o5Var, bqi0Var, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static bqi0 C(t8 t8Var, zjn0 zjn0Var, l141 l141Var, int i, boolean z) {
        yja0 yja0Var;
        if (t8Var instanceof kfy0) {
            vz00 vz00Var = fka0.a;
            fja0 fja0VarA = fka0.a((kfy0) t8Var, zjn0Var, l141Var);
            if (fja0VarA != null) {
                return new bqi0(fja0VarA.d.concat(fja0VarA.e));
            }
        } else if (t8Var instanceof yfy0) {
            vz00 vz00Var2 = fka0.a;
            fja0 fja0VarD = fka0.d((yfy0) t8Var, zjn0Var, l141Var);
            if (fja0VarD != null) {
                return new bqi0(fja0VarD.d.concat(fja0VarD.e));
            }
        } else if ((t8Var instanceof ggy0) && (yja0Var = (yja0) z0o1.l((ef40) t8Var, eka0.d)) != null) {
            int iC = l1d.C(i);
            if (iC == 1) {
                return eso1.s((ggy0) t8Var, zjn0Var, l141Var, true, true, z);
            }
            if (iC != 2) {
                if (iC != 3 || (yja0Var.b & 8) != 8) {
                    return null;
                }
                wja0 wja0Var = yja0Var.f;
                return new bqi0(zjn0Var.getString(wja0Var.c).concat(zjn0Var.getString(wja0Var.d)));
            }
            if (yja0Var.i()) {
                wja0 wja0Var2 = yja0Var.e;
                return new bqi0(zjn0Var.getString(wja0Var2.c).concat(zjn0Var.getString(wja0Var2.d)));
            }
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ pug a(p2o0 p2o0Var) {
        return (pug) p2o0Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public List A(o5 o5Var, bqi0 bqi0Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        jc11 jc11VarZ = cso1.z(o5Var, z, z2, bool, z3, (uqv0) this.b, (joj0) this.g);
        if (jc11VarZ == null) {
            if (o5Var instanceof ihy0) {
                u6b0 u6b0Var = (mka1) ((o5) ((ihy0) o5Var)).d;
                u6b0 u6b0Var2 = u6b0Var instanceof u6b0 ? u6b0Var : null;
                if (u6b0Var2 != null) {
                    jc11VarZ = u6b0Var2.a;
                } else {
                    jc11VarZ = null;
                }
            } else {
                jc11VarZ = null;
            }
        }
        return (jc11VarZ == null || (list = (List) ((gg5) ((qoe0) this.c).invoke(jc11VarZ)).a.get(bqi0Var)) == null) ? z6x.a : list;
    }

    public Single D() {
        if (x74.j((Context) this.f, "android.permission.BLUETOOTH_CONNECT") == 0) {
            Single singleJust = Single.just(p4o0.a);
            singleJust.getClass();
            return singleJust;
        }
        Single map = ((d3o0) this.c).a().observeOn((Scheduler) this.e).map(new zud0(this, (byte) 18));
        map.getClass();
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r7 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object E(java.util.Map r5, p.w4i1 r6, p.onm r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p.tpm
            if (r0 == 0) goto L13
            r0 = r7
            p.tpm r0 = (p.tpm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.tpm r0 = new p.tpm
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.w4i1 r6 = r0.a
            p.hm5.M(r7)
            goto L9a
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L31:
            p.w4i1 r6 = r0.a
            p.hm5.M(r7)
            goto L67
        L37:
            p.hm5.M(r7)
            java.lang.Object r7 = r4.g
            p.add r7 = (p.add) r7
            boolean r7 = r7.a()
            p.d9n r1 = p.d9n.a
            if (r7 == 0) goto L75
            boolean r7 = p.sqe.v(r6)
            if (r7 == 0) goto L75
            java.lang.Object r4 = r4.c
            p.b2p r4 = (p.b2p) r4
            java.lang.Object r4 = r4.get()
            p.mu2 r4 = (p.mu2) r4
            java.lang.String r5 = r6.a
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r4.a(r5, r0)
            if (r7 != r1) goto L67
            goto L99
        L67:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r4 = r6.a
            java.lang.Object r4 = r7.get(r4)
            p.w4i1 r4 = (p.w4i1) r4
            if (r4 != 0) goto L74
            return r6
        L74:
            return r4
        L75:
            java.lang.String r7 = r6.a
            java.lang.Object r5 = r5.get(r7)
            p.w4i1 r5 = (p.w4i1) r5
            if (r5 != 0) goto La8
            java.lang.Object r4 = r4.b
            p.b2p r4 = (p.b2p) r4
            java.lang.Object r4 = r4.get()
            p.cex0 r4 = (p.cex0) r4
            java.lang.String r5 = r6.a
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r0.a = r6
            r0.d = r2
            java.lang.Object r7 = r4.a(r5, r0)
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r4 = r6.a
            java.lang.Object r4 = r7.get(r4)
            p.w4i1 r4 = (p.w4i1) r4
            if (r4 != 0) goto La7
            return r6
        La7:
            return r4
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p2o0.E(java.util.Map, p.w4i1, p.onm):java.lang.Object");
    }

    public boolean F(heg hegVar) {
        jc11 jc11VarH;
        if (hegVar.e() == null || !u890.j(hegVar.f().b(), "Container") || (jc11VarH = q1o1.h((uqv0) this.b, hegVar, (joj0) this.g)) == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = loa1.a;
        l811 l811Var = new l811();
        jc11VarH.b(new nl51(l811Var, (byte) 18));
        return l811Var.a;
    }

    public d520 G(heg hegVar, ab11 ab11Var, List list) {
        if (loa1.a.contains(hegVar)) {
            return null;
        }
        return new d520(this, x1p1.j((ajm0) this.d, hegVar, (poj0) this.e), hegVar, list, ab11Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public Object H(o5 o5Var, ggy0 ggy0Var, int i, a8b0 a8b0Var, vu30 vu30Var) {
        Object objInvoke;
        jc11 jc11VarZ = cso1.z(o5Var, true, true, no20.D.e(ggy0Var.d), fka0.e(ggy0Var), (uqv0) this.b, (joj0) this.g);
        if (jc11VarZ == null) {
            if (o5Var instanceof ihy0) {
                u6b0 u6b0Var = (mka1) ((o5) ((ihy0) o5Var)).d;
                u6b0 u6b0Var2 = u6b0Var instanceof u6b0 ? u6b0Var : null;
                if (u6b0Var2 != null) {
                    jc11VarZ = u6b0Var2.a;
                } else {
                    jc11VarZ = null;
                }
            } else {
                jc11VarZ = null;
            }
        }
        if (jc11VarZ != null) {
            joj0 joj0Var = (joj0) jc11VarZ.b.d;
            joj0 joj0Var2 = zht.e;
            bqi0 bqi0VarC = C(ggy0Var, (zjn0) o5Var.b, (l141) o5Var.c, i, joj0Var.a(((ava) joj0Var2).b, ((ava) joj0Var2).c, ((ava) joj0Var2).d));
            if (bqi0VarC != null && (objInvoke = vu30Var.invoke(((qoe0) this.c).invoke(jc11VarZ), bqi0VarC)) != null) {
                if (qlh1.a(a8b0Var)) {
                    objInvoke = (sgl) objInvoke;
                    if (objInvoke instanceof shc) {
                        return new u3h1(((Number) ((sgl) ((shc) objInvoke)).a).byteValue());
                    }
                    if (objInvoke instanceof wz71) {
                        return new u3h1(((Number) ((sgl) ((wz71) objInvoke)).a).shortValue());
                    }
                    if (objInvoke instanceof zr80) {
                        return new u3h1(((Number) ((sgl) ((zr80) objInvoke)).a).intValue());
                    }
                    if (objInvoke instanceof r5f0) {
                        return new u3h1(((Number) ((sgl) ((r5f0) objInvoke)).a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    public List I(o5 o5Var, t8 t8Var, int i, int i2) {
        bqi0 bqi0VarC = C(t8Var, (zjn0) o5Var.b, (l141) o5Var.c, i, false);
        if (bqi0VarC == null) {
            return z6x.a;
        }
        return B(this, o5Var, new bqi0(bqi0VarC.a + '@' + i2), null, false, 60);
    }

    public List J(o5 o5Var, ggy0 ggy0Var, int i) {
        l141 l141Var = (l141) o5Var.c;
        Boolean boolE = no20.D.e(ggy0Var.d);
        boolean zE = fka0.e(ggy0Var);
        zjn0 zjn0Var = (zjn0) o5Var.b;
        if (i == 1) {
            bqi0 bqi0VarT = eso1.t(ggy0Var, zjn0Var, l141Var, 40);
            if (bqi0VarT != null) {
                return B(this, o5Var, bqi0VarT, boolE, zE, 8);
            }
        } else {
            bqi0 bqi0VarT2 = eso1.t(ggy0Var, zjn0Var, l141Var, 48);
            if (bqi0VarT2 != null) {
                if (ihc1.h0(bqi0VarT2.a, "$delegate", false) == (i == 3)) {
                    return A(o5Var, bqi0VarT2, true, true, boolE, zE);
                }
            }
        }
        return z6x.a;
    }

    public void K(int i, String str) {
        fn31.T(smo1.e(flo1.l(op71.f(), (q8n) this.g)), (o8n) null, 0, new hl1(this, i, str, (lnm) null), 3);
    }

    public t8r0 L() {
        p6r0 p6r0VarG1;
        ynb0 ynb0VarA = xqu.a((ykq) this.f);
        muz0 muz0Var = (muz0) this.c;
        if (muz0Var.c) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("RATINGS_AND_REVIEWS_RATINGS_AUDIOBOOK", "ratings-and-reviews/ratings/audiobook", 1623, "ratings-and-reviews");
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("RATINGS_AND_REVIEWS_RATINGS", "ratings-and-reviews/ratings", 1622, "ratings-and-reviews");
        }
        return new t8r0(ynb0VarA, new tdl0(p6r0VarG1.c, nik1.a0.b(muz0Var.b).a, (byte) 23));
    }

    public kdy0 M() {
        ntz0 ntz0Var = (ntz0) this.b;
        RetrofitMaker retrofitMaker = (RetrofitMaker) ntz0Var.j.get();
        c8o.l(retrofitMaker);
        itz0 itz0Var = (itz0) retrofitMaker.createWebgateService(itz0.class, "android-ratings-ratingsandreviews");
        kv00 kv00Var = (kv00) ntz0Var.f.get();
        c8o.l(kv00Var);
        lv00 lv00Var = (lv00) ntz0Var.k.get();
        c8o.l(lv00Var);
        vo30 vo30Var = new vo30(lv00Var);
        Cosmonaut cosmonaut = (Cosmonaut) ntz0Var.h.get();
        c8o.l(cosmonaut);
        f481 f481VarV = rt71.v(cosmonaut);
        ujs ujsVar = (ujs) ntz0Var.i.get();
        c8o.l(ujsVar);
        h481 h481Var = new h481(vo30Var, f481VarV, ujsVar);
        mka mkaVar = new mka(new vhc((byte) 21), (byte) 25);
        ynb0 ynb0VarA = xqu.a((ykq) this.e);
        Flowable flowable = (Flowable) ntz0Var.d.get();
        c8o.l(flowable);
        uu00 uu00Var = (uu00) ntz0Var.b.get();
        c8o.l(uu00Var);
        CallbackRouter callbackRouter = (CallbackRouter) ntz0Var.e.get();
        c8o.l(callbackRouter);
        return new kdy0(itz0Var, kv00Var, h481Var, mkaVar, Optional.of(new yuz0(ynb0VarA, flowable, uu00Var, new jn7(new CosmosCoroutineTransport(new r8c(callbackRouter, (byte) 9))))));
    }

    public void N() {
        try {
            nct0 nct0Var = nct0.a;
            ebm ebmVar = nct0.a;
            fka1 fka1VarV = null;
            ebm ebmVar2 = ebmVar != null ? ebmVar : null;
            Context contextA = ebmVar2 != null ? ebmVar2.a() : null;
            AssetManager assets = contextA != null ? contextA.getAssets() : null;
            if (assets != null) {
                fka1VarV = si1.v(assets.open((String) this.g));
            } else if (Build.FINGERPRINT == null) {
                k220.i("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            } else {
                k220.i("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            ff01 ff01Var = new ff01(fka1VarV);
            try {
                rhc rhcVarE = ff01Var.e(ff01Var.g());
                rhc rhcVarE2 = ff01Var.e(ff01Var.g());
                ff01Var.close();
                synchronized (this) {
                    this.d = rhcVarE;
                    this.e = rhcVarE2;
                }
                ((CountDownLatch) this.c).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(ff01Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.c).countDown();
            throw th3;
        }
    }

    public Observable O(kh0 kh0Var) {
        ArrayList arrayListO = p7h.O(new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE"});
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            arrayListO.add("android.permission.NEARBY_WIFI_DEVICES");
        }
        if (i >= 37) {
            arrayListO.add("android.permission.ACCESS_LOCAL_NETWORK");
        }
        kh0Var.a(arrayListO.toArray(new String[0]));
        return ((PublishSubject) this.g).flatMap(new ruc0((Object) this, (byte) 21)).flatMap(new d4e0(this, (byte) 20));
    }

    public void P(String str) {
        this.f = str;
    }

    public void Q(String str) {
        this.g = str;
    }

    public void R(String str) {
        this.d = str;
    }

    public void S(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null identifier");
        }
    }

    public void T(String str) {
        this.e = str;
    }

    public void U(String str) {
        if (str != null) {
            this.c = str;
        } else {
            bhn0.i("Null version");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object V(tom tomVar, lpl lplVar, Map map, Map map2, Map map3, ArrayList arrayList, ArrayList arrayList2, onm onmVar) {
        upm upmVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        lpl lplVar2;
        tom tomVar2 = tomVar;
        if (onmVar instanceof upm) {
            upmVar = (upm) onmVar;
            int i = upmVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                upmVar.g = i - Integer.MIN_VALUE;
            } else {
                upmVar = new upm(this, onmVar);
            }
        } else {
            upmVar = new upm(this, onmVar);
        }
        Object obj = upmVar.e;
        int i2 = upmVar.g;
        if (i2 == 0) {
            hm5.M(obj);
            jb71 jb71Var = (bc71) map3.get(map2.get(tomVar2.a));
            if (jb71Var == null) {
                jb71Var = jb71.a;
            }
            lpl lplVar3 = new lpl(lplVar.a, jb71Var, lplVar.c, lplVar.d, lplVar.e, lplVar.f, lplVar.g);
            w4i1 w4i1Var = tomVar2.c;
            upmVar.a = tomVar2;
            upmVar.b = arrayList;
            arrayList3 = arrayList2;
            upmVar.c = arrayList3;
            upmVar.d = lplVar3;
            upmVar.g = 1;
            Object objE = E(map, w4i1Var, upmVar);
            Object obj2 = d9n.a;
            if (objE == obj2) {
                return obj2;
            }
            arrayList4 = arrayList;
            obj = objE;
            lplVar2 = lplVar3;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lplVar2 = upmVar.d;
            ArrayList arrayList5 = upmVar.c;
            arrayList4 = upmVar.b;
            tom tomVar3 = upmVar.a;
            hm5.M(obj);
            arrayList3 = arrayList5;
            tomVar2 = tomVar3;
        }
        return tom.a(tomVar2, (w4i1) obj, lplVar2, (rom) null, arrayList4, arrayList3, (nom) null, false, 3675);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    public Single W() {
        cj3 cj3Var = (cj3) ((lan1) this.g).b;
        dma1 dma1Var = cj3Var.c;
        if (dma1Var == null) {
            eg.m("setup needs to be called first");
            return null;
        }
        bma1 bma1Var = cj3.g;
        boolean z = false;
        int iL = dma1Var.l(bma1Var, 0);
        if (iL >= 5) {
            dma1 dma1Var2 = ((cj3) this.b).c;
            if (dma1Var2 == null) {
                eg.m("setup needs to be called first");
                return null;
            }
            if (dma1Var2.h(cj3.f, true)) {
                rm5 rm5Var = (rm5) this.f;
                cj3 cj3Var2 = (cj3) rm5Var.a;
                dma1 dma1Var3 = cj3Var2.c;
                if (dma1Var3 == null) {
                    eg.m("setup needs to be called first");
                    return null;
                }
                long jG = dma1Var3.g(cj3.d, 0L);
                int iA = cj3Var2.a();
                if (iA != 0) {
                    long[] jArr = rm5.h;
                    if (iA <= 2 && jG + jArr[iA - 1] < ((yqg) rm5Var.b).b()) {
                        if (((t450) this.c).b()) {
                            z = true;
                        }
                    }
                } else if (((t450) this.c).b() && ((Boolean) ((kly0) this.e).get()).booleanValue()) {
                    z = true;
                }
            }
        } else {
            int i = iL + 1;
            dma1 dma1Var4 = cj3Var.c;
            if (dma1Var4 == null) {
                eg.m("setup needs to be called first");
                return null;
            }
            hma1 hma1VarEdit = dma1Var4.edit();
            hma1VarEdit.b(bma1Var, i);
            hma1VarEdit.g();
        }
        return Single.just(Boolean.valueOf(z)).flatMap(new a42((Object) this, (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object X(tom tomVar, npl nplVar, Map map, Map map2, ArrayList arrayList, ArrayList arrayList2, onm onmVar) {
        vpm vpmVar;
        npl nplVar2;
        tom tomVar2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        npl nplVar3;
        if (onmVar instanceof vpm) {
            vpmVar = (vpm) onmVar;
            int i = vpmVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpmVar.g = i - Integer.MIN_VALUE;
            } else {
                vpmVar = new vpm(this, onmVar);
            }
        } else {
            vpmVar = new vpm(this, onmVar);
        }
        Object obj = vpmVar.e;
        int i2 = vpmVar.g;
        if (i2 == 0) {
            hm5.M(obj);
            upa1 upa1Var = (upa1) map2.get(nplVar.a);
            tpa1 tpa1Var = upa1Var != null ? upa1Var.a : null;
            spa1 spa1Var = tpa1Var instanceof spa1 ? (spa1) tpa1Var : null;
            if (spa1Var != null) {
                nplVar2 = new npl(nplVar.a, spa1Var.b, new Integer(spa1Var.a), spa1Var.c);
            } else {
                nplVar2 = nplVar;
            }
            w4i1 w4i1Var = tomVar.c;
            vpmVar.a = tomVar;
            vpmVar.b = arrayList;
            vpmVar.c = arrayList2;
            vpmVar.d = nplVar2;
            vpmVar.g = 1;
            Object objE = E(map, w4i1Var, vpmVar);
            Object obj2 = d9n.a;
            if (objE == obj2) {
                return obj2;
            }
            tomVar2 = tomVar;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            nplVar3 = nplVar2;
            obj = objE;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            npl nplVar4 = vpmVar.d;
            ArrayList arrayList5 = vpmVar.c;
            ArrayList arrayList6 = vpmVar.b;
            tom tomVar3 = vpmVar.a;
            hm5.M(obj);
            nplVar3 = nplVar4;
            arrayList4 = arrayList5;
            arrayList3 = arrayList6;
            tomVar2 = tomVar3;
        }
        return tom.a(tomVar2, (w4i1) obj, nplVar3, (rom) null, arrayList3, arrayList4, (nom) null, false, 3675);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Y(String str, onm onmVar) {
        wyd wydVar;
        List listSingletonList;
        bpb1 bpb1Var;
        Object value;
        if (onmVar instanceof wyd) {
            wydVar = (wyd) onmVar;
            int i = wydVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wydVar.c = i - Integer.MIN_VALUE;
            } else {
                wydVar = new wyd(this, onmVar);
            }
        } else {
            wydVar = new wyd(this, onmVar);
        }
        Object objB = wydVar.a;
        int i2 = wydVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            Set set = s4b1.f;
            int iOrdinal = uic.x(str).c.ordinal();
            if (iOrdinal == 844) {
                listSingletonList = Collections.singletonList(str);
            } else if (iOrdinal != 860) {
                listSingletonList = z6x.a;
            } else {
                xrc0 xrc0Var = (xrc0) this.c;
                wydVar.c = 1;
                objB = t110.b(str, wydVar, xrc0Var);
                Object obj = d9n.a;
                if (objB == obj) {
                    return obj;
                }
            }
            bpb1Var = (bpb1) this.f;
            do {
                value = bpb1Var.getValue();
            } while (!bpb1Var.k(value, uyd.a((uyd) value, listSingletonList, (ArrayList) null, false, 14)));
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        listSingletonList = (List) objB;
        bpb1Var = (bpb1) this.f;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, uyd.a((uyd) value, listSingletonList, (ArrayList) null, false, 14)));
        return rih1.a;
    }

    public Object apply(Object obj) {
        pa81 pa81Var = (pa81) obj;
        cfr cfrVar = (cfr) this.b;
        if (pa81Var != pa81.c) {
            return cfrVar.a((List) this.d, (String) this.e, (List) this.c, (List) this.f, (String) this.g);
        }
        boolean zIsEmpty = ((List) this.c).isEmpty();
        kp5 kp5Var = cfrVar.b;
        return !zIsEmpty ? kp5.A(kp5Var, js91.a).g(new f72(cfrVar, (byte) 10)) : kp5.A(kp5Var, ks91.a);
    }

    public void b(xbk xbkVar, qim0 qim0Var, es41 es41Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        qim0 qim0Var4;
        x340 x340Var;
        boolean z2;
        boolean z3;
        xbk xbkVar2 = xbkVar;
        m4c m4cVar = fkj0.X;
        List list = xbkVar2.e;
        List list2 = xbkVar2.d;
        String str = xbkVar2.k;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1994784373);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(xbkVar2) ? 4 : 2) | 48 | (x340Var2.i(es41Var) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.i(this) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var2.d0();
            int i3 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i3 == 0 || x340Var2.E()) {
                qim0Var3 = qim0Var5;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            x9r x9rVar = xbkVar2.n;
            if (x9rVar == null) {
                x340Var2.i0(-1453501795);
                x340Var2.r(false);
                list = list;
                qim0Var4 = qim0Var5;
                z = false;
                x340Var = x340Var2;
            } else {
                x340Var2.i0(-1453501794);
                p9k p9kVar = (p9k) ((idd1) this.g).getValue();
                String str2 = x9rVar.a;
                String str3 = x9rVar.b;
                String strO0 = cwl1.o0(x340Var2, 2131956595);
                int i4 = i2 & 7168;
                boolean z4 = i4 == 2048;
                Object objT = x340Var2.T();
                if (z4 || objT == m4cVar) {
                    objT = new erj(iu30Var, (byte) 23);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean z5 = i4 == 2048;
                Object objT2 = x340Var2.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new erj(iu30Var, (byte) 24);
                    x340Var2.s0(objT2);
                }
                o9k o9kVar = new o9k(str2, str3, strO0, function0, (Function0) objT2);
                z = false;
                qim0Var4 = qim0Var5;
                x340Var = x340Var2;
                otw.c(p9kVar, o9kVar, (qim0) null, (ipb1) null, x340Var, 8, 12);
                x340Var.r(false);
            }
            d0r d0rVarC = cwl1.C((q7r0) this.d);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ((bnr) this.b).a(d0rVarC);
                x340Var.s0(objT3);
            }
            tyq tyqVar = (tyq) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                uw0 uw0Var = (uw0) this.c;
                d3p d3pVar = new d3p(new xap((Object) uw0Var, (byte) 5));
                e8k e8kVar = new e8k((q8n) uw0Var.Y, (rm5) uw0Var.f, (dg8) uw0Var.g, (kt91) uw0Var.h, (lzn0) uw0Var.e, (x5j1) uw0Var.O0, (yqg) uw0Var.i, (uu00) uw0Var.t, (Context) uw0Var.d, (xrk) uw0Var.c, (y1t0) uw0Var.Z, (hpd0) uw0Var.b);
                uw0 uw0Var2 = (uw0) ((xap) ((d3p) ((f7p) ((jly0) d3pVar.b).get()).a.b).a).b;
                pt ptVar = new pt(e8kVar, (yqg) uw0Var2.i, (q3c) uw0Var2.X, (gw70) uw0Var2.N0);
                x340Var.s0(ptVar);
                objT4 = ptVar;
            }
            xpw xpwVar = (xpw) objT4;
            i6o0 i6o0VarQ = k1o1.q(x340Var);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.e, z);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0Var6 = qim0Var3;
            qim0 qim0VarH = l6o1.H(bmq0.L(u291.f(u291.x(0.0f, dsa0.m(x340Var, 2131166901), 1, qim0Var4), 1.0f), i6o0VarQ, (g6o0) null), es41Var, false, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarH, 16.0f, 12.0f, 16.0f, 0.0f, 8);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0Var7 = qim0Var4;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xbkVar2 = xbkVar;
            String strK = null;
            otw.c(xpwVar, new f9k(xbkVar2.a, xbkVar2.o), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var2 = x340Var;
            if (str.length() > 0) {
                x340Var2.i0(-1437149718);
                boolean zI = x340Var2.i(this);
                Object objT5 = x340Var2.T();
                if (zI || objT5 == m4cVar) {
                    objT5 = new mwh(this, (byte) 17);
                    x340Var2.s0(objT5);
                }
                e9k.j(0, str, x340Var2, (iu30) objT5);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1436987309);
                x340Var2.r(false);
            }
            if (list2.isEmpty()) {
                qim0Var7 = qim0Var7;
                z2 = true;
                z3 = false;
                x340Var2.i0(-1436346477);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1436920194);
                String str4 = xbkVar2.g;
                String str5 = (str4 == null || ihc1.y0(str4)) ? null : str4;
                if (str5 == null) {
                    x340Var2.i0(-1436839564);
                    x340Var2.r(false);
                    z3 = false;
                    z2 = true;
                } else {
                    x340Var2.i0(-1436839563);
                    z3 = false;
                    z2 = true;
                    j(str5, xbkVar2.h, xbkVar2.p, x340Var2, (i2 >> 3) & 7168);
                    x340Var2.r(false);
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    f((CampaignRoutingWithStatus) it.next(), tyqVar, xbkVar2.p, x340Var2, (i2 >> 3) & 7168);
                }
                x340Var2.r(z3);
            }
            if (list.isEmpty()) {
                x340Var2.i0(-1435613389);
                x340Var2.r(z3);
            } else {
                x340Var2.i0(-1436277440);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(qim0Var7, 8.0f));
                String str6 = xbkVar2.i;
                if (str6 != null && !ihc1.y0(str6)) {
                    strK = str6;
                }
                if (strK == null) {
                    strK = x0d.k(x340Var2, 369317080, 2131956600, x340Var2, z3);
                } else {
                    x340Var2.i0(369314848);
                    x340Var2.r(z3);
                }
                int i5 = (i2 >> 3) & 7168;
                j(strK, xbkVar2.j, xbkVar2.p, x340Var2, i5);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    f((CampaignRoutingWithStatus) it2.next(), tyqVar, xbkVar2.p, x340Var2, i5);
                }
                x340Var2.r(z3);
            }
            uwr uwrVar3 = cbx.a;
            cvx cvxVar5 = cbx.b(x340Var2).b;
            qim0 qim0VarO = ab80.o(qim0Var7, 16.0f, x340Var2, qim0Var7, 1.0f);
            u85 u85Var = (erl1) x340Var2.k(szf0.b);
            if (u85Var == null) {
                x340Var2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var2).g;
            } else {
                x340Var2.i0(-241885792);
            }
            x340Var2.r(z3);
            op71.g(x340Var2, yoo1.D(qim0VarO, u85Var));
            x340Var2.r(z2);
            x340Var2.r(z2);
            qim0Var2 = qim0Var6;
        } else {
            x340Var2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 4, i, this, xbkVar2, qim0Var2, es41Var, iu30Var);
        }
    }

    public List c(o5 o5Var, ggy0 ggy0Var) {
        return !no20.c.e(ggy0Var.d).booleanValue() ? z6x.a : J(o5Var, ggy0Var, 2);
    }

    public List d(o5 o5Var, ggy0 ggy0Var) {
        return !no20.c.e(ggy0Var.d).booleanValue() ? z6x.a : J(o5Var, ggy0Var, 3);
    }

    public ArrayList e(wgy0 wgy0Var, zjn0 zjn0Var) {
        List<efy0> list = wgy0Var.X;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (efy0 efy0Var : list) {
            efy0Var.getClass();
            arrayList.add(((ow3) this.f).f(efy0Var, zjn0Var));
        }
        return arrayList;
    }

    public qtw element() {
        n6r0 n6r0Var = (n6r0) this.b;
        iac0 iac0Var = (iac0) this.c;
        nwp nwpVar = (nwp) this.f;
        fbg1 fbg1Var = (fbg1) ((teq) nwpVar.a.c).b.k4.get();
        c8o.l(fbg1Var);
        lik1 lik1Var = (lik1) this.d;
        gn10 gn10Var = (gn10) this.e;
        f701 f701Var = new f701(gn10Var, lik1Var);
        k55 k55Var = new k55(false, false, (luk) nwpVar.g.get());
        em0 em0Var = nwpVar.a;
        uag1 uag1Var = (uag1) ((teq) em0Var.c).a.l2.get();
        c8o.l(uag1Var);
        tag1 tag1VarA = uag1Var.a();
        q701 q701Var = (q701) ((jly0) this.g).get();
        hbg1 hbg1Var = (hbg1) ((teq) em0Var.c).b.h4.get();
        c8o.l(hbg1Var);
        sma1 sma1VarA = hbg1Var.a(n6r0Var, new f701(gn10Var, lik1Var), iac0Var, (hyy0) null);
        s801 s801VarI0 = em0Var.I0();
        c8o.l(s801VarI0);
        jz51 jz51Var = (jz51) ((teq) em0Var.c).a.j2.get();
        c8o.l(jz51Var);
        return xcz0.m(n6r0Var, iac0Var, fbg1Var, f701Var, k55Var, tag1VarA, q701Var, sma1VarA, s801VarI0, jz51Var);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ce  */
    public void f(CampaignRoutingWithStatus campaignRoutingWithStatus, tyq tyqVar, u7h u7hVar, b0k b0kVar, int i) {
        CampaignRoutingWithStatus campaignRoutingWithStatus2;
        int i2;
        int i3;
        mmr0 mmr0Var;
        u7h u7hVar2;
        boolean z;
        Iterator it;
        mmr0 mmr0Var2;
        String str;
        Boolean bool;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-931180620);
        if ((i & 6) == 0) {
            campaignRoutingWithStatus2 = campaignRoutingWithStatus;
            i2 = (x340Var.g(campaignRoutingWithStatus2) ? 4 : 2) | i;
        } else {
            campaignRoutingWithStatus2 = campaignRoutingWithStatus;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tyqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(u7hVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strN = campaignRoutingWithStatus2.n().n();
            if (campaignRoutingWithStatus2.hasStatus()) {
                x340Var.i0(392250176);
                CampaignCardDecoratedText campaignCardDecoratedTextP = campaignRoutingWithStatus2.o().p();
                String strP = campaignCardDecoratedTextP.p();
                List listQ = campaignCardDecoratedTextP.q();
                ArrayList<mmr0> arrayList = new ArrayList();
                listQ.getClass();
                Iterator it2 = listQ.iterator();
                int i4 = 0;
                Long lValueOf = null;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    CampaignCardPlaceholderValue campaignCardPlaceholderValue = (CampaignCardPlaceholderValue) next;
                    String strC = f4i1.c(i5, "$");
                    int iW0 = ihc1.w0(strP, strC, 0, false, 6);
                    if (iW0 >= 0) {
                        if (iW0 > 0) {
                            arrayList.add(new mmr0(strP.substring(0, iW0), Boolean.FALSE));
                        }
                        campaignCardPlaceholderValue.getClass();
                        if (campaignCardPlaceholderValue.w()) {
                            mmr0Var2 = new mmr0(campaignCardPlaceholderValue.r(), Boolean.FALSE);
                        } else {
                            if (campaignCardPlaceholderValue.v()) {
                                mmr0Var2 = new mmr0(campaignCardPlaceholderValue.q(), Boolean.TRUE);
                            } else if (campaignCardPlaceholderValue.u()) {
                                Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
                                it = it2;
                                ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochSecond(campaignCardPlaceholderValue.p().q(), campaignCardPlaceholderValue.p().p()).atZone(ZoneId.systemDefault());
                                mmr0Var2 = new mmr0(xcg1.i(zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance(localeForLanguageTag).getBestPattern("MMMdjm"), localeForLanguageTag)), " ", zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("z"))), Boolean.FALSE);
                            } else {
                                it = it2;
                                if (campaignCardPlaceholderValue.t()) {
                                    mmr0Var2 = new mmr0("{{COUNTDOWN}}", Boolean.FALSE);
                                } else if (campaignCardPlaceholderValue.s()) {
                                    LocalDateTime localDateTimeH = z4p1.H(campaignCardPlaceholderValue.n());
                                    localDateTimeH.getClass();
                                    mmr0Var2 = new mmr0(z4p1.x(localDateTimeH, "MMMdjm"), Boolean.FALSE);
                                } else {
                                    mmr0Var2 = new mmr0("", Boolean.FALSE);
                                }
                            }
                            str = (String) mmr0Var2.a;
                            bool = (Boolean) mmr0Var2.b;
                            bool.getClass();
                            if (campaignCardPlaceholderValue.t()) {
                                lValueOf = Long.valueOf((campaignCardPlaceholderValue.o().q() * 1000) + ((long) (campaignCardPlaceholderValue.o().p() / 1000000)));
                                arrayList.add(new mmr0("{{COUNTDOWN}}", Boolean.FALSE));
                            } else {
                                arrayList.add(new mmr0(str, bool));
                            }
                            strP = strP.substring(strC.length() + iW0);
                        }
                        it = it2;
                        str = (String) mmr0Var2.a;
                        bool = (Boolean) mmr0Var2.b;
                        bool.getClass();
                        if (campaignCardPlaceholderValue.t()) {
                            lValueOf = Long.valueOf((campaignCardPlaceholderValue.o().q() * 1000) + ((long) (campaignCardPlaceholderValue.o().p() / 1000000)));
                            arrayList.add(new mmr0("{{COUNTDOWN}}", Boolean.FALSE));
                        } else {
                            arrayList.add(new mmr0(str, bool));
                        }
                        strP = strP.substring(strC.length() + iW0);
                    } else {
                        i2 = i2;
                        it = it2;
                    }
                    i4 = i5;
                    it2 = it;
                    i2 = i2;
                }
                i3 = i2;
                if (strP.length() > 0) {
                    arrayList.add(new mmr0(strP, Boolean.FALSE));
                }
                ye5 ye5Var = new ye5();
                for (mmr0 mmr0Var3 : arrayList) {
                    String str2 = (String) mmr0Var3.a;
                    if (((Boolean) mmr0Var3.b).booleanValue()) {
                        int iO = ye5Var.o(new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531));
                        try {
                            ye5Var.g(str2);
                            ye5Var.k(iO);
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    } else {
                        ye5Var.g(str2);
                    }
                }
                af5 af5VarP = ye5Var.p();
                CampaignCardDecoratedText campaignCardDecoratedTextP2 = campaignRoutingWithStatus.o().p();
                if (campaignCardDecoratedTextP2.r()) {
                    try {
                        u7hVar2 = new u7h(z4p1.e(Color.parseColor(campaignCardDecoratedTextP2.o())));
                    } catch (IllegalArgumentException unused) {
                        u7hVar2 = null;
                    }
                } else {
                    u7hVar2 = null;
                }
                if (lValueOf != null) {
                    x340Var.i0(392501524);
                    z = false;
                    String strO = hno1.o(lValueOf, (yqg) this.e, x340Var, 0);
                    if (strO != null) {
                        af5VarP = gf5.b(af5VarP, strO);
                    } else if (ihc1.h0(af5VarP.b, "{{COUNTDOWN}}", false)) {
                        af5VarP = new af5("");
                    }
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(392871819);
                    x340Var.r(false);
                }
                mmr0Var = new mmr0(af5VarP.b.length() > 0 ? af5VarP : null, u7hVar2);
                x340Var.r(z);
            } else {
                i3 = i2;
                x340Var.i0(393008560);
                x340Var.r(false);
                mmr0Var = new mmr0((Object) null, (Object) null);
            }
            af5 af5Var = (af5) mmr0Var.a;
            u7h u7hVar3 = (u7h) mmr0Var.b;
            d0r d0rVarC = cwl1.C((q7r0) this.d);
            strN.getClass();
            i1o1.e(tyqVar, new vqk(strN, af5Var, u7hVar3, false, 0, 4, false, false, u7hVar, (String) null, (Integer) null, (Integer) null, 28722), d0rVarC, (qim0) null, (ipb1) null, iei.a, (xu30) null, 0, (xu30) null, x340Var, ((i3 >> 3) & 14) | 196672, 236);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, campaignRoutingWithStatus, tyqVar, u7hVar, (byte) 7);
        }
    }

    public List g(o5 o5Var, t8 t8Var, int i) {
        int size;
        if (t8Var instanceof yfy0) {
            size = ((yfy0) t8Var).O0.size();
        } else {
            size = t8Var instanceof ggy0 ? ((ggy0) t8Var).O0.size() : 0;
        }
        return I(o5Var, t8Var, i, size);
    }

    public List h(o5 o5Var, t8 t8Var, int i, int i2, zgy0 zgy0Var) {
        return !no20.c.e(zgy0Var.d).booleanValue() ? z6x.a : (List) new r5(this, o5Var, t8Var, i, i2).invoke();
    }

    public List i(o5 o5Var, t8 t8Var, int i, int i2, zgy0 zgy0Var) {
        return !no20.c.e(zgy0Var != null ? zgy0Var.d : 0).booleanValue() ? z6x.a : I(o5Var, t8Var, i, i2);
    }

    public void j(String str, String str2, u7h u7hVar, b0k b0kVar, int i) {
        String str3;
        int i2;
        x340 x340Var;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-539483415);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(u7hVar) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = c6k.h;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            x340Var = x340Var2;
            int i3 = i2;
            uwo1.e(str3, (qim0) null, cbx.d(x340Var2).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, i2 & 14, 0, 1722);
            if (str2 == null || ihc1.y0(str2)) {
                x340Var.i0(1183493475);
                x340Var.r(false);
            } else {
                x340Var.i0(1183243367);
                lee1 lee1Var = cbx.d(x340Var).j;
                if (u7hVar == null) {
                    x340Var.i0(-1901489210);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1901490388);
                    x340Var.r(false);
                    j = u7hVar.a;
                }
                uwo1.e(str2, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new cjc0(3), 0, (qx8) null, x340Var, (i3 >> 3) & 14, 0, 1714);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, str, str2, u7hVar, (byte) 8);
        }
    }

    public eu4 k() {
        ez11 ez11Var = (ez11) ((pug) this.b).d;
        c8o.l(ez11Var);
        return new eu4(ez11Var);
    }

    public hz8 l() {
        String str;
        String str2 = (String) this.b;
        if (str2 != null && (str = (String) this.c) != null) {
            return new hz8(str2, str, (String) this.d, (String) this.e, (String) this.f, (String) this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.b) == null) {
            sb.append(" identifier");
        }
        if (((String) this.c) == null) {
            sb.append(" version");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public Object m(o5 o5Var, ggy0 ggy0Var, a8b0 a8b0Var) {
        return H(o5Var, ggy0Var, 2, a8b0Var, q5.c);
    }

    public List n(o5 o5Var, tfy0 tfy0Var) {
        return B(this, o5Var, new bqi0(cy30.l(((zjn0) o5Var.b).getString(tfy0Var.d), '#', keg.b(((ihy0) o5Var).g.b()))), null, false, 60);
    }

    public ArrayList o(rgy0 rgy0Var, zjn0 zjn0Var) {
        List<efy0> list = rgy0Var.R0;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (efy0 efy0Var : list) {
            efy0Var.getClass();
            arrayList.add(((ow3) this.f).f(efy0Var, zjn0Var));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object p(tom tomVar, uol uolVar, Map map, onm onmVar) {
        rpm rpmVar;
        tol tolVar;
        tom tomVar2;
        Object objE;
        Object objE2;
        w4i1 w4i1Var;
        ool oolVar;
        Object objE3;
        ool oolVar2;
        w4i1 w4i1Var2;
        w4i1 w4i1Var3;
        sol solVar;
        Object objE4;
        sol solVar2;
        w4i1 w4i1Var4;
        tom tomVar3 = tomVar;
        Map map2 = map;
        if (onmVar instanceof rpm) {
            rpmVar = (rpm) onmVar;
            int i = rpmVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rpmVar.h = i - Integer.MIN_VALUE;
            } else {
                rpmVar = new rpm(this, onmVar);
            }
        } else {
            rpmVar = new rpm(this, onmVar);
        }
        Object objE5 = rpmVar.f;
        int i2 = rpmVar.h;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objE5);
            tolVar = uolVar.a;
            if (tolVar instanceof ool) {
                w4i1 w4i1Var5 = tomVar3.c;
                rpmVar.a = map2;
                rpmVar.b = tolVar;
                rpmVar.c = tomVar3;
                rpmVar.h = 1;
                objE2 = E(map2, w4i1Var5, rpmVar);
                if (objE2 != obj) {
                    w4i1Var = (w4i1) objE2;
                    oolVar = (ool) tolVar;
                    w4i1 w4i1Var6 = oolVar.a;
                    rpmVar.a = null;
                    rpmVar.b = null;
                    rpmVar.c = tomVar3;
                    rpmVar.d = w4i1Var;
                    rpmVar.e = oolVar;
                    rpmVar.h = 2;
                    objE3 = E(map2, w4i1Var6, rpmVar);
                    if (objE3 != obj) {
                        objE5 = objE3;
                        oolVar2 = oolVar;
                        w4i1Var2 = w4i1Var;
                        oolVar2.getClass();
                        return tom.a(tomVar3, w4i1Var2, new uol(new ool((w4i1) objE5)), (rom) null, (List) null, (List) null, (nom) null, false, 4059);
                    }
                }
            } else if (tolVar instanceof sol) {
                w4i1 w4i1Var7 = tomVar3.c;
                rpmVar.a = map2;
                rpmVar.b = tolVar;
                rpmVar.c = tomVar3;
                rpmVar.h = 3;
                objE = E(map2, w4i1Var7, rpmVar);
                if (objE != obj) {
                    w4i1Var3 = (w4i1) objE;
                    solVar = (sol) tolVar;
                    w4i1 w4i1Var8 = solVar.a;
                    rpmVar.a = null;
                    rpmVar.b = null;
                    rpmVar.c = tomVar3;
                    rpmVar.d = w4i1Var3;
                    rpmVar.e = solVar;
                    rpmVar.h = 4;
                    objE4 = E(map2, w4i1Var8, rpmVar);
                    if (objE4 != obj) {
                        objE5 = objE4;
                        solVar2 = solVar;
                        w4i1Var4 = w4i1Var3;
                        solVar2.getClass();
                        return tom.a(tomVar3, w4i1Var4, new uol(new sol((w4i1) objE5)), (rom) null, (List) null, (List) null, (nom) null, false, 4059);
                    }
                }
            } else {
                w4i1 w4i1Var9 = tomVar3.c;
                rpmVar.a = null;
                rpmVar.b = null;
                rpmVar.c = tomVar3;
                rpmVar.h = 5;
                objE5 = E(map2, w4i1Var9, rpmVar);
                if (objE5 != obj) {
                    tomVar2 = tomVar3;
                    return tom.a(tomVar2, (w4i1) objE5, (upl) null, (rom) null, (List) null, (List) null, (nom) null, false, 4091);
                }
            }
            return obj;
        }
        if (i2 == 1) {
            tomVar3 = rpmVar.c;
            tol tolVar2 = rpmVar.b;
            Map map3 = rpmVar.a;
            hm5.M(objE5);
            tolVar = tolVar2;
            map2 = map3;
            objE2 = objE5;
            w4i1Var = (w4i1) objE2;
            oolVar = (ool) tolVar;
            w4i1 w4i1Var10 = oolVar.a;
            rpmVar.a = null;
            rpmVar.b = null;
            rpmVar.c = tomVar3;
            rpmVar.d = w4i1Var;
            rpmVar.e = oolVar;
            rpmVar.h = 2;
            objE3 = E(map2, w4i1Var10, rpmVar);
            if (objE3 != obj) {
                objE5 = objE3;
                oolVar2 = oolVar;
                w4i1Var2 = w4i1Var;
            }
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                tomVar3 = rpmVar.c;
                tol tolVar3 = rpmVar.b;
                Map map4 = rpmVar.a;
                hm5.M(objE5);
                tolVar = tolVar3;
                map2 = map4;
                objE = objE5;
                w4i1Var3 = (w4i1) objE;
                solVar = (sol) tolVar;
                w4i1 w4i1Var11 = solVar.a;
                rpmVar.a = null;
                rpmVar.b = null;
                rpmVar.c = tomVar3;
                rpmVar.d = w4i1Var3;
                rpmVar.e = solVar;
                rpmVar.h = 4;
                objE4 = E(map2, w4i1Var11, rpmVar);
                if (objE4 != obj) {
                    objE5 = objE4;
                    solVar2 = solVar;
                    w4i1Var4 = w4i1Var3;
                }
                return obj;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tom tomVar4 = rpmVar.c;
                hm5.M(objE5);
                tomVar2 = tomVar4;
                return tom.a(tomVar2, (w4i1) objE5, (upl) null, (rom) null, (List) null, (List) null, (nom) null, false, 4091);
            }
            solVar2 = (sol) rpmVar.e;
            w4i1 w4i1Var12 = rpmVar.d;
            tom tomVar5 = rpmVar.c;
            hm5.M(objE5);
            w4i1Var4 = w4i1Var12;
            tomVar3 = tomVar5;
            solVar2.getClass();
            return tom.a(tomVar3, w4i1Var4, new uol(new sol((w4i1) objE5)), (rom) null, (List) null, (List) null, (nom) null, false, 4059);
        }
        oolVar2 = (ool) rpmVar.e;
        w4i1 w4i1Var13 = rpmVar.d;
        tom tomVar6 = rpmVar.c;
        hm5.M(objE5);
        w4i1Var2 = w4i1Var13;
        tomVar3 = tomVar6;
        oolVar2.getClass();
        return tom.a(tomVar3, w4i1Var2, new uol(new ool((w4i1) objE5)), (rom) null, (List) null, (List) null, (nom) null, false, 4059);
    }

    public Object q(o5 o5Var, ggy0 ggy0Var, a8b0 a8b0Var) {
        return H(o5Var, ggy0Var, 3, a8b0Var, q5.b);
    }

    public List r(o5 o5Var, t8 t8Var, int i) {
        int i2;
        if (t8Var instanceof kfy0) {
            i2 = ((kfy0) t8Var).d;
        } else if (t8Var instanceof yfy0) {
            i2 = ((yfy0) t8Var).d;
        } else if (t8Var instanceof ggy0) {
            ggy0 ggy0Var = (ggy0) t8Var;
            int iC = l1d.C(i);
            if (iC != 2) {
                i2 = (iC == 3 && (ggy0Var.c & 512) == 512) ? ggy0Var.R0 : ggy0Var.d;
            } else {
                i2 = (ggy0Var.c & 256) == 256 ? ggy0Var.Q0 : ggy0Var.d;
            }
        } else {
            i2 = 0;
        }
        if (no20.c.e(i2).booleanValue()) {
            if (i == 2) {
                return J(o5Var, (ggy0) t8Var, 1);
            }
            bqi0 bqi0VarC = C(t8Var, (zjn0) o5Var.b, (l141) o5Var.c, i, false);
            if (bqi0VarC != null) {
                return B(this, o5Var, bqi0VarC, null, false, 60);
            }
        }
        return z6x.a;
    }

    public List s(ihy0 ihy0Var) {
        if (!no20.c.e(ihy0Var.e.d).booleanValue()) {
            return z6x.a;
        }
        u6b0 u6b0Var = (mka1) ((o5) ihy0Var).d;
        u6b0 u6b0Var2 = u6b0Var instanceof u6b0 ? u6b0Var : null;
        jc11 jc11Var = u6b0Var2 != null ? u6b0Var2.a : null;
        if (jc11Var == null) {
            bhn0.B(ihy0Var.g.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        jc11Var.b(new ycc1(this, arrayList, (byte) 2));
        return arrayList;
    }

    public xt61 t() {
        ztx ztxVar = ztx.c;
        eah1 eah1Var = (eah1) this.g;
        smc0 smc0VarN = k4p1.n();
        ow3 ow3Var = (ow3) this.d;
        uqo uqoVar = new uqo((Integer) null, (String) null, (Integer) null, (ks21) null, 31);
        m441 m441Var = new m441(new vs0(ow3Var, (lnm) null, (byte) 8));
        c0g.x.getClass();
        smc0VarN.add(new vqo("audio_quality_trial_banner", uqoVar, m441Var, cxo1.P0, (kly0) ow3Var.b, new sqo(w08.Y)));
        a0z0 a0z0Var = (a0z0) this.b;
        a0z0Var.a(smc0VarN, (bjx) this.f);
        a0z0Var.a(smc0VarN, (poj0) this.e);
        smc0VarN.add(new jgb1("allowAudioQualityDowngrade", 2131961725, (String) null, 2131961724, (sp00) null, (Integer) null, (a2i) null, (mr20) null, pbo1.N0, ((lag) ((a42) this.c).b).h(), new ibd1(new xad1(2, false), new cbd1(c6n.a)), (Map) null, 73658));
        return new xt61(ztxVar, 2131962141, 2131962140, eah1Var, mqo1.F(k4p1.k(smc0VarN)), 105);
    }

    public Object u(List list, List list2, onm onmVar) {
        List list3 = list;
        int iS = zno1.s(q7h.U(list3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list3) {
            linkedHashMap.put(((w4i1) obj).a, obj);
        }
        return v(list2, linkedHashMap, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:136:0x055c  */
    /* JADX WARN: Code duplicated, block: B:144:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x0318  */
    /* JADX WARN: Code duplicated, block: B:88:0x032a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0355  */
    /* JADX WARN: Code duplicated, block: B:95:0x0369  */
    /* JADX WARN: Code duplicated, block: B:99:0x038a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x052f -> B:134:0x053e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public java.lang.Object v(java.util.List r28, java.util.LinkedHashMap r29, p.onm r30) {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p2o0.v(java.util.List, java.util.LinkedHashMap, p.onm):java.lang.Object");
    }

    public void w(Object obj) {
        switch (this.a) {
            case 21:
                AccountSwitcherActivity accountSwitcherActivity = (AccountSwitcherActivity) obj;
                daq daqVar = (daq) this.c;
                ((t3b1) accountSwitcherActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) accountSwitcherActivity).c1 = new tuk(xqu.a((p2p) this.f));
                accountSwitcherActivity.g1 = (pbk1) daqVar.Oh.get();
                accountSwitcherActivity.f1 = new jv(new zq(daqVar.D2), (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get(), (qe41) ((jly0) this.g).get());
                break;
            default:
                mwg0 mwg0Var = (mwg0) obj;
                daq daqVar2 = (daq) this.c;
                mwg0Var.T1 = (gw70) daqVar2.d8.get();
                Object objT = jhc1.t((Bundle) ((jly0) this.e).get(), "key_marquee", iug0.class);
                objT.getClass();
                iug0 iug0Var = (iug0) objT;
                qr20 qr20Var = (qr20) daqVar2.tj.get();
                Scheduler scheduler = (Scheduler) daqVar2.z1.get();
                uw0 uw0Var = (uw0) this.d;
                mwg0Var.U1 = new ivg0(iug0Var, qr20Var, scheduler, (lzn0) ((s2q) uw0Var.b).get(), (ao0) daqVar2.Hk.get(), new sw9((gw70) daqVar2.d8.get(), ((Integer) ((jly0) this.f).get()).intValue(), (byte) 0), new pug0((g7h) daqVar2.b7.get(), (ccc0) daqVar2.y8.get(), (ao0) daqVar2.Hk.get(), daqVar2.u1(), (s4w0) ((s2q) this.g).get()), daqVar2.u1(), (kt91) daqVar2.f8.get(), (q8n) daqVar2.V2.get(), (MarqueeActivity) uw0Var.d, (dto0) daqVar2.eg.get(), (tm4) daqVar2.a.v1.get());
                break;
        }
    }

    public jcs x() {
        yxp yxpVar = (yxp) ((jly0) this.c).get();
        zxp zxpVar = (zxp) ((jly0) this.e).get();
        pug pugVar = (pug) this.b;
        Context context = (Context) pugVar.g;
        c8o.l(context);
        Resources resources = context.getResources();
        c8o.m(resources);
        ez11 ez11Var = (ez11) pugVar.d;
        c8o.l(ez11Var);
        hv4 hv4Var = new hv4(false, false, false, ez11Var);
        fza1 fza1Var = (fza1) pugVar.q;
        c8o.l(fza1Var);
        jxa jxaVar = new jxa((byte) 2);
        yqg yqgVar = (yqg) pugVar.t;
        c8o.l(yqgVar);
        bnj0 bnj0Var = new bnj0((Object) resources, (Object) g7y.y(hv4Var, fza1Var, jxaVar, yqgVar), (byte) 10);
        Context context2 = (Context) pugVar.g;
        c8o.l(context2);
        c8o.l(fza1Var);
        return new jcs(yxpVar, zxpVar, bnj0Var, context2, fza1Var);
    }

    public xeu y() {
        xje xjeVar = (xje) this.b;
        Activity activity = (Activity) xjeVar.a.get();
        c8o.l(activity);
        lzn0 lzn0Var = (lzn0) xjeVar.b.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) xjeVar.c.get();
        c8o.l(a1r0Var);
        return a1r0Var.h(activity) ? new yje(a1r0Var) : new in8(lzn0Var);
    }

    public zeu z() {
        v540 v540Var = (v540) this.b;
        Activity activity = (Activity) v540Var.a.get();
        c8o.l(activity);
        lzn0 lzn0Var = (lzn0) v540Var.b.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) v540Var.c.get();
        c8o.l(a1r0Var);
        q7r0 q7r0Var = (q7r0) this.c;
        kt91 kt91Var = (kt91) v540Var.e.get();
        c8o.l(kt91Var);
        return new zeu(q7r0Var.d.c.getLifecycle(), kt91Var, a1r0Var.h(activity) ? new f710(a1r0Var, (byte) 25) : new xg20(lzn0Var, (byte) 1));
    }

    public /* synthetic */ p2o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public p2o0(lzn0 lzn0Var, kt91 kt91Var, Context context, a680 a680Var, ps7 ps7Var, pob pobVar, hwb hwbVar, q8n q8nVar) {
        this.a = (byte) 29;
        this.b = lzn0Var;
        this.c = kt91Var;
        this.f = context;
        this.d = a680Var;
        this.e = ps7Var;
        this.g = q8nVar;
    }

    public p2o0(ajm0 ajm0Var, poj0 poj0Var, voe0 voe0Var, uqv0 uqv0Var) {
        this.a = (byte) 7;
        this.a = (byte) 7;
        this.b = uqv0Var;
        this.c = voe0Var.a(new p5(this, (byte) 0));
        this.d = ajm0Var;
        this.e = poj0Var;
        this.f = new ow3(ajm0Var, poj0Var, (byte) 6);
        this.g = joj0.g;
    }

    public p2o0() {
        this.a = (byte) 4;
        this.b = new AtomicBoolean(false);
        this.c = new CountDownLatch(1);
        this.g = "PublicSuffixDatabase.list";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p2o0(j2l j2lVar, ngb ngbVar, rq90 rq90Var, mib1 mib1Var, ur90 ur90Var, rit ritVar, f7l f7lVar, itk1 itk1Var, g6a0 g6a0Var, cgc1 cgc1Var, dpy0 dpy0Var, lbq lbqVar, my5 my5Var, dpb dpbVar) {
        this.a = (byte) 28;
        Set setW0 = dm61.w0(new but[]{j2lVar, rq90Var});
        if (lbqVar.a()) {
            setW0.add(ngbVar);
        }
        if (dpbVar.isEnabled()) {
            setW0.add(my5Var);
        }
        setW0.addAll(w7x.a);
        this.b = setW0;
        this.c = Collections.singleton(f7lVar);
        this.d = f46.S0(new xu40[]{ur90Var, ritVar});
        this.e = f46.S0(new xz71[]{itk1Var, g6a0Var});
        this.f = Collections.singleton(mib1Var);
        this.g = dm61.w0(new ed0[]{cgc1Var, dpy0Var});
    }

    public p2o0(Context context, q2o0 q2o0Var, d3o0 d3o0Var, u210 u210Var, Scheduler scheduler) {
        this.a = (byte) 0;
        this.b = q2o0Var;
        this.c = d3o0Var;
        this.d = u210Var;
        this.e = scheduler;
        this.f = context.getApplicationContext();
        this.g = new PublishSubject();
    }

    public p2o0(bnr bnrVar, uw0 uw0Var, q3c q3cVar, q7r0 q7r0Var, yqg yqgVar, lzn0 lzn0Var) {
        this.a = (byte) 11;
        this.b = bnrVar;
        this.c = uw0Var;
        this.d = q7r0Var;
        this.e = yqgVar;
        this.f = lzn0Var;
        this.g = new idd1(new opg(this, (byte) 2));
    }

    public p2o0(iac0 iac0Var, xrc0 xrc0Var, b2p b2pVar, b2p b2pVar2) {
        this.a = (byte) 9;
        this.b = iac0Var;
        this.c = xrc0Var;
        this.d = b2pVar;
        this.e = b2pVar2;
        z6x z6xVar = z6x.a;
        this.f = gio1.b(new uyd(z6xVar, z6xVar, false, true));
    }

    public p2o0(lmf0 lmf0Var, iac0 iac0Var, mr20 mr20Var) {
        this.a = (byte) 18;
        this.b = lmf0Var;
        this.c = iac0Var;
        this.d = iy81.a(new blp(this, 1, (byte) 17));
        this.e = iy81.a(new blp(this, 0, (byte) 17));
        this.f = iy81.a(new blp(this, 2, (byte) 17));
        this.g = new blp(this, 3, (byte) 17);
    }

    public p2o0(ntm ntmVar, ryj ryjVar, ttm ttmVar, q7r0 q7r0Var) {
        this.a = (byte) 15;
        this.b = ntmVar;
        this.c = q7r0Var;
        byte b = 14;
        this.d = xqu.b(new d7p(this, 0, b));
        this.e = xqu.b(new d7p(this, 1, b));
        this.f = iy81.a(new d7p(this, 2, b));
        this.g = new d7p(this, 3, b);
    }

    public p2o0(v540 v540Var, w540 w540Var, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.b = v540Var;
        this.c = q7r0Var;
        this.d = xqu.b(new chp(this, 0, (byte) 13));
        this.e = new chp(this, 2, (byte) 13);
        this.f = new chp(this, 3, (byte) 13);
        this.g = iy81.a(new chp(this, 1, (byte) 13));
    }

    public p2o0(yw91 yw91Var, zw91 zw91Var, q7r0 q7r0Var) {
        this.a = (byte) 24;
        this.b = yw91Var;
        this.c = q7r0Var;
        this.d = xqu.b(new ipq(this, 0, (byte) 20));
        this.e = new ipq(this, 1, (byte) 20);
        this.f = iy81.a(new ipq(this, 2, (byte) 20));
        this.g = iy81.a(new ipq(this, 3, (byte) 20));
    }

    public p2o0(xje xjeVar, zje zjeVar, q7r0 q7r0Var) {
        this.a = (byte) 14;
        this.b = xjeVar;
        this.c = q7r0Var;
        this.d = xqu.b(new b2p(this, 0, (byte) 12));
        this.e = xqu.b(new b2p(this, 1, (byte) 12));
        this.f = iy81.a(new b2p(this, 2, (byte) 12));
        this.g = iy81.a(new b2p(this, 3, (byte) 12));
    }

    public p2o0(vyb0 vyb0Var, uyb0 uyb0Var) {
        this.a = (byte) 17;
        this.b = vyb0Var;
        this.c = uyb0Var;
        this.d = iy81.a(new blp(this, 1, (byte) 3));
        this.e = new blp(this, 3, (byte) 3);
        this.f = iy81.a(new blp(this, 2, (byte) 3));
        this.g = iy81.a(new blp(this, 0, (byte) 3));
    }

    public p2o0(ntz0 ntz0Var, muz0 muz0Var, q7r0 q7r0Var) {
        this.a = (byte) 23;
        this.b = ntz0Var;
        this.c = muz0Var;
        this.d = q7r0Var;
        this.e = new ykq(this, 1, (byte) 8);
        this.f = new ykq(this, 2, (byte) 8);
        this.g = iy81.a(new ykq(this, 0, (byte) 8));
    }

    public p2o0(pug pugVar) {
        this.a = (byte) 20;
        this.b = pugVar;
        byte b = 9;
        this.c = iy81.a(new ywp(this, 0, b));
        this.d = iy81.a(new ywp(this, 2, b));
        this.e = iy81.a(new ywp(this, 1, b));
        this.f = new ywp(this, 3, b);
        this.g = new ywp(this, 4, b);
    }

    public p2o0(nwp nwpVar, n6r0 n6r0Var, lik1 lik1Var, gn10 gn10Var, iac0 iac0Var) {
        this.a = (byte) 19;
        this.f = nwpVar;
        this.b = n6r0Var;
        this.c = iac0Var;
        this.d = lik1Var;
        this.e = gn10Var;
        this.g = xqu.b(new fup(nwpVar, (byte) 7));
    }

    public p2o0(daq daqVar, AccountSwitcherActivity accountSwitcherActivity) {
        this.a = (byte) 21;
        this.c = daqVar;
        this.b = accountSwitcherActivity;
        this.d = xqu.b(new p2p(daqVar, this, 2, (byte) 10));
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 10));
        this.f = new p2p(daqVar, this, 0, (byte) 10);
        this.g = xqu.b(new p2p(daqVar, this, 3, (byte) 10));
    }

    public p2o0(daq daqVar, uw0 uw0Var, mwg0 mwg0Var) {
        this.a = (byte) 22;
        this.c = daqVar;
        this.d = uw0Var;
        this.b = mwg0Var;
        byte b = 14;
        this.e = xqu.b(new s2q(daqVar, this, 0, b));
        this.f = xqu.b(new s2q(daqVar, this, 1, b));
        this.g = new s2q(daqVar, this, 2, b);
    }
}
