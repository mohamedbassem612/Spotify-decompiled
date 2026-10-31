package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import com.google.protobuf.h;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.gander.v2.proto.SecondaryAction;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.sharecard.config.impl.proto.Color;
import com.spotify.sharecard.config.impl.proto.Image;
import com.spotify.sharecard.config.impl.proto.ImageBytes;
import com.spotify.sharecard.config.impl.proto.Line;
import com.spotify.sharecard.config.impl.proto.Quote;
import com.spotify.sharecard.config.impl.proto.SetBackground;
import com.spotify.sharecard.config.impl.proto.SetBackgroundWithSticker;
import com.spotify.sharecard.config.impl.proto.SetCardData;
import com.spotify.sharecard.config.impl.proto.SetImage;
import com.spotify.sharecard.config.impl.proto.Timestamp;
import com.spotify.sharecard.config.impl.proto.Video;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.FuseToMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElement;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import spotify.autodownload.esperanto.proto.SetShowStateRequest;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nt21 implements CompletableOnSubscribe, zix0, SingleOnSubscribe, ObservableOnSubscribe, Function, z57, l381, ya {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public nt21(i8h1 i8h1Var) {
        this.a = (byte) 9;
        this.b = i8h1Var;
        this.c = new tdl0((byte) 25);
    }

    public static final nt21 h(qe41 qe41Var) {
        return obg1.o(qe41Var);
    }

    public Observable a(Set set) {
        if (set.isEmpty()) {
            return Observable.just(b7x.a);
        }
        m831 m831VarO = ResumptionProgressEsperanto.GetDetailsRequest.o();
        m831VarO.q(((n6r0) this.c).path());
        m831VarO.n(set);
        ResumptionProgressEsperanto.GetDetailsRequest getDetailsRequestBuild = m831VarO.build();
        y48 y48Var = (y48) this.b;
        getDetailsRequestBuild.getClass();
        return y48Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubDetails", getDetailsRequestBuild).map(r5x0.h).map(new jpr0(set, this)).onErrorReturn(new iyq0(set, (byte) 2)).distinctUntilChanged();
    }

    public boolean accept(Object obj) {
        return ((xp4) this.c).a() && ((yp4) this.b).b();
    }

    public Object apply(Object obj) {
        j9u0 j9u0VarE;
        Object next;
        switch (this.a) {
            case 19:
                mmr0 mmr0Var = (mmr0) obj;
                qm51 qm51Var = (qm51) this.c;
                spq0 spq0Var = (spq0) mmr0Var.a;
                fvf1 fvf1Var = (fvf1) mmr0Var.b;
                wp91 wp91Var = ((nm51) this.b).c;
                gm51 gm51VarA = wp91Var instanceof wp91 ? qm51Var.d.a(1, fvf1Var.a) : em51.a;
                w9u0 w9u0Var = qm51Var.c;
                String str = (String) spq0Var.h();
                if (gm51VarA instanceof gm51) {
                    j9u0VarE = qm51.e(gm51VarA.a, SeekToCommand.Relative.BEGINNING, str);
                } else if (gm51VarA instanceof fm51) {
                    sq51 sq51Var = null;
                    wp91 wp91Var2 = wp91Var instanceof wp91 ? wp91Var : null;
                    if (wp91Var2 != null) {
                        Iterator it = wp91Var2.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                lvy lvyVar = (lvy) next;
                                long j = lvyVar.b.a;
                                n5f0 n5f0Var = new n5f0(j, lvyVar.c.a);
                                long j2 = ((fm51) gm51VarA).a;
                                if (j > j2 || j2 > n5f0Var.b) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        lvy lvyVar2 = (lvy) next;
                        if (lvyVar2 != null) {
                            sq51Var = lvyVar2.c;
                        }
                    }
                    if (sq51Var != null) {
                        SeekToCommand.Builder builder = SeekToCommand.builder(sq51Var.a);
                        CommandOptions.Builder builder2 = CommandOptions.builder();
                        if (str != null) {
                            builder2.getClass();
                            builder2.onlyForPlaybackId(str);
                        }
                        j9u0VarE = new j9u0(builder.options(builder2.build()).relative(SeekToCommand.Relative.BEGINNING).build());
                    } else {
                        j9u0VarE = qm51.e(15000L, SeekToCommand.Relative.CURRENT, str);
                    }
                } else {
                    j9u0VarE = qm51.e(15000L, SeekToCommand.Relative.CURRENT, str);
                }
                return w9u0Var.a(j9u0VarE).ignoreElement();
            case 25:
                pk61 pk61Var = (pk61) this.b;
                return (CompletableSource) ((gk61) ((ffr) this.c).c).c1(pk61Var.a, q7h.V((List) obj), Boolean.valueOf(pk61Var.b instanceof mb10), Boolean.valueOf(pk61Var.c instanceof epa1), Boolean.valueOf(pk61Var.d));
            default:
                cze1 cze1Var = (cze1) obj;
                boolean z = cze1Var.a;
                to61 to61Var = (to61) this.b;
                boolean z2 = to61Var.b;
                String str2 = to61Var.a;
                if (z2 && !z && cze1Var.b) {
                    return Maybe.e(new aq61(str2));
                }
                boolean z3 = !z;
                mt8 mt8Var = ((nt8) this.c).a;
                ul61 ul61VarN = SetShowStateRequest.n();
                ul61VarN.q(str2);
                ul61VarN.n(z3);
                MaybeIgnoreElementCompletable maybeIgnoreElementCompletableIgnoreElement = mt8Var.callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "SetShowState", ul61VarN.build()).map(bbn.t).ignoreElement();
                return maybeIgnoreElementCompletableIgnoreElement instanceof FuseToMaybe ? new MaybeIgnoreElement(((FuseToMaybe) maybeIgnoreElementCompletableIgnoreElement).a) : new MaybeFromCompletable(maybeIgnoreElementCompletableIgnoreElement);
        }
    }

    public o3r b() {
        switch (this.a) {
            case 22:
                break;
        }
        return (o3r) this.b;
    }

    public void c(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1493607964);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kvvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (kvvVar.U0 != null) {
            x340Var.i0(-213479645);
            ucp ucpVar = (ucp) this.c;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new iuy0(iu30Var, (byte) 12);
                x340Var.s0(objT);
            }
            ucpVar.getClass();
            u7p0 u7p0Var = new u7p0((vu30) objT);
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new t841(this, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("save-and-continue-dialog", (iu30) objT2, apo.r(1200153787, new u841(u7p0Var, (byte) 0), x340Var), x340Var, 390);
            x340Var.r(false);
        } else {
            x340Var.i0(-212838658);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, kvvVar, iu30Var, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (r14 == r6) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b3 -> B:28:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(p.kp1 r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nt21.d(p.kp1, p.onm):java.lang.Object");
    }

    public b67 e(e4w e4wVar, Looper looper, a67 a67Var, y57 y57Var) {
        return e4w.d(e4wVar.a) ? new o561((q561) this.c, e4wVar.d) : ((z57) this.b).e(e4wVar, looper, a67Var, y57Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(ecq0 ecq0Var, onm onmVar) {
        mt21 mt21Var;
        Object next;
        String str;
        if (onmVar instanceof mt21) {
            mt21Var = (mt21) onmVar;
            int i = mt21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mt21Var.d = i - Integer.MIN_VALUE;
            } else {
                mt21Var = new mt21(this, onmVar);
            }
        } else {
            mt21Var = new mt21(this, onmVar);
        }
        Object objJ = mt21Var.b;
        int i2 = mt21Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (!ihc1.y0(ecq0Var.a)) {
                    Single map = ((byp0) this.b).a.callSingle("spotify.offline_esperanto.proto.Offline", "GetDevices", Empty.n()).map(fkj0.c1).map(new ifl1(new bpt[]{bpt.d}, (byte) 26));
                    mt21Var.a = ecq0Var;
                    mt21Var.d = 1;
                    objJ = fc11.j(map, mt21Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                }
                return pdq0.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ecq0Var = mt21Var.a;
            hm5.M(objJ);
            Iterator it = ((List) objJ).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((ept) next).c, ecq0Var.a));
            ept eptVar = (ept) next;
            if (eptVar != null) {
                String str2 = ((o221) this.c).b;
                if (str2 == null) {
                    str = eptVar.a;
                } else {
                    str = ihc1.y0(str2) ? null : str2;
                    if (str == null) {
                        str = eptVar.a;
                    }
                }
                return new qdq0(new ept(str, eptVar.b, eptVar.c, eptVar.d, eptVar.e));
            }
        } catch (Exception unused) {
        }
        return pdq0.a;
    }

    public tv80 g() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((brl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void i(int i) {
        vv41 vv41Var = (vv41) this.c;
        if (vv41Var != null) {
            t45 t45Var = vv41Var.a;
            t45Var.g(vv41Var.b);
            t45Var.a("outcome", jup0.h(i));
            ((zle1) this.b).b(t45Var.e());
        }
        this.c = null;
    }

    public oe41 j() {
        return (oe41) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(le51 le51Var, onm onmVar) {
        ne51 ne51Var;
        if (onmVar instanceof ne51) {
            ne51Var = (ne51) onmVar;
            int i = ne51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ne51Var.c = i - Integer.MIN_VALUE;
            } else {
                ne51Var = new ne51(this, onmVar);
            }
        } else {
            ne51Var = new ne51(this, onmVar);
        }
        Object objA = ne51Var.a;
        int i2 = ne51Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            y2n1 y2n1Var = (y2n1) this.b;
            String str = le51Var.a;
            ne51Var.c = 1;
            objA = y2n1Var.a(str, ne51Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        List list = ((tz10) objA).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ie51 ie51Var = (ie51) ((emv0) this.c).invoke((SecondaryAction) it.next());
            if (ie51Var != null) {
                arrayList.add(ie51Var);
            }
        }
        return new ke51(arrayList);
    }

    public boolean l() {
        File file = (File) this.b;
        return (file != null && file.exists()) || ((xhn) this.c) != null;
    }

    public void m() {
        ((pe41) this.b).a();
    }

    public void n(Bundle bundle) {
        pe41 pe41Var = (pe41) this.b;
        qe41 qe41Var = pe41Var.a;
        if (!pe41Var.e) {
            pe41Var.a();
        }
        if (qe41Var.getLifecycle().b().a(w8c0.d)) {
            bhn0.g(qe41Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (pe41Var.g) {
            eg.m("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                y9g1.o("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        pe41Var.f = bundle2;
        pe41Var.g = true;
    }

    public void o(Bundle bundle) {
        pe41 pe41Var = (pe41) this.b;
        Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
        Bundle bundle2 = pe41Var.f;
        if (bundle2 != null) {
            bundleH.putAll(bundle2);
        }
        synchronized (pe41Var.c) {
            for (Map.Entry entry : pe41Var.d.entrySet()) {
                bundleH.putBundle((String) entry.getKey(), ((ne41) entry.getValue()).a());
            }
        }
        if (bundleH.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(qj61 qj61Var, onm onmVar) throws IOException {
        wz61 wz61Var;
        oj61 oj61VarN;
        Object obj;
        oj61 oj61Var;
        if (onmVar instanceof wz61) {
            wz61Var = (wz61) onmVar;
            int i = wz61Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wz61Var.f = i - Integer.MIN_VALUE;
            } else {
                wz61Var = new wz61(this, onmVar);
            }
        } else {
            wz61Var = new wz61(this, onmVar);
        }
        Object obj2 = wz61Var.d;
        int i2 = wz61Var.f;
        if (i2 == 0) {
            hm5.M(obj2);
            oj61VarN = SetBackground.n();
            oqo1 oqo1Var = qj61Var.a;
            if (oqo1Var instanceof rj61) {
                t7h t7hVarQ = Color.q();
                rj61 rj61Var = (rj61) oqo1Var;
                t7hVarQ.n(rj61Var.d);
                String str = rj61Var.e;
                if (str != null) {
                    t7hVarQ.q(str);
                }
                oj61VarN.q(t7hVarQ);
            } else if (oqo1Var instanceof tj61) {
                Uri uri = ((tj61) oqo1Var).d;
                if (wmo1.l(uri)) {
                    hhg1.f(h4b1.d(uri, "Cannot upload local video as share card background - "));
                    return null;
                }
                v6j1 v6j1VarO = Video.o();
                v6j1VarO.n(uri.toString());
                oj61VarN.s(v6j1VarO);
            } else {
                if (!(oqo1Var instanceof sj61)) {
                    eg.o();
                    return null;
                }
                uj61 uj61Var = ((sj61) oqo1Var).d;
                wz61Var.a = qj61Var;
                wz61Var.b = oj61VarN;
                wz61Var.c = oj61VarN;
                wz61Var.f = 1;
                Object objS = s(uj61Var, wz61Var);
                Object obj3 = d9n.a;
                if (objS == obj3) {
                    return obj3;
                }
                obj = objS;
                oj61Var = oj61VarN;
            }
            oj61VarN.n(qj61Var.b);
            return oj61VarN.build();
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oj61Var = wz61Var.c;
        oj61 oj61Var2 = wz61Var.b;
        qj61 qj61Var2 = wz61Var.a;
        hm5.M(obj2);
        oj61VarN = oj61Var2;
        qj61Var = qj61Var2;
        obj = obj2;
        oj61Var.r((SetImage) obj);
        oj61VarN.n(qj61Var.b);
        return oj61VarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(vj61 vj61Var, onm onmVar) throws IOException {
        vz61 vz61Var;
        vj61 vj61Var2;
        pj61 pj61Var;
        pj61 pj61Var2;
        if (onmVar instanceof vz61) {
            vz61Var = (vz61) onmVar;
            int i = vz61Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz61Var.f = i - Integer.MIN_VALUE;
            } else {
                vz61Var = new vz61(this, onmVar);
            }
        } else {
            vz61Var = new vz61(this, onmVar);
        }
        Object objS = vz61Var.d;
        int i2 = vz61Var.f;
        Object obj = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                pj61Var = vz61Var.b;
                vj61Var2 = vz61Var.a;
                hm5.M(objS);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pj61Var2 = vz61Var.c;
                pj61Var = vz61Var.b;
                hm5.M(objS);
            }
            pj61Var2.q((SetImage) objS);
            return pj61Var.build();
        }
        hm5.M(objS);
        pj61 pj61VarN = SetBackgroundWithSticker.n();
        qj61 qj61Var = vj61Var.b;
        vz61Var.a = vj61Var;
        vz61Var.b = pj61VarN;
        vz61Var.f = 1;
        Object objP = p(qj61Var, vz61Var);
        if (objP != obj) {
            vj61Var2 = vj61Var;
            pj61Var = pj61VarN;
            objS = objP;
        }
        return obj;
        pj61Var.n((SetBackground) objS);
        uj61 uj61Var = vj61Var2.c;
        if (uj61Var != null) {
            vz61Var.a = null;
            vz61Var.b = pj61Var;
            vz61Var.c = pj61Var;
            vz61Var.f = 2;
            objS = s(uj61Var, vz61Var);
            if (objS != obj) {
                pj61Var2 = pj61Var;
                pj61Var2.q((SetImage) objS);
            }
            return obj;
        }
        return pj61Var.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(ouo1 ouo1Var, onm onmVar) throws IOException {
        xz61 xz61Var;
        zj61 zj61Var;
        if (onmVar instanceof xz61) {
            xz61Var = (xz61) onmVar;
            int i = xz61Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xz61Var.d = i - Integer.MIN_VALUE;
            } else {
                xz61Var = new xz61(this, onmVar);
            }
        } else {
            xz61Var = new xz61(this, onmVar);
        }
        Object obj = xz61Var.b;
        int i2 = xz61Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (!(ouo1Var instanceof vj61)) {
                if (!(ouo1Var instanceof amz0)) {
                    if (!(ouo1Var instanceof zve1)) {
                        eg.o();
                        return null;
                    }
                    zj61 zj61VarN = SetCardData.n();
                    qve1 qve1VarP = Timestamp.p();
                    qve1VarP.n(Int64Value.p(((zve1) ouo1Var).b));
                    zj61VarN.r((Timestamp) qve1VarP.build());
                    return (SetCardData) zj61VarN.build();
                }
                zj61 zj61VarN2 = SetCardData.n();
                amz0 amz0Var = (amz0) ouo1Var;
                zlz0 zlz0VarQ = Quote.q();
                List<khc0> list = amz0Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (khc0 khc0Var : list) {
                    jhc0 jhc0VarP = Line.p();
                    jhc0VarP.n(khc0Var.a);
                    String str = khc0Var.b;
                    if (str != null) {
                        jhc0VarP.q(str);
                    }
                    arrayList.add((Line) jhc0VarP.build());
                }
                zlz0VarQ.n(arrayList);
                Long l = amz0Var.c;
                if (l != null) {
                    zlz0VarQ.q(l.longValue());
                }
                zj61VarN2.n((Quote) zlz0VarQ.build());
                return (SetCardData) zj61VarN2.build();
            }
            zj61 zj61VarN3 = SetCardData.n();
            xz61Var.a = zj61VarN3;
            xz61Var.d = 1;
            Object objQ = q((vj61) ouo1Var, xz61Var);
            Object obj2 = d9n.a;
            if (objQ == obj2) {
                return obj2;
            }
            obj = objQ;
            zj61Var = zj61VarN3;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zj61Var = xz61Var.a;
            hm5.M(obj);
        }
        zj61Var.q((SetBackgroundWithSticker) obj);
        return (SetCardData) zj61Var.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(uj61 uj61Var, onm onmVar) throws IOException {
        yz61 yz61Var;
        if (onmVar instanceof yz61) {
            yz61Var = (yz61) onmVar;
            int i = yz61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yz61Var.c = i - Integer.MIN_VALUE;
            } else {
                yz61Var = new yz61(this, onmVar);
            }
        } else {
            yz61Var = new yz61(this, onmVar);
        }
        Object objJ = yz61Var.a;
        int i2 = yz61Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Uri uri = uj61Var.a;
            if (!wmo1.l(uri)) {
                qk61 qk61VarN = SetImage.n();
                mp70 mp70VarO = Image.o();
                mp70VarO.n(uri.toString());
                qk61VarN.q(mp70VarO);
                h hVarBuild = qk61VarN.build();
                hVarBuild.getClass();
                return (SetImage) hVarBuild;
            }
            yfu yfuVar = (yfu) this.c;
            yz61Var.c = 1;
            objJ = yfuVar.j(uri, yz61Var);
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
        byte[] bArr = (byte[]) objJ;
        String strGuessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(bArr));
        if (strGuessContentTypeFromStream == null) {
            strGuessContentTypeFromStream = "application/octet-stream";
        }
        qk61 qk61VarN2 = SetImage.n();
        kr70 kr70VarN = ImageBytes.n();
        kr70VarN.n(phc.e(0, bArr, bArr.length));
        kr70VarN.q(strGuessContentTypeFromStream);
        qk61VarN2.n(kr70VarN);
        h hVarBuild2 = qk61VarN2.build();
        hVarBuild2.getClass();
        return (SetImage) hVarBuild2;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        String str;
        vsw0 vsw0Var = (vsw0) this.b;
        List<String> listA = vsw0Var.a();
        s141 s141Var = (s141) this.c;
        ArrayList<e1z0> arrayList = new ArrayList(q7h.U(listA, 10));
        for (String str2 : listA) {
            xot xotVar = new xot();
            xotVar.b = str2;
            int i = vsw0Var.a;
            s141Var.getClass();
            int iC = l1d.C(i);
            if (iC == 0) {
                str = "inapp";
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                str = "subs";
            }
            xotVar.c = str;
            if ("first_party".equals(str)) {
                hhg1.n("Serialized doc id must be provided for first party products.");
                return;
            } else {
                if (xotVar.b == null) {
                    hhg1.n("Product id must be provided.");
                    return;
                }
                arrayList.add(new e1z0(xotVar));
            }
        }
        mlw0 mlw0Var = new mlw0((byte) 10);
        if (arrayList.isEmpty()) {
            hhg1.n("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        for (e1z0 e1z0Var : arrayList) {
            if (!"play_pass_subs".equals(e1z0Var.b)) {
                hashSet.add(e1z0Var.b);
            }
        }
        if (hashSet.size() > 1) {
            hhg1.n("All products should be of the same product type.");
            return;
        }
        dsn1 dsn1VarM = dsn1.m(arrayList);
        mlw0Var.b = dsn1VarM;
        if (dsn1VarM == null) {
            hhg1.n("Product list must be set to a non empty list.");
        } else {
            s141Var.a.t(new vqv0(mlw0Var), new do0(singleEmitter));
        }
    }

    public boolean t(Object obj) {
        switch (this.a) {
            case 22:
                qxc0 qxc0Var = (qxc0) obj;
                return ((m021) ((w4y0) this.c).f).m(qxc0Var.N0, qxc0Var.X);
            default:
                qxc0 qxc0Var2 = (qxc0) obj;
                return ((k871) this.c).a(qxc0Var2.X, qxc0Var2.t, qxc0Var2.i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r10 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(p.z771 r7, p.s4b1 r8, p.ouo1 r9, p.onm r10) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p.zz61
            if (r0 == 0) goto L13
            r0 = r10
            p.zz61 r0 = (p.zz61) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.zz61 r0 = new p.zz61
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L7f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.yj61 r7 = r0.b
            p.yj61 r8 = r0.a
            p.hm5.M(r10)
            goto L62
        L39:
            p.hm5.M(r10)
            p.yj61 r10 = com.spotify.sharecard.config.impl.proto.SetCardConfigRequest.n()
            java.lang.String r7 = r7.b()
            r10.r(r7)
            java.lang.String r7 = r8.z()
            if (r7 == 0) goto L86
            r10.q(r7)
            if (r9 == 0) goto L68
            r0.a = r10
            r0.b = r10
            r0.e = r3
            java.lang.Object r7 = r6.r(r9, r0)
            if (r7 != r5) goto L5f
            goto L7e
        L5f:
            r8 = r10
            r10 = r7
            r7 = r8
        L62:
            com.spotify.sharecard.config.impl.proto.SetCardData r10 = (com.spotify.sharecard.config.impl.proto.SetCardData) r10
            r7.n(r10)
            r10 = r8
        L68:
            java.lang.Object r6 = r6.b
            p.sz61 r6 = (p.sz61) r6
            com.google.protobuf.h r7 = r10.build()
            com.spotify.sharecard.config.impl.proto.SetCardConfigRequest r7 = (com.spotify.sharecard.config.impl.proto.SetCardConfigRequest) r7
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r10 = r6.a(r7, r0)
            if (r10 != r5) goto L7f
        L7e:
            return r5
        L7f:
            com.spotify.sharecard.config.impl.proto.SetCardConfigResponse r10 = (com.spotify.sharecard.config.impl.proto.SetCardConfigResponse) r10
            java.lang.String r6 = r10.n()
            return r6
        L86:
            java.lang.String r6 = "entityUri must be a valid Spotify URI"
            p.hhg1.n(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nt21.u(p.z771, p.s4b1, p.ouo1, p.onm):java.lang.Object");
    }

    public nt21(zle1 zle1Var) {
        this.a = (byte) 14;
        this.b = zle1Var;
    }

    public /* synthetic */ nt21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public nt21(Context context, f741 f741Var) {
        this.a = (byte) 7;
        b3s b3sVar = b3s.c;
        this.b = context;
        this.c = f741Var;
    }

    public nt21(pe41 pe41Var) {
        this.a = (byte) 10;
        this.b = pe41Var;
        this.c = new oe41(pe41Var);
    }

    public nt21(ConstraintLayout constraintLayout, ArtworkView artworkView, TextView textView) {
        this.a = (byte) 16;
        this.b = artworkView;
        this.c = textView;
    }

    public nt21(sz61 sz61Var, yfu yfuVar, pob pobVar) {
        this.a = (byte) 28;
        this.b = sz61Var;
        this.c = yfuVar;
    }

    public nt21() {
        this.a = (byte) 6;
        this.c = Executors.newSingleThreadExecutor();
    }

    public nt21(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, ComposeView composeView, ConstraintLayout constraintLayout2) {
        this.a = (byte) 15;
        this.b = relativeLayout;
        this.c = constraintLayout2;
    }

    public nt21(w4y0 w4y0Var) {
        this.a = (byte) 22;
        this.c = w4y0Var;
        this.b = w4y0Var.d;
    }

    public nt21(k871 k871Var) {
        this.a = (byte) 29;
        this.c = k871Var;
        this.b = k871Var.f;
    }

    public nt21(q561 q561Var, z57 z57Var) {
        this.a = (byte) 21;
        this.c = q561Var;
        this.b = z57Var;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.onNext(new an41(new rl21((o901) this.b, (ym41) this.c, (byte) 12)));
    }

    public void subscribe(CompletableEmitter completableEmitter) {
        try {
            RestrictedIntegrationsResponse restrictedIntegrationsResponse = (RestrictedIntegrationsResponse) this.b;
            rdu rduVar = (rdu) ((ynb0) ((k811) this.c).b).get();
            rduVar.getClass();
            restrictedIntegrationsResponse.writeTo(new FileOutputStream(rduVar.a));
            completableEmitter.onComplete();
        } catch (IOException e) {
            completableEmitter.onError(e);
        }
    }
}
