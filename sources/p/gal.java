package p;

import android.content.Context;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.tasks.Task;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.premiumdestination.destination.mobius.domain.TransformerException;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gal implements Function, fsc1, k1q0, cy81 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public gal(ttz ttzVar, q8n q8nVar) {
        this.a = (byte) 0;
        this.b = hhp0.a;
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("ConnectionQualityEventIntegration")));
        this.c = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new cuk(ttzVar, this, (lnm) null, (byte) 6), 3);
    }

    public b8p1 a() {
        t2j0 t2j0Var = (t2j0) ((i22) this.c).f.get();
        c8o.l(t2j0Var);
        h22 h22Var = (h22) this.b;
        n12 n12Var = (n12) h22Var.M1.getValue();
        c8o.m(n12Var);
        int iM0 = n12Var.M0();
        lzu0.e(iM0);
        n12 n12Var2 = (n12) h22Var.M1.getValue();
        c8o.m(n12Var2);
        String strD = n12Var2.D();
        if (strD == null) {
            strD = null;
        }
        return new b8p1(t2j0Var, iM0, strD, (UUID) h22Var.U1.getValue(), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
          (r5v9 java.lang.Object) from 0x008d: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:31:0x008c, B:63:0x008d] A[DONT_GENERATE, DONT_INLINE]
          (r5v9 java.lang.Object) from 0x0081: CHECK_CAST (p.ho70) (r5v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gal.apply(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        gdn gdnVar;
        if (onmVar instanceof gdn) {
            gdnVar = (gdn) onmVar;
            int i = gdnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdnVar.c = i - Integer.MIN_VALUE;
            } else {
                gdnVar = new gdn(this, onmVar);
            }
        } else {
            gdnVar = new gdn(this, onmVar);
        }
        Object objJ = gdnVar.a;
        int i2 = gdnVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F((d0r) this.c, jdn.a, str);
            jte jteVar = new jte(2, (lnm) null, (byte) 9);
            gdnVar.c = 1;
            objJ = b5p1.j(ay8VarF, jteVar, gdnVar);
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
        i1r i1rVar = (k1r) objJ;
        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
        if (i1rVar2 != null) {
            return (g6g1) i1rVar2.a;
        }
        return null;
    }

    public Set c() {
        NetworkCapabilities networkCapabilities;
        idd1 idd1Var = (idd1) this.c;
        try {
            Network activeNetwork = ((ConnectivityManager) idd1Var.getValue()).getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = ((ConnectivityManager) idd1Var.getValue()).getNetworkCapabilities(activeNetwork)) != null) {
                return dm61.B0(new a7o0[]{networkCapabilities.hasTransport(0) ? a7o0.b : null, networkCapabilities.hasCapability(11) ? a7o0.a : null, networkCapabilities.hasCapability(13) ? null : a7o0.d});
            }
            return w7x.a;
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092 A[LOOP:0: B:26:0x0087->B:28:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x0113  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:38:0x012c  */
    /* JADX WARN: Code duplicated, block: B:40:0x013a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0145  */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x017d A[LOOP:2: B:47:0x0177->B:49:0x017d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa A[EDGE_INSN: B:52:0x00aa->B:29:0x00aa BREAK  A[LOOP:0: B:26:0x0087->B:28:0x0092], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:18:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x00d4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(p.onm r15) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gal.d(p.onm):java.lang.Object");
    }

    public hfp1 e(Object obj) {
        Boolean bool = (Boolean) obj;
        jhn jhnVar = (jhn) this.c;
        if (bool.booleanValue()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean zBooleanValue = bool.booleanValue();
            p68 p68Var = jhnVar.b;
            if (zBooleanValue) {
                ((bsd1) p68Var.g).d((Object) null);
                return ((Task) this.b).k((djn) jhnVar.e.b, new lo9(this, (byte) 24));
            }
            eg.m("An invalid data collection token was used.");
            return null;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        Iterator it = jhnVar.g.C().iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        d520 d520Var = jhnVar.m.b.b;
        zin.a(d520Var.J());
        zin.a(d520Var.I());
        zin.a(d520Var.G());
        jhnVar.q.d((Object) null);
        return o0c.z((Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object f(CurrentTrackMetadata currentTrackMetadata, boolean z, onm onmVar) {
        rgo rgoVar;
        String uri;
        if (onmVar instanceof rgo) {
            rgoVar = (rgo) onmVar;
            int i = rgoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rgoVar.c = i - Integer.MIN_VALUE;
            } else {
                rgoVar = new rgo(this, onmVar);
            }
        } else {
            rgoVar = new rgo(this, onmVar);
        }
        Object objJ = rgoVar.a;
        int i2 = rgoVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                oj3 oj3Var = (oj3) this.c;
                if (!currentTrackMetadata.isAudiobook() || (uri = currentTrackMetadata.getAlbumUri()) == null) {
                    uri = currentTrackMetadata.getUri();
                }
                Single map = oj3.d(oj3Var, Collections.singletonList(uri), "", "", z).doOnEvent(new lo9(this, (byte) 26)).map(xbp1.T0);
                rgoVar.c = 1;
                objJ = fc11.j(map, rgoVar);
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
            objJ.getClass();
            return ((e331) objJ).a;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable g(String str, onm onmVar) {
        hdn hdnVar;
        if (onmVar instanceof hdn) {
            hdnVar = (hdn) onmVar;
            int i = hdnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hdnVar.c = i - Integer.MIN_VALUE;
            } else {
                hdnVar = new hdn(this, onmVar);
            }
        } else {
            hdnVar = new hdn(this, onmVar);
        }
        Object objI = hdnVar.a;
        int i2 = hdnVar.c;
        z6x z6xVar = z6x.a;
        if (i2 == 0) {
            hm5.M(objI);
            Set set = s4b1.f;
            String strZ = uic.y(str).z();
            if (strZ == null) {
                return z6xVar;
            }
            qvc0 qvc0Var = new qvc0(strZ, (c3d0) null, f46.S0(new orc0[]{wqc0.a, sqc0.a, uqc0.a, xqc0.a, yqc0.a}), hqz0.a, 2);
            rsc0 rsc0Var = (xrc0) this.b;
            hdnVar.c = 1;
            objI = rsc0Var.i(qvc0Var, hdnVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        oy21 oy21Var = (py21) objI;
        if (!(oy21Var instanceof oy21)) {
            if (oy21Var instanceof ly21) {
                Objects.toString(((ly21) oy21Var).a);
                return z6xVar;
            }
            eg.o();
            return null;
        }
        Iterable iterable = (Iterable) oy21Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((pvc0) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Set set2 = s4b1.f;
            if (uic.g((String) obj, blc0.ti)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, onm onmVar) {
        idn idnVar;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        if (onmVar instanceof idn) {
            idnVar = (idn) onmVar;
            int i = idnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                idnVar.d = i - Integer.MIN_VALUE;
            } else {
                idnVar = new idn(this, onmVar);
            }
        } else {
            idnVar = new idn(this, onmVar);
        }
        Object objB = idnVar.b;
        int i2 = idnVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                idnVar.a = str;
                idnVar.d = 1;
                objB = b(str, idnVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = idnVar.a;
                hm5.M(objB);
            }
            g6g1 g6g1Var = (g6g1) objB;
            if (g6g1Var == null || (mq70Var = g6g1Var.a.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str2 = up70VarA.a.a) == null) {
                str2 = null;
            }
            if (str2 == null) {
                return null;
            }
            njw0 njw0Var = g6g1Var != null ? g6g1Var.b.b : null;
            return new ymf1(str, njw0Var instanceof ljw0 ? ((ljw0) njw0Var).a.a.a.a : null, jdn.a(g6g1Var != null ? g6g1Var.a : null), str2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6 == r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.rkm
            if (r0 == 0) goto L13
            r0 = r6
            p.rkm r0 = (p.rkm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.rkm r0 = new p.rkm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L6c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L4b
        L35:
            p.hm5.M(r6)
            java.lang.Object r6 = r5.b
            io.reactivex.rxjava3.core.Flowable r6 = (io.reactivex.rxjava3.core.Flowable) r6
            p.mo9 r1 = p.mo9.N0
            io.reactivex.rxjava3.core.Flowable r6 = r6.j(r1)
            r0.c = r3
            java.lang.Object r6 = p.u890.m(r6, r2, r0)
            if (r6 != r4) goto L4b
            goto L6b
        L4b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r6 = p.u890.j(r6, r1)
            r1 = 0
            if (r6 == 0) goto L6e
            java.lang.Object r5 = r5.c
            p.ruz r5 = (p.ruz) r5
            p.d9u0 r6 = new p.d9u0
            java.lang.String r3 = "share-mediatrimmer-contextplayermediaaction"
            r6.<init>(r3, r1)
            io.reactivex.rxjava3.core.Single r5 = r5.a(r6)
            r0.c = r2
            java.lang.Object r6 = p.fc11.j(r5, r0)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            boolean r1 = r6 instanceof p.ceh
        L6e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gal.i(p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.premiumdestination.destination.mobius.domain.TransformerException */
    public mvv0 j(mvv0 mvv0Var) throws TransformerException {
        String string;
        dma1 dma1Var = ((gsv0) this.b).a;
        try {
            vuv0 vuv0Var = mvv0Var.a;
            String strE = dma1Var.e(gsv0.b, "");
            strE.getClass();
            String strE2 = dma1Var.e(gsv0.c, "");
            strE2.getClass();
            if (strE.length() == 0) {
                return mvv0Var;
            }
            String strW = nhc1.W(strE, "/", ":");
            String str = vuv0Var.e;
            Integer num = (Integer) yju.a.get(strW);
            int iIntValue = num != null ? num.intValue() : 0;
            Context context = (Context) this.c;
            if (iIntValue != 0) {
                string = context.getResources().getString(iIntValue);
                string.getClass();
            } else if (strE.equals("play-without-ads-exp")) {
                string = context.getResources().getString(2131960275);
                string.getClass();
            } else {
                string = context.getResources().getString(2131960278);
                string.getClass();
            }
            String str2 = string;
            String str3 = vuv0Var.c;
            String str4 = strE2.length() == 0 ? str : strE2;
            ave0 ave0VarA = vuv0Var.f;
            if (ave0VarA != null) {
                if (iIntValue == 0) {
                    strE = "offline-download";
                }
                ave0VarA = ave0.a(ave0VarA, strE);
            }
            return new mvv0(new vuv0(str2, str3, (String) null, str4, ave0VarA, (String) null, (String) null, (String) null, (String) null, vuv0Var.k, vuv0Var.l, vuv0Var.m), mvv0Var.b);
        } catch (Exception e) {
            throw new TransformerException(e);
        }
    }

    public void k(anm anmVar) {
        dma1 dma1Var = ((gsv0) this.b).a;
        String str = anmVar.a;
        if (str == null) {
            str = "";
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.d(gsv0.b, str);
        hma1VarEdit.g();
        String str2 = anmVar.b;
        String str3 = str2 != null ? str2 : "";
        hma1 hma1VarEdit2 = dma1Var.edit();
        hma1VarEdit2.d(gsv0.c, str3);
        hma1VarEdit2.g();
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        View view2 = (View) this.b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        h3n h3nVar = layoutParams instanceof h3n ? (h3n) layoutParams : null;
        if (h3nVar != null) {
            h3nVar.setMarginEnd(Math.max(nk80VarI.a, ((CoordinatorLayout) this.c).getResources().getDimensionPixelSize(2131165290)));
            view2.setLayoutParams(h3nVar);
        }
        return hsl1Var;
    }

    public void z() {
        ParagraphView paragraphView = (ParagraphView) this.b;
        paragraphView.setVisibility(0);
        paragraphView.setAlpha(0.0f);
        paragraphView.x(((nro) this.c).i);
    }

    public /* synthetic */ gal(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public gal(Context context) {
        this.a = (byte) 1;
        this.b = context;
        this.c = new idd1(new vjh(this, (byte) 24));
    }

    public /* synthetic */ gal(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public gal(uw0 uw0Var) {
        this.a = (byte) 21;
        this.b = uw0Var;
        this.c = new jwo(this, (byte) 1);
    }

    public gal(sx6 sx6Var) {
        this.a = (byte) 27;
        this.b = sx6Var;
        this.c = iy81.a(new jwo(this, (byte) 28));
    }

    public gal(l0q l0qVar) {
        this.a = (byte) 29;
        this.b = l0qVar;
        this.c = new z1p(this, (byte) 9);
    }

    public gal(vzp vzpVar) {
        this.a = (byte) 25;
        this.b = vzpVar;
        this.c = iy81.a(new jwo(this, (byte) 19));
    }

    public gal(ozp ozpVar, fl90 fl90Var) {
        this.a = (byte) 26;
        this.b = ozpVar;
        this.c = iy81.a(new jwo(this, (byte) 23));
    }

    public gal(dc1 dc1Var, ryj ryjVar) {
        this.a = (byte) 22;
        this.b = dc1Var;
        this.c = xqu.b(new jwo(this, (byte) 5));
    }

    public gal(ja9 ja9Var, zuj zujVar, ka9 ka9Var, q7r0 q7r0Var) {
        this.a = (byte) 28;
        this.b = q7r0Var;
        this.c = new z1p(this, (byte) 5);
    }

    public gal(uf1 uf1Var, zuj zujVar, vf1 vf1Var, q7r0 q7r0Var) {
        this.a = (byte) 23;
        this.b = q7r0Var;
        this.c = new jwo(this, (byte) 9);
    }

    public gal(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = (byte) 16;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
