package p;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.encoders.EncodingException;
import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Optional;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class lpd implements kpd, yg30, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lpd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qjb a(cab cabVar) throws IOException {
        r9e r9eVar = (r9e) this.b;
        URL url = (URL) cabVar.b;
        pdp1.n("Making request to: %s", url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cabVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    r9eVar.a.f(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), (hy8) cabVar.c);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    pdp1.n("Status Code: %d", Integer.valueOf(responseCode));
                    pdp1.i("CctTransportBackend", httpURLConnection.getHeaderField("Content-Type"), "Content-Type: %s");
                    pdp1.i("CctTransportBackend", httpURLConnection.getHeaderField("Content-Encoding"), "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new qjb(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new qjb(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            qjb qjbVar = new qjb(responseCode, (URL) null, l19.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return qjbVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (ConnectException | UnknownHostException unused) {
            pdp1.k("CctTransportBackend");
            return new qjb(500, (URL) null, 0L);
        } catch (EncodingException | IOException unused2) {
            pdp1.k("CctTransportBackend");
            return new qjb(400, (URL) null, 0L);
        }
    }

    public Object apply(Object obj) {
        mp8 mp8Var = (mp8) this.b;
        py8 py8Var = (py8) obj;
        return py8Var.d.ignoreElement().w().cast(Throwable.class).doOnSubscribe(new po5(mp8Var, py8Var, (byte) 2)).doOnComplete(new w43(mp8Var, (byte) 3)).onErrorReturn(new uk4(mp8Var, py8Var, (byte) 8));
    }

    public Object b(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                kzp kzpVar = (kzp) obj3;
                daq daqVar = kzpVar.a;
                teq teqVar = kzpVar.b;
                ((qop) obj).getClass();
                ((tbt) obj2).getClass();
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                Resources resources = (Resources) teqVar.N0.get();
                c8o.l(resources);
                return new zne(context, new vne(resources));
            case 7:
            case 8:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            case 22:
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
            case 25:
            case 27:
            default:
                ozp ozpVar = (ozp) obj3;
                qop qopVar = (qop) obj;
                gl90 gl90Var = (gl90) obj2;
                daq daqVar2 = ozpVar.a;
                kzp kzpVar2 = new kzp(daqVar2, ozpVar.b);
                qopVar.getClass();
                gl90Var.getClass();
                x2p x2pVar = new x2p(kzpVar2, qopVar, gl90Var);
                String strD = qopVar.d();
                v1p v1pVar = (v1p) x2pVar.b.get();
                d0r d0rVar = gl90Var.b;
                oum oumVar = (oum) daqVar2.Eq.get();
                c8o.l(oumVar);
                return new bvm(strD, v1pVar, d0rVar, oumVar);
            case 9:
                nzp nzpVar = (nzp) obj3;
                bct bctVar = (bct) obj2;
                daq daqVar3 = nzpVar.a;
                teq teqVar2 = nzpVar.b;
                ((qop) obj).getClass();
                bctVar.getClass();
                d2f1 d2f1VarP3 = teqVar2.P3();
                Context context2 = (Context) daqVar3.x1.a;
                c8o.l(context2);
                return new m3g(bctVar, d2f1VarP3, context2);
            case 10:
                ozp ozpVar2 = (ozp) obj3;
                qop qopVar2 = (qop) obj;
                zbt zbtVar = (zbt) obj2;
                daq daqVar4 = ozpVar2.a;
                teq teqVar3 = ozpVar2.b;
                qopVar2.getClass();
                zbtVar.getClass();
                c9c0 c9c0Var = (c9c0) daqVar4.Ed.get();
                c8o.l(c9c0Var);
                rzq rzqVar = zbtVar.a;
                c8o.l(rzqVar);
                f1n0 f1n0Var = (f1n0) teqVar3.T2.get();
                c8o.l(f1n0Var);
                yzc0 yzc0Var = zbtVar.b;
                String strD2 = qopVar2.d();
                i8h1 i8h1Var = (i8h1) daqVar4.A5.get();
                c8o.l(i8h1Var);
                r6h1 r6h1Var = zbtVar.e;
                ov80 ov80Var = new ov80(i8h1Var, r6h1Var);
                dxz0 dxz0Var = (dxz0) daqVar4.I4.get();
                c8o.l(dxz0Var);
                z6k0 z6k0Var = (z6k0) teqVar3.Z5.get();
                c8o.l(z6k0Var);
                koc0 koc0Var = zbtVar.d;
                mnk0 mnk0Var = (mnk0) teqVar3.b6.get();
                c8o.l(mnk0Var);
                q8n q8nVar = (q8n) daqVar4.E1.get();
                c8o.l(q8nVar);
                kqi0 kqi0Var = new kqi0(z6k0Var, koc0Var, mnk0Var, q8nVar, (byte) 7);
                kt91 kt91Var = (kt91) daqVar4.f8.get();
                c8o.l(kt91Var);
                g0l g0lVar = (g0l) daqVar4.E5.get();
                c8o.l(g0lVar);
                t740 t740Var = (t740) teqVar3.Ec.get();
                c8o.l(t740Var);
                r0s0 r0s0VarB2 = teqVar3.B2();
                vb2 vb2Var = (vb2) teqVar3.n3.get();
                c8o.l(vb2Var);
                kmj1 kmj1VarJ2 = daqVar4.j2();
                h5q h5qVar = (h5q) teqVar3.db.get();
                c8o.l(h5qVar);
                e7p0 e7p0Var = (e7p0) teqVar3.W4.get();
                c8o.l(e7p0Var);
                b9q b9qVar = (b9q) daqVar4.br.get();
                c8o.l(b9qVar);
                yh2 yh2Var = (yh2) teqVar3.f3.get();
                c8o.l(yh2Var);
                h9k0 h9k0Var = (h9k0) teqVar3.pf.get();
                c8o.l(h9k0Var);
                y390 y390Var = (y390) teqVar3.o3.get();
                c8o.l(y390Var);
                wr00 wr00VarA = y390Var.a(qopVar2.c(), r6h1Var);
                vbs vbsVar = (vbs) daqVar4.wf.get();
                c8o.l(vbsVar);
                ov20 ov20Var = (ov20) daqVar4.P5.get();
                c8o.l(ov20Var);
                x290 x290Var = (x290) teqVar3.q8.get();
                c8o.l(x290Var);
                return new chg(c9c0Var, rzqVar, f1n0Var, yzc0Var, strD2, ov80Var, dxz0Var, kqi0Var, kt91Var, g0lVar, t740Var, r6h1Var, r0s0VarB2, vb2Var, kmj1VarJ2, h5qVar, e7p0Var, b9qVar, yh2Var, h9k0Var, wr00VarA, vbsVar, ov20Var, x290Var);
            case 11:
                kzp kzpVar3 = (kzp) obj3;
                qop qopVar3 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                daq daqVar5 = kzpVar3.a;
                teq teqVar4 = kzpVar3.b;
                fjb fjbVar = new fjb((byte) 4);
                qopVar3.getClass();
                bctVar2.getClass();
                d3p d3pVar = new d3p(fjbVar, qopVar3, bctVar2);
                String strD3 = qopVar3.d();
                n6r0 n6r0Var = qopVar3.c;
                c8o.l(n6r0Var);
                z1p z1pVar = (z1p) d3pVar.b;
                koc0 koc0Var2 = bctVar2.d;
                yha1 yha1Var = (yha1) teqVar4.te.get();
                c8o.l(yha1Var);
                lcq lcqVar = (lcq) teqVar4.hg.get();
                c8o.l(lcqVar);
                q8n q8nVar2 = (q8n) daqVar5.E1.get();
                c8o.l(q8nVar2);
                m720 m720Var = (m720) teqVar4.gg.get();
                c8o.l(m720Var);
                return new xpg(strD3, n6r0Var, z1pVar, koc0Var2, yha1Var, bctVar2, lcqVar, q8nVar2, m720Var, f46.S0(new orc0[]{krc0.a, crc0.a, drc0.a, brc0.a}));
            case 12:
                daq daqVar6 = ((y0q) obj3).b;
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                Context context3 = (Context) daqVar6.x1.a;
                c8o.l(context3);
                return new uqg(context3, (byte) 0);
            case 13:
                qop qopVar4 = (qop) obj;
                z0q z0qVar = new z0q(((a0q) obj3).a);
                qopVar4.getClass();
                ((gl90) obj2).getClass();
                return new h82(qopVar4.d(), new z2p(z0qVar, qopVar4).a);
            case 14:
                nzp nzpVar2 = (nzp) obj3;
                act actVar = (act) obj2;
                daq daqVar7 = nzpVar2.a;
                teq teqVar5 = nzpVar2.b;
                ((qop) obj).getClass();
                actVar.getClass();
                mr20 mr20Var = actVar.b;
                c8o.l(mr20Var);
                mr20 mr20Var2 = mr20Var;
                wen0 wen0Var = actVar.a;
                c8o.l(wen0Var);
                mr20 mr20Var3 = actVar.d;
                vxe1 vxe1Var = (vxe1) teqVar5.n8.get();
                c8o.l(vxe1Var);
                q8n q8nVar3 = (q8n) daqVar7.r2.get();
                c8o.l(q8nVar3);
                return new fbh(mr20Var2, wen0Var, mr20Var3, vxe1Var, q8nVar3);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                daq daqVar8 = ((b1q) obj3).b;
                ((qop) obj).getClass();
                ((bct) obj2).getClass();
                Context context4 = (Context) daqVar8.x1.a;
                c8o.l(context4);
                return new prk(context4, new cx0((byte) 8));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                gl90 gl90Var2 = (gl90) obj2;
                teq teqVar6 = ((h0q) obj3).a;
                ((qop) obj).getClass();
                gl90Var2.getClass();
                d0r d0rVar2 = gl90Var2.b;
                bnr bnrVar = (bnr) teqVar6.jc.get();
                c8o.l(bnrVar);
                return new rrk(new tm(d0rVar2, bnrVar));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                kzp kzpVar4 = (kzp) obj3;
                daq daqVar9 = kzpVar4.a;
                teq teqVar7 = kzpVar4.b;
                ((qop) obj).getClass();
                ((bct) obj2).getClass();
                Context context5 = (Context) daqVar9.x1.a;
                c8o.l(context5);
                lzn0 lzn0Var = (lzn0) teqVar7.i.get();
                c8o.l(lzn0Var);
                gw70 gw70Var = (gw70) daqVar9.d8.get();
                c8o.l(gw70Var);
                return new urk(context5, new br0(gw70Var, lzn0Var));
            case 23:
                nzp nzpVar3 = (nzp) obj3;
                qop qopVar5 = (qop) obj;
                bct bctVar3 = (bct) obj2;
                daq daqVar10 = nzpVar3.a;
                lzp lzpVar = new lzp(daqVar10, nzpVar3.b);
                qopVar5.getClass();
                bctVar3.getClass();
                x2p x2pVar2 = new x2p(lzpVar, qopVar5, bctVar3);
                koc0 koc0Var3 = bctVar3.d;
                j8p j8pVar = (j8p) x2pVar2.b.get();
                luk lukVar = (luk) daqVar10.L1.get();
                c8o.l(lukVar);
                return new rsl(koc0Var3, j8pVar, new bp4(false, lukVar));
            case 26:
                kzp kzpVar5 = (kzp) obj3;
                qop qopVar6 = (qop) obj;
                zbt zbtVar2 = (zbt) obj2;
                daq daqVar11 = kzpVar5.a;
                teq teqVar8 = kzpVar5.b;
                nzp nzpVar4 = new nzp(daqVar11, teqVar8);
                qopVar6.getClass();
                zbtVar2.getClass();
                t7p t7pVar = new t7p(nzpVar4, qopVar6, zbtVar2);
                i8h1 i8h1Var2 = (i8h1) daqVar11.A5.get();
                c8o.l(i8h1Var2);
                pv80 pv80Var = new pv80(i8h1Var2, zbtVar2.e);
                koc0 koc0Var4 = zbtVar2.d;
                ynb0 ynb0VarA = xqu.a((j7p) t7pVar.d);
                ov20 ov20Var2 = (ov20) daqVar11.P5.get();
                c8o.l(ov20Var2);
                x290 x290Var2 = (x290) teqVar8.q8.get();
                c8o.l(x290Var2);
                return new qgm(pv80Var, koc0Var4, ynb0VarA, ov20Var2, x290Var2);
            case 28:
                qop qopVar7 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar12 = ((rzp) obj3).b;
                uzp uzpVar = new uzp(daqVar12, (byte) 2);
                qopVar7.getClass();
                jbtVar.getClass();
                x2p x2pVar3 = new x2p(uzpVar, qopVar7, jbtVar);
                String strD4 = qopVar7.d();
                d0r d0rVar3 = jbtVar.b;
                j7p j7pVar = (j7p) x2pVar3.b;
                oum oumVar2 = (oum) daqVar12.Eq.get();
                c8o.l(oumVar2);
                return new d82(strD4, d0rVar3, j7pVar, oumVar2);
        }
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        h21 h21Var = (h21) this.b;
        switch (b) {
            case 1:
                CarouselFragment carouselFragment = (CarouselFragment) zf30Var;
                dzd dzdVar = (dzd) h21Var.b.get();
                dzdVar.getClass();
                carouselFragment.getClass();
                gw70 gw70Var = (gw70) dzdVar.b.get();
                c8o.l(gw70Var);
                carouselFragment.G1 = gw70Var;
                en3 en3Var = (en3) dzdVar.c.get();
                c8o.l(en3Var);
                carouselFragment.H1 = en3Var;
                msm0 msm0Var = (msm0) dzdVar.d.get();
                c8o.l(msm0Var);
                carouselFragment.I1 = msm0Var;
                caq caqVar = dzdVar.e;
                i8h1 i8h1Var = (i8h1) caqVar.get();
                c8o.l(i8h1Var);
                kly0 kly0Var = dzdVar.g;
                edr0 edr0Var = (edr0) kly0Var.get();
                c8o.l(edr0Var);
                ffe1 ffe1Var = new ffe1(i8h1Var, edr0Var, (byte) 17);
                g5t g5tVar = dzdVar.a;
                luk lukVar = (luk) g5tVar.get();
                c8o.l(lukVar);
                oxd oxdVar = new oxd(ffe1Var, new ul4(lukVar).a());
                Scheduler scheduler = (Scheduler) dzdVar.h.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) dzdVar.i.get();
                c8o.l(scheduler2);
                carouselFragment.J1 = new w1e(oxdVar, scheduler, scheduler2, carouselFragment);
                luk lukVar2 = (luk) g5tVar.get();
                c8o.l(lukVar2);
                carouselFragment.K1 = new ul4(lukVar2).a();
                i8h1 i8h1Var2 = (i8h1) caqVar.get();
                c8o.l(i8h1Var2);
                carouselFragment.L1 = i8h1Var2;
                l6h1 l6h1Var = (l6h1) dzdVar.f.get();
                c8o.l(l6h1Var);
                carouselFragment.M1 = l6h1Var;
                edr0 edr0Var2 = (edr0) kly0Var.get();
                c8o.l(edr0Var2);
                carouselFragment.N1 = edr0Var2;
                break;
            case 2:
                k5e k5eVar = (k5e) zf30Var;
                l5e l5eVar = (l5e) h21Var.b.get();
                l5eVar.getClass();
                k5eVar.getClass();
                x2p x2pVar = new x2p(l5eVar, k5eVar);
                kly0 kly0Var2 = l5eVar.f;
                c8o.l((q1n0) kly0Var2.get());
                i1n0 i1n0Var = (i1n0) l5eVar.g.get();
                c8o.l(i1n0Var);
                j4p j4pVar = (j4p) ((jly0) x2pVar.d).get();
                oto0 oto0VarA = l5eVar.a();
                c8o.l(oto0VarA);
                ees eesVarA = i1n0Var.a(k5eVar, k5eVar);
                s28 s28Var = s28.d;
                a680 a680Var = eesVarA.a;
                a680Var.a = s28Var;
                a680Var.b = new u5e(j4pVar, oto0VarA, (byte) 0);
                k5eVar.G1 = eesVarA;
                ajq0 ajq0VarB = x2pVar.b();
                q1n0 q1n0Var = (q1n0) kly0Var2.get();
                c8o.l(q1n0Var);
                k5eVar.H1 = q1n0Var.b(bbp1.g(ajq0VarB.v()), new v7r0(2, false));
                c8o.l((xfx) l5eVar.k.get());
                break;
            case 3:
                y7e y7eVar = (y7e) zf30Var;
                z7e z7eVar = (z7e) h21Var.b.get();
                z7eVar.getClass();
                y7eVar.getClass();
                ip31 ip31Var = new ip31(z7eVar, y7eVar);
                q1n0 q1n0Var2 = (q1n0) z7eVar.e.get();
                c8o.l(q1n0Var2);
                y7eVar.G1 = q1n0Var2;
                y7eVar.H1 = (ees) ((jly0) ip31Var.g).get();
                y7eVar.I1 = (d8e) ((jly0) ip31Var.i).get();
                break;
            case 7:
                nwe nweVar = (nwe) zf30Var;
                zve zveVar = (zve) h21Var.b.get();
                zveVar.getClass();
                nweVar.getClass();
                d3p d3pVar = new d3p(zveVar);
                i8h1 i8h1Var3 = (i8h1) zveVar.b.get();
                c8o.l(i8h1Var3);
                nweVar.a2 = i8h1Var3;
                c8o.l((lzn0) zveVar.a.get());
                nweVar.b2 = (z1p) d3pVar.b;
                break;
            case 8:
                pyf pyfVar = (pyf) zf30Var;
                qyf qyfVar = (qyf) h21Var.b.get();
                qyfVar.getClass();
                pyfVar.getClass();
                Scheduler scheduler3 = (Scheduler) qyfVar.d.get();
                c8o.l(scheduler3);
                pyfVar.W1 = scheduler3;
                byf byfVar = (byf) qyfVar.a.get();
                c8o.l(byfVar);
                e4b1 e4b1Var = new e4b1(pyfVar.N0(), (byte) 3);
                dg30 dg30VarN0 = pyfVar.N0();
                zxf zxfVar = ((lyf) pyfVar.l2.getValue()).a;
                c8o.m(zxfVar);
                pyfVar.X1 = byf.c(byfVar, pyfVar, e4b1Var, dg30VarN0, zxfVar, pyfVar);
                g341 g341Var = (g341) qyfVar.b.get();
                c8o.l(g341Var);
                pyfVar.Y1 = g341Var;
                hik1 hik1Var = (hik1) qyfVar.c.get();
                c8o.l(hik1Var);
                pyfVar.Z1 = hik1Var;
                dma1 dma1Var = (dma1) qyfVar.e.get();
                c8o.l(dma1Var);
                pyfVar.a2 = dma1Var;
                q7b1 q7b1Var = (q7b1) qyfVar.f.get();
                c8o.l(q7b1Var);
                pyfVar.b2 = q7b1Var;
                break;
            case 16:
                kph kphVar = (kph) zf30Var;
                bnh bnhVar = (bnh) h21Var.b.get();
                bnhVar.getClass();
                kphVar.getClass();
                em0 em0Var = new em0(bnhVar);
                vlh vlhVar = (vlh) bnhVar.g.get();
                c8o.l(vlhVar);
                kphVar.W1 = vlhVar;
                kphVar.X1 = (o6p) ((jly0) em0Var.c).get();
                kphVar.Y1 = (p6p) ((jly0) em0Var.g).get();
                kphVar.Z1 = (s6p) ((jly0) em0Var.h).get();
                kphVar.a2 = (t6p) ((jly0) em0Var.i).get();
                kphVar.b2 = (u6p) ((jly0) em0Var.t).get();
                kphVar.c2 = (v6p) ((jly0) em0Var.X).get();
                bqh bqhVar = (bqh) bnhVar.j.get();
                c8o.l(bqhVar);
                kphVar.d2 = bqhVar;
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                auk aukVar = (auk) zf30Var;
                buk bukVar = (buk) h21Var.b.get();
                bukVar.getClass();
                aukVar.getClass();
                g1i g1iVar = new g1i(bukVar, aukVar);
                kg0 kg0Var = (kg0) bukVar.a.get();
                c8o.l(kg0Var);
                aukVar.G1 = kg0Var;
                juk jukVar = (juk) bukVar.b.get();
                c8o.l(jukVar);
                aukVar.H1 = jukVar;
                i8h1 i8h1Var4 = (i8h1) bukVar.d.get();
                c8o.l(i8h1Var4);
                aukVar.I1 = i8h1Var4;
                aukVar.J1 = (r1m0) ((jly0) g1iVar.d).get();
                aukVar.K1 = (mir0) ((jly0) g1iVar.f).get();
                fmy0 fmy0Var = (fmy0) bukVar.e.get();
                c8o.l(fmy0Var);
                aukVar.L1 = fmy0Var;
                zwz0 zwz0Var = (zwz0) bukVar.f.get();
                c8o.l(zwz0Var);
                aukVar.M1 = zwz0Var;
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                p2l p2lVar = (p2l) zf30Var;
                q2l q2lVar = (q2l) h21Var.b.get();
                q2lVar.getClass();
                p2lVar.getClass();
                r2l r2lVar = (r2l) q2lVar.a.get();
                c8o.l(r2lVar);
                p2lVar.W1 = r2lVar;
                break;
            case 22:
                w2l w2lVar = (w2l) zf30Var;
                x2l x2lVar = (x2l) h21Var.b.get();
                x2lVar.getClass();
                w2lVar.getClass();
                r2l r2lVar2 = (r2l) x2lVar.a.get();
                c8o.l(r2lVar2);
                w2lVar.W1 = r2lVar2;
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ContentPickerFragment contentPickerFragment = (ContentPickerFragment) zf30Var;
                j0m j0mVar = (j0m) h21Var.b.get();
                j0mVar.getClass();
                contentPickerFragment.getClass();
                caq caqVar2 = j0mVar.h;
                i8h1 i8h1Var5 = (i8h1) caqVar2.get();
                c8o.l(i8h1Var5);
                kly0 kly0Var3 = j0mVar.j;
                edr0 edr0Var3 = (edr0) kly0Var3.get();
                c8o.l(edr0Var3);
                contentPickerFragment.G1 = new j3h1(i8h1Var5, edr0Var3);
                edr0 edr0Var4 = (edr0) kly0Var3.get();
                c8o.l(edr0Var4);
                contentPickerFragment.H1 = edr0Var4;
                i8h1 i8h1Var6 = (i8h1) caqVar2.get();
                c8o.l(i8h1Var6);
                contentPickerFragment.I1 = i8h1Var6;
                l6h1 l6h1Var2 = (l6h1) j0mVar.i.get();
                c8o.l(l6h1Var2);
                contentPickerFragment.J1 = l6h1Var2;
                iw4 iw4Var = (iw4) j0mVar.d.get();
                c8o.l(iw4Var);
                contentPickerFragment.K1 = iw4Var;
                em3 em3Var = new em3(new yo31((qm3) j0mVar.b.get(), new zs3(), (byte) 14), Optional.empty(), (byte) 0);
                ms3 ms3Var = (ms3) j0mVar.f.get();
                c8o.l(ms3Var);
                i8h1 i8h1Var7 = (i8h1) caqVar2.get();
                c8o.l(i8h1Var7);
                edr0 edr0Var5 = (edr0) kly0Var3.get();
                c8o.l(edr0Var5);
                j3h1 j3h1Var = new j3h1(i8h1Var7, edr0Var5);
                zle1 zle1Var = (zle1) j0mVar.g.get();
                c8o.l(zle1Var);
                hu3 hu3Var = new hu3(zle1Var);
                g5t g5tVar2 = j0mVar.a;
                luk lukVar3 = (luk) g5tVar2.get();
                c8o.l(lukVar3);
                nzl nzlVar = new nzl(em3Var, ms3Var, j3h1Var, hu3Var, new ul4(lukVar3).b());
                Scheduler scheduler4 = (Scheduler) j0mVar.l.get();
                c8o.l(scheduler4);
                Scheduler scheduler5 = (Scheduler) j0mVar.m.get();
                c8o.l(scheduler5);
                contentPickerFragment.L1 = new f4m(nzlVar, scheduler4, scheduler5, contentPickerFragment);
                c8o.l((gir0) j0mVar.e.get());
                gw70 gw70Var2 = (gw70) j0mVar.c.get();
                c8o.l(gw70Var2);
                contentPickerFragment.N1 = gw70Var2;
                en3 en3Var2 = (en3) j0mVar.k.get();
                c8o.l(en3Var2);
                contentPickerFragment.O1 = en3Var2;
                luk lukVar4 = (luk) g5tVar2.get();
                c8o.l(lukVar4);
                contentPickerFragment.P1 = new ul4(lukVar4).b();
                break;
            case 25:
                rfm rfmVar = (rfm) zf30Var;
                sfm sfmVar = (sfm) h21Var.b.get();
                sfmVar.getClass();
                rfmVar.getClass();
                h72 h72Var = new h72(sfmVar);
                i8h1 i8h1Var8 = (i8h1) sfmVar.c.get();
                c8o.l(i8h1Var8);
                rfmVar.Z1 = i8h1Var8;
                gw70 gw70Var3 = (gw70) sfmVar.d.get();
                c8o.l(gw70Var3);
                rfmVar.a2 = gw70Var3;
                rfmVar.b2 = (q811) ((jly0) h72Var.c).get();
                kt91 kt91Var = (kt91) sfmVar.e.get();
                c8o.l(kt91Var);
                rfmVar.c2 = kt91Var;
                mwn0 mwn0Var = (mwn0) sfmVar.f.get();
                c8o.l(mwn0Var);
                rfmVar.d2 = mwn0Var;
                l6h1 l6h1Var3 = (l6h1) sfmVar.g.get();
                c8o.l(l6h1Var3);
                rfmVar.e2 = l6h1Var3;
                q8n q8nVar = (q8n) sfmVar.j.get();
                c8o.l(q8nVar);
                rfmVar.f2 = q8nVar;
                rfmVar.g2 = new tdm((d7p) h72Var.d);
                rfmVar.h2 = xqu.a((d7p) h72Var.Y);
                rfmVar.i2 = xqu.a((jly0) h72Var.e);
                Observable observable = (Observable) sfmVar.k.get();
                c8o.l(observable);
                rfmVar.j2 = observable;
                break;
            default:
                ContextualAudioFragment contextualAudioFragment = (ContextualAudioFragment) zf30Var;
                gmm gmmVar = (gmm) h21Var.b.get();
                gmmVar.getClass();
                contextualAudioFragment.getClass();
                qe41 qe41Var = (qe41) gmmVar.h.a;
                c8o.l(qe41Var);
                Observable observable2 = (Observable) gmmVar.e.get();
                c8o.l(observable2);
                ofz0 ofz0Var = (ofz0) gmmVar.i.get();
                c8o.l(ofz0Var);
                contextualAudioFragment.G1 = new smm(qe41Var, new dc31(observable2, ofz0Var, (byte) 21), (byte) 0);
                Scheduler scheduler6 = (Scheduler) gmmVar.f.get();
                c8o.l(scheduler6);
                contextualAudioFragment.H1 = scheduler6;
                gw70 gw70Var4 = (gw70) gmmVar.g.get();
                c8o.l(gw70Var4);
                contextualAudioFragment.I1 = gw70Var4;
                caq caqVar3 = gmmVar.c;
                i8h1 i8h1Var9 = (i8h1) caqVar3.get();
                c8o.l(i8h1Var9);
                kly0 kly0Var4 = gmmVar.b;
                edr0 edr0Var6 = (edr0) kly0Var4.get();
                c8o.l(edr0Var6);
                contextualAudioFragment.J1 = new ptf1(i8h1Var9, edr0Var6);
                i8h1 i8h1Var10 = (i8h1) caqVar3.get();
                c8o.l(i8h1Var10);
                contextualAudioFragment.K1 = i8h1Var10;
                l6h1 l6h1Var4 = (l6h1) gmmVar.d.get();
                c8o.l(l6h1Var4);
                contextualAudioFragment.L1 = l6h1Var4;
                edr0 edr0Var7 = (edr0) kly0Var4.get();
                c8o.l(edr0Var7);
                contextualAudioFragment.M1 = edr0Var7;
                en3 en3Var3 = (en3) gmmVar.j.get();
                c8o.l(en3Var3);
                contextualAudioFragment.N1 = en3Var3;
                luk lukVar5 = (luk) gmmVar.a.get();
                c8o.l(lukVar5);
                contextualAudioFragment.O1 = new ul4(lukVar5).c();
                break;
        }
    }

    public void onStopRecording() {
        ((mpd) this.b).a();
    }
}
