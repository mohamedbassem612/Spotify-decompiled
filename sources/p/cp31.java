package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.c;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.playlist.policy.proto.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.policy.proto.CollaboratorPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cp31 implements lqw, Function, dl4, vkn0, b0z0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public cp31(cxn0 cxn0Var, k1c0 k1c0Var, q2g0 q2g0Var) {
        this.a = cxn0Var;
        this.b = k1c0Var;
        this.c = q2g0Var;
        qmo qmoVar = new qmo();
        this.d = qmoVar;
        this.e = new ki10(cxn0Var, new ki10(qmoVar, k1c0Var));
        this.f = new bp31(this);
    }

    public static IntentFilter B(String str, String str2) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
        intentFilter.addCategory(str.concat(".SPOTIFY_CONNECT"));
        intentFilter.addAction("android.media.intent.action.PLAY");
        intentFilter.addDataScheme("http");
        intentFilter.addDataScheme("https");
        intentFilter.addDataScheme("rtsp");
        intentFilter.addDataScheme("file");
        try {
            intentFilter.addDataType(str2);
            return intentFilter;
        } catch (IntentFilter.MalformedMimeTypeException e) {
            Logger.d("Data type not supported: " + e, new Object[0]);
            return intentFilter;
        }
    }

    public static boolean D(p2i0 p2i0Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = p2i0Var.a;
        int i4 = p2i0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && p2i0Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && p2i0Var.e == i3;
    }

    public static void H(Context context, o5e0 o5e0Var, Function0 function0) {
        g7o0 g7o0Var;
        if (!o5e0Var.e() || ((g7o0Var = ((i5e0) o5e0Var).b) != g7o0.c && g7o0Var != g7o0.b)) {
            function0.invoke();
        } else if (Build.VERSION.SDK_INT >= 29) {
            context.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
        }
    }

    public static final /* synthetic */ zfr p(cp31 cp31Var) {
        return (zfr) cp31Var.c;
    }

    public static p2i0 z(r8u0 r8u0Var, b380 b380Var, p2i0 p2i0Var, dqe1 dqe1Var) {
        sqe1 sqe1VarD0 = r8u0Var.d0();
        int iV0 = r8u0Var.v0();
        Object objL = sqe1VarD0.p() ? null : sqe1VarD0.l(iV0);
        int iB = (r8u0Var.o() || sqe1VarD0.p()) ? -1 : sqe1VarD0.f(iV0, dqe1Var, false).b(zoi1.W(r8u0Var.v()) - dqe1Var.e);
        for (int i = 0; i < b380Var.size(); i++) {
            p2i0 p2i0Var2 = (p2i0) b380Var.get(i);
            if (D(p2i0Var2, objL, r8u0Var.o(), r8u0Var.X(), r8u0Var.D0(), iB)) {
                return p2i0Var2;
            }
        }
        if (b380Var.isEmpty() && p2i0Var != null && D(p2i0Var, objL, r8u0Var.o(), r8u0Var.X(), r8u0Var.D0(), iB)) {
            return p2i0Var;
        }
        return null;
    }

    public bp31 A() {
        return (bp31) this.f;
    }

    public ji10 C(Class cls) {
        return ((ki10) this.e).b0(cls);
    }

    public mr20 E(boolean z) {
        String str = (String) this.a;
        if (!z) {
            return new qbk(new te1(d3p1.F((d0r) this.c, (o3r) this.e, str), (byte) 25), this, (byte) 21);
        }
        rsc0 rsc0Var = (xrc0) this.b;
        oxg oxgVarP = CollaboratingUsersDecorationPolicy.p();
        qyg qygVarP = CollaboratorPolicy.p();
        qygVarP.n();
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.u();
        i8i1VarO.s();
        i8i1VarO.n();
        i8i1VarO.r();
        i8i1VarO.q();
        i8i1VarO.t();
        qygVarP.s(i8i1VarO);
        oxgVarP.n(qygVarP);
        oxgVarP.q();
        oxgVarP.r(-1);
        return new qbk(hu20.c(rsc0Var.l(str, oxgVarP.build()), new jte(2, (lnm) null, (byte) 10)), this, (byte) 20);
    }

    public Map F() {
        daq daqVar = (daq) this.b;
        return g7y.y(new hv4(false, false, false, (luk) daqVar.L1.get()), (fza1) daqVar.Df.get(), new jxa((byte) 2), (yqg) daqVar.J1.get());
    }

    public oto0 G() {
        pi50 pi50Var = (pi50) this.a;
        luk lukVar = (luk) pi50Var.i.get();
        c8o.l(lukVar);
        yg4 yg4Var = new yg4(lukVar);
        add addVar = (add) pi50Var.m.get();
        c8o.l(addVar);
        return new oto0(yg4Var, addVar);
    }

    public ifl1 I() throws GeneralSecurityException {
        try {
            gl4 gl4Var = (gl4) this.d;
            if (gl4Var != null) {
                try {
                    eva0 eva0VarB = eea0.k((ke71) this.a, gl4Var).b();
                    bva0 bva0Var = (we40) eva0VarB.f(5);
                    bva0Var.d();
                    we40.e(((we40) bva0Var).b, eva0VarB);
                    return new ifl1(bva0Var, (byte) 20);
                } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                }
            }
            eva0 eva0VarB2 = eea0.a(eva0.s(((ke71) this.a).p(), tz00.a())).b();
            bva0 bva0Var2 = (we40) eva0VarB2.f(5);
            bva0Var2.d();
            we40.e(((we40) bva0Var2).b, eva0VarB2);
            return new ifl1(bva0Var2, (byte) 20);
        } catch (FileNotFoundException unused2) {
            if (((upa0) this.e) == null) {
                k220.r("cannot read or generate keyset");
                return null;
            }
            bva0 bva0VarR = eva0.r();
            ifl1 ifl1Var = new ifl1(bva0VarR, (byte) 20);
            upa0 upa0Var = (upa0) this.e;
            synchronized (ifl1Var) {
                tpa0 tpa0Var = (tpa0) upa0Var.b;
                synchronized (ifl1Var) {
                    dva0 dva0VarL = ifl1Var.l(tpa0Var);
                    bva0VarR.d();
                    ((we40) bva0VarR).b.m(dva0VarL);
                    int iM = woi1.a((eva0) ifl1Var.i().b).n().m();
                    synchronized (ifl1Var) {
                        for (int i = 0; i < ((we40) ((bva0) ifl1Var.b)).b.o(); i++) {
                            try {
                                dva0 dva0VarN = ((we40) ((bva0) ifl1Var.b)).b.n(i);
                                if (dva0VarN.n() == iM) {
                                    if (!dva0VarN.p().equals(rpa0.c)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM);
                                    }
                                    bva0 bva0Var3 = (bva0) ifl1Var.b;
                                    bva0Var3.d();
                                    ((we40) bva0Var3).b.t(iM);
                                    if (((gl4) this.d) != null) {
                                        eea0 eea0VarI = ifl1Var.i();
                                        dc31 dc31Var = (dc31) this.b;
                                        gl4 gl4Var2 = (gl4) this.d;
                                        eva0 eva0Var = (eva0) eea0VarI.b;
                                        byte[] bArrA = gl4Var2.a(eva0Var.c(), new byte[0]);
                                        try {
                                            if (!eva0.s(gl4Var2.b(bArrA, new byte[0]), tz00.a()).equals(eva0Var)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            czx czxVarN = dzx.n();
                                            ghc ghcVarD = ohc.d(0, bArrA, bArrA.length);
                                            czxVarN.d();
                                            ((we40) czxVarN).b.p(ghcVarD);
                                            iva0 iva0VarA = woi1.a(eva0Var);
                                            czxVarN.d();
                                            ((we40) czxVarN).b.q(iva0VarA);
                                            if (!((SharedPreferences.Editor) dc31Var.b).putString((String) dc31Var.c, hm5.s(czxVarN.a().c())).commit()) {
                                                k220.i("Failed to write to SharedPreferences");
                                                return null;
                                            }
                                        } catch (InvalidProtocolBufferException unused3) {
                                            k220.r("invalid keyset, corrupted key material");
                                            return null;
                                        }
                                    } else {
                                        eea0 eea0VarI2 = ifl1Var.i();
                                        dc31 dc31Var2 = (dc31) this.b;
                                        if (!((SharedPreferences.Editor) dc31Var2.b).putString((String) dc31Var2.c, hm5.s(((eva0) eea0VarI2.b).c())).commit()) {
                                            k220.i("Failed to write to SharedPreferences");
                                            return null;
                                        }
                                    }
                                    return ifl1Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + iM);
                    }
                }
            }
        }
    }

    public gl4 J() throws KeyStoreException {
        hl4 hl4Var = new hl4();
        boolean zC = hl4Var.c((String) this.c);
        if (!zC) {
            try {
                hl4.a((String) this.c);
            } catch (GeneralSecurityException | ProviderException unused) {
                return null;
            }
        }
        try {
            return hl4Var.b((String) this.c);
        } catch (GeneralSecurityException | ProviderException e) {
            if (zC) {
                throw new KeyStoreException(f4i1.f("the master key ", (String) this.c, " exists but is unusable"), e);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8 == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object K(p.onm r8) {
        /*
            r7 = this;
            p.oxq r0 = p.oxq.c
            boolean r1 = r8 instanceof p.exq
            if (r1 == 0) goto L15
            r1 = r8
            p.exq r1 = (p.exq) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            p.exq r1 = new p.exq
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.a
            int r2 = r1.c
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            p.hm5.M(r8)
            goto L64
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L33:
            p.hm5.M(r8)
            goto L4f
        L37:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.d
            p.dxz0 r8 = (p.dxz0) r8
            io.reactivex.rxjava3.core.Observable r8 = r8.e()
            p.ezc r8 = p.yoi1.g(r8)
            r1.c = r5
            java.lang.Object r8 = p.b5p1.i(r8, r1)
            if (r8 != r6) goto L4f
            goto L63
        L4f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7d
            java.lang.Object r7 = r7.f
            p.um40 r7 = (p.um40) r7
            r1.c = r4
            java.lang.Object r8 = r7.a(r1)
            if (r8 != r6) goto L64
        L63:
            return r6
        L64:
            p.rm40 r8 = (p.rm40) r8
            boolean r7 = r8 instanceof p.pm40
            if (r7 == 0) goto L74
            p.sxq r7 = new p.sxq
            p.pm40 r8 = (p.pm40) r8
            java.util.List r8 = r8.a
            r7.<init>(r8)
            return r7
        L74:
            boolean r7 = r8 instanceof p.qm40
            if (r7 == 0) goto L79
            goto L7d
        L79:
            p.eg.o()
            return r3
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cp31.K(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r9 == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object L(java.util.ArrayList r8, p.onm r9) {
        /*
            r7 = this;
            p.oxq r0 = p.oxq.e
            boolean r1 = r9 instanceof p.fxq
            if (r1 == 0) goto L15
            r1 = r9
            p.fxq r1 = (p.fxq) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            p.fxq r1 = new p.fxq
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.b
            int r2 = r1.d
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            p.hm5.M(r9)
            goto L6a
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L33:
            java.util.ArrayList r8 = r1.a
            p.hm5.M(r9)
            goto L53
        L39:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.d
            p.dxz0 r9 = (p.dxz0) r9
            io.reactivex.rxjava3.core.Observable r9 = r9.e()
            p.ezc r9 = p.yoi1.g(r9)
            r1.a = r8
            r1.d = r5
            java.lang.Object r9 = p.b5p1.i(r9, r1)
            if (r9 != r6) goto L53
            goto L69
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L75
            java.lang.Object r7 = r7.e
            p.ho21 r7 = (p.ho21) r7
            r1.a = r3
            r1.d = r4
            java.lang.Object r9 = r7.invoke(r8, r1)
            if (r9 != r6) goto L6a
        L69:
            return r6
        L6a:
            p.sy21 r9 = (p.sy21) r9
            p.ry21 r7 = r9.a
            boolean r7 = r7.Q0
            if (r7 == 0) goto L75
            p.oxq r7 = p.oxq.f
            return r7
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cp31.L(java.util.ArrayList, p.onm):java.lang.Object");
    }

    public mzr0 M() {
        l3q l3qVar = (l3q) this.c;
        daq daqVar = l3qVar.a;
        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
        c8o.l(i8h1Var);
        u9c0 u9c0VarU = u();
        String strD = ((qop) this.b).d();
        iyc0 iyc0Var = (iyc0) l3qVar.b.g1.get();
        c8o.l(iyc0Var);
        kt91 kt91Var = (kt91) daqVar.f8.get();
        c8o.l(kt91Var);
        zwz0 zwz0Var = (zwz0) daqVar.U1.get();
        c8o.l(zwz0Var);
        return new mzr0(i8h1Var, u9c0VarU, strD, iyc0Var, kt91Var, zwz0Var);
    }

    public void N(int i) {
        kt91 kt91Var = (kt91) this.c;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public void O(sqe1 sqe1Var) {
        b380 b380Var;
        h380 h380VarA = j380.a();
        if (((b380) this.b).isEmpty()) {
            q(h380VarA, (p2i0) this.e, sqe1Var);
            if (!Objects.equals((p2i0) this.f, (p2i0) this.e)) {
                q(h380VarA, (p2i0) this.f, sqe1Var);
            }
            if (!Objects.equals((p2i0) this.d, (p2i0) this.e) && !Objects.equals((p2i0) this.d, (p2i0) this.f)) {
                q(h380VarA, (p2i0) this.d, sqe1Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((b380) this.b).size();
                b380Var = (b380) this.b;
                if (i >= size) {
                    break;
                }
                q(h380VarA, (p2i0) b380Var.get(i), sqe1Var);
                i++;
            }
            if (!b380Var.contains((p2i0) this.d)) {
                q(h380VarA, (p2i0) this.d, sqe1Var);
            }
        }
        this.c = h380VarA.b(true);
    }

    public void P(upa0 upa0Var) {
        this.e = upa0Var;
    }

    public void Q(String str) {
        if (str.startsWith("android-keystore://")) {
            this.c = str;
        } else {
            hhg1.n("key URI must start with android-keystore://");
        }
    }

    public void R(Context context, String str, String str2) {
        if (context == null) {
            hhg1.n("need an Android context");
        } else {
            this.a = new ke71(context, str, str2);
            this.b = new dc31(context, str, str2);
        }
    }

    public jgb1 a(f5y0 f5y0Var) {
        g58 g58Var = (g58) this.d;
        kdy0 kdy0Var = g58Var.c;
        Context context = g58Var.f;
        return v(f5y0Var, kdy0.d(kdy0Var, new nzy0(g58Var.a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961970), (String) null, 11, (DefaultConstructorMarker) null), u6t.e1)), new nzy0(g58Var.a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), xzu.b)), false, 28));
    }

    public Object apply(Object obj) {
        ypk ypkVar = (ypk) this.f;
        zpk zpkVar = (zpk) this.a;
        YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) obj;
        if (yourLibraryDecorateResponse.a() != 1) {
            return zpkVar.a((lik1) this.b, (String) this.c, (String) this.d, (String) this.e, (String) null, ypkVar, "");
        }
        YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntityN = yourLibraryDecorateResponse.n();
        return zpkVar.a((lik1) this.b, (String) this.c, (String) this.d, (String) this.e, yourLibraryDecoratedEntityN.e().q(), ypkVar, zpkVar.j.getResources().getString(2131955781, yourLibraryDecoratedEntityN.t().p(), yourLibraryDecoratedEntityN.t().n()));
    }

    public jgb1 b(f5y0 f5y0Var) {
        g58 g58Var = (g58) this.d;
        return v(f5y0Var, kdy0.d(g58Var.c, new nzy0(new wxm0(true, new nnu(g58Var, kno1.c, (lnm) null, (byte) 6))), ((hys0) g58Var.e.b).a() ? new nzy0(new wxm0(true, new nnu(g58Var, kno1.d, (lnm) null, (byte) 6))) : mzy0.e, false, 28));
    }

    public lud0 c() {
        return new lud0((xup) ((jly0) this.f).get(), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public void d(Object obj) {
        c5h c5hVar;
        d5h d5hVar = (d5h) obj;
        p811 p811Var = (p811) this.a;
        p811Var.a = d5hVar.h;
        h141 h141Var = (h141) this.b;
        e5h e5hVar = (e5h) h141Var.getState();
        boolean z = d5hVar.d;
        c380 c380Var = d5hVar.c;
        boolean z2 = d5hVar.e;
        String str = d5hVar.g;
        l811 l811Var = (l811) this.c;
        l811 l811Var2 = (l811) this.d;
        boolean z3 = l811Var.a;
        if (z3) {
            c5hVar = c5h.a;
        } else {
            Object obj2 = p811Var.a;
            c5hVar = c5h.b;
            if (obj2 != c5hVar && !l811Var2.a) {
                c5hVar = c5h.a;
            }
        }
        h141Var.e(e5h.a(e5hVar, z, c380Var, z2, str, c5hVar, z3, 3263));
    }

    public void dispose() {
        faa0 faa0Var = (faa0) this.f;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
    }

    public jgb1 e(f5y0 f5y0Var) {
        kdy0 kdy0Var = ((g58) this.d).c;
        mzy0 mzy0Var = mzy0.d;
        return v(f5y0Var, kdy0.d(kdy0Var, mzy0Var, mzy0Var, false, 16));
    }

    public jgb1 f(f5y0 f5y0Var) {
        return v(f5y0Var, kdy0.d(((g58) this.d).c, mzy0.d, mzy0.e, false, 28));
    }

    public void g(a8c a8cVar, o5e0 o5e0Var, qim0 qim0Var, Function0 function0, boolean z, b0k b0kVar, int i) {
        int i2;
        o5e0 o5e0Var2;
        Function0 function1;
        cp31 cp31Var;
        b0k b0kVar2;
        float fE;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2081703075);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(a8cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            o5e0Var2 = o5e0Var;
            i2 |= b0kVar3.i(o5e0Var2) ? 32 : 16;
        } else {
            o5e0Var2 = o5e0Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= b0kVar3.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(this) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            cir0 cir0Var = (cir0) b0kVar3.k(k2r0.a);
            boolean zG = b0kVar3.g(cir0Var);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new th41(cir0Var, (lzn0) this.b);
                b0kVar3.s0(objT);
            }
            this.f = (th41) objT;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            if (z) {
                b0kVar3.i0(-2121202801);
                b0kVar3.r(false);
                fE = 0.0f;
            } else {
                fE = z5c.e(b0kVar3, -2121201986, 2131165289, b0kVar3, false);
            }
            qim0 qim0VarZ = uyn1.z(fE, 0.0f, 2, qim0VarD);
            gra graVar = een.h;
            cp31Var = this;
            j2i j2iVarR = apo.r(-178525831, new l8c(a8cVar, cir0Var, o5e0Var2, this, function1), b0kVar3);
            b0kVar2 = b0kVar3;
            w2g0.c(qim0VarZ, graVar, j2iVarR, b0kVar2, 3072, 4);
            boolean zI = b0kVar2.i(cp31Var);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new tla(cp31Var, (byte) 24);
                b0kVar2.s0(objT2);
            }
            hhr0.a((iu30) objT2, b0kVar2, 0);
        } else {
            cp31Var = this;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(cp31Var, a8cVar, o5e0Var, qim0Var, function0, z, i);
        }
    }

    public jgb1 h(f5y0 f5y0Var) {
        g58 g58Var = (g58) this.d;
        kdy0 kdy0Var = g58Var.c;
        Context context = g58Var.f;
        return v(f5y0Var, kdy0.d(kdy0Var, new nzy0(g58Var.a(false, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961970), (String) null, 11, (DefaultConstructorMarker) null), xzu.c)), new nzy0(g58Var.a(false, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), xzu.d)), false, 28));
    }

    public jgb1 i(f5y0 f5y0Var) {
        g58 g58Var = (g58) this.d;
        return v(f5y0Var, kdy0.d(g58Var.c, mzy0.d, new nzy0(g58Var.a(false, new DynamicTagsMetadata((String) null, (String) null, g58Var.f.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), (Function0) null)), false, 28));
    }

    public jgb1 j(f5y0 f5y0Var) {
        kdy0 kdy0Var = ((g58) this.d).c;
        mzy0 mzy0Var = mzy0.d;
        return v(f5y0Var, kdy0.d(kdy0Var, mzy0Var, mzy0Var, false, 28));
    }

    public void k(Object obj, tqw tqwVar) {
        ((g5h) this.e).Y.invoke((b5h) obj);
    }

    public void l(o5e0 o5e0Var, xpw xpwVar, g9c g9cVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        eww0 profile;
        a8c a8cVar;
        BrowseState browseState;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2081602379);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(o5e0Var) ? 4 : 2) | (x340Var.i(xpwVar) ? 32 : 16) | (x340Var.i(g9cVar) ? 256 : 128) | 3072 | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarD, lhc.g(x340Var).f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            String str = (String) this.c;
            String strO0 = cwl1.o0(x340Var, 2131953008);
            f5e0 f5e0Var = o5e0Var instanceof f5e0 ? (f5e0) o5e0Var : null;
            BrowseState.Content contentA = (f5e0Var == null || (a8cVar = (a8c) f5e0Var.a) == null || (browseState = (BrowseState) a8cVar.X.getValue()) == null) ? null : c.a(browseState);
            cev0.b((contentA == null || (profile = contentA.getProfile()) == null) ? new j3f1(str, str, (String) null, (String) null) : t6c.a(profile, strO0), xpwVar, g9cVar, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), x340Var, (i2 & 896) | (i2 & 112) | 512);
            qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            k4s0.i(6, j2iVar2, x340Var, true, true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(this, o5e0Var, xpwVar, g9cVar, qim0Var2, j2iVar2, i, (byte) 11);
        }
    }

    public jgb1 m(f5y0 f5y0Var) {
        g58 g58Var = (g58) this.d;
        kdy0 kdy0Var = g58Var.c;
        Context context = g58Var.f;
        return v(f5y0Var, kdy0.d(kdy0Var, new nzy0(g58Var.a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961970), (String) null, 11, (DefaultConstructorMarker) null), u6t.c1)), ((hys0) g58Var.e.b).a() ? new nzy0(g58Var.a(true, new DynamicTagsMetadata((String) null, (String) null, context.getString(2131961959), (String) null, 11, (DefaultConstructorMarker) null), u6t.d1)) : mzy0.e, false, 28));
    }

    public void n(vzq0 vzq0Var, epo1 epo1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-691992642);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vzq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(epo1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(ade0.c.a((add) this.c), apo.r(834439934, new swc(vzq0Var, epo1Var, this, (byte) 8), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, vzq0Var, epo1Var, i, (byte) 18);
        }
    }

    public void q(h380 h380Var, p2i0 p2i0Var, sqe1 sqe1Var) {
        if (p2i0Var == null) {
            return;
        }
        if (sqe1Var.b(p2i0Var.a) != -1) {
            h380Var.e(p2i0Var, sqe1Var);
            return;
        }
        sqe1 sqe1Var2 = (sqe1) ((gg11) this.c).get(p2i0Var);
        if (sqe1Var2 != null) {
            h380Var.e(p2i0Var, sqe1Var2);
        }
    }

    public jq4 r() {
        luk lukVar = (luk) ((kzp) this.c).a.L1.get();
        c8o.l(lukVar);
        return new jq4(lukVar);
    }

    public synchronized a42 s() {
        a42 a42Var;
        try {
            if (((String) this.c) != null) {
                this.d = J();
            }
            this.f = I();
            a42Var = new a42();
            a42Var.b = (ifl1) this.f;
        } catch (Throwable th) {
            throw th;
        }
        return a42Var;
    }

    public void t() {
        tac0 tac0Var;
        tac0 tac0Var2;
        qmo qmoVar = (qmo) this.d;
        zf30 zf30Var = qmoVar.b;
        if (zf30Var != null && (tac0Var2 = zf30Var.s1) != null) {
            tac0Var2.d(qmoVar.c);
        }
        qmoVar.b = null;
        qmoVar.a.b((bbr0) null);
        q2g0 q2g0Var = (q2g0) this.c;
        zf30 zf30Var2 = q2g0Var.c;
        if (zf30Var2 != null && (tac0Var = zf30Var2.s1) != null) {
            tac0Var.d(q2g0Var.d);
        }
        q2g0Var.c = null;
        q2g0Var.b.b((bbr0) null);
    }

    public u9c0 u() {
        return cto1.q(((qop) this.b).c());
    }

    public jgb1 v(mr20 mr20Var, pux0 pux0Var) {
        bw20 bw20Var = (ov20) this.a;
        mr20 mr20VarA = bw20Var.a("offline", false);
        bw20 bw20Var2 = bw20Var;
        evz evzVarR = h5p1.r(mr20VarA, bw20Var2.a("has-podcasts-available", false), bw20Var2.a("has-audiobooks-available", false), mr20Var, new mp6(5, (lnm) null, (byte) 1));
        c0g.x.getClass();
        pbo1 pbo1Var = pbo1.N0;
        mr20 mr20VarH = ((lag) this.b).h();
        xxm0 xxm0Var = new xxm0((List) pux0Var.b, (Map) pux0Var.c, new oxm0(2), new sxm0(k6n.a, new k9s(this, (byte) 12)), (mxm0) null, 16);
        p2o0 p2o0Var = (p2o0) this.f;
        xkg0 xkg0Var = new xkg0();
        if (!((t7f0) ((ps7) p2o0Var.e).b).a()) {
            xkg0Var.put("resync", new uzu(p2o0Var, (byte) 0));
        }
        xkg0Var.put("losslessDownloadWarning", new uzu(p2o0Var, (byte) 1));
        xkg0Var.put("losslessDownloadCellularEnabledWarning", new uzu(p2o0Var, (byte) 2));
        xkg0Var.put("internalQualityDownloadWarning", new uzu(p2o0Var, (byte) 3));
        xkg0Var.put("internalQualityDownloadCellularEnabledWarning", new uzu(p2o0Var, (byte) 4));
        return new jgb1("downloadQuality", 2131961836, (String) null, 2131961826, (sp00) null, (Integer) null, (a2i) null, evzVarR, pbo1Var, mr20VarH, xxm0Var, xkg0Var.b(), 4026);
    }

    public void w(Object obj) {
        AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) obj;
        appProtocolRemoteService.a = (f0q) ((jly0) this.d).get();
        daq daqVar = (daq) this.b;
        appProtocolRemoteService.b = (y610) daqVar.Tf.get();
        appProtocolRemoteService.c = (Flowable) daqVar.D5.get();
        appProtocolRemoteService.d = new jma((byte) 2, false);
        appProtocolRemoteService.e = (Scheduler) daqVar.z1.get();
        appProtocolRemoteService.f = tk00.D((ghp) daqVar.qa.get());
        appProtocolRemoteService.g = (p2p) this.e;
        appProtocolRemoteService.h = (mj61) daqVar.Jm.get();
        appProtocolRemoteService.i = new yt91((Context) daqVar.x1.a);
        appProtocolRemoteService.t = (ajg) daqVar.a2.get();
        appProtocolRemoteService.X = new ro5(new r961((Scheduler) daqVar.r3.get(), (Flowable) daqVar.z2.get(), (b7n) daqVar.L4.get(), (byte) 2), new lag((t2j0) daqVar.f2.get(), (Flowable) daqVar.z2.get(), (jqt) daqVar.Z1.get()), new nhc((byte) 10), new ow3(new km3((yze1) daqVar.Gm.get(), new x5j1((w5b1) daqVar.W3.get(), (byte) 2)), daqVar.A(), (byte) 27), (Context) daqVar.x1.a);
        appProtocolRemoteService.Y = (o241) daqVar.u4.get();
        appProtocolRemoteService.Z = (Flowable) daqVar.z2.get();
        appProtocolRemoteService.N0 = (b7n) daqVar.L4.get();
        appProtocolRemoteService.O0 = (yqg) daqVar.J1.get();
        appProtocolRemoteService.P0 = (g510) daqVar.L5.get();
        appProtocolRemoteService.Q0 = (ev5) daqVar.Km.get();
        appProtocolRemoteService.R0 = (String) ((p2p) this.f).get();
        appProtocolRemoteService.S0 = (dxz0) daqVar.I4.get();
        appProtocolRemoteService.T0 = daqVar.Y1();
        appProtocolRemoteService.U0 = F();
        appProtocolRemoteService.V0 = new fl4(false, (luk) daqVar.L1.get()).a() ? new lan1(new ow3((Context) daqVar.x1.a), (byte) 14) : new f4x0((byte) 28);
        appProtocolRemoteService.W0 = (nfa0) daqVar.b2.get();
        appProtocolRemoteService.X0 = (t2j0) daqVar.f2.get();
    }

    public knn x() {
        hmn hmnVar = (hmn) this.a;
        lzn0 lzn0VarC = hmnVar.c();
        c8o.l(lzn0VarC);
        ryj ryjVar = (ryj) this.b;
        ix81 ix81VarA = ryjVar.a();
        c8o.l(ix81VarA);
        gw70 gw70VarB = ryjVar.b();
        pe peVarG = us71.g(gw70VarB, ryjVar);
        c8o.l(ryjVar.f());
        qyj qyjVar = new qyj(ix81VarA, new q3b1(gw70VarB, peVarG));
        mnn mnnVar = (mnn) this.c;
        ynb0 ynb0VarA = xqu.a((i8p) this.e);
        lnn lnnVar = (lnn) this.d;
        gnn gnnVar = (gnn) lnnVar.c.get();
        c8o.l(gnnVar);
        onn onnVar = (onn) lnnVar.d.get();
        c8o.l(onnVar);
        return new knn(lzn0VarC, qyjVar, mnnVar, ynb0VarA, gnnVar, onnVar, hmnVar.e(), xqu.a((i8p) this.f));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object y(pp90 pp90Var, onm onmVar) {
        msr msrVar;
        pp90 pp90Var2 = pp90Var;
        if (onmVar instanceof msr) {
            msrVar = (msr) onmVar;
            int i = msrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                msrVar.d = i - Integer.MIN_VALUE;
            } else {
                msrVar = new msr(this, onmVar);
            }
        } else {
            msrVar = new msr(this, onmVar);
        }
        Object objP = msrVar.b;
        int i2 = msrVar.d;
        if (i2 == 0) {
            hm5.M(objP);
            if (!((no4) ((b0a0) this.e).a.get()).O()) {
                return pp90Var2;
            }
            ArrayList<hp90> arrayList = pp90Var2.c;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (hp90 hp90Var : arrayList) {
                arrayList2.add(new cqi0(hp90Var.c, hp90Var.g));
            }
            List listJ0 = o7h.j0(arrayList2);
            yrg0 yrg0Var = (yrg0) this.d;
            msrVar.a = pp90Var2;
            msrVar.d = 1;
            objP = yrg0Var.p(listJ0, msrVar);
            Object obj = d9n.a;
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pp90Var2 = msrVar.a;
            hm5.M(objP);
        }
        Map map = (Map) objP;
        o4s o4sVar = (o4s) this.f;
        np90 np90Var = pp90Var2.h;
        ArrayList arrayList3 = pp90Var2.c;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(uwo1.l((hp90) it.next(), map));
        }
        return new pp90(pp90Var2.a, pp90Var2.b, arrayList4, pp90Var2.d, pp90Var2.e, pp90Var2.f, new np90(o4sVar.a.getString(2131956941, pno1.h(arrayList4).b), uwo1.l(np90Var.b, map), np90Var.c, np90Var.d, np90Var.e, np90Var.f, np90Var.g, np90Var.h, np90Var.i, np90Var.j, np90Var.k));
    }

    public /* synthetic */ cp31(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public cp31() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
