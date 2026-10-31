package p;

import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.c;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v6a0 implements d7a0, zdg, Function, t2n, qlc1, jl51, k1q0, qmr0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public v6a0(o5 o5Var, Class cls) {
        this.a = (byte) 3;
        if (!((Map) o5Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
            hhg1.n(gvg.h("Given internalKeyMananger ", o5Var.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.b = o5Var;
        this.c = cls;
    }

    public void A(smr0 smr0Var) {
        kqd0 kqd0Var = (kqd0) this.b;
        if (kqd0Var.P0 == ((ixg) this.c)) {
            kqd0Var.P0 = null;
            if (smr0Var != null) {
                int iJ = w5p1.j(smr0Var);
                kqd0Var.f.a.m((Object) null, Integer.valueOf(iJ));
                kqd0Var.O0.a(vno1.j(0.5f, iJ));
            }
        }
    }

    public ydg a(heg hegVar) {
        uqv0 uqv0Var = (uqv0) this.b;
        zht zhtVar = (zht) this.c;
        ((u321) zhtVar.c().c).getClass();
        jc11 jc11VarH = q1o1.h(uqv0Var, hegVar, joj0.g);
        if (jc11VarH == null) {
            return null;
        }
        bb11.a(jc11VarH.a).equals(hegVar);
        return zhtVar.g(jc11VarH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        CompletableOnErrorComplete completableOnErrorCompleteO;
        byte b = this.a;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        byte b2 = 2;
        lnm lnmVar = null;
        byte b3 = 1;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 4:
                ii8 ii8Var = (ji8) obj;
                di8 di8Var = ((p0b0) obj3).a;
                if (ii8Var.equals(ei8.a)) {
                    String str = di8Var.a;
                    SharedPreferences sharedPreferences = (SharedPreferences) ((wza0) obj2).n.getValue();
                    if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorRemove = editorEdit.remove(str)) != null) {
                        editorRemove.apply();
                    }
                    return j5.a;
                }
                if (ii8Var instanceof fi8) {
                    return spq0.d(di8Var);
                }
                if (ii8Var instanceof gi8) {
                    return spq0.d(di8Var);
                }
                if (ii8Var instanceof ii8) {
                    return spq0.d(ii8Var.a);
                }
                eg.o();
                return null;
            case 7:
                odb0 odb0Var = (odb0) obj2;
                peb0 peb0Var = odb0Var.e;
                String str2 = (String) obj3;
                str2.getClass();
                return peb0Var.a(new oeb0(new seb0(str2))).g(new tt60(odb0Var, str2, b3));
            case 12:
                Boolean bool = (Boolean) obj;
                ContextTrack contextTrack = (ContextTrack) obj2;
                if (!l4o1.Y(contextTrack)) {
                    String strUri = contextTrack.uri();
                    Set set = s4b1.f;
                    if (uic.x(strUri).c == blc0.Pg || (uic.x(contextTrack.uri()).c == blc0.ti && ((rn4) obj3).a() && !bool.booleanValue())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                String str3 = (String) obj;
                m1c0 m1c0Var = (m1c0) obj3;
                pux0 pux0Var = m1c0Var.c;
                String str4 = (String) obj2;
                if (str3.equals(str4)) {
                    return CompletableEmpty.a;
                }
                if (str4.length() > 0) {
                    Completable completableA = ((gyy0) pux0Var.c).a(Collections.singletonList(new eyy0(str4)));
                    completableA.getClass();
                    completableOnErrorCompleteO = completableA.o(Functions.h);
                } else {
                    completableOnErrorCompleteO = CompletableEmpty.a;
                }
                completableOnErrorCompleteO.getClass();
                gyy0 gyy0Var = (gyy0) pux0Var.c;
                zym0 zym0Var = (ajg) pux0Var.b;
                String str5 = zym0Var.a;
                String str6 = Build.VERSION.RELEASE;
                return completableOnErrorCompleteO.c(gyy0Var.b(new nxy0(str3, str5, zym0Var.e())).g(new l1c0(m1c0Var, str3, (byte) 1)).h(k530.X0));
            case 15:
                List list = (List) obj;
                icc0 icc0Var = (icc0) obj2;
                String str7 = icc0Var.k.a;
                r87 r87Var = icc0Var.g;
                int i = r87Var.e;
                ivd ivdVar = new ivd(list, !list.isEmpty(), (el51) null, w7x.a, r87Var);
                ivd ivdVarN = ivdVar.n((List) obj3);
                if ((2 & 1) == 0) {
                    ivdVar = ivdVarN;
                }
                return Collections.singletonMap(str7, new ejr0(ivdVar, (2 & 2) != 0 ? i : 0));
            default:
                s3s0 s3s0Var = (s3s0) obj;
                y6b1 y6b1Var = (y6b1) obj3;
                rkd0 rkd0Var = (rkd0) obj2;
                String str8 = s3s0Var.a;
                Long l = s3s0Var.b;
                if (str8 == null || l == null) {
                    Observable observableJust = Observable.just(new t3s0(0L, "inferred-party-end"));
                    observableJust.getClass();
                    return observableJust;
                }
                byte b4 = 9;
                Observable observableMerge = Observable.merge(rqt0.F(rkd0Var.c, new q4d0(rkd0Var, y6b1Var, lnmVar, b4)).flatMapObservable(new haa0((Object) str8, (Object) y6b1Var, (Object) rkd0Var, (byte) 21)).map(new fad0(rkd0Var, l, b2)), rqt0.F(rkd0Var.c, new q4d0(rkd0Var, y6b1Var, lnmVar, b4)).flatMapObservable(new ye90(str8, y6b1Var, (byte) 27)).filter(ak20.h).map(new o0g(rkd0Var, l.longValue(), (byte) 5)));
                observableMerge.getClass();
                return observableMerge;
        }
    }

    public void b(uj30 uj30Var) {
        z6a0 z6a0Var = (z6a0) this.b;
        z6a0Var.d(new x6a0(z6a0Var, uj30Var.b, uj30Var.c, ((Number) z6a0Var.b.invoke((View) this.c)).intValue(), uj30Var.d));
    }

    public Single c() {
        return rqt0.F(o6x.a, new no70(this, (lnm) null, (byte) 25)).map(yz10.t).map(new yfc0(this, (byte) 0));
    }

    public boolean d(x8a0 x8a0Var) {
        return true;
    }

    public boolean e() {
        return true;
    }

    public Object g(Object obj) throws IOException {
        uz21 uz21Var = (uz21) obj;
        i8b0 i8b0Var = (i8b0) this.b;
        nma0 nma0Var = (nma0) this.c;
        try {
            gbc gbcVarD1 = uz21Var.d1();
            rhc rhcVar = j8b0.a;
            if (gbcVarD1.i0(0L, rhcVar)) {
                gbcVarD1.skip(rhcVar.a.length);
            }
            Object objS = kln1.s(i8b0Var.a, nma0Var, new bnj0(gbcVarD1));
            uz21Var.close();
            return objS;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(uz21Var, th);
                throw th2;
            }
        }
    }

    public String h() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object i(sfk0 sfk0Var, onm onmVar) {
        l4e0 l4e0Var;
        Object objC;
        if (onmVar instanceof l4e0) {
            l4e0Var = (l4e0) onmVar;
            int i = l4e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4e0Var.c = i - Integer.MIN_VALUE;
            } else {
                l4e0Var = new l4e0(this, onmVar);
            }
        } else {
            l4e0Var = new l4e0(this, onmVar);
        }
        l4e0 l4e0Var2 = l4e0Var;
        Object obj = l4e0Var2.a;
        int i2 = l4e0Var2.c;
        if (i2 == 0) {
            hm5.M(obj);
            zhk0 zhk0Var = (vhk0) this.c;
            String str = (String) this.b;
            List list = sfk0Var.a;
            l4e0Var2.c = 1;
            z6x z6xVar = z6x.a;
            objC = zhk0Var.c(str, list, z6xVar, z6xVar, l4e0Var2);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objC = ((e331) obj).a;
        }
        if (e331.a(objC) != null) {
            return lgk0.a;
        }
        jt50 jt50Var = (jt50) objC;
        return new mgk0(jt50Var.a, jt50Var.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object p(String str, onm onmVar) throws NoWhenBranchMatchedException {
        ixc0 ixc0Var;
        if (onmVar instanceof ixc0) {
            ixc0Var = (ixc0) onmVar;
            int i = ixc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixc0Var.d = i - Integer.MIN_VALUE;
            } else {
                ixc0Var = new ixc0(this, onmVar);
            }
        } else {
            ixc0Var = new ixc0(this, onmVar);
        }
        Object objJ = ixc0Var.b;
        int i2 = ixc0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (str.length() == 0) {
                    return new xlj0(new ulj0("Entity URI cannot be empty"));
                }
                rsc0 rsc0Var = (xrc0) this.b;
                rxc0 rxc0Var = new rxc0(str);
                ixc0Var.a = str;
                ixc0Var.d = 1;
                objJ = rsc0Var.j(rxc0Var, ixc0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ixc0Var.a;
                hm5.M(objJ);
            }
            oy21 oy21Var = (py21) objJ;
            if (oy21Var instanceof oy21) {
                qxc0 qxc0Var = (qxc0) oy21Var.a;
                String str2 = qxc0Var.a;
                wls0 wls0Var = qxc0Var.i;
                String str3 = qxc0Var.e;
                return new ylj0(new bxc0(str2, wls0Var, (str3 == null || str3.length() == 0) ? xwu0.a : new wwu0(((me30) this.c).a(str3))));
            }
            if (!(oy21Var instanceof ly21)) {
                throw new NoWhenBranchMatchedException();
            }
            return new xlj0(new wlj0("No list metadata found for URI: " + str));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            e2.toString();
            return new xlj0(new vlj0(l1d.m("Failed to fetch list metadata: ", e2.getMessage())));
        }
    }

    public Object q(ohc ohcVar) throws GeneralSecurityException {
        o5 o5Var = (o5) this.b;
        try {
            u8 u8VarA = o5Var.A(ohcVar);
            Class cls = (Class) this.c;
            if (Void.class.equals(cls)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            o5Var.P(u8VarA);
            ypa0 ypa0Var = (ypa0) ((Map) o5Var.c).get(cls);
            if (ypa0Var != null) {
                return ypa0Var.a(u8VarA);
            }
            mna0.e("Requested primitive class ", cls.getCanonicalName(), " not supported.");
            return null;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) o5Var.b).getName()), e);
        }
    }

    public sna0 r(lby lbyVar, yma0 yma0Var, d8r0 d8r0Var, String str, String str2, int i) {
        String strJ0;
        String str3 = lbyVar.a;
        String str4 = lbyVar.b;
        di4 di4Var = (di4) this.c;
        if (di4Var.N()) {
            List list = yma0Var.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
            String str5 = yma0Var.c;
            String string = null;
            if (str5 != null) {
                if (str5.length() <= 0) {
                    str5 = null;
                }
                if (str5 != null) {
                    string = ((tb51) this.b).a.getResources().getString(2131961553, str5);
                }
            }
            strJ0 = bmq0.j0(bmq0.j0(str2, strY0), string);
        } else {
            strJ0 = str2;
        }
        boolean zN = di4Var.N();
        String str6 = lbyVar.c;
        return new sna0(yma0Var.b ? 1 : yma0Var.a ? 2 : 3, 1, i, str3, str4, strJ0, str6, str, d8r0Var, zN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r4.E(r5, r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(java.lang.String r5, java.lang.String r6, p.onm r7, boolean r8) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p.gyb0
            if (r0 == 0) goto L13
            r0 = r7
            p.gyb0 r0 = (p.gyb0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.gyb0 r0 = new p.gyb0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L24
            if (r1 != r2) goto L28
        L24:
            p.hm5.M(r7)     // Catch: java.lang.Throwable -> L59
            goto L56
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L2f:
            p.hm5.M(r7)
            java.lang.Object r7 = r4.c     // Catch: java.lang.Throwable -> L59
            p.add r7 = (p.add) r7     // Catch: java.lang.Throwable -> L59
            p.qf4 r7 = r7.a     // Catch: java.lang.Throwable -> L59
            boolean r7 = r7.i()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r4.b
            p.bfd r4 = (p.bfd) r4
            p.d9n r1 = p.d9n.a
            if (r7 == 0) goto L4d
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r4.u(r5, r0, r8)     // Catch: java.lang.Throwable -> L59
            if (r4 != r1) goto L56
            goto L55
        L4d:
            r0.c = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r4.E(r5, r6, r0)     // Catch: java.lang.Throwable -> L59
            if (r4 != r1) goto L56
        L55:
            return r1
        L56:
            p.rih1 r4 = p.rih1.a     // Catch: java.lang.Throwable -> L59
            return r4
        L59:
            r4 = move-exception
            p.m231 r5 = new p.m231
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v6a0.s(java.lang.String, java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public bpa0 t(ohc ohcVar) throws GeneralSecurityException {
        o5 o5Var = (o5) this.b;
        try {
            k9 k9VarW = o5Var.w();
            u8 u8VarJ1 = k9VarW.j1(ohcVar);
            k9VarW.u1(u8VarJ1);
            u8 u8Var = (u8) k9VarW.H0(u8VarJ1);
            zoa0 zoa0VarQ = bpa0.q();
            String strS = o5Var.s();
            zoa0VarQ.d();
            ((we40) zoa0VarQ).b.s(strS);
            try {
                int iA = u8Var.a();
                byte[] bArr = new byte[iA];
                c cVar = new c(bArr, iA);
                u8Var.d(cVar);
                if (cVar.c - cVar.d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                ghc ghcVar = new ghc(bArr);
                zoa0VarQ.d();
                ((we40) zoa0VarQ).b.t(ghcVar);
                apa0 apa0VarX = o5Var.x();
                zoa0VarQ.d();
                ((we40) zoa0VarQ).b.r(apa0VarX);
                return zoa0VarQ.a();
            } catch (IOException e) {
                throw new RuntimeException(u8Var.b("ByteString"), e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(p.ckc0 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.vjc0
            if (r0 == 0) goto L13
            r0 = r9
            p.vjc0 r0 = (p.vjc0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.vjc0 r0 = new p.vjc0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L5d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.wjc0 r7 = r0.a
            p.hm5.M(r9)
            goto L50
        L37:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.b
            p.wjc0 r9 = (p.wjc0) r9
            java.lang.Object r7 = r7.c
            p.upa0 r7 = (p.upa0) r7
            r0.a = r9
            r0.d = r3
            java.lang.Object r7 = r7.b(r8, r0)
            if (r7 != r5) goto L4d
            goto L5c
        L4d:
            r6 = r9
            r9 = r7
            r7 = r6
        L50:
            com.spotify.share.linkpreview.impl.proto.SetLinkPreviewRequest r9 = (com.spotify.share.linkpreview.impl.proto.SetLinkPreviewRequest) r9
            r0.a = r4
            r0.d = r2
            java.lang.Object r9 = r7.a(r9, r0)
            if (r9 != r5) goto L5d
        L5c:
            return r5
        L5d:
            com.spotify.share.linkpreview.impl.proto.SetLinkPreviewResponse r9 = (com.spotify.share.linkpreview.impl.proto.SetLinkPreviewResponse) r9
            p.ekc0 r7 = new p.ekc0
            java.lang.String r8 = r9.getPreviewId()
            java.lang.String r9 = r9.getImageUrl()
            r7.<init>(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v6a0.u(p.ckc0, p.onm):java.lang.Object");
    }

    public ice0 v(boolean z) {
        return ((((w25) this.b).h() || ((otu) ((kba) this.c).b).e()) && z) ? ice0.b : ice0.a;
    }

    public void w() {
        ((vku) this.c).c();
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        int i = hsl1Var.a.i(519).b;
        byp bypVar = (byp) this.b;
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) bypVar.b;
        int dimensionPixelSize = behaviorRetainingAppBarLayout.getContext().getResources().getDimensionPixelSize(2131165727);
        Toolbar toolbar = (Toolbar) bypVar.g;
        int iF = l1d.f(toolbar.getLayoutParams().height, dimensionPixelSize, 2, i);
        toolbar.getLayoutParams().height += i;
        toolbar.setPadding(toolbar.getPaddingLeft(), i, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        ((ViewGroup.MarginLayoutParams) ((BackButtonView) bypVar.c).getLayoutParams()).topMargin = iF;
        ((ViewGroup.MarginLayoutParams) ((View) bypVar.a).getLayoutParams()).topMargin = iF;
        ((ViewGroup.MarginLayoutParams) ((LinearLayout) bypVar.h).getLayoutParams()).topMargin = iF;
        ((sty) this.c).invoke(Integer.valueOf(i));
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(behaviorRetainingAppBarLayout, (k1q0) null);
        return hsl1Var;
    }

    public void cancel() {
    }

    public v6a0(be beVar) {
        this.a = (byte) 19;
        this.b = beVar;
        this.c = new vku();
    }

    public v6a0(xrc0 xrc0Var, zwm1 zwm1Var, String str, agc0 agc0Var) {
        this.a = (byte) 16;
        this.b = xrc0Var;
        this.c = zwm1Var.c();
    }

    public /* synthetic */ v6a0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public rlc1 apply() {
        return ((vmb0) this.b).f(this.c);
    }
}
